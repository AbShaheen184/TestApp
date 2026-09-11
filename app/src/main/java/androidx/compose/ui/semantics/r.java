package androidx.compose.ui.semantics;

import androidx.collection.j0;
import androidx.compose.ui.node.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final f0 a;
    public final e b;
    public final androidx.collection.n c;
    public final j0 d = new j0(2);

    public r(f0 f0Var, e eVar, androidx.collection.z zVar) {
        this.a = f0Var;
        this.b = eVar;
        this.c = zVar;
    }

    public final p a() {
        return new p(this.b, false, this.a, new l());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    public final void b(f0 f0Var, l lVar) {
        String str;
        String str2;
        androidx.compose.ui.state.a aVar;
        androidx.compose.ui.state.a aVar2;
        androidx.compose.ui.autofill.q qVar;
        androidx.compose.ui.autofill.q qVar2;
        j0 j0Var = this.d;
        Object[] objArr = j0Var.a;
        int i = j0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.compose.ui.autofill.d dVar = (androidx.compose.ui.autofill.d) ((m) objArr[i2]);
            androidx.compose.ui.autofill.r rVar = dVar.e;
            androidx.compose.ui.platform.u uVar = dVar.z;
            l lVarX = f0Var.x();
            int i3 = f0Var.y;
            if (lVar != null) {
                Object objG = lVar.e.g(t.E);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) objG;
                if (gVar != null) {
                    str = gVar.y;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (lVarX != null) {
                Object objG2 = lVarX.e.g(t.E);
                if (objG2 == null) {
                    objG2 = null;
                }
                androidx.compose.ui.text.g gVar2 = (androidx.compose.ui.text.g) objG2;
                if (gVar2 != null) {
                    str2 = gVar2.y;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str != str2) {
                if (str == null) {
                    rVar.h(uVar, i3, true);
                } else if (str2 == null) {
                    rVar.h(uVar, i3, false);
                } else if (kotlin.jvm.internal.l.a((androidx.compose.ui.autofill.e) s.d(lVarX, t.r), androidx.compose.ui.autofill.n.a)) {
                    rVar.e(uVar, i3, androidx.compose.ui.autofill.i.a(str2));
                }
            }
            if (lVar != null) {
                Object objG3 = lVar.e.g(t.J);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar = (androidx.compose.ui.state.a) objG3;
            } else {
                aVar = null;
            }
            if (lVarX != null) {
                Object objG4 = lVarX.e.g(t.J);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar2 = (androidx.compose.ui.state.a) objG4;
            } else {
                aVar2 = null;
            }
            if (aVar != aVar2) {
                if (aVar == null) {
                    rVar.h(uVar, i3, true);
                } else if (aVar2 == null) {
                    rVar.h(uVar, i3, false);
                } else if (kotlin.jvm.internal.l.a((androidx.compose.ui.autofill.e) s.d(lVarX, t.r), androidx.compose.ui.autofill.n.b)) {
                    int iOrdinal = aVar2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        rVar.e(uVar, i3, androidx.compose.ui.autofill.i.b(bool.booleanValue()));
                    }
                }
            }
            if (lVar != null) {
                Object objG5 = lVar.e.g(t.s);
                if (objG5 == null) {
                    objG5 = null;
                }
                qVar = (androidx.compose.ui.autofill.q) objG5;
            } else {
                qVar = null;
            }
            if (lVarX != null) {
                Object objG6 = lVarX.e.g(t.s);
                if (objG6 == null) {
                    objG6 = null;
                }
                qVar2 = (androidx.compose.ui.autofill.q) objG6;
            } else {
                qVar2 = null;
            }
            if (!kotlin.jvm.internal.l.a(qVar, qVar2)) {
                if (qVar == null) {
                    rVar.h(uVar, i3, true);
                } else if (qVar2 == null) {
                    rVar.h(uVar, i3, false);
                } else {
                    rVar.e(uVar, i3, ((androidx.compose.ui.autofill.g) qVar2).a);
                }
            }
            boolean z = lVar != null && lVar.e.b(t.q);
            boolean z2 = lVarX != null && lVarX.e.b(t.q);
            if (z != z2) {
                androidx.collection.a0 a0Var = dVar.E;
                if (z2) {
                    a0Var.a(i3);
                } else {
                    a0Var.e(i3);
                }
            }
        }
    }
}
