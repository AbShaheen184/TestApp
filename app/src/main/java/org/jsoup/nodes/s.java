package org.jsoup.nodes;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final /* synthetic */ int c = 0;
    public final u a;
    public final u b;

    public s(u uVar, u uVar2) {
        this.a = uVar;
        this.b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.a.equals(sVar.a)) {
            return this.b.equals(sVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sbB = org.jsoup.internal.k.b();
        sbB.append(this.a);
        sbB.append('=');
        sbB.append(this.b);
        return org.jsoup.internal.k.l(sbB);
    }
}
