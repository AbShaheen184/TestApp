package com.google.android.datatransport.runtime;

import androidx.compose.ui.node.a1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final Integer b;
    public final k c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public h(String str, Integer num, k kVar, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = kVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a1 c() {
        a1 a1Var = new a1();
        String str = this.a;
        if (str == null) {
            com.google.gson.b.h("Null transportName");
            return null;
        }
        a1Var.b = str;
        a1Var.c = this.b;
        a1Var.h = this.g;
        a1Var.i = this.h;
        a1Var.j = this.i;
        a1Var.k = this.j;
        k kVar = this.c;
        if (kVar == null) {
            com.google.gson.b.h("Null encodedPayload");
            return null;
        }
        a1Var.d = kVar;
        a1Var.e = Long.valueOf(this.d);
        a1Var.f = Long.valueOf(this.e);
        a1Var.g = new HashMap(this.f);
        return a1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a.equals(hVar.a)) {
                Integer num = hVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(hVar.c) && this.d == hVar.d && this.e == hVar.e && this.f.equals(hVar.f)) {
                        Integer num3 = hVar.g;
                        Integer num4 = this.g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = hVar.h;
                            String str2 = this.h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.i, hVar.i) && Arrays.equals(this.j, hVar.j)) {
                                    return true;
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
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
