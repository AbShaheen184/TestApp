package androidx.media3.extractor.mkv;

import android.util.SparseArray;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.j;
import androidx.media3.extractor.z;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0 {
    public final j a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public c(SparseArray sparseArray, long j, int i, long j2, long j3) {
        j jVar;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            jVar = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = (b) list.get(i4);
                jArrCopyOf3[i4] = bVar.e;
                jArrCopyOf[i4] = bVar.y;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                androidx.media3.common.util.c.t("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            jVar = new j(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = jVar;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.e(j);
        }
        b0 b0Var = b0.c;
        return new z(b0Var, b0Var);
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.c;
    }
}
