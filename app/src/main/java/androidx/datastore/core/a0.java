package androidx.datastore.core;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final MutableStateFlow a;

    public a0() {
        this.a = StateFlowKt.MutableStateFlow(i1.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(androidx.compose.foundation.l0 l0Var, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.room.k kVar;
        if (cVar instanceof androidx.room.k) {
            kVar = (androidx.room.k) cVar;
            int i = kVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.z = i - Integer.MIN_VALUE;
            } else {
                kVar = new androidx.room.k(this, cVar);
            }
        } else {
            kVar = new androidx.room.k(this, cVar);
        }
        Object obj = kVar.e;
        int i2 = kVar.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            kVar.z = 1;
            if (this.a.collect(l0Var, kVar) == kotlin.coroutines.intrinsics.a.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            kotlin.a.e(obj);
        }
        com.google.gson.b.b();
    }

    public g1 b() {
        return (g1) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    public void c(g1 g1Var) {
        MutableStateFlow mutableStateFlow;
        Object value;
        g1 g1Var2;
        g1Var.getClass();
        do {
            mutableStateFlow = this.a;
            value = mutableStateFlow.getValue();
            g1Var2 = (g1) value;
            if ((g1Var2 instanceof w0) || kotlin.jvm.internal.l.a(g1Var2, i1.b)) {
                g1Var2 = g1Var;
            } else if (g1Var2 instanceof c) {
                if (g1Var.a > ((c) g1Var2).a) {
                    g1Var2 = g1Var;
                }
            } else if (!(g1Var2 instanceof j0)) {
                if (g1Var2 instanceof v0) {
                    net.luminis.tls.engine.impl.c.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    coil3.g.a();
                    return;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, g1Var2));
    }

    public a0(int i) {
        this.a = StateFlowKt.MutableStateFlow(new int[i]);
    }
}
