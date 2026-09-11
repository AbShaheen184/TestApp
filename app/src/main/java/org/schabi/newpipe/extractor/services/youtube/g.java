package org.schabi.newpipe.extractor.services.youtube;

import com.google.android.material.textfield.p;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Pattern a = Pattern.compile("player\\\\/([a-z0-9]{8})\\\\/");
    public static final Pattern b = Pattern.compile("\"jsUrl\":\"(/s/player/[A-Za-z0-9]+/player_ias\\.vflset/[A-Za-z_-]+/base\\.js)\"");

    public static String a() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            try {
                return "https://www.youtube.com/s/player/" + org.schabi.newpipe.extractor.utils.a.j(a, (String) p.a.t("https://www.youtube.com/iframe_api", null, org.schabi.newpipe.extractor.localization.c.z).B, 1) + "/player_ias.vflset/en_GB/base.js";
            } catch (org.schabi.newpipe.extractor.utils.d e) {
                org.mozilla.javascript.typedarrays.c.d("IFrame resource didn't provide JavaScript base player's hash", e);
                return null;
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not fetch IFrame resource", e2);
            return null;
        }
    }
}
