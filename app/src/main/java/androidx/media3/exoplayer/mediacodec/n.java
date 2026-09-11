package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.media3.decoder.c {
    public final int e;

    public n(IllegalStateException illegalStateException, o oVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(oVar == null ? null : oVar.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.e = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
