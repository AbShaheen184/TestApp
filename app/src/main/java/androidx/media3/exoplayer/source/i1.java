package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final i1 d = new i1(new androidx.media3.common.w0[0]);
    public final int a;
    public final com.google.common.collect.a1 b;
    public int c;

    static {
        androidx.media3.common.util.j0.K(0);
    }

    public i1(androidx.media3.common.w0... w0VarArr) {
        com.google.common.collect.a1 a1VarP = com.google.common.collect.h0.p(w0VarArr);
        this.b = a1VarP;
        this.a = w0VarArr.length;
        int i = 0;
        while (i < a1VarP.A) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < a1VarP.A; i3++) {
                if (((androidx.media3.common.w0) a1VarP.get(i)).equals(a1VarP.get(i3))) {
                    androidx.media3.common.util.c.g("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final androidx.media3.common.w0 a(int i) {
        return (androidx.media3.common.w0) this.b.get(i);
    }

    public final int b(androidx.media3.common.w0 w0Var) {
        int iIndexOf = this.b.indexOf(w0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.a == i1Var.a && this.b.equals(i1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
