package org.jsoup.select;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends p {
    public final p a;
    public boolean b;
    public final org.jsoup.internal.f c = new org.jsoup.internal.f(new org.jsoup.internal.c(7), 2);

    public c0(p pVar) {
        this.a = pVar;
        this.b = pVar.f();
    }

    @Override // org.jsoup.select.p
    public boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        return g(jVar, jVar2);
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        return g(jVar, nVar);
    }

    @Override // org.jsoup.select.p
    public void e() {
        this.c.remove();
        this.a.e();
    }

    @Override // org.jsoup.select.p
    public final boolean f() {
        return this.b;
    }

    public abstract boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar);

    public final boolean h(final org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        return ((Boolean) ((Map) ((Map) this.c.get()).computeIfAbsent(jVar, new androidx.media3.exoplayer.audio.f(11))).computeIfAbsent(oVar, new Function() { // from class: org.jsoup.select.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.a.d(jVar, (org.jsoup.nodes.o) obj));
            }
        })).booleanValue();
    }
}
