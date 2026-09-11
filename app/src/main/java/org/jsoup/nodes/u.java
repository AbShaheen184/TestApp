package org.jsoup.nodes;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u c;
    public final t a;
    public final t b;

    static {
        t tVar = new t(-1, -1, -1);
        c = new u(tVar, tVar);
    }

    public u(t tVar, t tVar2) {
        this.a = tVar;
        this.b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.a.equals(uVar.a)) {
            return this.b.equals(uVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + "-" + this.b;
    }
}
