package org.jsoup.parser;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum v0 extends l3 {
    public v0() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        Locale locale;
        int iK0;
        if (aVar.g0('/')) {
            t0Var.e();
            t0Var.a(l3.I);
            return;
        }
        if (aVar.F && aVar.i0() && t0Var.o != null) {
            if (t0Var.p == null) {
                t0Var.p = "</" + t0Var.o;
            }
            String str = t0Var.p;
            boolean z = true;
            if (str.equals(aVar.I)) {
                int i = aVar.J;
                if (i == -1) {
                    z = false;
                } else if (i < aVar.A) {
                    aVar.I = str;
                    locale = Locale.ENGLISH;
                    iK0 = aVar.k0(str.toLowerCase(locale));
                    if (iK0 > -1) {
                        aVar.J = aVar.A + iK0;
                    } else {
                        int iK1 = aVar.k0(str.toUpperCase(locale));
                        if (iK1 > -1) {
                        }
                        aVar.J = z ? aVar.A + iK1 : -1;
                    }
                }
            } else {
                aVar.I = str;
                locale = Locale.ENGLISH;
                iK0 = aVar.k0(str.toLowerCase(locale));
                if (iK0 > -1) {
                    aVar.J = aVar.A + iK0;
                } else {
                    int iK2 = aVar.k0(str.toUpperCase(locale));
                    z = iK2 > -1;
                    aVar.J = z ? aVar.A + iK2 : -1;
                }
            }
            if (!z) {
                o0 o0VarD = t0Var.d(false);
                o0VarD.j(t0Var.o);
                t0Var.j = o0VarD;
                t0Var.k();
                t0Var.o(l3.E);
                return;
            }
        }
        t0Var.f('<');
        t0Var.o(l3.z);
    }
}
