package org.schabi.newpipe.extractor.services.peertube;

import androidx.core.view.w0;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.linkhandler.c;
import org.schabi.newpipe.extractor.services.peertube.extractors.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w0 {
    public a A;

    @Override // androidx.core.view.w0
    public final c b() {
        return org.schabi.newpipe.extractor.services.peertube.linkHandler.a.c;
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.playlist.a d(org.schabi.newpipe.extractor.linkhandler.b bVar) {
        return new org.schabi.newpipe.extractor.services.peertube.extractors.b(this, bVar, 0);
    }

    @Override // androidx.core.view.w0
    public final c e() {
        return org.schabi.newpipe.extractor.services.peertube.linkHandler.a.d;
    }

    @Override // androidx.core.view.w0
    public final f f(org.schabi.newpipe.extractor.linkhandler.a aVar) {
        return new e(this, aVar);
    }

    @Override // androidx.core.view.w0
    public final com.google.common.base.b g() {
        return org.schabi.newpipe.extractor.services.peertube.linkHandler.b.b;
    }
}
