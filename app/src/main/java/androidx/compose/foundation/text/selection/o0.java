package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.t2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ o0(int i, ArrayList arrayList) {
        this.e = i;
        this.y = arrayList;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.ui.layout.b1.i(b1Var, (androidx.compose.ui.layout.c1) arrayList.get(i), 0, 0);
                }
                break;
            default:
                androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                dVar.getClass();
                char c = ' ';
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
                long j = 4294967295L;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                float f = 4;
                float fV = (fIntBitsToFloat - (dVar.V(f) * 47)) / 48;
                float fV2 = dVar.V(f);
                int i2 = 0;
                for (int i3 = 48; i2 < i3; i3 = 48) {
                    float fFloatValue = ((Number) ((t2) this.y.get(i2)).getValue()).floatValue();
                    float f2 = fFloatValue * fIntBitsToFloat2 * 0.4f;
                    float fV3 = dVar.V(f);
                    float f3 = f2 < fV3 ? fV3 : f2;
                    float f4 = (fV + fV2) * i2;
                    float f5 = 2;
                    float f6 = (fIntBitsToFloat2 - f3) / f5;
                    long j2 = com.app.mlounge.ui.theme.b.h;
                    long jB = androidx.compose.ui.graphics.t.b(fFloatValue * 0.1f, j2);
                    char c2 = c;
                    long j3 = j;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4 - dVar.V(f5))) << c2) | (((long) Float.floatToRawIntBits(f6 - dVar.V(f5))) & j3);
                    androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(dVar.V(f) + fV)) << c2) | (((long) Float.floatToRawIntBits(dVar.V(f) + f3)) & j3);
                    float f7 = fV / f5;
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << c2) | (((long) Float.floatToRawIntBits(f7)) & j3);
                    if ((240 & 2) != 0) {
                        jFloatToRawIntBits = 0;
                    }
                    float f8 = fIntBitsToFloat2;
                    float f9 = f;
                    int i4 = i2;
                    dVar = dVar2;
                    dVar.r(jB, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (240 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.g.a : null);
                    androidx.compose.ui.graphics.drawscope.d.z(dVar, com.google.android.material.shape.g.l(com.google.common.base.c.q(new androidx.compose.ui.graphics.t(j2), new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.f)), f6, f6 + f3, 8), (((long) Float.floatToRawIntBits(f4)) << c2) | (((long) Float.floatToRawIntBits(f6)) & j3), (((long) Float.floatToRawIntBits(fV)) << c2) | (((long) Float.floatToRawIntBits(f3)) & j3), (((long) Float.floatToRawIntBits(f7)) << c2) | (((long) Float.floatToRawIntBits(f7)) & j3), null, 240);
                    i2 = i4 + 1;
                    fIntBitsToFloat2 = f8;
                    f = f9;
                    c = c2;
                    j = j3;
                }
                break;
        }
        return kotlin.y.a;
    }
}
