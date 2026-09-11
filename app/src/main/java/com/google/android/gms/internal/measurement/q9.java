package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q9> CREATOR = new k6(3);
    public final p9[] A;
    public final TreeMap B = new TreeMap();
    public final boolean C;
    public final long D;
    public final String e;
    public final byte[] y;
    public final String z;

    public q9(String str, String str2, p9[] p9VarArr, boolean z, byte[] bArr, long j) {
        this.e = str;
        this.z = str2;
        this.A = p9VarArr;
        this.C = z;
        this.y = bArr;
        this.D = j;
        for (p9 p9Var : p9VarArr) {
            this.B.put(Integer.valueOf(p9Var.e), p9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return wf.c(this.e, q9Var.e) && wf.c(this.z, q9Var.z) && this.B.equals(q9Var.B) && this.C == q9Var.C && Arrays.equals(this.y, q9Var.y) && this.D == q9Var.D;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.z, this.B, Boolean.valueOf(this.C), this.y, Long.valueOf(this.D)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.e);
        sb.append("', '");
        sb.append(this.z);
        sb.append("', (");
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            sb.append((p9) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.C);
        sb.append(", ");
        byte[] bArr = this.y;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 2, this.e);
        androidx.room.r.D(parcel, 3, this.z);
        androidx.room.r.E(parcel, 4, this.A, i);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.C ? 1 : 0);
        androidx.room.r.y(parcel, 6, this.y);
        androidx.room.r.G(parcel, 7, 8);
        parcel.writeLong(this.D);
        androidx.room.r.I(parcel, iH);
    }
}
