package com.google.common.base;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.google.common.util.concurrent.g0;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(g0 g0Var, String str, String str2) {
        g0Var.F(str, "videoId");
        if (str2 != null) {
            g0Var.F(str2, "cpn");
        }
        g0Var.G("contentCheckOk", true);
        g0Var.G("racyCheckOk", true);
    }

    public static kotlin.collections.builders.g b(kotlin.collections.builders.g gVar) {
        gVar.e.b();
        return gVar.size() > 0 ? gVar : kotlin.collections.builders.g.y;
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    kotlin.a.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    net.luminis.tls.engine.impl.c.a();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static long[] d(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        com.google.android.material.motion.a.d("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static int e(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void g(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = kotlin.text.d.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static Map h(String str) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        List listP = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj, arrayList, obj, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{"2"}[0];
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("User-Agent", listP), new AbstractMap.SimpleEntry("X-Goog-Api-Format-Version", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj2, arrayList2, obj2, arrayList2))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.o(key, "duplicate key: "));
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static com.grack.nanojson.c i(org.schabi.newpipe.extractor.localization.a aVar, org.schabi.newpipe.extractor.localization.c cVar, String str, String str2) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c("VISIONOS", "1.02");
        g0 g0Var = new g0(23, cVar2, new androidx.appcompat.widget.o(-1, "MOBILE", "Apple", "RealityDevice14,1", "visionOS", "25.6.0.23O471"), false);
        String str3 = org.schabi.newpipe.extractor.services.youtube.i.a;
        Map mapH = h("com.google.visionos.youtube/1.02(RealityDevice14,1; U; CPU visionOS 25_6_0 like Mac OS X; " + cVar.a() + ")");
        cVar2.A = org.schabi.newpipe.extractor.services.youtube.i.t(g0Var, cVar, aVar, mapH, "https://www.youtube.com/youtubei/v1/");
        g0 g0VarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVar, aVar, g0Var);
        a(g0VarA, str, str2);
        return org.schabi.newpipe.extractor.utils.a.m(org.schabi.newpipe.extractor.services.youtube.i.s(com.google.android.material.textfield.p.a.x(coil3.compose.internal.f.e("https://youtubei.googleapis.com/youtubei/v1/player?prettyPrint=false&t=", org.schabi.newpipe.extractor.utils.a.d(12, org.schabi.newpipe.extractor.services.youtube.i.g), "&id=", str), mapH, com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarA.z).getBytes(StandardCharsets.UTF_8), cVar)));
    }

    public static com.grack.nanojson.c j(org.schabi.newpipe.extractor.localization.c cVar, org.schabi.newpipe.extractor.localization.a aVar, String str) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c("WEB", "2.20260120.01.00");
        g0 g0Var = new g0(23, cVar2, new androidx.appcompat.widget.o(-1, "DESKTOP", null, null, null, null), false);
        cVar2.z = org.schabi.newpipe.extractor.services.youtube.i.g();
        HashMap mapU = org.schabi.newpipe.extractor.services.youtube.i.u();
        cVar2.A = org.schabi.newpipe.extractor.services.youtube.i.t(g0Var, cVar, aVar, mapU, "https://www.youtube.com/youtubei/v1/");
        g0 g0VarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVar, aVar, g0Var);
        a(g0VarA, str, null);
        return org.schabi.newpipe.extractor.utils.a.m(org.schabi.newpipe.extractor.services.youtube.i.s(com.google.android.material.textfield.p.a.x("https://www.youtube.com/youtubei/v1/player?prettyPrint=false&$fields=microformat,videoDetails.thumbnail.thumbnails,videoDetails.videoId", mapU, com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarA.z).getBytes(StandardCharsets.UTF_8), cVar)));
    }

    public static int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean l(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static LinkedHashSet m(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(a0.u(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.l.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set n(Set set, Iterable iterable) {
        iterable.getClass();
        Collection<?> collectionK0 = iterable instanceof Collection ? (Collection) iterable : kotlin.collections.o.k0(iterable);
        if (collectionK0.isEmpty()) {
            return kotlin.collections.o.o0(set);
        }
        if (!(collectionK0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionK0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionK0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static okhttp3.m o(okhttp3.s sVar, String str) {
        long j;
        String str2;
        sVar.getClass();
        str.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        char c = ';';
        int iG = okhttp3.internal.e.g(str, ';', 0, 0, 6);
        int iG2 = okhttp3.internal.e.g(str, '=', 0, iG, 2);
        String str3 = null;
        if (iG2 != iG) {
            String strQ = okhttp3.internal.e.q(0, iG2, str);
            if (strQ.length() != 0 && okhttp3.internal.e.i(strQ) == -1) {
                String strQ2 = okhttp3.internal.e.q(iG2 + 1, iG, str);
                if (okhttp3.internal.e.i(strQ2) == -1) {
                    int i = iG + 1;
                    int length = str.length();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    String str4 = null;
                    boolean z4 = true;
                    long jP = 253402300799999L;
                    long j2 = -1;
                    String strSubstring = null;
                    while (true) {
                        if (i >= length) {
                            if (j2 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j2 != -1) {
                                long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                                j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                            } else {
                                j = jP;
                            }
                            String str5 = sVar.d;
                            if (str3 != null) {
                                if (kotlin.jvm.internal.l.a(str5, str3) || (kotlin.text.r.H(str5, str3, false) && str5.charAt((str5.length() - str3.length()) - 1) == '.' && !okhttp3.internal.d.a.e(str5))) {
                                    str2 = str3;
                                }
                                return null;
                            }
                            str2 = str5;
                            if (str5.length() == str2.length() || okhttp3.internal.publicsuffix.a.d.a(str2) != null) {
                                if (strSubstring == null || !kotlin.text.r.O(strSubstring, "/", false)) {
                                    String strB = sVar.b();
                                    int iE0 = kotlin.text.k.e0(strB, '/', 0, 6);
                                    strSubstring = iE0 != 0 ? strB.substring(0, iE0) : "/";
                                }
                                return new okhttp3.m(strQ, strQ2, j, str2, strSubstring, z3, z, z2, z4, str4);
                            }
                            return null;
                        }
                        int iE = okhttp3.internal.e.e(str, c, i, length);
                        int iE2 = okhttp3.internal.e.e(str, '=', i, iE);
                        String strQ3 = okhttp3.internal.e.q(i, iE2, str);
                        String strQ4 = iE2 < iE ? okhttp3.internal.e.q(iE2 + 1, iE, str) : "";
                        if (strQ3.equalsIgnoreCase("expires")) {
                            try {
                                jP = p(strQ4.length(), strQ4);
                                z2 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strQ3.equalsIgnoreCase("max-age")) {
                            try {
                                j2 = Long.parseLong(strQ4);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                patternCompile.getClass();
                                if (!patternCompile.matcher(strQ4).matches()) {
                                    throw e;
                                }
                                j2 = kotlin.text.r.O(strQ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z2 = true;
                        } else if (strQ3.equalsIgnoreCase("domain")) {
                            if (kotlin.text.r.H(strQ4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strB2 = okhttp3.internal.d.b(kotlin.text.k.j0(strQ4, "."));
                            if (strB2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = strB2;
                            z4 = false;
                        } else if (strQ3.equalsIgnoreCase("path")) {
                            strSubstring = strQ4;
                        } else if (strQ3.equalsIgnoreCase("secure")) {
                            z3 = true;
                        } else if (strQ3.equalsIgnoreCase("httponly")) {
                            z = true;
                        } else if (strQ3.equalsIgnoreCase("samesite")) {
                            str4 = strQ4;
                        }
                        i = iE + 1;
                        c = ';';
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long p(int i, String str) {
        int iE = e(0, i, str, false);
        Matcher matcher = okhttp3.m.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iB0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iE < i) {
            int iE2 = e(iE + 1, i, str, true);
            matcher.region(iE, iE2);
            if (i3 == -1 && matcher.usePattern(okhttp3.m.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(okhttp3.m.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iB0 == -1) {
                Pattern pattern = okhttp3.m.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iB0 = kotlin.text.k.b0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(okhttp3.m.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iE = e(iE2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        if (iB0 == -1) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(okhttp3.internal.g.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iB0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean q(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static LinkedHashSet r(Set set, Iterable iterable) {
        int size;
        set.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(a0.u(size));
        linkedHashSet.addAll(set);
        kotlin.collections.o.C(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet s(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(a0.u(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set t(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static boolean u(String str) {
        return str == null || str.isEmpty();
    }

    public static final void v(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
