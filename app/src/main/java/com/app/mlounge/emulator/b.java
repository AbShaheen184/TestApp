package com.app.mlounge.emulator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.animation.core.g0;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.o;
import kotlin.collections.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends View {
    public final Rect A;
    public final ArrayList B;
    public final LinkedHashMap C;
    public final Object D;
    public final float e;
    public final g0 y;
    public final Paint z;

    public b(EmulatorActivity emulatorActivity, float f, g0 g0Var) {
        super(emulatorActivity);
        this.e = f;
        this.y = g0Var;
        this.z = new Paint(3);
        this.A = new Rect();
        this.B = new ArrayList();
        this.C = new LinkedHashMap();
        this.D = a0.v(new kotlin.k(4, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_dpad_up)), new kotlin.k(5, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_dpad_down)), new kotlin.k(6, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_dpad_left)), new kotlin.k(7, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_dpad_right)), new kotlin.k(8, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_a)), new kotlin.k(0, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_b)), new kotlin.k(9, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_x)), new kotlin.k(1, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_y)), new kotlin.k(10, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_lb)), new kotlin.k(11, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_rb)), new kotlin.k(2, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_select)), new kotlin.k(3, BitmapFactory.decodeResource(emulatorActivity.getResources(), R.drawable.glyph_start)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void a(float f, float f2, float f3, float f4, int i) {
        Bitmap bitmap = (Bitmap) this.D.get(Integer.valueOf(i));
        if (bitmap == null) {
            return;
        }
        this.B.add(new a(i, bitmap, new RectF(f, f2, f3, f4)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Set setO0 = o.o0(p.z(this.C.values()));
        float f = this.e * 255;
        int iC = com.google.android.material.resources.c.c((int) f, 0, 255);
        int iC2 = com.google.android.material.resources.c.c((int) (f * 1.8f), 0, 255);
        for (a aVar : this.B) {
            int i = aVar.a;
            Bitmap bitmap = aVar.b;
            int i2 = setO0.contains(Integer.valueOf(i)) ? iC2 : iC;
            Paint paint = this.z;
            paint.setAlpha(i2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect rect = this.A;
            rect.set(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, aVar.c, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.B.clear();
        float fMin = Math.min(i, i2) * 0.08f;
        float f = i;
        float f2 = f * 0.15f;
        float f3 = i2;
        float f4 = f3 * 0.65f;
        float f5 = f2 - fMin;
        float f6 = fMin * 3;
        float f7 = f4 - f6;
        float f8 = f2 + fMin;
        float f9 = f4 - fMin;
        a(f5, f7, f8, f9, 4);
        float f10 = f4 + fMin;
        float f11 = f4 + f6;
        a(f5, f10, f8, f11, 5);
        a(f2 - f6, f9, f5, f10, 6);
        a(f8, f9, f2 + f6, f10, 7);
        float f12 = f * 0.85f;
        float f13 = f12 + fMin;
        a(f13, f9, f12 + f6, f10, 8);
        float f14 = f12 - fMin;
        a(f14, f10, f13, f11, 0);
        a(f14, f7, f13, f9, 9);
        a(f12 - f6, f9, f14, f10, 1);
        float f15 = 0.92f * f3;
        float f16 = 0.42f * f;
        float f17 = 2;
        float f18 = (2.0f * fMin) / f17;
        float f19 = (1.4f * fMin) / f17;
        float f20 = f15 - f19;
        float f21 = f19 + f15;
        a(f16 - f18, f20, f16 + f18, f21, 2);
        float f22 = 0.58f * f;
        a(f22 - f18, f20, f22 + f18, f21, 3);
        float f23 = fMin * 2.5f;
        float f24 = f * 0.02f;
        float f25 = f3 * 0.02f;
        float f26 = f25 + (fMin * 1.5f);
        a(f24, f25, f24 + f23, f26, 10);
        float f27 = f * 0.98f;
        a(f27 - f23, f25, f27, f26, 11);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[LOOP:4: B:37:0x00d6->B:39:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0112 A[SYNTHETIC] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        float y;
        LinkedHashSet linkedHashSet;
        RectF rectF;
        int i;
        Set set;
        Iterator it;
        motionEvent.getClass();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        ArrayList<a> arrayList = this.B;
        g0 g0Var = this.y;
        LinkedHashMap linkedHashMap = this.C;
        if (actionMasked == 0) {
            x = motionEvent.getX(actionIndex);
            y = motionEvent.getY(actionIndex);
            linkedHashSet = new LinkedHashSet();
            for (a aVar : arrayList) {
                rectF = aVar.c;
                i = aVar.a;
                if (rectF.contains(x, y)) {
                    linkedHashSet.add(Integer.valueOf(i));
                    g0Var.invoke(Integer.valueOf(i), Boolean.TRUE);
                }
            }
            linkedHashMap.put(Integer.valueOf(pointerId), linkedHashSet);
        } else if (actionMasked == 1) {
            set = (Set) linkedHashMap.get(Integer.valueOf(pointerId));
            if (set != null) {
                it = set.iterator();
                while (it.hasNext()) {
                    g0Var.invoke(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
                }
            }
            linkedHashMap.remove(Integer.valueOf(pointerId));
            if (motionEvent.getActionMasked() == 1) {
                super.performClick();
            }
        } else if (actionMasked == 2) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId2 = motionEvent.getPointerId(i2);
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                Set linkedHashSet2 = (Set) linkedHashMap.get(Integer.valueOf(pointerId2));
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (a aVar2 : arrayList) {
                    if (aVar2.c.contains(x2, y2)) {
                        linkedHashSet3.add(Integer.valueOf(aVar2.a));
                    }
                }
                Iterator it2 = com.google.common.base.i.n(linkedHashSet2, linkedHashSet3).iterator();
                while (it2.hasNext()) {
                    g0Var.invoke(Integer.valueOf(((Number) it2.next()).intValue()), Boolean.FALSE);
                }
                Iterator it3 = com.google.common.base.i.n(linkedHashSet3, linkedHashSet2).iterator();
                while (it3.hasNext()) {
                    g0Var.invoke(Integer.valueOf(((Number) it3.next()).intValue()), Boolean.TRUE);
                }
                linkedHashMap.put(Integer.valueOf(pointerId2), linkedHashSet3);
            }
        } else if (actionMasked == 3) {
            set = (Set) linkedHashMap.get(Integer.valueOf(pointerId));
            if (set != null) {
                it = set.iterator();
                while (it.hasNext()) {
                    g0Var.invoke(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
                }
            }
            linkedHashMap.remove(Integer.valueOf(pointerId));
            if (motionEvent.getActionMasked() == 1) {
                super.performClick();
            }
        } else if (actionMasked == 5) {
            x = motionEvent.getX(actionIndex);
            y = motionEvent.getY(actionIndex);
            linkedHashSet = new LinkedHashSet();
            while (r3.hasNext()) {
                rectF = aVar.c;
                i = aVar.a;
                if (rectF.contains(x, y)) {
                    linkedHashSet.add(Integer.valueOf(i));
                    g0Var.invoke(Integer.valueOf(i), Boolean.TRUE);
                }
            }
            linkedHashMap.put(Integer.valueOf(pointerId), linkedHashSet);
        } else if (actionMasked == 6) {
            set = (Set) linkedHashMap.get(Integer.valueOf(pointerId));
            if (set != null) {
                it = set.iterator();
                while (it.hasNext()) {
                    g0Var.invoke(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
                }
            }
            linkedHashMap.remove(Integer.valueOf(pointerId));
            if (motionEvent.getActionMasked() == 1) {
                super.performClick();
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
