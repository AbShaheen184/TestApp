package org.jsoup.select;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ org.jsoup.nodes.j c;

    public /* synthetic */ f(p pVar, org.jsoup.nodes.j jVar, int i) {
        this.a = i;
        this.b = pVar;
        this.c = jVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.d(this.c, (org.jsoup.nodes.o) obj);
            default:
                return this.b.b(this.c, (org.jsoup.nodes.j) obj);
        }
    }
}
