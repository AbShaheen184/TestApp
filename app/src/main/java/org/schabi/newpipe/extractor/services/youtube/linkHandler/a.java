package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.services.youtube.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends org.schabi.newpipe.extractor.linkhandler.c {
    public static final a b = new a();
    public static final Pattern c = Pattern.compile("playlist|watch|attribution_link|watch_popup|embed|feed|select_site|account|reporthistory|redirect");

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.youtube.com/", str);
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public final String l(String str) throws f {
        try {
            URL urlM = org.schabi.newpipe.extractor.utils.f.m(str);
            String path = urlM.getPath();
            if (!org.schabi.newpipe.extractor.utils.f.g(urlM) || (!i.x(urlM) && !i.i.contains(urlM.getHost().toLowerCase(Locale.ROOT)) && !urlM.getHost().equalsIgnoreCase("hooktube.com"))) {
                throw new f("The URL given is not a YouTube URL");
            }
            String strSubstring = path.substring(1);
            String[] strArrSplit = strSubstring.split("/");
            if ((strArrSplit.length <= 0 || !strArrSplit[0].startsWith("@")) && (strArrSplit.length != 1 || strArrSplit[0].isEmpty() || c.matcher(strArrSplit[0]).matches())) {
                if (!strSubstring.startsWith("user/") && !strSubstring.startsWith("channel/") && !strSubstring.startsWith("c/")) {
                    throw new f("The given URL is not a channel, a user or a handle URL");
                }
                String str2 = strArrSplit[1];
                if (org.schabi.newpipe.extractor.utils.f.f(str2)) {
                    throw new f("The given ID is not a YouTube channel or user ID");
                }
                return strArrSplit[0] + "/" + str2;
            }
            return strArrSplit[0];
        } catch (Exception e) {
            throw new f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Could not parse URL :", e.getMessage()), e);
        }
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        try {
            l(str);
            return true;
        } catch (f unused) {
            return false;
        }
    }
}
