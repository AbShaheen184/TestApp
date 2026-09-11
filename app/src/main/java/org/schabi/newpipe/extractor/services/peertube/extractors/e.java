package org.schabi.newpipe.extractor.services.peertube.extractors;

import androidx.appcompat.widget.x;
import androidx.constraintlayout.core.g;
import androidx.fragment.app.h;
import com.appsalt.internal.x0;
import com.google.android.material.textfield.p;
import j$.net.URLEncoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.schabi.newpipe.extractor.i;
import org.schabi.newpipe.extractor.stream.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends org.schabi.newpipe.extractor.f {
    public final String e;
    public com.grack.nanojson.c f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public org.schabi.newpipe.extractor.exceptions.f j;

    public e(org.schabi.newpipe.extractor.services.peertube.b bVar, org.schabi.newpipe.extractor.linkhandler.a aVar) {
        super(bVar, aVar);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = null;
        this.e = e();
    }

    public static String b0(com.grack.nanojson.c cVar, String str, String str2, String str3) {
        if ("fileDownloadUrl".equals(str)) {
            str3 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, "fileUrl", String.class);
        }
        return str3.replace("-fragmented.".concat(str2), ".m3u8");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void A() throws org.schabi.newpipe.extractor.exceptions.f {
        ArrayList arrayList = new ArrayList();
        try {
            com.grack.nanojson.c cVarA0 = a0("chapters");
            if (cVarA0 == null || !cVarA0.containsKey("chapters")) {
                return;
            }
            com.grack.nanojson.b bVarA = cVarA0.a("chapters");
            for (int i = 0; i < bVarA.size(); i++) {
                com.grack.nanojson.c cVarB = bVarA.b(i);
                cVarB.f("title", null);
                cVarB.c("timecode", 0);
                arrayList.add(new org.schabi.newpipe.extractor.stream.d());
            }
        } catch (IOException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get stream segments", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int B() {
        return this.f.b("isLive") ? 4 : 2;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void C() {
        androidx.compose.ui.text.android.d.c(this.f.e("channel"), this.e, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void D() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void E() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void F() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.exceptions.f fVar = this.j;
        if (fVar != null) {
            throw fVar;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void G() {
        try {
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List H() {
        return org.schabi.newpipe.extractor.utils.a.g(this.f.a("tags"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String I() {
        return (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "publishedAt", String.class);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List J() {
        return androidx.compose.ui.text.android.d.f(this.f, this.e);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void L() throws org.schabi.newpipe.extractor.exceptions.f {
        M("((#|&|\\?)start=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void N() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.localization.b.a(I());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        return androidx.compose.ui.text.android.d.c(this.f.e("account"), this.e, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        return (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "account.displayName", String.class);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String R() {
        return this.a.b().y(coil3.compose.internal.f.e("accounts/", (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "account.name", String.class), "@", (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "account.host", String.class)), this.e).y;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List T() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (B() == 2) {
            c0();
            return arrayList;
        }
        try {
            Stream map = this.f.a("streamingPlaylists").c().map(new androidx.media3.exoplayer.audio.f(27));
            Objects.requireNonNull(arrayList);
            map.forEachOrdered(new x0(arrayList, 6));
            return arrayList;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get video streams", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void V() {
        this.f.d("views", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        org.schabi.newpipe.extractor.linkhandler.a aVar = this.b;
        String str = aVar.z;
        StringBuilder sb = new StringBuilder();
        String str2 = this.e;
        sb.append(str2);
        sb.append("/api/v1/videos/");
        sb.append(str);
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().k((String) eVar.r(sb.toString()).B);
            this.f = cVar;
            if (cVar == null) {
                throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract PeerTube stream data");
            }
            androidx.compose.ui.text.android.d.p(cVar);
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty()) {
                try {
                    for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e((com.grack.nanojson.c) x.p().k((String) this.d.r(str2 + "/api/v1/videos/" + aVar.z + "/captions").B), "data", com.grack.nanojson.b.class)) {
                        if (obj instanceof com.grack.nanojson.c) {
                            com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj;
                            String str3 = str2 + ((String) org.schabi.newpipe.extractor.utils.a.e(cVar2, "captionPath", String.class));
                            String str4 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar2, "language.id", String.class);
                            i iVarA = i.a(str3.substring(str3.lastIndexOf(".") + 1));
                            if (iVarA != null && !org.schabi.newpipe.extractor.utils.f.h(str4)) {
                                if (str4 == null) {
                                    throw new IllegalStateException("The language code of the subtitles stream has been not set or is null. Make sure you specified an non null language code with setLanguageCode.");
                                }
                                str4.concat(".".concat(iVarA.y));
                                arrayList.add(new org.schabi.newpipe.extractor.stream.i(str3, true, iVarA, str4, false));
                            }
                        }
                    }
                } catch (Exception e) {
                    this.j = new org.schabi.newpipe.extractor.exceptions.f("Could not get subtitles", e);
                }
            }
        } catch (com.grack.nanojson.d e2) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract PeerTube stream data", e2);
        }
    }

    public final void Y(com.grack.nanojson.c cVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        i iVarA = i.a(strSubstring);
        String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str, "-", strSubstring);
        org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
        aVar.a = strI + "-" + str2 + "-PROGRESSIVE_HTTP";
        aVar.b = str3;
        aVar.c = true;
        aVar.e = iVarA;
        aVar.f = -1;
        org.schabi.newpipe.extractor.stream.b bVarA = aVar.a();
        ArrayList arrayList = this.h;
        arrayList.add(bVarA);
        if (!org.schabi.newpipe.extractor.utils.f.h(str4)) {
            String strB0 = z ? b0(cVar, str2, strSubstring, str3) : str4.replace("master", ((Number) org.schabi.newpipe.extractor.utils.a.e(cVar, "resolution.id", Number.class)).toString());
            org.schabi.newpipe.extractor.stream.a aVar2 = new org.schabi.newpipe.extractor.stream.a();
            aVar2.a = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strI, "-", "HLS");
            aVar2.b = strB0;
            aVar2.c = true;
            aVar2.d = 3;
            aVar2.e = iVarA;
            aVar2.f = -1;
            org.schabi.newpipe.extractor.stream.b bVarA2 = aVar2.a();
            if (!org.schabi.newpipe.extractor.stream.e.a(bVarA2, arrayList)) {
                arrayList.add(bVarA2);
            }
        }
        String str5 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, "torrentUrl", String.class);
        if (org.schabi.newpipe.extractor.utils.f.h(str5)) {
            return;
        }
        org.schabi.newpipe.extractor.stream.a aVar3 = new org.schabi.newpipe.extractor.stream.a();
        aVar3.a = strI + "-" + str2 + "-TORRENT";
        aVar3.b = str5;
        aVar3.c = true;
        aVar3.d = 5;
        aVar3.e = iVarA;
        aVar3.f = -1;
        arrayList.add(aVar3.a());
    }

    public final void Z(com.grack.nanojson.c cVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        i iVarA = i.a(strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(strSubstring);
        boolean z2 = cVar.containsKey("hasAudio") && !cVar.b("hasAudio");
        j jVar = new j(str3, true, iVarA, 1, str, z2, null);
        ArrayList arrayList = this.i;
        arrayList.add(jVar);
        if (!org.schabi.newpipe.extractor.utils.f.h(str4)) {
            String strB0 = z ? b0(cVar, str2, strSubstring, str3) : str4.replace("master", ((Number) org.schabi.newpipe.extractor.utils.a.e(cVar, "resolution.id", Number.class)).toString());
            if (strB0 == null) {
                net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                return;
            } else {
                j jVar2 = new j(strB0, true, iVarA, 3, str, z2, null);
                if (!org.schabi.newpipe.extractor.stream.e.a(jVar2, arrayList)) {
                    arrayList.add(jVar2);
                }
            }
        }
        String str5 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, "torrentUrl", String.class);
        if (org.schabi.newpipe.extractor.utils.f.h(str5)) {
            return;
        }
        if (str5 != null) {
            arrayList.add(new j(str5, true, iVarA, 5, str, z2, null));
        } else {
            net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
        }
    }

    public final com.grack.nanojson.c a0(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        h hVarR = this.d.r(this.e + "/api/v1/videos/" + this.b.z + "/" + str);
        int i = hVarR.y;
        if (i == 400) {
            return null;
        }
        if (i != 200) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Could not get segments from API. Response code: "));
        }
        try {
            return (com.grack.nanojson.c) x.p().k((String) hVarR.B);
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json data for segments", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int c() {
        return ((Boolean) org.schabi.newpipe.extractor.utils.a.e(this.f, "nsfw", Boolean.class)).booleanValue() ? 18 : 0;
    }

    public final void c0() throws org.schabi.newpipe.extractor.exceptions.f {
        d0(this.f.a("files"), "");
        try {
            for (com.grack.nanojson.c cVar : this.f.a("streamingPlaylists").c()) {
                d0(cVar.a("files"), cVar.f("playlistUrl", null));
            }
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get streams", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List d() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() && this.i.isEmpty() && B() == 2) {
            c0();
        }
        return arrayList;
    }

    public final void d0(com.grack.nanojson.b bVar, String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String str2;
        try {
            boolean z = !org.schabi.newpipe.extractor.utils.f.h(str) && str.endsWith("-master.m3u8");
            for (com.grack.nanojson.c cVar : bVar.c()) {
                String str3 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, cVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl", String.class);
                if (org.schabi.newpipe.extractor.utils.f.h(str3)) {
                    return;
                }
                String str4 = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, "resolution.label", String.class);
                String str5 = cVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl";
                if (str4.toLowerCase().contains("audio")) {
                    str2 = str;
                    Y(cVar, z, str4, str5, str3, str2);
                } else {
                    str2 = str;
                    Z(cVar, z, str4, str5, str3, str2);
                }
                str = str2;
            }
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get streams from array", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void f() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        try {
            String str = (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "description", String.class);
            if (str.length() == 250 && str.substring(247).equals("...")) {
                try {
                    str = (String) org.schabi.newpipe.extractor.utils.a.e((com.grack.nanojson.c) x.p().k((String) p.a.r(this.e + "/api/v1/videos/" + this.b.z + "/description").B), "description", String.class);
                } catch (com.grack.nanojson.d | IOException unused) {
                }
            }
            return new org.schabi.newpipe.extractor.stream.c(str, 2);
        } catch (org.schabi.newpipe.extractor.exceptions.f unused2) {
            return org.schabi.newpipe.extractor.stream.c.z;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void i() {
        this.f.d("dislikes", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void l() throws org.schabi.newpipe.extractor.exceptions.d {
        ArrayList arrayList = new ArrayList();
        try {
            com.grack.nanojson.c cVarA0 = a0("storyboards");
            if (cVarA0 == null || !cVarA0.containsKey("storyboards")) {
                return;
            }
            for (Object obj : cVarA0.a("storyboards")) {
                if (obj instanceof com.grack.nanojson.c) {
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    String strF = cVar.f("storyboardPath", null);
                    int iC = cVar.c("spriteWidth", 0);
                    int iC2 = cVar.c("spriteHeight", 0);
                    int iC3 = cVar.c("totalWidth", 0) / iC;
                    int iC4 = cVar.c("totalHeight", 0) / iC2;
                    cVar.c("spriteDuration", 0);
                    Object[] objArr = {g.c(this.e, strF)};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    Collections.unmodifiableList(arrayList2);
                    arrayList.add(new org.schabi.newpipe.extractor.stream.d());
                }
            }
        } catch (IOException e) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not get frames", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String m() {
        a();
        return (B() != 2 || org.schabi.newpipe.extractor.utils.f.j(this.f.e("files"))) ? this.f.a("streamingPlaylists").b(0).f("playlistUrl", "") : this.f.e("files").f("playlistUrl", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void n() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() {
        try {
            new Locale((String) org.schabi.newpipe.extractor.utils.a.e(this.f, "language.id", String.class));
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long r() {
        return this.f.d("duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void s() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void t() {
        this.f.d("likes", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        return (String) org.schabi.newpipe.extractor.utils.a.e(this.f, "name", String.class);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void y() {
        this.f.e("privacy").c("id", 0);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final androidx.emoji2.text.g z() throws org.schabi.newpipe.extractor.exceptions.f {
        String str;
        com.grack.nanojson.c cVar;
        List<String> listH = H();
        boolean zIsEmpty = listH.isEmpty();
        String str2 = this.e;
        if (zIsEmpty) {
            str = str2 + "/api/v1/accounts/" + ((String) org.schabi.newpipe.extractor.utils.a.e(this.f, "account.name", String.class)) + "@" + ((String) org.schabi.newpipe.extractor.utils.a.e(this.f, "account.host", String.class)) + "/videos?start=0&count=8";
        } else {
            String strC = g.c(str2, "/api/v1/search/videos");
            StringBuilder sb = new StringBuilder("start=0&count=8&sort=-createdAt");
            for (String str3 : listH) {
                sb.append("&tagsOneOf=");
                Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
                sb.append(URLEncoder.encode(str3, StandardCharsets.UTF_8));
            }
            str = strC + "?" + ((Object) sb);
        }
        if (org.schabi.newpipe.extractor.utils.f.f(str)) {
            return null;
        }
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(this.a.y, 2);
        String str4 = (String) this.d.r(str).B;
        if (org.schabi.newpipe.extractor.utils.f.f(str4)) {
            cVar = null;
        } else {
            try {
                cVar = (com.grack.nanojson.c) x.p().k(str4);
            } catch (com.grack.nanojson.d e) {
                org.mozilla.javascript.typedarrays.c.d("Could not parse json data for related videos", e);
                return null;
            }
        }
        if (cVar != null) {
            try {
                for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.h(cVar, "data")) {
                    if (obj instanceof com.grack.nanojson.c) {
                        f fVar = new f((com.grack.nanojson.c) obj, str2);
                        if (!fVar.getUrl().equals(this.b.y)) {
                            dVar.A(fVar);
                        }
                    }
                }
            } catch (Exception e2) {
                org.mozilla.javascript.typedarrays.c.d("Could not extract related videos", e2);
                return null;
            }
        }
        return dVar;
    }
}
