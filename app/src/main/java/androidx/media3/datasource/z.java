package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.j0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h {
    public long A;
    public final h e;
    public final androidx.media3.datasource.cache.c y;
    public boolean z;

    public z(h hVar, androidx.media3.datasource.cache.c cVar) {
        hVar.getClass();
        this.e = hVar;
        cVar.getClass();
        this.y = cVar;
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.e.c(fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() throws androidx.media3.datasource.cache.b {
        androidx.media3.datasource.cache.c cVar = this.y;
        try {
            this.e.close();
            if (this.z) {
                this.z = false;
                if (cVar.d == null) {
                    return;
                }
                try {
                    cVar.a();
                } catch (IOException e) {
                    throw new androidx.media3.datasource.cache.b(e);
                }
            }
        } catch (Throwable th) {
            if (this.z) {
                this.z = false;
                if (cVar.d != null) {
                    try {
                        cVar.a();
                    } catch (IOException e2) {
                        throw new androidx.media3.datasource.cache.b(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        return this.e.k();
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.cache.b {
        if (this.A == 0) {
            return -1;
        }
        int i3 = this.e.read(bArr, i, i2);
        if (i3 > 0) {
            androidx.media3.datasource.cache.c cVar = this.y;
            l lVar = cVar.d;
            if (lVar != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (cVar.h == cVar.e) {
                            cVar.a();
                            cVar.b(lVar);
                        }
                        int iMin = (int) Math.min(i3 - i4, cVar.e - cVar.h);
                        OutputStream outputStream = cVar.g;
                        String str = j0.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        cVar.h += j;
                        cVar.i += j;
                    } catch (IOException e) {
                        throw new androidx.media3.datasource.cache.b(e);
                    }
                }
            }
            long j2 = this.A;
            if (j2 != -1) {
                this.A = j2 - ((long) i3);
            }
        }
        return i3;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws androidx.media3.datasource.cache.b {
        long jT = this.e.t(lVar);
        this.A = jT;
        if (jT == 0) {
            return 0L;
        }
        if (lVar.g == -1 && jT != -1) {
            lVar = lVar.d(0L, jT);
        }
        int i = lVar.i;
        this.z = true;
        androidx.media3.datasource.cache.c cVar = this.y;
        cVar.getClass();
        lVar.h.getClass();
        if (lVar.g == -1 && (i & 2) == 2) {
            cVar.d = null;
        } else {
            cVar.d = lVar;
            cVar.e = (i & 4) == 4 ? cVar.b : Long.MAX_VALUE;
            cVar.i = 0L;
            try {
                cVar.b(lVar);
            } catch (IOException e) {
                throw new androidx.media3.datasource.cache.b(e);
            }
        }
        return this.A;
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.e.v();
    }
}
