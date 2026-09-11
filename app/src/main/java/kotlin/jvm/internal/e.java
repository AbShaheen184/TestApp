package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.reflect.c, d {
    public static final Map y;
    public final Class e;

    static {
        List listQ = com.google.common.base.c.q(kotlin.jvm.functions.a.class, kotlin.jvm.functions.l.class, kotlin.jvm.functions.p.class, kotlin.jvm.functions.q.class, kotlin.jvm.functions.r.class, kotlin.jvm.functions.s.class, kotlin.jvm.functions.t.class, kotlin.jvm.functions.u.class, kotlin.jvm.functions.v.class, kotlin.jvm.functions.w.class, kotlin.jvm.functions.b.class, kotlin.jvm.functions.c.class, kotlin.jvm.functions.d.class, kotlin.jvm.functions.e.class, kotlin.jvm.functions.f.class, kotlin.jvm.functions.g.class, kotlin.jvm.functions.h.class, kotlin.jvm.functions.i.class, kotlin.jvm.functions.j.class, kotlin.jvm.functions.k.class, kotlin.jvm.functions.m.class, kotlin.jvm.functions.n.class, kotlin.jvm.functions.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(listQ, 10));
        int i = 0;
        for (Object obj : listQ) {
            int i2 = i + 1;
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            arrayList.add(new kotlin.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        y = kotlin.collections.a0.G(arrayList);
    }

    public e(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.e;
    }

    public final String b() {
        String strD;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strD2 = c0.d(cls.getName());
            return strD2 == null ? cls.getCanonicalName() : strD2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strD = c0.d(componentType.getName())) != null) {
            strConcat = strD.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strF;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strF2 = c0.f(cls.getName());
                return strF2 == null ? cls.getSimpleName() : strF2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strF = c0.f(componentType.getName())) != null) {
                strConcat = strF.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return kotlin.text.k.q0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iA0 = kotlin.text.k.a0(simpleName, '$', 0, 6);
            return iA0 == -1 ? simpleName : simpleName.substring(iA0 + 1, simpleName.length());
        }
        return kotlin.text.k.q0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class clsV = this.e;
        clsV.getClass();
        Map map = y;
        map.getClass();
        Integer num = (Integer) map.get(clsV);
        if (num != null) {
            return c0.e(num.intValue(), obj);
        }
        if (clsV.isPrimitive()) {
            clsV = com.google.android.material.motion.a.v(a0.a(clsV));
        }
        return clsV.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && com.google.android.material.motion.a.v(this).equals(com.google.android.material.motion.a.v((kotlin.reflect.c) obj));
    }

    public final int hashCode() {
        return com.google.android.material.motion.a.v(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
