package androidx.compose.ui.focus;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y b = new y();
    public static final y c = new y();
    public static final y d = new y();
    public final androidx.compose.runtime.collection.b a = new androidx.compose.runtime.collection.b(new a0[16]);

    public static void a(y yVar) {
        yVar.getClass();
        if (yVar == b) {
            net.luminis.tls.engine.impl.c.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (yVar == c) {
            net.luminis.tls.engine.impl.c.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        androidx.compose.runtime.collection.b bVar = yVar.a;
        int i = bVar.z;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = bVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.compose.ui.q qVar = (androidx.compose.ui.q) ((a0) objArr[i2]);
            if (!qVar.e.K) {
                androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
            androidx.compose.ui.q qVar2 = qVar.e;
            androidx.compose.ui.q qVar3 = qVar2.C;
            if (qVar3 == null) {
                androidx.compose.ui.node.k.b(bVar2, qVar2);
            } else {
                bVar2.b(qVar3);
            }
            while (true) {
                int i3 = bVar2.z;
                if (i3 == 0) {
                    break;
                }
                androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar2.k(i3 - 1);
                if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                    androidx.compose.ui.node.k.b(bVar2, qVarE);
                } else {
                    while (qVarE != null) {
                        if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            androidx.compose.runtime.collection.b bVar3 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof e0) {
                                    if (((e0) qVarE).S0(7)) {
                                        break;
                                    }
                                } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i4 = 0;
                                    for (androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) qVarE).M; qVar4 != null; qVar4 = qVar4.C) {
                                        if ((qVar4.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                qVarE = qVar4;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar3.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar3.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar3);
                            }
                            break;
                        }
                        qVarE = qVarE.C;
                    }
                }
            }
        }
    }
}
