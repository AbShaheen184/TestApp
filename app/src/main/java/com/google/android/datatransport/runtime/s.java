package com.google.android.datatransport.runtime;

import android.content.Context;
import com.appsalt.internal.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final javax.inject.a b;
    public final javax.inject.a c;
    public final com.google.android.datatransport.runtime.dagger.internal.b d;

    public /* synthetic */ s(javax.inject.a aVar, javax.inject.a aVar2, com.google.android.datatransport.runtime.dagger.internal.b bVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new r(new com.google.android.material.shape.g(), new com.google.android.gms.common.internal.k(26), (com.google.android.datatransport.runtime.scheduling.a) ((com.google.android.datatransport.runtime.scheduling.b) this.b).get(), (j0) ((com.google.android.datatransport.runtime.scheduling.jobscheduling.j) this.c).get(), (com.google.firebase.messaging.o) ((com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.d).get());
            default:
                return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(0, (Context) this.b.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.c.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.a) ((m) this.d).get());
        }
    }
}
