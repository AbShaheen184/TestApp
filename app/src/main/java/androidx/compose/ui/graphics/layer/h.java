package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.text.selection.s0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;
import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {
    public static final g w = new g();
    public final androidx.compose.ui.graphics.layer.view.a b;
    public final s c;
    public final m d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;

    public h(androidx.compose.ui.graphics.layer.view.a aVar) {
        s sVar = new s();
        androidx.compose.ui.graphics.drawscope.b bVar = new androidx.compose.ui.graphics.drawscope.b();
        this.b = aVar;
        this.c = sVar;
        m mVar = new m(aVar, sVar, bVar);
        this.d = mVar;
        this.e = aVar.getResources();
        this.f = new Rect();
        aVar.addView(mVar);
        mVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = t.b;
        this.u = j;
        this.v = j;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float A() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void B() {
        this.d.setTranslationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void C(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float D() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void E(int i) {
        this.o = i;
        O();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void F() {
        this.d.setRotation(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            s0.t(this.d, a0.y(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final Matrix H() {
        return this.d.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void I(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float J() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float K() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int L() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void M(r rVar) {
        Rect rect;
        boolean z = this.k;
        m mVar = this.d;
        if (z) {
            if ((this.m || mVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        Canvas canvas = androidx.compose.ui.graphics.d.a;
        if (((androidx.compose.ui.graphics.c) rVar).a.isHardwareAccelerated()) {
            this.b.a(rVar, mVar, mVar.getDrawingTime());
        }
    }

    public final void N(int i) {
        m mVar = this.d;
        boolean z = true;
        if (i == 1) {
            mVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                mVar.setLayerType(0, paint);
                z = false;
            } else {
                mVar.setLayerType(0, paint);
            }
        }
        mVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void O() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float a() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float b() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void c(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void d(Outline outline, long j) {
        m mVar = this.d;
        mVar.B = outline;
        mVar.invalidateOutline();
        if ((this.m || mVar.getClipToOutline()) && outline != null) {
            mVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.graphics.layer.d
    public final void e(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar, b bVar, androidx.compose.animation.e eVar) {
        m mVar2 = this.d;
        ViewParent parent = mVar2.getParent();
        androidx.compose.ui.graphics.layer.view.a aVar = this.b;
        if (parent == null) {
            aVar.addView(mVar2);
        }
        mVar2.D = cVar;
        mVar2.E = mVar;
        mVar2.F = eVar;
        mVar2.G = bVar;
        if (mVar2.isAttachedToWindow()) {
            mVar2.setVisibility(4);
            mVar2.setVisibility(0);
            try {
                s sVar = this.c;
                g gVar = w;
                androidx.compose.ui.graphics.c cVar2 = sVar.a;
                Canvas canvas = cVar2.a;
                cVar2.a = gVar;
                aVar.a(cVar2, mVar2, mVar2.getDrawingTime());
                sVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void f(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.b.e(i)));
        O();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void g() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int h() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final androidx.compose.ui.graphics.m i() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void j(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void k(int i, int i2, long j) {
        boolean zA = androidx.compose.ui.unit.l.a(this.j, j);
        m mVar = this.d;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                mVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                mVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || mVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            mVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                mVar.setPivotX(i5 / 2.0f);
                mVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float l() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float n() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void o(long j) {
        long j2 = 9223372034707292159L & j;
        m mVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                s0.p(mVar);
                return;
            }
            this.q = true;
            mVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final long p() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void q() {
        this.d.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void r(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float s() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void t() {
        this.d.setTranslationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void u() {
        this.d.setRotationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final long v() {
        return this.v;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            s0.s(this.d, a0.y(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void x() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void y(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float z() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }
}
