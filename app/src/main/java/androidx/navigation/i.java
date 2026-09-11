package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.lifecycle.v, w0, androidx.lifecycle.j, androidx.savedstate.g {
    public androidx.lifecycle.o A;
    public final m B;
    public final String C;
    public final Bundle D;
    public final androidx.navigation.internal.c E = new androidx.navigation.internal.c(this);
    public final androidx.media3.exoplayer.mediacodec.g e;
    public t y;
    public final Bundle z;

    public i(androidx.media3.exoplayer.mediacodec.g gVar, t tVar, Bundle bundle, androidx.lifecycle.o oVar, m mVar, String str, Bundle bundle2) {
        this.e = gVar;
        this.y = tVar;
        this.z = bundle;
        this.A = oVar;
        this.B = mVar;
        this.C = str;
        this.D = bundle2;
        new kotlin.o(new androidx.activity.w(this, 27));
    }

    public final void a(androidx.lifecycle.o oVar) {
        androidx.navigation.internal.c cVar = this.E;
        cVar.getClass();
        cVar.k = oVar;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            Bundle bundle = iVar.z;
            if (kotlin.jvm.internal.l.a(this.C, iVar.C) && kotlin.jvm.internal.l.a(this.y, iVar.y) && kotlin.jvm.internal.l.a(this.E.j, iVar.E.j) && kotlin.jvm.internal.l.a(getSavedStateRegistry(), iVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.z;
                if (kotlin.jvm.internal.l.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.l.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.viewmodel.c getDefaultViewModelCreationExtras() {
        Application application;
        androidx.navigation.internal.c cVar = this.E;
        cVar.getClass();
        androidx.lifecycle.viewmodel.e eVar = new androidx.lifecycle.viewmodel.e(0);
        com.google.android.material.shape.g gVar = androidx.lifecycle.l0.a;
        i iVar = cVar.a;
        LinkedHashMap linkedHashMap = eVar.a;
        linkedHashMap.put(gVar, iVar);
        linkedHashMap.put(androidx.lifecycle.l0.b, iVar);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            linkedHashMap.put(androidx.lifecycle.l0.c, bundleA);
        }
        androidx.media3.exoplayer.mediacodec.g gVar2 = this.e;
        if (gVar2 == null) {
            application = null;
        } else {
            Context context = gVar2.e;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(r0.d, application2);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    public final s0 getDefaultViewModelProviderFactory() {
        return this.E.l;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        return this.E.j;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.E.h.b;
    }

    @Override // androidx.lifecycle.w0
    public final v0 getViewModelStore() {
        androidx.navigation.internal.c cVar = this.E;
        if (!cVar.i) {
            net.luminis.tls.engine.impl.c.r("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (cVar.j.d == androidx.lifecycle.o.e) {
            net.luminis.tls.engine.impl.c.r("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        m mVar = cVar.e;
        if (mVar == null) {
            net.luminis.tls.engine.impl.c.r("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = cVar.f;
        str.getClass();
        LinkedHashMap linkedHashMap = mVar.b;
        v0 v0Var = (v0) linkedHashMap.get(str);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0();
        linkedHashMap.put(str, v0Var2);
        return v0Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.y.hashCode() + (this.C.hashCode() * 31);
        Bundle bundle = this.z;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.E.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.E.toString();
    }
}
