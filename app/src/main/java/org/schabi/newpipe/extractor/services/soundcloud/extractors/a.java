package org.schabi.newpipe.extractor.services.soundcloud.extractors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import org.schabi.newpipe.extractor.channel.d;
import org.schabi.newpipe.extractor.exceptions.g;
import org.schabi.newpipe.extractor.i;
import org.schabi.newpipe.extractor.j;
import org.schabi.newpipe.extractor.services.youtube.extractors.l;
import org.schabi.newpipe.extractor.stream.e;
import org.schabi.newpipe.extractor.utils.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str;
        int i = this.a;
        byte b = 4;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                d dVar = (d) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                if (cVar.containsKey("title")) {
                    dVar.A(new c(cVar));
                    return;
                } else {
                    arrayList.add(String.valueOf(cVar.d("id", 0L)));
                    return;
                }
            case 1:
                b bVar = (b) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj;
                String strF = cVar2.f("url", null);
                if (f.h(strF)) {
                    return;
                }
                try {
                    String strF2 = cVar2.f("preset", " ");
                    String strF3 = cVar2.e("format").f("protocol", null);
                    if (strF3.contains("encrypted")) {
                        return;
                    }
                    org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
                    aVar.a = strF2;
                    if (strF3.equals("hls")) {
                        aVar.d = 3;
                    }
                    aVar.b = bVar.Y(strF);
                    aVar.c = true;
                    if (strF2.contains("mp3")) {
                        aVar.e = i.MP3;
                        aVar.f = 128;
                    } else if (strF2.contains("opus")) {
                        aVar.e = i.OPUS;
                        aVar.f = 64;
                    } else {
                        if (!strF2.contains("aac_160k")) {
                            return;
                        }
                        aVar.e = i.M4A;
                        aVar.f = 160;
                    }
                    org.schabi.newpipe.extractor.stream.b bVarA = aVar.a();
                    if (e.a(bVarA, arrayList2)) {
                        return;
                    }
                    arrayList2.add(bVarA);
                    return;
                } catch (IOException | org.schabi.newpipe.extractor.exceptions.d unused) {
                    return;
                }
            case 2:
                ArrayList arrayList3 = (ArrayList) obj2;
                String str2 = (String) obj;
                try {
                    String str3 = ((org.schabi.newpipe.extractor.services.youtube.extractors.c) obj3).g;
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj4 = new Object[]{str2}[0];
                    Objects.requireNonNull(obj4);
                    arrayList4.add(obj4);
                    List listUnmodifiableList = Collections.unmodifiableList(arrayList4);
                    String str4 = (String) listUnmodifiableList.get(0);
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1865828127:
                            b = !str4.equals("playlists") ? (byte) -1 : (byte) 0;
                            break;
                        case -1415163932:
                            b = !str4.equals("albums") ? (byte) -1 : (byte) 1;
                            break;
                        case -903148681:
                            b = !str4.equals("shorts") ? (byte) -1 : (byte) 2;
                            break;
                        case -816678056:
                            b = !str4.equals("videos") ? (byte) -1 : (byte) 3;
                            break;
                        case -439267705:
                            if (!str4.equals("livestreams")) {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            str = "/playlists";
                            break;
                        case 1:
                            str = "/releases";
                            break;
                        case 2:
                            str = "/shorts";
                            break;
                        case 3:
                            str = "/videos";
                            break;
                        case 4:
                            str = "/streams";
                            break;
                        default:
                            throw new g(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unsupported tab ", str4));
                    }
                    String str5 = "https://www.youtube.com/" + str3 + str;
                    arrayList3.add(new org.schabi.newpipe.extractor.linkhandler.b(str5, str5, str3, listUnmodifiableList, ""));
                    return;
                } catch (org.schabi.newpipe.extractor.exceptions.f unused2) {
                    return;
                }
            default:
                String str6 = (String) obj3;
                j jVar = (j) obj2;
                com.grack.nanojson.c cVar3 = (com.grack.nanojson.c) obj;
                if (cVar3.f("musicItemRendererDisplayPolicy", "").equals("MUSIC_ITEM_RENDERER_DISPLAY_POLICY_GREY_OUT")) {
                    return;
                }
                com.grack.nanojson.b bVarA2 = cVar3.a("flexColumns").b(1).e("musicResponsiveListItemFlexColumnRenderer").e("text").a("runs");
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1778518201:
                        b = !str6.equals("music_playlists") ? (byte) -1 : (byte) 0;
                        break;
                    case -566908430:
                        b = !str6.equals("music_artists") ? (byte) -1 : (byte) 1;
                        break;
                    case 1499667262:
                        b = !str6.equals("music_albums") ? (byte) -1 : (byte) 2;
                        break;
                    case 1589120868:
                        b = !str6.equals("music_songs") ? (byte) -1 : (byte) 3;
                        break;
                    case 2098153138:
                        if (!str6.equals("music_videos")) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 2:
                        jVar.b(new org.schabi.newpipe.extractor.services.youtube.extractors.i(cVar3, bVarA2, str6));
                        return;
                    case 1:
                        jVar.b(new org.schabi.newpipe.extractor.services.youtube.extractors.j(cVar3));
                        return;
                    case 3:
                    case 4:
                        jVar.b(new l(cVar3, bVarA2, str6));
                        return;
                    default:
                        return;
                }
        }
    }
}
