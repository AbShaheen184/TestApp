package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.activity.compose.internal.b {
    public static c e;
    public static final androidx.compose.ui.text.style.j f = androidx.compose.ui.text.style.j.y;
    public static final androidx.compose.ui.text.style.j g = androidx.compose.ui.text.style.j.e;
    public androidx.compose.ui.text.j0 c;
    public androidx.compose.ui.semantics.p d;

    @Override // androidx.activity.compose.internal.b
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                androidx.compose.ui.semantics.p pVar = this.d;
                if (pVar == null) {
                    kotlin.jvm.internal.l.f("node");
                    throw null;
                }
                androidx.compose.ui.geometry.c cVarG = pVar.g();
                int iRound = Math.round(cVarG.d - cVarG.b);
                if (i <= 0) {
                    i = 0;
                }
                androidx.compose.ui.text.j0 j0Var = this.c;
                if (j0Var == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                int iD = j0Var.b.d(i);
                androidx.compose.ui.text.j0 j0Var2 = this.c;
                if (j0Var2 == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                float f2 = j0Var2.b.f(iD) + iRound;
                androidx.compose.ui.text.j0 j0Var3 = this.c;
                if (j0Var3 == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                androidx.compose.ui.text.n nVar = j0Var3.b;
                float f3 = nVar.f(nVar.f - 1);
                androidx.compose.ui.text.j0 j0Var4 = this.c;
                if (f2 < f3) {
                    if (j0Var4 == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    iE = j0Var4.b.e(f2);
                } else {
                    if (j0Var4 == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    iE = j0Var4.b.f;
                }
                return b(i, j(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // androidx.activity.compose.internal.b
    public final int[] i(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                androidx.compose.ui.semantics.p pVar = this.d;
                if (pVar == null) {
                    kotlin.jvm.internal.l.f("node");
                    throw null;
                }
                androidx.compose.ui.geometry.c cVarG = pVar.g();
                int iRound = Math.round(cVarG.d - cVarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                androidx.compose.ui.text.j0 j0Var = this.c;
                if (j0Var == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                int iD = j0Var.b.d(i);
                androidx.compose.ui.text.j0 j0Var2 = this.c;
                if (j0Var2 == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                float f2 = j0Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    androidx.compose.ui.text.j0 j0Var3 = this.c;
                    if (j0Var3 == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    iE = j0Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(j(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int j(int i, androidx.compose.ui.text.style.j jVar) {
        androidx.compose.ui.text.j0 j0Var = this.c;
        if (j0Var == null) {
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        int iF = j0Var.f(i);
        androidx.compose.ui.text.j0 j0Var2 = this.c;
        if (j0Var2 == null) {
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        androidx.compose.ui.text.style.j jVarG = j0Var2.g(iF);
        androidx.compose.ui.text.j0 j0Var3 = this.c;
        if (jVar != jVarG) {
            if (j0Var3 != null) {
                return j0Var3.f(i);
            }
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        if (j0Var3 != null) {
            return j0Var3.b.c(i, false) - 1;
        }
        kotlin.jvm.internal.l.f("layoutResult");
        throw null;
    }
}
