package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Closeable {
    public static final androidx.compose.ui.platform.q0 y = new androidx.compose.ui.platform.q0(2);
    public int e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
        } else {
            net.luminis.tls.engine.impl.c.m("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
