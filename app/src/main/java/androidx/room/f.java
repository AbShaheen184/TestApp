package androidx.room;

import com.app.mlounge.data.local.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final AppDatabase_Impl a;
    public final i0 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final androidx.compose.runtime.saveable.f e;
    public final androidx.compose.runtime.saveable.f f;
    public final Object g;

    public f(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = appDatabase_Impl;
        i0 i0Var = new i0(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.j, new androidx.compose.foundation.c(1, this, f.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 4));
        this.b = i0Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new androidx.compose.runtime.saveable.f(this);
        this.f = new androidx.compose.runtime.saveable.f(this);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        i0Var.k = new androidx.activity.w(this, 29);
    }
}
