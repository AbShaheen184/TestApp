package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends a implements Serializable {
    public static final g0 c = new g0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m J(int i) {
        if (i == 0) {
            return j0.BEFORE_BE;
        }
        if (i == 1) {
            return j0.BE;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String y() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final b a0(int i, int i2, int i3) {
        return new i0(LocalDate.n0(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final b A(int i, int i2) {
        return new i0(LocalDate.p0(i - 543, i2));
    }

    @Override // j$.time.chrono.l
    public final b p(long j) {
        return new i0(LocalDate.o0(j));
    }

    @Override // j$.time.chrono.l
    public final b V() {
        return new i0(LocalDate.O(LocalDate.m0(j$.desugar.sun.nio.fs.g.y())));
    }

    @Override // j$.time.chrono.l
    public final b P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof i0) {
            return (i0) temporalAccessor;
        }
        return new i0(LocalDate.O(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final boolean h0(long j) {
        return s.c.h0(j - 543);
    }

    @Override // j$.time.chrono.l
    public final int L(m mVar, int i) {
        if (mVar instanceof j0) {
            return mVar == j0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private g0() {
    }

    @Override // j$.time.chrono.l
    public final List H() {
        return j$.desugar.sun.nio.fs.g.o(j0.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.s G(j$.time.temporal.a aVar) {
        int i = f0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.g(1L, (-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a + 543, sVar3.d + 543);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b c0(Map map, j$.time.format.e0 e0Var) {
        return (i0) super.c0(map, e0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        return k.O(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
