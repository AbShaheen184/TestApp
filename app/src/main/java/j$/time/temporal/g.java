package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final s R() {
                return s.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.DAY_OF_YEAR) || !temporalAccessor.h(a.MONTH_OF_YEAR) || !temporalAccessor.h(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.time.chrono.l.s(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s I(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long jI = temporalAccessor.i(g.QUARTER_OF_YEAR);
                if (jI == 1) {
                    return j$.time.chrono.s.c.h0(temporalAccessor.i(a.YEAR)) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                if (jI == 2) {
                    return s.f(1L, 91L);
                }
                if (jI == 3 || jI == 4) {
                    return s.f(1L, 92L);
                }
                return R();
            }

            @Override // j$.time.temporal.p
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.g(a.DAY_OF_YEAR) - g.a[((temporalAccessor.g(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.c.h0(temporalAccessor.i(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l g0(l lVar, long j) {
                long jZ = Z(lVar);
                R().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.c((j - jZ) + lVar.i(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor O(Map map, d0 d0Var, e0 e0Var) {
                LocalDate localDateN0;
                long jSubtractExact;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(pVar);
                if (l != null && l2 != null) {
                    int iA = aVar.b.a(l.longValue(), aVar);
                    long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (j$.time.chrono.l.s(d0Var).equals(j$.time.chrono.s.c)) {
                        if (e0Var == e0.LENIENT) {
                            localDateN0 = LocalDate.n0(iA, 1, 1).s0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                            jSubtractExact = Math.subtractExact(jLongValue, 1L);
                        } else {
                            localDateN0 = LocalDate.n0(iA, ((pVar.R().a(l2.longValue(), pVar) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (e0Var == e0.STRICT) {
                                    I(localDateN0).b(jLongValue, this);
                                } else {
                                    R().b(jLongValue, this);
                                }
                            }
                            jSubtractExact = jLongValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(pVar);
                        return localDateN0.r0(jSubtractExact);
                    }
                    j$.nio.file.k.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final s R() {
                return s.f(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.time.chrono.l.s(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.i(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final s I(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return R();
            }

            @Override // j$.time.temporal.p
            public final l g0(l lVar, long j) {
                long jZ = Z(lVar);
                R().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.c(((j - jZ) * 3) + lVar.i(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final s R() {
                return s.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.time.chrono.l.s(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s I(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.m0(LocalDate.O(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.j0(LocalDate.O(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final l g0(l lVar, long j) {
                R().b(j, this);
                return lVar.d(Math.subtractExact(j, Z(lVar)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor O(Map map, d0 d0Var, e0 e0Var) {
                LocalDate localDateC;
                long j;
                p pVar = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l != null && l2 != null) {
                    int iA = pVar.R().a(l.longValue(), pVar);
                    long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (j$.time.chrono.l.s(d0Var).equals(j$.time.chrono.s.c)) {
                        LocalDate localDateN0 = LocalDate.n0(iA, 1, 4);
                        if (e0Var == e0.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateN0 = localDateN0.t0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateN0 = localDateN0.t0(Math.subtractExact(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateC = localDateN0.t0(Math.subtractExact(jLongValue, 1L)).c(jLongValue2, aVar);
                            }
                            jLongValue2 = j + 1;
                            localDateC = localDateN0.t0(Math.subtractExact(jLongValue, 1L)).c(jLongValue2, aVar);
                        } else {
                            int iA2 = aVar.b.a(l2.longValue(), aVar);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (e0Var == e0.STRICT) {
                                    g.m0(localDateN0).b(jLongValue, this);
                                } else {
                                    R().b(jLongValue, this);
                                }
                            }
                            localDateC = localDateN0.t0(jLongValue - 1).c(iA2, aVar);
                        }
                        map.remove(this);
                        map.remove(pVar);
                        map.remove(aVar);
                        return localDateC;
                    }
                    j$.nio.file.k.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final s R() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.time.chrono.l.s(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final long Z(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.k0(LocalDate.O(temporalAccessor));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final s I(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.p
            public final l g0(l lVar, long j) {
                if (!u(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate localDateO = LocalDate.O(lVar);
                a aVar = a.DAY_OF_WEEK;
                int iG = localDateO.g(aVar);
                int iJ0 = g.j0(localDateO);
                if (iJ0 == 53 && g.l0(iA) == 52) {
                    iJ0 = 52;
                }
                LocalDate localDateN0 = LocalDate.n0(iA, 1, 4);
                return lVar.m(localDateN0.r0(((iJ0 - 1) * 7) + (iG - localDateN0.g(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, Token.TEMPLATE_CHARS, 273, 0, 91, Token.TEMPLATE_LITERAL_SUBST, 274};
    }

    public static s m0(LocalDate localDate) {
        return s.f(1L, l0(k0(localDate)));
    }

    public static int l0(int i) {
        LocalDate localDateN0 = LocalDate.n0(i, 1, 1);
        if (localDateN0.Z() != j$.time.c.THURSDAY) {
            return (localDateN0.Z() == j$.time.c.WEDNESDAY && localDateN0.F()) ? 53 : 52;
        }
        return 53;
    }

    public static int j0(LocalDate localDate) {
        int iOrdinal = localDate.Z().ordinal();
        int iG0 = localDate.g0() - 1;
        int i = (3 - iOrdinal) + iG0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iG0 >= i3) {
            int i4 = ((iG0 - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.F())) {
                return i4;
            }
            return 1;
        }
        if (localDate.g0() != 180) {
            localDate = LocalDate.p0(localDate.a, 180);
        }
        return (int) m0(localDate.u0(-1L)).d;
    }

    public static int k0(LocalDate localDate) {
        int i = localDate.a;
        int iG0 = localDate.g0();
        if (iG0 <= 3) {
            return iG0 - localDate.Z().ordinal() < -2 ? i - 1 : i;
        }
        if (iG0 >= 363) {
            return ((iG0 - 363) - (localDate.F() ? 1 : 0)) - localDate.Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
