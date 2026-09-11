package coil3.transition;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.transition.k;
import coil3.size.h;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {
    public long D;
    public int F;
    public final coil3.size.g e;
    public final int y;
    public final boolean z;
    public final ArrayList A = new ArrayList();
    public final int B = a(null, null);
    public final int C = a(null, null);
    public int E = 255;
    public Drawable G = null;
    public final Drawable H = null;

    public a(coil3.size.g gVar, int i, boolean z) {
        this.e = gVar;
        this.y = i;
        this.z = z;
        if (i > 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("durationMillis must be > 0.");
        throw null;
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dK = okhttp3.internal.platform.android.g.k(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.e, h.c);
        double d = 2;
        int iE = kotlin.math.a.E((((double) iWidth) - (((double) intrinsicWidth) * dK)) / d);
        int iE2 = kotlin.math.a.E((((double) iHeight) - (dK * ((double) intrinsicHeight))) / d);
        drawable.setBounds(rect.left + iE, rect.top + iE2, rect.right - iE, rect.bottom - iE2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i = this.F;
        if (i == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                drawable2.setAlpha(this.E);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.H;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.E);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.D) / ((double) this.y);
        double dA = com.google.android.material.resources.c.a(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.E;
        int i3 = (int) (dA * ((double) i2));
        if (this.z) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.G) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (!z) {
            invalidateSelf();
            return;
        }
        this.F = 2;
        this.G = null;
        ArrayList arrayList = this.A;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        k.i();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.F;
        if (i == 0) {
            Drawable drawable = this.G;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.H;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.G;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.G;
        int i = this.F;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.H;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.F == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.G;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.H;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.G;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.H;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.G;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.H;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Invalid alpha: "));
        } else {
            this.E = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.G;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.H;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.G;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.H;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.F != 0) {
            return;
        }
        this.F = 1;
        this.D = SystemClock.uptimeMillis();
        ArrayList arrayList = this.A;
        if (arrayList.size() <= 0) {
            invalidateSelf();
        } else {
            arrayList.get(0).getClass();
            k.i();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.G;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.H;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.F != 2) {
            this.F = 2;
            this.G = null;
            ArrayList arrayList = this.A;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            k.i();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
