package dagger.hilt.android.internal.lifecycle;

import androidx.activity.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.google.android.gms.measurement.internal.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s0 {
    public static final e0 d = new e0(13);
    public final dagger.internal.c a;
    public final s0 b;
    public final androidx.lifecycle.viewmodel.d c;

    public e(dagger.internal.c cVar, s0 s0Var, coil3.memory.c cVar2) {
        this.a = cVar;
        this.b = s0Var;
        this.c = new androidx.lifecycle.viewmodel.d(cVar2, 1);
    }

    public static e d(p pVar, s0 s0Var) {
        com.app.mlounge.d dVar = (com.app.mlounge.d) ((c) com.google.android.material.resources.g.e(pVar, c.class));
        return new e(dVar.a(), s0Var, new coil3.memory.c(5, dVar.a, dVar.b));
    }

    @Override // androidx.lifecycle.s0
    public final q0 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        com.google.gson.b.r("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // androidx.lifecycle.s0
    public final q0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        return this.a.containsKey(cls) ? this.c.b(cls, eVar) : this.b.b(cls, eVar);
    }
}
