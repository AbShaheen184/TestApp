package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public final TextClassification b;
    public final int c;

    public h(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.c, ')');
    }
}
