package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ float z;

    public /* synthetic */ j(kotlin.jvm.functions.l lVar, float f, int i) {
        this.e = i;
        this.y = lVar;
        this.z = f;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                float f = this.z - 2.0f;
                if (f < 10.0f) {
                    f = 10.0f;
                }
                this.y.invoke(Float.valueOf(f));
                break;
            case 1:
                float f2 = this.z + 2.0f;
                if (f2 > 36.0f) {
                    f2 = 36.0f;
                }
                this.y.invoke(Float.valueOf(f2));
                break;
            case 2:
                this.y.invoke(Float.valueOf(this.z));
                break;
            default:
                this.y.invoke(Float.valueOf(this.z));
                break;
        }
        return kotlin.y.a;
    }
}
