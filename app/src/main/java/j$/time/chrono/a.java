package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements l {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return q().compareTo(((l) obj).q());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l I(l lVar, String str) {
        String strY;
        l lVar2 = (l) a.putIfAbsent(str, lVar);
        if (lVar2 == null && (strY = lVar.y()) != null) {
            b.putIfAbsent(strY, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public b c0(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return p(((Long) map.remove(aVar)).longValue());
        }
        R(map, e0Var);
        b bVarG0 = g0(map, e0Var);
        if (bVarG0 != null) {
            return bVarG0;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return Z(map, e0Var);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(aVar5)) {
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (e0Var == j$.time.format.e0.LENIENT) {
                            return O(a0(iA, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA2 = G(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        b bVarM = a0(iA, iA2, 1).d((G(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).m(new j$.time.temporal.n(j$.time.c.u(G(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (e0Var != j$.time.format.e0.STRICT || bVarM.g(aVar3) == iA2) {
                            return bVarM;
                        }
                        j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                } else {
                    int iA3 = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return a0(iA3, 1, 1).d(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).d(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA4 = G(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    b bVarD = a0(iA3, iA4, 1).d((G(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((G(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (e0Var != j$.time.format.e0.STRICT || bVarD.g(aVar3) == iA4) {
                        return bVarD;
                    }
                    j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different month");
                    return null;
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!map.containsKey(aVar7)) {
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(aVar8)) {
                return null;
            }
            j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(aVar9)) {
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (!map.containsKey(aVar10)) {
                    return null;
                }
                int iA5 = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (e0Var == j$.time.format.e0.LENIENT) {
                    return O(A(iA5, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                }
                b bVarM2 = A(iA5, 1).d((G(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).m(new j$.time.temporal.n(j$.time.c.u(G(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                if (e0Var != j$.time.format.e0.STRICT || bVarM2.g(aVar2) == iA5) {
                    return bVarM2;
                }
                j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            int iA6 = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e0Var == j$.time.format.e0.LENIENT) {
                return A(iA6, 1).d(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            b bVarD2 = A(iA6, 1).d((G(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((G(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (e0Var != j$.time.format.e0.STRICT || bVarD2.g(aVar2) == iA6) {
                return bVarD2;
            }
            j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different year");
            return null;
        }
        int iA7 = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (e0Var == j$.time.format.e0.LENIENT) {
            return A(iA7, 1).d(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return A(iA7, G(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
    }

    public void R(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.j0(l.longValue());
            }
            b bVarC = V().c(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).c(l.longValue(), (j$.time.temporal.p) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            u(map, aVar2, bVarC.g(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            u(map, aVar3, bVarC.g(aVar3));
        }
    }

    public b g0(Map map, j$.time.format.e0 e0Var) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l2 = (Long) map.remove(aVar2);
            if (e0Var != j$.time.format.e0.LENIENT) {
                intExact = G(aVar).a(l.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                u(map, j$.time.temporal.a.YEAR, L(J(G(aVar2).a(l2.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                u(map, aVar3, L(A(G(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).W(), intExact));
                return null;
            }
            if (e0Var == j$.time.format.e0.STRICT) {
                map.put(aVar, l);
                return null;
            }
            List listH = H();
            if (listH.isEmpty()) {
                u(map, aVar3, intExact);
                return null;
            }
            u(map, aVar3, L((m) listH.get(listH.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        G(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    public b Z(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = G(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (e0Var == j$.time.format.e0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return a0(iA, 1, 1).d(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).d(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = G(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = G(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var != j$.time.format.e0.SMART) {
            return a0(iA, iA2, iA3);
        }
        try {
            return a0(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return a0(iA, iA2, 1).m(new j$.time.d(6));
        }
    }

    public static b O(b bVar, long j, long j2, long j3) {
        long j4;
        b bVarD = bVar.d(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b bVarD2 = bVarD.d(j2, (TemporalUnit) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            bVarD2 = bVarD2.d(j5 / 7, (TemporalUnit) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                bVarD2 = bVarD2.d(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return bVarD2.m(new j$.time.temporal.n(j$.time.c.u((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return bVarD2.m(new j$.time.temporal.n(j$.time.c.u((int) j3).getValue(), 0));
    }

    public static void u(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && q().compareTo(((a) obj).q()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ q().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return q();
    }
}
