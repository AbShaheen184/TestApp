package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.compose.animation.core.j2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends j2 {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.grack.nanojson.c cVar, int i) {
        super(cVar);
        this.y = i;
    }

    @Override // androidx.compose.animation.core.j2
    public final com.grack.nanojson.c k() {
        switch (this.y) {
            case 0:
                return ((com.grack.nanojson.c) this.e).a("avatars").b(0);
            default:
                return ((com.grack.nanojson.c) this.e).e("avatar");
        }
    }

    @Override // androidx.compose.animation.core.j2
    public final com.grack.nanojson.c l() {
        switch (this.y) {
            case 0:
                return (com.grack.nanojson.c) ((com.grack.nanojson.c) this.e).e("rendererContext").e("commandContext").e("onTap").e("innertubeCommand").e("showDialogCommand").e("panelLoadingStrategy").e("inlineContent").e("dialogViewModel").e("customContent").e("listViewModel").a("listItems").c().map(new z(12)).findFirst().orElse(null);
            default:
                return (com.grack.nanojson.c) this.e;
        }
    }
}
