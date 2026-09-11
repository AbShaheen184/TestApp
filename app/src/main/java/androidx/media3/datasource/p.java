package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.util.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c {
    public RandomAccessFile B;
    public Uri C;
    public long D;
    public boolean E;

    @Override // androidx.media3.datasource.h
    public final void close() {
        this.C = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.B;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.B = null;
                if (this.E) {
                    this.E = false;
                    g();
                }
            } catch (IOException e) {
                throw new o(e, 2000);
            }
        } catch (Throwable th) {
            this.B = null;
            if (this.E) {
                this.E = false;
                g();
            }
            throw th;
        }
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws o {
        if (i2 == 0) {
            return 0;
        }
        long j = this.D;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.B;
            String str = j0.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.D -= (long) i3;
                a(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new o(e, 2000);
        }
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws o {
        Uri uri = lVar.a;
        long j = lVar.f;
        this.C = uri;
        l();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.B = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = lVar.g;
                if (length == -1) {
                    length = this.B.length() - j;
                }
                this.D = length;
                if (length < 0) {
                    throw new o(null, null, 2008);
                }
                this.E = true;
                m(lVar);
                return this.D;
            } catch (IOException e) {
                throw new o(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new o(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbO.append(fragment);
            throw new o(sbO.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new o(e3, 2006);
        } catch (RuntimeException e4) {
            throw new o(e4, 2000);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.C;
    }
}
