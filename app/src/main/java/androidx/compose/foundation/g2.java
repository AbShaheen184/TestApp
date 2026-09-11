package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends androidx.compose.ui.node.j implements androidx.compose.ui.node.m {
    public final n N;
    public final p0 O;
    public RenderNode P;

    public g2(androidx.compose.ui.input.pointer.l0 l0Var, n nVar, p0 p0Var) {
        this.N = nVar;
        this.O = p0Var;
        L0(l0Var);
    }

    public static boolean O0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode P0() {
        RenderNode renderNode = this.P;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = f2.b();
        this.P = renderNodeB;
        return renderNodeB;
    }

    @Override // androidx.compose.ui.node.m
    public final void W(androidx.compose.ui.node.h0 h0Var) {
        boolean z;
        boolean zO0;
        RecordingCanvas recordingCanvas;
        char c;
        float f;
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jD = bVar.d();
        n nVar = this.N;
        nVar.i(jD);
        Canvas canvasA = androidx.compose.ui.graphics.d.a(bVar.y.w());
        nVar.d.getValue();
        if (androidx.compose.ui.geometry.e.e(bVar.d())) {
            h0Var.b();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        p0 p0Var = this.O;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = p0Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = p0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = p0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = p0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = p0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = p0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = p0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = p0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            h0Var.b();
            return;
        }
        float fV = h0Var.V(f0.a);
        boolean z2 = p0.f(p0Var.d) || p0.g(p0Var.h) || p0.f(p0Var.e) || p0.g(p0Var.i);
        boolean z3 = p0.f(p0Var.f) || p0.g(p0Var.j) || p0.f(p0Var.g) || p0.g(p0Var.k);
        if (z2 && z3) {
            P0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z2) {
            P0().setPosition(0, 0, (kotlin.math.a.F(fV) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z3) {
                h0Var.b();
                return;
            }
            P0().setPosition(0, 0, canvasA.getWidth(), (kotlin.math.a.F(fV) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = P0().beginRecording();
        boolean zG = p0.g(p0Var.j);
        androidx.compose.foundation.gestures.k1 k1Var = androidx.compose.foundation.gestures.k1.y;
        if (zG) {
            EdgeEffect edgeEffectA = p0Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = p0Var.a(k1Var);
                p0Var.j = edgeEffectA;
            }
            O0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (p0.f(p0Var.f)) {
            EdgeEffect edgeEffectC = p0Var.c();
            zO0 = O0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (p0.g(p0Var.f)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nVar.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = p0Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = p0Var.a(k1Var);
                    p0Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fB = i >= 31 ? q.b(edgeEffectC) : 0.0f;
                float f2 = 1 - fIntBitsToFloat;
                if (i >= 31) {
                    q.c(edgeEffectA2, fB, f2);
                } else {
                    edgeEffectA2.onPull(fB, f2);
                }
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zO0 = false;
        }
        boolean zG2 = p0.g(p0Var.h);
        androidx.compose.foundation.gestures.k1 k1Var2 = androidx.compose.foundation.gestures.k1.e;
        if (zG2) {
            EdgeEffect edgeEffectA3 = p0Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = p0Var.a(k1Var2);
                p0Var.h = edgeEffectA3;
            }
            O0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (p0.f(p0Var.d)) {
            EdgeEffect edgeEffectE = p0Var.e();
            boolean z4 = O0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zO0;
            if (p0.g(p0Var.d)) {
                recordingCanvas = recordingCanvasBeginRecording;
                c = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nVar.c() >> 32));
                EdgeEffect edgeEffectA4 = p0Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = p0Var.a(k1Var2);
                    p0Var.h = edgeEffectA4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fB2 = i2 >= 31 ? q.b(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    q.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                fV = fV;
                recordingCanvas = recordingCanvasBeginRecording;
                c = ' ';
            }
            zO0 = z4;
        } else {
            fV = fV;
            recordingCanvas = recordingCanvasBeginRecording;
            c = ' ';
        }
        if (p0.g(p0Var.k)) {
            EdgeEffect edgeEffectA5 = p0Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = p0Var.a(k1Var);
                p0Var.k = edgeEffectA5;
            }
            O0(270.0f, edgeEffectA5, recordingCanvas);
            edgeEffectA5.finish();
        }
        if (p0.f(p0Var.g)) {
            EdgeEffect edgeEffectD = p0Var.d();
            boolean z5 = O0(90.0f, edgeEffectD, recordingCanvas) || zO0;
            if (p0.g(p0Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (nVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = p0Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = p0Var.a(k1Var);
                    p0Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fB3 = i3 >= 31 ? q.b(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    q.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
            zO0 = z5;
        }
        if (p0.g(p0Var.i)) {
            EdgeEffect edgeEffectA7 = p0Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = p0Var.a(k1Var2);
                p0Var.i = edgeEffectA7;
            }
            f = 0.0f;
            O0(0.0f, edgeEffectA7, recordingCanvas);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (p0.f(p0Var.e)) {
            EdgeEffect edgeEffectB = p0Var.b();
            boolean z6 = O0(180.0f, edgeEffectB, recordingCanvas) || zO0;
            if (p0.g(p0Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (nVar.c() >> c));
                EdgeEffect edgeEffectA8 = p0Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = p0Var.a(k1Var2);
                    p0Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fB4 = i4 >= 31 ? q.b(edgeEffectB) : f;
                float f3 = 1 - fIntBitsToFloat4;
                if (i4 >= 31) {
                    q.c(edgeEffectA8, fB4, f3);
                } else {
                    edgeEffectA8.onPull(fB4, f3);
                }
            }
            zO0 = z6;
        }
        if (zO0) {
            nVar.d();
        }
        float f4 = z ? f : fV;
        if (!z2) {
            f = fV;
        }
        androidx.compose.ui.unit.m layoutDirection = h0Var.getLayoutDirection();
        androidx.compose.ui.graphics.c cVar = new androidx.compose.ui.graphics.c();
        cVar.a = recordingCanvas;
        long jD2 = bVar.d();
        androidx.appcompat.widget.c2 c2Var = bVar.y;
        androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
        androidx.compose.ui.unit.c cVar2 = aVar.a;
        androidx.compose.ui.unit.m mVar = aVar.b;
        androidx.compose.ui.graphics.r rVarW = c2Var.w();
        long jH = bVar.y.H();
        androidx.appcompat.widget.c2 c2Var2 = bVar.y;
        androidx.compose.ui.graphics.layer.b bVar2 = (androidx.compose.ui.graphics.layer.b) c2Var2.z;
        c2Var2.a0(h0Var);
        c2Var2.b0(layoutDirection);
        c2Var2.Z(cVar);
        c2Var2.c0(jD2);
        c2Var2.z = null;
        cVar.f();
        try {
            ((com.google.firebase.platforminfo.c) bVar.y.y).r(f4, f);
            try {
                h0Var.b();
                float f5 = -f4;
                float f6 = -f;
                ((com.google.firebase.platforminfo.c) bVar.y.y).r(f5, f6);
                cVar.q();
                androidx.appcompat.widget.c2 c2Var3 = bVar.y;
                c2Var3.a0(cVar2);
                c2Var3.b0(mVar);
                c2Var3.Z(rVarW);
                c2Var3.c0(jH);
                c2Var3.z = bVar2;
                P0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f5, f6);
                canvasA.drawRenderNode(P0());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th) {
                ((com.google.firebase.platforminfo.c) bVar.y.y).r(-f4, -f);
                throw th;
            }
        } catch (Throwable th2) {
            cVar.q();
            androidx.appcompat.widget.c2 c2Var4 = bVar.y;
            c2Var4.a0(cVar2);
            c2Var4.b0(mVar);
            c2Var4.Z(rVarW);
            c2Var4.c0(jH);
            c2Var4.z = bVar2;
            throw th2;
        }
    }
}
