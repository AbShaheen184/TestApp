package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor, j$.time.temporal.m {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        return pVar.Z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.d dVar) {
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.ERAS;
        }
        return super.b(dVar);
    }

    @Override // j$.time.temporal.m
    default j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.ERA);
    }
}
