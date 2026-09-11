package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public androidx.compose.ui.text.android.selection.e b;
    public androidx.fragment.app.h c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(f fVar) {
        e eVar = fVar.a;
        e eVar2 = fVar.b;
        androidx.compose.ui.text.android.selection.e[] eVarArr = eVar.a;
        if (eVarArr.length == 1 && eVarArr[0].b == 0) {
            androidx.compose.ui.text.android.selection.e[] eVarArr2 = eVar2.a;
            if (eVarArr2.length == 1 && eVarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            androidx.fragment.app.h hVar = new androidx.fragment.app.h("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = hVar;
            this.d = GLES20.glGetUniformLocation(hVar.y, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.y, "uTexMatrix");
            this.f = this.c.D("aPosition");
            this.g = this.c.D("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.y, "uTexture");
        } catch (androidx.media3.common.util.k e) {
            androidx.media3.common.util.c.g("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
