package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends og {
    public static final uf d = new uf(3);
    public static final androidx.compose.ui.platform.q0 e = new androidx.compose.ui.platform.q0(4);
    public final AtomicInteger c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        this.c.decrementAndGet();
    }
}
