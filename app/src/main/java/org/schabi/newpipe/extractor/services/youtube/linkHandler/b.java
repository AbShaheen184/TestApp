package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import j$.net.URLEncoder;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.services.youtube.i;
import org.schabi.newpipe.extractor.utils.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends org.schabi.newpipe.extractor.linkhandler.c {
    public static final b c = new b(0);
    public static final b d = new b(1);
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) {
        String strEncode;
        String str2;
        switch (this.b) {
            case 0:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.youtube.com/playlist?list=", str);
            default:
                String str3 = !list.isEmpty() ? (String) list.get(0) : "";
                str3.getClass();
                switch (str3) {
                    case "playlists":
                        Pattern pattern = f.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQA_ABAQ%253D%253D";
                        break;
                    case "music_playlists":
                    case "music_artists":
                    case "music_albums":
                    case "music_songs":
                    case "music_videos":
                        Pattern pattern2 = f.a;
                        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://music.youtube.com/search?q=", URLEncoder.encode(str, StandardCharsets.UTF_8));
                    case "videos":
                        Pattern pattern3 = f.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQAfABAQ%253D%253D";
                        break;
                    case "channels":
                        Pattern pattern4 = f.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQAvABAQ%253D%253D";
                        break;
                    default:
                        Pattern pattern5 = f.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=8AEB";
                        break;
                }
                return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://www.youtube.com/results?search_query=", strEncode, str2);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public /* bridge */ /* synthetic */ org.schabi.newpipe.extractor.linkhandler.a i(String str) {
        switch (this.b) {
            case 0:
                return i(str);
            default:
                return super.i(str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public final String l(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        switch (this.b) {
            case 0:
                try {
                    URL urlM = f.m(str);
                    if (!f.g(urlM) || (!i.x(urlM) && !i.i.contains(urlM.getHost().toLowerCase(Locale.ROOT)))) {
                        throw new org.schabi.newpipe.extractor.exceptions.f("the url given is not a YouTube-URL");
                    }
                    String path = urlM.getPath();
                    if (!path.equals("/watch") && !path.equals("/playlist")) {
                        throw new org.schabi.newpipe.extractor.exceptions.f("the url given is neither a video nor a playlist URL");
                    }
                    String strD = f.d(urlM, "list");
                    if (strD == null) {
                        throw new org.schabi.newpipe.extractor.exceptions.f("the URL given does not include a playlist");
                    }
                    if (strD.matches("[a-zA-Z0-9_-]{10,}")) {
                        return strD;
                    }
                    throw new org.schabi.newpipe.extractor.exceptions.f("the list-ID given in the URL does not match the list pattern");
                } catch (Exception e) {
                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Error could not parse URL: ", e.getMessage()), e);
                }
            default:
                return "";
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        switch (this.b) {
            case 0:
                try {
                    l(str);
                    return true;
                } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                    return false;
                }
            default:
                return false;
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    /* JADX INFO: renamed from: z */
    public org.schabi.newpipe.extractor.linkhandler.b i(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        switch (this.b) {
            case 0:
                try {
                    URL urlM = f.m(str);
                    String strD = f.d(urlM, "list");
                    if (strD != null) {
                        String str2 = i.a;
                        if (strD.startsWith("RD")) {
                            String strD2 = f.d(urlM, "v");
                            if (strD2 == null) {
                                strD2 = i.d(strD);
                            }
                            return new org.schabi.newpipe.extractor.linkhandler.b(new org.schabi.newpipe.extractor.linkhandler.a(str, "https://www.youtube.com/watch?v=" + strD2 + "&list=" + strD, strD));
                        }
                    }
                    return super.i(str);
                } catch (MalformedURLException e) {
                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Error could not parse URL: ", e.getMessage()), e);
                }
            default:
                return super.i(str);
        }
    }
}
