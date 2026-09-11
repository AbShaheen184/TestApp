package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {
    public final String b;
    public final byte[] c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.b.equals(mVar.b) && Arrays.equals(this.c, mVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.e(527, 31, this.b);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
