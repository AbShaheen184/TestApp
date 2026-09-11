package org.schabi.newpipe.extractor.services.bandcamp.linkHandler;

import java.util.List;
import org.schabi.newpipe.extractor.utils.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.common.base.b {
    public static final b b = new b();

    @Override // com.google.common.base.b
    public final String l(String str) {
        List list = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a;
        return str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+") ? str.split("bandcamp.com/\\?show=")[1] : m(str);
    }

    @Override // com.google.common.base.b
    public final String m(String str) {
        return str.matches("\\d+") ? "https://bandcamp.com/?show=".concat(str) : f.l(str);
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        List list = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a;
        if (str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+")) {
            return true;
        }
        if (str.toLowerCase().matches("https?://.+\\..+/track/.+")) {
            return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(str);
        }
        return false;
    }
}
