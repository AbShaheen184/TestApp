package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract b I(long j);

    public abstract b O(long j);

    public abstract b R(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l a(long j, TemporalUnit temporalUnit) {
        return a(j, temporalUnit);
    }

    public static b u(l lVar, j$.time.temporal.l lVar2) {
        b bVar = (b) lVar2;
        if (lVar.equals(bVar.f())) {
            return bVar;
        }
        j$.nio.file.k.k("Chronology mismatch, expected: ", lVar.q(), bVar.f().q());
        return null;
    }

    @Override // j$.time.temporal.l
    public b d(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return u(f(), temporalUnit.u(this, j));
            }
            j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
            return null;
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return I(j);
            case 2:
                return I(Math.multiplyExact(j, 7));
            case 3:
                return O(j);
            case 4:
                return R(j);
            case 5:
                return R(Math.multiplyExact(j, 10));
            case 6:
                return R(Math.multiplyExact(j, 100));
            case 7:
                return R(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(i(aVar), j), (j$.time.temporal.p) aVar);
            default:
                j$.nio.file.k.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jT = T();
        return ((int) (jT ^ (jT >>> 32))) ^ f().hashCode();
    }

    @Override // j$.time.temporal.l
    public b m(j$.time.temporal.m mVar) {
        return u(f(), mVar.e(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jI = i(j$.time.temporal.a.YEAR_OF_ERA);
        long jI2 = i(j$.time.temporal.a.MONTH_OF_YEAR);
        long jI3 = i(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(f().toString());
        sb.append(" ");
        sb.append(W());
        sb.append(" ");
        sb.append(jI);
        sb.append(jI2 < 10 ? "-0" : "-");
        sb.append(jI2);
        sb.append(jI3 < 10 ? "-0" : "-");
        sb.append(jI3);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public b c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        return u(f(), pVar.g0(this, j));
    }

    @Override // j$.time.chrono.b
    public b b0(j$.time.temporal.o oVar) {
        return u(f(), oVar.u(this));
    }
}
