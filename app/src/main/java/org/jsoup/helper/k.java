package org.jsoup.helper;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class k {
    public static final boolean b;
    public final Pattern a;

    static {
        boolean z = false;
        try {
            try {
                Class<?> cls = Class.forName("com.google.re2j.Pattern", false, k.class.getClassLoader());
                try {
                    Class<?> cls2 = Class.forName("java.lang.Module");
                    Method method = Class.class.getMethod("getModule", null);
                    Object objInvoke = method.invoke(k.class, null);
                    Object objInvoke2 = method.invoke(cls, null);
                    if (!((Boolean) cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2)).booleanValue()) {
                        cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                    }
                } catch (ClassNotFoundException unused) {
                }
                z = true;
            } catch (ReflectiveOperationException e) {
                System.err.println("Warning: (bug? please report) couldn't access re2j from jsoup due to modules: " + e);
            }
        } catch (ClassNotFoundException unused2) {
        }
        b = z;
    }

    public k(Pattern pattern) {
        this.a = pattern;
    }

    public static k a(String str) {
        if (b && Boolean.parseBoolean(System.getProperty("jsoup.useRe2j", "true"))) {
            return h.c(str);
        }
        try {
            return new k(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new o("Pattern syntax error: " + e.getMessage());
        }
    }

    public j b(String str) {
        return new i(this.a.matcher(str));
    }

    public String toString() {
        return this.a.toString();
    }
}
