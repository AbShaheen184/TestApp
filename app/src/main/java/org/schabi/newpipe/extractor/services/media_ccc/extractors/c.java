package org.schabi.newpipe.extractor.services.media_ccc.extractors;

import androidx.appcompat.widget.x;
import com.app.mlounge.data.music.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.jsoup.internal.g;
import org.schabi.newpipe.extractor.exceptions.d;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.i;
import org.schabi.newpipe.extractor.stream.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public com.grack.nanojson.c e;
    public com.grack.nanojson.c f;

    @Override // org.schabi.newpipe.extractor.f
    public final int B() {
        return 2;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List H() {
        return org.schabi.newpipe.extractor.utils.a.g(this.e.a("tags"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String I() {
        return this.e.f("release_date", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List J() {
        return b.b(this.e, "thumb_url", "poster_url");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void N() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.localization.b.b(I());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        return b.a(this.f.f("logo_url", null));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        return this.e.f("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String R() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://media.ccc.de/c/", P());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List T() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[SYNTHETIC] */
    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        i iVar;
        i iVar2;
        String strF;
        String strF2;
        String strD;
        com.grack.nanojson.b bVarA = this.e.a("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVarA.size(); i++) {
            com.grack.nanojson.c cVarB = bVarA.b(i);
            String strF3 = cVarB.f("mime_type", null);
            if (strF3.startsWith("video")) {
                if (strF3.endsWith("webm")) {
                    iVar2 = i.WEBM;
                } else {
                    if (strF3.endsWith("mp4")) {
                        iVar2 = i.MPEG_4;
                    } else {
                        iVar = null;
                    }
                    strF = cVarB.f("filename", " ");
                    strF2 = cVarB.f("recording_url", null);
                    strD = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(cVarB.c("height", 0), "p");
                    if (strF != null) {
                        net.luminis.tls.engine.impl.c.r("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
                        return null;
                    }
                    if (strF2 != null) {
                        net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                        return null;
                    }
                    arrayList.add(new j(strF2, true, iVar, 1, strD, false, null));
                }
                iVar = iVar2;
                strF = cVarB.f("filename", " ");
                strF2 = cVarB.f("recording_url", null);
                strD = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(cVarB.c("height", 0), "p");
                if (strF != null) {
                    net.luminis.tls.engine.impl.c.r("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
                    return null;
                }
                if (strF2 != null) {
                    net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                    return null;
                }
                arrayList.add(new j(strF2, true, iVar, 1, strD, false, null));
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void V() {
        this.e.c("view_count", 0);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(e eVar) throws d {
        String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://api.media.ccc.de/public/events/", this.b.z);
        try {
            this.e = (com.grack.nanojson.c) x.p().k((String) eVar.r(strH).B);
            this.f = (com.grack.nanojson.c) x.p().k((String) eVar.r(this.e.f("conference_url", null)).B);
        } catch (com.grack.nanojson.d e) {
            throw new d("Could not parse json returned by URL: ".concat(strH), e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List d() {
        i iVar;
        com.grack.nanojson.b bVarA = this.e.a("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVarA.size(); i++) {
            com.grack.nanojson.c cVarB = bVarA.b(i);
            String strF = cVarB.f("mime_type", null);
            if (strF.startsWith("audio")) {
                if (strF.endsWith("opus")) {
                    iVar = i.OPUS;
                } else if (strF.endsWith("mpeg")) {
                    iVar = i.MP3;
                } else {
                    iVar = strF.endsWith("ogg") ? i.OGG : null;
                }
                org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
                aVar.a = cVarB.f("filename", " ");
                aVar.b = cVarB.f("recording_url", null);
                aVar.c = true;
                aVar.e = iVar;
                aVar.f = -1;
                String strF2 = cVarB.f("language", null);
                if (strF2 != null && !strF2.contains("-")) {
                    aVar.h = (Locale) org.schabi.newpipe.extractor.utils.a.c(strF2).orElseThrow(new g(strF2, 3));
                }
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        return new org.schabi.newpipe.extractor.stream.c(this.e.f("description", null), 3);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.e.f("original_language", null);
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length);
        for (String str : iSOLanguages) {
            Locale locale = new Locale(str);
            map.put(locale.getISO3Language(), locale);
        }
        if (!map.containsKey(strF)) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Could not get Locale from this three letter language code", strF));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long r() {
        return this.e.c("length", 0);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        return this.e.f("title", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String w() {
        return this.e.f("frontend_link", null);
    }
}
