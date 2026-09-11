package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Parcelable.ClassLoaderCreator {
    public static h1 a(Parcel parcel, ClassLoader classLoader) {
        f fVar;
        if (classLoader == null) {
            classLoader = g1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            fVar = f.A;
        } else if (i == 1) {
            fVar = f.D;
        } else {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.p("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            fVar = f.B;
        }
        return new h1(value, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new h1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
