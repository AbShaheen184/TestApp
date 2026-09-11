package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final h0 a;
    public final boolean b;
    public final boolean c;
    public final androidx.media3.container.v f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public n m = new n();
    public n n = new n();
    public boolean k = false;
    public boolean o = false;

    public o(h0 h0Var, boolean z, boolean z2) {
        this.a = h0Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new androidx.media3.container.v(bArr, 0, 0);
        n nVar = this.n;
        nVar.b = false;
        nVar.a = false;
    }
}
