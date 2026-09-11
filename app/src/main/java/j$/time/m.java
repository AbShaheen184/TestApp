package j$.time;

import j$.time.format.e0;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.e("--");
        vVar.n(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.d('-');
        vVar.n(j$.time.temporal.a.DAY_OF_MONTH, 2);
        vVar.s(Locale.getDefault(), e0.SMART, null);
    }

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        int i;
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.R();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(pVar);
        }
        k kVarR = k.R(this.a);
        kVarR.getClass();
        int i2 = j.a[kVarR.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.s.g(1L, i, k.R(this.a).O());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        return l(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.Z(this);
        }
        int i2 = l.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        if (dVar == j$.time.temporal.q.b) {
            return j$.time.chrono.s.c;
        }
        return super.b(dVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.s(lVar).equals(j$.time.chrono.s.c)) {
            j$.nio.file.k.h("Adjustment only supported on ISO date-time");
            return null;
        }
        j$.time.temporal.l lVarC = lVar.c(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return lVarC.c(Math.min(lVarC.l(aVar).d, this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
