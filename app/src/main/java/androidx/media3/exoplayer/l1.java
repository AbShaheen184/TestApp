package androidx.media3.exoplayer;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements o0 {
    public final Object A;
    public Object B;
    public long e;
    public boolean y;
    public long z;

    public l1(com.google.android.gms.measurement.internal.g1 g1Var, String str, long j) {
        Objects.requireNonNull(g1Var);
        this.B = g1Var;
        com.google.android.gms.common.internal.x.d(str);
        this.A = str;
        this.e = j;
    }

    @Override // androidx.media3.exoplayer.o0
    public void a(androidx.media3.common.l0 l0Var) {
        if (this.y) {
            d(b());
        }
        this.B = l0Var;
    }

    @Override // androidx.media3.exoplayer.o0
    public long b() {
        long j = this.e;
        if (!this.y) {
            return j;
        }
        ((androidx.media3.common.util.e0) this.A).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.z;
        androidx.media3.common.l0 l0Var = (androidx.media3.common.l0) this.B;
        return (l0Var.a == 1.0f ? androidx.media3.common.util.j0.Q(jElapsedRealtime) : jElapsedRealtime * ((long) l0Var.c)) + j;
    }

    public void d(long j) {
        this.e = j;
        if (this.y) {
            ((androidx.media3.common.util.e0) this.A).getClass();
            this.z = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.o0
    public androidx.media3.common.l0 e() {
        return (androidx.media3.common.l0) this.B;
    }

    public void f() {
        if (this.y) {
            return;
        }
        ((androidx.media3.common.util.e0) this.A).getClass();
        this.z = SystemClock.elapsedRealtime();
        this.y = true;
    }

    public long g() {
        if (!this.y) {
            this.y = true;
            com.google.android.gms.measurement.internal.g1 g1Var = (com.google.android.gms.measurement.internal.g1) this.B;
            this.z = g1Var.z().getLong((String) this.A, this.e);
        }
        return this.z;
    }

    public void h(long j) {
        SharedPreferences.Editor editorEdit = ((com.google.android.gms.measurement.internal.g1) this.B).z().edit();
        editorEdit.putLong((String) this.A, j);
        editorEdit.apply();
        this.z = j;
    }

    public l1(androidx.media3.common.util.e0 e0Var) {
        this.A = e0Var;
        this.B = androidx.media3.common.l0.d;
    }
}
