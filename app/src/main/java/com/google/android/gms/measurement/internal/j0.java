package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends d0 {
    public boolean y;

    public j0(s1 s1Var) {
        super(s1Var);
        ((s1) this.e).X++;
    }

    public final void w() {
        if (this.y) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Not initialized");
    }

    public final void x() {
        if (this.y) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
        } else {
            if (y()) {
                return;
            }
            ((s1) this.e).Z.incrementAndGet();
            this.y = true;
        }
    }

    public abstract boolean y();
}
