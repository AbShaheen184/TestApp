package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {
    public final int a;
    public final String b;

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.b, ")");
    }
}
