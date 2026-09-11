package androidx.media3.exoplayer.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.a1;
import androidx.media3.common.util.j0;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.source.i1;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a1 {
    public static final j G = new j(new i());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(1000, 1001, 1002, 1003, 1004);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(1005, 1006, 1007, 1008, 1009);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(1010, 1011, 1012, 1013, 1014);
        j0.K(1015);
        j0.K(1016);
        j0.K(1017);
        j0.K(1018);
    }

    public j(i iVar) {
        super(iVar);
        this.x = iVar.x;
        this.y = iVar.y;
        this.z = iVar.z;
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
        this.D = iVar.D;
        this.E = iVar.E;
        this.F = iVar.F;
    }

    @Override // androidx.media3.common.a1
    public final z0 a() {
        return new i(this);
    }

    @Override // androidx.media3.common.a1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.x == jVar.x && this.y == jVar.y && this.z == jVar.z && this.A == jVar.A && this.B == jVar.B && this.C == jVar.C && this.D == jVar.D) {
                SparseBooleanArray sparseBooleanArray = jVar.F;
                SparseBooleanArray sparseBooleanArray2 = this.F;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = jVar.E;
                    SparseArray sparseArray2 = this.E;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        i1 i1Var = (i1) entry.getKey();
                                        if (!map2.containsKey(i1Var) || !Objects.equals(entry.getValue(), map2.get(i1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.common.a1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 28629151) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 961) + (this.D ? 1 : 0)) * 31;
    }
}
