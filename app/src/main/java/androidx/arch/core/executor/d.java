package androidx.arch.core.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.firebase.b {
    public final Object l = new Object();
    public final ExecutorService m = Executors.newFixedThreadPool(4, new c());
}
