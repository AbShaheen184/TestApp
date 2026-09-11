package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends s {
    public final /* synthetic */ e g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e eVar, int i, Bundle bundle) {
        super(eVar, i, bundle);
        this.g = eVar;
    }

    @Override // com.google.android.gms.common.internal.s
    public final boolean a() {
        this.g.G.i(com.google.android.gms.common.b.C);
        return true;
    }

    @Override // com.google.android.gms.common.internal.s
    public final void b(com.google.android.gms.common.b bVar) {
        e eVar = this.g;
        eVar.getClass();
        eVar.G.i(bVar);
        System.currentTimeMillis();
    }
}
