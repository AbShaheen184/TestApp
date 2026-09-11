package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.compose.animation.core.j2;
import com.google.common.util.concurrent.g0;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c0 implements org.schabi.newpipe.extractor.stream.h {
    public static final DateTimeFormatter h = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
    public final com.grack.nanojson.c a;
    public final g0 b;
    public final com.grack.nanojson.b c;
    public int d;
    public String e;
    public String f;
    public j2 g;

    public c0(com.grack.nanojson.c cVar, g0 g0Var) {
        this.a = cVar;
        this.b = g0Var;
        this.c = cVar.e("metadata").e("lockupMetadataViewModel").e("metadata").e("contentMetadataViewModel").a("metadataRows");
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public String b() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVarE = s().l().e("rendererContext").e("commandContext").e("onTap").e("innertubeCommand");
        com.grack.nanojson.c cVarE2 = cVarE.e("browseEndpoint");
        String strF = cVarE2.f("browseId", null);
        if (strF != null && strF.startsWith("UC")) {
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.m("channel/".concat(strF));
        }
        String strF2 = cVarE2.f("canonicalBaseUrl", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF2)) {
            org.schabi.newpipe.extractor.services.youtube.linkHandler.a aVar = org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b;
            if (strF2.startsWith("/")) {
                strF2 = strF2.substring(1);
            }
            return aVar.m(strF2);
        }
        String strF3 = cVarE.e("commandMetadata").e("webCommandMetadata").f("url", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF3)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get uploader url");
            return null;
        }
        org.schabi.newpipe.extractor.services.youtube.linkHandler.a aVar2 = org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b;
        if (strF3.startsWith("/")) {
            strF3 = strF3.substring(1);
        }
        return aVar2.m(strF3);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() throws org.schabi.newpipe.extractor.exceptions.f {
        ArrayList arrayListU = u();
        if (arrayListU.isEmpty()) {
            org.mozilla.javascript.typedarrays.c.b("Could not get uploader verified status: no metadata row");
            return false;
        }
        com.grack.nanojson.b bVarA = ((com.grack.nanojson.b) arrayListU.get(0)).b(0).e("text").a("attachmentRuns");
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        return bVarA.c().anyMatch(new com.grack.nanojson.a(11));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public String e() throws org.schabi.newpipe.extractor.exceptions.f {
        ArrayList arrayListU = u();
        if (arrayListU.isEmpty()) {
            org.mozilla.javascript.typedarrays.c.b("Could not get uploader name: no metadata row");
            return null;
        }
        String strF = ((com.grack.nanojson.b) arrayListU.get(0)).b(0).e("text").f("content", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() throws org.schabi.newpipe.extractor.exceptions.f {
        if (w()) {
            return -1L;
        }
        ArrayList arrayListU = u();
        if (arrayListU.isEmpty()) {
            if (x() && v()) {
                return 0L;
            }
            org.mozilla.javascript.typedarrays.c.b("Could not get view count: no metadata part from metadata rows");
            return 0L;
        }
        if (y()) {
            return -1L;
        }
        if (x() && arrayListU.size() == 1 && !v()) {
            return 0L;
        }
        com.grack.nanojson.b bVar = (com.grack.nanojson.b) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayListU);
        if (bVar.isEmpty()) {
            org.mozilla.javascript.typedarrays.c.b("Could not get view count: no metadata part in the metadata parts array");
            return 0L;
        }
        String strF = bVar.b(0).e("text").f("content", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get view count");
            return 0L;
        }
        if (strF.toLowerCase().contains("no views")) {
            return 0L;
        }
        if (strF.toLowerCase().contains("recommended")) {
            return -1L;
        }
        return org.schabi.newpipe.extractor.utils.f.k(strF);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() throws org.schabi.newpipe.extractor.exceptions.f {
        String name = getName();
        return "[Private video]".equals(name) || "[Deleted video]".equals(name);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() throws org.schabi.newpipe.extractor.exceptions.f {
        if (x() || y()) {
            return -1L;
        }
        List list = (List) ((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(this.a, "contentImage.thumbnailViewModel.overlays", com.grack.nanojson.b.class)).c().flatMap(new z(8)).map(new z(9)).collect(Collectors.toList());
        if (list.isEmpty()) {
            return -1L;
        }
        Iterator it = list.iterator();
        org.schabi.newpipe.extractor.exceptions.f e = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.matches(".*\\d.*")) {
                try {
                    return org.schabi.newpipe.extractor.services.youtube.i.y(str);
                } catch (org.schabi.newpipe.extractor.exceptions.f e2) {
                    e = e2;
                }
            }
        }
        if (e == null) {
            return -1L;
        }
        org.mozilla.javascript.typedarrays.c.d("Could not get duration", e);
        return 0L;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() throws org.schabi.newpipe.extractor.exceptions.f {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = (String) org.schabi.newpipe.extractor.utils.a.e(this.a, "metadata.lockupMetadataViewModel.title.content", String.class);
        if (org.schabi.newpipe.extractor.utils.f.h(str2)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get name");
            return null;
        }
        this.e = str2;
        return str2;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            String strF = cVar.f("contentId", null);
            if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
                strF = (String) org.schabi.newpipe.extractor.utils.a.e(cVar, "rendererContext.commandContext.onTap.innertubeCommand.watchEndpoint.videoId", String.class);
            }
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.c.c.m(strF);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void h() {
        org.schabi.newpipe.extractor.services.youtube.i.k((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(s().k(), "avatarViewModel.image.sources", com.grack.nanojson.b.class));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void k() throws org.schabi.newpipe.extractor.exceptions.f {
        if (w() || x()) {
            return;
        }
        y();
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() throws org.schabi.newpipe.extractor.exceptions.f {
        if (x()) {
            return null;
        }
        String strT = t();
        return y() ? strT.replace("Premieres ", "").replace("Scheduled for ", "") : strT;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final org.schabi.newpipe.extractor.localization.b n() throws org.schabi.newpipe.extractor.exceptions.f {
        String strM = m();
        if (strM == null) {
            return null;
        }
        if (!y()) {
            return this.b.x(strM);
        }
        try {
            return new org.schabi.newpipe.extractor.localization.b(LocalDateTime.parse(t().replace("Premieres ", "").replace("Scheduled for ", ""), h).N(ZoneOffset.UTC).toInstant(), false);
        } catch (DateTimeParseException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse premiere upload date", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.k((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(this.a, "contentImage.thumbnailViewModel.image.sources", com.grack.nanojson.b.class));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        if (this.d == 0) {
            com.grack.nanojson.b bVar = (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(this.a, "contentImage.thumbnailViewModel.overlays", com.grack.nanojson.b.class);
            int i = 4;
            if (!bVar.c().flatMap(new z(10)).map(new z(11)).anyMatch(new x(9)) && !bVar.c().flatMap(new z(4)).map(new z(5)).anyMatch(new x(6))) {
                i = 2;
            }
            this.d = i;
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j2 s() throws org.schabi.newpipe.extractor.exceptions.f {
        b0 b0Var;
        if (this.g == null) {
            com.grack.nanojson.c cVarE = this.a.e("metadata").e("lockupMetadataViewModel").e("image");
            V v = cVarE.get("decoratedAvatarViewModel");
            com.grack.nanojson.c cVar = v instanceof com.grack.nanojson.c ? (com.grack.nanojson.c) v : null;
            if (cVar != null) {
                b0Var = new b0(cVar, 1);
            } else {
                V v2 = cVarE.get("avatarStackViewModel");
                com.grack.nanojson.c cVar2 = v2 instanceof com.grack.nanojson.c ? (com.grack.nanojson.c) v2 : null;
                if (cVar2 == null) {
                    org.mozilla.javascript.typedarrays.c.b("Failed to determine channel image view model");
                    return null;
                }
                b0Var = new b0(cVar2, 0);
            }
            this.g = b0Var;
        }
        return this.g;
    }

    public final String t() throws org.schabi.newpipe.extractor.exceptions.f {
        String str = this.f;
        if (str != null) {
            return str;
        }
        ArrayList arrayListU = u();
        if (arrayListU.isEmpty()) {
            org.mozilla.javascript.typedarrays.c.b("Could not get date text: no metadata part from metadata rows");
            return null;
        }
        com.grack.nanojson.b bVar = (com.grack.nanojson.b) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayListU);
        if (bVar.isEmpty()) {
            org.mozilla.javascript.typedarrays.c.b("Could not get date text: no metadata part in the metadata parts array");
            return null;
        }
        String strF = bVar.b(bVar.size() - 1).e("text").f("content", null);
        this.f = strF;
        return strF;
    }

    public final ArrayList u() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            com.grack.nanojson.b bVar = this.c;
            if (i >= bVar.size()) {
                return arrayList;
            }
            com.grack.nanojson.c cVarB = bVar.b(i);
            if (cVarB.containsKey("metadataParts")) {
                arrayList.add(cVarB.a("metadataParts"));
            }
            i++;
        }
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        return this.c.c().flatMap(new z(6)).map(new z(7)).anyMatch(new x(8));
    }

    public final boolean x() {
        return p() != 2;
    }

    public final boolean y() throws org.schabi.newpipe.extractor.exceptions.f {
        String strT = t();
        return strT.contains("Premieres ") || strT.contains("Scheduled for ");
    }
}
