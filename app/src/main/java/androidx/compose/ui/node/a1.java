package androidx.compose.ui.node;

import android.net.Uri;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.ce;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.ie;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.jf;
import com.google.android.gms.internal.measurement.oe;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.internal.measurement.rf;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.internal.measurement.xc;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public a1(androidx.media3.exoplayer.c0 c0Var, androidx.media3.exoplayer.x xVar, androidx.media3.common.util.e0 e0Var, int i, int i2, int i3, int i4) {
        this.a = 1;
        this.b = c0Var;
        this.d = xVar;
        this.e = e0Var;
        this.f = new androidx.media3.common.t0();
        this.g = e0Var.a(c0Var.s, new androidx.media3.common.util.l(this, 1));
        this.h = new androidx.media3.common.util.z(this, i);
        this.i = new androidx.media3.common.util.a0(this, i2);
        this.j = new androidx.media3.common.util.b0(this, i3);
        this.k = new androidx.media3.common.util.c0(this, i4);
        androidx.media3.common.util.y yVar = new androidx.media3.common.util.y(this);
        this.c = yVar;
        c0Var.m.a(yVar);
    }

    public static final void a(a1 a1Var, androidx.compose.ui.q qVar, d1 d1Var) {
        for (androidx.compose.ui.q qVar2 = qVar.B; qVar2 != null; qVar2 = qVar2.B) {
            if (qVar2 == ((z0) a1Var.c)) {
                f0 f0VarV = ((f0) a1Var.b).v();
                d1Var.N = f0VarV != null ? (r) f0VarV.d0.d : null;
                a1Var.e = d1Var;
                return;
            } else {
                if ((qVar2.z & 2) != 0) {
                    return;
                }
                qVar2.K0(d1Var);
            }
        }
    }

    public static androidx.compose.ui.q d(androidx.compose.ui.p pVar, androidx.compose.ui.q qVar) {
        androidx.compose.ui.q qVarE;
        if (pVar instanceof w0) {
            qVarE = ((w0) pVar).e();
            qVarE.z = e1.f(qVarE);
        } else {
            b bVar = new b();
            bVar.z = e1.d(pVar);
            bVar.L = pVar;
            new HashSet();
            qVarE = bVar;
        }
        if (qVarE.K) {
            androidx.compose.ui.internal.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVarE.F = true;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 != null) {
            qVar2.B = qVarE;
            qVarE.C = qVar2;
        }
        qVar.C = qVarE;
        qVarE.B = qVar;
        return qVarE;
    }

    public static androidx.compose.ui.q e(androidx.compose.ui.q qVar) {
        boolean z = qVar.K;
        if (z) {
            androidx.collection.f0 f0Var = e1.a;
            if (!z) {
                androidx.compose.ui.internal.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            e1.a(qVar, -1, 2);
            qVar.I0();
            qVar.C0();
        }
        androidx.compose.ui.q qVar2 = qVar.C;
        androidx.compose.ui.q qVar3 = qVar.B;
        if (qVar2 != null) {
            qVar2.B = qVar3;
            qVar.C = null;
        }
        if (qVar3 != null) {
            qVar3.C = qVar2;
            qVar.B = null;
        }
        qVar3.getClass();
        return qVar3;
    }

    public static void j(androidx.compose.ui.p pVar, androidx.compose.ui.p pVar2, androidx.compose.ui.q qVar) {
        if ((pVar instanceof w0) && (pVar2 instanceof w0)) {
            qVar.getClass();
            ((w0) pVar2).f(qVar);
            if (qVar.K) {
                e1.c(qVar);
                return;
            } else {
                qVar.G = true;
                return;
            }
        }
        if (!(qVar instanceof b)) {
            androidx.compose.ui.internal.a.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) qVar;
        boolean z = bVar.K;
        if (z) {
            if (!z) {
                androidx.compose.ui.internal.a.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.z & 8) != 0) {
                ((androidx.compose.ui.platform.u) k.u(bVar)).D();
            }
        }
        bVar.L = pVar2;
        bVar.z = e1.d(pVar2);
        if (bVar.K) {
            bVar.L0(false);
        }
        if (qVar.K) {
            e1.c(qVar);
        } else {
            qVar.G = true;
        }
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.g;
        if (map != null) {
            map.put(str, str2);
        } else {
            net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
        }
    }

    public com.google.android.datatransport.runtime.h c() {
        String strConcat = ((String) this.b) == null ? " transportName" : "";
        if (((com.google.android.datatransport.runtime.k) this.d) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.g) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new com.google.android.datatransport.runtime.h((String) this.b, (Integer) this.c, (com.google.android.datatransport.runtime.k) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (HashMap) this.g, (Integer) this.h, (String) this.i, (byte[]) this.j, (byte[]) this.k);
        }
        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(strConcat));
        return null;
    }

    public boolean f(int i) {
        return (i & ((androidx.compose.ui.q) this.g).A) != 0;
    }

    public void g() {
        for (androidx.compose.ui.q qVar = (androidx.compose.ui.q) this.g; qVar != null; qVar = qVar.C) {
            qVar.H0();
            if (qVar.F) {
                androidx.collection.f0 f0Var = e1.a;
                if (!qVar.K) {
                    androidx.compose.ui.internal.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(qVar, -1, 1);
            }
            if (qVar.G) {
                e1.c(qVar);
            }
            qVar.F = false;
            qVar.G = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void h(int r32, androidx.compose.runtime.collection.b r33, androidx.compose.runtime.collection.b r34, androidx.compose.ui.q r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a1.h(int, androidx.compose.runtime.collection.b, androidx.compose.runtime.collection.b, androidx.compose.ui.q, boolean):void");
    }

    public void i() {
        x xVar;
        l1 l1Var;
        f0 f0Var = (f0) this.b;
        d1 d1Var = (r) this.d;
        for (androidx.compose.ui.q qVar = ((w1) this.f).B; qVar != null; qVar = qVar.B) {
            v vVarF = k.f(qVar);
            if (vVarF != null) {
                d1 d1Var2 = qVar.E;
                if (d1Var2 != null) {
                    xVar = (x) d1Var2;
                    v vVar = xVar.o0;
                    xVar.u1(vVarF);
                    if (vVar != qVar && (l1Var = xVar.i0) != null) {
                        ((androidx.compose.ui.platform.q1) l1Var).c();
                    }
                } else {
                    xVar = new x(f0Var, vVarF);
                    qVar.K0(xVar);
                }
                d1Var.N = xVar;
                xVar.M = d1Var;
                d1Var = xVar;
            } else {
                qVar.K0(d1Var);
            }
        }
        f0 f0VarV = f0Var.v();
        d1Var.N = f0VarV != null ? (r) f0VarV.d0.d : null;
        this.e = d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:13:0x001b, B:14:0x001d, B:16:0x0023, B:17:0x003f, B:18:0x0044), top: B:25:0x0003, inners: #0 }] */
    public ListenableFuture k(xc xcVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.i) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.k;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (((ListenableFuture) this.k) == null) {
                    this.k = com.google.common.util.concurrent.n0.e(((com.google.common.util.concurrent.g0) this.j).C(rf.a(new oe(this, 0)), (com.google.common.util.concurrent.x0) this.e));
                }
                listenableFuture = (ListenableFuture) this.k;
            } else {
                try {
                    com.google.common.util.concurrent.n0.b((ListenableFuture) this.k);
                } catch (ExecutionException unused) {
                    this.k = null;
                }
                if (((ListenableFuture) this.k) == null) {
                    this.k = com.google.common.util.concurrent.n0.e(((com.google.common.util.concurrent.g0) this.j).C(rf.a(new oe(this, 0)), (com.google.common.util.concurrent.x0) this.e));
                }
                listenableFuture = (ListenableFuture) this.k;
            }
            throw th;
        }
        return ((com.google.common.util.concurrent.g0) this.j).C(rf.a(new b7(this, listenableFuture, xcVar, executor, 2)), com.google.common.util.concurrent.d0.e);
    }

    public com.google.android.gms.internal.measurement.m0 l(Uri uri) throws IOException {
        se seVar = (se) this.d;
        String str = (String) this.b;
        td tdVar = (td) this.f;
        try {
            try {
                com.google.android.gms.internal.measurement.f1 f1Var = (com.google.android.gms.internal.measurement.f1) this.h;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String string = sb.toString();
                f1Var.getClass();
                jf jfVarE = com.google.android.gms.internal.measurement.f1.e(string);
                try {
                    InputStream inputStreamD = wf.d(tdVar.b(uri));
                    try {
                        com.google.android.gms.internal.measurement.i1 i1VarA = ((com.google.android.gms.internal.measurement.h1) ((h2) seVar.a.t(7))).a(inputStreamD, seVar.b);
                        if (inputStreamD != null) {
                            inputStreamD.close();
                        }
                        jfVarE.close();
                        return i1VarA;
                    } catch (Throwable th) {
                        if (inputStreamD != null) {
                            try {
                                inputStreamD.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        jfVarE.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                rd rdVarB = tdVar.b(uri);
                if (rdVarB.a.b(rdVarB.d)) {
                    throw e;
                }
                return seVar.a;
            }
        } catch (IOException e2) {
            throw com.google.android.gms.internal.measurement.h.a(tdVar, uri, e2, str);
        }
    }

    public void m(Uri uri, Object obj) throws IOException {
        String str = (String) this.b;
        td tdVar = (td) this.f;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            com.google.android.gms.internal.measurement.f1 f1Var = (com.google.android.gms.internal.measurement.f1) this.h;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String string = sb.toString();
            f1Var.getClass();
            jf jfVarE = com.google.android.gms.internal.measurement.f1.e(string);
            try {
                j5 j5Var = new j5(7);
                try {
                    rd rdVarB = tdVar.b(uriBuild);
                    ArrayList arrayListA = rdVarB.a(rdVarB.a.e(rdVarB.d));
                    new j5[]{j5Var}[0].e(arrayListA);
                    OutputStream outputStream = (OutputStream) arrayListA.get(0);
                    try {
                        ((com.google.android.gms.internal.measurement.m0) obj).b(outputStream);
                        if (((ce) j5Var.z) == null) {
                            throw new androidx.datastore.preferences.protobuf.i("Cannot sync underlying stream");
                        }
                        ((OutputStream) j5Var.y).flush();
                        ((ce) j5Var.z).e.getFD().sync();
                        outputStream.close();
                        jfVarE.close();
                        rd rdVarB2 = tdVar.b(uriBuild);
                        rd rdVarB3 = tdVar.b(uri);
                        ie ieVar = rdVarB2.a;
                        if (ieVar != rdVarB3.a) {
                            throw new androidx.datastore.preferences.protobuf.i("Cannot rename file across backends");
                        }
                        ieVar.g(rdVarB2.d, rdVarB3.d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw com.google.android.gms.internal.measurement.h.a(tdVar, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    jfVarE.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            rd rdVarB4 = tdVar.b(uriBuild);
            if (rdVarB4.a.b(rdVarB4.d)) {
                try {
                    rd rdVarB5 = tdVar.b(uriBuild);
                    rdVarB5.a.f(rdVarB5.d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                androidx.compose.ui.q qVar = (androidx.compose.ui.q) this.g;
                w1 w1Var = (w1) this.f;
                if (qVar == w1Var) {
                    sb.append("]");
                } else {
                    while (qVar != null && qVar != w1Var) {
                        sb.append(String.valueOf(qVar));
                        if (qVar.C == w1Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            qVar = qVar.C;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a1(String str, com.google.common.util.concurrent.q0 q0Var, se seVar, Executor executor, td tdVar, com.google.common.base.p pVar, com.google.android.gms.internal.measurement.f1 f1Var) {
        this.a = 3;
        this.i = new Object();
        this.j = new com.google.common.util.concurrent.g0(0);
        this.k = null;
        this.b = str;
        this.c = com.google.common.util.concurrent.n0.e(q0Var);
        this.d = seVar;
        this.e = new com.google.common.util.concurrent.x0(executor);
        this.f = tdVar;
        this.g = pVar;
        this.h = f1Var;
    }

    public a1(f0 f0Var) {
        this.a = 0;
        this.b = f0Var;
        z0 z0Var = new z0();
        z0Var.A = -1;
        this.c = z0Var;
        r rVar = new r(f0Var);
        this.d = rVar;
        this.e = rVar;
        w1 w1Var = rVar.o0;
        this.f = w1Var;
        this.g = w1Var;
        this.j = new androidx.compose.runtime.collection.b(new androidx.compose.ui.r[16]);
    }

    public /* synthetic */ a1() {
        this.a = 2;
    }
}
