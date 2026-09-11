package androidx.compose.ui.unit.fontscaling;

import androidx.collection.t;
import androidx.collection.z0;
import androidx.compose.ui.unit.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile z0 b = new z0(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f) {
        float fD;
        a cVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        a aVar = (a) b.c(i);
        if (aVar != null) {
            return aVar;
        }
        z0 z0Var = b;
        if (z0Var.e) {
            t.a(z0Var);
        }
        int iA = androidx.collection.internal.a.a(z0Var.y, z0Var.A, i);
        if (iA >= 0) {
            return (a) b.g(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f});
            b(f, cVar2);
            return cVar2;
        }
        if (i3 < 0) {
            cVar = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = b.d(i3) / 100.0f;
            cVar = (a) b.g(i3);
        }
        float fD2 = b.d(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVar2 = (a) b.g(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = cVar.b(f2);
            fArr2[i4] = ((aVar2.b(f2) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f, cVar3);
        return cVar3;
    }

    public static void b(float f, c cVar) {
        synchronized (c) {
            z0 z0VarClone = b.clone();
            z0VarClone.e((int) (f * 100.0f), cVar);
            b = z0VarClone;
        }
    }
}
