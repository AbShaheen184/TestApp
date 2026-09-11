package androidx.compose.ui.node;

import androidx.compose.runtime.u2;
import androidx.compose.ui.platform.p2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new e(i, 0);
        A = new e(i, 1);
        B = new e(i, 2);
        C = new e(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2) {
        super(i);
        this.y = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                ((Number) obj2).intValue();
                ((g) obj).getClass();
                break;
            case 1:
                ((f0) ((g) obj)).c0((androidx.compose.ui.layout.q0) obj2);
                break;
            case 2:
                ((f0) ((g) obj)).d0((androidx.compose.ui.r) obj2);
                break;
            default:
                androidx.compose.runtime.a0 a0Var = (androidx.compose.runtime.a0) obj2;
                f0 f0Var = (f0) ((g) obj);
                f0Var.Z = a0Var;
                a1 a1Var = f0Var.d0;
                u2 u2Var = androidx.compose.ui.platform.l1.h;
                androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) a0Var;
                jVar.getClass();
                f0Var.Z((androidx.compose.ui.unit.c) androidx.compose.runtime.s.s(jVar, u2Var));
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) androidx.compose.runtime.s.s(jVar, androidx.compose.ui.platform.l1.n);
                if (f0Var.X != mVar) {
                    f0Var.X = mVar;
                    f0Var.E();
                    f0 f0VarV = f0Var.v();
                    if (f0VarV != null) {
                        f0VarV.C();
                    }
                    f0Var.D();
                    for (androidx.compose.ui.q qVar = (androidx.compose.ui.q) a1Var.g; qVar != null; qVar = qVar.C) {
                        qVar.N();
                    }
                }
                f0Var.e0((p2) androidx.compose.runtime.s.s(jVar, androidx.compose.ui.platform.l1.s));
                androidx.compose.ui.q qVar2 = (androidx.compose.ui.q) a1Var.g;
                if ((qVar2.A & 32768) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.z & 32768) != 0) {
                            ?? E = qVar2;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof h) {
                                    androidx.compose.ui.q qVar3 = ((androidx.compose.ui.q) ((h) E)).e;
                                    if (qVar3.K) {
                                        e1.c(qVar3);
                                    } else {
                                        qVar3.G = true;
                                    }
                                } else if ((E.z & 32768) != 0 && (E instanceof j)) {
                                    androidx.compose.ui.q qVar4 = ((j) E).M;
                                    int i = 0;
                                    while (qVar4 != null) {
                                        if ((qVar4.z & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar4;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar4);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar4 = qVar4.C;
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
                                E = k.e(bVar);
                            }
                        }
                        if ((qVar2.A & 32768) != 0) {
                            qVar2 = qVar2.C;
                        }
                    }
                }
                break;
        }
        return kotlin.y.a;
    }
}
