package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.s;
import com.google.firebase.messaging.o;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final s c;
    public final javax.inject.a d;

    public m(javax.inject.a aVar, javax.inject.a aVar2, s sVar, javax.inject.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = sVar;
        this.d = aVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new o((Executor) this.a.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.b.get(), (c) this.c.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.d.get(), 20);
    }
}
