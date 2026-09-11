package org.schabi.newpipe.extractor.playlist;

import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.linkhandler.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f {
    @Override // org.schabi.newpipe.extractor.f
    public void C() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public abstract List J();

    @Override // org.schabi.newpipe.extractor.f
    public abstract List O();

    @Override // org.schabi.newpipe.extractor.f
    public abstract String P();

    @Override // org.schabi.newpipe.extractor.f
    public abstract String R();

    public e Y() {
        return (e) ((org.schabi.newpipe.extractor.linkhandler.b) this.b);
    }

    public abstract String a0();

    public abstract long b0();

    public abstract boolean c0();

    @Override // org.schabi.newpipe.extractor.f
    public abstract org.schabi.newpipe.extractor.stream.c h();

    @Override // org.schabi.newpipe.extractor.f
    public abstract List u();

    @Override // org.schabi.newpipe.extractor.f
    public void D() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public void E() {
    }

    public void Z() {
    }
}
