package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = eVar.b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.a;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : eVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new androidx.media3.common.text.i(eVar.c), i4, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.c);
                int i6 = eVar.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i7)).a.a)) {
                        d dVar = (d) arrayList.get(i7);
                        int iC2 = c(list2, str, dVar.a);
                        if (iC2 == i5) {
                            iC2 = iC != i5 ? iC : 1;
                        }
                        int i8 = dVar.a.b - length2;
                        int i9 = dVar.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new androidx.media3.common.text.g(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            b bVar = ((f) arrayListB.get(i10)).y;
            int i11 = bVar.l;
            if (i11 == -1 && bVar.m == -1) {
                i = -1;
            } else {
                i = (bVar.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = bVar.l;
                if (i12 == -1 && bVar.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (bVar.m == 1 ? 2 : 0);
                }
                kotlin.math.a.d(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (bVar.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (bVar.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (bVar.g) {
                if (!bVar.g) {
                    net.luminis.tls.engine.impl.c.r("Font color not defined");
                    return;
                }
                kotlin.math.a.d(spannableStringBuilder, new ForegroundColorSpan(bVar.f), i4, length);
            }
            if (bVar.i) {
                if (!bVar.i) {
                    net.luminis.tls.engine.impl.c.r("Background color not defined.");
                    return;
                }
                kotlin.math.a.d(spannableStringBuilder, new BackgroundColorSpan(bVar.h), i4, length);
            }
            if (bVar.e != null) {
                kotlin.math.a.d(spannableStringBuilder, new TypefaceSpan(bVar.e), i4, length);
            }
            int i13 = bVar.n;
            if (i13 == 1) {
                kotlin.math.a.d(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.o, true), i4, length);
            } else if (i13 == 2) {
                kotlin.math.a.d(spannableStringBuilder, new RelativeSizeSpan(bVar.o), i4, length);
            } else if (i13 == 3) {
                kotlin.math.a.d(spannableStringBuilder, new RelativeSizeSpan(bVar.o / 100.0f), i4, length);
            }
            if (bVar.q) {
                spannableStringBuilder.setSpan(new androidx.media3.common.text.e(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            String str2 = eVar.a;
            Set set = eVar.d;
            String str3 = eVar.c;
            if (bVar.a.isEmpty() && bVar.b.isEmpty() && bVar.c.isEmpty() && bVar.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(bVar.d, b.a(bVar.b, b.a(bVar.a, 0, str, 1073741824), str2, 2), str3, 4);
                if (iA == -1 || !set.containsAll(bVar.c)) {
                    r4 = 0;
                } else {
                    size = iA + (bVar.c.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new f(r4, bVar));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((f) arrayListB.get(i)).y.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.a = j.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.b = j.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb = new StringBuilder();
            wVar.getClass();
            String strN = wVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strN.trim());
                strN = wVar.n(StandardCharsets.UTF_8);
            }
            gVar.c = f(str, sb.toString(), arrayList);
            return new c(gVar.a().a(), gVar.a, gVar.b);
        } catch (IllegalArgumentException unused) {
            androidx.media3.common.util.c.t("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        int i;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, gVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                androidx.media3.common.util.c.t("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        gVar.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    androidx.media3.common.util.c.t("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            gVar.i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        gVar.h = j.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        gVar.j = j.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            androidx.media3.common.util.c.t("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        gVar.k = i3;
                    } else {
                        androidx.media3.common.util.c.t("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                androidx.media3.common.util.c.t("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            androidx.media3.common.util.c.t("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        com.google.android.material.motion.a.f(!strTrim2.isEmpty());
                        String str3 = j0.a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        com.google.android.material.motion.a.f(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new e(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, g gVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    androidx.media3.common.util.c.t("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            gVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.e = j.b(str);
            gVar.f = 0;
        } else {
            gVar.e = Integer.parseInt(str);
            gVar.f = 1;
        }
    }
}
