package androidx.compose.ui.draw;

import android.view.KeyEvent;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.platform.a0;
import androidx.compose.ui.platform.i2;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.x;
import androidx.compose.ui.viewinterop.s;
import kotlin.jvm.internal.z;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(0);
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.compose.ui.semantics.p pVar;
        f0 f0Var;
        androidx.compose.ui.geometry.c cVar;
        switch (this.y) {
            case 0:
                ((c) this.z).N.invoke((d) this.A);
                return y.a;
            case 1:
                ((z) this.z).e = ((e0) this.A).N0();
                return y.a;
            case 2:
                ((androidx.compose.ui.input.pointer.d) this.z).d((q) this.A);
                return y.a;
            case 3:
                a1 a1Var = ((f0) this.z).d0;
                z zVar = (z) this.A;
                if ((((q) a1Var.g).A & 8) != 0) {
                    for (q qVar = (w1) a1Var.f; qVar != null; qVar = qVar.B) {
                        if ((qVar.z & 8) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof u1) {
                                    u1 u1Var = (u1) E;
                                    if (u1Var.F()) {
                                        androidx.compose.ui.semantics.l lVar = new androidx.compose.ui.semantics.l();
                                        zVar.e = lVar;
                                        lVar.A = true;
                                    }
                                    if (u1Var.t0()) {
                                        ((androidx.compose.ui.semantics.l) zVar.e).z = true;
                                    }
                                    u1Var.l0((x) zVar.e);
                                } else if ((E.z & 8) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                    } else {
                                        E = E;
                                        bVar = bVar;
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                    }
                }
                return y.a;
            case 4:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                k0 k0Var = d1.j0;
                lVar2.invoke(k0Var);
                d1 d1Var = (d1) this.A;
                n0 n0Var = d1Var.a0;
                n0 n0Var2 = k0Var.G;
                boolean z = n0Var != n0Var2;
                boolean z2 = d1Var.b0;
                boolean z3 = k0Var.H;
                boolean z4 = z2 != z3;
                if (z || z4) {
                    d1Var.a0 = n0Var2;
                    d1Var.b0 = z3;
                    if (d1Var.c0 && (z4 || (z3 && z))) {
                        d1Var.L.F();
                    }
                }
                d1Var.c0 = true;
                k0Var.M = k0Var.G.a(k0Var.I, k0Var.K, k0Var.J);
                return y.a;
            case 5:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.A));
            case 6:
                a0 a0Var = (a0) this.A;
                i2 i2Var = (i2) this.z;
                androidx.compose.ui.semantics.i iVar = i2Var.B;
                androidx.compose.ui.semantics.i iVar2 = i2Var.C;
                Float f = i2Var.z;
                Float f2 = i2Var.A;
                float fFloatValue = (iVar == null || f == null) ? 0.0f : ((Number) iVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (iVar2 == null || f2 == null) ? 0.0f : ((Number) iVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = a0Var.A(i2Var.e);
                    androidx.compose.ui.semantics.q qVar3 = (androidx.compose.ui.semantics.q) a0Var.s().b(a0Var.I);
                    if (qVar3 != null) {
                        try {
                            androidx.core.view.accessibility.d dVar = a0Var.K;
                            if (dVar != null) {
                                dVar.a.setBoundsInScreen(a0Var.k(qVar3));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    androidx.compose.ui.semantics.q qVar4 = (androidx.compose.ui.semantics.q) a0Var.s().b(a0Var.J);
                    if (qVar4 != null) {
                        try {
                            androidx.core.view.accessibility.d dVar2 = a0Var.L;
                            if (dVar2 != null) {
                                dVar2.a.setBoundsInScreen(a0Var.k(qVar4));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    a0Var.A.invalidate();
                    androidx.compose.ui.semantics.q qVar5 = (androidx.compose.ui.semantics.q) a0Var.s().b(iA);
                    if (qVar5 != null && (pVar = qVar5.a) != null && (f0Var = pVar.c) != null) {
                        if (iVar != null) {
                            a0Var.N.h(iA, iVar);
                        }
                        if (iVar2 != null) {
                            a0Var.O.h(iA, iVar2);
                        }
                        a0Var.w(f0Var);
                    }
                }
                if (iVar != null) {
                    i2Var.z = (Float) iVar.a.invoke();
                }
                if (iVar2 != null) {
                    i2Var.A = (Float) iVar2.a.invoke();
                }
                return y.a;
            case 7:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                if (aVar != null && (cVar = (androidx.compose.ui.geometry.c) aVar.invoke()) != null) {
                    return cVar;
                }
                d1 d1Var2 = (d1) this.A;
                if (!d1Var2.T0().K) {
                    d1Var2 = null;
                }
                if (d1Var2 != null) {
                    return com.google.android.gms.dynamite.g.c(0L, coil3.network.g.x(d1Var2.z));
                }
                return null;
            default:
                ((z) this.z).e = androidx.compose.ui.node.k.h((s) this.A, androidx.compose.ui.layout.a1.a);
                return y.a;
        }
    }
}
