package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.b
    public final e U(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.m0(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.j0();
        if (i < oVar.e || i >= oVar.f) {
            j$.nio.file.k.h("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(oVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {oVar.l0(iBinarySearch), ((oVar.g + iBinarySearch) % 12) + 1, (i - oVar.d[iBinarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return this.a;
    }

    @Override // j$.time.chrono.b
    public final m W() {
        return r.AH;
    }

    @Override // j$.time.chrono.b
    public final int e0() {
        return this.a.p0(this.b, 12);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.I(this);
        }
        if (!h(pVar)) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = p.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, this.a.n0(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.G(aVar) : j$.time.temporal.s.f(1L, 5L);
        }
        return j$.time.temporal.s.f(1L, e0());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        switch (p.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return Z();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(T() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((Z() - 1) % 7) + 1;
            case 7:
                return T();
            case 8:
                return ((Z() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final q c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) super.c(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.a.G(aVar).b(j, aVar);
        int i = (int) j;
        switch (p.a[aVar.ordinal()]) {
            case 1:
                return k0(this.b, this.c, i);
            case 2:
                return I(Math.min(i, e0()) - Z());
            case 3:
                return I((j - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return I(j - ((long) (((int) Math.floorMod(T() + 3, 7)) + 1)));
            case 5:
                return I(j - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return I(j - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(this.a, j);
            case 8:
                return I((j - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return k0(this.b, i, this.d);
            case 10:
                return O(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return k0(i, this.c, this.d);
            case 12:
                return k0(i, this.c, this.d);
            case 13:
                return k0(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
    }

    public final q k0(int i, int i2, int i3) {
        int iN0 = this.a.n0(i, i2);
        if (i3 > iN0) {
            i3 = iN0;
        }
        return new q(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (q) super.m(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.m mVar) {
        return (q) super.m(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b b0(j$.time.temporal.o oVar) {
        return (q) super.b0(oVar);
    }

    @Override // j$.time.chrono.b
    public final long T() {
        return this.a.m0(this.b, this.c, this.d);
    }

    public final int Z() {
        return this.a.p0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.b
    public final boolean F() {
        return this.a.h0(this.b);
    }

    @Override // j$.time.chrono.d
    public final b R(long j) {
        return j == 0 ? this : k0(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final q O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        o oVar = this.a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= oVar.l0(0) && jFloorDiv <= oVar.l0(oVar.d.length - 1) - 1) {
            return k0((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final q I(long j) {
        return new q(this.a, T() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (q) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (q) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b a(long j, TemporalUnit temporalUnit) {
        return (q) super.a(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return (q) super.a(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }
}
