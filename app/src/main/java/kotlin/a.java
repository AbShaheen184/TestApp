package kotlin;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final kotlin.coroutines.intrinsics.a a = kotlin.coroutines.intrinsics.a.e;

    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = kotlin.internal.jdk7.a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = kotlin.internal.a.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final l b(Throwable th) {
        th.getClass();
        return new l(th);
    }

    public static h c(i iVar, kotlin.jvm.functions.a aVar) {
        v vVar = v.a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return new o(aVar);
        }
        if (iOrdinal == 1) {
            n nVar = new n();
            nVar.e = aVar;
            nVar.y = vVar;
            return nVar;
        }
        if (iOrdinal != 2) {
            coil3.g.a();
            return null;
        }
        z zVar = new z(0);
        zVar.y = aVar;
        zVar.z = vVar;
        return zVar;
    }

    public static o d(kotlin.jvm.functions.a aVar) {
        aVar.getClass();
        return new o(aVar);
    }

    public static final void e(Object obj) {
        if (obj instanceof l) {
            throw ((l) obj).e;
        }
    }

    public static final double f(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final String g(int i, long j) {
        if (j >= 0) {
            com.google.android.material.shape.e.a(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        com.google.android.material.shape.e.a(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        com.google.android.material.shape.e.a(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }
}
