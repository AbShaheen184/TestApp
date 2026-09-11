package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends TemporalAccessor {
    l c(long j, p pVar);

    l d(long j, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: k */
    l m(LocalDate localDate);

    default l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }
}
