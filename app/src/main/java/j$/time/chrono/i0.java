package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.b
    public final e U(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public i0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return g0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        g0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.b
    public final m W() {
        return Z() >= 1 ? j0.BE : j0.BEFORE_BE;
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
        int i = h0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(pVar);
        }
        if (i != 4) {
            return g0.c.G(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.f(1L, Z() <= 0 ? (-(sVar.a + 543)) + 1 : 543 + sVar.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = h0.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 4) {
                int iZ = Z();
                if (iZ < 1) {
                    iZ = 1 - iZ;
                }
                return iZ;
            }
            if (i == 5) {
                return ((((long) Z()) * 12) + ((long) this.a.b)) - 1;
            }
            if (i == 6) {
                return Z();
            }
            if (i != 7) {
                return this.a.i(pVar);
            }
            return Z() < 1 ? 0 : 1;
        }
        return pVar.Z(this);
    }

    public final int Z() {
        return this.a.a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final i0 c(long j, j$.time.temporal.p pVar) {
        int iA;
        int i;
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (i(aVar) == j) {
                return this;
            }
            int[] iArr = h0.a;
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                iA = g0.c.G(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    LocalDate localDate = this.a;
                    if (Z() < 1) {
                        iA = 1 - iA;
                    }
                    return j0(localDate.y0(iA - 543));
                }
                if (i != 6) {
                    return j0(this.a.y0(iA - 543));
                }
                if (i == 7) {
                    return j0(this.a.y0((-542) - Z()));
                }
            } else {
                if (i2 == 5) {
                    g0.c.G(aVar).b(j, aVar);
                    long jZ = ((long) Z()) * 12;
                    LocalDate localDate2 = this.a;
                    return j0(localDate2.s0(j - ((jZ + ((long) localDate2.b)) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                    iA = g0.c.G(aVar).a(j, aVar);
                    i = iArr[aVar.ordinal()];
                    if (i != 4) {
                        LocalDate localDate3 = this.a;
                        if (Z() < 1) {
                            iA = 1 - iA;
                        }
                        return j0(localDate3.y0(iA - 543));
                    }
                    if (i != 6) {
                        return j0(this.a.y0(iA - 543));
                    }
                    if (i == 7) {
                        return j0(this.a.y0((-542) - Z()));
                    }
                }
            }
            return j0(this.a.c(j, pVar));
        }
        return (i0) super.c(j, pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (i0) super.m(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.m mVar) {
        return (i0) super.m(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b b0(j$.time.temporal.o oVar) {
        return (i0) super.b0(oVar);
    }

    @Override // j$.time.chrono.d
    public final b R(long j) {
        return j0(this.a.u0(j));
    }

    @Override // j$.time.chrono.d
    public final b O(long j) {
        return j0(this.a.s0(j));
    }

    @Override // j$.time.chrono.d
    public final b I(long j) {
        return j0(this.a.r0(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (i0) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (i0) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b a(long j, TemporalUnit temporalUnit) {
        return (i0) super.a(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return (i0) super.a(j, temporalUnit);
    }

    public final i0 j0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new i0(localDate);
    }

    @Override // j$.time.chrono.b
    public final long T() {
        return this.a.T();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.a.equals(((i0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 8, this);
    }
}
