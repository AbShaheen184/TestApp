package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ge implements sd {
    public boolean e;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final Object a(rd rdVar) throws IOException {
        if (this.e) {
            if (rdVar.b.isEmpty()) {
                return rdVar.a.c(rdVar.d);
            }
            throw new androidx.datastore.preferences.protobuf.i("Short circuit would skip transforms.");
        }
        Closeable closeableD = wf.d(rdVar);
        try {
            if (!(closeableD instanceof zd)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((zd) closeableD).a();
            if (closeableD != null) {
                closeableD.close();
            }
            return fileA;
        } catch (Throwable th) {
            if (closeableD != null) {
                try {
                    closeableD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
