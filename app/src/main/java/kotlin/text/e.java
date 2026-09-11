package kotlin.text;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, kotlin.jvm.internal.markers.a {
    public int A;
    public int B;
    public final CharSequence e;
    public int y;
    public int z;

    public e(CharSequence charSequence) {
        charSequence.getClass();
        this.e = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.y;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.B < 0) {
            this.y = 2;
            return false;
        }
        CharSequence charSequence = this.e;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.z; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.y = 1;
                this.B = i;
                this.A = length;
                return true;
            }
        }
        i = -1;
        this.y = 1;
        this.B = i;
        this.A = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.y = 0;
        int i = this.A;
        int i2 = this.z;
        this.z = this.B + i;
        return this.e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
