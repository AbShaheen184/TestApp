package androidx.datastore.core;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c0 implements a {
    public final File a;
    public final y0 b;
    public final AtomicBoolean c;

    public c0(File file, y0 y0Var) {
        y0Var.getClass();
        this.a = file;
        this.b = y0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // androidx.datastore.core.a
    public final void close() {
        this.c.set(true);
    }
}
