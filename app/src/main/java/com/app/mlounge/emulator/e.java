package com.app.mlounge.emulator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ EmulatorActivity y;

    public /* synthetic */ e(EmulatorActivity emulatorActivity, int i) {
        this.e = i;
        this.y = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.showMenu();
                break;
            default:
                EmulatorActivity.startAutoSave$lambda$0(this.y);
                break;
        }
    }
}
