package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.source.r0;
import java.util.Arrays;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = Parser.ARGC_LIMIT;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                a[] aVarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                aVar = aVarArr[i3];
                aVar.getClass();
                this.f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.b], 0);
                a[] aVarArr2 = this.f;
                if (i > aVarArr2.length) {
                    this.f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public final synchronized void b(r0 r0Var) {
        while (r0Var != null) {
            a[] aVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            a aVar = (a) r0Var.z;
            aVar.getClass();
            aVarArr[i] = aVar;
            this.d--;
            r0Var = (r0) r0Var.A;
            if (r0Var == null || ((a) r0Var.z) == null) {
                r0Var = null;
            }
        }
    }

    public final synchronized void c(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            d();
        }
    }

    public final synchronized void d() {
        int iMax = Math.max(0, j0.g(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}
