package org.schabi.newpipe.extractor.services.youtube;

import com.google.android.material.textfield.p;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.parser.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final HashMap a = new HashMap();
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static org.schabi.newpipe.extractor.exceptions.f f;
    public static org.schabi.newpipe.extractor.exceptions.f g;

    public static void a(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strJ;
        String str2;
        org.schabi.newpipe.extractor.localization.c cVar = org.schabi.newpipe.extractor.localization.c.z;
        if (b != null) {
            return;
        }
        try {
            String strA = g.a();
            if (strA.startsWith("//")) {
                strA = "https:".concat(strA);
            } else if (strA.startsWith("/")) {
                strA = "https://www.youtube.com".concat(strA);
            }
            new URL(strA);
            try {
                str2 = (String) p.a.t(strA, null, cVar).B;
                b = str2;
            } catch (Exception e2) {
                throw new org.schabi.newpipe.extractor.exceptions.f("Could not get JavaScript base player's code", e2);
            }
        } catch (Exception unused) {
            try {
                String str3 = (String) p.a.t("https://www.youtube.com/embed/" + str, null, cVar).B;
                org.jsoup.select.e eVarB0 = e0.a(str3, "").b0("script");
                Iterator<E> it = eVarB0.iterator();
                while (it.hasNext()) {
                    ((org.jsoup.nodes.j) it.next()).e("name", "player/base");
                }
                Iterator<E> it2 = eVarB0.iterator();
                do {
                    if (!it2.hasNext()) {
                        try {
                            strJ = org.schabi.newpipe.extractor.utils.a.j(g.b, str3, 1);
                            break;
                        } catch (org.schabi.newpipe.extractor.utils.d e3) {
                            org.mozilla.javascript.typedarrays.c.d("Embedded watch page didn't provide JavaScript base player's URL", e3);
                            return;
                        }
                    }
                    strJ = ((org.jsoup.nodes.j) it2.next()).d("src");
                } while (!strJ.contains("base.js"));
                Pattern pattern = g.a;
                if (strJ.startsWith("//")) {
                    strJ = "https:".concat(strJ);
                } else if (strJ.startsWith("/")) {
                    strJ = "https://www.youtube.com".concat(strJ);
                }
                try {
                    new URL(strJ);
                    try {
                        str2 = (String) p.a.t(strJ, null, cVar).B;
                    } catch (Exception e4) {
                        org.mozilla.javascript.typedarrays.c.d("Could not get JavaScript base player's code", e4);
                    }
                } catch (MalformedURLException e5) {
                    org.mozilla.javascript.typedarrays.c.d("The extracted and built JavaScript URL is invalid", e5);
                }
            } catch (Exception e6) {
                org.mozilla.javascript.typedarrays.c.d("Could not fetch embedded watch page", e6);
            }
        }
    }
}
