package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.core.view.w0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jsoup.helper.n;
import org.jsoup.nodes.g;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;
import org.jsoup.select.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends org.schabi.newpipe.extractor.playlist.a {
    public g e;
    public com.grack.nanojson.c f;
    public com.grack.nanojson.b g;
    public String h;

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List J() {
        com.grack.nanojson.c cVar = this.f;
        return (cVar.containsKey("art_id") && cVar.get("art_id") == 0) ? Collections.EMPTY_LIST : b.b(this.f.d("art_id", 0L), true);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List O() {
        return b.c((String) this.e.V("band-photo").stream().map(new androidx.media3.exoplayer.audio.f(18)).findFirst().orElse(""));
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String P() {
        return this.f.f("artist", null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String R() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://", this.b.y.split("/")[2], "/");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str = (String) eVar.r(((org.schabi.newpipe.extractor.linkhandler.b) this.b).y).B;
        this.e = e0.a(str, "");
        com.grack.nanojson.c cVarY = f.Y(str);
        this.f = cVarY;
        this.g = cVarY.a("trackinfo");
        try {
            this.h = org.schabi.newpipe.extractor.utils.a.f(str, "data-embed").f("album_title", null);
            if (this.g.isEmpty()) {
                throw new org.schabi.newpipe.extractor.exceptions.a("Album needs to be purchased");
            }
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Faulty JSON; page likely does not contain album data", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            org.mozilla.javascript.typedarrays.c.d("JSON does not exist", e2);
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long b0() {
        return this.g.size();
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() throws org.schabi.newpipe.extractor.exceptions.f {
        g gVar = this.e;
        gVar.getClass();
        n.E("trackInfo");
        j jVar = (j) com.google.android.material.shape.e.j(gVar, j.class).filter(new org.jsoup.select.f(new h(8, "trackInfo", false), gVar, 1)).findFirst().orElse(null);
        if (jVar == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find trackInfo in document");
            return null;
        }
        org.jsoup.select.e eVarV = jVar.V("tralbum-about");
        org.jsoup.select.e eVarV2 = jVar.V("tralbum-credits");
        g gVar2 = this.e;
        gVar2.getClass();
        n.E("license");
        j jVar2 = (j) com.google.android.material.shape.e.j(gVar2, j.class).filter(new org.jsoup.select.f(new h(8, "license", false), gVar2, 1)).findFirst().orElse(null);
        if (eVarV.isEmpty() && eVarV2.isEmpty() && jVar2 == null) {
            return org.schabi.newpipe.extractor.stream.c.z;
        }
        StringBuilder sb = new StringBuilder();
        if (!eVarV.isEmpty()) {
            j jVar3 = (j) eVarV.c();
            Objects.requireNonNull(jVar3);
            sb.append(jVar3.X());
        }
        if (!eVarV2.isEmpty()) {
            j jVar4 = (j) eVarV2.c();
            Objects.requireNonNull(jVar4);
            sb.append(jVar4.X());
        }
        if (jVar2 != null) {
            sb.append(jVar2.X());
        }
        return new org.schabi.newpipe.extractor.stream.c(sb.toString(), 1);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e p() {
        w0 w0Var = this.a;
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        for (int i = 0; i < this.g.size(); i++) {
            com.grack.nanojson.c cVarB = this.g.b(i);
            if (this.g.size() < 10) {
                dVar.A(new org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a(cVarB, R(), w0Var));
            } else {
                String strR = R();
                List listJ = J();
                org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a aVar = new org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a(cVarB, strR, null);
                aVar.c = listJ;
                dVar.A(aVar);
            }
        }
        return new org.schabi.newpipe.extractor.e(dVar, null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        return this.h;
    }
}
