package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.I(31556952, 0)),
    QUARTER_YEARS("QuarterYears", Duration.I(7889238, 0));

    public final String a;
    public final Duration b;

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        throw null;
    }

    h(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l u(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return lVar.c(Math.addExact(lVar.g(gVar), j), gVar);
        }
        if (i == 2) {
            return lVar.d(j / 4, ChronoUnit.YEARS).d((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
