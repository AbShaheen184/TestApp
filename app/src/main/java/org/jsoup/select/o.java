package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {
    public final /* synthetic */ int a;
    public final org.jsoup.helper.k b;

    public /* synthetic */ o(org.jsoup.helper.k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        switch (this.a) {
            case 0:
                return this.b.b(jVar2.d0()).a();
            case 1:
                return this.b.b(jVar2.a0()).a();
            case 2:
                return this.b.b((String) jVar2.B.stream().map(new androidx.media3.exoplayer.audio.f(7)).collect(org.jsoup.internal.k.k(""))).a();
            default:
                jVar2.getClass();
                return this.b.b((String) com.google.android.material.shape.e.j(jVar2, org.jsoup.nodes.o.class).map(new androidx.media3.exoplayer.audio.f(7)).collect(org.jsoup.internal.k.k(""))).a();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(":matches(%s)", this.b);
            case 1:
                return String.format(":matchesOwn(%s)", this.b);
            case 2:
                return String.format(":matchesWholeOwnText(%s)", this.b);
            default:
                return String.format(":matchesWholeText(%s)", this.b);
        }
    }
}
