package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final q e;
    public final q f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.e = qVar;
        this.f = qVar2;
        float[] fArr = a.b.a;
        s sVar = qVar.d;
        float[] fArr2 = qVar.i;
        s sVar2 = qVar2.d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrG;
    }

    @Override // androidx.compose.ui.graphics.colorspace.g
    public final long a(long j) {
        float fH = t.h(j);
        float fG = t.g(j);
        float fE = t.e(j);
        float fD = t.d(j);
        m mVar = this.e.p;
        float fA = (float) mVar.a(fH);
        float fA2 = (float) mVar.a(fG);
        float fA3 = (float) mVar.a(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f2 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f3 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        q qVar = this.f;
        float fA4 = (float) qVar.m.a(f);
        m mVar2 = qVar.m;
        return a0.b(fA4, (float) mVar2.a(f2), (float) mVar2.a(f3), fD, qVar);
    }
}
