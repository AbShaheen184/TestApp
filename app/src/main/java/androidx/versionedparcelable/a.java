package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final f a;
    public final f b;
    public final f c;

    public a(f fVar, f fVar2, f fVar3) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        fVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        f fVar = this.a;
        Method method = (Method) fVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        fVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.b;
        Method method = (Method) fVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        fVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((b) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((b) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((b) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString(null);
            return;
        }
        try {
            ((b) this).e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                Parcel parcel = bVarA.e;
                int i = bVarA.i;
                if (i >= 0) {
                    int i2 = bVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                androidx.media3.exoplayer.hls.playlist.a.j("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            androidx.media3.exoplayer.hls.playlist.a.j(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
