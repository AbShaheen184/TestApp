package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.google.android.gms.common.internal.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c2(29, (Context) ((e) this.b).b, new com.google.android.material.shape.g(), new k(26));
            default:
                return this.b;
        }
    }
}
