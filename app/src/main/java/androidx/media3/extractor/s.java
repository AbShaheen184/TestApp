package androidx.media3.extractor;

import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class s implements a0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public s(long j, long j2) {
        this.a = 1;
        this.b = j;
        b0 b0Var = j2 == 0 ? b0.c : new b0(0L, j2);
        this.c = new z(b0Var, b0Var);
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        switch (this.a) {
            case 0:
                t tVar = (t) this.c;
                tVar.k.getClass();
                androidx.media3.common.util.b bVar = tVar.k;
                long[] jArr = (long[]) bVar.y;
                long[] jArr2 = (long[]) bVar.z;
                int iF = j0.f(jArr, j0.k((((long) tVar.e) * j) / 1000000, 0L, tVar.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i = tVar.e;
                long j4 = (j2 * 1000000) / ((long) i);
                long j5 = this.b;
                b0 b0Var = new b0(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new z(b0Var, b0Var);
                }
                int i2 = iF + 1;
                return new z(b0Var, new b0((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
            case 1:
                return (z) this.c;
            default:
                androidx.media3.extractor.avi.b bVar2 = (androidx.media3.extractor.avi.b) this.c;
                z zVarB = bVar2.i[0].b(j);
                int i3 = 1;
                while (true) {
                    androidx.media3.extractor.avi.e[] eVarArr = bVar2.i;
                    if (i3 >= eVarArr.length) {
                        return zVarB;
                    }
                    z zVarB2 = eVarArr[i3].b(j);
                    if (zVarB2.a.b < zVarB.a.b) {
                        zVarB = zVarB2;
                    }
                    i3++;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        switch (this.a) {
            case 0:
                return ((t) this.c).b();
            case 1:
                return this.b;
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(long j) {
        this(j, 0L);
        this.a = 1;
    }

    public /* synthetic */ s(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
