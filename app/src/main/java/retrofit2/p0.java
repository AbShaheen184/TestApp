package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final Pattern y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final t0 a;
    public final Class b;
    public final Method c;
    public final Annotation[] d;
    public final Annotation[][] e;
    public final Type[] f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public okhttp3.r t;
    public okhttp3.u u;
    public LinkedHashSet v;
    public z0[] w;
    public boolean x;

    public p0(t0 t0Var, Class cls, Method method) {
        this.a = t0Var;
        this.b = cls;
        this.c = method;
        this.d = method.getAnnotations();
        this.f = method.getGenericParameterTypes();
        this.e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z2) {
        String str3 = this.o;
        Method method = this.c;
        if (str3 != null) {
            throw z0.l(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.o = str;
        this.p = z2;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw z0.l(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.v = linkedHashSet;
    }

    public final void c(int i, Type type) {
        if (z0.j(type)) {
            throw z0.m(this.c, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
