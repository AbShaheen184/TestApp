package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o f = new o((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public o(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(e2.class);
        this.e = enumMap;
        enumMap.put(e2.AD_USER_DATA, bool == null ? c2.UNINITIALIZED : bool.booleanValue() ? c2.GRANTED : c2.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(e2.class);
        e2[] e2VarArr = d2.DMA.e;
        int length = e2VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(e2VarArr[i3], f2.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new o(enumMap, i, (Boolean) null, (String) null);
    }

    public static o c(int i, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(e2.class);
        for (e2 e2Var : d2.DMA.e) {
            enumMap.put(e2Var, f2.d(bundle.getString(e2Var.e)));
        }
        return new o(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final c2 a() {
        c2 c2Var = (c2) this.e.get(e2.AD_USER_DATA);
        return c2Var == null ? c2.UNINITIALIZED : c2Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (e2 e2Var : d2.DMA.e) {
            sb.append(":");
            sb.append(f2.h((c2) this.e.get(e2Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.b.equalsIgnoreCase(oVar.b) && Objects.equals(this.c, oVar.c)) {
            return Objects.equals(this.d, oVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * Token.CATCH) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(f2.a(this.a));
        for (e2 e2Var : d2.DMA.e) {
            sb.append(",");
            sb.append(e2Var.e);
            sb.append("=");
            c2 c2Var = (c2) this.e.get(e2Var);
            if (c2Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = c2Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public o(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(e2.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
