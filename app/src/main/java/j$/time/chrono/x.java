package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends d {
    public static final LocalDate d = LocalDate.n0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient y b;
    public final transient int c;

    @Override // j$.time.chrono.b
    public final e U(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public x(LocalDate localDate) {
        if (localDate.j0(d)) {
            j$.nio.file.k.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        y yVarP = y.p(localDate);
        this.b = yVarP;
        this.c = (localDate.a - yVarP.b.a) + 1;
        this.a = localDate;
    }

    public x(y yVar, int i, LocalDate localDate) {
        if (localDate.j0(d)) {
            j$.nio.file.k.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        this.b = yVar;
        this.c = i;
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return v.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.b
    public final m W() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // j$.time.chrono.b
    public final int e0() {
        int iE0;
        y yVarQ = this.b.q();
        if (yVarQ != null) {
            LocalDate localDate = yVarQ.b;
            if (localDate.a == this.a.a) {
                iE0 = localDate.g0() - 1;
            } else {
                iE0 = this.a.e0();
            }
        } else {
            iE0 = this.a.e0();
        }
        return this.c == 1 ? iE0 - (this.b.b.g0() - 1) : iE0;
    }

    @Override // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.u(this);
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
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, this.a.k0());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, e0());
        }
        if (i != 3) {
            return v.c.G(aVar);
        }
        y yVar = this.b;
        int i2 = yVar.b.a;
        y yVarQ = yVar.q();
        return yVarQ != null ? j$.time.temporal.s.f(1L, (yVarQ.b.a - i2) + 1) : j$.time.temporal.s.f(1L, 999999999 - i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        switch (w.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.g0() - this.b.b.g0()) + 1 : localDate.g0();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
            case 8:
                return this.b.a;
            default:
                return this.a.i(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final x c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (i(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                v vVar = v.c;
                int iA = vVar.G(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return k0(this.a.y0(vVar.L(this.b, iA)));
                }
                if (i2 == 8) {
                    return k0(this.a.y0(vVar.L(y.r(iA), this.c)));
                }
                if (i2 == 9) {
                    return k0(this.a.y0(iA));
                }
            }
            return k0(this.a.c(j, pVar));
        }
        return (x) super.c(j, pVar);
    }

    public final x j0(j$.time.d dVar) {
        return (x) super.m(dVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (x) super.m(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.m mVar) {
        return (x) super.m(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b b0(j$.time.temporal.o oVar) {
        return (x) super.b0(oVar);
    }

    @Override // j$.time.chrono.d
    public final b R(long j) {
        return k0(this.a.u0(j));
    }

    @Override // j$.time.chrono.d
    public final b O(long j) {
        return k0(this.a.s0(j));
    }

    @Override // j$.time.chrono.d
    public final b I(long j) {
        return k0(this.a.r0(j));
    }

    public final x Z(long j, ChronoUnit chronoUnit) {
        return (x) super.d(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (x) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (x) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b a(long j, TemporalUnit temporalUnit) {
        return (x) super.a(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return (x) super.a(j, temporalUnit);
    }

    public final x k0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
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
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }
}
