package androidx.core.view;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {
    public final z1 a;
    public androidx.core.graphics.c[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public n1(z1 z1Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = z1Var;
        c(z1Var);
    }

    public final void a() {
        androidx.core.graphics.c[] cVarArr = this.b;
        if (cVarArr != null) {
            androidx.core.graphics.c cVarI = cVarArr[0];
            androidx.core.graphics.c cVarI2 = cVarArr[1];
            z1 z1Var = this.a;
            if (cVarI2 == null) {
                cVarI2 = z1Var.a.i(2);
            }
            if (cVarI == null) {
                cVarI = z1Var.a.i(1);
            }
            h(androidx.core.graphics.c.a(cVarI, cVarI2));
            androidx.core.graphics.c cVar = this.b[okhttp3.internal.platform.android.g.x(16)];
            if (cVar != null) {
                g(cVar);
            }
            androidx.core.graphics.c cVar2 = this.b[okhttp3.internal.platform.android.g.x(32)];
            if (cVar2 != null) {
                e(cVar2);
            }
            androidx.core.graphics.c cVar3 = this.b[okhttp3.internal.platform.android.g.x(64)];
            if (cVar3 != null) {
                i(cVar3);
            }
        }
    }

    public abstract z1 b();

    public void c(z1 z1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = z1Var.a.f(i);
            int iX = okhttp3.internal.platform.android.g.x(i);
            this.c[iX] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = z1Var.a.g(i);
                this.d[iX] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, androidx.core.graphics.c cVar) {
        if (this.b == null) {
            this.b = new androidx.core.graphics.c[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[okhttp3.internal.platform.android.g.x(i2)] = cVar;
            }
        }
    }

    public abstract void f(androidx.core.graphics.c cVar);

    public abstract void h(androidx.core.graphics.c cVar);

    public n1() {
        this(new z1((z1) null));
    }

    public void e(androidx.core.graphics.c cVar) {
    }

    public void g(androidx.core.graphics.c cVar) {
    }

    public void i(androidx.core.graphics.c cVar) {
    }
}
