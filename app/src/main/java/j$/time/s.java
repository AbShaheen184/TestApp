package j$.time;

import j$.time.format.e0;
import j$.time.format.f0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((s) obj).a;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.o(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        vVar.s(Locale.getDefault(), e0.SMART, null);
    }

    public static s u(int i) {
        j$.time.temporal.a.YEAR.j0(i);
        return new s(i);
    }

    public s(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        return l(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        int i = r.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l m(LocalDate localDate) {
        return (s) localDate.e(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final s c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (s) pVar.g0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.j0(j);
        int i = r.a[aVar.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return u((int) j);
        }
        if (i == 2) {
            return u((int) j);
        }
        if (i == 3) {
            return i(j$.time.temporal.a.ERA) == j ? this : u(1 - this.a);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final s d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.u(this, j);
        }
        int i = r.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return O(j);
        }
        if (i == 2) {
            return O(Math.multiplyExact(j, 10));
        }
        if (i == 3) {
            return O(Math.multiplyExact(j, 100));
        }
        if (i == 4) {
            return O(Math.multiplyExact(j, 1000));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(Math.addExact(i(aVar), j), aVar);
        }
        j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
        return null;
    }

    public final s O(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return u(aVar.b.a(((long) this.a) + j, aVar));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.b) {
            return j$.time.chrono.s.c;
        }
        if (dVar == j$.time.temporal.q.c) {
            return ChronoUnit.YEARS;
        }
        return super.b(dVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.s(lVar).equals(j$.time.chrono.s.c)) {
            j$.nio.file.k.h("Adjustment only supported on ISO date-time");
            return null;
        }
        return lVar.c(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
