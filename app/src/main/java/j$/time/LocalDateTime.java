package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = R(LocalDate.d, i.e);
    public static final LocalDateTime d = R(LocalDate.e, i.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final i b;

    public static LocalDateTime now() {
        a aVarY = j$.desugar.sun.nio.fs.g.y();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return Z(instantOfEpochMilli.a, instantOfEpochMilli.b, aVarY.a.I().d(instantOfEpochMilli));
    }

    @Override // j$.time.chrono.e
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime N(ZoneId zoneId) {
        return ZonedDateTime.I(this, zoneId, null);
    }

    public static LocalDateTime R(LocalDate localDate, i iVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(localDate, iVar);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return Z(instant.a, instant.b, zoneId.I().d(instant));
    }

    public static LocalDateTime Z(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.j0(j2);
        long j3 = j + ((long) zoneOffset.b);
        long j4 = 86400;
        return new LocalDateTime(LocalDate.o0(Math.floorDiv(j3, j4)), i.g0((((long) ((int) Math.floorMod(j3, j4))) * 1000000000) + j2));
    }

    public static LocalDateTime I(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(LocalDate.O(temporalAccessor), i.O(temporalAccessor));
            } catch (DateTimeException e) {
                j$.nio.file.k.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                return null;
            }
        }
        return ((ZonedDateTime) temporalAccessor).a;
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.a(charSequence, new d(2));
    }

    public LocalDateTime(LocalDate localDate, i iVar) {
        this.a = localDate;
        this.b = iVar;
    }

    public final LocalDateTime n0(LocalDate localDate, i iVar) {
        return (this.a == localDate && this.b == iVar) ? this : new LocalDateTime(localDate, iVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.k0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() ? this.b.l(pVar) : this.a.l(pVar);
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() ? this.b.g(pVar) : this.a.g(pVar);
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() ? this.b.i(pVar) : this.a.i(pVar);
        }
        return pVar.Z(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b n() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final i j() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return n0(localDate, this.b);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean zK0 = ((j$.time.temporal.a) pVar).k0();
            LocalDate localDate = this.a;
            if (zK0) {
                return n0(localDate, this.b.c(j, pVar));
            }
            return n0(localDate.c(j, pVar), this.b);
        }
        return (LocalDateTime) pVar.g0(this, j);
    }

    public LocalDateTime truncatedTo(TemporalUnit temporalUnit) {
        LocalDate localDate = this.a;
        i iVarG0 = this.b;
        iVarG0.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() > 86400) {
                throw new j$.time.temporal.r("Unit is too large to be used for truncation");
            }
            long j = duration.a;
            long j2 = duration.b;
            if (j < 0) {
                j++;
                j2 -= 1000000000;
            }
            long jAddExact = Math.addExact(Math.multiplyExact(j, 1000000000L), j2);
            if (86400000000000L % jAddExact != 0) {
                throw new j$.time.temporal.r("Unit must divide into a standard day without remainder");
            }
            iVarG0 = i.g0((iVarG0.p0() / jAddExact) * jAddExact);
        }
        return n0(localDate, iVarG0);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.u(this, j);
        }
        switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return l0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeJ0 = j0(j / 86400000000L);
                return localDateTimeJ0.l0(localDateTimeJ0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeJ1 = j0(j / 86400000);
                return localDateTimeJ1.l0(localDateTimeJ1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return k0(j);
            case 5:
                return l0(this.a, 0L, j, 0L, 0L);
            case 6:
                return l0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeJ2 = j0(j / 256);
                return localDateTimeJ2.l0(localDateTimeJ2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return n0(this.a.d(j, temporalUnit), this.b);
        }
    }

    public LocalDateTime minusYears(long j) {
        LocalDate localDate = this.a;
        if (j == Long.MIN_VALUE) {
            LocalDateTime localDateTimeN0 = n0(localDate.u0(Long.MAX_VALUE), this.b);
            return localDateTimeN0.n0(localDateTimeN0.a.u0(1L), localDateTimeN0.b);
        }
        return n0(localDate.u0(-j), this.b);
    }

    public final LocalDateTime j0(long j) {
        return n0(this.a.r0(j), this.b);
    }

    public final LocalDateTime k0(long j) {
        return l0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public LocalDateTime a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    public LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? j0(Long.MAX_VALUE).j0(1L) : j0(-j);
    }

    public final LocalDateTime l0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        i iVar = this.b;
        if (j5 == 0) {
            return n0(localDate, iVar);
        }
        long j6 = 1;
        long jP0 = iVar.p0();
        long j7 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j6) + jP0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j6);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return n0(localDate.r0(jFloorDiv), jFloorMod == jP0 ? this.b : i.g0(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.f) {
            return this.a;
        }
        return super.b(dVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final int u(LocalDateTime localDateTime) {
        int iU = this.a.u(localDateTime.a);
        return iU == 0 ? this.b.compareTo(localDateTime.b) : iU;
    }

    public final boolean O(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar) < 0;
        }
        long jT = this.a.T();
        long jT2 = eVar.n().T();
        if (jT >= jT2) {
            return jT == jT2 && this.b.p0() < eVar.j().p0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
