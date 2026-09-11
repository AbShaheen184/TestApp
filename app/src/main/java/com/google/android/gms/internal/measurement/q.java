package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w2 {
    public static final Set f;
    public static final bh g;
    public static final o h;
    public final String b;
    public final Level c;
    public final Set d;
    public final bh e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(cg.a, sg.a, tg.a)));
        f = setUnmodifiableSet;
        bh bhVar = new bh(wf.b(setUnmodifiableSet));
        g = bhVar;
        h = new o(Level.ALL, setUnmodifiableSet, bhVar);
    }

    public /* synthetic */ q(String str, Level level, Set set, bh bhVar) {
        super(str);
        this.b = h.b(str);
        this.c = level;
        this.d = set;
        this.e = bhVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:105:0x01af  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0233  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:146:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x026c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0276  */
    /* JADX WARN: Code duplicated, block: B:157:0x0279  */
    /* JADX WARN: Code duplicated, block: B:163:0x0283  */
    /* JADX WARN: Code duplicated, block: B:168:0x028d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0291  */
    /* JADX WARN: Code duplicated, block: B:172:0x0299  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:178:0x02be  */
    /* JADX WARN: Code duplicated, block: B:196:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:200:0x0305  */
    /* JADX WARN: Code duplicated, block: B:203:0x0312  */
    /* JADX WARN: Code duplicated, block: B:206:0x0331  */
    /* JADX WARN: Code duplicated, block: B:208:0x0335  */
    /* JADX WARN: Code duplicated, block: B:209:0x0339  */
    /* JADX WARN: Code duplicated, block: B:210:0x033f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0368  */
    /* JADX WARN: Code duplicated, block: B:220:0x0373  */
    /* JADX WARN: Code duplicated, block: B:222:0x037b A[LOOP:4: B:139:0x0235->B:222:0x037b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x0393 A[LOOP:2: B:99:0x0194->B:229:0x0393, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:255:0x0418  */
    /* JADX WARN: Code duplicated, block: B:257:0x041e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0424  */
    /* JADX WARN: Code duplicated, block: B:261:0x042c  */
    /* JADX WARN: Code duplicated, block: B:262:0x042f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0432  */
    /* JADX WARN: Code duplicated, block: B:266:0x0436  */
    /* JADX WARN: Code duplicated, block: B:269:0x0453  */
    /* JADX WARN: Code duplicated, block: B:289:0x0496  */
    /* JADX WARN: Code duplicated, block: B:291:0x049a  */
    /* JADX WARN: Code duplicated, block: B:293:0x049e  */
    /* JADX WARN: Code duplicated, block: B:295:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a A[LOOP:1: B:63:0x00f6->B:69:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0173  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    public static void m(zf zfVar, String str, Level level, Set set, bh bhVar) {
        c ehVar;
        StringBuilder sb;
        gg ggVar;
        g gVar;
        c cVar;
        Level level2;
        boolean z;
        Object[] objArr;
        wg wgVar;
        androidx.emoji2.text.s sVar;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb2;
        String str4;
        int iB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Level level3;
        char cCharAt;
        int i9;
        char c;
        String str5;
        int i10;
        int i11;
        char cCharAt2;
        int i12;
        boolean z3;
        int i13;
        c cVar2;
        int i14;
        vg vgVar;
        int i15;
        char cCharAt3;
        String str6;
        int i16;
        vg vgVar2;
        int i17;
        char cCharAt4;
        char c2;
        int i18;
        ug ugVar;
        int i19;
        int i20;
        y yVar;
        androidx.core.view.w0 zVar;
        androidx.core.view.w0 b0Var;
        int i21;
        Object[] objArr3;
        int i22;
        Object obj;
        int i23;
        int i24;
        boolean z4;
        int i25;
        int i26;
        String string;
        ka kaVarD = zfVar.d();
        Level level4 = zfVar.a;
        Boolean bool = (Boolean) kaVarD.k(tg.a);
        if (bool == null || !bool.booleanValue()) {
            ((i) d.a).getClass();
            ka kaVarC = n.b.c();
            ka kaVarD2 = zfVar.d();
            int iA = kaVarD2.a();
            if (iA == 0) {
                ehVar = c.a;
            } else {
                ehVar = iA <= 28 ? new eh(kaVarC, kaVarD2) : new fh(kaVarC, kaVarD2);
            }
            boolean z5 = level4.intValue() < level.intValue();
            if (z5) {
                sb = new StringBuilder();
                ggVar = zfVar.d;
                if (ggVar != null) {
                    net.luminis.tls.engine.impl.c.r("cannot request log site information prior to postProcess()");
                    return;
                }
                if (ea.d(2, ggVar, sb)) {
                    sb.append(" ");
                }
                if (z5) {
                    gVar = zfVar.f;
                    if (gVar != null) {
                        if (gVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            net.luminis.tls.engine.impl.c.r("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = zfVar.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            net.luminis.tls.engine.impl.c.r("cannot get arguments before calling log()");
                            return;
                        }
                        sVar = new androidx.emoji2.text.s(gVar, objArr2, sb);
                        sb2 = (StringBuilder) sVar.g;
                        g gVar2 = (g) sVar.e;
                        c0 c0Var = gVar2.a;
                        str4 = gVar2.b;
                        c0Var.getClass();
                        iB = d0.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (true) {
                            i3 = 3;
                            if (iB < 0) {
                                cVar = ehVar;
                                level2 = level4;
                                String str7 = str2;
                                String str8 = str3;
                                i4 = sVar.b;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new androidx.compose.ui.res.e(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 5);
                            }
                            i5 = iB + 1;
                            i6 = i5;
                            i7 = 0;
                            while (true) {
                                if (i6 >= str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                i8 = i6 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i6);
                                i9 = i6;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i26 = (i7 * 10) + c;
                                    if (i26 >= 1000000) {
                                        throw androidx.compose.ui.res.e.a("index too large", iB, str4, i8);
                                    }
                                    i7 = i26;
                                    i6 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw androidx.compose.ui.res.e.a("invalid relative parameter", iB, str4, i8);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw androidx.compose.ui.res.e.a("missing index", iB, str4, i8);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw androidx.compose.ui.res.e.a("index has leading zero", iB, str4, i8);
                                }
                                i25 = i7 - 1;
                                if (i8 == str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i = i25;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            vg vgVar3 = vg.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        cVar2 = ehVar;
                                        i14 = i12;
                                        vgVar = new vg(i13, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i15 = i5 + 1;
                                        i14 = i12;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        cVar2 = ehVar;
                                        if (cCharAt3 > '9') {
                                            throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                        }
                                        i16 = cCharAt3 - '0';
                                        while (true) {
                                            if (i15 == i11) {
                                                vgVar2 = new vg(i13, i16, -1);
                                                vgVar = vgVar2;
                                                break;
                                            }
                                            i17 = i15 + 1;
                                            cCharAt4 = str4.charAt(i15);
                                            if (cCharAt4 == '.') {
                                                vgVar = new vg(i13, i16, vg.e(i17, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw androidx.compose.ui.res.e.b("invalid width character", i15, str4);
                                            }
                                            i16 = (i16 * 10) + c2;
                                            if (i16 > 999999) {
                                                throw androidx.compose.ui.res.e.a("width too large", i5, str4, i11);
                                            }
                                            i15 = i17;
                                            i3 = 3;
                                        }
                                    }
                                    i13 |= i18;
                                    i5 = i15;
                                    ehVar = cVar2;
                                    i12 = i14;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        cVar2 = ehVar;
                                        i14 = i12;
                                        vgVar = new vg(i13, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i15 = i5 + 1;
                                        i14 = i12;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        cVar2 = ehVar;
                                        if (cCharAt3 > '9') {
                                            throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                        }
                                        i16 = cCharAt3 - '0';
                                        while (true) {
                                            if (i15 == i11) {
                                                vgVar2 = new vg(i13, i16, -1);
                                                vgVar = vgVar2;
                                                break;
                                            }
                                            i17 = i15 + 1;
                                            cCharAt4 = str4.charAt(i15);
                                            if (cCharAt4 == '.') {
                                                vgVar = new vg(i13, i16, vg.e(i17, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw androidx.compose.ui.res.e.b("invalid width character", i15, str4);
                                            }
                                            i16 = (i16 * 10) + c2;
                                            if (i16 > 999999) {
                                                throw androidx.compose.ui.res.e.a("width too large", i5, str4, i11);
                                            }
                                            i15 = i17;
                                            i3 = 3;
                                        }
                                    }
                                    i13 |= i18;
                                    i5 = i15;
                                    ehVar = cVar2;
                                    i12 = i14;
                                    str3 = str6;
                                }
                            }
                            ugVar = ug.C[(cCharAt2 | ' ') - 97];
                            if (i14 == 0) {
                                ugVar = null;
                            }
                            i19 = i11 + 1;
                            if (ugVar != null) {
                                vgVar.getClass();
                                i23 = ugVar.z;
                                i24 = ugVar.y;
                                if (i24 == 1) {
                                    z4 = true;
                                } else {
                                    if (i24 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (vgVar.b(i23, z4)) {
                                    throw androidx.compose.ui.res.e.a("invalid format specifier", iB, str4, i19);
                                }
                                if (i < 10) {
                                    Map map = a0.B;
                                    if (vgVar.a()) {
                                        androidx.core.view.w0[] w0VarArr = (a0[]) a0.B.get(ugVar);
                                        e1.c(w0VarArr, "default parameter");
                                        zVar = w0VarArr[i];
                                    }
                                }
                                b0Var = new a0(i, ugVar, vgVar);
                                zVar = b0Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (vgVar.b(160, false)) {
                                    throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                }
                                i20 = i11 + 2;
                                if (i20 <= str4.length()) {
                                    throw androidx.compose.ui.res.e.b("truncated format specifier", iB, str4);
                                }
                                yVar = (y) y.y.get(Character.valueOf(str4.charAt(i19)));
                                if (yVar != null) {
                                    throw androidx.compose.ui.res.e.b("illegal date/time conversion", i19, str4);
                                }
                                zVar = new z(vgVar, i, yVar);
                                i19 = i20;
                            }
                            i21 = zVar.y;
                            if (i21 < 32) {
                                sVar.b |= 1 << i21;
                            }
                            sVar.c = Math.max(sVar.c, i21);
                            d0.a(sVar.d, iB, str4, sb2);
                            objArr3 = (Object[]) sVar.f;
                            i22 = zVar.y;
                            if (i22 < objArr3.length) {
                                obj = objArr3[i22];
                                if (obj != null) {
                                    zVar.O(sVar, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            sVar.d = i19;
                            iB = d0.b(i19, str4);
                            ehVar = cVar2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                    } else {
                        cVar = ehVar;
                        level2 = level4;
                        if (gVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            net.luminis.tls.engine.impl.c.r("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = zfVar.g;
                        if (objArr == null) {
                            net.luminis.tls.engine.impl.c.r("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(xg.a(objArr[0]));
                    }
                    int i27 = f.a;
                    wgVar = new wg(sb);
                    cVar.a(bhVar, wgVar);
                    if (wgVar.b) {
                        sb.append(" ]");
                    }
                } else {
                    gVar = zfVar.f;
                    if (gVar != null) {
                        if (gVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            net.luminis.tls.engine.impl.c.r("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = zfVar.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            net.luminis.tls.engine.impl.c.r("cannot get arguments before calling log()");
                            return;
                        }
                        sVar = new androidx.emoji2.text.s(gVar, objArr2, sb);
                        sb2 = (StringBuilder) sVar.g;
                        g gVar3 = (g) sVar.e;
                        c0 c0Var2 = gVar3.a;
                        str4 = gVar3.b;
                        c0Var2.getClass();
                        iB = d0.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (true) {
                            i3 = 3;
                            if (iB < 0) {
                                cVar = ehVar;
                                level2 = level4;
                                String str9 = str2;
                                String str10 = str3;
                                i4 = sVar.b;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new androidx.compose.ui.res.e(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 5);
                            }
                            i5 = iB + 1;
                            i6 = i5;
                            i7 = 0;
                            while (true) {
                                if (i6 >= str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                i8 = i6 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i6);
                                i9 = i6;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i26 = (i7 * 10) + c;
                                    if (i26 >= 1000000) {
                                        throw androidx.compose.ui.res.e.a("index too large", iB, str4, i8);
                                    }
                                    i7 = i26;
                                    i6 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw androidx.compose.ui.res.e.a("invalid relative parameter", iB, str4, i8);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw androidx.compose.ui.res.e.a("missing index", iB, str4, i8);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw androidx.compose.ui.res.e.a("index has leading zero", iB, str4, i8);
                                }
                                i25 = i7 - 1;
                                if (i8 == str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i = i25;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            vg vgVar4 = vg.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        cVar2 = ehVar;
                                        i14 = i12;
                                        vgVar = new vg(i13, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i15 = i5 + 1;
                                        i14 = i12;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        cVar2 = ehVar;
                                        if (cCharAt3 > '9') {
                                            throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                        }
                                        i16 = cCharAt3 - '0';
                                        while (true) {
                                            if (i15 == i11) {
                                                vgVar2 = new vg(i13, i16, -1);
                                                vgVar = vgVar2;
                                                break;
                                            }
                                            i17 = i15 + 1;
                                            cCharAt4 = str4.charAt(i15);
                                            if (cCharAt4 == '.') {
                                                vgVar = new vg(i13, i16, vg.e(i17, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw androidx.compose.ui.res.e.b("invalid width character", i15, str4);
                                            }
                                            i16 = (i16 * 10) + c2;
                                            if (i16 > 999999) {
                                                throw androidx.compose.ui.res.e.a("width too large", i5, str4, i11);
                                            }
                                            i15 = i17;
                                            i3 = 3;
                                        }
                                    }
                                    i13 |= i18;
                                    i5 = i15;
                                    ehVar = cVar2;
                                    i12 = i14;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        cVar2 = ehVar;
                                        i14 = i12;
                                        vgVar = new vg(i13, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i15 = i5 + 1;
                                        i14 = i12;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        cVar2 = ehVar;
                                        if (cCharAt3 > '9') {
                                            throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                        }
                                        i16 = cCharAt3 - '0';
                                        while (true) {
                                            if (i15 == i11) {
                                                vgVar2 = new vg(i13, i16, -1);
                                                vgVar = vgVar2;
                                                break;
                                            }
                                            i17 = i15 + 1;
                                            cCharAt4 = str4.charAt(i15);
                                            if (cCharAt4 == '.') {
                                                vgVar = new vg(i13, i16, vg.e(i17, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw androidx.compose.ui.res.e.b("invalid width character", i15, str4);
                                            }
                                            i16 = (i16 * 10) + c2;
                                            if (i16 > 999999) {
                                                throw androidx.compose.ui.res.e.a("width too large", i5, str4, i11);
                                            }
                                            i15 = i17;
                                            i3 = 3;
                                        }
                                    }
                                    i13 |= i18;
                                    i5 = i15;
                                    ehVar = cVar2;
                                    i12 = i14;
                                    str3 = str6;
                                }
                            }
                            ugVar = ug.C[(cCharAt2 | ' ') - 97];
                            if (i14 == 0) {
                                ugVar = null;
                            }
                            i19 = i11 + 1;
                            if (ugVar != null) {
                                vgVar.getClass();
                                i23 = ugVar.z;
                                i24 = ugVar.y;
                                if (i24 == 1) {
                                    z4 = true;
                                } else {
                                    if (i24 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (vgVar.b(i23, z4)) {
                                    throw androidx.compose.ui.res.e.a("invalid format specifier", iB, str4, i19);
                                }
                                if (i < 10) {
                                    Map map2 = a0.B;
                                    if (vgVar.a()) {
                                        androidx.core.view.w0[] w0VarArr2 = (a0[]) a0.B.get(ugVar);
                                        e1.c(w0VarArr2, "default parameter");
                                        zVar = w0VarArr2[i];
                                    }
                                }
                                b0Var = new a0(i, ugVar, vgVar);
                                zVar = b0Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (vgVar.b(160, false)) {
                                    throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                }
                                i20 = i11 + 2;
                                if (i20 <= str4.length()) {
                                    throw androidx.compose.ui.res.e.b("truncated format specifier", iB, str4);
                                }
                                yVar = (y) y.y.get(Character.valueOf(str4.charAt(i19)));
                                if (yVar != null) {
                                    throw androidx.compose.ui.res.e.b("illegal date/time conversion", i19, str4);
                                }
                                zVar = new z(vgVar, i, yVar);
                                i19 = i20;
                            }
                            i21 = zVar.y;
                            if (i21 < 32) {
                                sVar.b |= 1 << i21;
                            }
                            sVar.c = Math.max(sVar.c, i21);
                            d0.a(sVar.d, iB, str4, sb2);
                            objArr3 = (Object[]) sVar.f;
                            i22 = zVar.y;
                            if (i22 < objArr3.length) {
                                obj = objArr3[i22];
                                if (obj != null) {
                                    zVar.O(sVar, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            sVar.d = i19;
                            iB = d0.b(i19, str4);
                            ehVar = cVar2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                    } else {
                        cVar = ehVar;
                        level2 = level4;
                        if (gVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            net.luminis.tls.engine.impl.c.r("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = zfVar.g;
                        if (objArr == null) {
                            net.luminis.tls.engine.impl.c.r("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(xg.a(objArr[0]));
                    }
                    int i28 = f.a;
                    wgVar = new wg(sb);
                    cVar.a(bhVar, wgVar);
                    if (wgVar.b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i29 = f.a;
                if (zfVar.f == null && ehVar.b() <= set.size() && set.containsAll(ehVar.c())) {
                    if (!(zfVar.f == null)) {
                        net.luminis.tls.engine.impl.c.r("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = zfVar.g;
                    if (objArr4 == null) {
                        net.luminis.tls.engine.impl.c.r("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = xg.a(objArr4[0]);
                        level2 = level4;
                    }
                } else {
                    sb = new StringBuilder();
                    ggVar = zfVar.d;
                    if (ggVar != null) {
                        net.luminis.tls.engine.impl.c.r("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (ea.d(2, ggVar, sb)) {
                        sb.append(" ");
                    }
                    if (z5 || zfVar.f == null) {
                        gVar = zfVar.f;
                        if (gVar != null) {
                            if (gVar != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                net.luminis.tls.engine.impl.c.r("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = zfVar.g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                net.luminis.tls.engine.impl.c.r("cannot get arguments before calling log()");
                                return;
                            }
                            sVar = new androidx.emoji2.text.s(gVar, objArr2, sb);
                            sb2 = (StringBuilder) sVar.g;
                            g gVar4 = (g) sVar.e;
                            c0 c0Var3 = gVar4.a;
                            str4 = gVar4.b;
                            c0Var3.getClass();
                            iB = d0.b(0, str4);
                            i = -1;
                            i2 = 0;
                            while (true) {
                                i3 = 3;
                                if (iB < 0) {
                                    cVar = ehVar;
                                    level2 = level4;
                                    String str11 = str2;
                                    String str12 = str3;
                                    i4 = sVar.b;
                                    if (((i4 + 1) & i4) == 0 || (sVar.c > 31 && i4 != -1)) {
                                        throw new androidx.compose.ui.res.e(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 5);
                                    }
                                    d0.a(sVar.d, str4.length(), str4, sb2);
                                    if (!(zfVar.f != null)) {
                                        net.luminis.tls.engine.impl.c.r(str11);
                                        return;
                                    }
                                    Object[] objArr5 = zfVar.g;
                                    if (objArr5 == null) {
                                        net.luminis.tls.engine.impl.c.r(str12);
                                        return;
                                    } else {
                                        if (objArr5.length <= sVar.c + 1) {
                                            break;
                                        }
                                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                        break;
                                    }
                                }
                                i5 = iB + 1;
                                i6 = i5;
                                i7 = 0;
                                while (true) {
                                    if (i6 >= str4.length()) {
                                        throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                    }
                                    i8 = i6 + 1;
                                    level3 = level4;
                                    cCharAt = str4.charAt(i6);
                                    i9 = i6;
                                    c = (char) (cCharAt - '0');
                                    str5 = str2;
                                    if (c < '\n') {
                                        i26 = (i7 * 10) + c;
                                        if (i26 >= 1000000) {
                                            throw androidx.compose.ui.res.e.a("index too large", iB, str4, i8);
                                        }
                                        i7 = i26;
                                        i6 = i8;
                                        level4 = level3;
                                        str2 = str5;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i10 = -1;
                                    if (cCharAt != '<') {
                                        i = i2;
                                        i2++;
                                    } else {
                                        if (i == -1) {
                                            throw androidx.compose.ui.res.e.a("invalid relative parameter", iB, str4, i8);
                                        }
                                        if (i8 == str4.length()) {
                                            throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                        }
                                        str4.charAt(i8);
                                        i5 = i8;
                                        i8 = i9 + 2;
                                    }
                                } else {
                                    if (i9 - i5 == 0) {
                                        throw androidx.compose.ui.res.e.a("missing index", iB, str4, i8);
                                    }
                                    if (str4.charAt(i5) == '0') {
                                        throw androidx.compose.ui.res.e.a("index has leading zero", iB, str4, i8);
                                    }
                                    i25 = i7 - 1;
                                    if (i8 == str4.length()) {
                                        throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i = i25;
                                    i8 = i9 + 2;
                                    i10 = -1;
                                }
                                i11 = i8 + i10;
                                while (true) {
                                    if (i11 >= str4.length()) {
                                        throw new androidx.compose.ui.res.e(androidx.compose.ui.res.e.c("unterminated parameter", iB, str4, -1), 5);
                                    }
                                    if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i11++;
                                    str3 = str3;
                                    i3 = 3;
                                }
                                cCharAt2 = str4.charAt(i11);
                                i12 = cCharAt2 & ' ';
                                if (i12 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                vg vgVar5 = vg.e;
                                if (i5 == i11 || z3) {
                                    if (true != z3) {
                                        i13 = 0;
                                    } else {
                                        i13 = 128;
                                    }
                                    while (true) {
                                        if (i5 != i11) {
                                            i15 = i5 + 1;
                                            i14 = i12;
                                            cCharAt3 = str4.charAt(i5);
                                            str6 = str3;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                cVar2 = ehVar;
                                                if (cCharAt3 > '9') {
                                                    throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                                }
                                                i16 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i15 == i11) {
                                                        vgVar2 = new vg(i13, i16, -1);
                                                    } else {
                                                        i17 = i15 + 1;
                                                        cCharAt4 = str4.charAt(i15);
                                                        if (cCharAt4 == '.') {
                                                            vgVar = new vg(i13, i16, vg.e(i17, i11, str4));
                                                            break;
                                                        }
                                                        c2 = (char) (cCharAt4 - '0');
                                                        if (c2 >= '\n') {
                                                            throw androidx.compose.ui.res.e.b("invalid width character", i15, str4);
                                                        }
                                                        i16 = (i16 * 10) + c2;
                                                        if (i16 > 999999) {
                                                            throw androidx.compose.ui.res.e.a("width too large", i5, str4, i11);
                                                        }
                                                        i15 = i17;
                                                        i3 = 3;
                                                    }
                                                }
                                            } else {
                                                cVar2 = ehVar;
                                                int i30 = ((int) ((vg.d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i30 >= 0) {
                                                    i18 = 1 << i30;
                                                    if ((i13 & i18) != 0) {
                                                        throw androidx.compose.ui.res.e.b("repeated flag", i5, str4);
                                                    }
                                                    i13 |= i18;
                                                    i5 = i15;
                                                    ehVar = cVar2;
                                                    i12 = i14;
                                                    str3 = str6;
                                                } else {
                                                    if (cCharAt3 != '.') {
                                                        throw androidx.compose.ui.res.e.b("invalid flag", i5, str4);
                                                    }
                                                    vgVar2 = new vg(i13, -1, vg.e(i15, i11, str4));
                                                }
                                            }
                                            vgVar = vgVar2;
                                            break;
                                        } else {
                                            cVar2 = ehVar;
                                            i14 = i12;
                                            vgVar = new vg(i13, -1, -1);
                                        }
                                        ugVar = ug.C[(cCharAt2 | ' ') - 97];
                                        if (i14 == 0 && (ugVar == null || (ugVar.z & 128) == 0)) {
                                            ugVar = null;
                                        }
                                        i19 = i11 + 1;
                                        if (ugVar != null) {
                                            vgVar.getClass();
                                            i23 = ugVar.z;
                                            i24 = ugVar.y;
                                            if (i24 == 1) {
                                                z4 = true;
                                            } else if (i24 != 2 || i24 == i3 || i24 == 4) {
                                                z4 = false;
                                            } else {
                                                if (i24 != 5) {
                                                    throw null;
                                                }
                                                z4 = true;
                                            }
                                            if (vgVar.b(i23, z4)) {
                                                throw androidx.compose.ui.res.e.a("invalid format specifier", iB, str4, i19);
                                            }
                                            if (i < 10) {
                                                Map map3 = a0.B;
                                                if (vgVar.a()) {
                                                    androidx.core.view.w0[] w0VarArr3 = (a0[]) a0.B.get(ugVar);
                                                    e1.c(w0VarArr3, "default parameter");
                                                    zVar = w0VarArr3[i];
                                                }
                                            }
                                            b0Var = new a0(i, ugVar, vgVar);
                                            zVar = b0Var;
                                        } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                            if (vgVar.b(160, false)) {
                                                throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                            }
                                            i20 = i11 + 2;
                                            if (i20 <= str4.length()) {
                                                throw androidx.compose.ui.res.e.b("truncated format specifier", iB, str4);
                                            }
                                            yVar = (y) y.y.get(Character.valueOf(str4.charAt(i19)));
                                            if (yVar != null) {
                                                throw androidx.compose.ui.res.e.b("illegal date/time conversion", i19, str4);
                                            }
                                            zVar = new z(vgVar, i, yVar);
                                            i19 = i20;
                                        } else {
                                            if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                                throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                            }
                                            if (!vgVar.b(160, false)) {
                                                throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                            }
                                            b0Var = new b0(vgVar, i);
                                            zVar = b0Var;
                                        }
                                        i21 = zVar.y;
                                        if (i21 < 32) {
                                            sVar.b |= 1 << i21;
                                        }
                                        sVar.c = Math.max(sVar.c, i21);
                                        d0.a(sVar.d, iB, str4, sb2);
                                        objArr3 = (Object[]) sVar.f;
                                        i22 = zVar.y;
                                        if (i22 < objArr3.length) {
                                            obj = objArr3[i22];
                                            if (obj != null) {
                                                zVar.O(sVar, obj);
                                            } else {
                                                sb2.append("null");
                                            }
                                        } else {
                                            sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        sVar.d = i19;
                                        iB = d0.b(i19, str4);
                                        ehVar = cVar2;
                                        level4 = level3;
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                } else {
                                    vgVar = vg.e;
                                    cVar2 = ehVar;
                                    i14 = i12;
                                }
                                str6 = str3;
                                ugVar = ug.C[(cCharAt2 | ' ') - 97];
                                if (i14 == 0) {
                                    ugVar = null;
                                }
                                i19 = i11 + 1;
                                if (ugVar != null) {
                                    vgVar.getClass();
                                    i23 = ugVar.z;
                                    i24 = ugVar.y;
                                    if (i24 == 1) {
                                        z4 = true;
                                    } else {
                                        if (i24 != 2) {
                                        }
                                        z4 = false;
                                    }
                                    if (vgVar.b(i23, z4)) {
                                        throw androidx.compose.ui.res.e.a("invalid format specifier", iB, str4, i19);
                                    }
                                    if (i < 10) {
                                        Map map4 = a0.B;
                                        if (vgVar.a()) {
                                            androidx.core.view.w0[] w0VarArr4 = (a0[]) a0.B.get(ugVar);
                                            e1.c(w0VarArr4, "default parameter");
                                            zVar = w0VarArr4[i];
                                        }
                                    }
                                    b0Var = new a0(i, ugVar, vgVar);
                                    zVar = b0Var;
                                } else {
                                    if (cCharAt2 != 't') {
                                    }
                                    if (vgVar.b(160, false)) {
                                        throw androidx.compose.ui.res.e.a("invalid format specification", iB, str4, i19);
                                    }
                                    i20 = i11 + 2;
                                    if (i20 <= str4.length()) {
                                        throw androidx.compose.ui.res.e.b("truncated format specifier", iB, str4);
                                    }
                                    yVar = (y) y.y.get(Character.valueOf(str4.charAt(i19)));
                                    if (yVar != null) {
                                        throw androidx.compose.ui.res.e.b("illegal date/time conversion", i19, str4);
                                    }
                                    zVar = new z(vgVar, i, yVar);
                                    i19 = i20;
                                }
                                i21 = zVar.y;
                                if (i21 < 32) {
                                    sVar.b |= 1 << i21;
                                }
                                sVar.c = Math.max(sVar.c, i21);
                                d0.a(sVar.d, iB, str4, sb2);
                                objArr3 = (Object[]) sVar.f;
                                i22 = zVar.y;
                                if (i22 < objArr3.length) {
                                    obj = objArr3[i22];
                                    if (obj != null) {
                                        zVar.O(sVar, obj);
                                    } else {
                                        sb2.append("null");
                                    }
                                } else {
                                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                sVar.d = i19;
                                iB = d0.b(i19, str4);
                                ehVar = cVar2;
                                level4 = level3;
                                str2 = str5;
                                str3 = str6;
                            }
                        } else {
                            cVar = ehVar;
                            level2 = level4;
                            if (gVar == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                net.luminis.tls.engine.impl.c.r("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = zfVar.g;
                            if (objArr == null) {
                                net.luminis.tls.engine.impl.c.r("cannot get literal argument before calling log()");
                                return;
                            }
                            sb.append(xg.a(objArr[0]));
                        }
                        int i210 = f.a;
                        wgVar = new wg(sb);
                        cVar.a(bhVar, wgVar);
                        if (wgVar.b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(zfVar.f.b);
                        level2 = level4;
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) zfVar.d().k(cg.a);
            int iC = h.c(level2);
            if (iC == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iC == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iC == 4) {
                Log.i(str, string, th);
            } else if (iC != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final boolean e(Level level) {
        int iC = h.c(level);
        return Log.isLoggable(this.b, iC) || Log.isLoggable("all", iC);
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void f(zf zfVar) {
        m(zfVar, this.b, this.c, this.d, this.e);
    }
}
