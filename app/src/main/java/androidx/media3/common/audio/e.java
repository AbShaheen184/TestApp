package androidx.media3.common.audio;

import android.util.Log;
import com.caverock.androidsvg.i2;
import com.caverock.androidsvg.r0;
import com.caverock.androidsvg.v0;
import com.caverock.androidsvg.x0;
import com.caverock.androidsvg.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public int a;
    public boolean b = false;
    public Object c = com.caverock.androidsvg.d.y;

    public e(int i) {
        this.a = i;
    }

    public static int a(ArrayList arrayList, int i, x0 x0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        v0 v0Var = x0Var.b;
        if (obj != v0Var) {
            return -1;
        }
        Iterator it = v0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((z0) it.next()) == x0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(com.caverock.androidsvg.c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.q()) {
            String str = (String) cVar.d;
            String strSubstring = null;
            if (!cVar.q()) {
                int i = cVar.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cVar.b = i;
                } else {
                    int iH = cVar.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = cVar.h();
                    }
                    strSubstring = str.substring(i, cVar.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(com.caverock.androidsvg.d.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.Q()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(com.caverock.androidsvg.n nVar, int i, ArrayList arrayList, int i2, x0 x0Var) {
        com.caverock.androidsvg.o oVar = (com.caverock.androidsvg.o) nVar.a.get(i);
        if (!i(oVar, x0Var)) {
            return false;
        }
        int i3 = oVar.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!h(nVar, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(nVar, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, x0Var);
        if (iA <= 0) {
            return false;
        }
        return f(nVar, i - 1, arrayList, i2, (x0) x0Var.b.getChildren().get(iA - 1));
    }

    public static boolean g(com.caverock.androidsvg.n nVar, x0 x0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = x0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((z0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = nVar.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = nVar.a;
        if (size2 == 1) {
            return i((com.caverock.androidsvg.o) arrayList3.get(0), x0Var);
        }
        return f(nVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, x0Var);
    }

    public static boolean h(com.caverock.androidsvg.n nVar, int i, ArrayList arrayList, int i2) {
        com.caverock.androidsvg.o oVar = (com.caverock.androidsvg.o) nVar.a.get(i);
        x0 x0Var = (x0) arrayList.get(i2);
        if (!i(oVar, x0Var)) {
            return false;
        }
        int i3 = oVar.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (h(nVar, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return h(nVar, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, x0Var);
        if (iA <= 0) {
            return false;
        }
        return f(nVar, i - 1, arrayList, i2, (x0) x0Var.b.getChildren().get(iA - 1));
    }

    public static boolean i(com.caverock.androidsvg.o oVar, x0 x0Var) {
        ArrayList arrayList;
        String str = oVar.b;
        if (str != null && !str.equals(x0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<com.caverock.androidsvg.b> arrayList2 = oVar.c;
        if (arrayList2 != null) {
            for (com.caverock.androidsvg.b bVar : arrayList2) {
                String str2 = bVar.a;
                String str3 = bVar.c;
                if (str2.equals("id")) {
                    if (!str3.equals(x0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = x0Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = oVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((com.caverock.androidsvg.e) it.next()).a(x0Var)) {
                return false;
            }
        }
        return true;
    }

    public void b(com.caverock.androidsvg.m mVar, com.caverock.androidsvg.c cVar) throws com.caverock.androidsvg.a {
        int iIntValue;
        char cCharAt;
        int iS;
        String strU = cVar.U();
        cVar.R();
        if (strU == null) {
            throw new com.caverock.androidsvg.a("Invalid '@' rule");
        }
        int i = 0;
        if (!this.b && strU.equals("media")) {
            ArrayList arrayListC = c(cVar);
            if (!cVar.m('{')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: missing rule set");
            }
            cVar.R();
            com.caverock.androidsvg.d dVar = (com.caverock.androidsvg.d) this.c;
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e(cVar);
                    break;
                }
                com.caverock.androidsvg.d dVar2 = (com.caverock.androidsvg.d) it.next();
                if (dVar2 == com.caverock.androidsvg.d.e || dVar2 == dVar) {
                    this.b = true;
                    mVar.c(e(cVar));
                    this.b = false;
                    break;
                }
            }
            if (!cVar.q() && !cVar.m('}')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.b || !strU.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strU + " rule");
            while (!cVar.q() && ((iIntValue = cVar.B().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strT = null;
            if (!cVar.q()) {
                int i2 = cVar.b;
                if (cVar.n("url(")) {
                    cVar.R();
                    String strT2 = cVar.T();
                    if (strT2 == null) {
                        String str = (String) cVar.d;
                        StringBuilder sb = new StringBuilder();
                        while (!cVar.q() && (cCharAt = str.charAt(cVar.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !androidx.compose.ui.text.android.selection.e.z(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            cVar.b++;
                            if (cCharAt == '\\') {
                                if (!cVar.q()) {
                                    int i3 = cVar.b;
                                    cVar.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iS2 = com.caverock.androidsvg.c.S(cCharAt);
                                        if (iS2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !cVar.q() && (iS = com.caverock.androidsvg.c.S(str.charAt(cVar.b))) != -1; i4++) {
                                                cVar.b++;
                                                iS2 = (iS2 * 16) + iS;
                                            }
                                            sb.append((char) iS2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strT2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strT2 == null) {
                        cVar.b = i2;
                    } else {
                        cVar.R();
                        if (cVar.q() || cVar.n(")")) {
                            strT = strT2;
                        } else {
                            cVar.b = i2;
                        }
                    }
                }
            }
            if (strT == null) {
                strT = cVar.T();
            }
            if (strT == null) {
                throw new com.caverock.androidsvg.a("Invalid @import rule: expected string or url()");
            }
            cVar.R();
            c(cVar);
            if (!cVar.q() && !cVar.m(';')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.R();
    }

    public boolean d(com.caverock.androidsvg.m mVar, com.caverock.androidsvg.c cVar) throws com.caverock.androidsvg.a {
        ArrayList<com.caverock.androidsvg.n> arrayListV = cVar.V();
        if (arrayListV == null || arrayListV.isEmpty()) {
            return false;
        }
        if (!cVar.m('{')) {
            throw new com.caverock.androidsvg.a("Malformed rule block: expected '{'");
        }
        cVar.R();
        r0 r0Var = new r0();
        do {
            String strU = cVar.U();
            cVar.R();
            if (!cVar.m(':')) {
                throw new com.caverock.androidsvg.a("Expected ':'");
            }
            cVar.R();
            String str = (String) cVar.d;
            String strSubstring = null;
            if (!cVar.q()) {
                int i = cVar.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!androidx.compose.ui.text.android.selection.e.z(iCharAt)) {
                        i2 = cVar.b + 1;
                    }
                    iCharAt = cVar.h();
                }
                if (cVar.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    cVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new com.caverock.androidsvg.a("Expected property value");
            }
            cVar.R();
            if (cVar.m('!')) {
                cVar.R();
                if (!cVar.n("important")) {
                    throw new com.caverock.androidsvg.a("Malformed rule set: found unexpected '!'");
                }
                cVar.R();
            }
            cVar.m(';');
            i2.C(r0Var, strU, strSubstring);
            cVar.R();
            if (cVar.q()) {
                break;
            }
        } while (!cVar.m('}'));
        cVar.R();
        for (com.caverock.androidsvg.n nVar : arrayListV) {
            int i3 = this.a;
            com.caverock.androidsvg.l lVar = new com.caverock.androidsvg.l();
            lVar.a = nVar;
            lVar.b = r0Var;
            lVar.c = i3;
            mVar.a(lVar);
        }
        return true;
    }

    public com.caverock.androidsvg.m e(com.caverock.androidsvg.c cVar) {
        com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(0);
        while (!cVar.q()) {
            try {
                if (!cVar.n("<!--") && !cVar.n("-->")) {
                    if (!cVar.m('@')) {
                        if (!d(mVar, cVar)) {
                            break;
                        }
                    } else {
                        b(mVar, cVar);
                    }
                }
            } catch (com.caverock.androidsvg.a e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return mVar;
            }
        }
        return mVar;
    }
}
