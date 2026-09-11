package org.schabi.newpipe.extractor.linkhandler;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public final List A;

    public b(a aVar) {
        this(aVar.e, aVar.y, aVar.z, Collections.EMPTY_LIST, "");
    }

    public b(String str, String str2, String str3, List list, String str4) {
        super(str, str2, str3);
        this.A = Collections.unmodifiableList(list);
    }
}
