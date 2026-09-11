package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.p;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {
    public final Parcelable e;
    public static final a y = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(3);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.e = parcelable == y ? null : parcelable;
        } else {
            c.o("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    public b() {
        this.e = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.e = parcelable == null ? y : parcelable;
    }
}
