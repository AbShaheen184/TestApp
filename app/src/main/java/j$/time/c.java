package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements TemporalAccessor, j$.time.temporal.m {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;
    public static final c[] a;
    public static final /* synthetic */ c[] b;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) b.clone();
    }

    static {
        c cVar = new c("MONDAY", 0);
        MONDAY = cVar;
        c cVar2 = new c("TUESDAY", 1);
        TUESDAY = cVar2;
        c cVar3 = new c("WEDNESDAY", 2);
        WEDNESDAY = cVar3;
        c cVar4 = new c("THURSDAY", 3);
        THURSDAY = cVar4;
        c cVar5 = new c("FRIDAY", 4);
        FRIDAY = cVar5;
        c cVar6 = new c("SATURDAY", 5);
        SATURDAY = cVar6;
        c cVar7 = new c("SUNDAY", 6);
        SUNDAY = cVar7;
        b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        a = values();
    }

    public static c u(int i) {
        if (i < 1 || i > 7) {
            j$.nio.file.k.b("Invalid value for DayOfWeek: ", i);
            return null;
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return pVar.R();
        }
        return super.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return super.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return pVar.Z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.DAYS;
        }
        return super.b(dVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
