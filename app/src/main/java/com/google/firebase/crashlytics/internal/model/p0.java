package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j2 {
    public final long a;
    public final String b;
    public final d2 c;
    public final e2 d;
    public final f2 e;
    public final i2 f;

    public p0(long j, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.a = j;
        this.b = str;
        this.c = d2Var;
        this.d = e2Var;
        this.e = f2Var;
        this.f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.a = this.a;
        o0Var.b = this.b;
        o0Var.c = this.c;
        o0Var.d = this.d;
        o0Var.e = this.e;
        o0Var.f = this.f;
        o0Var.g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            if (this.a == p0Var.a && this.b.equals(p0Var.b) && this.c.equals(p0Var.c) && this.d.equals(p0Var.d)) {
                f2 f2Var = p0Var.e;
                f2 f2Var2 = this.e;
                if (f2Var2 != null ? f2Var2.equals(f2Var) : f2Var == null) {
                    i2 i2Var = p0Var.f;
                    i2 i2Var2 = this.f;
                    if (i2Var2 != null ? i2Var2.equals(i2Var) : i2Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        f2 f2Var = this.e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
