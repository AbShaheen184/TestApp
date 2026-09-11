package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {
    public final GestureDetector B;
    public final j z;
    public final PointF e = new PointF();
    public final PointF y = new PointF();
    public final float A = 25.0f;
    public volatile float C = 3.1415927f;

    public l(Context context, j jVar) {
        this.z = jVar;
        this.B = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.c
    public final void a(float[] fArr, float f) {
        this.C = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.e.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.e.x) / this.A;
        float y = motionEvent2.getY();
        PointF pointF = this.e;
        float f3 = (y - pointF.y) / this.A;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.C;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.y;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        j jVar = this.z;
        PointF pointF3 = this.y;
        synchronized (jVar) {
            float f5 = pointF3.y;
            jVar.D = f5;
            Matrix.setRotateM(jVar.B, 0, -f5, (float) Math.cos(jVar.E), (float) Math.sin(jVar.E), 0.0f);
            Matrix.setRotateM(jVar.C, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.z.H.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.B.onTouchEvent(motionEvent);
    }
}
