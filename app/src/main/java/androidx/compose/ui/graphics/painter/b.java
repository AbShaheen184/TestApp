package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.unit.m;
import com.google.android.gms.cloudmessaging.n;
import com.google.android.gms.dynamite.g;
import com.google.firebase.platforminfo.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public float A = 1.0f;
    public m B = m.e;
    public n e;
    public boolean y;
    public androidx.compose.ui.graphics.m z;

    public boolean d(float f) {
        return false;
    }

    public boolean e(androidx.compose.ui.graphics.m mVar) {
        return false;
    }

    public final void g(h0 h0Var, long j, float f, androidx.compose.ui.graphics.m mVar) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        if (this.A != f) {
            if (!d(f)) {
                n nVarG = this.e;
                if (f == 1.0f) {
                    if (nVarG != null) {
                        nVarG.e(f);
                    }
                    this.y = false;
                } else {
                    if (nVarG == null) {
                        nVarG = a0.g();
                        this.e = nVarG;
                    }
                    nVarG.e(f);
                    this.y = true;
                }
            }
            this.A = f;
        }
        if (!l.a(this.z, mVar)) {
            if (!e(mVar)) {
                n nVarG2 = this.e;
                if (mVar == null) {
                    if (nVarG2 != null) {
                        nVarG2.i(null);
                    }
                    this.y = false;
                } else {
                    if (nVarG2 == null) {
                        nVarG2 = a0.g();
                        this.e = nVarG2;
                    }
                    nVarG2.i(mVar);
                    this.y = true;
                }
            }
            this.z = mVar;
        }
        m layoutDirection = h0Var.getLayoutDirection();
        if (this.B != layoutDirection) {
            f(layoutDirection);
            this.B = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((c) bVar.y.y).k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.y) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        androidx.compose.ui.geometry.c cVarC = g.c(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        r rVarW = bVar.y.w();
                        n nVarG3 = this.e;
                        if (nVarG3 == null) {
                            nVarG3 = a0.g();
                            this.e = nVarG3;
                        }
                        try {
                            rVarW.h(cVarC, nVarG3);
                            i(h0Var);
                            rVarW.q();
                        } catch (Throwable th) {
                            rVarW.q();
                            throw th;
                        }
                    } else {
                        i(h0Var);
                    }
                }
            } catch (Throwable th2) {
                ((c) bVar.y.y).k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((c) bVar.y.y).k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(h0 h0Var);

    public void f(m mVar) {
    }
}
