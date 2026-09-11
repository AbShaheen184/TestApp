package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class lb extends c4 {
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(String str, int i) {
        super(str);
        this.z = i;
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        switch (this.z) {
            case 0:
                return d5.m;
            case 1:
            case 2:
                return this;
            case 3:
                return new j3(Double.valueOf(0.0d));
            default:
                return d5.m;
        }
    }
}
