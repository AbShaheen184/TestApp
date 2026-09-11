package okio;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface f0 extends Closeable, Flushable {
    void E(f fVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    j0 e();

    void flush();
}
