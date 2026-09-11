package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.core.view.w0;
import com.appsalt.internal.x0;
import com.google.android.material.shape.k;
import j$.time.DateTimeException;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jsoup.nodes.g;
import org.jsoup.parser.e0;
import org.jsoup.select.i;
import org.schabi.newpipe.extractor.h;
import org.schabi.newpipe.extractor.services.youtube.extractors.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class f extends org.schabi.newpipe.extractor.f {
    public final /* synthetic */ int e;
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar, int i) {
        super(w0Var, aVar);
        this.e = i;
    }

    public static com.grack.nanojson.c Y(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.utils.a.f(str, "data-tralbum");
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Faulty JSON; page likely does not contain album data", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            org.mozilla.javascript.typedarrays.c.d("JSON does not exist", e2);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int B() {
        switch (this.e) {
            case 0:
                return 3;
            default:
                return 4;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List H() {
        switch (this.e) {
            case 0:
                g gVar = (g) this.h;
                gVar.getClass();
                return (List) k.E(new i("itemprop", "keywords", 0), gVar).stream().map(new androidx.media3.exoplayer.audio.f(9)).collect(Collectors.toList());
            default:
                return super.H();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String I() {
        switch (this.e) {
            case 0:
                return this.g.f("publish_date", null);
            default:
                return super.I();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List J() {
        switch (this.e) {
            case 0:
                com.grack.nanojson.c cVar = this.f;
                return (cVar.containsKey("art_id") && cVar.get("art_id") == 0) ? Collections.EMPTY_LIST : b.b(this.f.d("art_id", 0L), true);
            default:
                return org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b(this.g, "thumb", "poster");
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void N() throws org.schabi.newpipe.extractor.exceptions.f {
        switch (this.e) {
            case 0:
                String strI = I();
                List list = b.a;
                try {
                    ZonedDateTime.parse(strI, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH)).toInstant();
                    return;
                } catch (DateTimeException e) {
                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse date '", strI, "'"), e);
                }
            default:
                return;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List O() {
        switch (this.e) {
            case 0:
                return b.c((String) ((g) this.h).V("band-photo").stream().map(new androidx.media3.exoplayer.audio.f(19)).findFirst().orElse(""));
            default:
                return super.O();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String P() {
        switch (this.e) {
            case 0:
                return this.f.f("artist", null);
            default:
                return this.f.f("conference", null);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String R() {
        switch (this.e) {
            case 0:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://", S().split("/")[2], "/");
            default:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://streaming.media.ccc.de/", this.f.f("slug", null));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String S() {
        switch (this.e) {
            case 0:
                return org.schabi.newpipe.extractor.utils.f.l(this.f.f("url", null));
            default:
                return super.S();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List T() {
        switch (this.e) {
            case 0:
                break;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        switch (this.e) {
            case 0:
                return Collections.EMPTY_LIST;
            default:
                return c0("video", new androidx.media3.exoplayer.audio.f(26));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void V() {
        int i = this.e;
    }

    @Override // org.schabi.newpipe.extractor.f
    public void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        switch (this.e) {
            case 0:
                String str = (String) eVar.r(this.b.y).B;
                this.h = e0.a(str, "");
                com.grack.nanojson.c cVarY = Y(str);
                this.f = cVarY;
                this.g = cVarY.e("current");
                if (this.f.a("trackinfo").size() > 1) {
                    throw new org.schabi.newpipe.extractor.exceptions.d("Page is actually an album, not a track");
                }
                com.grack.nanojson.c cVarB = this.f.a("trackinfo").b(0);
                if (cVarB.containsKey("file") && cVarB.get("file") == 0) {
                    throw new org.schabi.newpipe.extractor.exceptions.a("This track is not available without being purchased");
                }
                return;
            default:
                org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
                if (org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b == null) {
                    try {
                        org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b = (com.grack.nanojson.b) new com.google.android.material.internal.b(com.grack.nanojson.b.class).k((String) eVar.t("https://streaming.media.ccc.de/streams/v2.json", null, cVarC).B);
                    } catch (com.grack.nanojson.d e) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Could not parse JSON.", e);
                    } catch (IOException e2) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Could not get live stream JSON.", e2);
                    }
                }
                com.grack.nanojson.b bVar = org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b;
                int i = 0;
                while (true) {
                    int size = bVar.size();
                    org.schabi.newpipe.extractor.linkhandler.a aVar = this.b;
                    if (i >= size) {
                        throw new org.schabi.newpipe.extractor.exceptions.d(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not find room matching id: '", aVar.z, "'"));
                    }
                    com.grack.nanojson.c cVarB2 = bVar.b(i);
                    com.grack.nanojson.b bVarA = cVarB2.a("groups");
                    for (int i2 = 0; i2 < bVarA.size(); i2++) {
                        String strF = bVarA.b(i2).f("group", null);
                        com.grack.nanojson.b bVarA2 = bVarA.b(i2).a("rooms");
                        for (int i3 = 0; i3 < bVarA2.size(); i3++) {
                            com.grack.nanojson.c cVarB3 = bVarA2.b(i3);
                            if (aVar.z.equals(cVarB2.f("mandator", null) + "/" + cVarB3.f("slug", null))) {
                                this.f = cVarB2;
                                this.h = strF;
                                this.g = cVarB3;
                                return;
                            }
                        }
                    }
                    i++;
                }
                break;
        }
    }

    public String a0(String str) {
        return (String) this.g.a("streams").c().map(new androidx.media3.exoplayer.audio.f(25)).filter(new h(str, 2)).map(new a(str, 1)).findFirst().orElse("");
    }

    public org.schabi.newpipe.extractor.channel.d b0() {
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(this.a.y, 1);
        ((g) this.h).V("recommended-album").stream().map(new androidx.media3.exoplayer.audio.f(21)).forEach(new x0(dVar, 5));
        return dVar;
    }

    public List c0(String str, Function function) {
        return (List) this.g.a("streams").stream().filter(new com.grack.nanojson.a(0)).map(new androidx.media3.exoplayer.audio.f(22)).filter(new h(str, 1)).flatMap(new androidx.media3.exoplayer.audio.f(24)).filter(new com.grack.nanojson.a(1)).map(function).collect(Collectors.toList());
    }

    @Override // org.schabi.newpipe.extractor.f
    public List d() {
        switch (this.e) {
            case 0:
                org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
                aVar.a = "mp3-128";
                aVar.b = this.f.a("trackinfo").b(0).e("file").f("mp3-128", null);
                aVar.c = true;
                aVar.e = org.schabi.newpipe.extractor.i.MP3;
                aVar.f = 128;
                return Collections.singletonList(aVar.a());
            default:
                return c0("audio", new androidx.media3.exoplayer.audio.f(23));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void f() {
        switch (this.e) {
            case 0:
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String g() {
        switch (this.e) {
            case 1:
                return a0("dash");
            default:
                return super.g();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public org.schabi.newpipe.extractor.stream.c h() {
        switch (this.e) {
            case 0:
                String[] strArr = {this.g.f("about", null), this.g.f("lyrics", null), this.g.f("credits", null)};
                Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
                return new org.schabi.newpipe.extractor.stream.c((String) Arrays.stream(strArr).filter(new x(12)).collect(Collectors.joining("\n\n")), 3);
            default:
                return new org.schabi.newpipe.extractor.stream.c(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(this.f.f("description", null), " - ", (String) this.h), 3);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String m() {
        switch (this.e) {
            case 1:
                return a0("hls");
            default:
                return super.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.schabi.newpipe.extractor.f
    public long r() {
        switch (this.e) {
            case 0:
                V v = this.f.a("trackinfo").b(0).get("duration");
                return (long) (v instanceof Number ? ((Number) v).doubleValue() : 0.0d);
            default:
                return super.r();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void s() {
        switch (this.e) {
            case 0:
                this.g.c("license_type", 0);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String v() {
        switch (this.e) {
            case 0:
                return this.g.f("title", null);
            default:
                return this.g.f("display", null);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public /* bridge */ /* synthetic */ androidx.emoji2.text.g z() {
        switch (this.e) {
            case 0:
                return b0();
            default:
                return super.z();
        }
    }

    private final void Z() {
    }

    private final void d0() {
    }
}
