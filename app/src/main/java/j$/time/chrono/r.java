package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements m {
    public static final r AH;
    public static final /* synthetic */ r[] a;

    @Override // j$.time.chrono.m
    public final int getValue() {
        return 1;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) a.clone();
    }

    static {
        r rVar = new r("AH", 0);
        AH = rVar;
        a = new r[]{rVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.s.f(1L, 1L);
        }
        return super.l(pVar);
    }
}
