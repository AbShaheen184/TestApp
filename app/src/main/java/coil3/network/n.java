package coil3.network;

import android.webkit.MimeTypeMap;
import androidx.compose.foundation.lazy.layout.b1;
import com.google.android.gms.measurement.internal.e0;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.y;
import okio.b0;
import okio.h0;
import okio.x;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements coil3.fetch.i {
    public final String a;
    public final coil3.request.n b;
    public final kotlin.h c;
    public final kotlin.o d;
    public final kotlin.h e;
    public final kotlin.e f;
    public final kotlin.h g;

    public n(String str, coil3.request.n nVar, kotlin.o oVar, kotlin.o oVar2, kotlin.o oVar3, kotlin.e eVar, kotlin.o oVar4) {
        this.a = str;
        this.b = nVar;
        this.c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f = eVar;
        this.g = oVar4;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127 A[Catch: Exception -> 0x00e6, TryCatch #4 {Exception -> 0x00e6, blocks: (B:60:0x0121, B:62:0x0127, B:41:0x009f, B:43:0x00a6, B:45:0x00b4, B:54:0x00ea, B:56:0x00f6, B:48:0x00ca, B:50:0x00d4, B:66:0x0144, B:67:0x014b), top: B:96:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:83:0x01aa, B:22:0x004a, B:78:0x0189, B:80:0x018d, B:68:0x014c, B:70:0x0152, B:73:0x0161, B:74:0x0166, B:75:0x0167), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        if (r0 == r12) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(coil3.network.n r18, kotlin.coroutines.d r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.n.b(coil3.network.n, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(n nVar, r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        okio.f fVar;
        nVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.A = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(nVar, cVar);
            }
        } else {
            lVar = new l(nVar, cVar);
        }
        Object obj = lVar.y;
        int i2 = lVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            okio.f fVar2 = new okio.f();
            lVar.e = fVar2;
            lVar.A = 1;
            rVar.e.O(fVar2);
            y yVar = y.a;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (yVar == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = lVar.e;
            kotlin.a.e(obj);
        }
        return new coil3.decode.s(fVar, nVar.e(), null);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0231 A[Catch: Exception -> 0x0045, TryCatch #13 {Exception -> 0x0045, blocks: (B:13:0x003e, B:114:0x0216, B:115:0x0220, B:117:0x022e, B:119:0x0231, B:123:0x023c, B:124:0x023d, B:116:0x0221), top: B:157:0x003e, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0238  */
    /* JADX WARN: Code duplicated, block: B:139:0x025a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25 */
    public static final Object d(n nVar, coil3.disk.f fVar, q qVar, q qVar2, kotlin.coroutines.jvm.internal.c cVar) throws Exception {
        m mVar;
        q qVar3;
        androidx.media3.exoplayer.hls.c cVar2;
        androidx.media3.exoplayer.hls.c cVar3;
        ?? th;
        ?? th2;
        b1 b1VarG;
        r rVar;
        r rVar2;
        b1 b1Var;
        coil3.disk.d dVar;
        coil3.disk.b bVarM;
        coil3.disk.f fVar2 = fVar;
        q qVar4 = qVar2;
        nVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.C = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(nVar, cVar);
            }
        } else {
            mVar = new m(nVar, cVar);
        }
        Object bVar = mVar.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = mVar.C;
        androidx.media3.exoplayer.hls.c cVar4 = null;
        if (i2 == 0) {
            kotlin.a.e(bVar);
            if (!nVar.b.h.y) {
                if (fVar2 == null) {
                    return null;
                }
                try {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(fVar2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            c cVar5 = (c) nVar.e.getValue();
            mVar.e = fVar2;
            mVar.y = qVar4;
            mVar.C = 1;
            ((coil3.network.internal.a) cVar5).getClass();
            int i3 = qVar4.a;
            if (i3 != 304 || qVar == null) {
                bVar = ((200 > i3 || i3 >= 300) && !coil3.network.internal.a.b.contains(new Integer(i3))) ? b.b : new b(qVar4);
            } else {
                o oVar = qVar.d;
                o oVar2 = qVar4.d;
                oVar.getClass();
                Map map = oVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), kotlin.collections.o.l0((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : oVar2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, kotlin.collections.o.l0(list));
                }
                bVar = new b(new q(qVar4.a, qVar4.b, qVar4.c, new o(a0.H(linkedHashMap)), null, qVar4.f));
            }
            if (bVar == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar3 = mVar.z;
                qVar3 = mVar.y;
                qVar4 = (q) mVar.e;
                try {
                    kotlin.a.e(bVar);
                    cVar4 = null;
                    b1Var = (b1) cVar3.e;
                    dVar = (coil3.disk.d) b1Var.A;
                    synchronized (dVar.E) {
                        b1Var.d(true);
                        bVarM = dVar.m(((coil3.disk.a) b1Var.y).a);
                    }
                    return bVarM != null ? new coil3.disk.f(bVarM) : cVar4;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ((b1) cVar3.e).d(false);
                    } catch (Exception unused2) {
                    }
                    rVar = qVar4.e;
                    if (rVar != null) {
                        try {
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(rVar);
                        } catch (RuntimeException e3) {
                            throw e3;
                        } catch (Exception unused3) {
                        }
                    }
                    rVar2 = qVar3.e;
                    if (rVar2 != null) {
                        throw e;
                    }
                    try {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(rVar2);
                        throw e;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            q qVar5 = mVar.y;
            coil3.disk.f fVar3 = (coil3.disk.f) mVar.e;
            kotlin.a.e(bVar);
            qVar4 = qVar5;
            fVar2 = fVar3;
            cVar4 = null;
        }
        qVar3 = ((b) bVar).a;
        if (qVar3 == null) {
            return cVar4;
        }
        if (fVar2 != null) {
            coil3.disk.b bVar2 = fVar2.e;
            coil3.disk.d dVar2 = bVar2.z;
            synchronized (dVar2.E) {
                bVar2.close();
                b1VarG = dVar2.g(bVar2.e.a);
            }
            if (b1VarG != null) {
                cVar2 = new androidx.media3.exoplayer.hls.c(b1VarG);
            } else {
                cVar2 = cVar4;
            }
        } else {
            coil3.disk.g gVar = (coil3.disk.g) nVar.d.getValue();
            if (gVar == null) {
                cVar2 = cVar4;
            } else {
                String str2 = nVar.b.e;
                if (str2 == null) {
                    str2 = nVar.a;
                }
                coil3.disk.d dVar3 = gVar.b;
                okio.i iVar = okio.i.A;
                b1 b1VarG2 = dVar3.g(e0.h(str2).e("SHA-256").g());
                if (b1VarG2 != null) {
                    cVar2 = new androidx.media3.exoplayer.hls.c(b1VarG2);
                } else {
                    cVar2 = cVar4;
                }
            }
        }
        if (cVar2 == null) {
            return cVar4;
        }
        try {
            z zVarB = okio.b.b(nVar.e().b0(((b1) cVar2.e).h(0), false));
            try {
                android.support.v4.media.session.b.N(qVar3, zVarB);
                try {
                    zVarB.close();
                    th = cVar4;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    zVarB.close();
                } catch (Throwable th5) {
                    kotlin.a.a(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            r rVar3 = qVar3.e;
            if (rVar3 != null) {
                okio.k kVarE = nVar.e();
                x xVarH = ((b1) cVar2.e).h(1);
                mVar.e = qVar4;
                mVar.y = qVar3;
                mVar.z = cVar2;
                mVar.C = 2;
                okio.h hVar = rVar3.e;
                z zVarB2 = okio.b.b(kVarE.b0(xVarH, false));
                try {
                    kotlin.coroutines.jvm.internal.f.c(hVar.O(zVarB2));
                    try {
                        zVarB2.close();
                        th2 = cVar4;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        zVarB2.close();
                    } catch (Throwable th8) {
                        kotlin.a.a(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                if (y.a == aVar) {
                    return aVar;
                }
            }
            cVar3 = cVar2;
            b1Var = (b1) cVar3.e;
            dVar = (coil3.disk.d) b1Var.A;
            synchronized (dVar.E) {
                b1Var.d(true);
                bVarM = dVar.m(((coil3.disk.a) b1Var.y).a);
                if (bVarM != null) {
                }
            }
        } catch (Exception e5) {
            e = e5;
            cVar3 = cVar2;
            ((b1) cVar3.e).d(false);
            rVar = qVar4.e;
            if (rVar != null) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(rVar);
            }
            rVar2 = qVar3.e;
            if (rVar2 != null) {
                throw e;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(rVar2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String f(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || kotlin.text.r.O(str2, "text/plain", false)) {
            if (kotlin.text.k.d0(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strW0 = kotlin.text.k.w0(kotlin.text.k.w0(str, '#'), '?');
                String strR0 = kotlin.text.k.r0('.', kotlin.text.k.r0('/', strW0, strW0), "");
                if (kotlin.text.k.d0(strR0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strR0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) coil3.util.i.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return kotlin.text.k.u0(str2, ';');
        }
        return null;
    }

    public static void h(q qVar) {
        int i = qVar.a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new androidx.compose.ui.res.e(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "HTTP "), 3);
        }
    }

    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) {
        s sVar = (s) this.g.getValue();
        String str = this.b.e;
        androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, this, n.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5);
        sVar.getClass();
        return cVar.invoke(dVar);
    }

    public final okio.k e() {
        okio.k kVar;
        coil3.disk.g gVar = (coil3.disk.g) this.d.getValue();
        return (gVar == null || (kVar = gVar.a) == null) ? this.b.f : kVar;
    }

    public final p g() {
        coil3.i iVar = h.b;
        coil3.request.n nVar = this.b;
        o oVar = (o) coil3.m.e(nVar, iVar);
        oVar.getClass();
        androidx.collection.internal.b bVar = new androidx.collection.internal.b(oVar);
        coil3.request.b bVar2 = nVar.h;
        boolean z = bVar2.e;
        boolean z2 = nVar.i.e && ((e) this.f.e).a();
        if (!z2 && z) {
            bVar.f("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                bVar.f("no-cache, only-if-cached");
            }
        } else if (bVar2.y) {
            bVar.f("no-cache");
        } else {
            bVar.f("no-cache, no-store");
        }
        String str = (String) coil3.m.e(nVar, h.a);
        o oVar2 = new o(a0.H(bVar.a));
        if (coil3.m.e(nVar, h.c) == null) {
            return new p(this.a, str, oVar2, nVar.j);
        }
        androidx.transition.k.i();
        return null;
    }

    public final coil3.decode.p i(coil3.disk.f fVar) {
        coil3.disk.b bVar = fVar.e;
        if (bVar.y) {
            net.luminis.tls.engine.impl.c.r("snapshot is closed");
            return null;
        }
        x xVar = (x) bVar.e.c.get(1);
        okio.k kVarE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return _COROUTINE.a.c(xVar, kVarE, str, fVar, 16);
    }

    public final q j(coil3.disk.f fVar) throws Throwable {
        Throwable th;
        q qVarD;
        try {
            okio.k kVarE = e();
            coil3.disk.b bVar = fVar.e;
            if (bVar.y) {
                throw new IllegalStateException("snapshot is closed");
            }
            h0 h0VarC0 = kVarE.c0((x) bVar.e.c.get(0));
            h0VarC0.getClass();
            b0 b0Var = new b0(h0VarC0);
            try {
                qVarD = android.support.v4.media.session.b.D(b0Var);
                try {
                    b0Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    b0Var.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th3, th4);
                }
                th = th3;
                qVarD = null;
            }
            if (th == null) {
                return qVarD;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
