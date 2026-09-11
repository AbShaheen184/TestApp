package androidx.media3.extractor.mp4;

import androidx.media3.extractor.a0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a0 {
    public final long a;
    public final l[] b;
    public final int c;

    public k(long j, l[] lVarArr, int i) {
        this.a = j;
        this.b = lVarArr;
        this.c = i;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        long j2;
        long jMin;
        long j3;
        long j4;
        long j5;
        int iB;
        long j6 = j;
        l[] lVarArr = this.b;
        int length = lVarArr.length;
        b0 b0Var = b0.c;
        if (length == 0) {
            return new z(b0Var, b0Var);
        }
        int i = this.c;
        int i2 = -1;
        if (i != -1) {
            u uVar = lVarArr[i].b;
            int iA = uVar.a(j6);
            if (iA == -1) {
                iA = uVar.b(j6);
            }
            long[] jArr = uVar.c;
            long[] jArr2 = uVar.f;
            if (iA == -1) {
                return new z(b0Var, b0Var);
            }
            long j7 = jArr2[iA];
            j2 = jArr[iA];
            if (j7 >= j6 || iA >= uVar.b - 1 || (iB = uVar.b(j6)) == -1 || iB == iA) {
                j5 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = jArr2[iB];
                j5 = jArr[iB];
            }
            jMin = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            jMin = -1;
            j3 = -9223372036854775807L;
        }
        int i3 = 0;
        long jMin2 = j2;
        while (i3 < lVarArr.length) {
            if (i3 != i) {
                u uVar2 = lVarArr[i3].b;
                long[] jArr3 = uVar2.c;
                int iA2 = uVar2.a(j6);
                if (iA2 == i2) {
                    iA2 = uVar2.b(j6);
                }
                if (iA2 != i2) {
                    jMin2 = Math.min(jArr3[iA2], jMin2);
                }
                if (j3 != -9223372036854775807L) {
                    int iA3 = uVar2.a(j4);
                    if (iA3 == -1) {
                        j4 = j3;
                        iA3 = uVar2.b(j4);
                    }
                    if (iA3 == -1) {
                        j3 = j4;
                    } else {
                        j3 = j4;
                        jMin = Math.min(jArr3[iA3], jMin);
                    }
                }
            } else {
                j3 = j3;
            }
            i3++;
            j3 = j3;
            i2 = -1;
        }
        long j8 = j3;
        b0 b0Var2 = new b0(j6, jMin2);
        return j8 == -9223372036854775807L ? new z(b0Var2, b0Var2) : new z(b0Var2, new b0(j8, jMin));
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.a;
    }
}
