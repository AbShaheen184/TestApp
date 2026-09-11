package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<o4> CREATOR = new v(5);
    public final Long A;
    public final String B;
    public final String C;
    public final Double D;
    public final int e;
    public final String y;
    public final long z;

    public o4(long j, Object obj, String str, String str2) {
        com.google.android.gms.common.internal.x.d(str);
        this.e = 2;
        this.y = str;
        this.z = j;
        this.C = str2;
        if (obj == null) {
            this.A = null;
            this.D = null;
            this.B = null;
            return;
        }
        if (obj instanceof Long) {
            this.A = (Long) obj;
            this.D = null;
            this.B = null;
        } else if (obj instanceof String) {
            this.A = null;
            this.D = null;
            this.B = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                net.luminis.tls.engine.impl.c.o("User attribute given of un-supported type");
                throw null;
            }
            this.A = null;
            this.D = (Double) obj;
            this.B = null;
        }
    }

    public final Object d() {
        Long l = this.A;
        if (l != null) {
            return l;
        }
        Double d = this.D;
        if (d != null) {
            return d;
        }
        String str = this.B;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v.b(this, parcel);
    }

    public o4(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.e = i;
        this.y = str;
        this.z = j;
        this.A = l;
        this.D = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.B = str2;
        this.C = str3;
    }

    public o4(p4 p4Var) {
        this(p4Var.d, p4Var.e, p4Var.c, p4Var.b);
    }
}
