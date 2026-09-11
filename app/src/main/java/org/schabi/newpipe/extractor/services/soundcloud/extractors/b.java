package org.schabi.newpipe.extractor.services.soundcloud.extractors;

import androidx.appcompat.widget.x;
import androidx.emoji2.text.g;
import androidx.fragment.app.h;
import com.app.mlounge.data.music.e;
import com.google.android.material.textfield.p;
import com.grack.nanojson.d;
import j$.net.URLEncoder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {
    public com.grack.nanojson.c e;
    public boolean f;

    @Override // org.schabi.newpipe.extractor.f
    public final int B() {
        return 3;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List H() {
        String[] strArrSplit = this.e.f("tag_list", null).split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (String str : strArrSplit) {
            if (str.startsWith("\"")) {
                sb.append(str.replace("\"", ""));
                z = true;
            } else if (z) {
                if (str.endsWith("\"")) {
                    sb.append(" ");
                    sb.append(str.replace("\"", ""));
                    arrayList.add(sb.toString());
                    z = false;
                } else {
                    sb.append(" ");
                    sb.append(str);
                }
            } else if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String I() {
        return this.e.f("created_at", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List J() {
        return org.schabi.newpipe.extractor.services.soundcloud.a.c(this.e);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void L() throws org.schabi.newpipe.extractor.exceptions.f {
        M("(#t=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void N() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.services.soundcloud.a.d(I());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        com.grack.nanojson.c cVar = this.e;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return org.schabi.newpipe.extractor.services.soundcloud.a.b(org.schabi.newpipe.extractor.utils.f.l(cVar.e("user").f("avatar_url", "")));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        com.grack.nanojson.c cVar = this.e;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return cVar.e("user").f("username", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String R() {
        com.grack.nanojson.c cVar = this.e;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return org.schabi.newpipe.extractor.utils.f.l(cVar.e("user").f("permalink_url", ""));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List T() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void V() {
        this.e.d("playback_count", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void W() {
        this.e.e("user").b("verified");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str = this.b.y;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().k((String) eVar.t(coil3.compose.internal.f.e("https://api-v2.soundcloud.com/resolve?url=", URLEncoder.encode(str, StandardCharsets.UTF_8), "&client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a()), null, l.b.c()).B);
            this.e = cVar;
            String strF = cVar.f("policy", "");
            if (strF.equals("ALLOW") || strF.equals("MONETIZE")) {
                return;
            }
            this.f = false;
            if (strF.equals("SNIP")) {
                throw new org.schabi.newpipe.extractor.exceptions.a("This track is a SoundCloud Go+ track");
            }
            if (!strF.equals("BLOCK")) {
                throw new org.schabi.newpipe.extractor.exceptions.b("Content not available: policy ".concat(strF));
            }
            throw new org.schabi.newpipe.extractor.exceptions.a("This track is not available in user's country");
        } catch (d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e);
        }
    }

    public final String Y(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str, "?client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a());
        String strF = this.e.f("track_authorization", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strI, "&track_authorization=", strF);
        }
        try {
            return ((com.grack.nanojson.c) x.p().k((String) p.a.r(strI).B)).f("url", null);
        } catch (d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse streamable URL", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List d() throws org.schabi.newpipe.extractor.exceptions.d {
        ArrayList arrayList = new ArrayList();
        if (this.e.b("streamable") && this.f) {
            try {
                com.grack.nanojson.b bVarA = this.e.e("media").a("transcodings");
                if (!org.schabi.newpipe.extractor.utils.f.i(bVarA)) {
                    bVarA.c().forEachOrdered(new a(1, this, arrayList));
                    return arrayList;
                }
            } catch (NullPointerException e) {
                throw new org.schabi.newpipe.extractor.exceptions.d("Could not get audio streams", e);
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void f() {
        this.e.f("genre", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        return new org.schabi.newpipe.extractor.stream.c(this.e.f("description", null), 3);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String o() {
        return String.valueOf(this.e.d("id", 0L));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long r() {
        return this.e.d("duration", 0L) / 1000;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void s() {
        this.e.f("license", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void t() {
        this.e.d("likes_count", -1L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        return this.e.f("title", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void y() {
        this.e.f("sharing", null).equals("public");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final g z() throws org.schabi.newpipe.extractor.exceptions.f, IOException {
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(this.a.y, 2);
        String strO = o();
        Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
        Charset charset = StandardCharsets.UTF_8;
        h hVarT = p.a.t(coil3.compose.internal.f.e("https://api-v2.soundcloud.com/tracks/", URLEncoder.encode(strO, charset), "/related?client_id=", URLEncoder.encode(org.schabi.newpipe.extractor.services.soundcloud.a.a(), charset)), null, l.b.c());
        int i = hVarT.y;
        if (i >= 400) {
            net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Could not get streams from API, HTTP "));
            return null;
        }
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().k((String) hVarT.B);
            for (Object obj : cVar.a("collection")) {
                if (obj instanceof com.grack.nanojson.c) {
                    dVar.A(new c((com.grack.nanojson.c) obj));
                }
            }
            try {
                if (!cVar.f("next_href", null).contains("client_id=")) {
                    org.schabi.newpipe.extractor.services.soundcloud.a.a();
                }
            } catch (Exception unused) {
            }
            return dVar;
        } catch (d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e);
            return null;
        }
    }
}
