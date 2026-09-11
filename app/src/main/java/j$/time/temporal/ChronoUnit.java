package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.O(1)),
    MICROS("Micros", Duration.O(1000)),
    MILLIS("Millis", Duration.O(1000000)),
    SECONDS("Seconds", Duration.I(1, 0)),
    MINUTES("Minutes", Duration.I(60, 0)),
    HOURS("Hours", Duration.I(3600, 0)),
    HALF_DAYS("HalfDays", Duration.I(43200, 0)),
    DAYS("Days", Duration.I(86400, 0)),
    WEEKS("Weeks", Duration.I(604800, 0)),
    MONTHS("Months", Duration.I(2629746, 0)),
    YEARS("Years", Duration.I(31556952, 0)),
    DECADES("Decades", Duration.I(315569520, 0)),
    CENTURIES("Centuries", Duration.I(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.I(31556952000L, 0)),
    ERAS("Eras", Duration.I(31556952000000000L, 0)),
    FOREVER("Forever", Duration.I(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L)));

    public final String a;
    public final Duration b;

    ChronoUnit(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l u(l lVar, long j) {
        return lVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
