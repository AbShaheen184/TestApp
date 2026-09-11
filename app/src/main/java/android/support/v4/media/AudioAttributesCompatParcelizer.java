package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(aVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, aVar);
    }
}
