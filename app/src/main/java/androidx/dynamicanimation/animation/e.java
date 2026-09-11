package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.compose.foundation.text.input.internal.o;
import androidx.transition.k;
import com.google.android.material.shape.y;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final d m = new d(1);
    public static final d n = new d(2);
    public static final d o = new d(3);
    public static final d p = new d(4);
    public static final d q = new d(5);
    public static final d r = new d(0);
    public final y c;
    public final t1 d;
    public final float g;
    public f j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public e(y yVar, t1 t1Var) {
        this.c = yVar;
        this.d = t1Var;
        if (t1Var == o || t1Var == p || t1Var == q) {
            this.g = 0.1f;
        } else if (t1Var == r) {
            this.g = 0.00390625f;
        } else if (t1Var == m || t1Var == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new o(26)));
        }
        return (c) threadLocal.get();
    }

    public final void a(float f) {
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new f(f);
        }
        f fVar = this.j;
        double d = f;
        fVar.i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            com.google.gson.b.r("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028235E38f) {
            com.google.gson.b.r("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.g * 0.75f);
        fVar.d = dAbs;
        fVar.e = dAbs * 62.5d;
        o oVar = b().e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.z).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float fU = this.d.u(this.c);
        this.b = fU;
        if (fU > Float.MAX_VALUE || fU < -3.4028235E38f) {
            net.luminis.tls.engine.impl.c.o("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f) {
        this.d.C(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                k.i();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            com.google.gson.b.r("Spring animations can only come to an end when there is damping");
            return;
        }
        o oVar = b().e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.z).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
