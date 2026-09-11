package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements c1 {
    public final int[] a;
    public final float[] b;

    public d1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // androidx.compose.ui.platform.c1
    public void a(View view, float[] fArr) {
        androidx.compose.ui.graphics.f0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            androidx.compose.ui.graphics.f0.d(fArr2);
            androidx.compose.ui.graphics.f0.f(fArr2, f, f2);
            i0.o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            androidx.compose.ui.graphics.f0.d(fArr2);
            androidx.compose.ui.graphics.f0.f(fArr2, left, top);
            i0.o(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            androidx.compose.ui.graphics.f0.d(fArr2);
            androidx.compose.ui.graphics.f0.f(fArr2, f3, f4);
            i0.o(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            androidx.compose.ui.graphics.f0.d(fArr2);
            androidx.compose.ui.graphics.f0.f(fArr2, f5, f6);
            i0.o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        androidx.compose.ui.graphics.a0.u(matrix, fArr2);
        i0.o(fArr, fArr2);
    }

    public d1(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public d1(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public d1(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
