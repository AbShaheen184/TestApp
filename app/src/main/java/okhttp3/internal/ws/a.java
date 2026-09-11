package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import okio.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {
    public Object A;
    public Closeable B;
    public final /* synthetic */ int e;
    public final boolean y;
    public final okio.f z;

    public a(int i, boolean z) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = z;
                this.z = new okio.f();
                break;
            default:
                this.y = z;
                okio.f fVar = new okio.f();
                this.z = fVar;
                Deflater deflater = new Deflater(-1, true);
                this.A = deflater;
                this.B = new coil3.disk.e(fVar, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.e) {
            case 0:
                ((coil3.disk.e) this.B).close();
                break;
            default:
                q qVar = (q) this.B;
                if (qVar != null) {
                    qVar.close();
                }
                this.B = null;
                this.A = null;
                break;
        }
    }
}
