package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        Object objB;
        u uVar = new u(new m(context, 0));
        uVar.a = 1;
        if (j.k == null) {
            synchronized (j.j) {
                try {
                    if (j.k == null) {
                        j.k = new j(uVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        androidx.startup.a aVarC = androidx.startup.a.c(context);
        aVarC.getClass();
        synchronized (androidx.startup.a.e) {
            try {
                objB = aVarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        androidx.lifecycle.p lifecycle = ((androidx.lifecycle.v) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
