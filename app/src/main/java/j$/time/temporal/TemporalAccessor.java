package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean h(p pVar);

    long i(p pVar);

    default s l(p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.I(this);
        }
        if (h(pVar)) {
            return ((a) pVar).b;
        }
        throw new r(j$.time.b.a("Unsupported field: ", pVar));
    }

    default int g(p pVar) {
        s sVarL = l(pVar);
        if (!sVarL.d()) {
            throw new r("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jI = i(pVar);
        if (sVarL.e(jI)) {
            return (int) jI;
        }
        throw new DateTimeException("Invalid value for " + pVar + " (valid values " + sVarL + "): " + jI);
    }

    default Object b(j$.time.d dVar) {
        if (dVar == q.a || dVar == q.b || dVar == q.c) {
            return null;
        }
        return dVar.k(this);
    }
}
