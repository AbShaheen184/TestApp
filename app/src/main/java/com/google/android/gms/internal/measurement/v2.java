package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends w2 {
    @Override // com.google.android.gms.internal.measurement.w2
    public final void b(Object obj, long j, byte b) {
        if (x2.f) {
            x2.b(obj, j, b);
        } else {
            x2.c(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final boolean d(long j, Object obj) {
        return x2.f ? x2.n(j, obj) : x2.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void g(Object obj, long j, boolean z) {
        if (x2.f) {
            x2.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            x2.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final float h(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void j(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final double k(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void l(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
