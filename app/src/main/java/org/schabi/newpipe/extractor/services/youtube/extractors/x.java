package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return "engagement-panel-macro-markers-description-chapters".equals(((com.grack.nanojson.c) obj).e("engagementPanelSectionListRenderer").f("panelIdentifier", null));
            case 1:
                return "BADGE_STYLE_TYPE_MEMBERS_ONLY".equals((String) obj);
            case 2:
                return ((com.grack.nanojson.c) obj).containsKey("thumbnailOverlayTimeStatusRenderer");
            case 3:
                return !org.schabi.newpipe.extractor.utils.f.h((String) obj);
            case 4:
                return ((com.grack.nanojson.c) obj).containsKey("thumbnailOverlayTimeStatusRenderer");
            case 5:
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                return cVar.f("style", "").equalsIgnoreCase("SHORTS") || cVar.e("icon").f("iconType", "").toLowerCase().contains("shorts");
            case 6:
                return "THUMBNAIL_OVERLAY_BADGE_STYLE_LIVE".equals(((com.grack.nanojson.c) obj).f("badgeStyle", null));
            case 7:
                return "LIVE".equals((String) obj);
            case 8:
                return "BADGE_MEMBERS_ONLY".equals((String) obj);
            case 9:
                com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj;
                if ("THUMBNAIL_OVERLAY_BADGE_STYLE_LIVE".equals(cVar2.f("badgeStyle", null))) {
                    return true;
                }
                return cVar2.e("icon").a("sources").c().map(new z(3)).anyMatch(new x(7));
            case 10:
                return ((String[]) obj).length > 1;
            case 11:
                return Objects.nonNull((String) obj);
            default:
                String str = (String) obj;
                return (org.schabi.newpipe.extractor.utils.f.h(str) || str.equals("null")) ? false : true;
        }
    }
}
