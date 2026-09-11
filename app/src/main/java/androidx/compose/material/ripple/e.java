package androidx.compose.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.activity.l;
import androidx.activity.w;
import androidx.compose.foundation.interaction.m;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends View {
    public static final int[] C = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] D = new int[0];
    public l A;
    public w B;
    public h e;
    public Boolean y;
    public Long z;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.A;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.z;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? C : D;
            h hVar = this.e;
            if (hVar != null) {
                hVar.setState(iArr);
            }
        } else {
            l lVar = new l(this, 3);
            this.A = lVar;
            postDelayed(lVar, 50L);
        }
        this.z = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        h hVar = eVar.e;
        if (hVar != null) {
            hVar.setState(D);
        }
        eVar.A = null;
    }

    public final void b(m mVar, boolean z, long j, int i, long j2, w wVar) {
        if (this.e == null || !Boolean.valueOf(z).equals(this.y)) {
            h hVar = new h(z);
            setBackground(hVar);
            this.e = hVar;
            this.y = Boolean.valueOf(z);
        }
        h hVar2 = this.e;
        hVar2.getClass();
        this.B = wVar;
        e(j, j2, i);
        if (z) {
            hVar2.setHotspot(Float.intBitsToFloat((int) (mVar.a >> 32)), Float.intBitsToFloat((int) (mVar.a & 4294967295L)));
        } else {
            hVar2.setHotspot(hVar2.getBounds().centerX(), hVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.B = null;
        l lVar = this.A;
        if (lVar != null) {
            removeCallbacks(lVar);
            l lVar2 = this.A;
            lVar2.getClass();
            lVar2.run();
        } else {
            h hVar = this.e;
            if (hVar != null) {
                hVar.setState(D);
            }
        }
        h hVar2 = this.e;
        if (hVar2 == null) {
            return;
        }
        hVar2.setVisible(false, false);
        unscheduleDrawable(hVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, long j2, int i) {
        h hVar = this.e;
        if (hVar == null) {
            return;
        }
        Integer num = hVar.z;
        if (num == null || num.intValue() != i) {
            hVar.z = Integer.valueOf(i);
            hVar.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = t.b(f, j2);
        t tVar = hVar.y;
        if (!(tVar == null ? false : t.c(tVar.a, jB))) {
            hVar.y = new t(jB);
            hVar.setColor(ColorStateList.valueOf(a0.y(jB)));
        }
        Rect rect = new Rect(0, 0, kotlin.math.a.F(androidx.compose.ui.geometry.e.d(j)), kotlin.math.a.F(androidx.compose.ui.geometry.e.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        w wVar = this.B;
        if (wVar != null) {
            wVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
