package androidx.media3.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c c = new c(new a[0]);
    public static final a d;
    public final int a;
    public final a[] b;

    static {
        a aVar = new a(-1, -1, new int[0], new c0[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        c0[] c0VarArr = (c0[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.b, iArrCopyOf, c0VarArr, jArrCopyOf, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
        androidx.media3.common.util.j0.K(3);
        androidx.media3.common.util.j0.K(4);
    }

    public c(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Arrays.equals(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
