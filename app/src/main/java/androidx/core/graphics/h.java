package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.collection.y0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends _COROUTINE.a {
    public static final Class l;
    public static final Constructor m;
    public static final Method n;
    public static final Method o;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        m = constructor;
        l = cls;
        n = method2;
        o = method;
    }

    public static boolean J(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) n.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface K(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) l, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) o.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // _COROUTINE.a
    public final Typeface l(Context context, androidx.core.content.res.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = m.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (androidx.core.content.res.f fVar : eVar.a) {
                int i2 = fVar.f;
                File fileV = _COROUTINE.b.v(context);
                if (fileV != null) {
                    try {
                        if (_COROUTINE.b.i(fileV, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileV);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            fileV.delete();
                        } else {
                            fileV.delete();
                        }
                        if (map != null && J(objNewInstance, map, fVar.e, fVar.b, fVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileV.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return K(objNewInstance);
        }
        return null;
    }

    @Override // _COROUTINE.a
    public final Typeface m(Context context, androidx.core.provider.i[] iVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = m.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            y0 y0Var = new y0(0);
            for (androidx.core.provider.i iVar : iVarArr) {
                Uri uri = iVar.a;
                ByteBuffer byteBufferZ = (ByteBuffer) y0Var.get(uri);
                if (byteBufferZ == null) {
                    byteBufferZ = _COROUTINE.b.z(context, uri);
                    y0Var.put(uri, byteBufferZ);
                }
                if (byteBufferZ != null && J(objNewInstance, byteBufferZ, iVar.b, iVar.c, iVar.d)) {
                }
            }
            Typeface typefaceK = K(objNewInstance);
            if (typefaceK != null) {
                return Typeface.create(typefaceK, i);
            }
        }
        return null;
    }
}
