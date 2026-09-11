package androidx.media3.extractor.jpeg;

import androidx.compose.foundation.gestures.y2;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.util.w;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.mp4.m;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.text.j;
import com.google.common.collect.a1;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public p b;
    public int c;
    public int d;
    public int e;
    public androidx.media3.extractor.metadata.b g;
    public o h;
    public y2 i;
    public m j;
    public final w a = new w(2);
    public long f = -1;

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        String strU;
        k kVar = (k) oVar;
        w wVar = this.a;
        wVar.J(2);
        kVar.e(wVar.a, 0, 2, false);
        if (wVar.G() == 65496) {
            while (true) {
                wVar.J(2);
                kVar.e(wVar.a, 0, 2, false);
                int iG = wVar.G();
                this.d = iG;
                if (iG == 65498) {
                    break;
                }
                wVar.J(2);
                kVar.x(wVar.a, 0, 2);
                int iG2 = wVar.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    kVar.a(iG2, false);
                } else {
                    wVar.J(iG2);
                    kVar.e(wVar.a, 0, iG2, false);
                    if (Objects.equals(wVar.u(), "http://ns.adobe.com/xap/1.0/") && (strU = wVar.u()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(c.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            m mVar = this.j;
            mVar.getClass();
            mVar.b(j, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        String strU;
        y2 y2VarA;
        a1 a1Var;
        int i;
        androidx.media3.extractor.metadata.b bVar;
        long j;
        int i2 = this.c;
        long j2 = -1;
        w wVar = this.a;
        if (i2 == 0) {
            wVar.J(2);
            oVar.readFully(wVar.a, 0, 2);
            int iG = wVar.G();
            this.d = iG;
            if (iG == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((iG < 65488 || iG > 65497) && iG != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            wVar.J(2);
            oVar.x(wVar.a, 0, 2);
            this.e = wVar.G() - 2;
            oVar.r(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    org.mozilla.javascript.c.a();
                    return 0;
                }
                if (this.i == null || oVar != this.h) {
                    this.h = oVar;
                    this.i = new y2(oVar, this.f);
                }
                m mVar = this.j;
                mVar.getClass();
                int iC = mVar.c(this.i, rVar);
                if (iC == 1) {
                    rVar.a += this.f;
                }
                return iC;
            }
            long position = oVar.getPosition();
            long j3 = this.f;
            if (position != j3) {
                rVar.a = j3;
                return 1;
            }
            if (!oVar.e(wVar.a, 0, 1, true)) {
                f();
                return 0;
            }
            oVar.n();
            if (this.j == null) {
                this.j = new m(j.g, 8);
            }
            y2 y2Var = new y2(oVar, this.f);
            this.i = y2Var;
            if (!this.j.a(y2Var)) {
                f();
                return 0;
            }
            m mVar2 = this.j;
            long j4 = this.f;
            p pVar = this.b;
            pVar.getClass();
            mVar2.d(new y2(j4, pVar, 3));
            androidx.media3.extractor.metadata.b bVar2 = this.g;
            bVar2.getClass();
            p pVar2 = this.b;
            pVar2.getClass();
            h0 h0VarU = pVar2.u(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
            q qVar = new q();
            qVar.m = i0.p("image/jpeg");
            qVar.k = new androidx.media3.common.h0(bVar2);
            h0VarU.e(new androidx.media3.common.r(qVar));
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            w wVar2 = new w(this.e);
            oVar.readFully(wVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(wVar2.u()) && (strU = wVar2.u()) != null) {
                long length = oVar.getLength();
                if (length == -1) {
                    bVar = null;
                } else {
                    try {
                        y2VarA = c.a(strU);
                    } catch (j0 | NumberFormatException | XmlPullParserException unused) {
                        androidx.media3.common.util.c.t("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        y2VarA = null;
                    }
                    if (y2VarA != null && (i = (a1Var = (a1) y2VarA.z).A) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            b bVar3 = (b) a1Var.get(i3);
                            String str = bVar3.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                length -= bVar3.c;
                                j = 0;
                            } else {
                                j = length - bVar3.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            bVar = null;
                        } else {
                            bVar = new androidx.media3.extractor.metadata.b(j5, j6, y2VarA.y, j7, j8);
                        }
                    } else {
                        bVar = null;
                    }
                }
                this.g = bVar;
                if (bVar != null) {
                    this.f = bVar.d;
                }
            }
        } else {
            oVar.r(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.b = pVar;
    }

    public final void f() {
        p pVar = this.b;
        pVar.getClass();
        pVar.o();
        this.b.g(new s(-9223372036854775807L));
        this.c = 6;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
