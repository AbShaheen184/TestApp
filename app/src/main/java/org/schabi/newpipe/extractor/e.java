package org.schabi.newpipe.extractor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e d;
    public final List a;
    public final k b;
    public final List c;

    static {
        List list = Collections.EMPTY_LIST;
        d = new e(list, null, list);
    }

    public e(androidx.emoji2.text.g gVar, k kVar) {
        this(Collections.unmodifiableList((ArrayList) gVar.b), kVar, gVar.n());
    }

    public e(List list, k kVar, List list2) {
        this.a = list;
        this.b = kVar;
        this.c = list2;
    }
}
