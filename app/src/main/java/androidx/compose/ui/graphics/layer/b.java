package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.p0;
import androidx.collection.x0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.i0;
import com.google.android.gms.cloudmessaging.n;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final d a;
    public Outline f;
    public float j;
    public a0 k;
    public androidx.compose.ui.graphics.j l;
    public androidx.compose.ui.graphics.j m;
    public boolean n;
    public androidx.compose.ui.graphics.drawscope.b o;
    public n p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public androidx.compose.ui.unit.c b = androidx.compose.ui.graphics.drawscope.c.a;
    public androidx.compose.ui.unit.m c = androidx.compose.ui.unit.m.e;
    public kotlin.jvm.internal.m d = a.z;
    public final androidx.compose.animation.e e = new androidx.compose.animation.e(this, 6);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final androidx.compose.material.ripple.g r = new androidx.compose.material.ripple.g();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.a = dVar;
        dVar.C(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            d dVar = this.a;
            if (z || dVar.J() > 0.0f) {
                androidx.compose.ui.graphics.j jVar = this.l;
                if (jVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = jVar instanceof androidx.compose.ui.graphics.j;
                    if (!z2) {
                        com.google.gson.b.r("Unable to obtain android.graphics.Path");
                        return;
                    }
                    jVar.a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || jVar.a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            i.k(outline, jVar);
                        } else {
                            if (!z2) {
                                com.google.gson.b.r("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(jVar.a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = jVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.d(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        dVar.C(false);
                        dVar.g();
                    } else {
                        dVar.C(this.w);
                    }
                } else {
                    dVar.C(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jX = coil3.network.g.x(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jX = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jX >> 32);
                    int i5 = (int) (jX & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(dVar.a());
                    dVar.d(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                dVar.C(false);
                dVar.d(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            androidx.compose.material.ripple.g gVar = this.r;
            b bVar = (b) gVar.b;
            if (bVar != null) {
                bVar.e();
                gVar.b = null;
            }
            p0 p0Var = (p0) gVar.d;
            if (p0Var != null) {
                Object[] objArr = p0Var.b;
                long[] jArr = p0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((b) objArr[(i << 3) + i3]).e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                p0Var.b();
            }
            this.a.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[LOOP:0: B:20:0x0053->B:30:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[EDGE_INSN: B:34:0x008d->B:31:0x008d BREAK  A[LOOP:0: B:20:0x0053->B:30:0x008a], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public final void c(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.material.ripple.g gVar = this.r;
        gVar.c = (b) gVar.b;
        p0 p0Var = (p0) gVar.d;
        if (p0Var != null && p0Var.h()) {
            p0 p0Var2 = (p0) gVar.e;
            if (p0Var2 == null) {
                p0 p0Var3 = x0.a;
                p0Var2 = new p0();
                gVar.e = p0Var2;
            }
            p0Var2.j(p0Var);
            p0Var.b();
        }
        gVar.a = true;
        this.d.invoke(dVar);
        gVar.a = false;
        b bVar = (b) gVar.c;
        if (bVar != null) {
            bVar.e();
        }
        p0 p0Var4 = (p0) gVar.e;
        if (p0Var4 == null || !p0Var4.h()) {
            return;
        }
        Object[] objArr = p0Var4.b;
        long[] jArr = p0Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((b) objArr[(i << 3) + i3]).e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        p0Var4.b();
    }

    public final a0 d() {
        a0 h0Var;
        a0 a0Var = this.k;
        androidx.compose.ui.graphics.j jVar = this.l;
        if (a0Var != null) {
            return a0Var;
        }
        if (jVar != null) {
            g0 g0Var = new g0(jVar);
            this.k = g0Var;
            return g0Var;
        }
        long jX = coil3.network.g.x(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jX = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jX >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jX & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            h0Var = new i0(com.google.firebase.b.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            h0Var = new h0(new androidx.compose.ui.geometry.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = h0Var;
        return h0Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(long j, long j2, float f) {
        if (androidx.compose.ui.geometry.b.b(this.h, j) && androidx.compose.ui.geometry.e.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
