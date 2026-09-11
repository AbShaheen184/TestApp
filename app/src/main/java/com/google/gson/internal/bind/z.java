package com.google.gson.internal.bind;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends w {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public z(Class cls, y yVar) {
        super(yVar);
        this.d = new HashMap();
        com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
        Constructor constructorJ = cVar.j(cls);
        this.b = constructorJ;
        com.google.gson.internal.reflect.c.f(constructorJ);
        String[] strArrL = cVar.l(cls);
        for (int i = 0; i < strArrL.length; i++) {
            this.d.put(strArrL[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // com.google.gson.internal.bind.w
    public final Object d() {
        return (Object[]) this.c.clone();
    }

    @Override // com.google.gson.internal.bind.w
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            androidx.media3.exoplayer.hls.playlist.a.j("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // com.google.gson.internal.bind.w
    public final void f(Object obj, com.google.gson.stream.a aVar, v vVar) {
        Object[] objArr = (Object[]) obj;
        String str = vVar.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            com.google.gson.b.i("Could not find the index in the constructor '", com.google.gson.internal.reflect.c.b(this.b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            return;
        }
        int iIntValue = num.intValue();
        Object objB = vVar.f.b(aVar);
        if (objB != null || !vVar.g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbX.append(aVar.X());
            throw new androidx.compose.ui.res.e(sbX.toString(), 8);
        }
    }
}
