package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.platform.u;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public static final AtomicBoolean w = new AtomicBoolean(true);
    public final s b;
    public final androidx.compose.ui.graphics.drawscope.b c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;

    public e(u uVar, s sVar, androidx.compose.ui.graphics.drawscope.b bVar) {
        this.b = sVar;
        this.c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", uVar);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (w.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k.c(renderNodeCreate, k.a(renderNodeCreate));
                k.d(renderNodeCreate, k.b(renderNodeCreate));
            }
            j.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = t.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
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
        this.t = z;
        N();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float D() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void E(int i) {
        this.j = i;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void F() {
        this.d.setRotation(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            k.d(this.d, a0.y(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final Matrix H() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void I(float f) {
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float J() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float K() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int L() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void M(r rVar) {
        Canvas canvas = androidx.compose.ui.graphics.d.a;
        DisplayListCanvas displayListCanvas = ((androidx.compose.ui.graphics.c) rVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    public final void N() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float a() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float b() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void c(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void d(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void e(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar, b bVar, androidx.compose.animation.e eVar) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            androidx.compose.ui.graphics.c cVar2 = this.b.a;
            Canvas canvas = cVar2.a;
            cVar2.a = canvasStart;
            androidx.compose.ui.graphics.drawscope.b bVar2 = this.c;
            c2 c2Var = bVar2.y;
            long jX = coil3.network.g.x(this.e);
            androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
            androidx.compose.ui.unit.c cVar3 = aVar.a;
            androidx.compose.ui.unit.m mVar2 = aVar.b;
            r rVarW = c2Var.w();
            long jH = c2Var.H();
            b bVar3 = (b) c2Var.z;
            c2Var.a0(cVar);
            c2Var.b0(mVar);
            c2Var.Z(cVar2);
            c2Var.c0(jX);
            c2Var.z = bVar;
            cVar2.f();
            try {
                eVar.invoke(bVar2);
                cVar2.q();
                c2Var.a0(cVar3);
                c2Var.b0(mVar2);
                c2Var.Z(rVarW);
                c2Var.c0(jH);
                c2Var.z = bVar3;
                cVar2.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                cVar2.q();
                c2 c2Var2 = bVar2.y;
                c2Var2.a0(cVar3);
                c2Var2.b0(mVar2);
                c2Var2.Z(rVarW);
                c2Var2.c0(jH);
                c2Var2.z = bVar3;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void f(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.b.e(i)));
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void g() {
        j.a(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int h() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final androidx.compose.ui.graphics.m i() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void j(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void k(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (androidx.compose.ui.unit.l.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float l() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final boolean m() {
        return this.d.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float n() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void o(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final long p() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void q() {
        this.d.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void r(float f) {
        this.l = f;
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
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            k.c(this.d, a0.y(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void x() {
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void y(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float z() {
        return this.s;
    }
}
