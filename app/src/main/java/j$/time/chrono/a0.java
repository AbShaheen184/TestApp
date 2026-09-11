package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends a implements Serializable {
    public static final a0 c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String q() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m J(int i) {
        if (i == 0) {
            return d0.BEFORE_ROC;
        }
        if (i == 1) {
            return d0.ROC;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.l
    public final String y() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final b a0(int i, int i2, int i3) {
        return new c0(LocalDate.n0(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final b A(int i, int i2) {
        return new c0(LocalDate.p0(i + 1911, i2));
    }

    @Override // j$.time.chrono.l
    public final b p(long j) {
        return new c0(LocalDate.o0(j));
    }

    @Override // j$.time.chrono.l
    public final b V() {
        return new c0(LocalDate.O(LocalDate.m0(j$.desugar.sun.nio.fs.g.y())));
    }

    @Override // j$.time.chrono.l
    public final b P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof c0) {
            return (c0) temporalAccessor;
        }
        return new c0(LocalDate.O(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final boolean h0(long j) {
        return s.c.h0(j + 1911);
    }

    @Override // j$.time.chrono.l
    public final int L(m mVar, int i) {
        if (mVar instanceof d0) {
            return mVar == d0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List H() {
        return j$.desugar.sun.nio.fs.g.o(d0.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.s G(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a - 22932, sVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.g(1L, sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a - 1911, sVar3.d - 1911);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b c0(Map map, j$.time.format.e0 e0Var) {
        return (c0) super.c0(map, e0Var);
    }

    private a0() {
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
