package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.e0;
import androidx.media3.common.g0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        String str = this.b;
        if (str != null) {
            e0Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.a.length, "\"", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
