package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public static ZonedDateTime I(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarI = zoneId.I();
        List listF = fVarI.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarI.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.k0(Duration.I(bVar.d.b - bVar.c.b, 0).getSeconds());
            zoneOffset = bVar.d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime u(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.I().d(Instant.O(j, i));
        return new ZonedDateTime(LocalDateTime.Z(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.a(charSequence, new d(4));
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).b;
            }
            return this.a.l(pVar);
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = w.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.g(pVar);
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = w.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                return i0();
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.i(pVar);
        }
        return pVar.Z(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset o() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId S() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime M(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : I(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.e E() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.b n() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final i j() {
        return this.a.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(LocalDate localDate) {
        return I(LocalDateTime.R(localDate, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = w.a[aVar.ordinal()];
            if (i == 1) {
                return u(j, this.a.b.d, this.c);
            }
            if (i != 2) {
                return I(this.a.c(j, pVar), this.c, this.b);
            }
            ZoneOffset zoneOffsetM0 = ZoneOffset.m0(aVar.b.a(j, aVar));
            return (zoneOffsetM0.equals(this.b) || !this.c.I().f(this.a).contains(zoneOffsetM0)) ? this : new ZonedDateTime(this.a, this.c, zoneOffsetM0);
        }
        return (ZonedDateTime) pVar.g0(this, j);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            boolean zIsDateBased = temporalUnit.isDateBased();
            LocalDateTime localDateTime = this.a;
            if (zIsDateBased) {
                return I(localDateTime.d(j, temporalUnit), this.c, this.b);
            }
            LocalDateTime localDateTimeD = localDateTime.d(j, temporalUnit);
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            Objects.requireNonNull(localDateTimeD, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.I().f(localDateTimeD).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeD, zoneId, zoneOffset);
            }
            return u(localDateTimeD.C(zoneOffset), localDateTimeD.b.d, zoneId);
        }
        return (ZonedDateTime) temporalUnit.u(this, j);
    }

    @Override // j$.time.temporal.l
    public final ChronoZonedDateTime a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.f) {
            return this.a.a;
        }
        return super.b(dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
