package androidx.core.widget;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.z0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnTouchListener {
    public static final int O = ViewConfiguration.getTapTimeout();
    public z0 A;
    public final float[] B;
    public final float[] C;
    public final int D;
    public final int E;
    public final float[] F;
    public final float[] G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final a1 N;
    public final a e;
    public final AccelerateInterpolator y;
    public final a1 z;

    public c(a1 a1Var) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.e = aVar;
        this.y = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.B = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.C = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.F = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.G = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.H = fArr5;
        this.z = a1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.D = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.E = O;
        aVar.a = 500;
        aVar.b = 500;
        this.N = a1Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.B[i] * f2, 0.0f, this.C[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.y;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.F[i];
            float f5 = this.G[i];
            float f6 = this.H[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.F[i];
        float f9 = this.G[i];
        float f10 = this.H[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.D;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.L && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.J) {
            this.L = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.e;
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        a1 a1Var;
        int count;
        a aVar = this.e;
        float f = aVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.c);
        if (iAbs != 0 && (count = (a1Var = this.N).getCount()) != 0) {
            int childCount = a1Var.getChildCount();
            int firstVisiblePosition = a1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && a1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && a1Var.getChildAt(childCount - 1).getBottom() <= a1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.M
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.K = r2
            r7.I = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            androidx.appcompat.widget.a1 r4 = r7.z
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            androidx.core.widget.a r9 = r7.e
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.L
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            androidx.appcompat.widget.z0 r8 = r7.A
            if (r8 != 0) goto L61
            androidx.appcompat.widget.z0 r8 = new androidx.appcompat.widget.z0
            r9 = 4
            r8.<init>(r7, r9)
            r7.A = r8
        L61:
            r7.L = r2
            r7.J = r2
            boolean r8 = r7.I
            if (r8 != 0) goto L76
            int r8 = r7.E
            if (r8 <= 0) goto L76
            androidx.appcompat.widget.z0 r9 = r7.A
            long r5 = (long) r8
            java.lang.reflect.Field r8 = androidx.core.view.s0.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            androidx.appcompat.widget.z0 r8 = r7.A
            r8.run()
        L7b:
            r7.I = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
