package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public final int a;
    public final int b;

    public g1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.a == g1Var.a && this.b == g1Var.b;
    }

    public final int hashCode() {
        return androidx.constraintlayout.core.g.e(this.b) + (androidx.constraintlayout.core.g.e(this.a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Action(protocol=");
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "QUIC";
        } else {
            str = "WS";
        }
        sb.append(str);
        sb.append(", type=");
        int i2 = this.b;
        if (i2 != 1) {
            str2 = i2 != 2 ? "null" : "SWITCH";
        } else {
            str2 = "RECONNECT";
        }
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }
}
