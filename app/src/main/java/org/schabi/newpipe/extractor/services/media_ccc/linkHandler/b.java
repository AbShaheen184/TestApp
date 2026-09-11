package org.schabi.newpipe.extractor.services.media_ccc.linkHandler;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.utils.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.common.base.b {
    public static final b b = new b();

    @Override // com.google.common.base.b
    public final String l(String str) {
        String strI;
        try {
            strI = org.schabi.newpipe.extractor.utils.a.i("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", 1, str);
        } catch (d unused) {
            strI = null;
        }
        return strI == null ? org.schabi.newpipe.extractor.utils.a.i("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", 1, str) : strI;
    }

    @Override // com.google.common.base.b
    public final String m(String str) {
        return org.schabi.newpipe.extractor.services.media_ccc.extractors.b.a.matcher(str).find() ? c.h("https://streaming.media.ccc.de/", str) : c.h("https://media.ccc.de/v/", str);
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        try {
            return l(str) != null;
        } catch (f unused) {
        }
    }
}
