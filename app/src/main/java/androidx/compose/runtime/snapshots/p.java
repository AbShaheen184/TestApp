package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.k2;
import androidx.recyclerview.widget.k0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    public static q a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new q();
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarF = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.y.f();
        for (int i2 = 0; i2 < i; i2++) {
            gVarF.add(parcel.readValue(classLoader));
        }
        return new q(gVarF.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new k2(parcel, null);
            case 2:
                return new androidx.coordinatorlayout.widget.f(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return androidx.customview.view.b.y;
                }
                net.luminis.tls.engine.impl.c.r("superState must be null");
                return null;
            case 4:
                return new k0(parcel, null);
            case 5:
                return new com.google.android.material.bottomsheet.b(parcel, null);
            case 6:
                return new com.google.android.material.button.c(parcel, null);
            case 7:
                return new com.google.android.material.internal.a(parcel, null);
            case 8:
                return new com.google.android.material.sidesheet.c(parcel, null);
            default:
                return new com.google.android.material.textfield.y(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new q[i];
            case 1:
                return new k2[i];
            case 2:
                return new androidx.coordinatorlayout.widget.f[i];
            case 3:
                return new androidx.customview.view.b[i];
            case 4:
                return new k0[i];
            case 5:
                return new com.google.android.material.bottomsheet.b[i];
            case 6:
                return new com.google.android.material.button.c[i];
            case 7:
                return new com.google.android.material.internal.a[i];
            case 8:
                return new com.google.android.material.sidesheet.c[i];
            default:
                return new com.google.android.material.textfield.y[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new k2(parcel, classLoader);
            case 2:
                return new androidx.coordinatorlayout.widget.f(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return androidx.customview.view.b.y;
                }
                net.luminis.tls.engine.impl.c.r("superState must be null");
                return null;
            case 4:
                return new k0(parcel, classLoader);
            case 5:
                return new com.google.android.material.bottomsheet.b(parcel, classLoader);
            case 6:
                return new com.google.android.material.button.c(parcel, classLoader);
            case 7:
                return new com.google.android.material.internal.a(parcel, classLoader);
            case 8:
                return new com.google.android.material.sidesheet.c(parcel, classLoader);
            default:
                return new com.google.android.material.textfield.y(parcel, classLoader);
        }
    }
}
