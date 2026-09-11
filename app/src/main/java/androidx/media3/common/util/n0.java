package androidx.media3.common.util;

import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.internal.measurement.sd;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.internal.measurement.zd;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements coil3.util.d, sd {
    public boolean e;

    public n0(androidx.media3.container.u uVar, androidx.media3.container.t tVar) throws androidx.media3.container.s {
        int i = tVar.a;
        ByteBuffer byteBuffer = tVar.b;
        com.google.android.material.motion.a.f(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        v vVar = new v(bArr, iMin);
        if (uVar.a) {
            throw new androidx.media3.container.s();
        }
        if (vVar.f()) {
            this.e = false;
            return;
        }
        int iG = vVar.g(2);
        boolean zF = vVar.f();
        if (uVar.b) {
            throw new androidx.media3.container.s();
        }
        if (!zF) {
            this.e = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : vVar.f();
        vVar.n();
        if (!uVar.d) {
            throw new androidx.media3.container.s();
        }
        if (vVar.f()) {
            if (!uVar.e) {
                throw new androidx.media3.container.s();
            }
            vVar.n();
        }
        if (uVar.c) {
            throw new androidx.media3.container.s();
        }
        if (iG != 3) {
            vVar.n();
        }
        vVar.o(uVar.f);
        if (iG != 2 && iG != 0 && !zF2) {
            vVar.o(3);
        }
        this.e = ((iG == 3 || iG == 0) ? 255 : vVar.g(8)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.sd
    public /* bridge */ /* synthetic */ Object a(rd rdVar) {
        mb mbVarA;
        InputStream inputStreamD = wf.d(rdVar);
        try {
            int i = 4096;
            if (this.e) {
                if (inputStreamD instanceof zd) {
                    long length = ((zd) inputStreamD).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                mbVarA = mb.a(w0.h(inputStreamD, i), true);
            } else {
                mbVarA = mb.a(w0.h(inputStreamD, 4096), false);
            }
            com.google.common.base.b.d(inputStreamD, null);
            return mbVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(inputStreamD, th);
                throw th2;
            }
        }
    }

    public void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
    }

    @Override // coil3.util.d
    public boolean c(coil3.size.h hVar) {
        return this.e;
    }

    @Override // coil3.util.d
    public boolean k() {
        return this.e;
    }

    public /* synthetic */ n0(boolean z) {
        this.e = z;
    }
}
