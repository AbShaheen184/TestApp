package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends t0 {
    public static r0 c;
    public static final com.google.android.material.shape.g d = new com.google.android.material.shape.g();
    public final Application b;

    public r0(Application application) {
        this.b = application;
    }

    @Override // androidx.lifecycle.t0, androidx.lifecycle.s0
    public final q0 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        com.google.gson.b.r("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.t0, androidx.lifecycle.s0
    public final q0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) eVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return com.google.android.gms.dynamite.g.h(cls);
        }
        net.luminis.tls.engine.impl.c.o("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final q0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return com.google.android.gms.dynamite.g.h(cls);
        }
        try {
            q0 q0Var = (q0) cls.getConstructor(Application.class).newInstance(application);
            q0Var.getClass();
            return q0Var;
        } catch (IllegalAccessException e) {
            androidx.core.graphics.b.d("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            androidx.core.graphics.b.d("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            androidx.core.graphics.b.d("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            androidx.core.graphics.b.d("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
