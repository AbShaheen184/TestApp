package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r0 {
    public final byte[] z;

    public s0(byte[] bArr) {
        bArr.getClass();
        this.z = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final byte b(int i) {
        return this.z[i];
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final int c() {
        return this.z.length;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final r0 d(int i, int i2) {
        byte[] bArr = this.z;
        int iN = t0.n(0, i2, bArr.length);
        return iN == 0 ? t0.y : new q0(bArr, 0, iN);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.z, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void f(z0 z0Var) {
        byte[] bArr = this.z;
        z0Var.c(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final boolean h(t0 t0Var) {
        boolean z = t0Var instanceof s0;
        byte[] bArr = this.z;
        if (z) {
            return Arrays.equals(bArr, ((s0) t0Var).z);
        }
        boolean z2 = t0Var instanceof q0;
        if (!z2) {
            return t0Var.h(this);
        }
        q0 q0Var = (q0) t0Var;
        int i = q0Var.B;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return t0.o(bArr, 0, ((s0) t0Var).z, 0, length);
            }
            return z2 ? t0.o(bArr, 0, q0Var.z, q0Var.A, length) : t0Var.d(0, length).equals(d(0, length));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final int i(int i, int i2) {
        return p1.a(i, this.z, 0, i2);
    }
}
