package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ n0(int i, int i2, androidx.compose.ui.layout.c1 c1Var) {
        this.e = 1;
        this.y = i;
        this.z = c1Var;
        this.A = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.b1.i((androidx.compose.ui.layout.b1) obj, (androidx.compose.ui.layout.c1) this.z, this.y, this.A);
                break;
            case 1:
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) this.z;
                androidx.compose.ui.layout.b1.i((androidx.compose.ui.layout.b1) obj, c1Var, kotlin.math.a.F((this.y - c1Var.e) / 2.0f), kotlin.math.a.F((this.A - c1Var.y) / 2.0f));
                break;
            default:
                androidx.compose.ui.graphics.j jVar = (androidx.compose.ui.graphics.j) this.z;
                androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) obj;
                androidx.compose.ui.text.a aVar = pVar.a;
                int iD = pVar.d(this.y);
                int iD2 = pVar.d(this.A);
                CharSequence charSequence = aVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("start(", ") or end(", iD, ") is out of range [0..", iD2);
                    sbW.append(charSequence.length());
                    sbW.append("], or start > end!");
                    androidx.compose.ui.text.internal.a.a(sbW.toString());
                }
                Path path = new Path();
                androidx.compose.ui.text.android.l lVar = aVar.d;
                lVar.f.getSelectionPath(iD, iD2, path);
                int i = lVar.h;
                if (i != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(pVar.f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                jVar.a.addPath(path, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n0(int i, int i2, int i3, Object obj) {
        this.e = i3;
        this.z = obj;
        this.y = i;
        this.A = i2;
    }
}
