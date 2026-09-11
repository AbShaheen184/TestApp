package net.luminis.quic.impl;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.function.IntSupplier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public volatile long b;
    public final i c;
    public volatile boolean f;
    public ScheduledFuture g;
    public volatile IntSupplier d = new c();
    public final ScheduledExecutorService a = Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.a("idle-timer", 1));
    public volatile Long e = Long.valueOf(System.currentTimeMillis());

    public d(i iVar) {
        this.c = iVar;
    }
}
