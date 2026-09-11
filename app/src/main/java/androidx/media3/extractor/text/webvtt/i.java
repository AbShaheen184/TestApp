package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.appcompat.widget.c2;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    public final w e = new w();
    public final a y = new a();

    /* JADX WARN: Code duplicated, block: B:121:0x0229  */
    /* JADX WARN: Code duplicated, block: B:130:0x024a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:138:0x0278  */
    /* JADX WARN: Code duplicated, block: B:139:0x027c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0284  */
    /* JADX WARN: Code duplicated, block: B:142:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02df  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:173:0x0301  */
    /* JADX WARN: Code duplicated, block: B:175:0x0311  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:179:0x033c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0345  */
    /* JADX WARN: Code duplicated, block: B:183:0x0347  */
    /* JADX WARN: Code duplicated, block: B:186:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x0352  */
    /* JADX WARN: Code duplicated, block: B:190:0x035b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0363  */
    /* JADX WARN: Code duplicated, block: B:195:0x0368  */
    /* JADX WARN: Code duplicated, block: B:196:0x036d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0380  */
    /* JADX WARN: Code duplicated, block: B:239:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0311, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // androidx.media3.extractor.text.l
    public final void k(byte[] bArr, int i, int i2, k kVar, androidx.media3.common.util.i iVar) {
        c cVarD;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        i iVar2 = this;
        w wVar = iVar2.e;
        wVar.K(bArr, i + i2);
        wVar.M(i);
        ArrayList arrayList = new ArrayList();
        try {
            j.d(wVar);
            while (!TextUtils.isEmpty(wVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = wVar.b;
                        String strN = wVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        wVar.M(i6);
                        if (b2 == 0) {
                            com.google.firebase.b.I(new c2(arrayList2), kVar, iVar);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(wVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    net.luminis.tls.engine.impl.c.o("A style block was found after the first cue.");
                                    return;
                                }
                                wVar.n(StandardCharsets.UTF_8);
                                a aVar = iVar2.y;
                                w wVar2 = aVar.a;
                                StringBuilder sb = aVar.b;
                                sb.setLength(0);
                                int i8 = wVar.b;
                                while (!TextUtils.isEmpty(wVar.n(StandardCharsets.UTF_8))) {
                                }
                                wVar2.K(wVar.a, wVar.b);
                                wVar2.M(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    a.c(wVar2);
                                    if (wVar2.a() >= 5 && "::cue".equals(wVar2.x(5, StandardCharsets.UTF_8))) {
                                        int i9 = wVar2.b;
                                        String strB = a.b(wVar2, sb);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            wVar2.M(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i10 = wVar2.b;
                                                int i11 = wVar2.c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) wVar2.a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = wVar2.x((i10 - 1) - wVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(a.b(wVar2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(a.b(wVar2, sb))) {
                                        b bVar = new b();
                                        bVar.a = "";
                                        bVar.b = "";
                                        bVar.c = Collections.EMPTY_SET;
                                        bVar.d = "";
                                        bVar.e = str;
                                        bVar.g = z2;
                                        bVar.i = z2;
                                        bVar.j = i5;
                                        bVar.k = i5;
                                        bVar.l = i5;
                                        bVar.m = i5;
                                        bVar.n = i5;
                                        bVar.p = i5;
                                        bVar.q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = a.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    bVar.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = j0.a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                bVar.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                bVar.a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                bVar.b = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                com.google.android.material.motion.a.f(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strB2 = str;
                                        while (r8 == 0) {
                                            int i14 = wVar2.b;
                                            strB2 = a.b(wVar2, sb);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                wVar2.M(i14);
                                                a.c(wVar2);
                                                String strA = a.a(wVar2, sb);
                                                if (!strA.isEmpty() && ":".equals(a.b(wVar2, sb))) {
                                                    a.c(wVar2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = wVar2.b;
                                                            String strB3 = a.b(wVar2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                wVar2.M(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = wVar2.b;
                                                        String strB4 = a.b(wVar2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                bVar.f = androidx.media3.common.util.g.a(string, true);
                                                                bVar.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.h = androidx.media3.common.util.g.a(string, true);
                                                                    bVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        bVar.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            bVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.e = com.google.common.base.b.w(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = a.d.matcher(com.google.common.base.b.w(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Token.SETPROP /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        bVar.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        bVar.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        bVar.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        org.mozilla.javascript.c.a();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                bVar.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                androidx.media3.common.util.c.t("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strB4)) {
                                                            wVar2.M(i16);
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                bVar.f = androidx.media3.common.util.g.a(string, true);
                                                                bVar.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.h = androidx.media3.common.util.g.a(string, true);
                                                                    bVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        bVar.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            bVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.e = com.google.common.base.b.w(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = a.d.matcher(com.google.common.base.b.w(string));
                                                                            if (matcher.matches()) {
                                                                                androidx.media3.common.util.c.t("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Token.SETPROP /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                bVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                bVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                bVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                org.mozilla.javascript.c.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        bVar.o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        bVar.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        bVar.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        bVar.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        org.mozilla.javascript.c.a();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                bVar.o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(bVar);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = wVar.n(charset);
                                if (strN2 == null) {
                                    cVarD = null;
                                } else {
                                    Pattern pattern2 = h.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        cVarD = h.d(null, matcher3, wVar, arrayList);
                                    } else {
                                        cVarD = null;
                                        String strN3 = wVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                cVarD = h.d(strN2.trim(), matcher4, wVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVarD != null) {
                                    arrayList2.add(cVarD);
                                }
                            }
                            iVar2 = this;
                        }
                    }
                }
            }
        } catch (androidx.media3.common.j0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final int z() {
        return 1;
    }
}
