package androidx.media3.extractor.ogg;

import androidx.media3.common.util.w;
import androidx.media3.extractor.o;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final w b = new w(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            f fVar = this.a;
            if (i5 >= fVar.c) {
                break;
            }
            int[] iArr = fVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(o oVar) {
        int i;
        com.google.android.material.motion.a.q(oVar != null);
        boolean z = this.e;
        w wVar = this.b;
        if (z) {
            this.e = false;
            wVar.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            f fVar = this.a;
            if (i2 < 0) {
                if (fVar.b(oVar, -1L) && fVar.a(oVar, true)) {
                    int iA = fVar.d;
                    if ((fVar.a & 1) == 1 && wVar.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        oVar.r(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                wVar.c(wVar.c + iA2);
                try {
                    oVar.readFully(wVar.a, wVar.c, iA2);
                    wVar.L(wVar.c + iA2);
                    this.e = fVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == fVar.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
