package org.schabi.newpipe.extractor.services.youtube.extractors;

import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.grack.nanojson.c) obj).e("metadataBadgeRenderer").f("style", null);
            case 1:
                return org.schabi.newpipe.extractor.services.youtube.i.n(((com.grack.nanojson.c) obj).e("thumbnailOverlayTimeStatusRenderer").e("text"), false);
            case 2:
                return ((com.grack.nanojson.c) obj).e("thumbnailOverlayTimeStatusRenderer");
            case 3:
                return ((com.grack.nanojson.c) obj).e("clientResource").f("imageName", null);
            case 4:
                return ((com.grack.nanojson.c) obj).e("thumbnailBottomOverlayViewModel").a("badges").c();
            case 5:
                return ((com.grack.nanojson.c) obj).e("thumbnailBadgeViewModel");
            case 6:
                return ((com.grack.nanojson.c) obj).a("badges").c();
            case 7:
                return ((com.grack.nanojson.c) obj).e("badgeViewModel").f("badgeStyle", null);
            case 8:
                return ((com.grack.nanojson.c) obj).e("thumbnailBottomOverlayViewModel").a("badges").c();
            case 9:
                return ((com.grack.nanojson.c) obj).e("thumbnailBadgeViewModel").f("text", null);
            case 10:
                return ((com.grack.nanojson.c) obj).e("thumbnailOverlayBadgeViewModel").a("thumbnailBadges").c();
            case 11:
                return ((com.grack.nanojson.c) obj).e("thumbnailBadgeViewModel");
            case 12:
                return ((com.grack.nanojson.c) obj).e("listItemViewModel");
            case 13:
                return new LinkedHashMap();
            case 14:
                return ((String) obj).split("=");
            case 15:
                return ((String[]) obj)[0];
            case 16:
                String str = ((String[]) obj)[1];
                Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
                return URLDecoder.decode(str, StandardCharsets.UTF_8);
            default:
                return Pattern.compile((String) obj);
        }
    }
}
