package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.util.i;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {
    public static final Pattern D = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public LinkedHashMap A;
    public final boolean e;
    public final androidx.media3.extractor.text.dvb.b y;
    public float B = -3.4028235E38f;
    public float C = -3.4028235E38f;
    public final w z = new w();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.e = false;
            this.y = null;
            return;
        }
        this.e = true;
        String strR = j0.r((byte[]) list.get(0));
        com.google.android.material.motion.a.f(strR.startsWith("Format:"));
        androidx.media3.extractor.text.dvb.b bVarA = androidx.media3.extractor.text.dvb.b.a(strR);
        bVarA.getClass();
        this.y = bVarA;
        b(new w((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = D.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = j0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(w wVar, Charset charset) {
        int i;
        d dVar;
        while (true) {
            String strN = wVar.n(charset);
            if (strN == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = wVar.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (wVar.a() != 0) {
                        int iH = wVar.h(charset);
                        if ((iH != 0 ? a0.c(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strW = com.google.common.base.b.w(strArrSplit[0].trim());
                        strW.getClass();
                        if (strW.equals("playresx")) {
                            this.B = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strW.equals("playresy")) {
                            try {
                                this.C = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String strN3 = wVar.n(charset);
                    if (strN3 != null) {
                        if (wVar.a() != 0) {
                            int iH2 = wVar.h(charset);
                            if ((iH2 != 0 ? a0.c(iH2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strW2 = com.google.common.base.b.w(strArrSplit2[i15].trim());
                                strW2.getClass();
                                switch (strW2.hashCode()) {
                                    case -1178781136:
                                        i = strW2.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strW2.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strW2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strW2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strW2.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strW2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strW2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strW2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strW2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strW2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            bVar = i5 != -1 ? new b(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (bVar == null) {
                                    androidx.media3.common.util.c.t("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    com.google.android.material.motion.a.f(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i16 = bVar.k;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = j0.a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Skipping malformed 'Style:' line (expected ", " values, found ", i16, "): '", length2);
                                        sbW.append(strN3);
                                        sbW.append("'");
                                        androidx.media3.common.util.c.t("SsaStyle", sbW.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[bVar.a].trim();
                                            int i17 = bVar.b;
                                            int iA = i17 != -1 ? d.a(strArrSplit3[i17].trim()) : -1;
                                            int i18 = bVar.c;
                                            Integer numC = i18 != -1 ? d.c(strArrSplit3[i18].trim()) : null;
                                            int i19 = bVar.d;
                                            Integer numC2 = i19 != -1 ? d.c(strArrSplit3[i19].trim()) : null;
                                            int i20 = bVar.e;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    androidx.media3.common.util.c.u("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = bVar.f;
                                            boolean z = i21 != -1 && d.b(strArrSplit3[i21].trim());
                                            int i22 = bVar.g;
                                            boolean z2 = i22 != -1 && d.b(strArrSplit3[i22].trim());
                                            int i23 = bVar.h;
                                            boolean z3 = i23 != -1 && d.b(strArrSplit3[i23].trim());
                                            int i24 = bVar.i;
                                            boolean z4 = i24 != -1 && d.b(strArrSplit3[i24].trim());
                                            int i25 = bVar.j;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        androidx.media3.common.util.c.t("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            dVar = new d(strTrim, iA, numC, numC2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            androidx.media3.common.util.c.u("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + "'", e2);
                                            dVar = null;
                                        }
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.a, dVar);
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                        linkedHashMap.put(dVar.a, dVar);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.A = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                androidx.media3.common.util.c.k("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final void k(byte[] bArr, int i, int i2, k kVar, i iVar) {
        Charset charset;
        w wVar;
        long j;
        int i3;
        int i4;
        float f;
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int iA;
        int i14;
        a aVar = this;
        long j2 = kVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = aVar.z;
        wVar2.K(bArr, i + i2);
        wVar2.M(i);
        Charset charsetI = wVar2.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        boolean z = aVar.e;
        if (!z) {
            aVar.b(wVar2, charsetI);
        }
        androidx.media3.extractor.text.dvb.b bVarA = z ? aVar.y : null;
        while (true) {
            String strN = wVar2.n(charsetI);
            if (strN == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !kVar.b) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            org.mozilla.javascript.c.a();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        androidx.media3.extractor.text.a aVar2 = new androidx.media3.extractor.text.a(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            iVar.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        iVar.accept((androidx.media3.extractor.text.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                bVarA = androidx.media3.extractor.text.dvb.b.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (bVarA == null) {
                        androidx.media3.common.util.c.t("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i16 = bVarA.f;
                        com.google.android.material.motion.a.f(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i17 = bVarA.a;
                        String[] strArrSplit = strSubstring.split(",", i16);
                        if (strArrSplit.length != i16) {
                            androidx.media3.common.util.c.t("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i17 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i17].trim());
                                } catch (RuntimeException unused) {
                                    androidx.media3.common.util.c.t("SsaParser", "Fail to parse layer: " + strArrSplit[i17]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jC = c(strArrSplit[bVarA.b]);
                            charset = charsetI;
                            if (jC == -9223372036854775807L) {
                                androidx.media3.common.util.c.t("SsaParser", "Skipping invalid timing: ".concat(strN));
                                j = j2;
                                wVar = wVar2;
                            } else {
                                j = j2;
                                long jC2 = c(strArrSplit[bVarA.c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    wVar = wVar2;
                                    androidx.media3.common.util.c.t("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.A;
                                    d dVar = (linkedHashMap == null || (i14 = bVarA.d) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[bVarA.e];
                                    Matcher matcher = c.a.matcher(str);
                                    PointF pointF = null;
                                    int i18 = -1;
                                    while (matcher.find()) {
                                        w wVar3 = wVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = c.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = c.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = d.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i18 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        wVar2 = wVar3;
                                    }
                                    wVar = wVar2;
                                    String strReplace = c.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = aVar.B;
                                    float f8 = aVar.C;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (dVar != null) {
                                        boolean z2 = dVar.g;
                                        Integer num = dVar.d;
                                        Integer num2 = dVar.c;
                                        if (num2 != null) {
                                            i9 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i9 = 33;
                                            i10 = 0;
                                        }
                                        if (dVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i10, spannableString.length(), i9);
                                        }
                                        float f9 = dVar.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i11 = 1;
                                        }
                                        boolean z3 = dVar.f;
                                        if (z3 && z2) {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i13);
                                        }
                                        if (dVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i13);
                                        }
                                        i5 = i12;
                                        f = f6;
                                    } else {
                                        f7 = f7;
                                        f8 = f8;
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i18 == -1) {
                                        i18 = dVar != null ? dVar.b : -1;
                                    }
                                    switch (i18) {
                                        case 0:
                                        default:
                                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unknown alignment: ", i18, "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i19 = Integer.MIN_VALUE;
                                    switch (i18) {
                                        case 0:
                                        default:
                                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unknown alignment: ", i18, "SsaParser");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i18) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unknown alignment: ", i18, "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = i4;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.95f;
                                        if (i6 != 0) {
                                            i7 = 1;
                                            if (i6 != 1) {
                                                i8 = 2;
                                                f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i8 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i7 = 1;
                                            i8 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i19 == 0) {
                                            f10 = 0.05f;
                                        } else if (i19 == i7) {
                                            f10 = 0.5f;
                                        } else if (i19 != i8) {
                                            f10 = -3.4028235E38f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    androidx.media3.common.text.b bVar = new androidx.media3.common.text.b(spannableString, alignment2, null, null, f3, i4, i19, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, i3);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(bVar);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetI;
                    j = j2;
                    wVar = wVar2;
                } else {
                    charset = charsetI;
                    j = j2;
                    wVar = wVar2;
                }
                aVar = this;
                charsetI = charset;
                j2 = j;
                bVarA = bVarA;
                wVar2 = wVar;
            }
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final int z() {
        return 1;
    }
}
