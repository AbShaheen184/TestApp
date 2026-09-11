package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle e;

    static {
        f fVar = new f(0);
        fVar.put("android.media.metadata.TITLE", 1);
        fVar.put("android.media.metadata.ARTIST", 1);
        fVar.put("android.media.metadata.DURATION", 0);
        fVar.put("android.media.metadata.ALBUM", 1);
        fVar.put("android.media.metadata.AUTHOR", 1);
        fVar.put("android.media.metadata.WRITER", 1);
        fVar.put("android.media.metadata.COMPOSER", 1);
        fVar.put("android.media.metadata.COMPILATION", 1);
        fVar.put("android.media.metadata.DATE", 1);
        fVar.put("android.media.metadata.YEAR", 0);
        fVar.put("android.media.metadata.GENRE", 1);
        fVar.put("android.media.metadata.TRACK_NUMBER", 0);
        fVar.put("android.media.metadata.NUM_TRACKS", 0);
        fVar.put("android.media.metadata.DISC_NUMBER", 0);
        fVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        fVar.put("android.media.metadata.ART", 2);
        fVar.put("android.media.metadata.ART_URI", 1);
        fVar.put("android.media.metadata.ALBUM_ART", 2);
        fVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        fVar.put("android.media.metadata.USER_RATING", 3);
        fVar.put("android.media.metadata.RATING", 3);
        fVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        fVar.put("android.media.metadata.DISPLAY_ICON", 2);
        fVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        fVar.put("android.media.metadata.MEDIA_ID", 1);
        fVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        fVar.put("android.media.metadata.MEDIA_URI", 1);
        fVar.put("android.media.metadata.ADVERTISEMENT", 0);
        fVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new a(2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.e = parcel.readBundle(android.support.v4.media.session.b.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.e);
    }
}
