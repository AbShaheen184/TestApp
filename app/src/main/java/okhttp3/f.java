package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable, Flushable {
    public final okhttp3.internal.cache.h e;

    public f(File file) {
        okio.t tVar = okio.k.e;
        String str = okio.x.y;
        okio.x xVarJ = com.google.android.gms.measurement.internal.f0.j(file);
        tVar.getClass();
        okhttp3.internal.concurrent.d dVar = okhttp3.internal.concurrent.d.l;
        dVar.getClass();
        this.e = new okhttp3.internal.cache.h(tVar, xVarJ, dVar);
    }

    public final void a() {
        okhttp3.internal.cache.h hVar = this.e;
        synchronized (hVar) {
            try {
                hVar.z();
                Collection collectionValues = hVar.F.values();
                collectionValues.getClass();
                for (okhttp3.internal.cache.d dVar : (okhttp3.internal.cache.d[]) collectionValues.toArray(new okhttp3.internal.cache.d[0])) {
                    dVar.getClass();
                    hVar.a0(dVar);
                }
                hVar.L = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.e.flush();
    }

    public final void g(b0 b0Var) {
        b0Var.getClass();
        okhttp3.internal.cache.h hVar = this.e;
        String strO = com.google.common.base.c.o(b0Var.a);
        synchronized (hVar) {
            strO.getClass();
            hVar.z();
            hVar.a();
            okhttp3.internal.cache.h.c0(strO);
            okhttp3.internal.cache.d dVar = (okhttp3.internal.cache.d) hVar.F.get(strO);
            if (dVar == null) {
                return;
            }
            hVar.a0(dVar);
            if (hVar.D <= hVar.z) {
                hVar.L = false;
            }
        }
    }
}
