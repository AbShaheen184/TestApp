package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.activity.w;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h, androidx.savedstate.g {
    public final /* synthetic */ i e;
    public x y;
    public androidx.savedstate.f z;

    public k(i iVar) {
        this.e = iVar;
        Object objC = iVar.c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objC instanceof Bundle ? (Bundle) objC : null;
        if (bundle != null && this.z == null) {
            androidx.savedstate.f fVar = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.room.coroutines.d(this, 2)));
            this.z = fVar;
            fVar.b(bundle);
        }
        iVar.d("androidx.savedstate.SavedStateRegistry", new w(this, 20));
    }

    @Override // androidx.compose.runtime.saveable.h
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Map b() {
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final g d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        x xVar = this.y;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this, false);
        this.y = xVar2;
        return xVar2;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        androidx.savedstate.f fVar = this.z;
        if (fVar == null) {
            androidx.savedstate.f fVar2 = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.room.coroutines.d(this, 2)));
            this.z = fVar2;
            fVar2.b(null);
            fVar = fVar2;
        }
        return fVar.b;
    }
}
