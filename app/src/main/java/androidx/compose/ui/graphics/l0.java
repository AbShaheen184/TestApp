package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends p {
    public com.app.mlounge.data.music.e a;
    public long b = 9205357640488583168L;

    @Override // androidx.compose.ui.graphics.p
    public final void a(float f, long j, com.google.android.gms.cloudmessaging.n nVar) {
        Paint paint = (Paint) nVar.y;
        com.app.mlounge.data.music.e eVar = this.a;
        if (eVar == null || !androidx.compose.ui.geometry.e.a(this.b, j)) {
            if (androidx.compose.ui.geometry.e.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                eVar = null;
            } else {
                eVar = this.a;
                if (eVar == null) {
                    eVar = new com.app.mlounge.data.music.e(15, false);
                    this.a = eVar;
                }
                eVar.y = b(j);
                this.a = eVar;
                this.b = j;
            }
        }
        long jC = a0.c(paint.getColor());
        long j2 = t.b;
        if (!t.c(jC, j2)) {
            nVar.h(j2);
        }
        if (!kotlin.jvm.internal.l.a((Shader) nVar.z, eVar != null ? (Shader) eVar.y : null)) {
            nVar.k(eVar != null ? (Shader) eVar.y : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        nVar.e(f);
    }

    public abstract Shader b(long j);
}
