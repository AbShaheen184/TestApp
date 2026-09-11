package org.mozilla.javascript;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.SecureClassLoader;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SecureCaller {
    private static final byte[] secureCallerImplBytecode = loadBytecode();
    private static final Map<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>> callers = new WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class SecureClassLoaderImpl extends SecureClassLoader {
        public SecureClassLoaderImpl(ClassLoader classLoader) {
            super(classLoader);
        }

        public Class<?> defineAndLinkClass(String str, byte[] bArr, CodeSource codeSource) {
            Class<?> clsDefineClass = defineClass(str, bArr, 0, bArr.length, codeSource);
            resolveClass(clsDefineClass);
            return clsDefineClass;
        }
    }

    public static Object callSecurely(final CodeSource codeSource, Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Map<ClassLoader, SoftReference<SecureCaller>> weakHashMap;
        SecureCaller secureCaller;
        final Thread threadCurrentThread = Thread.currentThread();
        final ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.SecureCaller.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return threadCurrentThread.getContextClassLoader();
            }
        });
        Map<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>> map = callers;
        synchronized (map) {
            try {
                weakHashMap = map.get(codeSource);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    map.put(codeSource, weakHashMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (weakHashMap) {
            SoftReference<SecureCaller> softReference = weakHashMap.get(classLoader);
            SecureCaller secureCaller2 = softReference != null ? softReference.get() : null;
            if (secureCaller2 == null) {
                try {
                    secureCaller2 = (SecureCaller) AccessController.doPrivileged(new PrivilegedExceptionAction<Object>() { // from class: org.mozilla.javascript.SecureCaller.2
                        @Override // java.security.PrivilegedExceptionAction
                        public Object run() {
                            Class<?> cls = getClass();
                            return new SecureClassLoaderImpl(classLoader.loadClass(cls.getName()) != cls ? cls.getClassLoader() : classLoader).defineAndLinkClass(SecureCaller.class.getName().concat("Impl"), SecureCaller.secureCallerImplBytecode, codeSource).getDeclaredConstructor(null).newInstance(null);
                        }
                    });
                    weakHashMap.put(classLoader, new SoftReference<>(secureCaller2));
                } catch (PrivilegedActionException e) {
                    throw new UndeclaredThrowableException(e.getCause());
                }
            }
            secureCaller = secureCaller2;
        }
        return secureCaller.call(callable, context, scriptable, scriptable2, objArr);
    }

    private static byte[] loadBytecode() {
        return (byte[]) AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.SecureCaller.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                return SecureCaller.loadBytecodePrivileged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] loadBytecodePrivileged() {
        try {
            InputStream inputStreamOpenStream = SecureCaller.class.getResource("SecureCallerImpl.clazz").openStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = inputStreamOpenStream.read();
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStreamOpenStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(i);
                    throw new UndeclaredThrowableException(e);
                }
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new UndeclaredThrowableException(e);
        }
    }

    public abstract Object call(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr);
}
