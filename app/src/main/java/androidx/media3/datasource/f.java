package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.util.j0;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public l B;
    public byte[] C;
    public int D;
    public int E;

    @Override // androidx.media3.datasource.h
    public final void close() {
        if (this.C != null) {
            this.C = null;
            g();
        }
        this.B = null;
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.E;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.C;
        String str = j0.a;
        System.arraycopy(bArr2, this.D, bArr, i, iMin);
        this.D += iMin;
        this.E -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws androidx.media3.common.j0, i {
        l();
        this.B = lVar;
        Uri uri = lVar.a;
        long j = lVar.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        com.google.android.material.motion.a.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = j0.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new androidx.media3.common.j0("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.C = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new androidx.media3.common.j0(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.C = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = lVar.f;
        byte[] bArr = this.C;
        if (j2 > bArr.length) {
            this.C = null;
            throw new i(2008);
        }
        int i = (int) j2;
        this.D = i;
        int length = bArr.length - i;
        this.E = length;
        if (j != -1) {
            this.E = (int) Math.min(length, j);
        }
        m(lVar);
        return j != -1 ? j : this.E;
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        l lVar = this.B;
        if (lVar != null) {
            return lVar.a;
        }
        return null;
    }
}
