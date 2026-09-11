package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.google.android.datatransport.runtime.scheduling.persistence.i;
import com.google.android.gms.common.internal.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final javax.inject.a b;
    public final javax.inject.a c;

    public /* synthetic */ g(javax.inject.a aVar, javax.inject.a aVar2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new f((Context) ((e) this.b).b, (c2) ((e) this.c).get());
            default:
                return new com.google.android.datatransport.runtime.scheduling.persistence.g(new com.google.android.material.shape.g(), new k(26), com.google.android.datatransport.runtime.scheduling.persistence.a.f, (i) this.b.get(), this.c);
        }
    }
}
