package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f d = new f();
    public final Runnable a;
    public final Executor b;
    public f c;

    public f() {
        this.a = null;
        this.b = null;
    }

    public f(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
