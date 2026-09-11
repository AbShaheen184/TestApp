package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {
    public final int a;
    public final int b;

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        int i = hVar.z;
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) hVar.C;
        int i2 = this.b;
        int iS = i + i2;
        if (((i ^ iS) & (i2 ^ iS)) < 0) {
            iS = eVar.s();
        }
        hVar.a(hVar.z, Math.min(iS, eVar.s()));
        int i3 = hVar.y;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        hVar.a(Math.max(0, i5), hVar.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
