package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends j$.time.temporal.l, j$.time.temporal.m, Comparable {
    ChronoZonedDateTime N(ZoneId zoneId);

    j$.time.i j();

    b n();

    default l f() {
        return n().f();
    }

    @Override // j$.time.temporal.l
    default e a(long j, TemporalUnit temporalUnit) {
        return g.u(f(), super.a(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.d dVar) {
        if (dVar == j$.time.temporal.q.a || dVar == j$.time.temporal.q.e || dVar == j$.time.temporal.q.d) {
            return null;
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

    @Override // j$.time.temporal.m
    default j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(n().T(), j$.time.temporal.a.EPOCH_DAY).c(j().p0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long C(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((n().T() * 86400) + ((long) j().q0())) - ((long) zoneOffset.b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Y */
    default int compareTo(e eVar) {
        int iCompareTo = n().compareTo(eVar.n());
        return (iCompareTo == 0 && (iCompareTo = j().compareTo(eVar.j())) == 0) ? ((a) f()).q().compareTo(eVar.f().q()) : iCompareTo;
    }
}
