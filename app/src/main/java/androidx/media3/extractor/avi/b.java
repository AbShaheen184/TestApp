package androidx.media3.extractor.avi;

import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.container.j;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import com.google.android.gms.common.internal.k;
import com.google.common.collect.e0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public final k d;
    public int e;
    public c g;
    public long j;
    public e k;
    public int o;
    public boolean p;
    public final boolean c = true;
    public final w a = new w(12);
    public final j b = new j();
    public p f = new com.google.firebase.heartbeatinfo.e();
    public e[] i = new e[0];
    public long m = -1;
    public long n = -1;
    public int l = -1;
    public long h = -9223372036854775807L;

    public b(k kVar) {
        this.d = kVar;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        w wVar = this.a;
        oVar.x(wVar.a, 0, 12);
        wVar.M(0);
        if (wVar.o() != 1179011410) {
            return false;
        }
        wVar.N(4);
        return wVar.o() == 541677121;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            if (eVar.k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.n[j0.f(eVar.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x039a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws androidx.media3.common.j0 {
        boolean z;
        e eVar;
        int i;
        e eVar2;
        if (this.j != -1) {
            long position = oVar.getPosition();
            long j = this.j;
            if (j < position || j > 262144 + position) {
                rVar.a = j;
                z = true;
            } else {
                oVar.r((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.e;
        int i3 = 4;
        e eVar3 = null;
        j jVar = this.b;
        w wVar = this.a;
        switch (i2) {
            case 0:
                if (!a(oVar)) {
                    throw androidx.media3.common.j0.a(null, "AVI Header List not found");
                }
                oVar.r(12);
                this.e = 1;
                return 0;
            case 1:
                oVar.readFully(wVar.a, 0, 12);
                wVar.M(0);
                jVar.getClass();
                jVar.a = wVar.o();
                jVar.b = wVar.o();
                jVar.c = 0;
                if (jVar.a != 1414744396) {
                    throw androidx.media3.common.j0.a(null, "LIST expected, found: " + jVar.a);
                }
                int iO = wVar.o();
                jVar.c = iO;
                if (iO == 1819436136) {
                    this.l = jVar.b;
                    this.e = 2;
                    return 0;
                }
                throw androidx.media3.common.j0.a(null, "hdrl expected, found: " + jVar.c);
            case 2:
                int i4 = this.l - 4;
                w wVar2 = new w(i4);
                oVar.readFully(wVar2.a, 0, i4);
                f fVarC = f.c(1819436136, wVar2);
                int i5 = fVarC.b;
                if (i5 != 1819436136) {
                    throw androidx.media3.common.j0.a(null, "Unexpected header list type " + i5);
                }
                c cVar = (c) fVarC.b(c.class);
                if (cVar == null) {
                    throw androidx.media3.common.j0.a(null, "AviHeader not found");
                }
                this.g = cVar;
                this.h = ((long) cVar.c) * ((long) cVar.a);
                ArrayList arrayList = new ArrayList();
                e0 e0VarListIterator = fVarC.a.listIterator(0);
                int i6 = 0;
                while (e0VarListIterator.hasNext()) {
                    a aVar = (a) e0VarListIterator.next();
                    if (aVar.a() == 1819440243) {
                        f fVar = (f) aVar;
                        int i7 = i6 + 1;
                        d dVar = (d) fVar.b(d.class);
                        g gVar = (g) fVar.b(g.class);
                        if (dVar == null) {
                            androidx.media3.common.util.c.t("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            androidx.media3.common.util.c.t("AviExtractor", "Missing Stream Format");
                        } else {
                            long j2 = dVar.d;
                            long j3 = 1000000 * ((long) dVar.b);
                            long j4 = dVar.c;
                            String str = j0.a;
                            long jY = j0.Y(j2, j3, j4, RoundingMode.DOWN);
                            androidx.media3.common.r rVar2 = gVar.a;
                            q qVarA = rVar2.a();
                            qVarA.a = Integer.toString(i6);
                            int i8 = dVar.e;
                            if (i8 != 0) {
                                qVarA.o = i8;
                            }
                            h hVar = (h) fVar.b(h.class);
                            if (hVar != null) {
                                qVarA.b = hVar.a;
                            }
                            int i9 = i0.i(rVar2.o);
                            if (i9 == 1 || i9 == 2) {
                                h0 h0VarU = this.f.u(i6, i9);
                                h0VarU.e(new androidx.media3.common.r(qVarA));
                                h0VarU.d(jY);
                                this.h = Math.max(this.h, jY);
                                eVar = new e(i6, dVar, h0VarU);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i6 = i7;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i6 = i7;
                    }
                }
                this.i = (e[]) arrayList.toArray(new e[0]);
                this.f.o();
                this.e = 3;
                return 0;
            case 3:
                if (this.m != -1) {
                    long position2 = oVar.getPosition();
                    long j5 = this.m;
                    if (position2 != j5) {
                        this.j = j5;
                        return 0;
                    }
                }
                oVar.x(wVar.a, 0, 12);
                oVar.n();
                wVar.M(0);
                jVar.getClass();
                jVar.a = wVar.o();
                jVar.b = wVar.o();
                jVar.c = 0;
                int iO2 = wVar.o();
                int i10 = jVar.a;
                if (i10 == 1179011410) {
                    oVar.r(12);
                    return 0;
                }
                if (i10 != 1414744396 || iO2 != 1769369453) {
                    this.j = oVar.getPosition() + ((long) jVar.b) + 8;
                    return 0;
                }
                long position3 = oVar.getPosition();
                this.m = position3;
                this.n = position3 + ((long) jVar.b) + 8;
                if (!this.p) {
                    c cVar2 = this.g;
                    cVar2.getClass();
                    if ((cVar2.b & 16) == 16) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.g(new s(this.h));
                    this.p = true;
                }
                this.j = oVar.getPosition() + 12;
                this.e = 6;
                return 0;
            case 4:
                oVar.readFully(wVar.a, 0, 8);
                wVar.M(0);
                int iO3 = wVar.o();
                int iO4 = wVar.o();
                if (iO3 != 829973609) {
                    this.j = oVar.getPosition() + ((long) iO4);
                    return 0;
                }
                this.e = 5;
                this.o = iO4;
                return 0;
            case 5:
                w wVar3 = new w(this.o);
                oVar.readFully(wVar3.a, 0, this.o);
                long j6 = 0;
                if (wVar3.a() >= 16) {
                    int i11 = wVar3.b;
                    wVar3.N(8);
                    long jO = wVar3.o();
                    long j7 = this.m;
                    j6 = jO <= j7 ? j7 + 8 : 0L;
                    wVar3.M(i11);
                }
                while (wVar3.a() >= 16) {
                    int iO5 = wVar3.o();
                    int iO6 = wVar3.o();
                    long jO2 = ((long) wVar3.o()) + j6;
                    wVar3.N(i3);
                    e[] eVarArr = this.i;
                    int length = eVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            eVar2 = eVarArr[i12];
                            if (eVar2.c != iO5 && eVar2.d != iO5) {
                                i12++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        boolean z2 = (iO6 & 16) == 16;
                        if (eVar2.l == -1) {
                            eVar2.l = jO2;
                        }
                        if (z2) {
                            if (eVar2.k == eVar2.n.length) {
                                long[] jArr = eVar2.m;
                                eVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.n;
                                eVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.m;
                            int i13 = eVar2.k;
                            jArr2[i13] = jO2;
                            eVar2.n[i13] = eVar2.j;
                            eVar2.k = i13 + 1;
                        }
                        eVar2.j++;
                    }
                    i3 = 4;
                }
                for (e eVar4 : this.i) {
                    eVar4.m = Arrays.copyOf(eVar4.m, eVar4.k);
                    eVar4.n = Arrays.copyOf(eVar4.n, eVar4.k);
                    if ((eVar4.c & 1651965952) == 1651965952 && eVar4.a.f != 0 && (i = eVar4.k) > 0) {
                        eVar4.f = i;
                    }
                }
                this.p = true;
                int length2 = this.i.length;
                p pVar = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    pVar.g(new s(j8));
                } else {
                    pVar.g(new s(this, j8, 2));
                }
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                if (oVar.getPosition() >= this.n) {
                    return -1;
                }
                e eVar5 = this.k;
                if (eVar5 != null) {
                    int i14 = eVar5.h;
                    int iA = i14 - eVar5.b.a(oVar, i14, false);
                    eVar5.h = iA;
                    boolean z3 = iA == 0;
                    if (z3) {
                        if (eVar5.g > 0) {
                            h0 h0Var = eVar5.b;
                            int i15 = eVar5.i;
                            h0Var.g((eVar5.e * ((long) i15)) / ((long) eVar5.f), Arrays.binarySearch(eVar5.n, i15) >= 0 ? 1 : 0, eVar5.g, 0, null);
                        }
                        eVar5.i++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((oVar.getPosition() & 1) == 1) {
                    oVar.r(1);
                }
                oVar.x(wVar.a, 0, 12);
                wVar.M(0);
                int iO7 = wVar.o();
                if (iO7 == 1414744396) {
                    wVar.M(8);
                    oVar.r(wVar.o() == 1769369453 ? 12 : 8);
                    oVar.n();
                    return 0;
                }
                int iO8 = wVar.o();
                if (iO7 == 1263424842) {
                    this.j = oVar.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                oVar.r(8);
                oVar.n();
                for (e eVar6 : this.i) {
                    if (eVar6.c == iO7 || eVar6.d == iO7) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.j = oVar.getPosition() + ((long) iO8);
                            return 0;
                        }
                        eVar3.g = iO8;
                        eVar3.h = iO8;
                        this.k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.j = oVar.getPosition() + ((long) iO8);
                    return 0;
                }
                eVar3.g = iO8;
                eVar3.h = iO8;
                this.k = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.e = 0;
        if (this.c) {
            pVar = new b1(pVar, this.d);
        }
        this.f = pVar;
        this.j = -1L;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
