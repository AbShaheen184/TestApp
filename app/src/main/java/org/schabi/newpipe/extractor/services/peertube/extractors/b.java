package org.schabi.newpipe.extractor.services.peertube.extractors;

import androidx.appcompat.widget.x;
import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.schabi.newpipe.extractor.k;
import org.schabi.newpipe.extractor.stream.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends org.schabi.newpipe.extractor.playlist.a {
    public final /* synthetic */ int e;
    public com.grack.nanojson.c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar, int i) {
        super(w0Var, aVar);
        this.e = i;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void C() {
        switch (this.e) {
            case 0:
                androidx.compose.ui.text.android.d.c(this.f.e("videoChannel"), e(), "avatars", "avatar");
                break;
            default:
                super.C();
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void D() {
        switch (this.e) {
            case 0:
                this.f.e("videoChannel").f("displayName", null);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void E() {
        switch (this.e) {
            case 0:
                this.f.e("videoChannel").f("url", null);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List J() {
        switch (this.e) {
            case 0:
                return androidx.compose.ui.text.android.d.f(this.f, e());
            default:
                String strF = this.f.f("artwork_url", null);
                if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.b(strF);
                }
                try {
                    Iterator it = p().a.iterator();
                    while (it.hasNext()) {
                        List list = ((g) it.next()).B;
                        if (!org.schabi.newpipe.extractor.utils.f.i(list)) {
                            return list;
                        }
                    }
                } catch (Exception unused) {
                }
                return Collections.EMPTY_LIST;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List O() {
        switch (this.e) {
            case 0:
                return androidx.compose.ui.text.android.d.c(this.f.e("ownerAccount"), e(), "avatars", "avatar");
            default:
                com.grack.nanojson.c cVar = this.f;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return org.schabi.newpipe.extractor.services.soundcloud.a.b(org.schabi.newpipe.extractor.utils.f.l(cVar.e("user").f("avatar_url", "")));
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String P() {
        switch (this.e) {
            case 0:
                return this.f.e("ownerAccount").f("displayName", null);
            default:
                com.grack.nanojson.c cVar = this.f;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return cVar.e("user").f("username", "");
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String R() {
        switch (this.e) {
            case 0:
                return this.f.e("ownerAccount").f("url", null);
            default:
                com.grack.nanojson.c cVar = this.f;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return org.schabi.newpipe.extractor.utils.f.l(cVar.e("user").f("permalink_url", ""));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        switch (this.e) {
            case 0:
                try {
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().k((String) eVar.r(this.b.y).B);
                    this.f = cVar;
                    androidx.compose.ui.text.android.d.p(cVar);
                    return;
                } catch (com.grack.nanojson.d e) {
                    throw new org.schabi.newpipe.extractor.exceptions.d("Could not parse json", e);
                }
            default:
                try {
                    this.f = (com.grack.nanojson.c) x.p().k((String) eVar.t(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("https://api-v2.soundcloud.com/playlists/", ((org.schabi.newpipe.extractor.linkhandler.b) this.b).z, "?client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a(), "&representation=compact"), null, this.a.c()).B);
                    return;
                } catch (com.grack.nanojson.d e2) {
                    org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e2);
                    return;
                }
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long b0() {
        switch (this.e) {
            case 0:
                return this.f.d("videosLength", 0L);
            default:
                return this.f.d("track_count", 0L);
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        switch (this.e) {
            case 0:
                String strF = this.f.f("description", null);
                return org.schabi.newpipe.extractor.utils.f.h(strF) ? org.schabi.newpipe.extractor.stream.c.z : new org.schabi.newpipe.extractor.stream.c(strF, 3);
            default:
                String strF2 = this.f.f("description", null);
                return org.schabi.newpipe.extractor.utils.f.h(strF2) ? org.schabi.newpipe.extractor.stream.c.z : new org.schabi.newpipe.extractor.stream.c(strF2, 3);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e p() {
        switch (this.e) {
            case 0:
                return x(new k(androidx.constraintlayout.core.g.c(this.b.y, "/videos?start=0&count=12"), null, null));
            default:
                org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(this.a.y, 2);
                ArrayList arrayList = new ArrayList();
                this.f.a("tracks").c().forEachOrdered(new org.schabi.newpipe.extractor.services.soundcloud.extractors.a(0, dVar, arrayList));
                return new org.schabi.newpipe.extractor.e(dVar, new k(null, null, arrayList));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        switch (this.e) {
            case 0:
                return this.f.f("displayName", null);
            default:
                return this.f.f("title", null);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public org.schabi.newpipe.extractor.e x(k kVar) throws org.schabi.newpipe.extractor.exceptions.d {
        com.grack.nanojson.c cVar;
        String str = kVar.e;
        if (org.schabi.newpipe.extractor.utils.f.h(str)) {
            net.luminis.tls.engine.impl.c.o("Page doesn't contain an URL");
            return null;
        }
        String str2 = (String) this.d.r(str).B;
        if (org.schabi.newpipe.extractor.utils.f.f(str2)) {
            cVar = null;
        } else {
            try {
                cVar = (com.grack.nanojson.c) x.p().k(str2);
            } catch (Exception e) {
                org.mozilla.javascript.typedarrays.c.d("Could not parse json data for playlist info", e);
                return null;
            }
        }
        if (cVar == null) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Unable to get PeerTube playlist info");
        }
        androidx.compose.ui.text.android.d.p(cVar);
        long jD = cVar.d("total", 0L);
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(this.a.y, 2);
        String strE = e();
        try {
            for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.h(cVar, "data")) {
                if (obj instanceof com.grack.nanojson.c) {
                    com.grack.nanojson.c cVarE = (com.grack.nanojson.c) obj;
                    if (cVarE.containsKey("video")) {
                        cVarE = cVarE.e("video");
                    }
                    dVar.b(cVarE.containsKey("videosLength") ? new c(cVarE, strE) : cVarE.containsKey("followersCount") ? new a(cVarE, strE) : new f(cVarE, strE));
                }
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Unable to extract list info", e2);
        }
        k kVar2 = null;
        try {
            String strI = org.schabi.newpipe.extractor.utils.a.i("start=(\\d*)", 1, str);
            if (!org.schabi.newpipe.extractor.utils.f.f(strI)) {
                long j = Long.parseLong(strI) + 12;
                if (j < jD) {
                    kVar2 = new k(str.replace(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("start=", strI), "start=" + j), null, null);
                }
            }
        } catch (NumberFormatException | org.schabi.newpipe.extractor.utils.d unused) {
        }
        return new org.schabi.newpipe.extractor.e(dVar, kVar2);
    }
}
