package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public static final i0 d = new i0();
    public boolean a;
    public long b;
    public long c;

    public j0 a() {
        this.a = false;
        return this;
    }

    public j0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        net.luminis.tls.engine.impl.c.r("No deadline");
        return 0L;
    }

    public j0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("timeout < 0: ", j));
        return null;
    }

    public long h() {
        return this.c;
    }
}
