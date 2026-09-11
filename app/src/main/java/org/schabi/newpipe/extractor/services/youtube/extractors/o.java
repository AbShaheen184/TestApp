package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.google.common.util.concurrent.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.grack.nanojson.c cVar, g0 g0Var, boolean z, p pVar) {
        super(cVar, g0Var);
        this.i = z;
        this.j = pVar;
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0, org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return this.i ? this.j.R() : super.b();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0, org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return this.i ? this.j.P() : super.e();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0
    public final boolean v() {
        return this.i;
    }
}
