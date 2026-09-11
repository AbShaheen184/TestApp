package org.schabi.newpipe.extractor.linkhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.schabi.newpipe.extractor.exceptions.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends com.google.common.base.b {
    public String A(String str, String str2, List list) {
        return B(str, list);
    }

    public abstract String B(String str, List list);

    @Override // com.google.common.base.b
    public final a j(String str, String str2) {
        Objects.requireNonNull(str, "URL may not be null");
        return new b(super.j(str, str2));
    }

    @Override // com.google.common.base.b
    public String l(String str) {
        return m(str);
    }

    @Override // com.google.common.base.b
    public final String m(String str) {
        return B(str, new ArrayList(0));
    }

    @Override // com.google.common.base.b
    public final String n(String str, String str2) {
        return A(str, str2, new ArrayList(0));
    }

    public final b y(String str, String str2) {
        String strN = n(str, str2);
        return new b(new a(strN, strN, str));
    }

    @Override // com.google.common.base.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b i(String str) throws f {
        String strB = org.schabi.newpipe.extractor.utils.f.b(str);
        String strC = org.schabi.newpipe.extractor.utils.f.c(strB);
        Objects.requireNonNull(strB, "URL may not be null");
        return new b(super.j(strB, strC));
    }
}
