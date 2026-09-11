package androidx.lifecycle.compose;

import androidx.compose.runtime.p1;
import androidx.compose.runtime.saveable.f;
import androidx.compose.runtime.u2;
import androidx.lifecycle.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final p1 a;

    static {
        Object lVar;
        try {
            ClassLoader classLoader = v.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof p1) {
                        lVar = (p1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof kotlin.c)) {
                    i++;
                }
                lVar = null;
                break;
            }
        } catch (Throwable th) {
            lVar = new l(th);
        }
        p1 u2Var = (p1) (lVar instanceof l ? null : lVar);
        if (u2Var == null) {
            u2Var = new u2(new f(4));
        }
        a = u2Var;
    }
}
