package com.app.mlounge;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.activity.contextaware.b {
    public final /* synthetic */ MainActivity a;

    public k(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // androidx.activity.contextaware.b
    public final void a(androidx.activity.p pVar) {
        MainActivity mainActivity = this.a;
        if (mainActivity.z) {
            return;
        }
        mainActivity.z = true;
        ((InterfaceC0008r) mainActivity.a()).getClass();
    }
}
