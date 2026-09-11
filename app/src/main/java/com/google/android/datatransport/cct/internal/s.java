package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e0 {
    public final long a;
    public final Integer b;
    public final a0 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final i0 h;
    public final b0 i;

    public s(long j, Integer num, a0 a0Var, long j2, byte[] bArr, String str, long j3, i0 i0Var, b0 b0Var) {
        this.a = j;
        this.b = num;
        this.c = a0Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            if (this.a == sVar.a) {
                Integer num = sVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    a0 a0Var = sVar.c;
                    a0 a0Var2 = this.c;
                    if (a0Var2 != null ? a0Var2.equals(a0Var) : a0Var == null) {
                        if (this.d == sVar.d) {
                            if (Arrays.equals(this.e, e0Var instanceof s ? ((s) e0Var).e : sVar.e)) {
                                String str = sVar.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == sVar.g) {
                                        i0 i0Var = sVar.h;
                                        i0 i0Var2 = this.h;
                                        if (i0Var2 != null ? i0Var2.equals(i0Var) : i0Var == null) {
                                            b0 b0Var = sVar.i;
                                            b0 b0Var2 = this.i;
                                            if (b0Var2 != null ? b0Var2.equals(b0Var) : b0Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        int iHashCode5 = (i2 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
