package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class sf extends com.google.android.material.resources.g {
    public final /* synthetic */ int a;

    public /* synthetic */ sf(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.resources.g
    public final long l() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
