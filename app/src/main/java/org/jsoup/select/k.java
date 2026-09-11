package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p {
    public final int a;
    public final /* synthetic */ int b;

    public k(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        switch (this.b) {
            case 0:
                return jVar2.S() == this.a;
            case 1:
                return jVar2.S() > this.a;
            default:
                return jVar != jVar2 && jVar2.S() < this.a;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(this.a));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(this.a));
            default:
                return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }
}
