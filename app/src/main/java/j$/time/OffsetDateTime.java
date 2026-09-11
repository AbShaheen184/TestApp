package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.a.C(this.b), offsetDateTime2.a.C(offsetDateTime2.b));
            if (iCompare == 0) {
                iCompare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime u(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.I().d(instant);
        return new OffsetDateTime(LocalDateTime.Z(instant.a, instant.b, zoneOffsetD), zoneOffsetD);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.f);
    }

    public static OffsetDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.a(charSequence, new d(3));
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final OffsetDateTime O(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.l(pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = n.a[((j$.time.temporal.a) pVar).ordinal()];
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
            int i = n.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                return this.a.C(this.b);
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.i(pVar);
        }
        return pVar.Z(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        LocalDateTime localDateTime = this.a;
        return O(localDateTime.n0(localDate, localDateTime.b), this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = n.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return u(Instant.O(j, localDateTime.b.d), this.b);
            }
            if (i == 2) {
                return O(localDateTime, ZoneOffset.m0(aVar.b.a(j, aVar)));
            }
            return O(localDateTime.c(j, pVar), this.b);
        }
        return (OffsetDateTime) pVar.g0(this, j);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return O(this.a.d(j, temporalUnit), this.b);
        }
        return (OffsetDateTime) temporalUnit.u(this, j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.d || dVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (dVar == j$.time.temporal.q.a) {
            return null;
        }
        if (dVar == j$.time.temporal.q.f) {
            return this.a.a;
        }
        if (dVar == j$.time.temporal.q.g) {
            return this.a.b;
        }
        if (dVar == j$.time.temporal.q.b) {
            return j$.time.chrono.s.c;
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.NANOS;
        }
        return dVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(this.a.a.T(), j$.time.temporal.a.EPOCH_DAY).c(this.a.b.p0(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.a;
        return Instant.O(localDateTime.C(this.b), localDateTime.j().d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
