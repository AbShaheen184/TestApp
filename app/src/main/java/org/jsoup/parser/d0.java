package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final d0 c = new d0(false, false);
    public static final d0 d = new d0(true, true);
    public final boolean a;
    public final boolean b;

    public d0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(org.jsoup.nodes.b bVar) {
        if (this.b) {
            return;
        }
        for (int i = 0; i < bVar.e; i++) {
            String str = bVar.y[i];
            if (!org.jsoup.nodes.b.o(str)) {
                bVar.y[i] = org.jsoup.internal.b.c(str);
            }
        }
    }
}
