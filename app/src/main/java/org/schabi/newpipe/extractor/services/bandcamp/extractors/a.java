package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.constraintlayout.core.g;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                org.schabi.newpipe.extractor.utils.b bVar = (org.schabi.newpipe.extractor.utils.b) obj;
                return new org.schabi.newpipe.extractor.a(bVar.y, g.c(this.b, bVar.e), bVar.z, bVar.A);
            case 1:
                return ((com.grack.nanojson.c) obj).e(this.b).f("url", "");
            case 2:
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                return new org.schabi.newpipe.extractor.a(-1, g.c(this.b, cVar.f("path", null)), cVar.c("width", -1), 4);
            case 3:
                org.schabi.newpipe.extractor.utils.b bVar2 = (org.schabi.newpipe.extractor.utils.b) obj;
                return new org.schabi.newpipe.extractor.a(bVar2.y, String.format(this.b, bVar2.e), bVar2.z, bVar2.A);
            case 4:
                return this.b;
            case 5:
                org.schabi.newpipe.extractor.utils.b bVar3 = (org.schabi.newpipe.extractor.utils.b) obj;
                return new org.schabi.newpipe.extractor.a(bVar3.y, this.b.concat(bVar3.e), bVar3.z, bVar3.A);
            default:
                return ((com.grack.nanojson.c) obj).e(this.b);
        }
    }
}
