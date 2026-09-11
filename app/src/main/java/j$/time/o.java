package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final i a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        boolean zEquals = this.b.equals(oVar.b);
        i iVar = this.a;
        if (zEquals) {
            return iVar.compareTo(oVar.a);
        }
        int iCompare = Long.compare(iVar.p0() - (((long) this.b.b) * 1000000000), oVar.a.p0() - (((long) oVar.b.b) * 1000000000));
        return iCompare == 0 ? this.a.compareTo(oVar.a) : iCompare;
    }

    static {
        i iVar = i.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        iVar.getClass();
        new o(iVar, zoneOffset);
        i iVar2 = i.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        iVar2.getClass();
        new o(iVar2, zoneOffset2);
    }

    public o(i iVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(iVar, "time");
        this.a = iVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final o I(i iVar, ZoneOffset zoneOffset) {
        return (this.a == iVar && this.b.equals(zoneOffset)) ? this : new o(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).k0() || pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.l(pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.i(pVar);
        }
        return pVar.Z(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (o) localDate.e(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            i iVar = this.a;
            if (pVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) pVar;
                return I(iVar, ZoneOffset.m0(aVar2.b.a(j, aVar2)));
            }
            return I(iVar.c(j, pVar), this.b);
        }
        return (o) pVar.g0(this, j);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return I(this.a.d(j, temporalUnit), this.b);
        }
        return (o) temporalUnit.u(this, j);
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
        if (((dVar == j$.time.temporal.q.a) || (dVar == j$.time.temporal.q.b)) || dVar == j$.time.temporal.q.f) {
            return null;
        }
        if (dVar == j$.time.temporal.q.g) {
            return this.a;
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.NANOS;
        }
        return dVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(this.a.p0(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
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
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
