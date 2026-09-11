package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements s0 {
    public final Application a;
    public final r0 b;
    public final Bundle c;
    public final p d;
    public final androidx.savedstate.e e;

    public o0(Application application, androidx.savedstate.g gVar, Bundle bundle) {
        r0 r0Var;
        this.e = gVar.getSavedStateRegistry();
        this.d = gVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (r0.c == null) {
                r0.c = new r0(application);
            }
            r0Var = r0.c;
            r0Var.getClass();
        } else {
            r0Var = new r0(null);
        }
        this.b = r0Var;
    }

    @Override // androidx.lifecycle.s0
    public final q0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        net.luminis.tls.engine.impl.c.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.s0
    public final q0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        LinkedHashMap linkedHashMap = eVar.a;
        String str = (String) linkedHashMap.get(u0.b);
        if (str == null) {
            net.luminis.tls.engine.impl.c.r("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(l0.a) == null || linkedHashMap.get(l0.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            net.luminis.tls.engine.impl.c.r("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(r0.d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? p0.a(cls, p0.b) : p0.a(cls, p0.a);
        if (constructorA == null) {
            return this.b.b(cls, eVar);
        }
        return (!zIsAssignableFrom || application == null) ? p0.b(cls, constructorA, l0.b(eVar)) : p0.b(cls, constructorA, application, l0.b(eVar));
    }

    @Override // androidx.lifecycle.s0
    public final q0 c(kotlin.jvm.internal.e eVar, androidx.lifecycle.viewmodel.e eVar2) {
        Class clsA = eVar.a();
        clsA.getClass();
        return b(clsA, eVar2);
    }

    public final q0 d(Class cls, String str) {
        i0 i0Var;
        p pVar = this.d;
        if (pVar == null) {
            com.google.gson.b.r("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? p0.a(cls, p0.b) : p0.a(cls, p0.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (t0.a == null) {
                t0.a = new t0();
            }
            t0.a.getClass();
            return com.google.android.gms.dynamite.g.h(cls);
        }
        androidx.savedstate.e eVar = this.e;
        eVar.getClass();
        Bundle bundleA = eVar.a(str);
        if (bundleA == null) {
            bundleA = this.c;
        }
        if (bundleA == null) {
            i0Var = new i0();
        } else {
            ClassLoader classLoader = i0.class.getClassLoader();
            classLoader.getClass();
            bundleA.setClassLoader(classLoader);
            kotlin.collections.builders.e eVar2 = new kotlin.collections.builders.e(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                str2.getClass();
                eVar2.put(str2, bundleA.get(str2));
            }
            i0Var = new i0(eVar2.b());
        }
        j0 j0Var = new j0(str, i0Var);
        j0Var.L(pVar, eVar);
        o oVar = ((x) pVar).d;
        if (oVar == o.y || oVar.compareTo(o.A) >= 0) {
            eVar.d();
        } else {
            pVar.a(new androidx.activity.b0(pVar, eVar));
        }
        q0 q0VarB = (!zIsAssignableFrom || application == null) ? p0.b(cls, constructorA, i0Var) : p0.b(cls, constructorA, application, i0Var);
        q0VarB.a("androidx.lifecycle.savedstate.vm.tag", j0Var);
        return q0VarB;
    }

    public o0() {
        this.b = new r0(null);
    }
}
