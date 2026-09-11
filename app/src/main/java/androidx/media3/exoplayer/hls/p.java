package androidx.media3.exoplayer.hls;

import androidx.media3.common.i0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h0 {
    public static final androidx.media3.common.r f;
    public static final androidx.media3.common.r g;
    public final h0 a;
    public final androidx.media3.common.r b;
    public androidx.media3.common.r c;
    public byte[] d;
    public int e;

    static {
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = i0.p("application/id3");
        f = new androidx.media3.common.r(qVar);
        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
        qVar2.n = i0.p("application/x-emsg");
        g = new androidx.media3.common.r(qVar2);
    }

    public p(h0 h0Var, int i) {
        this.a = h0Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // androidx.media3.extractor.h0
    public final void b(w wVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        wVar.k(this.d, this.e, i);
        this.e += i;
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = iVar.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
        this.c = rVar;
        this.a.e(this.b);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        w wVar = new w(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.o;
        androidx.media3.common.r rVar = this.b;
        String str2 = rVar.o;
        String str3 = rVar.o;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.o)) {
                androidx.media3.common.util.c.t("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.o);
                return;
            }
            androidx.media3.extractor.metadata.emsg.a aVarG = androidx.media3.extractor.metadata.dvbsi.b.G(wVar);
            androidx.media3.common.r rVarA = aVarG.a();
            if (rVarA == null || !Objects.equals(str3, rVarA.o)) {
                androidx.media3.common.util.c.t("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarG.a());
                return;
            }
            byte[] bArrC = aVarG.c();
            bArrC.getClass();
            wVar = new w(bArrC);
        }
        int iA = wVar.a();
        h0 h0Var = this.a;
        h0Var.f(iA, wVar);
        h0Var.g(j, i, iA, 0, g0Var);
    }
}
