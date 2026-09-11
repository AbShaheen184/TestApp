package org.jsoup.select;

import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ToIntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((p) obj).a();
            case 1:
                return ((org.schabi.newpipe.extractor.services.youtube.e) obj).c;
            default:
                return ((org.schabi.newpipe.extractor.services.youtube.e) obj).c;
        }
    }
}
