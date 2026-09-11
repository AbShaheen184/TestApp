package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d = new d(null, null);
    public final Runnable a;
    public final Executor b;
    public d c;

    public d(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
