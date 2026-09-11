package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.compose.foundation.lazy.layout.b1;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public float D;
    public float E;
    public final /* synthetic */ k H;
    public final i e;
    public final float[] y = new float[16];
    public final float[] z = new float[16];
    public final float[] F = new float[16];
    public final float[] G = new float[16];

    public j(k kVar, i iVar) {
        this.H = kVar;
        float[] fArr = new float[16];
        this.A = fArr;
        float[] fArr2 = new float[16];
        this.B = fArr2;
        float[] fArr3 = new float[16];
        this.C = fArr3;
        this.e = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.E = 3.1415927f;
    }

    @Override // androidx.media3.exoplayer.video.spherical.c
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.A;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.E = f2;
        Matrix.setRotateM(this.B, 0, -this.D, (float) Math.cos(f2), (float) Math.sin(this.E), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objI;
        synchronized (this) {
            Matrix.multiplyMM(this.G, 0, this.A, 0, this.C, 0);
            Matrix.multiplyMM(this.F, 0, this.B, 0, this.G, 0);
        }
        Matrix.multiplyMM(this.z, 0, this.y, 0, this.F, 0);
        i iVar = this.e;
        float[] fArr2 = this.z;
        GLES20.glClear(16384);
        try {
            androidx.media3.common.util.c.b();
        } catch (androidx.media3.common.util.k e) {
            androidx.media3.common.util.c.g("SceneRenderer", "Failed to draw a frame", e);
        }
        if (iVar.e.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.G;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                androidx.media3.common.util.c.b();
            } catch (androidx.media3.common.util.k e2) {
                androidx.media3.common.util.c.g("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (iVar.y.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.D, 0);
            }
            long timestamp = iVar.G.getTimestamp();
            androidx.compose.ui.text.android.selection.e eVar = iVar.B;
            synchronized (eVar) {
                objI = eVar.I(timestamp, false);
            }
            Long l = (Long) objI;
            if (l != null) {
                b1 b1Var = iVar.A;
                float[] fArr3 = iVar.D;
                float[] fArr4 = (float[]) ((androidx.compose.ui.text.android.selection.e) b1Var.A).K(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) b1Var.z;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!b1Var.e) {
                        b1.e((float[]) b1Var.y, (float[]) b1Var.z);
                        b1Var.e = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) b1Var.y, 0, (float[]) b1Var.z, 0);
                }
            }
            f fVar = (f) iVar.C.K(timestamp);
            if (fVar != null) {
                g gVar = iVar.z;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.a = fVar.c;
                    gVar.b = new androidx.compose.ui.text.android.selection.e(fVar.a.a[0]);
                    if (!fVar.d) {
                        androidx.compose.ui.text.android.selection.e eVar2 = fVar.b.a[0];
                        float[] fArr6 = (float[]) eVar2.d;
                        int length2 = fArr6.length;
                        androidx.media3.common.util.c.d(fArr6);
                        androidx.media3.common.util.c.d((float[]) eVar2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.E, 0, fArr2, 0, iVar.D, 0);
        g gVar2 = iVar.z;
        int i = iVar.F;
        float[] fArr7 = iVar.E;
        androidx.compose.ui.text.android.selection.e eVar3 = gVar2.b;
        if (eVar3 == null) {
            return;
        }
        int i2 = gVar2.a;
        if (i2 == 1) {
            fArr = g.j;
        } else {
            fArr = i2 == 2 ? g.k : g.i;
        }
        GLES20.glUniformMatrix3fv(gVar2.e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(gVar2.d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(gVar2.h, 0);
        try {
            androidx.media3.common.util.c.b();
        } catch (androidx.media3.common.util.k e3) {
            androidx.media3.common.util.c.g("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) eVar3.d);
        try {
            androidx.media3.common.util.c.b();
        } catch (androidx.media3.common.util.k e4) {
            androidx.media3.common.util.c.g("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(gVar2.g, 2, 5126, false, 8, (Buffer) eVar3.e);
        try {
            androidx.media3.common.util.c.b();
        } catch (androidx.media3.common.util.k e5) {
            androidx.media3.common.util.c.g("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(eVar3.c, 0, eVar3.b);
        try {
            androidx.media3.common.util.c.b();
        } catch (androidx.media3.common.util.k e6) {
            androidx.media3.common.util.c.g("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.y, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.H;
        kVar.B.post(new androidx.activity.c(29, kVar, this.e.d()));
    }
}
