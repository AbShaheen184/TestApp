package org.schabi.newpipe.extractor.services.peertube.linkHandler;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.l;
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

    public static String C(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.startsWith("a/")) {
            return "accounts".concat(str.substring(1));
        }
        return str.startsWith("c/") ? "video-channels".concat(str.substring(1)) : str;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String A(String str, String str2, List list) {
        String str3;
        switch (this.b) {
            case 0:
                if (str.matches("((accounts|a)|(video-channels|c))/([^/?&#]*)")) {
                    str = C(str);
                    str3 = "/";
                } else {
                    str3 = "/accounts/";
                }
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, str3, str);
            default:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, "/api/v1/video-playlists/", str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) {
        switch (this.b) {
            case 0:
                l.c.A.getClass();
                break;
            default:
                l.c.A.getClass();
                break;
        }
        return A(str, "https://framatube.org", list);
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public final String l(String str) {
        switch (this.b) {
            case 0:
                return C(org.schabi.newpipe.extractor.utils.a.i("/((accounts|a)|(video-channels|c))/([^/?&#]*)", 0, str));
            default:
                try {
                    return org.schabi.newpipe.extractor.utils.a.i("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", 2, str);
                } catch (f unused) {
                    return org.schabi.newpipe.extractor.utils.a.i("/video-playlists/([^/?&#]*)", 1, str);
                }
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        switch (this.b) {
            case 0:
                try {
                    new URL(str);
                    return str.contains("/accounts/") || str.contains("/a/") || str.contains("/video-channels/") || str.contains("/c/");
                } catch (MalformedURLException unused) {
                    return false;
                }
            default:
                try {
                    new URL(str);
                    l(str);
                    return true;
                } catch (MalformedURLException | f unused2) {
                    return false;
                }
        }
    }
}
