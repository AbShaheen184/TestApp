package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(6);
    public final int A;
    public final IntentSender e;
    public final Intent y;
    public final int z;

    public j(IntentSender intentSender, Intent intent, int i, int i2) {
        this.e = intentSender;
        this.y = intent;
        this.z = i;
        this.A = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.y, i);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }
}
