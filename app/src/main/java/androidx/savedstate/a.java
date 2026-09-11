package androidx.savedstate;

import android.os.Bundle;
import androidx.room.r;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.o;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(e eVar) {
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // androidx.savedstate.d
    public final Bundle a() {
        Bundle bundleI = coil3.network.g.i((k[]) Arrays.copyOf(new k[0], 0));
        r.r(bundleI, "classes_to_restore", o.k0(this.a));
        return bundleI;
    }
}
