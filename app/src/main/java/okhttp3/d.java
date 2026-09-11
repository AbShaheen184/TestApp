package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;
import com.google.android.gms.internal.measurement.hb;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String k;
    public static final String l;
    public final s a;
    public final r b;
    public final String c;
    public final z d;
    public final int e;
    public final String f;
    public final r g;
    public final q h;
    public final long i;
    public final long j;

    static {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.e.a.getClass();
        k = "OkHttp-Sent-Millis";
        okhttp3.internal.platform.e.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public d(okio.h0 h0Var) throws IOException {
        s sVarC;
        l0 l0VarE;
        h0Var.getClass();
        try {
            okio.b0 b0Var = new okio.b0(h0Var);
            String strS = b0Var.s(Long.MAX_VALUE);
            try {
                com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
                a0Var.f(null, strS);
                sVarC = a0Var.c();
            } catch (IllegalArgumentException unused) {
                sVarC = null;
            }
            if (sVarC == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strS));
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = sVarC;
            this.c = b0Var.s(Long.MAX_VALUE);
            com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(1);
            int iV = com.google.common.base.c.v(b0Var);
            for (int i = 0; i < iV; i++) {
                mVar.d(b0Var.s(Long.MAX_VALUE));
            }
            this.b = mVar.f();
            androidx.appcompat.widget.x xVarA = com.google.android.material.motion.a.A(b0Var.s(Long.MAX_VALUE));
            this.d = (z) xVarA.z;
            this.e = xVarA.y;
            this.f = (String) xVarA.A;
            com.caverock.androidsvg.m mVar2 = new com.caverock.androidsvg.m(1);
            int iV2 = com.google.common.base.c.v(b0Var);
            for (int i2 = 0; i2 < iV2; i2++) {
                mVar2.d(b0Var.s(Long.MAX_VALUE));
            }
            String str = k;
            String strG = mVar2.g(str);
            String str2 = l;
            String strG2 = mVar2.g(str2);
            mVar2.h(str);
            mVar2.h(str2);
            this.i = strG != null ? Long.parseLong(strG) : 0L;
            this.j = strG2 != null ? Long.parseLong(strG2) : 0L;
            this.g = mVar2.f();
            if (this.a.f()) {
                String strS2 = b0Var.s(Long.MAX_VALUE);
                if (strS2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strS2 + '\"');
                }
                k kVarD = k.b.d(b0Var.s(Long.MAX_VALUE));
                List listA = a(b0Var);
                List listA2 = a(b0Var);
                if (b0Var.a()) {
                    l0VarE = l0.SSL_3_0;
                } else {
                    b bVar = l0.y;
                    String strS3 = b0Var.s(Long.MAX_VALUE);
                    bVar.getClass();
                    l0VarE = b.e(strS3);
                }
                this.h = new q(l0VarE, kVarD, okhttp3.internal.g.j(listA2), new androidx.room.coroutines.d(okhttp3.internal.g.j(listA), 23));
            } else {
                this.h = null;
            }
            h0Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(h0Var, th);
                throw th2;
            }
        }
    }

    public static List a(okio.b0 b0Var) throws IOException {
        int iV = com.google.common.base.c.v(b0Var);
        if (iV == -1) {
            return kotlin.collections.u.e;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iV);
            for (int i = 0; i < iV; i++) {
                String strS = b0Var.s(Long.MAX_VALUE);
                okio.f fVar = new okio.f();
                okio.i iVar = okio.i.A;
                okio.i iVarF = com.google.android.gms.measurement.internal.e0.f(strS);
                if (iVarF == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                fVar.m0(iVarF);
                arrayList.add(certificateFactory.generateCertificate(new hb(fVar, 2)));
            }
            return arrayList;
        } catch (CertificateException e) {
            net.luminis.tls.engine.impl.c.t(e.getMessage());
            return null;
        }
    }

    public static void b(okio.z zVar, List list) throws IOException {
        try {
            zVar.S(list.size());
            zVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                okio.i iVar = okio.i.A;
                encoded.getClass();
                zVar.x(com.google.android.gms.measurement.internal.e0.i(encoded).a());
                zVar.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            net.luminis.tls.engine.impl.c.t(e.getMessage());
        }
    }

    public final void c(b1 b1Var) {
        s sVar = this.a;
        q qVar = this.h;
        r rVar = this.g;
        r rVar2 = this.b;
        okio.z zVar = new okio.z(b1Var.l(0));
        try {
            zVar.x(sVar.i);
            zVar.writeByte(10);
            zVar.x(this.c);
            zVar.writeByte(10);
            zVar.S(rVar2.size());
            zVar.writeByte(10);
            int size = rVar2.size();
            for (int i = 0; i < size; i++) {
                zVar.x(rVar2.c(i));
                zVar.x(": ");
                zVar.x(rVar2.f(i));
                zVar.writeByte(10);
            }
            z zVar2 = this.d;
            int i2 = this.e;
            String str = this.f;
            zVar2.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (zVar2 == z.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            zVar.x(sb.toString());
            zVar.writeByte(10);
            zVar.S(rVar.size() + 2);
            zVar.writeByte(10);
            int size2 = rVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zVar.x(rVar.c(i3));
                zVar.x(": ");
                zVar.x(rVar.f(i3));
                zVar.writeByte(10);
            }
            zVar.x(k);
            zVar.x(": ");
            zVar.S(this.i);
            zVar.writeByte(10);
            zVar.x(l);
            zVar.x(": ");
            zVar.S(this.j);
            zVar.writeByte(10);
            if (sVar.f()) {
                zVar.writeByte(10);
                qVar.getClass();
                zVar.x(qVar.b.a);
                zVar.writeByte(10);
                b(zVar, qVar.a());
                b(zVar, qVar.c);
                zVar.x(qVar.a.e);
                zVar.writeByte(10);
            }
            zVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(zVar, th);
                throw th2;
            }
        }
    }

    public d(g0 g0Var) {
        r rVarF;
        b0 b0Var = g0Var.e;
        this.a = b0Var.a;
        g0 g0Var2 = g0Var.F;
        g0Var2.getClass();
        r rVar = g0Var2.e.c;
        r rVar2 = g0Var.C;
        Set setX = com.google.common.base.c.x(rVar2);
        if (setX.isEmpty()) {
            rVarF = r.y;
        } else {
            com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(1);
            int size = rVar.size();
            for (int i = 0; i < size; i++) {
                String strC = rVar.c(i);
                if (setX.contains(strC)) {
                    mVar.b(strC, rVar.f(i));
                }
            }
            rVarF = mVar.f();
        }
        this.b = rVarF;
        this.c = b0Var.b;
        this.d = g0Var.y;
        this.e = g0Var.A;
        this.f = g0Var.z;
        this.g = rVar2;
        this.h = g0Var.B;
        this.i = g0Var.I;
        this.j = g0Var.J;
    }
}
