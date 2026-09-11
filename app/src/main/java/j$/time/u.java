package j$.time;

import j$.time.format.e0;
import j$.time.format.f0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i = this.a - uVar.a;
        return i == 0 ? this.b - uVar.b : i;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.o(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        vVar.d('-');
        vVar.n(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.s(Locale.getDefault(), e0.SMART, null);
    }

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final u Z(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new u(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        return l(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        int i2 = t.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return u();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    public final long u() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (u) localDate.e(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final u c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (u) pVar.g0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.j0(j);
        int i = t.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.j0(i2);
            return Z(this.a, i2);
        }
        if (i == 2) {
            return O(j - u());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.j0(i3);
            return Z(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.j0(i4);
            return Z(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        if (i(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.j0(i5);
        return Z(i5, this.b);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final u d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.u(this, j);
        }
        switch (t.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return R(j);
            case 3:
                return R(Math.multiplyExact(j, 10));
            case 4:
                return R(Math.multiplyExact(j, 100));
            case 5:
                return R(Math.multiplyExact(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(i(aVar), j), aVar);
            default:
                j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final u R(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Z(aVar.b.a(((long) this.a) + j, aVar), this.b);
    }

    public final u O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return Z(aVar.b.a(Math.floorDiv(j2, j3), aVar), ((int) Math.floorMod(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.b) {
            return j$.time.chrono.s.c;
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.MONTHS;
        }
        return super.b(dVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.s(lVar).equals(j$.time.chrono.s.c)) {
            j$.nio.file.k.h("Adjustment only supported on ISO date-time");
            return null;
        }
        return lVar.c(u(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
