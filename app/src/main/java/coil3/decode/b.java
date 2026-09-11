package coil3.decode;

import java.io.IOException;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends okio.n {
    public final /* synthetic */ int y = 0;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(retrofit2.x xVar, okio.h hVar) {
        super(hVar);
        this.z = xVar;
    }

    @Override // okio.n, okio.h0
    public long K(okio.f fVar, long j) throws Exception {
        switch (this.y) {
            case 0:
                try {
                    return super.K(fVar, j);
                } catch (Exception e) {
                    this.z = e;
                    throw e;
                }
            case 1:
            default:
                return super.K(fVar, j);
            case 2:
                try {
                    return super.K(fVar, j);
                } catch (IOException e2) {
                    ((retrofit2.x) this.z).B = e2;
                    throw e2;
                }
        }
    }

    @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.y) {
            case 1:
                ((okhttp3.c) this.z).z.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public /* synthetic */ b(h0 h0Var) {
        super(h0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h0 h0Var, okhttp3.c cVar) {
        super(h0Var);
        this.z = cVar;
    }
}
