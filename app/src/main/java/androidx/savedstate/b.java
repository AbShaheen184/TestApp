package androidx.savedstate;

import android.os.Bundle;
import androidx.activity.p;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {
    public final /* synthetic */ int e;
    public final g y;

    public /* synthetic */ b(g gVar, int i) {
        this.e = i;
        this.y = gVar;
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        switch (this.e) {
            case 0:
                if (nVar != n.ON_CREATE) {
                    net.luminis.tls.engine.impl.c.m("Next event must be ON_CREATE");
                    return;
                }
                vVar.getLifecycle().b(this);
                g gVar = this.y;
                Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    net.luminis.tls.engine.impl.c.r("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(gVar instanceof w0)) {
                                    net.luminis.tls.engine.impl.c.e(gVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                v0 viewModelStore = ((w0) gVar).getViewModelStore();
                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    q0 q0Var = (q0) linkedHashMap.get(str2);
                                    if (q0Var != null) {
                                        l0.a(q0Var, savedStateRegistry, gVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                androidx.media3.exoplayer.hls.playlist.a.j(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        androidx.media3.exoplayer.hls.playlist.a.j(androidx.privacysandbox.ads.adservices.java.internal.a.q("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            default:
                p pVar = (p) this.y;
                p.access$ensureViewModelStore(pVar);
                pVar.getLifecycle().b(this);
                return;
        }
    }
}
