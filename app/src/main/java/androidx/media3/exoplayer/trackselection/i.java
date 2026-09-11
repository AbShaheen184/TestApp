package androidx.media3.exoplayer.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.a1;
import androidx.media3.common.x0;
import androidx.media3.common.z0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public i(j jVar) {
        c(jVar);
        this.x = jVar.x;
        this.y = jVar.y;
        this.z = jVar.z;
        this.A = jVar.A;
        this.B = jVar.B;
        this.C = jVar.C;
        this.D = jVar.D;
        SparseArray sparseArray = jVar.E;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.E = sparseArray2;
        this.F = jVar.F.clone();
    }

    @Override // androidx.media3.common.z0
    public final a1 a() {
        return new j(this);
    }

    @Override // androidx.media3.common.z0
    public final z0 b(int i) {
        super.b(i);
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 d() {
        this.u = -3;
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 e(x0 x0Var) {
        super.e(x0Var);
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 f(String str) {
        super.f(str);
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 h() {
        this.s = false;
        return this;
    }

    @Override // androidx.media3.common.z0
    public final z0 i(int i, boolean z) {
        super.i(i, z);
        return this;
    }

    public final void j(Set set) {
        this.w.clear();
        this.w.addAll(set);
    }

    public i() {
        this.E = new SparseArray();
        this.F = new SparseBooleanArray();
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
    }
}
