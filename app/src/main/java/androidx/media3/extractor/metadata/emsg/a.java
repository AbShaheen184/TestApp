package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {
    public static final r g;
    public static final r h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        q qVar = new q();
        qVar.n = i0.p("application/id3");
        g = new r(qVar);
        q qVar2 = new q();
        qVar2.n = i0.p("application/x-scte35");
        h = new r(qVar2);
    }

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // androidx.media3.common.g0
    public final r a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // androidx.media3.common.g0
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && this.d == aVar.d && Objects.equals(this.a, aVar.a) && this.b.equals(aVar.b) && Arrays.equals(this.e, aVar.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
            long j = this.c;
            int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
