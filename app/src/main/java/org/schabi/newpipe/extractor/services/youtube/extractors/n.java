package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.google.common.util.concurrent.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ p g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.grack.nanojson.c cVar, g0 g0Var, boolean z, p pVar) {
        super(cVar, g0Var);
        this.f = z;
        this.g = pVar;
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.a0, org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return this.f ? this.g.R() : super.b();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.a0, org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return this.f ? this.g.P() : super.e();
    }
}
