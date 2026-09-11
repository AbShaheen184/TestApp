package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import com.google.android.datatransport.runtime.scheduling.persistence.g;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final s c;
    public final javax.inject.a d;
    public final javax.inject.a e;

    public b(javax.inject.a aVar, javax.inject.a aVar2, s sVar, javax.inject.a aVar3, javax.inject.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = sVar;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new a((Executor) this.a.get(), (f) this.b.get(), (c) this.c.get(), (g) this.d.get(), (g) this.e.get());
    }
}
