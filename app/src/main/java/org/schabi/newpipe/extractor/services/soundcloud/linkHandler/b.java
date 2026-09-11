package org.schabi.newpipe.extractor.services.soundcloud.linkHandler;

import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.common.base.b {
    public static final b b = new b();
    public static final Pattern c = Pattern.compile("^https?://(?:www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/(?!(?:tracks|albums|sets|reposts|followers|following)/?$)[0-9a-z_-]+/?(?:[#?].*)?$|^https?://on\\.soundcloud\\.com/[0-9a-zA-Z]+$");
    public static final Pattern d = Pattern.compile("^https?://api-v2\\.soundcloud.com/(tracks|albums|sets|reposts|followers|following)/([0-9a-z_-]+)/");

    @Override // com.google.common.base.b
    public final String l(String str) throws f {
        Pattern pattern = d;
        if (pattern.matcher(str).find()) {
            return org.schabi.newpipe.extractor.utils.a.j(pattern, str, 1);
        }
        org.schabi.newpipe.extractor.utils.f.a(c, str);
        try {
            return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
        } catch (Exception e) {
            throw new f(e.getMessage(), e);
        }
    }

    @Override // com.google.common.base.b
    public final String m(String str) throws f {
        try {
            return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/tracks/" + str);
        } catch (Exception e) {
            throw new f(e.getMessage(), e);
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        return c.matcher(str.toLowerCase()).find();
    }
}
