package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.k;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.u()) {
            if (localDateTime.O(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.O(bVar.b.k0(bVar.d.b - bVar.c.b))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.O(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.O(bVar.b.k0(bVar.d.b - bVar.c.b))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                boolean zU = bVar.u();
                LocalDateTime localDateTime = bVar.b;
                if (zU) {
                    arrayList.add(localDateTime);
                    arrayList.add(bVar.b.k0(bVar.d.b - bVar.c.b));
                } else {
                    arrayList.add(localDateTime.k0(bVar.d.b - bVar.c.b));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.m0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.o0(Math.floorDiv(j2 + ((long) zoneOffset.b), 86400)).a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long j2 = instant.a;
        if (this.f.length > 0 && j2 > jArr[jArr.length - 1]) {
            ZoneOffset[] zoneOffsetArr = this.e;
            b[] bVarArrB = b(c(j2, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                bVar = bVarArrB[i2];
                if (j2 < bVar.a) {
                    return bVar.c;
                }
            }
            return bVar.d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.u() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.o(new Object[]{bVar.c, bVar.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.u(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.b.p0() <= r0.b.p0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i2) {
        LocalDate localDateI;
        b[] bVarArr = l;
        Integer numValueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate localDateN0 = LocalDate.n0(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.j0(0);
            long jC = new LocalDateTime(localDateN0, j$.time.i.h[0]).C(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(jC * 1000);
            long j4 = 31968000 + jC;
            while (jC < j4) {
                long j5 = jC + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - jC > j2) {
                        long jFloorDiv = Math.floorDiv(j5 + jC, 2L);
                        if (this.g.getOffset(jFloorDiv * j6) == offset) {
                            jC = jFloorDiv;
                        } else {
                            j5 = jFloorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(jC * j6) == offset) {
                        jC = j5;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = this.g.getOffset(jC * j6);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(jC, zoneOffsetH2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jC, zoneOffsetH, zoneOffsetH2);
                    }
                    offset = offset2;
                } else {
                    jC = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            byte b = eVar.b;
            k kVar = eVar.a;
            if (b < 0) {
                long j7 = i2;
                int I = kVar.I(s.c.h0(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.j0(j7);
                j$.time.temporal.a.DAY_OF_MONTH.j0(I);
                localDateI = LocalDate.I(i2, kVar.getValue(), I);
                j$.time.c cVar = eVar.c;
                if (cVar != null) {
                    localDateI = localDateI.k(new n(cVar.getValue(), i4));
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.j0(i2);
                j$.time.temporal.a.DAY_OF_MONTH.j0(b);
                localDateI = LocalDate.I(i2, kVar.getValue(), b);
                j$.time.c cVar2 = eVar.c;
                if (cVar2 != null) {
                    localDateI = localDateI.k(new n(cVar2.getValue(), i3));
                }
            }
            if (eVar.e) {
                localDateI = localDateI.r0(1L);
            }
            LocalDateTime localDateTimeR = LocalDateTime.R(localDateI, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i6 = c.a[dVar.ordinal()];
            if (i6 == 1) {
                localDateTimeR = localDateTimeR.k0(zoneOffset2.b - ZoneOffset.UTC.b);
            } else if (i6 == 2) {
                localDateTimeR = localDateTimeR.k0(zoneOffset2.b - zoneOffset.b);
            }
            bVarArr3[i5] = new b(localDateTimeR, eVar.h, eVar.i);
            i5++;
            i3 = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else if (this.c.length != 0) {
            int iBinarySearch = Arrays.binarySearch(this.a, instant.a);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetH = this.b[iBinarySearch + 1];
        } else {
            zoneOffsetH = this.b[0];
        }
        return !zoneOffsetH.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
