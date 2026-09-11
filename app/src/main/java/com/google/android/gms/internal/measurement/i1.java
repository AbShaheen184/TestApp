package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends m0 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected s2 zzc;

    public i1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = s2.f;
    }

    public static i1 e(i1 i1Var, byte[] bArr, a1 a1Var) throws t1 {
        int length = bArr.length;
        if (length != 0) {
            i1 i1VarI = i1Var.i();
            try {
                m2 m2VarA = j2.c.a(i1VarI.getClass());
                m2VarA.h(i1VarI, bArr, 0, length, new p0(a1Var));
                m2VarA.f(i1VarI);
                i1Var = i1VarI;
            } catch (q2 e) {
                throw e.a();
            } catch (t1 e2) {
                if (e2.e) {
                    throw new t1(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof t1) {
                    throw ((t1) e3.getCause());
                }
                throw new t1(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        s(i1Var);
        return i1Var;
    }

    public static i1 o(Class cls) {
        Map map = zze;
        i1 i1Var = (i1) map.get(cls);
        if (i1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i1Var = (i1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = (i1) ((i1) x2.d(cls)).t(6);
        if (i1Var2 != null) {
            map.put(cls, i1Var2);
            return i1Var2;
        }
        org.mozilla.javascript.c.a();
        return null;
    }

    public static void p(Class cls, i1 i1Var) {
        i1Var.h();
        zze.put(cls, i1Var);
    }

    public static Object q(Method method, i1 i1Var, Object... objArr) {
        try {
            return method.invoke(i1Var, objArr);
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

    public static final boolean r(i1 i1Var, boolean z) {
        byte bByteValue = ((Byte) i1Var.t(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = j2.c.a(i1Var.getClass()).e(i1Var);
        if (z) {
            i1Var.t(2);
        }
        return zE;
    }

    public static void s(i1 i1Var) throws t1 {
        if (i1Var != null && !r(i1Var, true)) {
            throw new q2().a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.m0
    public final int c(m2 m2Var) {
        if (g()) {
            int iB = m2Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            androidx.transition.k.j(String.valueOf(iB).length() + 42, iB);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iB2 = m2Var.b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        androidx.transition.k.j(String.valueOf(iB2).length() + 42, iB2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j2.c.a(getClass()).g(this, (i1) obj);
    }

    public final void f(z0 z0Var) {
        m2 m2VarA = j2.c.a(getClass());
        s5 s5Var = z0Var.a;
        if (s5Var == null) {
            s5Var = new s5(z0Var);
        }
        m2VarA.i(this, s5Var);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return j2.c.a(getClass()).j(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iJ = j2.c.a(getClass()).j(this);
        this.zza = iJ;
        return iJ;
    }

    public final i1 i() {
        return (i1) t(4);
    }

    public final void j() {
        j2.c.a(getClass()).f(this);
        h();
    }

    public final g1 k() {
        return (g1) t(5);
    }

    public final g1 l() {
        g1 g1Var = (g1) t(5);
        g1Var.e(this);
        return g1Var;
    }

    public final void m() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int n() {
        if (g()) {
            int iB = j2.c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            androidx.transition.k.j(String.valueOf(iB).length() + 42, iB);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iB2 = j2.c.a(getClass()).b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        androidx.transition.k.j(String.valueOf(iB2).length() + 42, iB2);
        return 0;
    }

    public abstract Object t(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = d2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        d2.b(this, sb, 0);
        return sb.toString();
    }
}
