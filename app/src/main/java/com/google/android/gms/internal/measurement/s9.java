package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<s9> CREATOR = new k6(5);
    public final byte[][] A;
    public final byte[][] B;
    public final byte[][] C;
    public final int[] D;
    public final byte[][] E;
    public final int[] F;
    public final byte[][] G;
    public final String e;
    public final byte[] y;
    public final byte[][] z;

    public s9(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.e = str;
        this.y = bArr;
        this.z = bArr2;
        this.A = bArr3;
        this.B = bArr4;
        this.C = bArr5;
        this.D = iArr;
        this.E = bArr6;
        this.F = iArr2;
        this.G = bArr7;
    }

    public static void d(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            com.google.android.gms.common.internal.x.g(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set f(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(com.google.common.collect.q.d(length));
        for (byte[] bArr2 : bArr) {
            com.google.android.gms.common.internal.x.g(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List h(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new w9(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set e() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.E;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.y;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return f((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object hashSet;
        Object hashSet2;
        int length;
        int length2;
        if (obj instanceof s9) {
            s9 s9Var = (s9) obj;
            if (wf.c(this.e, s9Var.e) && wf.c(e(), s9Var.e()) && wf.c(f(this.z), f(s9Var.z)) && wf.c(f(this.A), f(s9Var.A)) && wf.c(f(this.B), f(s9Var.B)) && wf.c(f(this.C), f(s9Var.C))) {
                int[] iArr = this.D;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    hashSet = new HashSet(com.google.common.collect.q.d(length2));
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = s9Var.D;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    hashSet2 = new HashSet(com.google.common.collect.q.d(length));
                    for (int i2 : iArr2) {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                }
                if (wf.c(hashSet, hashSet2) && wf.c(h(this.F), h(s9Var.F)) && wf.c(f(this.G), f(s9Var.G))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.e;
        sb.append(str == null ? "null" : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.y;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        d(sb, "GAIA=", this.z);
        sb.append(", ");
        d(sb, "PSEUDO=", this.A);
        sb.append(", ");
        d(sb, "ALWAYS=", this.B);
        sb.append(", ");
        d(sb, "OTHER=", this.C);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.D));
        sb.append(", ");
        d(sb, "directs=", this.E);
        sb.append(", genDims=");
        sb.append(Arrays.toString(h(this.F).toArray()));
        sb.append(", ");
        d(sb, "external=", this.G);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 2, this.e);
        androidx.room.r.y(parcel, 3, this.y);
        androidx.room.r.z(parcel, 4, this.z);
        androidx.room.r.z(parcel, 5, this.A);
        androidx.room.r.z(parcel, 6, this.B);
        androidx.room.r.z(parcel, 7, this.C);
        androidx.room.r.B(parcel, 8, this.D);
        androidx.room.r.z(parcel, 9, this.E);
        androidx.room.r.B(parcel, 10, this.F);
        androidx.room.r.z(parcel, 11, this.G);
        androidx.room.r.I(parcel, iH);
    }
}
