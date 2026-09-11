package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends j$.time.temporal.l, j$.time.temporal.m, Comparable {
    b b0(j$.time.temporal.o oVar);

    @Override // j$.time.temporal.l
    b c(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.l
    b d(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    l f();

    int hashCode();

    b m(j$.time.temporal.m mVar);

    String toString();

    default e U(j$.time.i iVar) {
        return new g(this, iVar);
    }

    default m W() {
        return f().J(g(j$.time.temporal.a.ERA));
    }

    default boolean F() {
        return f().h0(i(j$.time.temporal.a.YEAR));
    }

    default int e0() {
        return F() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.l
    default b a(long j, TemporalUnit temporalUnit) {
        return d.u(f(), super.a(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.d dVar) {
        if (dVar == j$.time.temporal.q.a || dVar == j$.time.temporal.q.e || dVar == j$.time.temporal.q.d || dVar == j$.time.temporal.q.g) {
            return null;
        }
        if (dVar == j$.time.temporal.q.b) {
            return f();
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.DAYS;
        }
        return dVar.k(this);
    }

    @Override // j$.time.temporal.m
    default j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(T(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long T() {
        return i(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f0 */
    default int compareTo(b bVar) {
        int iCompare = Long.compare(T(), bVar.T());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) f()).q().compareTo(bVar.f().q());
    }
}
