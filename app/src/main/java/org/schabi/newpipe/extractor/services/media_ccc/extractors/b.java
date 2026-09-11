package org.schabi.newpipe.extractor.services.media_ccc.extractors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.utils.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Pattern a = Pattern.compile("\\w+/\\w+");
    public static com.grack.nanojson.b b = null;

    public static List a(String str) {
        if (f.h(str)) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {new org.schabi.newpipe.extractor.a(-1, str, -1, 4)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj, arrayList, obj, arrayList);
    }

    public static List b(com.grack.nanojson.c cVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        String strF = cVar.f(str, null);
        if (!f.h(strF)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, strF, -1, 2));
        }
        String strF2 = cVar.f(str2, null);
        if (!f.h(strF2)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, strF2, -1, 1));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
