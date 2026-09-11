package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends b2 {
    public final List a;
    public final x1 b;
    public final p1 c;
    public final u0 d;
    public final List e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.a = list;
        this.b = t0Var;
        this.c = p1Var;
        this.d = u0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.a;
        if (list == null) {
            if (((r0) b2Var).a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).a)) {
            return false;
        }
        x1 x1Var = this.b;
        if (x1Var == null) {
            if (((r0) b2Var).b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).b)) {
            return false;
        }
        p1 p1Var = this.c;
        if (p1Var == null) {
            if (((r0) b2Var).c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.d.equals(r0Var.d) && this.e.equals(r0Var.e);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return coil3.compose.internal.f.f(sb, this.e, "}");
    }
}
