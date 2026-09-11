package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c {
    public final /* synthetic */ e a;

    public j(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z) {
        com.google.android.gms.internal.base.g gVar = this.a.J;
        gVar.sendMessage(gVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
