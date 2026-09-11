package androidx.core.view;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements androidx.lifecycle.t {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Serializable z;

    public /* synthetic */ k(Object obj, Serializable serializable, Object obj2, int i) {
        this.e = i;
        this.y = obj;
        this.z = serializable;
        this.A = obj2;
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        androidx.lifecycle.n nVar2;
        switch (this.e) {
            case 0:
                m mVar = (m) this.y;
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.z;
                n nVar3 = (n) this.A;
                mVar.getClass();
                Runnable runnable = mVar.a;
                CopyOnWriteArrayList copyOnWriteArrayList = mVar.b;
                androidx.lifecycle.n.Companion.getClass();
                int iOrdinal = oVar.ordinal();
                androidx.lifecycle.n nVar4 = null;
                if (iOrdinal == 2) {
                    nVar2 = androidx.lifecycle.n.ON_CREATE;
                } else if (iOrdinal != 3) {
                    nVar2 = iOrdinal != 4 ? null : androidx.lifecycle.n.ON_RESUME;
                } else {
                    nVar2 = androidx.lifecycle.n.ON_START;
                }
                if (nVar != nVar2) {
                    androidx.lifecycle.n nVar5 = androidx.lifecycle.n.ON_DESTROY;
                    if (nVar != nVar5) {
                        int iOrdinal2 = oVar.ordinal();
                        if (iOrdinal2 == 2) {
                            nVar4 = nVar5;
                        } else if (iOrdinal2 == 3) {
                            nVar4 = androidx.lifecycle.n.ON_STOP;
                        } else if (iOrdinal2 == 4) {
                            nVar4 = androidx.lifecycle.n.ON_PAUSE;
                        }
                        if (nVar == nVar4) {
                            copyOnWriteArrayList.remove(nVar3);
                            runnable.run();
                        }
                    } else {
                        mVar.b(nVar3);
                    }
                } else {
                    copyOnWriteArrayList.add(nVar3);
                    runnable.run();
                }
                break;
            default:
                androidx.lifecycle.compose.b bVar = (androidx.lifecycle.compose.b) this.y;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) this.z;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                int i = androidx.lifecycle.compose.a.a[nVar.ordinal()];
                if (i == 1) {
                    zVar.e = lVar.invoke(bVar);
                    break;
                } else if (i == 2) {
                    androidx.activity.compose.j jVar = (androidx.activity.compose.j) zVar.e;
                    if (jVar != null) {
                        jVar.a();
                    }
                    zVar.e = null;
                    break;
                }
                break;
        }
    }
}
