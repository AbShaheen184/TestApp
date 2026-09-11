package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import org.mozilla.javascript.Token;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.m, j$.time.chrono.b, Serializable {
    public static final LocalDate d = n0(-999999999, 1, 1);
    public static final LocalDate e = n0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        n0(1970, 1, 1);
    }

    public static LocalDate n0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.j0(i);
        j$.time.temporal.a.MONTH_OF_YEAR.j0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.j0(i3);
        return I(i, i2, i3);
    }

    public static LocalDate p0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.j0(j);
        j$.time.temporal.a.DAY_OF_YEAR.j0(i2);
        boolean zH0 = j$.time.chrono.s.c.h0(j);
        if (i2 == 366 && !zH0) {
            j$.nio.file.k.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        k kVarR = k.R(((i2 - 1) / 31) + 1);
        if (i2 > (kVarR.I(zH0) + kVarR.u(zH0)) - 1) {
            kVarR = k.a[((((int) 1) + 12) + kVarR.ordinal()) % 12];
        }
        return new LocalDate(i, kVarR.getValue(), (i2 - kVarR.u(zH0)) + 1);
    }

    public static LocalDate o0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.j0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / Token.SETPROP_OP;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate O(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.q.f);
        if (localDate != null) {
            return localDate;
        }
        j$.nio.file.k.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new d(1));
    }

    public static LocalDate I(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.c.h0(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    j$.nio.file.k.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new DateTimeException("Invalid date '" + k.R(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate v0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.s.c.h0((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate m0(a aVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return o0(Math.floorDiv(instantOfEpochMilli.a + ((long) zoneId.I().d(instantOfEpochMilli).b), 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.I(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, k0());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, e0());
        }
        if (i == 3) {
            return j$.time.temporal.s.f(1L, (k.R(this.b) != k.FEBRUARY || F()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.b;
        }
        return this.a <= 0 ? j$.time.temporal.s.f(1L, 1000000000L) : j$.time.temporal.s.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return R(pVar);
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return T();
            }
            if (pVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return R(pVar);
            }
            return ((((long) this.a) * 12) + ((long) this.b)) - 1;
        }
        return pVar.Z(this);
    }

    public final int R(j$.time.temporal.p pVar) {
        switch (f.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return g0();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return Z().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((g0() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((g0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l f() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m W() {
        return this.a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int g0() {
        return (k.R(this.b).u(F()) + this.c) - 1;
    }

    public final c Z() {
        return c.u(((int) Math.floorMod(T() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.b
    public final boolean F() {
        return j$.time.chrono.s.c.h0(this.a);
    }

    public final int k0() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return F() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int e0() {
        return F() ? 366 : 365;
    }

    @Override // j$.time.chrono.b
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate m(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return (LocalDate) mVar;
        }
        return (LocalDate) mVar.e(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDate) pVar.g0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.j0(j);
        switch (f.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return n0(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (g0() != i2) {
                    return p0(this.a, i2);
                }
                return this;
            case 3:
                return t0(j - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return y0((int) j);
            case 5:
                return r0(j - ((long) Z().getValue()));
            case 6:
                return r0(j - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return r0(j - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return o0(j);
            case 9:
                return t0(j - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.j0(i3);
                    return v0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return s0(j - (((((long) this.a) * 12) + ((long) this.b)) - 1));
            case 12:
                return y0((int) j);
            case 13:
                if (i(j$.time.temporal.a.ERA) != j) {
                    return y0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
    }

    public final LocalDate y0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.j0(i);
        return v0(i, this.b, this.c);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b b0(j$.time.temporal.o oVar) {
        if (oVar != null) {
            p pVar = (p) oVar;
            return s0((((long) pVar.a) * 12) + ((long) pVar.b)).r0(pVar.c);
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (LocalDate) ((p) oVar).u(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.u(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return r0(j);
            case 2:
                return t0(j);
            case 3:
                return s0(j);
            case 4:
                return u0(j);
            case 5:
                return u0(Math.multiplyExact(j, 10));
            case 6:
                return u0(Math.multiplyExact(j, 100));
            case 7:
                return u0(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(i(aVar), j), aVar);
            default:
                j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final LocalDate u0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return v0(aVar.b.a(((long) this.a) + j, aVar), this.b, this.c);
    }

    public final LocalDate s0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return v0(aVar.b.a(Math.floorDiv(j2, j3), aVar), ((int) Math.floorMod(j2, j3)) + 1, this.c);
    }

    public final LocalDate t0(long j) {
        return r0(Math.multiplyExact(j, 7));
    }

    public final LocalDate r0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jK0 = k0();
                if (j2 <= jK0) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jK0));
                }
                j$.time.temporal.a.YEAR.j0(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jK0));
            }
        }
        return o0(Math.addExact(T(), j));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        return dVar == j$.time.temporal.q.f ? this : super.b(dVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e U(i iVar) {
        return LocalDateTime.R(this, iVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.R(this, i.g);
    }

    @Override // j$.time.chrono.b
    public final long T() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !F() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return u((LocalDate) bVar);
        }
        return super.compareTo(bVar);
    }

    public final int u(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean j0(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return u((LocalDate) bVar) < 0;
        }
        return T() < bVar.T();
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && u((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
