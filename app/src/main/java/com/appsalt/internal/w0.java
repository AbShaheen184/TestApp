package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends s1 {
    public final String a;
    public final int b;

    public w0(int i) {
        super("");
        this.a = "";
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.l.a(this.a, w0Var.a) && this.b == w0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : androidx.constraintlayout.core.g.e(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Close(proxyId=");
        sb.append(this.a);
        sb.append(", reason=");
        switch (this.b) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "LOST_CONNECTION";
                break;
            case 3:
                str = "UNABLE_TO_RESOLVE_HOSTNAME";
                break;
            case 4:
                str = "REQUEST_DUPLICATE";
                break;
            case 5:
                str = "UNEXPECTED_ERROR";
                break;
            case 6:
                str = "FAILED_CONNECT_TO_TARGET";
                break;
            case 7:
                str = "UNEXPECTED_COMMAND";
                break;
            case 8:
                str = "REQUEST_NOT_FOUND";
                break;
            case 9:
                str = "REQUEST_LIMIT_REACHED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public w0(String str, int i) {
        super(str);
        this.a = str;
        this.b = i;
    }
}
