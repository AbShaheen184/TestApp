package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;
import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {
    public final s b;
    public final androidx.compose.ui.graphics.drawscope.b c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;

    public f() {
        s sVar = new s();
        androidx.compose.ui.graphics.drawscope.b bVar = new androidx.compose.ui.graphics.drawscope.b();
        this.b = sVar;
        this.c = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        O(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = t.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.t = 0;
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
        this.q = z;
        N();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float D() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void E(int i) {
        this.t = i;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void F() {
        this.d.setRotationZ(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void G(long j) {
        this.o = j;
        this.d.setSpotShadowColor(a0.y(j));
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
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float J() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float K() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int L() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void M(r rVar) {
        Canvas canvas = androidx.compose.ui.graphics.d.a;
        ((androidx.compose.ui.graphics.c) rVar).a.drawRenderNode(this.d);
    }

    public final void N() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.r) {
            this.r = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.s) {
            this.s = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.t;
        if (i != 1 && this.j == 3) {
            O(this.d, i);
        } else {
            O(this.d, 1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float a() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float b() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void c(float f) {
        this.m = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void d(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void e(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar, b bVar, androidx.compose.animation.e eVar) {
        androidx.compose.ui.graphics.drawscope.b bVar2 = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            s sVar = this.b;
            androidx.compose.ui.graphics.c cVar2 = sVar.a;
            Canvas canvas = cVar2.a;
            cVar2.a = recordingCanvasBeginRecording;
            c2 c2Var = bVar2.y;
            c2Var.a0(cVar);
            c2Var.b0(mVar);
            c2Var.z = bVar;
            c2Var.c0(this.e);
            c2Var.Z(cVar2);
            eVar.invoke(bVar2);
            sVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void f(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(androidx.compose.ui.graphics.b.d(i));
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void g() {
        this.d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final int h() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final androidx.compose.ui.graphics.m i() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void j(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void k(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = coil3.network.g.x(j);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float l() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final boolean m() {
        return this.d.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float n() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void o(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final long p() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void q() {
        this.d.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void r(float f) {
        this.i = f;
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
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void w(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(a0.y(j));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void x() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final void y(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public final float z() {
        return this.p;
    }
}
