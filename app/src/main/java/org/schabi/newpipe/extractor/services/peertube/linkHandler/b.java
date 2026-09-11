package org.schabi.newpipe.extractor.services.peertube.linkHandler;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import java.net.MalformedURLException;
import java.net.URL;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.common.base.b {
    public static final b b = new b();

    @Override // com.google.common.base.b
    public final String l(String str) {
        return org.schabi.newpipe.extractor.utils.a.i("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", 4, str);
    }

    @Override // com.google.common.base.b
    public final String m(String str) {
        l.c.A.getClass();
        return n(str, "https://framatube.org");
    }

    @Override // com.google.common.base.b
    public final String n(String str, String str2) {
        return c.i(str2, "/videos/watch/", str);
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) {
        if (str.contains("/playlist/")) {
            return false;
        }
        try {
            new URL(str);
            l(str);
            return true;
        } catch (MalformedURLException | f unused) {
            return false;
        }
    }
}
