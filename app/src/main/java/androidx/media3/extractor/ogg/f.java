package androidx.media3.extractor.ogg;

import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.o;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final w g = new w(255);

    public final boolean a(o oVar, boolean z) throws j0, EOFException {
        boolean zE;
        boolean zE2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        w wVar = this.g;
        wVar.J(27);
        try {
            zE = oVar.e(wVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zE = false;
        }
        if (zE && wVar.B() == 1332176723) {
            if (wVar.z() == 0) {
                this.a = wVar.z();
                this.b = wVar.p();
                wVar.q();
                wVar.q();
                wVar.q();
                int iZ = wVar.z();
                this.c = iZ;
                this.d = iZ + 27;
                wVar.J(iZ);
                try {
                    zE2 = oVar.e(wVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zE2 = false;
                }
                if (zE2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ2 = wVar.z();
                        this.f[i] = iZ2;
                        this.e += iZ2;
                    }
                    return true;
                }
            } else if (!z) {
                throw j0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(o oVar, long j) {
        boolean zE;
        com.google.android.material.motion.a.f(oVar.getPosition() == oVar.f());
        w wVar = this.g;
        wVar.J(4);
        while (true) {
            if (j != -1 && oVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zE = oVar.e(wVar.a, 0, 4, true);
            } catch (EOFException unused) {
                zE = false;
            }
            if (!zE) {
                break;
            }
            wVar.M(0);
            if (wVar.B() == 1332176723) {
                oVar.n();
                return true;
            }
            oVar.r(1);
        }
        do {
            if (j != -1 && oVar.getPosition() >= j) {
                break;
            }
        } while (oVar.i(1) != -1);
        return false;
    }
}
