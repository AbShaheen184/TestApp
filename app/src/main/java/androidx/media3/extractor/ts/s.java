package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.extractor.h0;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h {
    public final String a;
    public final int b;
    public final androidx.media3.common.util.w c;
    public final androidx.media3.common.util.v d;
    public h0 e;
    public String f;
    public androidx.media3.common.r g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public s(String str, int i) {
        this.a = str;
        this.b = i;
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.c = wVar;
        byte[] bArr = wVar.a;
        this.d = new androidx.media3.common.util.v(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) throws j0 {
        int iG;
        boolean zF;
        this.e.getClass();
        while (wVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    androidx.media3.common.util.w wVar2 = this.c;
                    androidx.media3.common.util.v vVar = this.d;
                    if (i == 2) {
                        int iZ = ((this.k & (-225)) << 8) | wVar.z();
                        this.j = iZ;
                        if (iZ > wVar2.a.length) {
                            wVar2.J(iZ);
                            byte[] bArr = wVar2.a;
                            vVar.getClass();
                            vVar.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            org.mozilla.javascript.c.a();
                            return;
                        }
                        int iMin = Math.min(wVar.a(), this.j - this.i);
                        wVar.k(vVar.b, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            vVar.m(0);
                            if (vVar.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = vVar.g(1);
                                int iG3 = iG2 == 1 ? vVar.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw j0.a(null, null);
                                }
                                if (iG2 == 1) {
                                    vVar.g((vVar.g(2) + 1) * 8);
                                }
                                if (!vVar.f()) {
                                    throw j0.a(null, null);
                                }
                                this.o = vVar.g(6);
                                int iG4 = vVar.g(4);
                                int iG5 = vVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw j0.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = vVar.e();
                                    int iB = vVar.b();
                                    androidx.media3.extractor.a aVarN = androidx.media3.extractor.b.n(vVar, true);
                                    this.v = aVarN.a;
                                    this.s = aVarN.b;
                                    this.u = aVarN.c;
                                    int iB2 = iB - vVar.b();
                                    vVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    vVar.h(bArr2, iB2);
                                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                                    qVar.a = this.f;
                                    qVar.m = i0.p("video/mp2t");
                                    qVar.n = i0.p("audio/mp4a-latm");
                                    qVar.j = this.v;
                                    qVar.F = this.u;
                                    qVar.G = this.s;
                                    qVar.q = Collections.singletonList(bArr2);
                                    qVar.d = this.a;
                                    qVar.f = this.b;
                                    androidx.media3.common.r rVar = new androidx.media3.common.r(qVar);
                                    if (!rVar.equals(this.g)) {
                                        this.g = rVar;
                                        this.t = 1024000000 / ((long) rVar.H);
                                        this.e.e(rVar);
                                    }
                                } else {
                                    int iG6 = vVar.g((vVar.g(2) + 1) * 8);
                                    int iB3 = vVar.b();
                                    androidx.media3.extractor.a aVarN2 = androidx.media3.extractor.b.n(vVar, true);
                                    this.v = aVarN2.a;
                                    this.s = aVarN2.b;
                                    this.u = aVarN2.c;
                                    vVar.o(iG6 - (iB3 - vVar.b()));
                                }
                                int iG7 = vVar.g(3);
                                this.p = iG7;
                                if (iG7 == 0) {
                                    vVar.o(8);
                                } else if (iG7 == 1) {
                                    vVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    vVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        org.mozilla.javascript.c.a();
                                        return;
                                    }
                                    vVar.o(1);
                                }
                                boolean zF2 = vVar.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = vVar.g((vVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = vVar.f();
                                            this.r = (this.r << 8) + ((long) vVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (vVar.f()) {
                                    vVar.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw j0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw j0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw j0.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = vVar.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = vVar.e();
                            if ((iE2 & 7) == 0) {
                                wVar2.M(iE2 >> 3);
                            } else {
                                vVar.h(wVar2.a, i3 * 8);
                                wVar2.M(0);
                            }
                            this.e.f(i3, wVar2);
                            com.google.android.material.motion.a.q(this.l != -9223372036854775807L);
                            this.e.g(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                vVar.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iZ2 = wVar.z();
                    if ((iZ2 & LibretroCore.SCREEN_HEIGHT) == 224) {
                        this.k = iZ2;
                        this.h = 2;
                    } else if (iZ2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (wVar.z() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.e = pVar.u(e0Var.d, 1);
        e0Var.b();
        this.f = e0Var.e;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
    }
}
