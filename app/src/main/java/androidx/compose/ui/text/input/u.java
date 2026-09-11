package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {
    public final int a;
    public final int b;

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        boolean z = hVar.A != -1;
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) hVar.C;
        if (z) {
            hVar.A = -1;
            hVar.B = -1;
        }
        int iC = com.google.android.material.resources.c.c(this.a, 0, eVar.s());
        int iC2 = com.google.android.material.resources.c.c(this.b, 0, eVar.s());
        if (iC != iC2) {
            if (iC < iC2) {
                hVar.f(iC, iC2);
            } else {
                hVar.f(iC2, iC);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
