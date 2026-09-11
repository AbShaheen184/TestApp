package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public static k I(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, gVar);
        }
        j$.time.zone.f fVarI = zoneId.I();
        LocalDateTime localDateTimeI = LocalDateTime.I(gVar);
        List listF = fVarI.f(localDateTimeI);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarI.e(localDateTimeI);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.O(gVar.a, 0L, 0L, Duration.I(bVar.d.b - bVar.c.b, 0).getSeconds(), 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, gVar);
    }

    public static k O(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.I().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new k(zoneId, zoneOffsetD, (g) lVar.Q(LocalDateTime.Z(instant.a, instant.b, zoneOffsetD)));
    }

    public static k u(l lVar, j$.time.temporal.l lVar2) {
        k kVar = (k) lVar2;
        if (lVar.equals(kVar.f())) {
            return kVar;
        }
        j$.nio.file.k.k("Chronology mismatch, required: ", lVar.q(), kVar.f().q());
        return null;
    }

    public k(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset o() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final e E() {
        return this.a;
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

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId S() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime M(ZoneId zoneId) {
        return I(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.l
    public final ChronoZonedDateTime c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = j.a[aVar.ordinal()];
            if (i == 1) {
                return d(j - i0(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i == 2) {
                ZoneOffset zoneOffsetM0 = ZoneOffset.m0(aVar.b.a(j, aVar));
                g gVar = this.a;
                return O(f(), Instant.O(gVar.C(zoneOffsetM0), gVar.j().d), this.c);
            }
            return I(this.c, this.b, this.a.c(j, pVar));
        }
        return u(f(), pVar.g0(this, j));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.l
    public final ChronoZonedDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m(this.a.d(j, temporalUnit));
        }
        return u(f(), temporalUnit.u(this, j));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
