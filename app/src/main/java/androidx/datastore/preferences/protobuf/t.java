package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected a1 unknownFields;

    public t() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = a1.f;
    }

    public static t d(Class cls) {
        t tVar = defaultInstanceMap.get(cls);
        if (tVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) ((t) g1.d(cls)).c(6);
        if (tVar2 != null) {
            defaultInstanceMap.put(cls, tVar2);
            return tVar2;
        }
        org.mozilla.javascript.c.a();
        return null;
    }

    public static Object e(Method method, t tVar, Object... objArr) {
        try {
            return method.invoke(tVar, objArr);
        } catch (IllegalAccessException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(t tVar, boolean z) {
        byte bByteValue = ((Byte) tVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        r0 r0Var = r0.c;
        r0Var.getClass();
        boolean zC = r0Var.a(tVar.getClass()).c(tVar);
        if (z) {
            tVar.c(2);
        }
        return zC;
    }

    public static void j(Class cls, t tVar) {
        tVar.h();
        defaultInstanceMap.put(cls, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(u0 u0Var) {
        int iF;
        int iF2;
        if (g()) {
            if (u0Var == null) {
                r0 r0Var = r0.c;
                r0Var.getClass();
                iF2 = r0Var.a(getClass()).f(this);
            } else {
                iF2 = u0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(iF2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (u0Var == null) {
            r0 r0Var2 = r0.c;
            r0Var2.getClass();
            iF = r0Var2.a(getClass()).f(this);
        } else {
            iF = u0Var.f(this);
        }
        k(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(j jVar) {
        r0 r0Var = r0.c;
        r0Var.getClass();
        u0 u0VarA = r0Var.a(getClass());
        d0 d0Var = jVar.a;
        if (d0Var == null) {
            d0Var = new d0(jVar);
        }
        u0VarA.e(this, d0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r0 r0Var = r0.c;
        r0Var.getClass();
        return r0Var.a(getClass()).h(this, (t) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            r0 r0Var = r0.c;
            r0Var.getClass();
            return r0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            r0 r0Var2 = r0.c;
            r0Var2.getClass();
            this.memoizedHashCode = r0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final t i() {
        return (t) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = k0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        k0.c(this, sb, 0);
        return sb.toString();
    }
}
