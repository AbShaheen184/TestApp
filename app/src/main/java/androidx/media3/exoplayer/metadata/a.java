package androidx.media3.exoplayer.metadata;

import androidx.media3.common.r;
import androidx.media3.extractor.metadata.id3.h;
import androidx.media3.extractor.metadata.scte35.c;
import com.google.android.gms.dynamite.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final g a(r rVar) {
        String str = rVar.o;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new androidx.media3.extractor.metadata.dvbsi.b(0);
                case "application/x-icy":
                    return new androidx.media3.extractor.metadata.icy.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new androidx.media3.extractor.metadata.dvbsi.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public final boolean b(r rVar) {
        String str = rVar.o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
