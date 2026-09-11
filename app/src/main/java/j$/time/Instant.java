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
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    public static final Instant d = O(-31557014167219200L, 0);
    public static final Instant e = O(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    public static Instant ofEpochSecond(long j) {
        return u(j, 0);
    }

    public static Instant O(long j, long j2) {
        return u(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return u(Math.floorDiv(j, j2), ((int) Math.floorMod(j, j2)) * 1000000);
    }

    public static Instant I(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return O(temporalAccessor.i(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.g(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e2) {
            j$.nio.file.k.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e2);
            return null;
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.g.a(charSequence, new d(0));
    }

    public static Instant u(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            j$.nio.file.k.h("Instant exceeds minimum or maximum instant");
            return null;
        }
        return new Instant(j, i);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.u(this.a, this.b, zoneId);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return super.l(pVar).a(pVar.Z(this), pVar);
        }
        int i = e.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        int i2 = e.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (Instant) localDate.e(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.g0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.j0(j);
        int i = e.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return u(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                if (i3 != this.b) {
                    return u(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
                }
                if (j != this.a) {
                    return u(j, this.b);
                }
            }
        } else if (j != this.b) {
            return u(this.a, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.u(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return R(0L, j);
            case 2:
                return R(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return R(j / 1000, (j % 1000) * 1000000);
            case 4:
                return R(j, 0L);
            case 5:
                return R(Math.multiplyExact(j, 60), 0L);
            case 6:
                return R(Math.multiplyExact(j, 3600), 0L);
            case 7:
                return R(Math.multiplyExact(j, 43200), 0L);
            case 8:
                return R(Math.multiplyExact(j, 86400), 0L);
            default:
                j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final Instant R(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return O(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.NANOS;
        }
        if (dVar == j$.time.temporal.q.b || dVar == j$.time.temporal.q.a || dVar == j$.time.temporal.q.e || dVar == j$.time.temporal.q.d || dVar == j$.time.temporal.q.f || dVar == j$.time.temporal.q.g) {
            return null;
        }
        return dVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.u(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), this.b / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000), (this.b / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.g.format(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
