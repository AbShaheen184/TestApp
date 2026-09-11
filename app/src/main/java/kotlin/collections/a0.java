package kotlin.collections;

import com.google.android.gms.internal.measurement.p0;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.a2;
import com.google.protobuf.f2;
import com.google.protobuf.m0;
import com.google.protobuf.n1;
import com.google.protobuf.t0;
import com.google.protobuf.x0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final void A(HashMap map, kotlin.k[] kVarArr) {
        for (kotlin.k kVar : kVarArr) {
            map.put(kVar.e, kVar.y);
        }
    }

    public static final String B(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static int C(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final long D(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        kotlin.time.c cVar = kotlin.time.c.NANOSECONDS;
        if (j4 >= 0) {
            return com.google.common.base.b.v(j3, cVar);
        }
        kotlin.time.c cVar2 = kotlin.time.c.MILLISECONDS;
        if (cVar.compareTo(cVar2) >= 0) {
            return kotlin.time.a.l(t(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        kotlin.time.g gVar = kotlin.time.a.y;
        return kotlin.time.a.i(com.google.common.base.b.v(j5, cVar2), com.google.common.base.b.v(j6, cVar));
    }

    public static int E(int i, byte[] bArr, int i2, int i3, p0 p0Var) throws x0 {
        if ((i >>> 3) == 0) {
            throw x0.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m(bArr, i2, p0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return k(bArr, i2, p0Var) + p0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw x0.a();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = p0Var.d + 1;
        p0Var.d = i6;
        if (i6 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = 0;
        while (i2 < i3) {
            i2 = k(bArr, i2, p0Var);
            i7 = p0Var.a;
            if (i7 == i5) {
                break;
            }
            i2 = E(i7, bArr, i2, i3, p0Var);
        }
        p0Var.d--;
        if (i2 > i3 || i7 != i5) {
            throw x0.f();
        }
        return i2;
    }

    public static int[] F(Collection collection) {
        if (collection instanceof com.google.common.primitives.b) {
            com.google.common.primitives.b bVar = (com.google.common.primitives.b) collection;
            return Arrays.copyOfRange(bVar.e, bVar.y, bVar.z);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Map G(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            return v.e;
        }
        if (size == 1) {
            kotlin.k kVar = (kotlin.k) list.get(0);
            kVar.getClass();
            Map mapSingletonMap = Collections.singletonMap(kVar.e, kVar.y);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.k kVar2 = (kotlin.k) it.next();
            linkedHashMap.put(kVar2.e, kVar2.y);
        }
        return linkedHashMap;
    }

    public static Map H(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return v.e;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap I(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Integer J(String str) {
        byte b;
        Integer num;
        Long l;
        Long lValueOf;
        Long lValueOf2;
        byte b2;
        str.getClass();
        if (str.isEmpty()) {
            l = 0;
            num = null;
        } else {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i == str.length()) {
                l = 0;
                num = null;
            } else {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = com.google.common.primitives.c.a[cCharAt];
                } else {
                    byte[] bArr = com.google.common.primitives.c.a;
                    b = -1;
                }
                if (b < 0 || b >= 10) {
                    num = null;
                    l = num;
                } else {
                    long j = -b;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char cCharAt2 = str.charAt(i2);
                            if (cCharAt2 < 128) {
                                b2 = com.google.common.primitives.c.a[cCharAt2];
                            } else {
                                byte[] bArr2 = com.google.common.primitives.c.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < j3) {
                                num = null;
                            } else {
                                long j4 = j * j2;
                                num = null;
                                long j5 = b2;
                                if (j4 >= j5 - Long.MIN_VALUE) {
                                    j = j4 - j5;
                                    i2 = i3;
                                }
                            }
                        } else {
                            num = null;
                            if (i != 0) {
                                lValueOf2 = Long.valueOf(j);
                            } else if (j != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j);
                            }
                        }
                        l = num;
                    }
                }
            }
        }
        if (l != 0) {
            l = lValueOf;
            l = lValueOf2;
            if (l.longValue() == l.intValue()) {
                return Integer.valueOf(l.intValue());
            }
        }
        l = lValueOf;
        l = lValueOf2;
        return num;
    }

    public static final void a(Logger logger, okhttp3.internal.concurrent.a aVar, okhttp3.internal.concurrent.c cVar, String str) {
        logger.fine(cVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static List b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new com.google.common.primitives.b(iArr, 0, iArr.length);
    }

    public static int c(long j) {
        int i = (int) j;
        com.google.android.material.motion.a.d("Out of range: %s", j, ((long) i) == j);
        return i;
    }

    public static int d(byte[] bArr, int i, p0 p0Var) throws x0 {
        int iK = k(bArr, i, p0Var);
        int i2 = p0Var.a;
        if (i2 < 0) {
            throw x0.e();
        }
        if (i2 > bArr.length - iK) {
            throw x0.g();
        }
        if (i2 == 0) {
            p0Var.c = ByteString.EMPTY;
            return iK;
        }
        p0Var.c = ByteString.copyFrom(bArr, iK, i2);
        return iK + i2;
    }

    public static int e(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long f(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int g(a2 a2Var, byte[] bArr, int i, int i2, int i3, p0 p0Var) throws x0 {
        GeneratedMessageLite generatedMessageLiteD = a2Var.d();
        int iW = w(generatedMessageLiteD, a2Var, bArr, i, i2, i3, p0Var);
        a2Var.b(generatedMessageLiteD);
        p0Var.c = generatedMessageLiteD;
        return iW;
    }

    public static int h(a2 a2Var, int i, byte[] bArr, int i2, int i3, t0 t0Var, p0 p0Var) throws x0 {
        GeneratedMessageLite generatedMessageLiteD = a2Var.d();
        a2 a2Var2 = a2Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        p0 p0Var2 = p0Var;
        int iX = x(generatedMessageLiteD, a2Var2, bArr2, i2, i4, p0Var2);
        a2Var2.b(generatedMessageLiteD);
        p0Var2.c = generatedMessageLiteD;
        t0Var.add(generatedMessageLiteD);
        while (iX < i4) {
            p0 p0Var3 = p0Var2;
            int i5 = i4;
            int iK = k(bArr2, iX, p0Var3);
            if (i != p0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            a2 a2Var3 = a2Var2;
            GeneratedMessageLite generatedMessageLiteD2 = a2Var3.d();
            iX = x(generatedMessageLiteD2, a2Var3, bArr3, iK, i5, p0Var3);
            a2Var2 = a2Var3;
            bArr2 = bArr3;
            i4 = i5;
            p0Var2 = p0Var3;
            a2Var2.b(generatedMessageLiteD2);
            p0Var2.c = generatedMessageLiteD2;
            t0Var.add(generatedMessageLiteD2);
        }
        return iX;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, f2 f2Var, p0 p0Var) throws x0 {
        if ((i >>> 3) == 0) {
            throw x0.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, p0Var);
            f2Var.f(i, Long.valueOf(p0Var.b));
            return iM;
        }
        if (i4 == 1) {
            f2Var.f(i, Long.valueOf(f(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iK = k(bArr, i2, p0Var);
            int i5 = p0Var.a;
            if (i5 < 0) {
                throw x0.e();
            }
            if (i5 > bArr.length - iK) {
                throw x0.g();
            }
            if (i5 == 0) {
                f2Var.f(i, ByteString.EMPTY);
            } else {
                f2Var.f(i, ByteString.copyFrom(bArr, iK, i5));
            }
            return iK + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw x0.a();
            }
            f2Var.f(i, Integer.valueOf(e(bArr, i2)));
            return i2 + 4;
        }
        f2 f2Var2 = new f2();
        int i6 = (i & (-8)) | 4;
        int i7 = p0Var.d + 1;
        p0Var.d = i7;
        if (i7 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iK2 = k(bArr, i2, p0Var);
            i8 = p0Var.a;
            if (i8 == i6) {
                i2 = iK2;
                break;
            }
            i2 = i(i8, bArr, iK2, i3, f2Var2, p0Var);
        }
        p0Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw x0.f();
        }
        f2Var.f(i, f2Var2);
        return i2;
    }

    public static int j(int i, byte[] bArr, int i2, p0 p0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            p0Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            p0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            p0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            p0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                p0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int k(byte[] bArr, int i, p0 p0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return j(b, bArr, i2, p0Var);
        }
        p0Var.a = b;
        return i2;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, t0 t0Var, p0 p0Var) {
        m0 m0Var = (m0) t0Var;
        int iK = k(bArr, i2, p0Var);
        m0Var.c(p0Var.a);
        while (iK < i3) {
            int iK2 = k(bArr, iK, p0Var);
            if (i != p0Var.a) {
                break;
            }
            iK = k(bArr, iK2, p0Var);
            m0Var.c(p0Var.a);
        }
        return iK;
    }

    public static int m(byte[] bArr, int i, p0 p0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            p0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        p0Var.b = j2;
        return i3;
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final String o(long j) {
        String strN;
        if (j <= -999500000) {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strN = androidx.privacysandbox.ads.adservices.java.internal.a.n((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strN}, 1));
    }

    public static int p(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static ArrayList q(com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String string;
        String strQ;
        boolean zAnyMatch;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) it.next();
            if (cVar.containsKey("itemSectionRenderer")) {
                for (com.grack.nanojson.c cVar2 : cVar.e("itemSectionRenderer").a("contents")) {
                    if (cVar2.containsKey("infoPanelContentRenderer")) {
                        com.grack.nanojson.c cVarE = cVar2.e("infoPanelContentRenderer");
                        kotlin.z zVar = new kotlin.z(1);
                        StringBuilder sb = new StringBuilder();
                        for (Object obj : cVarE.a("paragraphs")) {
                            if (sb.length() != 0) {
                                sb.append("<br>");
                            }
                            sb.append(org.schabi.newpipe.extractor.services.youtube.i.n((com.grack.nanojson.c) obj, false));
                        }
                        if (cVarE.containsKey("sourceEndpoint")) {
                            try {
                                String strB = org.schabi.newpipe.extractor.services.youtube.i.b(org.schabi.newpipe.extractor.services.youtube.i.q(cVarE.e("sourceEndpoint")));
                                Objects.requireNonNull(strB);
                                ((ArrayList) zVar.y).add(new URL(strB));
                                String strN = cVarE.containsKey("inlineSource") ? org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.e("inlineSource"), false) : org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.e("disclaimer"), false);
                                if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
                                    org.mozilla.javascript.typedarrays.c.b("Could not get metadata info link text.");
                                    return null;
                                }
                                ((ArrayList) zVar.z).add(strN);
                            } catch (NullPointerException | MalformedURLException e) {
                                org.mozilla.javascript.typedarrays.c.d("Could not get metadata info URL", e);
                                return null;
                            }
                        }
                        arrayList.add(zVar);
                    }
                    if (cVar2.containsKey("clarificationRenderer")) {
                        com.grack.nanojson.c cVarE2 = cVar2.e("clarificationRenderer");
                        kotlin.z zVar2 = new kotlin.z(1);
                        String strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE2.e("contentTitle"), false);
                        String strN3 = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE2.e("text"), false);
                        if (strN2 == null || strN3 == null) {
                            org.mozilla.javascript.typedarrays.c.b("Could not extract clarification renderer content");
                            return null;
                        }
                        if (cVarE2.containsKey("actionButton")) {
                            com.grack.nanojson.c cVarE3 = cVarE2.e("actionButton").e("buttonRenderer");
                            try {
                                String strB2 = org.schabi.newpipe.extractor.services.youtube.i.b(org.schabi.newpipe.extractor.services.youtube.i.q(cVarE3.e("command")));
                                Objects.requireNonNull(strB2);
                                ((ArrayList) zVar2.y).add(new URL(strB2));
                                String strN4 = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE3.e("text"), false);
                                if (org.schabi.newpipe.extractor.utils.f.h(strN4)) {
                                    org.mozilla.javascript.typedarrays.c.b("Could not get metadata info link text.");
                                    return null;
                                }
                                ((ArrayList) zVar2.z).add(strN4);
                            } catch (NullPointerException | MalformedURLException e2) {
                                org.mozilla.javascript.typedarrays.c.d("Could not get metadata info URL", e2);
                                return null;
                            }
                        }
                        if (cVarE2.containsKey("secondaryEndpoint") && cVarE2.containsKey("secondarySource") && (strQ = org.schabi.newpipe.extractor.services.youtube.i.q(cVarE2.e("secondaryEndpoint"))) != null) {
                            try {
                                zAnyMatch = org.schabi.newpipe.extractor.services.youtube.i.h.stream().anyMatch(new net.luminis.quic.ack.a(new URL(org.schabi.newpipe.extractor.services.youtube.i.b(strQ)), 3));
                            } catch (MalformedURLException unused) {
                                zAnyMatch = false;
                            }
                            if (!zAnyMatch) {
                                try {
                                    ((ArrayList) zVar2.y).add(new URL(strQ));
                                    String strN5 = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE2.e("secondarySource"), false);
                                    if (strN5 != null) {
                                        strQ = strN5;
                                    }
                                    ((ArrayList) zVar2.z).add(strQ);
                                } catch (MalformedURLException e3) {
                                    org.mozilla.javascript.typedarrays.c.d("Could not get metadata info secondary URL", e3);
                                    return null;
                                }
                            }
                        }
                        arrayList.add(zVar2);
                    }
                    if (cVar2.containsKey("emergencyOneboxRenderer")) {
                        int i = 7;
                        List<com.grack.nanojson.c> list = (List) cVar2.e("emergencyOneboxRenderer").values().stream().filter(new com.grack.nanojson.a(i)).map(new org.schabi.newpipe.extractor.services.youtube.b(i)).collect(Collectors.toList());
                        if (list.isEmpty()) {
                            org.mozilla.javascript.typedarrays.c.b("Could not extract any meta info from emergency renderer");
                            return null;
                        }
                        for (com.grack.nanojson.c cVar3 : list) {
                            kotlin.z zVar3 = new kotlin.z(1);
                            org.schabi.newpipe.extractor.services.youtube.i.o(cVar3.e("title"), "title");
                            if (cVar3.containsKey("actionText")) {
                                string = "\n".concat(org.schabi.newpipe.extractor.services.youtube.i.o(cVar3.e("actionText"), "action"));
                            } else if (cVar3.containsKey("contacts")) {
                                com.grack.nanojson.b bVarA = cVar3.a("contacts");
                                StringBuilder sb2 = new StringBuilder();
                                for (int i2 = 0; i2 < bVarA.size(); i2++) {
                                    sb2.append("\n");
                                    sb2.append(org.schabi.newpipe.extractor.services.youtube.i.o(bVarA.b(i2).e("actionText"), "contacts.actionText"));
                                }
                                string = sb2.toString();
                            } else {
                                string = "";
                            }
                            String strO = org.schabi.newpipe.extractor.services.youtube.i.o(cVar3.e("detailsText"), "details");
                            String strO2 = org.schabi.newpipe.extractor.services.youtube.i.o(cVar3.e("navigationText"), "urlText");
                            strO.concat(string);
                            ((ArrayList) zVar3.z).add(strO2);
                            String strQ2 = org.schabi.newpipe.extractor.services.youtube.i.q(cVar3.e("navigationEndpoint"));
                            if (strQ2 == null) {
                                org.mozilla.javascript.typedarrays.c.b("Could not extract emergency renderer url");
                                return null;
                            }
                            try {
                                ((ArrayList) zVar3.y).add(new URL(org.schabi.newpipe.extractor.utils.f.l(strQ2)));
                                arrayList.add(zVar3);
                            } catch (MalformedURLException e4) {
                                org.mozilla.javascript.typedarrays.c.d("Could not parse emergency renderer url", e4);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static Object r(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int s(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final long t(long j) {
        if (j < 0) {
            kotlin.time.g gVar = kotlin.time.a.y;
            return kotlin.time.a.A;
        }
        kotlin.time.g gVar2 = kotlin.time.a.y;
        return kotlin.time.a.z;
    }

    public static int u(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map v(kotlin.k... kVarArr) {
        if (kVarArr.length <= 0) {
            return v.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u(kVarArr.length));
        A(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static int w(Object obj, a2 a2Var, byte[] bArr, int i, int i2, int i3, p0 p0Var) throws x0 {
        n1 n1Var = (n1) a2Var;
        int i4 = p0Var.d + 1;
        p0Var.d = i4;
        if (i4 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iF = n1Var.F(obj, bArr, i, i2, i3, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return iF;
    }

    public static int x(Object obj, a2 a2Var, byte[] bArr, int i, int i2, p0 p0Var) throws x0 {
        int iJ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iJ = j(i3, bArr, iJ, p0Var);
            i3 = p0Var.a;
        }
        int i4 = iJ;
        if (i3 < 0 || i3 > i2 - i4) {
            throw x0.g();
        }
        int i5 = p0Var.d + 1;
        p0Var.d = i5;
        if (i5 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        a2Var.g(obj, bArr, i4, i6, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x006a A[EDGE_INSN: B:109:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    public static okhttp3.g y(okhttp3.r rVar) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        okhttp3.r rVar2 = rVar;
        rVar2.getClass();
        int size = rVar2.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iP = -1;
        int iP2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iP3 = -1;
        int iP4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strC = rVar2.c(i3);
            String strF = rVar2.f(i3);
            if (strC.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strF;
                }
                i = 0;
                while (i < strF.length()) {
                    length = strF.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strF.length();
                            break;
                        }
                        i2 = size;
                        if (kotlin.text.k.U("=,;", strF.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = kotlin.text.k.A0(strF.substring(i, length2)).toString();
                    if (length2 != strF.length() || strF.charAt(length2) == ',' || strF.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = okhttp3.internal.e.a;
                        int length4 = strF.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strF.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strF.length();
                                break;
                            }
                        }
                        if (length3 >= strF.length() || strF.charAt(length3) != '\"') {
                            int length5 = strF.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strF.length();
                                    break;
                                }
                                int i4 = length5;
                                if (kotlin.text.k.U(",;", strF.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = kotlin.text.k.A0(strF.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iA0 = kotlin.text.k.a0(strF, '\"', i6, 4);
                            string2 = strF.substring(i6, iA0);
                            i = iA0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iP = okhttp3.internal.e.p(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iP2 = okhttp3.internal.e.p(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iP3 = okhttp3.internal.e.p(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iP4 = okhttp3.internal.e.p(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                rVar2 = rVar;
                size = size;
            } else {
                if (strC.equalsIgnoreCase("Pragma")) {
                }
                i3++;
                rVar2 = rVar;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strF.length()) {
                length = strF.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strF.length();
                        break;
                    }
                    i2 = size;
                    if (kotlin.text.k.U("=,;", strF.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = kotlin.text.k.A0(strF.substring(i, length2)).toString();
                if (length2 != strF.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iP = okhttp3.internal.e.p(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iP2 = okhttp3.internal.e.p(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iP3 = okhttp3.internal.e.p(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iP4 = okhttp3.internal.e.p(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            rVar2 = rVar;
            size = size;
        }
        return new okhttp3.g(z2, z3, iP, iP2, z4, z5, z6, iP3, iP4, z7, z8, z9, !z ? null : str);
    }

    public static LinkedHashMap z(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }
}
