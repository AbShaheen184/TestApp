package com.app.mlounge.emulator;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EmulatorRenderer implements GLSurfaceView.Renderer {
    public static final int $stable = 8;
    private static final String FRAGMENT_SHADER = "\n            precision mediump float;\n            uniform sampler2D u_Texture;\n            varying vec2 v_TexCoord;\n            void main() {\n                gl_FragColor = texture2D(u_Texture, v_TexCoord);\n            }\n        ";
    private static final String TAG = "EmulatorRenderer";
    private static final String VERTEX_SHADER = "\n            attribute vec4 a_Position;\n            attribute vec2 a_TexCoord;\n            varying vec2 v_TexCoord;\n            void main() {\n                gl_Position = a_Position;\n                v_TexCoord = a_TexCoord;\n            }\n        ";
    private String aspectRatioMode;
    private final LibretroCore core;
    private int hwRenderTextureId;
    private final FloatBuffer hwTexCoordBuffer;
    private final kotlin.jvm.functions.a inputProvider;
    private final kotlin.jvm.functions.a onFrameComplete;
    private int positionHandle;
    private int programId;
    private int screenHeight;
    private int screenWidth;
    private final FloatBuffer texCoordBuffer;
    private int texCoordHandle;
    private IntBuffer textureBuffer;
    private int textureHandle;
    private int textureHeight;
    private int textureId;
    private int textureWidth;
    private final FloatBuffer vertexBuffer;
    public static final m Companion = new m();
    private static final float[] VERTICES = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static final float[] TEX_COORDS = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private static final float[] HW_TEX_COORDS = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public EmulatorRenderer(LibretroCore libretroCore, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        libretroCore.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.core = libretroCore;
        this.inputProvider = aVar;
        this.onFrameComplete = aVar2;
        float[] fArr = VERTICES;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.vertexBuffer = floatBufferAsFloatBuffer;
        float[] fArr2 = TEX_COORDS;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.texCoordBuffer = floatBufferAsFloatBuffer2;
        float[] fArr3 = HW_TEX_COORDS;
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer3.put(fArr3);
        floatBufferAsFloatBuffer3.position(0);
        this.hwTexCoordBuffer = floatBufferAsFloatBuffer3;
        this.textureWidth = LibretroCore.SCREEN_WIDTH;
        this.textureHeight = LibretroCore.SCREEN_HEIGHT;
        this.aspectRatioMode = "fit";
        IntBuffer intBufferAllocate = IntBuffer.allocate(LibretroCore.SCREEN_WIDTH * LibretroCore.SCREEN_HEIGHT);
        intBufferAllocate.getClass();
        this.textureBuffer = intBufferAllocate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$0() {
        return 0;
    }

    private final int compileShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        o oVar = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a(TAG, "Compile error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    private final int createProgram(String str, String str2) {
        int iCompileShader = compileShader(35633, str);
        if (iCompileShader == 0) {
            return 0;
        }
        int iCompileShader2 = compileShader(35632, str2);
        if (iCompileShader2 == 0) {
            GLES20.glDeleteShader(iCompileShader);
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(iCompileShader);
            GLES20.glDeleteShader(iCompileShader2);
            return iGlCreateProgram;
        }
        o oVar = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a(TAG, "Link error: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    private final void prepareFrontendBlitState() {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
        GLES20.glDisable(3089);
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        GLES20.glDisable(2960);
        GLES20.glDisable(3042);
        GLES20.glColorMask(true, true, true, true);
        updateViewport();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    private final void updateViewport() {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.screenWidth == 0 || this.screenHeight == 0) {
            return;
        }
        String str = this.aspectRatioMode;
        int iHashCode = str.hashCode();
        if (iHashCode == -1881872635) {
            if (str.equals("stretch")) {
                f = this.screenWidth;
                i = this.screenHeight;
            }
            f2 = f / i;
            i2 = this.screenWidth;
            i3 = this.screenHeight;
            i4 = 0;
            if (i2 / i3 > f2) {
                int i6 = (int) (i3 * f2);
                int i7 = (i2 - i6) / 2;
                i2 = i6;
                i5 = 0;
                i4 = i7;
            } else {
                int i8 = (int) (i2 / f2);
                int i9 = (i3 - i8) / 2;
                i3 = i8;
                i5 = i9;
            }
            GLES20.glViewport(i4, i5, i2, i3);
        }
        if (iHashCode != 51821) {
            if (iHashCode == 1513508 && str.equals("16:9")) {
                f2 = 1.7777778f;
            }
        } else if (str.equals("4:3")) {
            f2 = 1.3333334f;
        }
        i2 = this.screenWidth;
        i3 = this.screenHeight;
        i4 = 0;
        if (i2 / i3 > f2) {
            int i10 = (int) (i3 * f2);
            int i11 = (i2 - i10) / 2;
            i2 = i10;
            i5 = 0;
            i4 = i11;
        } else {
            int i12 = (int) (i2 / f2);
            int i13 = (i3 - i12) / 2;
            i3 = i12;
            i5 = i13;
        }
        GLES20.glViewport(i4, i5, i2, i3);
        f = this.textureWidth;
        i = this.textureHeight;
        f2 = f / i;
        i2 = this.screenWidth;
        i3 = this.screenHeight;
        i4 = 0;
        if (i2 / i3 > f2) {
            int i14 = (int) (i3 * f2);
            int i15 = (i2 - i14) / 2;
            i2 = i14;
            i5 = 0;
            i4 = i15;
        } else {
            int i16 = (int) (i2 / f2);
            int i17 = (i3 - i16) / 2;
            i3 = i16;
            i5 = i17;
        }
        GLES20.glViewport(i4, i5, i2, i3);
    }

    public final String getAspectRatioMode() {
        return this.aspectRatioMode;
    }

    public final void onDestroy() {
        int i = this.programId;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.programId = 0;
        }
        int i2 = this.textureId;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.textureId = 0;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        this.core.setInput(((Number) this.inputProvider.invoke()).intValue());
        this.core.runFrame();
        this.onFrameComplete.invoke();
        if (this.core.isHwRender() && this.core.isHwFrameReady() && this.hwRenderTextureId != 0) {
            prepareFrontendBlitState();
            GLES20.glClear(16384);
            GLES20.glUseProgram(this.programId);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.vertexBuffer);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.hwTexCoordBuffer);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.hwRenderTextureId);
            GLES20.glUniform1i(this.textureHandle, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.positionHandle);
            GLES20.glDisableVertexAttribArray(this.texCoordHandle);
            return;
        }
        prepareFrontendBlitState();
        GLES20.glClear(16384);
        if (this.core.getGameLoaded()) {
            int[] videoBuffer = this.core.getVideoBuffer();
            int videoWidth = this.core.getVideoWidth();
            int videoHeight = this.core.getVideoHeight();
            if (videoWidth != this.textureWidth || videoHeight != this.textureHeight) {
                this.textureWidth = videoWidth;
                this.textureHeight = videoHeight;
                IntBuffer intBufferAllocate = IntBuffer.allocate(videoWidth * videoHeight);
                intBufferAllocate.getClass();
                this.textureBuffer = intBufferAllocate;
                GLES20.glBindTexture(3553, this.textureId);
                GLES20.glTexImage2D(3553, 0, 6408, this.textureWidth, this.textureHeight, 0, 6408, 5121, null);
                updateViewport();
            }
            this.textureBuffer.clear();
            IntBuffer intBuffer = this.textureBuffer;
            intBuffer.put(videoBuffer, 0, Math.min(videoBuffer.length, intBuffer.remaining()));
            this.textureBuffer.position(0);
            GLES20.glBindTexture(3553, this.textureId);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, this.textureWidth, this.textureHeight, 6408, 5121, this.textureBuffer);
            GLES20.glUseProgram(this.programId);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.vertexBuffer);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.texCoordBuffer);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            GLES20.glUniform1i(this.textureHandle, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.positionHandle);
            GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.screenWidth = i;
        this.screenHeight = i2;
        updateViewport();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int iCreateProgram = createProgram(VERTEX_SHADER, FRAGMENT_SHADER);
        this.programId = iCreateProgram;
        if (iCreateProgram == 0) {
            com.app.mlounge.util.a.a(TAG, "Failed to create shader program");
            return;
        }
        this.positionHandle = GLES20.glGetAttribLocation(iCreateProgram, "a_Position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programId, "a_TexCoord");
        this.textureHandle = GLES20.glGetUniformLocation(this.programId, "u_Texture");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.textureId = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.textureWidth, this.textureHeight, 0, 6408, 5121, null);
        this.core.onGlContextReady();
        int hwTextureId = this.core.getHwTextureId();
        this.hwRenderTextureId = hwTextureId;
        if (hwTextureId != 0) {
            o oVar = com.app.mlounge.util.a.a;
        }
    }

    public final void setAspectRatioMode(String str) {
        str.getClass();
        this.aspectRatioMode = str;
    }

    public /* synthetic */ EmulatorRenderer(LibretroCore libretroCore, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i, kotlin.jvm.internal.f fVar) {
        this(libretroCore, (i & 2) != 0 ? new androidx.compose.runtime.saveable.f(22) : aVar, (i & 4) != 0 ? new androidx.compose.runtime.saveable.f(23) : aVar2);
    }
}
