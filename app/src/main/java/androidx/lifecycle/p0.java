package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public static final List a = com.google.common.base.c.q(Application.class, i0.class);
    public static final List b = com.google.common.base.c.p(i0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listV = kotlin.collections.n.V(parameterTypes);
            if (list.equals(listV)) {
                return constructor;
            }
            if (list.size() == listV.size() && listV.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final q0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (q0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            androidx.core.graphics.b.d("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            androidx.media3.exoplayer.hls.playlist.a.j("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
