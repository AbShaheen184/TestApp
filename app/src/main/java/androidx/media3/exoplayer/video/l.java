package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.j0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends HandlerThread implements Handler.Callback {
    public RuntimeException A;
    public m B;
    public androidx.media3.common.util.j e;
    public Handler y;
    public Error z;

    public final void a(int i) throws androidx.media3.common.util.k {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.e.getClass();
        androidx.media3.common.util.j jVar = this.e;
        int[] iArr = jVar.y;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        androidx.media3.common.util.c.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        androidx.media3.common.util.c.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        jVar.z = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, androidx.media3.common.util.j.D, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = j0.a;
        androidx.media3.common.util.c.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(jVar.z, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        androidx.media3.common.util.c.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        jVar.A = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = jVar.z;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            androidx.media3.common.util.c.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        androidx.media3.common.util.c.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        jVar.B = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        androidx.media3.common.util.c.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        jVar.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(jVar);
        SurfaceTexture surfaceTexture2 = this.e.C;
        surfaceTexture2.getClass();
        this.B = new m(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.e.getClass();
        androidx.media3.common.util.j jVar = this.e;
        jVar.e.removeCallbacks(jVar);
        try {
            SurfaceTexture surfaceTexture = jVar.C;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, jVar.y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = jVar.z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = jVar.z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = jVar.B;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(jVar.z, jVar.B);
            }
            EGLContext eGLContext = jVar.A;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(jVar.z, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = jVar.z;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(jVar.z);
            }
            jVar.z = null;
            jVar.A = null;
            jVar.B = null;
            jVar.C = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (androidx.media3.common.util.k e) {
                    androidx.media3.common.util.c.g("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.A = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    androidx.media3.common.util.c.g("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.z = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    androidx.media3.common.util.c.g("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.A = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        androidx.media3.common.util.c.g("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
