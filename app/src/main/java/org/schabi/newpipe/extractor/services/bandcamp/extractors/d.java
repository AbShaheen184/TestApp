package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.appcompat.widget.x;
import androidx.emoji2.text.g;
import com.google.android.material.textfield.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jsoup.parser.e0;
import org.schabi.newpipe.extractor.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public com.grack.nanojson.c i;

    @Override // org.schabi.newpipe.extractor.f
    public final void A() {
        com.grack.nanojson.b<com.grack.nanojson.c> bVarA = this.i.a("tracks");
        ArrayList arrayList = new ArrayList(bVarA.size());
        for (com.grack.nanojson.c cVar : bVarA) {
            cVar.f("title", null);
            cVar.c("timecode", 0);
            org.schabi.newpipe.extractor.stream.d dVar = new org.schabi.newpipe.extractor.stream.d();
            cVar.d("track_art_id", 0L);
            List list = b.a;
            cVar.f("artist", null);
            arrayList.add(dVar);
        }
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List H() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String I() {
        return this.i.f("published_date", null);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List J() {
        return b.b(this.i.d("show_image_id", 0L), false);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List O() {
        return Collections.singletonList(new org.schabi.newpipe.extractor.a(512, "https://bandcamp.com/img/buttons/bandcamp-button-circle-whitecolor-512.png", 512, 2));
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String P() {
        return (String) e0.a(this.i.f("image_caption", null), "").W("a").stream().map(new androidx.media3.exoplayer.audio.f(9)).findFirst().orElseThrow(new org.jsoup.internal.c(9));
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String R() throws org.schabi.newpipe.extractor.exceptions.c {
        throw new org.schabi.newpipe.extractor.exceptions.c("Fan pages are not supported");
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String S() {
        return this.b.y;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        int i = Integer.parseInt(this.b.z);
        try {
            this.i = (com.grack.nanojson.c) x.p().k((String) p.a.r("https://bandcamp.com/api/bcweekly/1/get?id=" + i).B);
        } catch (com.grack.nanojson.d | IOException e) {
            org.mozilla.javascript.typedarrays.c.d("could not get show data", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f
    public final org.schabi.newpipe.extractor.channel.d b0() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List d() {
        ArrayList arrayList = new ArrayList();
        com.grack.nanojson.c cVarE = this.i.e("audio_stream");
        if (cVarE.containsKey("mp3-128")) {
            org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
            aVar.a = "mp3-128";
            aVar.b = cVarE.f("mp3-128", null);
            aVar.c = true;
            aVar.e = i.MP3;
            aVar.f = 128;
            arrayList.add(aVar.a());
        }
        if (cVarE.containsKey("opus-lo")) {
            org.schabi.newpipe.extractor.stream.a aVar2 = new org.schabi.newpipe.extractor.stream.a();
            aVar2.a = "opus-lo";
            aVar2.b = cVarE.f("opus-lo", null);
            aVar2.c = true;
            aVar2.e = i.OPUS;
            aVar2.f = 100;
            arrayList.add(aVar2.a());
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        return new org.schabi.newpipe.extractor.stream.c(this.i.f("desc", null), 3);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final long r() {
        return this.i.d("audio_duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String v() {
        return this.i.f("subtitle", null);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final /* bridge */ /* synthetic */ g z() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final void f() {
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final void s() {
    }
}
