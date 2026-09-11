package com.app.mlounge.ui.screens.player;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.extractor.a0 {
    public final long a;
    public final long b;

    public c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final androidx.media3.extractor.z e(long j) {
        long j2 = this.a;
        if (j2 > 0) {
            long j3 = this.b;
            if (j3 > 0) {
                long jD = com.google.android.material.resources.c.d(j, 0L, j2);
                androidx.media3.extractor.b0 b0Var = new androidx.media3.extractor.b0(jD, com.google.android.material.resources.c.d(BigInteger.valueOf(j3).multiply(BigInteger.valueOf(jD)).divide(BigInteger.valueOf(this.a)).longValue(), 0L, this.b));
                return new androidx.media3.extractor.z(b0Var, b0Var);
            }
        }
        androidx.media3.extractor.b0 b0Var2 = new androidx.media3.extractor.b0(j, 0L);
        return new androidx.media3.extractor.z(b0Var2, b0Var2);
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.a;
    }
}
