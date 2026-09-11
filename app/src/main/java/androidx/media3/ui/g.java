package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends View implements o0 {
    public final Rect A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final StringBuilder R;
    public final Formatter S;
    public final androidx.activity.l T;
    public final CopyOnWriteArraySet U;
    public final Point V;
    public final float W;
    public int a0;
    public long b0;
    public int c0;
    public Rect d0;
    public final Rect e;
    public final ValueAnimator e0;
    public float f0;
    public boolean g0;
    public boolean h0;
    public long i0;
    public long j0;
    public long k0;
    public long l0;
    public int m0;
    public long[] n0;
    public boolean[] o0;
    public final Rect y;
    public final Rect z;

    public g(Context context) {
        super(context, null, 0);
        this.e = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        Paint paint = new Paint();
        this.B = paint;
        Paint paint2 = new Paint();
        this.C = paint2;
        Paint paint3 = new Paint();
        this.D = paint3;
        Paint paint4 = new Paint();
        this.E = paint4;
        Paint paint5 = new Paint();
        this.F = paint5;
        Paint paint6 = new Paint();
        this.G = paint6;
        paint6.setAntiAlias(true);
        this.U = new CopyOnWriteArraySet();
        this.V = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.W = f;
        this.Q = a(-50, f);
        int iA = a(4, f);
        int iA2 = a(26, f);
        int iA3 = a(4, f);
        int iA4 = a(12, f);
        int iA5 = a(0, f);
        int iA6 = a(16, f);
        this.I = iA;
        this.J = iA2;
        this.K = 0;
        this.L = iA3;
        this.M = iA4;
        this.N = iA5;
        this.O = iA6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.H = null;
        StringBuilder sb = new StringBuilder();
        this.R = sb;
        this.S = new Formatter(sb, Locale.getDefault());
        this.T = new androidx.activity.l(this, 27);
        this.P = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        this.f0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.e0 = valueAnimator;
        valueAnimator.addUpdateListener(new f(this, 0));
        this.j0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.a0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.b0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.j0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.a0);
    }

    private String getProgressText() {
        return androidx.media3.common.util.j0.F(this.R, this.S, this.k0);
    }

    private long getScrubberPosition() {
        Rect rect = this.y;
        if (rect.width() <= 0 || this.j0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.A.width()) * this.j0) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.j0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.h0 ? this.i0 : this.k0;
        long jK = androidx.media3.common.util.j0.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.h0) {
            f(jK);
        } else {
            c(jK);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.i0 = j;
        this.h0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            v vVar = ((k) it.next()).e;
            vVar.T0 = true;
            TextView textView = vVar.k0;
            if (textView != null) {
                textView.setText(androidx.media3.common.util.j0.F(vVar.m0, vVar.n0, j));
            }
            vVar.e.f();
            androidx.media3.common.q0 q0Var = vVar.N0;
            if (q0Var != null && vVar.V0) {
                if (vVar.i(q0Var)) {
                    try {
                        Method method = vVar.C;
                        method.getClass();
                        method.invoke(vVar.N0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        net.luminis.tls.engine.impl.c.k(e);
                        return;
                    }
                } else if (vVar.h(vVar.N0)) {
                    try {
                        Method method2 = vVar.F;
                        method2.getClass();
                        method2.invoke(vVar.N0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        net.luminis.tls.engine.impl.c.k(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    androidx.media3.common.q0 q0Var2 = vVar.N0;
                    q0Var2.getClass();
                    sb.append(q0Var2.getClass());
                    androidx.media3.common.util.c.t("PlayerControlView", sb.toString());
                }
            }
            if (vVar.k(vVar.N0)) {
                v.a(vVar, vVar.N0, j);
            }
        }
    }

    public final void d(boolean z) {
        removeCallbacks(this.T);
        this.h0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (k kVar : this.U) {
            long j = this.i0;
            v vVar = kVar.e;
            vVar.T0 = false;
            androidx.media3.common.q0 q0Var = vVar.N0;
            if (q0Var != null) {
                if (!z) {
                    v.a(vVar, q0Var, j);
                }
                if (vVar.i(vVar.N0)) {
                    try {
                        Method method = vVar.C;
                        method.getClass();
                        method.invoke(vVar.N0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        net.luminis.tls.engine.impl.c.k(e);
                        return;
                    }
                } else if (vVar.h(vVar.N0)) {
                    try {
                        Method method2 = vVar.F;
                        method2.getClass();
                        method2.invoke(vVar.N0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        net.luminis.tls.engine.impl.c.k(e2);
                        return;
                    }
                } else {
                    continue;
                }
            }
            vVar.e.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.z;
        Rect rect2 = this.y;
        rect.set(rect2);
        Rect rect3 = this.A;
        rect3.set(rect2);
        long j = this.h0 ? this.i0 : this.k0;
        if (this.j0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.l0) / this.j0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.j0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.e);
    }

    public final void f(long j) {
        if (this.i0 == j) {
            return;
        }
        this.i0 = j;
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            v vVar = ((k) it.next()).e;
            TextView textView = vVar.k0;
            if (textView != null) {
                textView.setText(androidx.media3.common.util.j0.F(vVar.m0, vVar.n0, j));
            }
            if (vVar.k(vVar.N0)) {
                v.a(vVar, vVar.N0, j);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.y.width() / this.W);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.j0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.y;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.j0;
        Paint paint = this.D;
        Rect rect2 = this.A;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.z;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.C);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.B);
            }
            if (this.m0 != 0) {
                long[] jArr = this.n0;
                jArr.getClass();
                boolean[] zArr = this.o0;
                zArr.getClass();
                int i6 = this.L;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.m0) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * androidx.media3.common.util.j0.k(jArr[i9], 0L, this.j0)) / this.j0)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.F : this.E);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.j0 > 0) {
            int iJ = androidx.media3.common.util.j0.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.H;
            if (drawable == null) {
                if (this.h0 || isFocused()) {
                    i = this.O;
                } else {
                    i = isEnabled() ? this.M : this.N;
                }
                canvas2.drawCircle(iJ, iCenterY2, (int) ((i * this.f0) / 2.0f), this.G);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f0)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.h0 || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.j0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            androidx.activity.l lVar = this.T;
                            removeCallbacks(lVar);
                            postDelayed(lVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            androidx.activity.l lVar2 = this.T;
                            removeCallbacks(lVar2);
                            postDelayed(lVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.h0) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.h0) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.g0 ? 0 : this.P;
        int i8 = this.K;
        int i9 = this.I;
        int i10 = this.J;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.e;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.y.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.d0) == null || rect.width() != i5 || this.d0.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.d0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.J;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.H;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.j0 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.V;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.y;
            Rect rect2 = this.A;
            if (action == 0) {
                int i3 = i;
                if (this.e.contains(i3, i2)) {
                    rect2.right = androidx.media3.common.util.j0.j(i3, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.h0) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.h0) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.h0) {
                if (i2 < this.Q) {
                    int i4 = this.c0;
                    rect2.right = androidx.media3.common.util.j0.j(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.c0 = i;
                    rect2.right = androidx.media3.common.util.j0.j(i, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.j0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.E.setColor(i);
        invalidate(this.e);
    }

    public void setBufferedColor(int i) {
        this.C.setColor(i);
        invalidate(this.e);
    }

    public void setBufferedPosition(long j) {
        if (this.l0 == j) {
            return;
        }
        this.l0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.j0 == j) {
            return;
        }
        this.j0 = j;
        if (this.h0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.h0 || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        com.google.android.material.motion.a.f(i > 0);
        this.a0 = i;
        this.b0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        com.google.android.material.motion.a.f(j > 0);
        this.a0 = -1;
        this.b0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.F.setColor(i);
        invalidate(this.e);
    }

    public void setPlayedColor(int i) {
        this.B.setColor(i);
        invalidate(this.e);
    }

    public void setPosition(long j) {
        if (this.k0 == j) {
            return;
        }
        this.k0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.G.setColor(i);
        invalidate(this.e);
    }

    public void setUnplayedColor(int i) {
        this.D.setColor(i);
        invalidate(this.e);
    }
}
