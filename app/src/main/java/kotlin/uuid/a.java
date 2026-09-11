package kotlin.uuid;

import com.google.common.base.i;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Serializable {
    public static final a z = new a(0, 0);
    public final long e;
    public final long y;

    public a(long j, long j2) {
        this.e = j;
        this.y = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        long j = aVar.e;
        long j2 = this.e;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.y ^ Long.MIN_VALUE, aVar.y ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.e == aVar.e && this.y == aVar.y;
    }

    public final int hashCode() {
        return Long.hashCode(this.e ^ this.y);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        i.g(this.e, bArr, 0, 0, 4);
        bArr[8] = 45;
        i.g(this.e, bArr, 9, 4, 6);
        bArr[13] = 45;
        i.g(this.e, bArr, 14, 6, 8);
        bArr[18] = 45;
        i.g(this.y, bArr, 19, 0, 2);
        bArr[23] = 45;
        i.g(this.y, bArr, 24, 2, 8);
        return new String(bArr, kotlin.text.a.a);
    }
}
