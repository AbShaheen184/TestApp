package com.app.mlounge.ui.navigation;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final List f = com.google.common.base.c.q(p.g, k.g, u.g, i.g, c.g, l.g, g.g, a.g, v.g, e.g, h.g, q.g, r.g);
    public final String a;
    public final String b;
    public final androidx.compose.ui.graphics.vector.f c;
    public final androidx.compose.ui.graphics.vector.f d;
    public final boolean e;

    public w(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.graphics.vector.f fVar2, int i) {
        fVar2 = (i & 8) != 0 ? fVar : fVar2;
        boolean z = (i & 32) == 0;
        this.a = str;
        this.b = str2;
        this.c = fVar;
        this.d = fVar2;
        this.e = z;
    }
}
