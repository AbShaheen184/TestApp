package androidx.media3.extractor.ogg;

import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.r0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import com.google.android.gms.common.internal.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {
    public p a;
    public i b;
    public boolean c;

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        try {
            return f(oVar);
        } catch (j0 unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        i iVar = this.b;
        if (iVar != null) {
            e eVar = iVar.a;
            f fVar = eVar.a;
            fVar.a = 0;
            fVar.b = 0L;
            fVar.c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.b.J(0);
            eVar.c = -1;
            eVar.e = false;
            if (j == 0) {
                iVar.d(!iVar.l);
                return;
            }
            if (iVar.h != 0) {
                long j3 = (((long) iVar.i) * j2) / 1000000;
                iVar.e = j3;
                g gVar = iVar.d;
                String str = androidx.media3.common.util.j0.a;
                gVar.q(j3);
                iVar.h = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!f(oVar)) {
                throw j0.a(null, "Failed to determine bitstream type");
            }
            oVar.n();
        }
        if (!this.c) {
            h0 h0VarU = this.a.u(0, 1);
            this.a.o();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = h0VarU;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        iVar2.b.getClass();
        String str = androidx.media3.common.util.j0.a;
        int i = iVar2.h;
        int i2 = -1;
        int i3 = 3;
        if (i != 0) {
            if (i == 1) {
                oVar.r((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                org.mozilla.javascript.c.a();
                return 0;
            }
            long jF = iVar2.d.f(oVar);
            if (jF >= 0) {
                rVar.a = jF;
                return 1;
            }
            if (jF < -1) {
                iVar2.a(-(jF + 2));
            }
            if (!iVar2.l) {
                a0 a0VarL = iVar2.d.l();
                a0VarL.getClass();
                iVar2.c.g(a0VarL);
                iVar2.b.d(a0VarL.g());
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(oVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            w wVar = eVar.b;
            long jB = iVar2.b(wVar);
            if (jB >= 0) {
                long j = iVar2.g;
                if (j + jB >= iVar2.e) {
                    long j2 = (j * 1000000) / ((long) iVar2.i);
                    iVar2.b.f(wVar.c, wVar);
                    iVar2.b.g(j2, 1, wVar.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += jB;
            return 0;
        }
        while (true) {
            boolean zB = eVar.b(oVar);
            w wVar2 = eVar.b;
            if (!zB) {
                iVar2.h = i3;
                return i2;
            }
            long position = oVar.getPosition();
            long j3 = iVar2.f;
            iVar2.k = position - j3;
            if (!iVar2.c(wVar2, j3, iVar2.j)) {
                androidx.media3.common.r rVar2 = (androidx.media3.common.r) iVar2.j.y;
                iVar2.i = rVar2.H;
                if (!iVar2.m) {
                    iVar2.b.e(rVar2);
                    iVar2.m = true;
                }
                r0 r0Var = (r0) iVar2.j.z;
                if (r0Var == null) {
                    if (oVar.getLength() == -1) {
                        iVar2.d = new k(19);
                    } else {
                        f fVar = eVar.a;
                        iVar2.d = new b(iVar2, iVar2.f, oVar.getLength(), fVar.d + fVar.e, fVar.b, (fVar.a & 4) != 0);
                    }
                    iVar2.h = 2;
                    bArr = wVar2.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    wVar2.K(Arrays.copyOf(bArr, Math.max(65025, wVar2.c)), wVar2.c);
                    return 0;
                }
                iVar2.d = r0Var;
                iVar2.h = 2;
                bArr = wVar2.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                wVar2.K(Arrays.copyOf(bArr, Math.max(65025, wVar2.c)), wVar2.c);
                return 0;
            }
            iVar2.f = oVar.getPosition();
            i2 = -1;
            i3 = 3;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.a = pVar;
    }

    public final boolean f(o oVar) {
        boolean zW;
        f fVar = new f();
        if (fVar.a(oVar, true) && (fVar.a & 2) == 2) {
            int iMin = Math.min(fVar.e, 8);
            w wVar = new w(iMin);
            oVar.x(wVar.a, 0, iMin);
            wVar.M(0);
            if (wVar.a() >= 5 && wVar.z() == 127 && wVar.B() == 1179402563) {
                this.b = new c();
                return true;
            }
            wVar.M(0);
            try {
                zW = androidx.media3.extractor.b.w(1, wVar, true);
            } catch (j0 unused) {
                zW = false;
            }
            if (zW) {
                this.b = new j();
            } else {
                wVar.M(0);
                if (h.e(wVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
