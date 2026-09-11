package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);
    public final CharSequence A;
    public final Bitmap B;
    public final Uri C;
    public final Bundle D;
    public final Uri E;
    public MediaDescription F;
    public final String e;
    public final CharSequence y;
    public final CharSequence z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = charSequence3;
        this.B = bitmap;
        this.C = uri;
        this.D = bundle;
        this.E = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.y) + ", " + ((Object) this.z) + ", " + ((Object) this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionA = this.F;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = b.b();
            b.n(builderB, this.e);
            b.p(builderB, this.y);
            b.o(builderB, this.z);
            b.j(builderB, this.A);
            b.l(builderB, this.B);
            b.m(builderB, this.C);
            b.k(builderB, this.D);
            c.b(builderB, this.E);
            mediaDescriptionA = b.a(builderB);
            this.F = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
