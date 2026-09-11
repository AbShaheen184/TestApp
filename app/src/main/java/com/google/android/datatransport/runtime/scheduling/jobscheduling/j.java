package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.appsalt.internal.j0;
import com.google.android.datatransport.runtime.s;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final javax.inject.a c;
    public final s d;
    public final javax.inject.a e;
    public final javax.inject.a f;
    public final javax.inject.a g;

    public j(javax.inject.a aVar, javax.inject.a aVar2, javax.inject.a aVar3, s sVar, javax.inject.a aVar4, javax.inject.a aVar5, javax.inject.a aVar6) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = sVar;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar6;
    }

    @Override // javax.inject.a
    public final Object get() {
        Context context = (Context) this.a.get();
        com.google.android.datatransport.runtime.backends.f fVar = (com.google.android.datatransport.runtime.backends.f) this.b.get();
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.c.get();
        c cVar = (c) this.d.get();
        Executor executor = (Executor) this.e.get();
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.f.get();
        com.google.android.material.shape.g gVar3 = new com.google.android.material.shape.g();
        com.google.android.gms.common.internal.k kVar = new com.google.android.gms.common.internal.k(26);
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar4 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.g.get();
        j0 j0Var = new j0();
        j0Var.a = context;
        j0Var.b = fVar;
        j0Var.c = gVar;
        j0Var.d = cVar;
        j0Var.e = executor;
        j0Var.f = gVar2;
        j0Var.g = gVar3;
        j0Var.h = kVar;
        j0Var.i = gVar4;
        return j0Var;
    }
}
