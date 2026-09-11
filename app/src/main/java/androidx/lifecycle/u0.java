package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final com.google.android.gms.common.internal.k b = new com.google.android.gms.common.internal.k(12);
    public final Object a;

    public u0(v0 v0Var, s0 s0Var, androidx.lifecycle.viewmodel.c cVar) {
        v0Var.getClass();
        s0Var.getClass();
        cVar.getClass();
        this.a = new com.google.firebase.messaging.o(v0Var, s0Var, cVar);
    }

    public q0 a(kotlin.jvm.internal.e eVar) {
        com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.a;
        String strB = eVar.b();
        if (strB != null) {
            return oVar.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVar);
        }
        net.luminis.tls.engine.impl.c.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public u0() {
        this.a = new AtomicReference(null);
    }

    public u0(e0 e0Var) {
        this.a = e0Var;
    }
}
