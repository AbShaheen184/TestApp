package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.l;
import okio.f0;
import okio.m;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m {
    public final l y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f0 f0Var, l lVar) {
        super(f0Var);
        f0Var.getClass();
        this.y = lVar;
    }

    @Override // okio.m, okio.f0
    public final void E(okio.f fVar, long j) throws EOFException {
        if (this.z) {
            fVar.skip(j);
            return;
        }
        try {
            this.e.E(fVar, j);
        } catch (IOException e) {
            this.z = true;
            this.y.invoke(e);
        }
    }

    @Override // okio.m, okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.z = true;
            this.y.invoke(e);
        }
    }

    @Override // okio.m, okio.f0, java.io.Flushable
    public final void flush() {
        if (this.z) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.z = true;
            this.y.invoke(e);
        }
    }
}
