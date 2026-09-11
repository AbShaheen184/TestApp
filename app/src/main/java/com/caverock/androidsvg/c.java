package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.compose.ui.text.android.selection.e {
    public c(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int S(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String T() {
        int iS;
        if (q()) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(this.b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int iIntValue = B().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = B().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = B().intValue();
                    } else {
                        int iS2 = S(iIntValue);
                        if (iS2 != -1) {
                            for (int i = 1; i <= 5 && (iS = S((iIntValue = B().intValue()))) != -1; i++) {
                                iS2 = (iS2 * 16) + iS;
                            }
                            sb.append((char) iS2);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = B().intValue();
        }
        return sb.toString();
    }

    public final String U() {
        int i;
        String str = (String) this.d;
        boolean zQ = q();
        int i2 = this.b;
        if (!zQ) {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i = this.b;
            }
            this.b = i2;
            i2 = i;
        }
        int i3 = this.b;
        if (i2 == i3) {
            return null;
        }
        String strSubstring = str.substring(i3, i2);
        this.b = i2;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:189:0x0312  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:243:0x03df  */
    /* JADX WARN: Code duplicated, block: B:252:0x041d  */
    /* JADX WARN: Code duplicated, block: B:257:0x043c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0440  */
    /* JADX WARN: Code duplicated, block: B:263:0x0456  */
    /* JADX WARN: Code duplicated, block: B:267:0x0465  */
    /* JADX WARN: Code duplicated, block: B:283:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v15, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17, types: [androidx.core.view.r] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.caverock.androidsvg.o] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final ArrayList V() throws a {
        ArrayList arrayList;
        int i;
        ?? oVar;
        int i2;
        String strE;
        ?? r9;
        int i3;
        androidx.media3.exoplayer.upstream.h hVarB;
        ?? r10;
        androidx.core.view.r rVar;
        ?? r11;
        ?? r8;
        ?? r12;
        androidx.core.view.r rVar2;
        ?? r13;
        f fVar;
        Object obj;
        ?? r14;
        ArrayList arrayListV;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj2;
        String str = null;
        if (q()) {
            return null;
        }
        ?? r3 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        n nVar = new n();
        while (!q() && !q()) {
            int i4 = this.b;
            ArrayList arrayList5 = nVar.a;
            int i5 = 2;
            boolean z = false;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                i = 0;
            } else if (m('>')) {
                R();
                i = 2;
            } else if (m('+')) {
                R();
                i = 3;
            } else {
                i = 0;
            }
            if (m('*')) {
                oVar = new o(i, str);
            } else {
                String strU = U();
                if (strU != null) {
                    o oVar2 = new o(i, strU);
                    nVar.b += r3;
                    oVar = oVar2;
                } else {
                    oVar = str;
                }
            }
            while (!q()) {
                if (m('.')) {
                    if (oVar == 0) {
                        oVar = new o(i, str);
                    }
                    String strU2 = U();
                    if (strU2 == null) {
                        throw new a("Invalid \".class\" simpleSelectors");
                    }
                    oVar.a("class", i5, strU2);
                    nVar.a();
                } else if (m('#')) {
                    if (oVar == 0) {
                        oVar = new o(i, str);
                    }
                    String strU3 = U();
                    if (strU3 == null) {
                        throw new a("Invalid \"#id\" simpleSelectors");
                    }
                    oVar.a("id", i5, strU3);
                    nVar.b += 1000000;
                } else if (m('[')) {
                    if (oVar == 0) {
                        oVar = new o(i, str);
                    }
                    R();
                    String strU4 = U();
                    if (strU4 == null) {
                        throw new a("Invalid attribute simpleSelectors");
                    }
                    R();
                    if (m('=')) {
                        i2 = i5;
                    } else if (n("~=")) {
                        i2 = 3;
                    } else {
                        i2 = n("|=") ? 4 : z ? 1 : 0;
                    }
                    if (i2 != 0) {
                        R();
                        if (q()) {
                            strE = str;
                        } else {
                            strE = E();
                            if (strE == null) {
                                strE = U();
                            }
                        }
                        if (strE == null) {
                            throw new a("Invalid attribute simpleSelectors");
                        }
                        R();
                    } else {
                        strE = str;
                    }
                    if (!m(']')) {
                        throw new a("Invalid attribute simpleSelectors");
                    }
                    if (i2 == 0) {
                        i2 = r3 == true ? 1 : 0;
                    }
                    oVar.a(strU4, i2, strE);
                    nVar.a();
                } else {
                    ?? oVar3 = oVar;
                    if (m(':')) {
                        if (oVar == 0) {
                            oVar3 = new o(i, str);
                        }
                        String strU5 = U();
                        if (strU5 == null) {
                            throw new a("Invalid pseudo class");
                        }
                        h hVar = (h) h.B.get(strU5);
                        if (hVar == null) {
                            hVar = h.A;
                        }
                        switch (hVar.ordinal()) {
                            case 0:
                                r9 = oVar3;
                                g gVar = new g(2);
                                nVar.a();
                                obj = gVar;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 1:
                                r9 = oVar3;
                                g gVar2 = new g(1);
                                nVar.a();
                                obj = gVar2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z2 = (hVar == h.e || hVar == h.y) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                boolean z3 = (hVar == h.y || hVar == h.z) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                int i6 = this.c;
                                String str2 = (String) this.d;
                                if (q()) {
                                    r8 = str;
                                    r13 = oVar3;
                                } else {
                                    int i7 = this.b;
                                    if (m('(')) {
                                        R();
                                        if (n("odd")) {
                                            rVar2 = new androidx.core.view.r(2, r3 == true ? 1 : 0);
                                        } else {
                                            if (n("even")) {
                                                rVar2 = new androidx.core.view.r(2, z ? 1 : 0);
                                            } else {
                                                int i8 = (!m('+') && m('-')) ? -1 : r3 == true ? 1 : 0;
                                                androidx.media3.exoplayer.upstream.h hVarB2 = androidx.media3.exoplayer.upstream.h.b(this.b, i6, str2);
                                                if (hVarB2 != null) {
                                                    this.b = hVarB2.a;
                                                }
                                                if (m('n') || m('N')) {
                                                    if (hVarB2 == null) {
                                                        hVarB2 = new androidx.media3.exoplayer.upstream.h(1L, this.b);
                                                    }
                                                    R();
                                                    boolean zM = m('+');
                                                    i3 = (zM || !(zM = m('-'))) ? 1 : -1;
                                                    if (zM) {
                                                        R();
                                                        hVarB = androidx.media3.exoplayer.upstream.h.b(this.b, i6, str2);
                                                        if (hVarB != null) {
                                                            this.b = hVarB.a;
                                                            r10 = oVar3;
                                                        } else {
                                                            this.b = i7;
                                                            r11 = oVar3;
                                                        }
                                                    } else {
                                                        hVarB = null;
                                                        r10 = oVar3;
                                                    }
                                                } else {
                                                    hVarB = hVarB2;
                                                    r10 = oVar3;
                                                    i3 = i8 == true ? 1 : 0;
                                                    hVarB2 = null;
                                                    i8 = 1;
                                                }
                                                new androidx.core.view.r(hVarB2 == null ? 0 : i8 * ((int) hVarB2.b), hVarB == null ? 0 : i3 * ((int) hVarB.b));
                                                rVar = r11;
                                                r12 = r10;
                                                R();
                                                r8 = rVar;
                                                r13 = r12;
                                                if (!m(')')) {
                                                    this.b = i7;
                                                    r11 = r12;
                                                }
                                            }
                                            r8 = 0;
                                            r13 = r11;
                                        }
                                        r12 = oVar3;
                                        rVar = rVar2;
                                        R();
                                        r8 = rVar;
                                        r13 = r12;
                                        if (!m(')')) {
                                            this.b = i7;
                                            r11 = r12;
                                            r8 = 0;
                                            r13 = r11;
                                        }
                                    } else {
                                        r8 = str;
                                        r13 = oVar3;
                                    }
                                }
                                if (r8 == 0) {
                                    throw new a("Invalid or missing parameter section for pseudo class: ".concat(strU5));
                                }
                                fVar = new f(r8.a, r8.b, z2, z3, r13.b);
                                nVar.a();
                                r14 = r13;
                                obj = fVar;
                                r9 = r14;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                                break;
                            case 6:
                                f fVar2 = new f(0, 1, true, false, null);
                                nVar.a();
                                r9 = oVar3;
                                obj = fVar2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 7:
                                f fVar3 = new f(0, 1, false, false, null);
                                nVar.a();
                                r9 = oVar3;
                                obj = fVar3;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 8:
                                f fVar4 = new f(0, 1, true, true, oVar3.b);
                                nVar.a();
                                r9 = oVar3;
                                obj = fVar4;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 9:
                                fVar = new f(0, 1, false, true, oVar3.b);
                                nVar.a();
                                r14 = oVar3;
                                obj = fVar;
                                r9 = r14;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 10:
                                k kVar = new k(str, z);
                                nVar.a();
                                obj2 = kVar;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 11:
                                k kVar2 = new k(oVar3.b, r3);
                                nVar.a();
                                obj2 = kVar2;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 12:
                                g gVar3 = new g(0);
                                nVar.a();
                                obj2 = gVar3;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 13:
                                if (q()) {
                                    arrayListV = str;
                                } else {
                                    int i9 = this.b;
                                    if (m('(')) {
                                        R();
                                        arrayListV = V();
                                        if (arrayListV != null && m(')')) {
                                            Iterator it = arrayListV.iterator();
                                            while (it.hasNext() && (arrayList2 = ((n) it.next()).a) != null) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((o) it2.next()).d) != null) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((e) it3.next()) instanceof i) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.b = i9;
                                        }
                                        arrayListV = str;
                                    } else {
                                        arrayListV = str;
                                    }
                                }
                                if (arrayListV == null) {
                                    throw new a("Invalid or missing parameter section for pseudo class: ".concat(strU5));
                                }
                                i iVar = new i();
                                iVar.a = arrayListV;
                                Iterator it4 = arrayListV.iterator();
                                int i10 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i11 = ((n) it4.next()).b;
                                    if (i11 > i10) {
                                        i10 = i11;
                                    }
                                }
                                nVar.b = i10;
                                obj2 = iVar;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                                break;
                            case 14:
                                if (!q()) {
                                    int i12 = this.b;
                                    if (m('(')) {
                                        R();
                                        ?? arrayList6 = str;
                                        while (true) {
                                            String strU6 = U();
                                            arrayList6 = arrayList6;
                                            if (strU6 == null) {
                                                this.b = i12;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(strU6);
                                                R();
                                                if (!Q()) {
                                                    if (!m(')')) {
                                                        this.b = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                j jVar = new j(strU5);
                                nVar.a();
                                obj2 = jVar;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                j jVar2 = new j(strU5);
                                nVar.a();
                                obj2 = jVar2;
                                r9 = oVar3;
                                obj = obj2;
                                if (r9.d == null) {
                                    r9.d = new ArrayList();
                                }
                                r9.d.add(obj);
                                oVar = r9;
                                str = null;
                                r3 = 1;
                                i5 = 2;
                                z = false;
                                break;
                            default:
                                throw new a("Unsupported pseudo class: ".concat(strU5));
                        }
                    } else {
                        if (oVar != 0) {
                            this.b = i4;
                            arrayList = nVar.a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList4.add(nVar);
                            }
                            return arrayList4;
                        }
                        if (nVar.a == null) {
                            nVar.a = new ArrayList();
                        }
                        nVar.a.add(oVar);
                        if (!Q()) {
                            arrayList4.add(nVar);
                            nVar = new n();
                        }
                        str = null;
                        r3 = 1;
                    }
                }
            }
            if (oVar != 0) {
                this.b = i4;
                arrayList = nVar.a;
                if (arrayList != null) {
                    arrayList4.add(nVar);
                }
                return arrayList4;
            }
            if (nVar.a == null) {
                nVar.a = new ArrayList();
            }
            nVar.a.add(oVar);
            if (!Q()) {
                arrayList4.add(nVar);
                nVar = new n();
            }
            str = null;
            r3 = 1;
        }
        arrayList = nVar.a;
        if (arrayList != null) {
            arrayList4.add(nVar);
        }
        return arrayList4;
    }
}
