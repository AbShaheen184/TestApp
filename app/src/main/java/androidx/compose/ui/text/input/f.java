package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {
    public final int a;
    public final int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(h hVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = hVar.y;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(hVar.b((i4 - i3) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.y - i3))) ? i + 2 : i3;
        }
        int iS = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iS + 1;
            int i7 = hVar.z;
            androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) hVar.C;
            if (i7 + i6 >= eVar.s()) {
                iS = eVar.s() - hVar.z;
                break;
            }
            iS = (Character.isHighSurrogate(hVar.b((hVar.z + i6) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.z + i6))) ? iS + 2 : i6;
        }
        int i8 = hVar.z;
        hVar.a(i8, iS + i8);
        int i9 = hVar.y;
        hVar.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
