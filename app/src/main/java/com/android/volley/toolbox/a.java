package com.android.volley.toolbox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public long a;
    public final String b;

    public a(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        "".equals(str2);
    }

    public static a a(b bVar) throws IOException {
        if (androidx.compose.ui.input.pointer.util.b.e(bVar) != 538247942) {
            throw new IOException();
        }
        String strG = androidx.compose.ui.input.pointer.util.b.g(bVar);
        String strG2 = androidx.compose.ui.input.pointer.util.b.g(bVar);
        long jF = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF2 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF3 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF4 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        int iE = androidx.compose.ui.input.pointer.util.b.e(bVar);
        if (iE < 0) {
            net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iE, "readHeaderList size="));
            return null;
        }
        List arrayList = iE == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iE; i++) {
            arrayList.add(new com.android.volley.b(androidx.compose.ui.input.pointer.util.b.g(bVar).intern(), androidx.compose.ui.input.pointer.util.b.g(bVar).intern()));
        }
        return new a(strG, strG2, jF, jF2, jF3, jF4, arrayList);
    }
}
