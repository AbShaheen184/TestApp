package j$.time;

import j$.time.temporal.TemporalAccessor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m0(0);
    public static final ZoneOffset f = m0(-64800);
    public static final ZoneOffset g = m0(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    public static ZoneOffset k0(String str) {
        int iN0;
        int iN1;
        int iN2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iN0 = n0(str, 1, false);
                    iN1 = n0(str, 3, false);
                } else if (length == 6) {
                    iN0 = n0(str, 1, false);
                    iN1 = n0(str, 4, true);
                } else if (length == 7) {
                    iN0 = n0(str, 1, false);
                    iN1 = n0(str, 3, false);
                    iN2 = n0(str, 5, false);
                } else if (length == 9) {
                    iN0 = n0(str, 1, false);
                    iN1 = n0(str, 4, true);
                    iN2 = n0(str, 7, true);
                } else {
                    j$.nio.file.k.h("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    return null;
                }
                iN2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                j$.nio.file.k.h("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                return null;
            }
            if (cCharAt == '-') {
                return l0(-iN0, -iN1, -iN2);
            }
            return l0(iN0, iN1, iN2);
        }
        iN0 = n0(str, 1, false);
        iN1 = 0;
        iN2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return l0(-iN0, -iN1, -iN2);
        }
        return l0(iN0, iN1, iN2);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f I() {
        return new j$.time.zone.f(this);
    }

    public static int n0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                j$.nio.file.k.j("Invalid ID for ZoneOffset, colon not found when expected: ", str);
                return 0;
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            j$.nio.file.k.j("Invalid ID for ZoneOffset, non numeric characters found: ", str2);
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset j0(TemporalAccessor temporalAccessor) {
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.b(j$.time.temporal.q.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        j$.nio.file.k.f("Unable to obtain ZoneOffset from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static ZoneOffset l0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            j$.nio.file.k.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                j$.nio.file.k.h("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                j$.nio.file.k.h("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            j$.nio.file.k.h("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            j$.nio.file.k.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            j$.nio.file.k.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m0((i2 * 60) + (i * 3600) + i3);
        }
        j$.nio.file.k.h("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    public static ZoneOffset m0(int i) {
        if (i < -64800 || i > 64800) {
            j$.nio.file.k.h("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
            e.putIfAbsent(zoneOffset2.c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i);
    }

    public ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    @Override // j$.time.ZoneId
    public final String q() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return super.l(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return pVar.Z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(d dVar) {
        return (dVar == j$.time.temporal.q.d || dVar == j$.time.temporal.q.e) ? this : super.b(dVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l e(j$.time.temporal.l lVar) {
        return lVar.c(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void g0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        p0(dataOutput);
    }

    public final void p0(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static ZoneOffset o0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? m0(dataInput.readInt()) : m0(b * 900);
    }
}
