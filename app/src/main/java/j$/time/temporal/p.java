package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface p {
    s I(TemporalAccessor temporalAccessor);

    s R();

    long Z(TemporalAccessor temporalAccessor);

    l g0(l lVar, long j);

    boolean isDateBased();

    boolean u(TemporalAccessor temporalAccessor);

    default TemporalAccessor O(Map map, d0 d0Var, e0 e0Var) {
        return null;
    }
}
