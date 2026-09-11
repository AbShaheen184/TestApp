package org.schabi.newpipe.extractor.services.media_ccc.linkHandler;

import java.util.List;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.linkhandler.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a b = new a();

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String B(String str, List list) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://media.ccc.de/c/", str);
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, com.google.common.base.b
    public final String l(String str) {
        return org.schabi.newpipe.extractor.utils.a.i("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", 1, str);
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        try {
            return l(str) != null;
        } catch (f unused) {
        }
    }
}
