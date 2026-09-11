package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends k {
    public static final com.google.android.material.resources.c G;
    public static final t0 H = new t0(x.class);
    public volatile Set E;
    public volatile int F;

    static {
        Throwable th;
        com.google.android.material.resources.c wVar;
        try {
            wVar = new v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, "E"), AtomicIntegerFieldUpdater.newUpdater(x.class, "F"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            wVar = new w();
        }
        G = wVar;
        if (th != null) {
            H.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
