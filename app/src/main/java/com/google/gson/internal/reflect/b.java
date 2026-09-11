package com.google.gson.internal.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.common.base.c {
    public final Method A;
    public final Method e = Class.class.getMethod("isRecord", null);
    public final Method y = Class.class.getMethod("getRecordComponents", null);
    public final Method z;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.z = cls.getMethod("getName", null);
        this.A = cls.getMethod("getType", null);
    }

    @Override // com.google.common.base.c
    public final Method i(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // com.google.common.base.c
    public final Constructor j(Class cls) {
        try {
            Object[] objArr = (Object[]) this.y.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.A.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // com.google.common.base.c
    public final String[] l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.y.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.z.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // com.google.common.base.c
    public final boolean n(Class cls) {
        try {
            return ((Boolean) this.e.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
