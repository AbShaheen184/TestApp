package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.app.mlounge.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static final com.google.android.material.shape.g a = new com.google.android.material.shape.g();
    public static final com.google.firebase.heartbeatinfo.e b = new com.google.firebase.heartbeatinfo.e();
    public static final com.google.android.gms.common.internal.k c = new com.google.android.gms.common.internal.k(11);
    public static final androidx.lifecycle.viewmodel.internal.c d = new androidx.lifecycle.viewmodel.internal.c();

    public static final void a(q0 q0Var, androidx.savedstate.e eVar, p pVar) {
        eVar.getClass();
        pVar.getClass();
        j0 j0Var = (j0) q0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (j0Var == null || j0Var.z) {
            return;
        }
        j0Var.L(pVar, eVar);
        o oVar = ((x) pVar).d;
        if (oVar == o.y || oVar.compareTo(o.A) >= 0) {
            eVar.d();
        } else {
            pVar.a(new androidx.activity.b0(pVar, eVar));
        }
    }

    public static final i0 b(androidx.lifecycle.viewmodel.c cVar) {
        i0 i0Var;
        cVar.getClass();
        androidx.savedstate.g gVar = (androidx.savedstate.g) cVar.a(a);
        if (gVar == null) {
            net.luminis.tls.engine.impl.c.o("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        w0 w0Var = (w0) cVar.a(b);
        if (w0Var == null) {
            net.luminis.tls.engine.impl.c.o("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) cVar.a(c);
        String str = (String) cVar.a(u0.b);
        if (str == null) {
            net.luminis.tls.engine.impl.c.o("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        androidx.savedstate.d dVarB = gVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        m0 m0Var = dVarB instanceof m0 ? (m0) dVarB : null;
        if (m0Var == null) {
            net.luminis.tls.engine.impl.c.r("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = f(w0Var).b;
        i0 i0Var2 = (i0) linkedHashMap.get(str);
        if (i0Var2 != null) {
            return i0Var2;
        }
        m0Var.b();
        Bundle bundle3 = m0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                m0Var.c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            i0Var = new i0();
        } else {
            ClassLoader classLoader = i0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            kotlin.collections.builders.e eVar = new kotlin.collections.builders.e(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                eVar.put(str2, bundle.get(str2));
            }
            i0Var = new i0(eVar.b());
        }
        linkedHashMap.put(str, i0Var);
        return i0Var;
    }

    public static final void c(androidx.savedstate.g gVar) {
        o oVar = ((x) gVar.getLifecycle()).d;
        if (oVar != o.y && oVar != o.z) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
        } else if (gVar.getSavedStateRegistry().b() == null) {
            m0 m0Var = new m0(gVar.getSavedStateRegistry(), (w0) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m0Var);
            gVar.getLifecycle().a(new e(m0Var, 1));
        }
    }

    public static final v d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            v vVar = tag instanceof v ? (v) tag : null;
            if (vVar != null) {
                return vVar;
            }
            Object objW = android.support.v4.media.session.b.w(view);
            view = objW instanceof View ? (View) objW : null;
        }
        return null;
    }

    public static final w0 e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            w0 w0Var = tag instanceof w0 ? (w0) tag : null;
            if (w0Var != null) {
                return w0Var;
            }
            Object objW = android.support.v4.media.session.b.w(view);
            view = objW instanceof View ? (View) objW : null;
        }
        return null;
    }

    public static final n0 f(w0 w0Var) {
        u0 u0VarF = com.google.firebase.heartbeatinfo.e.f(w0Var, new k0(), 4);
        return (n0) ((com.google.firebase.messaging.o) u0VarF.a).y("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.a0.a(n0.class));
    }

    public static final androidx.lifecycle.viewmodel.internal.a g(q0 q0Var) {
        androidx.lifecycle.viewmodel.internal.a aVar;
        q0Var.getClass();
        synchronized (d) {
            aVar = (androidx.lifecycle.viewmodel.internal.a) q0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                kotlin.coroutines.i immediate = kotlin.coroutines.j.e;
                try {
                    immediate = Dispatchers.getMain().getImmediate();
                } catch (IllegalStateException | kotlin.j unused) {
                }
                androidx.lifecycle.viewmodel.internal.a aVar2 = new androidx.lifecycle.viewmodel.internal.a(immediate.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                q0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
