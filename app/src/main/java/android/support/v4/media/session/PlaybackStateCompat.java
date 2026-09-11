package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);
    public final float A;
    public final long B;
    public final int C;
    public final CharSequence D;
    public final long E;
    public final ArrayList F;
    public final long G;
    public final Bundle H;
    public final int e;
    public final long y;
    public final long z;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();
        public final Bundle A;
        public final String e;
        public final CharSequence y;
        public final int z;

        public CustomAction(Parcel parcel) {
            this.e = parcel.readString();
            this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.z = parcel.readInt();
            this.A = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.y) + ", mIcon=" + this.z + ", mExtras=" + this.A;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.y, parcel, i);
            parcel.writeInt(this.z);
            parcel.writeBundle(this.A);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.e = parcel.readInt();
        this.y = parcel.readLong();
        this.A = parcel.readFloat();
        this.E = parcel.readLong();
        this.z = parcel.readLong();
        this.B = parcel.readLong();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.G = parcel.readLong();
        this.H = parcel.readBundle(b.class.getClassLoader());
        this.C = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.e);
        sb.append(", position=");
        sb.append(this.y);
        sb.append(", buffered position=");
        sb.append(this.z);
        sb.append(", speed=");
        sb.append(this.A);
        sb.append(", updated=");
        sb.append(this.E);
        sb.append(", actions=");
        sb.append(this.B);
        sb.append(", error code=");
        sb.append(this.C);
        sb.append(", error message=");
        sb.append(this.D);
        sb.append(", custom actions=");
        sb.append(this.F);
        sb.append(", active item id=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.G, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeLong(this.y);
        parcel.writeFloat(this.A);
        parcel.writeLong(this.E);
        parcel.writeLong(this.z);
        parcel.writeLong(this.B);
        TextUtils.writeToParcel(this.D, parcel, i);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.G);
        parcel.writeBundle(this.H);
        parcel.writeInt(this.C);
    }
}
