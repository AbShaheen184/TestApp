package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.extractor.h0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public g(List list) {
        this.a = 0;
        this.f = list;
        this.g = new h0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (wVar.z() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (wVar.a() == 0) {
                            z = false;
                        } else {
                            if (wVar.z() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = wVar.b;
                    int iA = wVar.a();
                    for (h0 h0Var : (h0[]) this.g) {
                        wVar.M(i);
                        h0Var.f(iA, wVar);
                    }
                    this.e += iA;
                }
                break;
            default:
                androidx.media3.common.util.w wVar2 = (androidx.media3.common.util.w) this.f;
                ((h0) this.g).getClass();
                if (this.b) {
                    int iA2 = wVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(wVar.a, wVar.b, wVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            wVar2.M(0);
                            if (73 == wVar2.z() && 68 == wVar2.z() && 51 == wVar2.z()) {
                                wVar2.N(3);
                                this.d = wVar2.y() + 10;
                            } else {
                                androidx.media3.common.util.c.t("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((h0) this.g).f(iMin2, wVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    com.google.android.material.motion.a.q(this.c != -9223372036854775807L);
                    for (h0 h0Var : (h0[]) this.g) {
                        h0Var.g(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((h0) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    com.google.android.material.motion.a.q(this.c != -9223372036854775807L);
                    ((h0) this.g).g(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.g;
                for (int i = 0; i < h0VarArr.length; i++) {
                    d0 d0Var = (d0) ((List) this.f).get(i);
                    e0Var.a();
                    e0Var.b();
                    h0 h0VarU = pVar.u(e0Var.d, 3);
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    e0Var.b();
                    qVar.a = e0Var.e;
                    qVar.m = i0.p("video/mp2t");
                    qVar.n = i0.p("application/dvbsubs");
                    qVar.q = Collections.singletonList(d0Var.b);
                    qVar.d = d0Var.a;
                    h0VarU.e(new androidx.media3.common.r(qVar));
                    h0VarArr[i] = h0VarU;
                }
                break;
            default:
                e0Var.a();
                e0Var.b();
                h0 h0VarU2 = pVar.u(e0Var.d, 5);
                this.g = h0VarU2;
                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                e0Var.b();
                qVar2.a = e0Var.e;
                qVar2.m = i0.p("video/mp2t");
                qVar2.n = i0.p("application/id3");
                h0VarU2.e(new androidx.media3.common.r(qVar2));
                break;
        }
    }

    public g() {
        this.a = 1;
        this.f = new androidx.media3.common.util.w(10);
        this.c = -9223372036854775807L;
    }
}
