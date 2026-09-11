package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable {
    public final int A;
    public final boolean B;
    public final t e;
    public final Bundle y;
    public final boolean z;

    public s(t tVar, Bundle bundle, boolean z, int i, boolean z2) {
        this.e = tVar;
        this.y = bundle;
        this.z = z;
        this.A = i;
        this.B = z2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        sVar.getClass();
        boolean z = sVar.B;
        boolean z2 = sVar.z;
        Bundle bundle = sVar.y;
        boolean z3 = this.z;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.A - sVar.A;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.y;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.B;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
