package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g4 extends c4 {
    public boolean z;

    public g4(l4 l4Var) {
        super(l4Var);
        this.y.O++;
    }

    public final void w() {
        if (this.z) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Not initialized");
    }

    public final void x() {
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
            return;
        }
        y();
        this.y.P++;
        this.z = true;
    }

    public abstract void y();
}
