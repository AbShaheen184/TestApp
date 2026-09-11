package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.appcompat.widget.x;
import com.google.android.material.textfield.p;
import j$.util.stream.DesugarCollectors;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final List a;

    static {
        org.schabi.newpipe.extractor.utils.b[] bVarArr = {new org.schabi.newpipe.extractor.utils.b(-1, "10.jpg", 1200, 1), new org.schabi.newpipe.extractor.utils.b(90, "101.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.b(422, "170.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(646, "171.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(-1, "20.jpg", LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1), new org.schabi.newpipe.extractor.utils.b(420, "200.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(280, "201.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(140, "202.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.b(360, "204.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(240, "205.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(180, "206.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.b(120, "207.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.b(100, "43.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.b(Context.VERSION_ES6, "44.jpg", -1, 2)};
        ArrayList arrayList = new ArrayList(14);
        for (int i = 0; i < 14; i++) {
            org.schabi.newpipe.extractor.utils.b bVar = bVarArr[i];
            Objects.requireNonNull(bVar);
            arrayList.add(bVar);
        }
        a = Collections.unmodifiableList(arrayList);
    }

    public static com.grack.nanojson.c a(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            com.google.android.material.internal.b bVarP = x.p();
            com.app.mlounge.data.music.e eVar = p.a;
            Map map = Collections.EMPTY_MAP;
            try {
                com.grack.nanojson.e eVar2 = new com.grack.nanojson.e();
                eVar2.g();
                eVar2.p("band_id", str);
                eVar2.d();
                return (com.grack.nanojson.c) bVarP.k((String) eVar.w("https://bandcamp.com/api/mobile/22/band_details", map, eVar2.b().getBytes(StandardCharsets.UTF_8)).B);
            } catch (com.grack.nanojson.d e) {
                e = e;
                org.mozilla.javascript.typedarrays.c.d("Could not download band details", e);
                return null;
            }
        } catch (com.grack.nanojson.d | IOException e2) {
            e = e2;
        }
    }

    public static List b(long j, boolean z) {
        if (j == 0) {
            return Collections.EMPTY_LIST;
        }
        return (List) a.stream().map(new a("https://f4.bcbits.com/img/" + (z ? 'a' : "") + j + "_", 0)).collect(DesugarCollectors.toUnmodifiableList());
    }

    public static List c(String str) {
        if (org.schabi.newpipe.extractor.utils.f.h(str)) {
            return Collections.EMPTY_LIST;
        }
        return (List) a.stream().map(new a(str.replaceFirst("_\\d+\\.\\w+", "_"), 0)).collect(DesugarCollectors.toUnmodifiableList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (str.toLowerCase().matches("https?://.+\\.bandcamp\\.com(/.*)?")) {
            return true;
        }
        if (str.toLowerCase().matches("https?://bandcamp\\.com(/.*)?")) {
            return false;
        }
        try {
            return ((j) ((j) e0.a((String) p.a.r(org.schabi.newpipe.extractor.utils.f.l(str)).B, "").V("cart-wrapper").get(0)).W("a").get(0)).d("href").equals("https://bandcamp.com/cart");
        } catch (IOException unused) {
            org.mozilla.javascript.typedarrays.c.b("Could not determine whether URL is custom domain (not available? network error?)");
            return false;
        } catch (IndexOutOfBoundsException | NullPointerException unused2) {
            return false;
        }
    }
}
