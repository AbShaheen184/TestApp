package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements androidx.savedstate.d {
    public final androidx.savedstate.e a;
    public boolean b;
    public Bundle c;
    public final kotlin.o d;

    public m0(androidx.savedstate.e eVar, w0 w0Var) {
        eVar.getClass();
        this.a = eVar;
        this.d = new kotlin.o(new androidx.activity.w(w0Var, 26));
    }

    @Override // androidx.savedstate.d
    public final Bundle a() {
        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleI.putAll(bundle);
        }
        for (Map.Entry entry : ((n0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((androidx.activity.g) ((i0) entry.getValue()).b.B).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleI.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleI;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleI.putAll(bundle);
        }
        if (bundleA != null) {
            bundleI.putAll(bundleA);
        }
        this.c = bundleI;
        this.b = true;
    }
}
