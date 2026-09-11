package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVar = dateTimeFormatter.e;
        if (lVar != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.q.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.b(j$.time.temporal.q.a);
            j$.time.chrono.b bVarP = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            if (lVar != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (lVar != null) {
                    if (temporalAccessor.h(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarP = lVar3.P(temporalAccessor);
                    } else if (lVar != j$.time.chrono.s.c || lVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.h(aVar)) {
                                throw new DateTimeException("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new x(bVarP, temporalAccessor, lVar3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Object b(j$.time.d dVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objB = temporalAccessor.b(dVar);
        if (objB != null || this.c != 0) {
            return objB;
        }
        throw new DateTimeException("Unable to extract " + dVar + " from temporal " + temporalAccessor);
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.h(pVar)) {
            return Long.valueOf(temporalAccessor.i(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
