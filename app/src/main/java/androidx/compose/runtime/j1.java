package androidx.compose.runtime;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public final y a;
    public final v b;
    public final r c;
    public final kotlin.jvm.functions.p d;
    public final boolean e;
    public final androidx.compose.ui.node.a2 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(k1.z);
    public long i = androidx.compose.runtime.internal.k.b();
    public androidx.collection.p0 j;
    public final androidx.compose.runtime.internal.l k;
    public final x1 l;

    public j1(y yVar, v vVar, r rVar, androidx.collection.r0 r0Var, kotlin.jvm.functions.p pVar, boolean z, androidx.compose.ui.node.a2 a2Var, Object obj) {
        this.a = yVar;
        this.b = vVar;
        this.c = rVar;
        this.d = pVar;
        this.e = z;
        this.f = a2Var;
        this.g = obj;
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        p0Var.getClass();
        this.j = p0Var;
        androidx.compose.runtime.internal.l lVar = new androidx.compose.runtime.internal.l();
        lVar.g(r0Var, rVar.D());
        this.k = lVar;
        this.l = new x1(a2Var.z);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((k1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    k1 k1Var = k1.C;
                    k1 k1Var2 = k1.D;
                    while (!atomicReference.compareAndSet(k1Var, k1Var2)) {
                        if (atomicReference.get() != k1Var) {
                            n1.b("Unexpected state change from: " + k1Var + " to: " + k1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new androidx.compose.ui.res.e(11);
            }
        } catch (Exception e) {
            atomicReference.set(k1.e);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.N = null;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.N = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((k1) this.h.get()).compareTo(k1.C) >= 0;
    }

    public final void d() {
        k1 k1Var;
        k1 k1Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            k1Var = k1.A;
            k1Var2 = k1.C;
            if (atomicReference.compareAndSet(k1Var, k1Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != k1Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        n1.b("Unexpected state change from: " + k1Var + " to: " + k1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[Catch: Exception -> 0x0025, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:46:0x00e7, B:49:0x00f6, B:50:0x00f9, B:51:0x00fb, B:57:0x0123, B:59:0x012b, B:54:0x0102, B:56:0x0108, B:64:0x0136, B:65:0x0139, B:66:0x013a, B:67:0x0141, B:68:0x0142, B:69:0x0149, B:47:0x00ec, B:23:0x006f), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[Catch: Exception -> 0x0025, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:46:0x00e7, B:49:0x00f6, B:50:0x00f9, B:51:0x00fb, B:57:0x0123, B:59:0x012b, B:54:0x0102, B:56:0x0108, B:64:0x0136, B:65:0x0139, B:66:0x013a, B:67:0x0141, B:68:0x0142, B:69:0x0149, B:47:0x00ec, B:23:0x006f), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012b A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:46:0x00e7, B:49:0x00f6, B:50:0x00f9, B:51:0x00fb, B:57:0x0123, B:59:0x012b, B:54:0x0102, B:56:0x0108, B:64:0x0136, B:65:0x0139, B:66:0x013a, B:67:0x0141, B:68:0x0142, B:69:0x0149, B:47:0x00ec, B:23:0x006f), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x007f->B:82:?, LOOP_END, SYNTHETIC] */
    public final boolean e(androidx.compose.ui.graphics.a aVar) throws Exception {
        long j;
        k1 k1Var = k1.B;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((k1) atomicReference.get()).ordinal();
            k1 k1Var2 = k1.A;
            y yVar = this.a;
            v vVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    r rVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        rVar.z = 0;
                        rVar.y = true;
                    }
                    try {
                        this.j = vVar.b(yVar, aVar, this.d);
                        if (z) {
                            rVar.u();
                        }
                        k1 k1Var3 = k1.z;
                        while (!atomicReference.compareAndSet(k1Var3, k1Var2)) {
                            if (atomicReference.get() != k1Var3) {
                                n1.b("Unexpected state change from: " + k1Var3 + " to: " + k1Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            rVar.u();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(k1Var2, k1Var)) {
                            if (atomicReference.get() != k1Var2) {
                                n1.b("Unexpected state change from: " + k1Var2 + " to: " + k1Var + '.');
                                j = this.i;
                                this.i = androidx.compose.runtime.internal.k.b();
                                this.j = vVar.n(yVar, aVar, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(k1Var, k1Var2)) {
                                    if (atomicReference.get() != k1Var) {
                                        n1.b("Unexpected state change from: " + k1Var + " to: " + k1Var2 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = androidx.compose.runtime.internal.k.b();
                        this.j = vVar.n(yVar, aVar, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(k1Var, k1Var2)) {
                            if (atomicReference.get() != k1Var) {
                                n1.b("Unexpected state change from: " + k1Var + " to: " + k1Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(k1Var, k1Var2)) {
                            if (atomicReference.get() != k1Var) {
                                n1.b("Unexpected state change from: " + k1Var + " to: " + k1Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.i;
                case 4:
                    t.b("Recursive call to resume()");
                    throw new androidx.compose.ui.res.e(10);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new androidx.compose.ui.res.e(11);
            }
        } catch (Exception e) {
            atomicReference.set(k1.e);
            throw e;
        }
    }
}
