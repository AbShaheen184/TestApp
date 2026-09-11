package j$.time.format;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {
    public static final LocalDate h = LocalDate.n0(2000, 1, 1);
    public final j$.time.chrono.b g;

    @Override // j$.time.format.j
    public final boolean b(w wVar) {
        if (wVar.c) {
            return super.b(wVar);
        }
        return false;
    }

    public p(j$.time.temporal.p pVar, int i, int i2, j$.time.chrono.b bVar, int i3) {
        super(pVar, i, i2, f0.NOT_NEGATIVE, i3);
        this.g = bVar;
    }

    @Override // j$.time.format.j
    public final long a(y yVar, long j) {
        long jAbs = Math.abs(j);
        j$.time.chrono.b bVar = this.g;
        long jG = bVar != null ? j$.time.chrono.l.s(yVar.a).P(bVar).g(this.a) : 0;
        long[] jArr = j.f;
        if (j >= jG) {
            long j2 = jArr[this.b];
            if (j < jG + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final int c(w wVar, long j, int i, int i2) {
        final p pVar;
        final w wVar2;
        final long j2;
        final int i3;
        final int i4;
        int iG;
        long j3;
        j$.time.chrono.b bVar = this.g;
        if (bVar != null) {
            iG = wVar.d().P(bVar).g(this.a);
            pVar = this;
            wVar2 = wVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.c(wVar2, j2, i3, i4);
                }
            };
            if (wVar2.e == null) {
                wVar2.e = new ArrayList();
            }
            wVar2.e.add(consumer);
        } else {
            pVar = this;
            wVar2 = wVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            iG = 0;
        }
        int i5 = i4 - i3;
        int i6 = pVar.b;
        if (i5 != i6 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = j.f[i6];
            long j5 = iG;
            long j6 = j5 - (j5 % j4);
            long j7 = iG > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j7 + j4 : j7;
        }
        return wVar2.g(pVar.a, j3, i3, i4);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new p(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        j$.time.chrono.b bVar = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (bVar != null ? bVar : 0) + ")";
    }
}
