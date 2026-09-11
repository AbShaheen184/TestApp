package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends r0 {
    public final int A;
    public final int B;
    public final byte[] z;

    public q0(byte[] bArr, int i, int i2) {
        t0.n(i, i + i2, bArr.length);
        this.z = bArr;
        this.A = i;
        this.B = i2;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final byte b(int i) {
        return this.z[this.A + i];
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final int c() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final r0 d(int i, int i2) {
        int iN = t0.n(i, i2, this.B);
        if (iN == 0) {
            return t0.y;
        }
        return new q0(this.z, this.A + i, iN);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.z, this.A, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void f(z0 z0Var) {
        z0Var.c(this.z, this.A, this.B);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final boolean h(t0 t0Var) {
        boolean z = t0Var instanceof s0;
        if (!z && !(t0Var instanceof q0)) {
            return t0Var.h(this);
        }
        int iC = t0Var.c();
        int i = this.B;
        if (i > iC) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= t0Var.c()) {
            byte[] bArr = this.z;
            int i2 = this.A;
            if (z) {
                return t0.o(bArr, i2, ((s0) t0Var).z, 0, i);
            }
            if (!(t0Var instanceof q0)) {
                return t0Var.d(0, i).equals(d(i2, i + i2));
            }
            q0 q0Var = (q0) t0Var;
            return t0.o(bArr, i2, q0Var.z, q0Var.A, i);
        }
        int iC2 = t0Var.c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iC2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(iC2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final int i(int i, int i2) {
        return p1.a(i, this.z, this.A, i2);
    }
}
