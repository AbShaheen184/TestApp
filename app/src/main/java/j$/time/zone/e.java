package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.k;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final k a;
    public final byte b;
    public final j$.time.c c;
    public final j$.time.i d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(k kVar, int i, j$.time.c cVar, j$.time.i iVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = cVar;
        this.d = iVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b;
        int iQ0 = this.e ? 86400 : this.d.q0();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        if (iQ0 % 3600 == 0) {
            b = this.e ? (byte) 24 : this.d.a;
        } else {
            b = 31;
        }
        int i4 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / 1800 : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        j$.time.c cVar = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(iQ0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public static e a(DataInput dataInput) {
        e eVar;
        j$.time.i iVarI;
        ZoneOffset zoneOffsetM0;
        int i;
        int i2 = dataInput.readInt();
        k kVarR = k.R(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i4 = (3670016 & i2) >>> 19;
        j$.time.c cVarU = i4 == 0 ? null : j$.time.c.u(i4);
        int i5 = (507904 & i2) >>> 14;
        d dVar = d.values()[(i2 & 12288) >>> 12];
        int i6 = (i2 & 4080) >>> 4;
        int i7 = (i2 & 12) >>> 2;
        int i8 = i2 & 3;
        if (i5 == 31) {
            long j = dataInput.readInt();
            j$.time.i iVar = j$.time.i.e;
            j$.time.temporal.a.SECOND_OF_DAY.j0(j);
            int i9 = (int) (j / 3600);
            eVar = null;
            long j2 = j - ((long) (i9 * 3600));
            int i10 = (int) (j2 / 60);
            iVarI = j$.time.i.I(i9, i10, (int) (j2 - ((long) (i10 * 60))), 0);
        } else {
            eVar = null;
            int i11 = i5 % 24;
            j$.time.i iVar2 = j$.time.i.e;
            j$.time.temporal.a.HOUR_OF_DAY.j0(i11);
            iVarI = j$.time.i.h[i11];
        }
        ZoneOffset zoneOffsetM1 = i6 == 255 ? ZoneOffset.m0(dataInput.readInt()) : ZoneOffset.m0((i6 - 128) * 900);
        if (i7 == 3) {
            zoneOffsetM0 = ZoneOffset.m0(dataInput.readInt());
        } else {
            zoneOffsetM0 = ZoneOffset.m0((i7 * 1800) + zoneOffsetM1.b);
        }
        ZoneOffset zoneOffset = zoneOffsetM0;
        if (i8 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i8 * 1800) + zoneOffsetM1.b;
        }
        ZoneOffset zoneOffsetM2 = ZoneOffset.m0(i);
        boolean z = i5 == 24;
        Objects.requireNonNull(kVarR, "month");
        Objects.requireNonNull(iVarI, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            j$.nio.file.k.a("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return eVar;
        }
        if (z && !iVarI.equals(j$.time.i.g)) {
            j$.nio.file.k.a("Time must be midnight when end of day flag is true");
            return eVar;
        }
        if (iVarI.d != 0) {
            j$.nio.file.k.a("Time's nano-of-second must be zero");
            return eVar;
        }
        return new e(kVarR, i3, cVarU, iVarI, z, dVar, zoneOffsetM1, zoneOffset, zoneOffsetM2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iQ0 = ((this.d.q0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.c cVar = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iQ0 + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        j$.time.c cVar = this.c;
        if (cVar != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(cVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(cVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(cVar.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
