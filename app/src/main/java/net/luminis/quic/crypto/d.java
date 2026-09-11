package net.luminis.quic.crypto;

import androidx.media3.exoplayer.dash.manifest.t;
import j$.nio.file.Files;
import j$.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.ArrayList;
import net.luminis.quic.impl.n;
import net.luminis.quic.impl.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final byte[] k = {-81, -65, -20, 40, -103, -109, -46, 76, -98, -105, -122, -15, -100, 97, 17, -32, 67, -112, -88, -103};
    public static final byte[] l = {56, 118, 44, -9, -11, 89, 52, -77, 77, 23, -102, -26, -92, -56, 12, -83, -52, -69, 127, 10};
    public static final byte[] m = {13, -19, -29, -34, -9, 0, -90, -37, -127, -109, -127, -66, 110, 38, -99, -53, -7, -67, 46, -39};
    public net.luminis.tls.c a;
    public final o b;
    public final net.luminis.quic.log.a d;
    public byte[] e;
    public boolean h;
    public byte[] i;
    public final a[] f = new a[androidx.constraintlayout.core.g.f(4).length];
    public final a[] g = new a[androidx.constraintlayout.core.g.f(4).length];
    public final boolean[] j = new boolean[androidx.constraintlayout.core.g.f(4).length];
    public final int c = 1;

    public d(o oVar, net.luminis.quic.log.a aVar) {
        this.b = oVar;
        this.d = aVar;
    }

    public final void a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("CLIENT_", str, " ");
        sbX.append(com.google.common.base.b.b(this.e));
        sbX.append(" ");
        sbX.append(com.google.common.base.b.b(this.f[androidx.constraintlayout.core.g.e(i)].c));
        arrayList.add(sbX.toString());
        arrayList.add("SERVER_" + str + " " + com.google.common.base.b.b(this.e) + " " + com.google.common.base.b.b(this.g[androidx.constraintlayout.core.g.e(i)].c));
        try {
            Files.write(null, arrayList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            this.d.f("Writing secrets to file 'null' failed", e);
            this.h = false;
        }
    }

    public final synchronized void b(byte[] bArr) {
        byte[] bArr2;
        this.i = bArr;
        n nVar = this.b.a;
        t tVarI = t.I();
        if (nVar.a == 1) {
            bArr2 = l;
        } else {
            bArr2 = nVar.b() ? m : k;
        }
        byte[] bArrH = tVarI.H(bArr2, this.i);
        this.d.getClass();
        this.f[0] = new a(nVar, bArrH, 1, this.d);
        this.g[0] = new a(nVar, bArrH, 2, this.d);
    }

    public final void c(int i, net.luminis.tls.c cVar, n nVar) {
        a aVar;
        a aVar2;
        if (cVar == net.luminis.tls.c.TLS_AES_128_GCM_SHA256) {
            aVar = new a(nVar, 1, this.d, 0);
            aVar2 = new a(nVar, 2, this.d, 0);
        } else if (cVar == net.luminis.tls.c.TLS_AES_256_GCM_SHA384) {
            aVar = new b(nVar, 1, this.d, 0);
            aVar2 = new b(nVar, 2, this.d, 0);
        } else if (cVar != net.luminis.tls.c.TLS_CHACHA20_POLY1305_SHA256) {
            com.google.gson.b.m(cVar, "unsupported cipher suite ");
            return;
        } else {
            aVar = new a(nVar, 1, this.d, 1);
            aVar2 = new a(nVar, 2, this.d, 1);
        }
        this.f[androidx.constraintlayout.core.g.e(i)] = aVar;
        if (i != 2) {
            this.g[androidx.constraintlayout.core.g.e(i)] = aVar2;
        }
        aVar.p = aVar2;
        aVar2.p = aVar;
    }

    public final synchronized a d(int i) {
        a aVar;
        try {
            aVar = this.c == 1 ? this.f[androidx.constraintlayout.core.g.e(i)] : this.g[androidx.constraintlayout.core.g.e(i)];
            if (aVar == null) {
                throw new g(i, this.j[androidx.constraintlayout.core.g.e(i)]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public final synchronized a e(int i) {
        a aVar;
        try {
            aVar = this.c == 1 ? this.g[androidx.constraintlayout.core.g.e(i)] : this.f[androidx.constraintlayout.core.g.e(i)];
            if (aVar == null) {
                throw new g(i, this.j[androidx.constraintlayout.core.g.e(i)]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }
}
