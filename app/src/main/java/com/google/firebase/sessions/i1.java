package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final h1 Companion = new h1();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ i1(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.m0.e(i, 1, g1.a.d());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? ((long) 1000) * j : j2;
        if ((i & 4) == 0) {
            this.c = j / ((long) 1000);
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.a == ((i1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public i1(long j) {
        this.a = j;
        long j2 = 1000;
        this.b = j * j2;
        this.c = j / j2;
    }
}
