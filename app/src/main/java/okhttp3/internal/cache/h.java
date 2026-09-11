package okhttp3.internal.cache;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.l;
import kotlin.text.r;
import okio.b0;
import okio.f0;
import okio.h0;
import okio.k;
import okio.x;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable, Flushable {
    public static final kotlin.text.i Q = new kotlin.text.i("[a-z0-9_-]{1,120}");
    public static final String R = "CLEAN";
    public static final String S = "DIRTY";
    public static final String T = "REMOVE";
    public static final String U = "READ";
    public final x A;
    public final x B;
    public final x C;
    public long D;
    public z E;
    public final LinkedHashMap F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public long N;
    public final okhttp3.internal.concurrent.c O;
    public final f P;
    public final x e;
    public final g y;
    public final long z;

    public h(k kVar, x xVar, okhttp3.internal.concurrent.d dVar) {
        kVar.getClass();
        dVar.getClass();
        this.e = xVar;
        this.y = new g(kVar);
        this.z = 104857600L;
        this.F = new LinkedHashMap(0, 0.75f, true);
        this.O = dVar.d();
        this.P = new f(this, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), okhttp3.internal.g.b, " Cache"), 0);
        this.A = xVar.g("journal");
        this.B = xVar.g("journal.tmp");
        this.C = xVar.g("journal.bkp");
    }

    public static void c0(String str) {
        if (Q.e(str)) {
            return;
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final boolean L() {
        int i = this.G;
        return i >= 2000 && i >= this.F.size();
    }

    public final void N() {
        x xVar = this.B;
        g gVar = this.y;
        okhttp3.internal.e.d(gVar, xVar);
        Iterator it = this.F.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            d dVar = (d) next;
            int i = 0;
            if (dVar.g == null) {
                while (i < 2) {
                    this.D += dVar.b[i];
                    i++;
                }
            } else {
                dVar.g = null;
                while (i < 2) {
                    okhttp3.internal.e.d(gVar, (x) dVar.c.get(i));
                    okhttp3.internal.e.d(gVar, (x) dVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void X() throws Throwable {
        g gVar = this.y;
        x xVar = this.A;
        h0 h0VarC0 = gVar.c0(xVar);
        h0VarC0.getClass();
        b0 b0Var = new b0(h0VarC0);
        try {
            String strS = b0Var.s(Long.MAX_VALUE);
            String strS2 = b0Var.s(Long.MAX_VALUE);
            String strS3 = b0Var.s(Long.MAX_VALUE);
            String strS4 = b0Var.s(Long.MAX_VALUE);
            String strS5 = b0Var.s(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strS) || !"1".equals(strS2) || !l.a(String.valueOf(201105), strS3) || !l.a(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    Y(b0Var.s(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.G = i - this.F.size();
                    if (b0Var.a()) {
                        z zVar = this.E;
                        if (zVar != null) {
                            okhttp3.internal.e.b(zVar);
                        }
                        gVar.getClass();
                        xVar.getClass();
                        this.E = new z(new i(gVar.a(xVar), new androidx.compose.ui.text.font.e(this, 28)));
                    } else {
                        Z();
                    }
                    try {
                        b0Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                b0Var.close();
            } catch (Throwable th3) {
                kotlin.a.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void Y(String str) throws IOException {
        String strSubstring;
        int iA0 = kotlin.text.k.a0(str, ' ', 0, 6);
        if (iA0 == -1) {
            net.luminis.tls.engine.impl.c.t("unexpected journal line: ".concat(str));
            return;
        }
        int i = iA0 + 1;
        int iA1 = kotlin.text.k.a0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.F;
        if (iA1 == -1) {
            strSubstring = str.substring(i);
            String str2 = T;
            if (iA0 == str2.length() && r.O(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iA1);
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iA1 != -1) {
            String str3 = R;
            if (iA0 == str3.length() && r.O(str, str3, false)) {
                List listO0 = kotlin.text.k.o0(str.substring(iA1 + 1), new char[]{' '});
                dVar.e = true;
                dVar.g = null;
                int size = listO0.size();
                dVar.j.getClass();
                if (size != 2) {
                    net.luminis.tls.engine.impl.c.u(listO0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listO0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dVar.b[i2] = Long.parseLong((String) listO0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    net.luminis.tls.engine.impl.c.u(listO0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iA1 == -1) {
            String str4 = S;
            if (iA0 == str4.length() && r.O(str, str4, false)) {
                dVar.g = new b1(this, dVar);
                return;
            }
        }
        if (iA1 == -1) {
            String str5 = U;
            if (iA0 == str5.length() && r.O(str, str5, false)) {
                return;
            }
        }
        net.luminis.tls.engine.impl.c.t("unexpected journal line: ".concat(str));
    }

    public final synchronized void Z() {
        Throwable th;
        try {
            z zVar = this.E;
            if (zVar != null) {
                zVar.close();
            }
            z zVarB = okio.b.b(this.y.b0(this.B, false));
            try {
                zVarB.x("libcore.io.DiskLruCache");
                zVarB.writeByte(10);
                zVarB.x("1");
                zVarB.writeByte(10);
                zVarB.S(201105);
                zVarB.writeByte(10);
                zVarB.S(2);
                zVarB.writeByte(10);
                zVarB.writeByte(10);
                for (Object obj : this.F.values()) {
                    obj.getClass();
                    d dVar = (d) obj;
                    if (dVar.g != null) {
                        zVarB.x(S);
                        zVarB.writeByte(32);
                        zVarB.x(dVar.a);
                        zVarB.writeByte(10);
                    } else {
                        zVarB.x(R);
                        zVarB.writeByte(32);
                        zVarB.x(dVar.a);
                        for (long j : dVar.b) {
                            zVarB.writeByte(32);
                            zVarB.S(j);
                        }
                        zVarB.writeByte(10);
                    }
                }
                try {
                    zVarB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    zVarB.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zN = this.y.N(this.A);
            g gVar = this.y;
            if (zN) {
                gVar.g(this.A, this.C);
                this.y.g(this.B, this.A);
                okhttp3.internal.e.d(this.y, this.C);
            } else {
                gVar.g(this.B, this.A);
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                okhttp3.internal.e.b(zVar2);
            }
            g gVar2 = this.y;
            x xVar = this.A;
            gVar2.getClass();
            xVar.getClass();
            this.E = new z(new i(gVar2.a(xVar), new androidx.compose.ui.text.font.e(this, 28)));
            this.H = false;
            this.M = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized void a() {
        if (this.K) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void a0(d dVar) {
        z zVar;
        String str = dVar.a;
        if (!this.I) {
            if (dVar.h > 0 && (zVar = this.E) != null) {
                zVar.x(S);
                zVar.writeByte(32);
                zVar.x(str);
                zVar.writeByte(10);
                zVar.flush();
            }
            if (dVar.h > 0 || dVar.g != null) {
                dVar.f = true;
                return;
            }
        }
        b1 b1Var = dVar.g;
        if (b1Var != null) {
            b1Var.f();
        }
        for (int i = 0; i < 2; i++) {
            okhttp3.internal.e.d(this.y, (x) dVar.c.get(i));
            long j = this.D;
            long[] jArr = dVar.b;
            this.D = j - jArr[i];
            jArr[i] = 0;
        }
        this.G++;
        z zVar2 = this.E;
        if (zVar2 != null) {
            zVar2.x(T);
            zVar2.writeByte(32);
            zVar2.x(str);
            zVar2.writeByte(10);
        }
        this.F.remove(str);
        if (L()) {
            this.O.d(this.P, 0L);
        }
    }

    public final void b0() {
        while (this.D > this.z) {
            for (Object obj : this.F.values()) {
                obj.getClass();
                d dVar = (d) obj;
                if (!dVar.f) {
                    a0(dVar);
                }
            }
            return;
        }
        this.L = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.J && !this.K) {
                Collection collectionValues = this.F.values();
                collectionValues.getClass();
                for (d dVar : (d[]) collectionValues.toArray(new d[0])) {
                    dVar.getClass();
                    b1 b1Var = dVar.g;
                    if (b1Var != null) {
                        b1Var.f();
                    }
                }
                b0();
                z zVar = this.E;
                if (zVar != null) {
                    okhttp3.internal.e.b(zVar);
                }
                this.E = null;
                this.K = true;
                return;
            }
            this.K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.J) {
            a();
            b0();
            z zVar = this.E;
            zVar.getClass();
            zVar.flush();
        }
    }

    public final synchronized void g(b1 b1Var, boolean z) {
        d dVar = (d) b1Var.y;
        if (!l.a(dVar.g, b1Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !dVar.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) b1Var.z;
                zArr.getClass();
                if (!zArr[i]) {
                    b1Var.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.y.N((x) dVar.d.get(i))) {
                    b1Var.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            x xVar = (x) dVar.d.get(i2);
            if (!z || dVar.f) {
                okhttp3.internal.e.d(this.y, xVar);
            } else if (this.y.N(xVar)) {
                x xVar2 = (x) dVar.c.get(i2);
                this.y.g(xVar, xVar2);
                long j = dVar.b[i2];
                Long l = (Long) this.y.Y(xVar2).e;
                long jLongValue = l != null ? l.longValue() : 0L;
                dVar.b[i2] = jLongValue;
                this.D = (this.D - j) + jLongValue;
            }
        }
        dVar.g = null;
        if (dVar.f) {
            a0(dVar);
            return;
        }
        this.G++;
        z zVar = this.E;
        zVar.getClass();
        if (dVar.e || z) {
            dVar.e = true;
            zVar.x(R);
            zVar.writeByte(32);
            zVar.x(dVar.a);
            for (long j2 : dVar.b) {
                zVar.writeByte(32);
                zVar.S(j2);
            }
            zVar.writeByte(10);
            if (z) {
                long j3 = this.N;
                this.N = 1 + j3;
                dVar.i = j3;
            }
        } else {
            this.F.remove(dVar.a);
            zVar.x(T);
            zVar.writeByte(32);
            zVar.x(dVar.a);
            zVar.writeByte(10);
        }
        zVar.flush();
        if (this.D > this.z || L()) {
            this.O.d(this.P, 0L);
        }
    }

    public final synchronized b1 m(String str, long j) {
        str.getClass();
        z();
        a();
        c0(str);
        d dVar = (d) this.F.get(str);
        if (j != -1 && (dVar == null || dVar.i != j)) {
            return null;
        }
        if ((dVar != null ? dVar.g : null) != null) {
            return null;
        }
        if (dVar != null && dVar.h != 0) {
            return null;
        }
        if (!this.L && !this.M) {
            z zVar = this.E;
            zVar.getClass();
            zVar.x(S);
            zVar.writeByte(32);
            zVar.x(str);
            zVar.writeByte(10);
            zVar.flush();
            if (this.H) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str);
                this.F.put(str, dVar);
            }
            b1 b1Var = new b1(this, dVar);
            dVar.g = b1Var;
            return b1Var;
        }
        this.O.d(this.P, 0L);
        return null;
    }

    public final synchronized e w(String str) {
        str.getClass();
        z();
        a();
        c0(str);
        d dVar = (d) this.F.get(str);
        if (dVar == null) {
            return null;
        }
        e eVarA = dVar.a();
        if (eVarA == null) {
            return null;
        }
        this.G++;
        z zVar = this.E;
        zVar.getClass();
        zVar.x(U);
        zVar.writeByte(32);
        zVar.x(str);
        zVar.writeByte(10);
        if (L()) {
            this.O.d(this.P, 0L);
        }
        return eVarA;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void z() {
        boolean z;
        try {
            TimeZone timeZone = okhttp3.internal.g.a;
            if (this.J) {
                return;
            }
            if (this.y.N(this.C)) {
                boolean zN = this.y.N(this.A);
                g gVar = this.y;
                x xVar = this.C;
                if (zN) {
                    gVar.L(xVar);
                } else {
                    gVar.g(xVar, this.A);
                }
            }
            g gVar2 = this.y;
            x xVar2 = this.C;
            byte[] bArr = okhttp3.internal.e.a;
            gVar2.getClass();
            xVar2.getClass();
            f0 f0VarB0 = gVar2.b0(xVar2, false);
            try {
                gVar2.z.z(xVar2);
                if (f0VarB0 != null) {
                    try {
                        f0VarB0.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (f0VarB0 != null) {
                    try {
                        f0VarB0.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        gVar2.z.z(xVar2);
                        z = false;
                        this.I = z;
                        if (this.y.N(this.A)) {
                            try {
                                X();
                                N();
                                this.J = true;
                                return;
                            } catch (IOException e) {
                                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                                okhttp3.internal.platform.e.a.i(5, "DiskLruCache " + this.e + " is corrupt: " + e.getMessage() + ", removing", e);
                                try {
                                    close();
                                    okhttp3.internal.e.c(this.y, this.e);
                                    this.K = false;
                                    Z();
                                    this.J = true;
                                } catch (Throwable th2) {
                                    this.K = false;
                                    throw th2;
                                }
                            }
                        }
                        Z();
                        this.J = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                gVar2.z.z(xVar2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (f0VarB0 != null) {
                    try {
                        f0VarB0.close();
                    } catch (Throwable th4) {
                        kotlin.a.a(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                gVar2.z.z(xVar2);
                z = false;
                this.I = z;
                if (this.y.N(this.A)) {
                    X();
                    N();
                    this.J = true;
                    return;
                }
                Z();
                this.J = true;
            }
            this.I = z;
            if (this.y.N(this.A)) {
                X();
                N();
                this.J = true;
                return;
            }
            Z();
            this.J = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
