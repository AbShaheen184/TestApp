package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.e;
import org.schabi.newpipe.extractor.exceptions.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.common.base.b {
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9_-]{11})");
    public static final c c = new c();
    public static final List d;

    static {
        Object[] objArr = {"embed/", "live/", "shorts/", "watch/", "v/", "w/"};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        d = Collections.unmodifiableList(arrayList);
    }

    public static String y(String str) throws f {
        String strGroup = null;
        if (str != null) {
            Matcher matcher = b.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        if (strGroup != null) {
            return strGroup;
        }
        org.mozilla.javascript.typedarrays.c.b("The given string is not a YouTube video ID");
        return null;
    }

    public static String z(String str) {
        for (String str2 : d) {
            if (str.startsWith(str2)) {
                return y(str.substring(str2.length()));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r1.getHost().equalsIgnoreCase("y2u.be") == false) goto L233;
     */
    @Override // com.google.common.base.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(java.lang.String r11) throws org.schabi.newpipe.extractor.exceptions.f {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.schabi.newpipe.extractor.services.youtube.linkHandler.c.l(java.lang.String):java.lang.String");
    }

    @Override // com.google.common.base.b
    public final String m(String str) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.youtube.com/watch?v=", str);
    }

    @Override // com.google.common.base.b
    public final boolean r(String str) throws e {
        try {
            l(str);
            return true;
        } catch (e e) {
            throw e;
        } catch (f unused) {
            return false;
        }
    }
}
