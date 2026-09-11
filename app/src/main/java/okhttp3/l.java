package okhttp3;

import androidx.appcompat.widget.a2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final l e;
    public static final l f;
    public static final l g;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        k kVar = k.r;
        k kVar2 = k.s;
        k kVar3 = k.t;
        k kVar4 = k.l;
        k kVar5 = k.n;
        k kVar6 = k.m;
        k kVar7 = k.o;
        k kVar8 = k.q;
        k kVar9 = k.p;
        List listQ = com.google.common.base.c.q(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
        List listQ2 = com.google.common.base.c.q(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, k.j, k.k, k.h, k.i, k.f, k.g, k.e);
        a2 a2Var = new a2();
        k[] kVarArr = (k[]) listQ.toArray(new k[0]);
        a2Var.b((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        l0 l0Var = l0.TLS_1_3;
        l0 l0Var2 = l0.TLS_1_2;
        a2Var.c(l0Var, l0Var2);
        a2Var.b = true;
        a2Var.a();
        a2 a2Var2 = new a2();
        k[] kVarArr2 = (k[]) listQ2.toArray(new k[0]);
        a2Var2.b((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        a2Var2.c(l0Var, l0Var2);
        a2Var2.b = true;
        e = a2Var2.a();
        a2 a2Var3 = new a2();
        k[] kVarArr3 = (k[]) listQ2.toArray(new k[0]);
        a2Var3.b((k[]) Arrays.copyOf(kVarArr3, kVarArr3.length));
        a2Var3.c(l0Var, l0Var2, l0.TLS_1_1, l0.TLS_1_0);
        a2Var3.b = true;
        f = a2Var3.a();
        g = new l(false, false, null, null);
    }

    public l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = okhttp3.internal.e.l(strArr, enabledCipherSuites, k.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = okhttp3.internal.e.l(enabledProtocols2, strArr2, kotlin.comparisons.a.y);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        j jVar = k.c;
        byte[] bArr = okhttp3.internal.e.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (jVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            net.luminis.tls.engine.impl.c.o("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            net.luminis.tls.engine.impl.c.o("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            net.luminis.tls.engine.impl.c.o("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            net.luminis.tls.engine.impl.c.o("At least one TLS version is required");
            return;
        }
        l lVar = new l(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (lVar.c() != null) {
            sSLSocket.setEnabledProtocols(lVar.d);
        }
        if (lVar.b() != null) {
            sSLSocket.setEnabledCipherSuites(lVar.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k.b.d(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            l0.y.getClass();
            arrayList.add(b.e(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z = lVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, lVar.c) && Arrays.equals(this.d, lVar.d) && this.b == lVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
