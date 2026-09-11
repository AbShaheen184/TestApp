package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.i b;

    public static g u(l lVar, j$.time.temporal.l lVar2) {
        g gVar = (g) lVar2;
        if (lVar.equals(gVar.f())) {
            return gVar;
        }
        j$.nio.file.k.k("Chronology mismatch, required: ", lVar.q(), gVar.f().q());
        return null;
    }

    public g(b bVar, j$.time.i iVar) {
        Objects.requireNonNull(iVar, "time");
        this.a = bVar;
        this.b = iVar;
    }

    public final g Z(j$.time.temporal.l lVar, j$.time.i iVar) {
        b bVar = this.a;
        return (bVar == lVar && this.b == iVar) ? this : new g(d.u(bVar.f(), lVar), iVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.e
    public final b n() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.i j() {
        return this.b;
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
            return (((j$.time.temporal.a) pVar).k0() ? this.b : this.a).l(pVar);
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() ? this.b.g(pVar) : this.a.g(pVar);
        }
        return l(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() ? this.b.i(pVar) : this.a.i(pVar);
        }
        return pVar.Z(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return Z(localDate, this.b);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean zK0 = ((j$.time.temporal.a) pVar).k0();
            b bVar = this.a;
            if (zK0) {
                return Z(bVar, this.b.c(j, pVar));
            }
            return Z(bVar.c(j, pVar), this.b);
        }
        return u(this.a.f(), pVar.g0(this, j));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final g d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return u(this.a.f(), temporalUnit.u(this, j));
        }
        switch (f.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return O(this.a, 0L, 0L, 0L, j);
            case 2:
                g gVarZ = Z(this.a.d(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return gVarZ.O(gVarZ.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g gVarZ2 = Z(this.a.d(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return gVarZ2.O(gVarZ2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return O(this.a, 0L, 0L, j, 0L);
            case 5:
                return O(this.a, 0L, j, 0L, 0L);
            case 6:
                return O(this.a, j, 0L, 0L, 0L);
            case 7:
                g gVarZ3 = Z(this.a.d(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return gVarZ3.O(gVarZ3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.a.d(j, temporalUnit), this.b);
        }
    }

    public final g O(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.i iVar = this.b;
        if (j5 == 0) {
            return Z(bVar, iVar);
        }
        long j6 = j / 24;
        long jP0 = iVar.p0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jP0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return Z(bVar.d(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jP0 ? this.b : j$.time.i.g0(jFloorMod));
    }

    @Override // j$.time.chrono.e
    public final ChronoZonedDateTime N(ZoneId zoneId) {
        return k.I(zoneId, null, this);
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }
}
