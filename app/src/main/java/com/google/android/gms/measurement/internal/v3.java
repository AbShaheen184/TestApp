package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, b2 b2Var, int i) {
        super(b2Var);
        this.e = i;
        this.f = obj;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void a() {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.source.r0 r0Var = (androidx.media3.exoplayer.source.r0) this.f;
                w3 w3Var = (w3) r0Var.A;
                w3Var.v();
                s1 s1Var = (s1) w3Var.e;
                s1Var.H.getClass();
                r0Var.e(SystemClock.elapsedRealtime(), false, false);
                b0 b0Var = s1Var.K;
                s1.j(b0Var);
                s1Var.H.getClass();
                b0Var.y(SystemClock.elapsedRealtime());
                break;
            case 1:
                b4 b4Var = (b4) this.f;
                b4Var.A();
                x0 x0Var = ((s1) b4Var.e).C;
                s1.m(x0Var);
                x0Var.K.a("Starting upload from DelayedRunnable");
                b4Var.y.q();
                break;
            default:
                l4 l4Var = (l4) this.f;
                l4Var.e().v();
                String str = (String) l4Var.N.pollFirst();
                if (str != null) {
                    l4Var.c().getClass();
                    l4Var.f0 = SystemClock.elapsedRealtime();
                    l4Var.b().K.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    l4.S(l4Var.I.e, intent);
                }
                l4Var.H();
                break;
        }
    }
}
