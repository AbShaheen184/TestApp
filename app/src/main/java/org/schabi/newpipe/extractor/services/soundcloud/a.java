package org.schabi.newpipe.extractor.services.soundcloud;

import androidx.appcompat.widget.x;
import com.app.mlounge.data.music.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.material.textfield.p;
import com.grack.nanojson.c;
import j$.net.URLEncoder;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.stream.DesugarCollectors;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;
import org.jsoup.parser.p0;
import org.mozilla.javascript.Context;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.utils.b;
import org.schabi.newpipe.extractor.utils.d;
import org.schabi.newpipe.extractor.utils.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final List a;
    public static String b;
    public static final Pattern c;

    static {
        b[] bVarArr = {new b(16, "mini", 16, 3), new b(20, "t20x20", 20, 3), new b(32, "small", 32, 3), new b(47, "badge", 47, 3), new b(50, "t50x50", 50, 3), new b(60, "t60x60", 60, 3), new b(67, "t67x67", 67, 3), new b(80, "t80x80", 80, 3), new b(100, "large", 100, 3), new b(120, "t120x120", 120, 3), new b(Context.VERSION_ES6, "t200x200", Context.VERSION_ES6, 2), new b(240, "t240x240", 240, 2), new b(Context.VERSION_ECMASCRIPT, "t250x250", Context.VERSION_ECMASCRIPT, 2), new b(300, "t300x300", 300, 2), new b(500, "t500x500", 500, 2)};
        ArrayList arrayList = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            b bVar = bVarArr[i];
            Objects.requireNonNull(bVar);
            arrayList.add(bVar);
        }
        a = Collections.unmodifiableList(arrayList);
        Object[] objArr = {new b(1240, "t1240x260", 260, 2), new b(2480, "t2480x520", 520, 2)};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        Collections.unmodifiableList(arrayList2);
        c = Pattern.compile("^https?://on.soundcloud.com/[0-9a-zA-Z]+$");
    }

    public static synchronized String a() {
        if (!f.h(b)) {
            return b;
        }
        e eVar = p.a;
        org.jsoup.select.e eVarB0 = e0.a((String) eVar.r("https://soundcloud.com").B, "").b0("script[src*=\"sndcdn.com/assets/\"][src$=\".js\"]");
        Collections.reverse(eVarB0);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"bytes=0-50000"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        Map mapC = p0.c(Collections.unmodifiableList(arrayList));
        Iterator<E> it = eVarB0.iterator();
        while (it.hasNext()) {
            String strD = ((j) it.next()).d("src");
            if (!f.h(strD)) {
                try {
                    String strI = org.schabi.newpipe.extractor.utils.a.i(",client_id:\"(.*?)\"", 1, (String) eVar.s(strD, mapC).B);
                    b = strI;
                    return strI;
                } catch (d unused) {
                    continue;
                }
            }
        }
        throw new org.schabi.newpipe.extractor.exceptions.d("Couldn't extract client id");
    }

    public static List b(String str) {
        if (f.h(str)) {
            return Collections.EMPTY_LIST;
        }
        return (List) a.stream().map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(str.replace("-large.", "-%s."), 3)).collect(DesugarCollectors.toUnmodifiableList());
    }

    public static List c(c cVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = cVar.f("artwork_url", null);
        if (strF != null) {
            return b(strF);
        }
        String strF2 = cVar.e("user").f("avatar_url", null);
        if (strF2 != null) {
            return b(strF2);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get track or track user's thumbnails");
        return null;
    }

    public static org.schabi.newpipe.extractor.localization.b d(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.localization.b.a(str);
        } catch (DateTimeParseException e) {
            try {
                return new org.schabi.newpipe.extractor.localization.b(OffsetDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss +0000")));
            } catch (DateTimeParseException e2) {
                e2.addSuppressed(e);
                throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse date: \"", str, "\""), e2);
            }
        }
    }

    public static String e(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (c.matcher(str).find()) {
            try {
                e eVar = p.a;
                eVar.getClass();
                m mVar = new m();
                mVar.y = "HEAD";
                mVar.z = str;
                ((LinkedHashMap) mVar.A).clear();
                str = ((String) eVar.p(new org.schabi.newpipe.extractor.downloader.a(mVar)).C).split("\\?")[0];
            } catch (org.schabi.newpipe.extractor.exceptions.d e) {
                org.mozilla.javascript.typedarrays.c.d("Could not follow on.soundcloud.com redirect", e);
                return null;
            }
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        String lowerCase = str.toLowerCase();
        if (f.a.matcher(lowerCase).find()) {
            lowerCase = lowerCase.replace("m.", "");
        } else if (f.b.matcher(lowerCase).find()) {
            lowerCase = lowerCase.replace("www.", "");
        }
        try {
            try {
                return String.valueOf(org.schabi.newpipe.extractor.utils.a.h((c) x.p().k((String) p.a.t("https://api-widget.soundcloud.com/resolve?url=" + URLEncoder.encode(f.m(lowerCase).toString(), StandardCharsets.UTF_8) + "&format=json&client_id=" + a(), null, l.b.c()).B), "id"));
            } catch (com.grack.nanojson.d e2) {
                org.mozilla.javascript.typedarrays.c.d("Could not parse JSON response", e2);
                return null;
            } catch (org.schabi.newpipe.extractor.exceptions.d e3) {
                org.mozilla.javascript.typedarrays.c.d("Could not resolve id with embedded player. ClientId not extracted", e3);
                return null;
            }
        } catch (MalformedURLException unused) {
            net.luminis.tls.engine.impl.c.o("The given URL is not valid");
            return null;
        }
    }

    public static String f(String str) {
        e eVar = p.a;
        Pattern pattern = f.a;
        return ((j) e0.a((String) eVar.t(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://w.soundcloud.com/player/?url=", URLEncoder.encode(str, StandardCharsets.UTF_8)), null, l.b.c()).B, "").b0("link[rel=\"canonical\"]").c()).d("abs:href");
    }
}
