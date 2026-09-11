package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m J(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String y() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final b a0(int i, int i2, int i3) {
        return LocalDate.n0(i, i2, i3);
    }

    @Override // j$.time.chrono.l
    public final b A(int i, int i2) {
        return LocalDate.p0(i, i2);
    }

    @Override // j$.time.chrono.l
    public final b p(long j) {
        return LocalDate.o0(j);
    }

    @Override // j$.time.chrono.l
    public final b P(TemporalAccessor temporalAccessor) {
        return LocalDate.O(temporalAccessor);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final e Q(LocalDateTime localDateTime) {
        return LocalDateTime.I(localDateTime);
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.u(instant.a, instant.b, zoneId);
    }

    @Override // j$.time.chrono.l
    public final b V() {
        return LocalDate.O(LocalDate.m0(j$.desugar.sun.nio.fs.g.y()));
    }

    @Override // j$.time.chrono.l
    public final boolean h0(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final int L(m mVar, int i) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List H() {
        return j$.desugar.sun.nio.fs.g.o(t.values());
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b c0(Map map, j$.time.format.e0 e0Var) {
        return (LocalDate) super.c0(map, e0Var);
    }

    @Override // j$.time.chrono.a
    public final void R(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.j0(l.longValue());
            }
            long j = 12;
            a.u(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), j)) + 1);
            a.u(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), j));
        }
    }

    @Override // j$.time.chrono.a
    public final b g0(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.j0(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    a.u(map, j$.time.temporal.a.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    a.u(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
                    return null;
                }
                j$.nio.file.k.j("Invalid value for era: ", l2);
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l3 = (Long) map.get(aVar2);
            if (e0Var != j$.time.format.e0.STRICT) {
                a.u(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long jLongValue = l3.longValue();
                long jLongValue2 = l.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                a.u(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.j0(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.a
    public final b Z(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (e0Var == j$.time.format.e0.LENIENT) {
            return LocalDate.n0(iA, 1, 1).s0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).r0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var == j$.time.format.e0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                j$.time.k kVar = j$.time.k.FEBRUARY;
                long j = iA;
                int i = j$.time.s.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, kVar.I(z));
            }
        }
        return LocalDate.n0(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.s G(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
