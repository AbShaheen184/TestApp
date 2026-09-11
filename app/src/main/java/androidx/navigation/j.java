package androidx.navigation;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final com.google.android.gms.cloudmessaging.n a;

    public j(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(j.class.getClassLoader());
        bundle.getClass();
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            android.support.v4.media.session.b.z("nav-entry-state:id");
            throw null;
        }
        nVar.y = string;
        nVar.e = _COROUTINE.b.r("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            android.support.v4.media.session.b.z("nav-entry-state:args");
            throw null;
        }
        nVar.z = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 == null) {
            android.support.v4.media.session.b.z("nav-entry-state:saved-state");
            throw null;
        }
        nVar.A = bundle3;
        this.a = nVar;
    }

    public j(i iVar) {
        int i = iVar.y.y.a;
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        nVar.y = iVar.C;
        nVar.e = i;
        androidx.navigation.internal.c cVar = iVar.E;
        nVar.z = cVar.a();
        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        nVar.A = bundleI;
        cVar.h.c(bundleI);
        this.a = nVar;
    }
}
