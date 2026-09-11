package org.schabi.newpipe.extractor.services.youtube;

import j$.time.LocalDate;
import java.util.function.Function;
import java.util.regex.Matcher;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                return new c((com.grack.nanojson.c) obj, 1);
            case 1:
                return ((com.grack.nanojson.c) obj).e("topicChannelDetailsRenderer");
            case 2:
                return new c((com.grack.nanojson.c) obj, 3);
            case 3:
                return new c((com.grack.nanojson.c) obj, 4);
            case 4:
                return new c((com.grack.nanojson.c) obj, 2);
            case 5:
                return ((com.grack.nanojson.c) obj).e("tabRenderer").e("content").e("sectionListRenderer").a("contents").c();
            case 6:
                String str = (String) obj;
                Matcher matcher = f.a.matcher(str);
                return matcher.find() ? matcher.group(1) : str;
            case 7:
                return ((com.grack.nanojson.c) obj).e("singleActionEmergencySupportRenderer");
            case 8:
                return ((com.grack.nanojson.c) obj).f(ES6Iterator.VALUE_PROPERTY, null);
            case 9:
                return ((org.schabi.newpipe.extractor.services.youtube.protos.video.a) obj).c();
            case 10:
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                int iC = cVar.c("height", -1);
                String strE = i.e(cVar.f("url", null));
                int iC2 = cVar.c("width", -1);
                if (iC <= 0) {
                    i = 4;
                } else if (iC < 175) {
                    i = 3;
                } else {
                    i = iC < 720 ? 2 : 1;
                }
                return new org.schabi.newpipe.extractor.a(iC, strE, iC2, i);
            case 11:
                return ((com.grack.nanojson.c) obj).a("params").c();
            case 12:
                c cVar2 = (c) obj;
                int i2 = cVar2.y;
                com.grack.nanojson.c cVar3 = cVar2.e;
                int iE = androidx.constraintlayout.core.g.e(i2);
                if (iE == 1) {
                    return cVar3.e("boxArt").a("thumbnails");
                }
                if (iE != 3) {
                    return cVar3.e("avatar").a("thumbnails");
                }
                com.grack.nanojson.c cVarE = cVar3.e("content").e("pageHeaderViewModel").e("image");
                if (cVarE.containsKey("contentPreviewImageViewModel")) {
                    return cVarE.e("contentPreviewImageViewModel").e("image").a("sources");
                }
                return cVarE.containsKey("decoratedAvatarViewModel") ? cVarE.e("decoratedAvatarViewModel").e("avatar").e("avatarViewModel").e("image").a("sources") : new com.grack.nanojson.b();
            case 13:
                return ((com.grack.nanojson.c) obj).e("tabRenderer");
            case 14:
                c cVar4 = (c) obj;
                int i3 = cVar4.y;
                com.grack.nanojson.c cVar5 = cVar4.e;
                if (i3 != 4) {
                    return cVar5.e("banner").a("thumbnails");
                }
                com.grack.nanojson.c cVarE2 = cVar5.e("content").e("pageHeaderViewModel");
                return cVarE2.containsKey("banner") ? cVarE2.e("banner").e("imageBannerViewModel").e("image").a("sources") : new com.grack.nanojson.b();
            case 15:
                return i.k((com.grack.nanojson.b) obj);
            case 16:
                return (String) String.class.cast(obj);
            case 17:
                V v = ((com.grack.nanojson.c) obj).get("musicResponsiveListItemRenderer");
                if (v instanceof com.grack.nanojson.c) {
                    return (com.grack.nanojson.c) v;
                }
                return null;
            case 18:
                return ((com.grack.nanojson.c) obj).e("itemSectionRenderer");
            case 19:
                return ((com.grack.nanojson.c) obj).a("contents").b(0);
            case 20:
                return ((com.grack.nanojson.c) obj).e("playlistSidebarSecondaryInfoRenderer").e("videoOwner").e("videoOwnerRenderer");
            case 21:
                return ((com.grack.nanojson.c) obj).e("playlistSidebarPrimaryInfoRenderer");
            case 22:
                return ((com.grack.nanojson.c) obj).a("runs").c();
            case 23:
                return ((com.grack.nanojson.c) obj).f("text", "");
            case 24:
                return ((com.grack.nanojson.c) obj).e("segmentedLikeDislikeButtonViewModel").e("likeButtonViewModel").e("likeButtonViewModel").e("toggleButtonViewModel").e("toggleButtonViewModel").e("defaultButtonViewModel").e("buttonViewModel");
            case 25:
                return ((com.grack.nanojson.c) obj).e("segmentedLikeDislikeButtonRenderer").e("likeButton").e("toggleButtonRenderer");
            case 26:
                return new org.schabi.newpipe.extractor.localization.b(((LocalDate) obj).atStartOfDay(), true);
            case 27:
                return ((com.grack.nanojson.c) obj).e("engagementPanelSectionListRenderer").e("content").e("macroMarkersListRenderer").a("contents");
            case 28:
                return ((com.grack.nanojson.c) obj).e("macroMarkersListItemRenderer");
            default:
                return ((com.grack.nanojson.c) obj).e("metadataRowRenderer").a("contents").c();
        }
    }
}
