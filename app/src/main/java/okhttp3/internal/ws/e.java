package okhttp3.internal.ws;

import com.appsalt.internal.n4;
import com.appsalt.internal.p1;
import com.google.android.gms.measurement.internal.e0;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.b0;
import okhttp3.internal.connection.m;
import okhttp3.z;
import okio.g0;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final List x = com.google.common.base.c.p(z.HTTP_1_1);
    public final n4 a;
    public final Random b;
    public final long c;
    public f d;
    public final long e;
    public final long f;
    public final String g;
    public m h;
    public okhttp3.internal.cache.f i;
    public g j;
    public h k;
    public final okhttp3.internal.concurrent.c l;
    public String m;
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.c n;
    public final ArrayDeque o;
    public final ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public boolean w;

    public e(okhttp3.internal.concurrent.d dVar, b0 b0Var, n4 n4Var, Random random, long j, long j2, long j3) {
        dVar.getClass();
        this.a = n4Var;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.l = dVar.d();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        String str = b0Var.b;
        if (!"GET".equals(str)) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Request must be GET: ", str));
            throw null;
        }
        i iVar = i.A;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.g = e0.i(bArr).a();
    }

    public static void c(e eVar, Exception exc, int i) {
        h hVar;
        boolean z = (i & 4) == 0;
        eVar.getClass();
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        synchronized (eVar) {
            try {
                if (eVar.u) {
                    return;
                }
                eVar.u = true;
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = eVar.n;
                h hVar2 = eVar.k;
                zVar.e = hVar2;
                eVar.k = null;
                if (!z && hVar2 != null) {
                    okhttp3.internal.concurrent.c.c(eVar.l, eVar.m + " writer close", 0L, new androidx.room.coroutines.d(zVar, 26), 2);
                }
                eVar.l.g();
                try {
                    n4 n4Var = eVar.a;
                    if (l.a(n4Var.e, eVar)) {
                        n4Var.a.getClass();
                        n4Var.h.mo28trySendJP2dKIU(p1.a);
                        n4Var.a();
                    }
                } finally {
                    if (cVar != null) {
                        cVar.cancel();
                    }
                    if (z && (hVar = (h) zVar.e) != null) {
                        okhttp3.internal.e.b(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0 a(okhttp3.g0 g0Var) {
        int i = g0Var.A;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, g0Var.z, '\''));
        }
        String strG = okhttp3.g0.g("Connection", g0Var);
        if (!"Upgrade".equalsIgnoreCase(strG)) {
            throw new ProtocolException(androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Expected 'Connection' header value 'Upgrade' but was '", strG));
        }
        String strG2 = okhttp3.g0.g("Upgrade", g0Var);
        if (!"websocket".equalsIgnoreCase(strG2)) {
            throw new ProtocolException(androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Expected 'Upgrade' header value 'websocket' but was '", strG2));
        }
        String strG3 = okhttp3.g0.g("Sec-WebSocket-Accept", g0Var);
        i iVar = i.A;
        String strA = e0.h(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").e("SHA-1").a();
        if (l.a(strA, strG3)) {
            g0 g0Var2 = g0Var.E;
            if (g0Var2 != null) {
                return g0Var2;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strG3 + '\'');
    }

    public final void b(int i, String str) {
        String str2;
        long j = this.f;
        synchronized (this) {
            i iVarH = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    i iVar = i.A;
                    iVarH = e0.h(str);
                    if (iVarH.e.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new c(i, j, iVarH));
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        g gVar;
        boolean z;
        synchronized (this) {
            try {
                str = this.t;
                gVar = this.j;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    h hVar = this.k;
                    if (hVar != null) {
                        this.k = null;
                        okhttp3.internal.concurrent.c.c(this.l, this.m + " writer close", 0L, new androidx.room.coroutines.d(hVar, 25), 2);
                    }
                    this.l.g();
                }
                z = (this.u || this.k != null || this.s == -1) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            n4 n4Var = this.a;
            str.getClass();
            if (l.a(n4Var.e, this)) {
                n4Var.a.getClass();
                n4Var.h.mo28trySendJP2dKIU(p1.a);
                n4Var.a();
            }
        }
        if (gVar != null) {
            okhttp3.internal.e.b(gVar);
        }
    }

    public final void e() {
        TimeZone timeZone = okhttp3.internal.g.a;
        okhttp3.internal.cache.f fVar = this.i;
        if (fVar != null) {
            this.l.d(fVar, 0L);
        }
    }

    public final boolean f(i iVar) {
        synchronized (this) {
            if (!this.u && !this.r) {
                long j = this.q;
                byte[] bArr = iVar.e;
                if (((long) bArr.length) + j > 16777216) {
                    b(1001, null);
                    return false;
                }
                this.q = j + ((long) bArr.length);
                this.p.add(new d(iVar));
                e();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0103 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0115 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0146 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:44:0x00a7, B:45:0x00a8, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:76:0x0123, B:81:0x0139, B:82:0x013b, B:83:0x013c, B:84:0x0145, B:63:0x00e9, B:85:0x0146, B:86:0x014b, B:40:0x0096, B:70:0x010e), top: B:92:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00e9, please report this as an issue */
    public final boolean g() {
        Object objPoll;
        h hVar;
        Object obj;
        int i;
        i iVar;
        okio.f fVar;
        n4 n4Var;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                h hVar2 = this.k;
                Object objPoll2 = this.o.poll();
                String str = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.p.poll();
                        if (objPoll instanceof c) {
                            int i2 = this.s;
                            obj = this.t;
                            if (i2 != -1) {
                                hVar = this.k;
                                this.k = null;
                                if (hVar != null && this.j == null) {
                                    z = true;
                                }
                                this.l.g();
                            } else {
                                long j = ((c) objPoll).c;
                                okhttp3.internal.concurrent.c.c(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new androidx.room.coroutines.d(this, 27), 4);
                                hVar = null;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            hVar = null;
                        }
                        if (objPoll2 != null) {
                            hVar2.getClass();
                            hVar2.a(10, (i) objPoll2);
                        } else if (objPoll instanceof d) {
                            hVar2.getClass();
                            hVar2.g(((d) objPoll).a);
                            synchronized (this) {
                                this.q -= (long) ((d) objPoll).a.e.length;
                            }
                        } else {
                            if (objPoll instanceof c) {
                                throw new AssertionError();
                            }
                            hVar2.getClass();
                            i = ((c) objPoll).a;
                            iVar = ((c) objPoll).b;
                            i iVar2 = i.A;
                            if (i >= 1000 || i >= 5000) {
                                str = "Code must be in range [1000,5000): " + i;
                            } else if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                                str = "Code " + i + " is reserved and may not be used.";
                            }
                            if (str == null) {
                                throw new IllegalArgumentException(str.toString());
                            }
                            fVar = new okio.f();
                            fVar.s0(i);
                            if (iVar != null) {
                                fVar.m0(iVar);
                            }
                            try {
                                hVar2.a(8, fVar.k(fVar.y));
                                hVar2.E = true;
                                if (z) {
                                    n4Var = this.a;
                                    obj.getClass();
                                    if (!l.a(n4Var.e, this)) {
                                        n4Var.a.getClass();
                                        n4Var.h.mo28trySendJP2dKIU(p1.a);
                                        n4Var.a();
                                    }
                                }
                            } catch (Throwable th) {
                                hVar2.E = true;
                                throw th;
                            }
                        }
                        if (hVar != null) {
                            okhttp3.internal.e.b(hVar);
                        }
                        return true;
                    }
                    objPoll = null;
                    hVar = null;
                    if (objPoll2 != null) {
                        hVar2.getClass();
                        hVar2.a(10, (i) objPoll2);
                    } else if (objPoll instanceof d) {
                        hVar2.getClass();
                        hVar2.g(((d) objPoll).a);
                        synchronized (this) {
                            this.q -= (long) ((d) objPoll).a.e.length;
                        }
                    } else {
                        if (objPoll instanceof c) {
                            throw new AssertionError();
                        }
                        hVar2.getClass();
                        i = ((c) objPoll).a;
                        iVar = ((c) objPoll).b;
                        i iVar3 = i.A;
                        if (i >= 1000) {
                            str = "Code must be in range [1000,5000): " + i;
                        } else {
                            str = "Code must be in range [1000,5000): " + i;
                        }
                        if (str == null) {
                            throw new IllegalArgumentException(str.toString());
                        }
                        fVar = new okio.f();
                        fVar.s0(i);
                        if (iVar != null) {
                            fVar.m0(iVar);
                        }
                        hVar2.a(8, fVar.k(fVar.y));
                        hVar2.E = true;
                        if (z) {
                            n4Var = this.a;
                            obj.getClass();
                            if (!l.a(n4Var.e, this)) {
                                n4Var.a.getClass();
                                n4Var.h.mo28trySendJP2dKIU(p1.a);
                                n4Var.a();
                            }
                        }
                    }
                    if (hVar != null) {
                        okhttp3.internal.e.b(hVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (hVar != null) {
                        okhttp3.internal.e.b(hVar);
                    }
                    throw th2;
                }
                obj = hVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
