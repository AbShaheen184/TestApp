package kotlin.text;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, kotlin.jvm.internal.markers.a {
    public kotlin.ranges.d A;
    public int B;
    public final /* synthetic */ c C;
    public int e = -1;
    public int y;
    public int z;

    public b(c cVar) {
        this.C = cVar;
        int iC = com.google.android.material.resources.c.c(0, 0, cVar.a.length());
        this.y = iC;
        this.z = iC;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    public final void b() {
        kotlin.k kVar;
        c cVar = this.C;
        CharSequence charSequence = cVar.a;
        int i = this.z;
        if (i < 0) {
            this.e = 0;
            this.A = null;
            return;
        }
        int i2 = cVar.b;
        if (i2 > 0) {
            int i3 = this.B + 1;
            this.B = i3;
            if (i3 >= i2) {
                int i4 = this.y;
                charSequence.getClass();
                this.A = new kotlin.ranges.d(i4, charSequence.length() - 1, 1);
                this.z = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.y;
                charSequence.getClass();
                this.A = new kotlin.ranges.d(i5, charSequence.length() - 1, 1);
                this.z = -1;
            } else {
                kVar = (kotlin.k) cVar.c.invoke(charSequence, Integer.valueOf(this.z));
                if (kVar == null) {
                    int i6 = this.y;
                    charSequence.getClass();
                    this.A = new kotlin.ranges.d(i6, charSequence.length() - 1, 1);
                    this.z = -1;
                } else {
                    int iIntValue = ((Number) kVar.e).intValue();
                    int iIntValue2 = ((Number) kVar.y).intValue();
                    this.A = com.google.android.material.resources.c.r(this.y, iIntValue);
                    int i7 = iIntValue + iIntValue2;
                    this.y = i7;
                    this.z = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.y;
            charSequence.getClass();
            this.A = new kotlin.ranges.d(i8, charSequence.length() - 1, 1);
            this.z = -1;
        } else {
            kVar = (kotlin.k) cVar.c.invoke(charSequence, Integer.valueOf(this.z));
            if (kVar == null) {
                int i9 = this.y;
                charSequence.getClass();
                this.A = new kotlin.ranges.d(i9, charSequence.length() - 1, 1);
                this.z = -1;
            } else {
                int iIntValue3 = ((Number) kVar.e).intValue();
                int iIntValue4 = ((Number) kVar.y).intValue();
                this.A = com.google.android.material.resources.c.r(this.y, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.y = i10;
                this.z = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == -1) {
            b();
        }
        return this.e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e == -1) {
            b();
        }
        if (this.e == 0) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        kotlin.ranges.d dVar = this.A;
        dVar.getClass();
        this.A = null;
        this.e = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
