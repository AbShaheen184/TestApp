package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class xf extends og {
    public static final /* synthetic */ int d = 0;
    public final AtomicLong c = new AtomicLong(-1);

    static {
        new uf(1);
    }

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        AtomicLong atomicLong = this.c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
