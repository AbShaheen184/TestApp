package com.grack.nanojson;

import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return c.class.isInstance(obj);
            case 1:
                return !"dash".equals(((org.schabi.newpipe.extractor.services.media_ccc.extractors.a) obj).b);
            case 2:
                return ((Map.Entry) obj).getValue() instanceof c;
            case 3:
                return !org.schabi.newpipe.extractor.utils.f.h(((c) obj).f("path", null));
            case 4:
                return ((c) obj).containsKey("topicChannelDetailsRenderer");
            case 5:
                return ((c) obj).containsKey("channelAgeGateRenderer");
            case 6:
                return ((c) obj).containsKey("topicChannelDetailsRenderer");
            case 7:
                return (obj instanceof c) && ((c) obj).containsKey("singleActionEmergencySupportRenderer");
            case 8:
                return !org.schabi.newpipe.extractor.utils.f.h((String) obj);
            case 9:
                String strF = ((c) obj).e("clientResource").f("imageName", null);
                return "CHECK_CIRCLE_FILLED".equals(strF) || "AUDIO_BADGE".equals(strF) || "MUSIC_FILLED".equals(strF);
            case 10:
                return "acont".equals(((org.schabi.newpipe.extractor.services.youtube.protos.video.a) obj).b());
            case 11:
                return ((c) obj).e("element").e("type").e("imageType").e("image").a("sources").c().anyMatch(new a(9));
            case 12:
                return !org.schabi.newpipe.extractor.utils.f.h(((c) obj).f("url", null));
            case 13:
                return ((c) obj).containsKey("tabRenderer");
            case 14:
                return String.class.isInstance(obj);
            case 15:
                return ((c) obj).containsKey("thumbnailOverlayBadgeViewModel");
            case 16:
                return ((c) obj).containsKey("thumbnailBadgeViewModel");
            case 17:
                return ((c) obj).containsKey("showingResultsForRenderer");
            case 18:
                return Objects.nonNull((c) obj);
            case 19:
                return !((c) obj).isEmpty();
            case 20:
                return "engagement-panel-course-metadata".equals(((c) obj).e("showEngagementPanelEndpoint").e("identifier").f("tag", null));
            case 21:
                return ((c) obj).e("playlistSidebarSecondaryInfoRenderer").e("videoOwner").containsKey("videoOwnerRenderer");
            case 22:
                return ((c) obj).containsKey("playlistSidebarPrimaryInfoRenderer");
            case 23:
                return ((c) obj).containsKey("continuationCommand");
            case 24:
                return ((String) obj).contains("Age-restricted");
            case 25:
                return !org.schabi.newpipe.extractor.utils.f.j((c) obj);
            case 26:
                return !org.schabi.newpipe.extractor.utils.f.j((c) obj);
            case 27:
                return Objects.nonNull((org.schabi.newpipe.extractor.d) obj);
            case 28:
                return Objects.nonNull((org.schabi.newpipe.extractor.services.youtube.extractors.a) obj);
            default:
                return "PRIVACY_UNLISTED".equals(((c) obj).e("metadataBadgeRenderer").e("icon").f("iconType", null));
        }
    }
}
