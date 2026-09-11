package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g extends _COROUTINE.a {
    public static Class l = null;
    public static Constructor m = null;
    public static Method n = null;
    public static Method o = null;
    public static boolean p = false;

    public static boolean J(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        K();
        try {
            return ((Boolean) n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return false;
        }
    }

    public static void K() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (p) {
            return;
        }
        p = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        m = constructor;
        l = cls;
        n = method2;
        o = method;
    }

    @Override // _COROUTINE.a
    public Typeface l(Context context, androidx.core.content.res.e eVar, Resources resources, int i) throws NoSuchMethodException {
        K();
        try {
            Object objNewInstance = m.newInstance(null);
            for (androidx.core.content.res.f fVar : eVar.a) {
                File fileV = _COROUTINE.b.v(context);
                if (fileV == null) {
                    return null;
                }
                try {
                    if (!_COROUTINE.b.i(fileV, resources, fVar.f)) {
                        return null;
                    }
                    if (!J(objNewInstance, fileV.getPath(), fVar.b, fVar.c)) {
                        return null;
                    }
                    fileV.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileV.delete();
                }
            }
            K();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) l, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) o.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                net.luminis.tls.engine.impl.c.k(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            net.luminis.tls.engine.impl.c.k(e2);
            return null;
        }
    }

    @Override // _COROUTINE.a
    public Typeface m(Context context, androidx.core.provider.i[] iVarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(_COROUTINE.a.r(iVarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile2;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            File fileV = _COROUTINE.b.v(context);
                            if (fileV == null) {
                                typefaceCreateFromFile = null;
                            } else {
                                try {
                                    if (_COROUTINE.b.j(fileV, fileInputStream)) {
                                        typefaceCreateFromFile = Typeface.createFromFile(fileV.getPath());
                                        fileV.delete();
                                    } else {
                                        fileV.delete();
                                        typefaceCreateFromFile = null;
                                    }
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    fileV.delete();
                                    throw th;
                                }
                            }
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
