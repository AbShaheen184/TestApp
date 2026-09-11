package org.schabi.newpipe.extractor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.emoji2.text.g {
    public final org.schabi.newpipe.extractor.channel.d d;
    public final org.schabi.newpipe.extractor.channel.d e;
    public final org.schabi.newpipe.extractor.channel.d f;

    public j(int i) {
        super(i);
        this.d = new org.schabi.newpipe.extractor.channel.d(i, 2);
        this.e = new org.schabi.newpipe.extractor.channel.d(i, 0);
        this.f = new org.schabi.newpipe.extractor.channel.d(i, 1);
    }

    @Override // androidx.emoji2.text.g
    public final Object f(d dVar) {
        if (dVar instanceof org.schabi.newpipe.extractor.stream.h) {
            return this.d.D((org.schabi.newpipe.extractor.stream.h) dVar);
        }
        if (dVar instanceof org.schabi.newpipe.extractor.channel.c) {
            return this.e.B((org.schabi.newpipe.extractor.channel.c) dVar);
        }
        if (dVar instanceof org.schabi.newpipe.extractor.playlist.d) {
            return this.f.C((org.schabi.newpipe.extractor.playlist.d) dVar);
        }
        com.google.gson.b.g(dVar, "Invalid extractor type: ");
        return null;
    }

    @Override // androidx.emoji2.text.g
    public final List n() {
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList((ArrayList) this.c));
        arrayList.addAll(Collections.unmodifiableList((ArrayList) this.d.c));
        arrayList.addAll(Collections.unmodifiableList((ArrayList) this.e.c));
        arrayList.addAll(Collections.unmodifiableList((ArrayList) this.f.c));
        return Collections.unmodifiableList(arrayList);
    }
}
