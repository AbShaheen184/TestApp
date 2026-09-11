package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.nio.ch.DirectBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static Method a;
    public static Method b;
    public static final Method c;
    public static final Constructor d;
    public static final Class e;
    public static final int f;
    public static final Method g;

    static {
        Constructor<?> declaredConstructor;
        Method method;
        int i;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
            Class<?> cls3 = byteBufferAllocateDirect.getClass();
            e = cls3;
            try {
                try {
                    try {
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(cls2, cls2);
                            i = 1;
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = e.getDeclaredConstructor(cls, cls);
                            i = 4;
                        }
                    } catch (NoSuchMethodException unused2) {
                        Class<?> cls4 = Class.forName("java.nio.MemoryBlock");
                        Method declaredMethod = cls4.getDeclaredMethod("wrapFromJni", cls, cls2);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = e.getDeclaredConstructor(cls4, cls, cls);
                        method = declaredMethod;
                        i = 5;
                    }
                } catch (NoSuchMethodException unused3) {
                    declaredConstructor = e.getDeclaredConstructor(cls2, cls, Object.class);
                    i = 2;
                }
            } catch (NoSuchMethodException unused4) {
                declaredConstructor = e.getDeclaredConstructor(cls2, cls);
                i = 3;
            }
            method = null;
            d = declaredConstructor;
            f = i;
            g = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            try {
                declaredConstructor.setAccessible(true);
            } catch (RuntimeException e2) {
                if (!"java.lang.reflect.InaccessibleObjectException".equals(e2.getClass().getName())) {
                    throw e2;
                }
                d = null;
            }
            if (MessageBuffer.javaVersion <= 8) {
                b(byteBufferAllocateDirect);
                return;
            }
            Object objDoPrivileged = AccessController.doPrivileged(new c(byteBufferAllocateDirect, 0));
            if (objDoPrivileged instanceof Throwable) {
                throw new RuntimeException((Throwable) objDoPrivileged);
            }
            c = (Method) objDoPrivileged;
        } catch (Exception e3) {
            net.luminis.tls.engine.impl.c.k(e3);
        }
    }

    public static long a(ByteBuffer byteBuffer) {
        return ((DirectBuffer) byteBuffer).address();
    }

    public static void b(ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new c(byteBuffer, 1));
        if (objDoPrivileged instanceof Throwable) {
            net.luminis.tls.engine.impl.c.k((Throwable) objDoPrivileged);
            return;
        }
        a = (Method) objDoPrivileged;
        Object objDoPrivileged2 = AccessController.doPrivileged(new c(byteBuffer, 2));
        if (objDoPrivileged2 instanceof Throwable) {
            net.luminis.tls.engine.impl.c.k((Throwable) objDoPrivileged2);
        } else {
            b = (Method) objDoPrivileged2;
        }
    }
}
