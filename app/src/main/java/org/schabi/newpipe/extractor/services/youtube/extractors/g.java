package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.google.common.util.concurrent.g0;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ g(g0 g0Var, int i) {
        this.a = i;
        this.b = g0Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
        switch (this.a) {
            case 0:
                return new a0(cVar.e("playlistPanelVideoRenderer"), this.b);
            default:
                boolean zContainsKey = cVar.containsKey("compactVideoRenderer");
                g0 g0Var = this.b;
                if (zContainsKey) {
                    return new a0(cVar.e("compactVideoRenderer"), g0Var);
                }
                if (cVar.containsKey("compactRadioRenderer")) {
                    return new e(cVar.e("compactRadioRenderer"));
                }
                if (cVar.containsKey("compactPlaylistRenderer")) {
                    return new e(cVar.e("compactPlaylistRenderer"));
                }
                if (cVar.containsKey("lockupViewModel")) {
                    com.grack.nanojson.c cVarE = cVar.e("lockupViewModel");
                    String strF = cVarE.f("contentType", null);
                    if ("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(strF) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(strF)) {
                        return new f(cVarE);
                    }
                    if ("LOCKUP_CONTENT_TYPE_VIDEO".equals(strF)) {
                        return new c0(cVarE, g0Var);
                    }
                }
                return null;
        }
    }
}
