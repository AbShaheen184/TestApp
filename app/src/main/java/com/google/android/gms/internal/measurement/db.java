package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db implements com.google.common.util.concurrent.z {
    public static final /* synthetic */ db b = new db(0);
    public static final /* synthetic */ db c = new db(2);
    public final /* synthetic */ int a;

    public /* synthetic */ db(int i) {
        this.a = i;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) obj;
                throw new cb(dVar.e.e, dVar.getMessage(), dVar);
            case 1:
                throw null;
            default:
                return com.google.common.util.concurrent.n0.d("");
        }
    }
}
