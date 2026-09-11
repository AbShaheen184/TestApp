package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public final AssetManager B;
    public Uri C;
    public InputStream D;
    public long E;
    public boolean F;

    public b(Context context) {
        super(false);
        this.B = context.getAssets();
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        this.C = null;
        try {
            try {
                InputStream inputStream = this.D;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.D = null;
                if (this.F) {
                    this.F = false;
                    g();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } catch (Throwable th) {
            this.D = null;
            if (this.F) {
                this.F = false;
                g();
            }
            throw th;
        }
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new a(e, 2000);
                }
            }
            InputStream inputStream = this.D;
            String str = j0.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.E;
                if (j2 != -1) {
                    this.E = j2 - ((long) i3);
                }
                a(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws a {
        try {
            Uri uri = lVar.a;
            long j = lVar.f;
            this.C = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            l();
            InputStream inputStreamOpen = this.B.open(path, 1);
            this.D = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new a(null, 2008);
            }
            long j2 = lVar.g;
            if (j2 != -1) {
                this.E = j2;
            } else {
                long jAvailable = this.D.available();
                this.E = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.E = -1L;
                }
            }
            this.F = true;
            m(lVar);
            return this.E;
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.C;
    }
}
