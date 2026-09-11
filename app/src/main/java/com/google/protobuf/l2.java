package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 {
    public static final Unsafe a;
    public static final Class b;
    public static final k2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafeJ = j();
        a = unsafeJ;
        b = d.a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        k2 j2Var = null;
        if (unsafeJ != null) {
            if (!d.a()) {
                j2Var = new j2(unsafeJ);
            } else if (zF) {
                j2Var = new i2(unsafeJ, 1);
            } else if (zF2) {
                j2Var = new i2(unsafeJ, 0);
            }
        }
        c = j2Var;
        d = j2Var == null ? false : j2Var.u();
        e = j2Var == null ? false : j2Var.t();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        g = (fieldE == null || j2Var == null) ? -1L : j2Var.l(fieldE);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(l2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return c.e(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new h2());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(l2.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.n(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iH = c.h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(j2, obj, ((255 & b2) << i) | (iH & (~(255 << i))));
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(j2, obj, ((255 & b2) << i) | (c.h(j2, obj) & (~(255 << i))));
    }

    public static void n(long j, Object obj, int i) {
        c.q(j, obj, i);
    }

    public static void o(Object obj, long j, long j2) {
        c.r(obj, j, j2);
    }

    public static void p(long j, Object obj, Object obj2) {
        c.s(j, obj, obj2);
    }
}
