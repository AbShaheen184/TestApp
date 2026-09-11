package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends j$.time.temporal.l, Comparable<ChronoZonedDateTime<?>> {
    e E();

    ChronoZonedDateTime M(ZoneId zoneId);

    ZoneId S();

    @Override // j$.time.temporal.l
    ChronoZonedDateTime c(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.l
    ChronoZonedDateTime d(long j, TemporalUnit temporalUnit);

    ZoneOffset o();

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return E().l(pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return E().g(pVar);
            }
            return o().b;
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                return i0();
            }
            if (i != 2) {
                return E().i(pVar);
            }
            return o().b;
        }
        return pVar.Z(this);
    }

    default b n() {
        return E().n();
    }

    default j$.time.i j() {
        return E().j();
    }

    default l f() {
        return n().f();
    }

    @Override // j$.time.temporal.l
    default ChronoZonedDateTime m(j$.time.temporal.m mVar) {
        return k.u(f(), mVar.e(this));
    }

    @Override // j$.time.temporal.l
    default ChronoZonedDateTime a(long j, TemporalUnit temporalUnit) {
        return k.u(f(), super.a(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.d dVar) {
        if (dVar == j$.time.temporal.q.e || dVar == j$.time.temporal.q.a) {
            return S();
        }
        if (dVar == j$.time.temporal.q.d) {
            return o();
        }
        if (dVar == j$.time.temporal.q.g) {
            return j();
        }
        if (dVar == j$.time.temporal.q.b) {
            return f();
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.NANOS;
        }
        return dVar.k(this);
    }

    default Instant toInstant() {
        return Instant.O(i0(), j().d);
    }

    default long i0() {
        return ((n().T() * 86400) + ((long) j().q0())) - ((long) o().b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(i0(), chronoZonedDateTime.i0());
        return (iCompare == 0 && (iCompare = j().d - chronoZonedDateTime.j().d) == 0 && (iCompare = E().compareTo(chronoZonedDateTime.E())) == 0 && (iCompare = S().q().compareTo(chronoZonedDateTime.S().q())) == 0) ? ((a) f()).q().compareTo(chronoZonedDateTime.f().q()) : iCompare;
    }
}
