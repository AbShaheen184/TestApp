package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends androidx.compose.animation.core.j2 {
    public boolean y;

    public a2(s1 s1Var) {
        super(s1Var);
        ((s1) this.e).X++;
    }

    public abstract boolean w();

    public final void x() {
        if (this.y) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Not initialized");
    }

    public final void y() {
        if (this.y) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
        } else {
            if (w()) {
                return;
            }
            ((s1) this.e).Z.incrementAndGet();
            this.y = true;
        }
    }
}
