package androidx.compose.foundation.text.contextmenu.data;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final String b;
    public final int c;
    public final l d;

    public d(Object obj, String str, int i, l lVar) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = lVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.c, ')');
    }
}
