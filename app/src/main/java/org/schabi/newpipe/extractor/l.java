package org.schabi.newpipe.extractor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final org.schabi.newpipe.extractor.services.youtube.j a;
    public static final org.schabi.newpipe.extractor.services.bandcamp.a b;
    public static final org.schabi.newpipe.extractor.services.peertube.b c;

    static {
        m mVar = m.e;
        m mVar2 = m.y;
        m mVar3 = m.z;
        m mVar4 = m.A;
        EnumSet.of(mVar, mVar2, mVar3, mVar4);
        org.schabi.newpipe.extractor.services.youtube.j jVar = new org.schabi.newpipe.extractor.services.youtube.j(0, "YouTube");
        a = jVar;
        EnumSet.of(mVar, mVar4);
        int i = 1;
        org.schabi.newpipe.extractor.services.bandcamp.a aVar = new org.schabi.newpipe.extractor.services.bandcamp.a(i, 2, "SoundCloud");
        b = aVar;
        EnumSet.of(mVar, mVar2);
        org.schabi.newpipe.extractor.services.bandcamp.a aVar2 = new org.schabi.newpipe.extractor.services.bandcamp.a(2, i, "media.ccc.de");
        EnumSet.of(mVar2, mVar4);
        org.schabi.newpipe.extractor.services.peertube.b bVar = new org.schabi.newpipe.extractor.services.peertube.b(3, "PeerTube");
        bVar.A = org.schabi.newpipe.extractor.services.peertube.a.a;
        c = bVar;
        EnumSet.of(mVar, mVar4);
        Object[] objArr = {jVar, aVar, aVar2, bVar, new org.schabi.newpipe.extractor.services.bandcamp.a(4, 0, "Bandcamp")};
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }
}
