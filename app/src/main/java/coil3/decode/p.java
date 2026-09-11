package coil3.decode;

import okio.b0;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements q {
    public final AutoCloseable A;
    public final Object B = new Object();
    public boolean C;
    public b0 D;
    public final okio.x e;
    public final okio.k y;
    public final String z;

    public p(okio.x xVar, okio.k kVar, String str, AutoCloseable autoCloseable) {
        this.e = xVar;
        this.y = kVar;
        this.z = str;
        this.A = autoCloseable;
    }

    @Override // coil3.decode.q
    public final okio.x I() {
        okio.x xVar;
        synchronized (this.B) {
            if (this.C) {
                throw new IllegalStateException("closed");
            }
            xVar = this.e;
        }
        return xVar;
    }

    @Override // coil3.decode.q
    public final okio.h P() {
        synchronized (this.B) {
            if (this.C) {
                throw new IllegalStateException("closed");
            }
            b0 b0Var = this.D;
            if (b0Var != null) {
                return b0Var;
            }
            h0 h0VarC0 = this.y.c0(this.e);
            h0VarC0.getClass();
            b0 b0Var2 = new b0(h0VarC0);
            this.D = b0Var2;
            return b0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.B) {
            this.C = true;
            b0 b0Var = this.D;
            if (b0Var != null) {
                try {
                    b0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.A;
                if (autoCloseable != null) {
                    try {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.A;
                if (autoCloseable != null) {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // coil3.decode.q
    public final okio.k getFileSystem() {
        return this.y;
    }

    @Override // coil3.decode.q
    public final org.jsoup.helper.n q() {
        return null;
    }
}
