package androidx.media3.datasource.cache;

import androidx.media3.common.util.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final n a;
    public final long b;
    public final int c;
    public androidx.media3.datasource.l d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public l j;

    public c(n nVar) {
        nVar.getClass();
        this.a = nVar;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            j0.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            n nVar = this.a;
            long j = this.h;
            synchronized (nVar) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    o oVarD = o.d(file, j, nVar.c);
                    oVarD.getClass();
                    g gVarI = nVar.c.I(oVarD.e);
                    gVarI.getClass();
                    com.google.android.material.motion.a.q(gVarI.a(oVarD.y, oVarD.z));
                    long jA = h.a(gVarI.e);
                    if (jA != -1) {
                        com.google.android.material.motion.a.q(oVarD.y + oVarD.z <= jA);
                    }
                    nVar.b(oVarD);
                    try {
                        nVar.c.p0();
                        nVar.notifyAll();
                    } catch (IOException e) {
                        throw new a(e);
                    }
                }
            }
        } catch (Throwable th) {
            j0.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(androidx.media3.datasource.l lVar) {
        File fileE;
        long j = lVar.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.i, this.e);
        n nVar = this.a;
        String str = lVar.h;
        String str2 = j0.a;
        long j2 = lVar.f + this.i;
        synchronized (nVar) {
            try {
                nVar.d();
                g gVarI = nVar.c.I(str);
                gVarI.getClass();
                com.google.android.material.motion.a.q(gVarI.a(j2, jMin));
                if (!nVar.a.exists()) {
                    n.e(nVar.a);
                    nVar.k();
                }
                k kVar = nVar.b;
                if (jMin != -1) {
                    kVar.a(nVar, jMin);
                } else {
                    kVar.getClass();
                }
                File file = new File(nVar.a, Integer.toString(nVar.e.nextInt(10)));
                if (!file.exists()) {
                    n.e(file);
                }
                fileE = o.e(file, gVarI.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = fileE;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            l lVar2 = this.j;
            if (lVar2 == null) {
                this.j = new l(fileOutputStream, this.c);
            } else {
                lVar2.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
