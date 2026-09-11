package com.app.mlounge.emulator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ EmulatorActivity y;

    public /* synthetic */ f(EmulatorActivity emulatorActivity, int i) {
        this.e = i;
        this.y = emulatorActivity;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf(EmulatorActivity.onCreate$lambda$0(this.y));
            case 1:
                return EmulatorActivity.onCreate$lambda$1(this.y);
            case 2:
                return EmulatorActivity.showMenu$lambda$3(this.y);
            case 3:
                return EmulatorActivity.showMenu$lambda$4(this.y);
            case 4:
                return EmulatorActivity.showMenu$lambda$5(this.y);
            default:
                return EmulatorActivity.showMenu$lambda$6(this.y);
        }
    }
}
