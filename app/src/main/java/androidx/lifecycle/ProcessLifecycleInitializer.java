package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return kotlin.collections.u.e;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        context.getClass();
        androidx.startup.a aVarC = androidx.startup.a.c(context);
        aVarC.getClass();
        if (!aVarC.b.contains(ProcessLifecycleInitializer.class)) {
            net.luminis.tls.engine.impl.c.r("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!s.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        e0 e0Var = e0.F;
        e0Var.getClass();
        e0Var.B = new Handler();
        e0Var.C.e(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d0(e0Var));
        return e0Var;
    }
}
