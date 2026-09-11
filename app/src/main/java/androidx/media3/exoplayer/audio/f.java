package androidx.media3.exoplayer.audio;

import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return com.grack.nanojson.c.class.cast(obj);
            case 2:
                return ((net.luminis.quic.recovery.a) obj).i;
            case 3:
                ArrayList arrayList = net.luminis.tls.engine.impl.a.z;
                return null;
            case 4:
                return new ArrayList();
            case 5:
                org.jsoup.internal.j jVar = (org.jsoup.internal.j) obj;
                String strL = org.jsoup.internal.k.l(jVar.a);
                jVar.a = null;
                return strL;
            case 6:
                return Collections.unmodifiableList((List) obj);
            case 7:
                org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) obj;
                if (oVar instanceof org.jsoup.nodes.v) {
                    return ((org.jsoup.nodes.v) oVar).J();
                }
                return oVar.s("br") ? "\n" : "";
            case 8:
                return new HashMap();
            case 9:
                return ((org.jsoup.nodes.j) obj).d0();
            case 10:
                return ((org.jsoup.nodes.o) obj).A();
            case 11:
                return new WeakHashMap();
            case 12:
                return NativeArrayBuffer.js_byteLength((Scriptable) obj);
            case 13:
                return NativeDataView.lambda$init$0((Scriptable) obj);
            case 14:
                return NativeDataView.lambda$init$1((Scriptable) obj);
            case 15:
                return NativeDataView.lambda$init$2((Scriptable) obj);
            case 16:
                Locale locale = (Locale) obj;
                return new org.schabi.newpipe.extractor.localization.c(locale.getLanguage(), locale.getCountry());
            case 17:
                return (ChronoUnit) ((Map.Entry) obj).getKey();
            case 18:
                return ((org.jsoup.nodes.j) obj).d("src");
            case 19:
                return ((org.jsoup.nodes.j) obj).d("src");
            case 20:
                return ((org.jsoup.nodes.j) obj).V("tag").stream();
            case 21:
                return new org.schabi.newpipe.extractor.services.bandcamp.extractors.e((org.jsoup.nodes.j) obj);
            case 22:
                return (com.grack.nanojson.c) com.grack.nanojson.c.class.cast(obj);
            case 23:
                org.schabi.newpipe.extractor.services.media_ccc.extractors.a aVar = (org.schabi.newpipe.extractor.services.media_ccc.extractors.a) obj;
                org.schabi.newpipe.extractor.stream.a aVar2 = new org.schabi.newpipe.extractor.stream.a();
                aVar2.a = aVar.c.f("tech", " ");
                aVar2.b = aVar.c.f("url", null);
                aVar2.c = true;
                aVar2.f = -1;
                String str = aVar.b;
                if ("hls".equals(str)) {
                    aVar2.d = 3;
                    return aVar2.a();
                }
                aVar2.e = org.schabi.newpipe.extractor.i.a(str);
                return aVar2.a();
            case 24:
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                return cVar.e("urls").entrySet().stream().filter(new com.grack.nanojson.a(i)).map(new net.luminis.quic.crypto.e(cVar, i));
            case 25:
                return ((com.grack.nanojson.c) obj).e("urls");
            case 26:
                org.schabi.newpipe.extractor.services.media_ccc.extractors.a aVar3 = (org.schabi.newpipe.extractor.services.media_ccc.extractors.a) obj;
                com.grack.nanojson.b bVarA = aVar3.a.a("videoSize");
                coil3.intercept.i iVar = new coil3.intercept.i();
                iVar.c = 1;
                com.grack.nanojson.c cVar2 = aVar3.c;
                iVar.d = cVar2.f("tech", " ");
                iVar.e = cVar2.f("url", null);
                iVar.a = true;
                iVar.f = Boolean.FALSE;
                Object obj2 = bVarA.get(0);
                int iIntValue = obj2 instanceof Number ? ((Number) obj2).intValue() : 0;
                Object obj3 = bVarA.get(1);
                iVar.g = iIntValue + "x" + (obj3 instanceof Number ? ((Number) obj3).intValue() : 0);
                String str2 = aVar3.b;
                if ("hls".equals(str2)) {
                    iVar.c = 3;
                    return iVar.a();
                }
                iVar.b = org.schabi.newpipe.extractor.i.a(str2);
                return iVar.a();
            case 27:
                com.grack.nanojson.c cVar3 = (com.grack.nanojson.c) obj;
                String strValueOf = String.valueOf(cVar3.c("id", -1));
                String strF = cVar3.f("playlistUrl", "");
                org.schabi.newpipe.extractor.i iVar2 = org.schabi.newpipe.extractor.i.MPEG_4;
                if (strValueOf == null) {
                    net.luminis.tls.engine.impl.c.r("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
                    return null;
                }
                if (strF != null) {
                    return new org.schabi.newpipe.extractor.stream.j(strF, true, iVar2, 3, "", false, null);
                }
                net.luminis.tls.engine.impl.c.r("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                return null;
            case 28:
                return ((com.grack.nanojson.c) obj).e("channelAgeGateRenderer");
            default:
                org.schabi.newpipe.extractor.services.youtube.c cVar4 = (org.schabi.newpipe.extractor.services.youtube.c) obj;
                com.grack.nanojson.c cVar5 = cVar4.e;
                int iE = androidx.constraintlayout.core.g.e(cVar4.y);
                if (iE == 1 || iE == 2) {
                    return org.schabi.newpipe.extractor.services.youtube.i.n(cVar5.e("title"), false);
                }
                return iE != 3 ? cVar5.f("title", null) : cVar5.e("content").e("pageHeaderViewModel").e("title").e("dynamicTextViewModel").e("text").f("content", cVar5.f("pageTitle", null));
        }
    }
}
