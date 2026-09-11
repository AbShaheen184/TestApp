package org.schabi.newpipe.extractor.services.soundcloud.linkHandler;

import java.util.List;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.linkhandler.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a c = new a(0);
    public static final a d = new a(1);
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) throws f {
        switch (this.b) {
            case 0:
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/users/" + str);
                } catch (Exception e) {
                    throw new f(e.getMessage(), e);
                }
            default:
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/playlists/" + str);
                } catch (Exception e2) {
                    throw new f(e2.getMessage(), e2);
                }
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public final String l(String str) throws f {
        switch (this.b) {
            case 0:
                Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
                org.schabi.newpipe.extractor.utils.f.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$"), str);
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
                } catch (Exception e) {
                    throw new f(e.getMessage(), e);
                }
            default:
                Pattern pattern2 = org.schabi.newpipe.extractor.utils.f.a;
                org.schabi.newpipe.extractor.utils.f.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/sets/[0-9a-z_-]+/?([#?].*)?$"), str);
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
                } catch (Exception e2) {
                    throw new f(coil3.compose.internal.f.e("Could not get id of url: ", str, " ", e2.getMessage()), e2);
                }
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        switch (this.b) {
            case 0:
                return Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$").matcher(str.toLowerCase()).find();
            default:
                return Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/sets/[0-9a-z_-]+/?([#?].*)?$").matcher(str.toLowerCase()).find();
        }
    }
}
