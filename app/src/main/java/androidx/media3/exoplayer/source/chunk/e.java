package androidx.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p {
    public static final r H = new r();
    public final SparseArray A = new SparseArray();
    public final d B = d.a;
    public boolean C;
    public androidx.media3.common.util.b D;
    public long E;
    public a0 F;
    public androidx.media3.common.r[] G;
    public final n e;
    public final int y;
    public final androidx.media3.common.r z;

    public e(n nVar, int i, androidx.media3.common.r rVar) {
        this.e = nVar;
        this.y = i;
        this.z = rVar;
    }

    public final androidx.media3.extractor.j a() {
        a0 a0Var = this.F;
        if (a0Var instanceof androidx.media3.extractor.j) {
            return (androidx.media3.extractor.j) a0Var;
        }
        if (a0Var instanceof androidx.media3.extractor.mkv.c) {
            return ((androidx.media3.extractor.mkv.c) a0Var).a;
        }
        return null;
    }

    public final void b(androidx.media3.common.util.b bVar, long j, long j2) {
        this.D = bVar;
        this.E = j2;
        boolean z = this.C;
        n nVar = this.e;
        if (!z) {
            nVar.d(this);
            if (j != -9223372036854775807L) {
                nVar.b(0L, j);
            }
            this.C = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        nVar.b(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i);
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j2;
                h0 h0VarI = bVar.I(cVar.a);
                cVar.f = h0VarI;
                androidx.media3.common.r rVar = cVar.e;
                if (rVar != null) {
                    h0VarI.e(rVar);
                }
            }
            i++;
        }
    }

    @Override // androidx.media3.extractor.p
    public final void g(a0 a0Var) {
        this.F = a0Var;
    }

    @Override // androidx.media3.extractor.p
    public final void o() {
        SparseArray sparseArray = this.A;
        androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            androidx.media3.common.r rVar = ((c) sparseArray.valueAt(i)).e;
            rVar.getClass();
            rVarArr[i] = rVar;
        }
        this.G = rVarArr;
    }

    @Override // androidx.media3.extractor.p
    public final h0 u(int i, int i2) {
        SparseArray sparseArray = this.A;
        c cVar = (c) sparseArray.get(i);
        if (cVar == null) {
            com.google.android.material.motion.a.q(this.G == null);
            cVar = new c(i, i2, i2 == this.y ? this.z : null, this.B);
            androidx.media3.common.util.b bVar = this.D;
            long j = this.E;
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j;
                h0 h0VarI = bVar.I(i2);
                cVar.f = h0VarI;
                androidx.media3.common.r rVar = cVar.e;
                if (rVar != null) {
                    h0VarI.e(rVar);
                }
            }
            sparseArray.put(i, cVar);
        }
        return cVar;
    }
}
