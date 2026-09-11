package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int K = 0;
    public final int A;
    public final float B;
    public final Paint C;
    public final RectF D;
    public final int E;
    public float F;
    public boolean G;
    public double H;
    public int I;
    public int J;
    public final ValueAnimator e;
    public boolean y;
    public final ArrayList z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.e = valueAnimator;
        this.z = new ArrayList();
        Paint paint = new Paint();
        this.C = paint;
        this.D = new RectF();
        this.J = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        com.google.android.material.motion.a.B(context, R.attr.motionDurationLong2, org.mozilla.javascript.Context.VERSION_ES6);
        com.google.android.material.motion.a.C(context, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.b);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.K;
                this.a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final void a(float f) {
        this.e.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.F = f2;
        this.H = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.J;
        int iRound = this.I;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.H)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.H))) + height;
        float f5 = this.A;
        this.D.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.i0 - f2) > 0.001f) {
                clockFaceView.i0 = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.J;
        int iRound = this.I;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.H)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.H))) + f3;
        Paint paint = this.C;
        paint.setStrokeWidth(0.0f);
        int i2 = this.A;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.H);
        double d = iRound - i2;
        paint.setStrokeWidth(this.E);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.H) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.B, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e.isRunning()) {
            return;
        }
        a(this.F);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.G = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.G;
            if (this.y) {
                this.J = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.I) * 0.66f)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.G;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.F != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            a(f);
            z3 = true;
        }
        this.G = z4 | z3;
        return true;
    }
}
