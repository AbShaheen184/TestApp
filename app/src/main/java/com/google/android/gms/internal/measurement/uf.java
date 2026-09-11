package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class uf extends w2 {
    public final /* synthetic */ int b;

    public /* synthetic */ uf(int i) {
        this.b = i;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new vf();
            case 1:
                return new xf();
            case 2:
                return new ng();
            default:
                return new pg();
        }
    }
}
