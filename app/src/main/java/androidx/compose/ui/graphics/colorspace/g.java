package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public final c a;
    public final c b;
    public final c c;
    public final float[] d;

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i) {
        float[] fArr;
        long j = cVar.b;
        long j2 = b.a;
        c cVarA = b.a(j, j2) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.b, j2) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean zA = b.a(cVar.b, j2);
            boolean zA2 = b.a(cVar2.b, j2);
            if (!(zA && zA2) && (zA || zA2)) {
                s sVar = ((q) (zA ? cVar : cVar2)).d;
                float[] fArrA = j.e;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }

    public long a(long j) {
        float fH = t.h(j);
        float fG = t.g(j);
        float fE = t.e(j);
        float fD = t.d(j);
        c cVar = this.b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = fArr;
    }
}
