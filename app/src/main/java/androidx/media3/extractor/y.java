package androidx.media3.extractor;

import java.io.Serializable;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.g = b.s[3 - i3];
        int i6 = b.t[i5];
        this.c = i6;
        if (i2 == 2) {
            this.c = i6 / 2;
        } else if (i2 == 0) {
            this.c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    net.luminis.tls.engine.impl.c.a();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? b.u[i4 - 1] : b.v[i4 - 1];
            this.e = i9;
            this.b = (((i9 * 12) / this.c) + i7) * 4;
        } else {
            int i10 = Token.LABEL;
            if (i2 == 3) {
                int i11 = i3 == 2 ? b.w[i4 - 1] : b.x[i4 - 1];
                this.e = i11;
                this.b = ((i11 * Token.LABEL) / this.c) + i7;
            } else {
                int i12 = b.y[i4 - 1];
                this.e = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.b = ((i10 * i12) / this.c) + i7;
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
