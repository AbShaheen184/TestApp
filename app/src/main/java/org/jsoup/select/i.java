package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public i(String str, String str2, int i) {
        this.c = i;
        org.jsoup.helper.n.E(str);
        this.a = org.jsoup.internal.b.d(str);
        if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
            org.jsoup.helper.n.B("Quoted value must have content", str2.length() > 1);
            str2 = str2.substring(1, str2.length() - 1);
        }
        this.b = org.jsoup.internal.b.c(str2);
    }

    @Override // org.jsoup.select.p
    public final int a() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        switch (this.c) {
            case 0:
                String str = this.a;
                return jVar2.q(str) && this.b.equalsIgnoreCase(jVar2.d(str));
            case 1:
                String str2 = this.a;
                return jVar2.q(str2) && org.jsoup.internal.b.c(jVar2.d(str2)).contains(this.b);
            case 2:
                String str3 = this.a;
                return jVar2.q(str3) && org.jsoup.internal.b.c(jVar2.d(str3)).endsWith(this.b);
            case 3:
                return !this.b.equalsIgnoreCase(jVar2.d(this.a));
            default:
                String str4 = this.a;
                return jVar2.q(str4) && org.jsoup.internal.b.c(jVar2.d(str4)).startsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "=", this.b, "]");
            case 1:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "*=", this.b, "]");
            case 2:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "$=", this.b, "]");
            case 3:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "!=", this.b, "]");
            default:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "^=", this.b, "]");
        }
    }
}
