package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class pc {
    public static final s5 i = new s5(14);
    public static final hc j;
    public volatile androidx.compose.material.ripple.g a;
    public final na b;
    public final String c;
    public final String d;
    public final boolean e;
    public final com.google.common.collect.k0 f;
    public final s5 g;
    public final gd h;

    static {
        c3 c3Var = c3.z;
        int i2 = com.google.common.collect.k0.z;
        j = new hc(c3Var, false, com.google.common.collect.h1.G);
    }

    public pc(na naVar, hc hcVar) {
        this.b = naVar;
        Context context = naVar.b;
        String str = hcVar.d;
        if (str == null) {
            str = (String) hcVar.a.apply(context);
            hcVar.d = str;
        }
        this.c = str;
        this.d = "";
        this.e = hcVar.b;
        this.f = hcVar.c;
        this.a = null;
        this.g = new s5(15);
        this.h = new gd(naVar, str);
    }

    public final androidx.compose.material.ripple.g a() {
        androidx.compose.material.ripple.g gVar;
        androidx.compose.material.ripple.g gVar2 = this.a;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (this) {
            try {
                gVar = this.a;
                if (gVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        androidx.compose.material.ripple.g gVarA = this.h.a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = ((androidx.core.view.r) gVarA.e).b - 2;
                        if (i2 == 15 || i2 == 16) {
                            gVar = gVarA;
                        } else {
                            na naVar = this.b;
                            naVar.g.a();
                            if (this.e || this.h.b() || !((String) gVarA.b).isEmpty()) {
                                final int i3 = 3;
                                naVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.jc
                                    public final /* synthetic */ pc y;

                                    {
                                        this.y = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() throws Throwable {
                                        com.google.common.base.p pVar;
                                        com.google.common.util.concurrent.h0 h0VarA;
                                        com.google.common.util.concurrent.a aVarB;
                                        int i4 = 2;
                                        int i5 = 1;
                                        int i6 = 0;
                                        switch (i3) {
                                            case 0:
                                                this.y.b();
                                                return;
                                            case 1:
                                                pc pcVar = this.y;
                                                na naVar2 = pcVar.b;
                                                String str = pcVar.c;
                                                re reVar = uc.a;
                                                Object obj = f1.z;
                                                byte b = (byte) (((byte) 2) | 1);
                                                Context context = naVar2.b;
                                                Pattern pattern = xd.a;
                                                com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(context);
                                                y1Var.y0("phenotype");
                                                y1Var.z0("all_accounts.pb");
                                                Uri uriA0 = y1Var.A0();
                                                if (uriA0 == null) {
                                                    com.google.gson.b.h("Null uri");
                                                    return;
                                                }
                                                yb ybVarV = yb.v();
                                                if (ybVarV == null) {
                                                    com.google.gson.b.h("Null schema");
                                                    return;
                                                }
                                                re reVar2 = uc.a;
                                                reVar2.getClass();
                                                com.google.common.base.p pVar2 = new com.google.common.base.p(reVar2);
                                                byte b2 = (byte) (b | 2);
                                                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                                                com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                                                if (b2 != 3) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if ((b2 & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((2 & b2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(sb.toString()));
                                                    return;
                                                }
                                                je jeVar = new je(uriA0, ybVarV, pVar2, a1Var);
                                                androidx.compose.runtime.internal.c cVar = uc.c;
                                                if (cVar == null) {
                                                    synchronized (uc.b) {
                                                        try {
                                                            cVar = uc.c;
                                                            if (cVar == null) {
                                                                HashMap map = new HashMap();
                                                                com.google.common.util.concurrent.w0 w0VarA = naVar2.a();
                                                                td tdVar = (td) naVar2.f.get();
                                                                me meVar = me.a;
                                                                com.google.android.material.motion.a.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", meVar);
                                                                androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(w0VarA, tdVar, map);
                                                                uc.c = cVar2;
                                                                cVar = cVar2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    i5 = 1;
                                                    naVar2 = naVar2;
                                                    pVar2 = pVar2;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.e;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriA0);
                                                if (pairCreate == null) {
                                                    com.google.android.material.motion.a.h(uriA0.isHierarchical(), "Uri must be hierarchical: %s", uriA0);
                                                    String lastPathSegment = uriA0.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    com.google.android.material.motion.a.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriA0);
                                                    me meVar2 = (me) ((HashMap) cVar.B).get("singleproc");
                                                    com.google.android.material.motion.a.h(meVar2 != null ? i5 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriA0.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    String str2 = strSubstring;
                                                    com.google.common.util.concurrent.s sVarG = com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.d(uriA0), (db) cVar.A, com.google.common.util.concurrent.d0.e);
                                                    Executor executor = (Executor) cVar.y;
                                                    td tdVar2 = (td) cVar.z;
                                                    meVar2.getClass();
                                                    pVar = pVar2;
                                                    le leVar = new le(new androidx.compose.ui.node.a1(str2, com.google.common.util.concurrent.n0.d(uriA0), new se(ybVarV, a1.a()), executor, tdVar2, pVar2, new f1(19)), sVarG);
                                                    if (!a1Var.isEmpty()) {
                                                        xc xcVar = new xc(i5, a1Var, executor);
                                                        synchronized (leVar.g) {
                                                            leVar.i.add(xcVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(leVar, jeVar);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriA0, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                } else {
                                                    pVar = pVar2;
                                                }
                                                le leVar2 = (le) pairCreate.first;
                                                je jeVar2 = (je) pairCreate.second;
                                                if (jeVar.equals(jeVar2)) {
                                                    com.google.common.util.concurrent.t tVarA = leVar2.a(new nc(str, 1), naVar2.a());
                                                    tVarA.a(new lc(pcVar, tVarA, 0), naVar2.a());
                                                    return;
                                                }
                                                String strP = com.google.android.material.resources.b.p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", yb.class.getSimpleName(), uriA0);
                                                com.google.android.material.motion.a.h(uriA0.equals(jeVar2.a), strP, "uri");
                                                com.google.android.material.motion.a.h(ybVarV.equals(jeVar2.b), strP, "schema");
                                                com.google.android.material.motion.a.h(pVar.equals(jeVar2.c), strP, "handler");
                                                com.google.android.material.motion.a.h(a1Var.equals(jeVar2.d), strP, "migrations");
                                                com.google.android.material.motion.a.h(obj.equals(obj), strP, "variantConfig");
                                                net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p(strP, "unknown"));
                                                return;
                                            case 2:
                                                pc pcVar2 = this.y;
                                                zc zcVar = pcVar2.b.i;
                                                boolean z = pcVar2.e;
                                                mc mcVar = mc.a;
                                                dd ddVar = (dd) zcVar.c.get();
                                                if (ddVar == null && !z) {
                                                    com.google.common.util.concurrent.q0 q0Var = com.google.common.util.concurrent.q0.y;
                                                    return;
                                                }
                                                if ((zcVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zcVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = zcVar.e;
                                                            if ((i7 & 64) == 0) {
                                                                copyOnWriteArrayList.add(mcVar);
                                                                zcVar.e = i7 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (zcVar.h == null) {
                                                    synchronized (zcVar.g) {
                                                        try {
                                                            if (zcVar.h == null) {
                                                                if (ddVar == null) {
                                                                    ddVar = yc.a;
                                                                }
                                                                Context context2 = zcVar.a;
                                                                if (ea.s(context2)) {
                                                                    h0VarA = ((eb) zcVar.d.get()).a(new j5(zcVar, ddVar));
                                                                    zcVar.h = h0VarA;
                                                                } else {
                                                                    wc wcVar = wc.y;
                                                                    com.google.common.base.t tVar = zcVar.b;
                                                                    h0VarA = com.google.common.util.concurrent.n0.g(ea.j(context2, Executors.callable(wcVar, null), (Executor) tVar.get()), new xc(i6, zcVar, ddVar), (Executor) tVar.get());
                                                                    zcVar.h = h0VarA;
                                                                }
                                                                h0VarA.a(new vc(h0VarA, i4), (Executor) zcVar.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                pc pcVar3 = this.y;
                                                androidx.compose.material.ripple.g gVarA2 = pcVar3.a();
                                                String str3 = (String) gVarA2.b;
                                                na naVar3 = pcVar3.b;
                                                com.google.common.base.t tVar2 = naVar3.d;
                                                ed edVarB = naVar3.g.b();
                                                boolean z2 = edVarB.i;
                                                if (edVarB.j) {
                                                    if (com.google.common.base.i.u(str3) && !z2) {
                                                        com.google.common.util.concurrent.q0 q0Var2 = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    ua uaVarV = xa.v();
                                                    androidx.core.view.r rVar = (androidx.core.view.r) gVarA2.e;
                                                    int i8 = rVar.a;
                                                    va vaVarU = wa.u();
                                                    vaVarU.b();
                                                    ((wa) vaVarU.y).v(i8);
                                                    int i9 = rVar.b;
                                                    vaVarU.b();
                                                    ((wa) vaVarU.y).w(i9);
                                                    wa waVar = (wa) vaVarU.d();
                                                    uaVarV.b();
                                                    ((xa) uaVarV.y).x(waVar);
                                                    if (!com.google.common.base.i.u(str3)) {
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).w(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = pcVar3.c;
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).y(str4);
                                                    }
                                                    eb ebVar = (eb) tVar2.get();
                                                    xa xaVar = (xa) uaVarV.d();
                                                    z9 z9Var = ebVar.a;
                                                    androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
                                                    q0VarC.z = new s5(xaVar, 7);
                                                    q0VarC.A = new com.google.android.gms.common.d[]{h.a};
                                                    q0VarC.y = false;
                                                    aVarB = eb.b(z9Var.b(0, q0VarC.b()).d(com.google.common.util.concurrent.d0.e, new j5(i5, z9Var, xaVar)));
                                                } else {
                                                    if (com.google.common.base.i.u(str3)) {
                                                        com.google.common.util.concurrent.q0 q0Var3 = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    eb ebVar2 = (eb) tVar2.get();
                                                    ebVar2.getClass();
                                                    str3.getClass();
                                                    aVarB = eb.b(ebVar2.a.c(str3));
                                                }
                                                com.google.common.util.concurrent.n0.a(aVarB, cb.class, new kc(pcVar3, i6), naVar3.a());
                                                return;
                                        }
                                    }
                                });
                                naVar.a.w((t0) gVarA.c, this.f, this.c);
                                if (!this.d.equals("")) {
                                    final int i4 = 1;
                                    naVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.jc
                                        public final /* synthetic */ pc y;

                                        {
                                            this.y = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            com.google.common.base.p pVar;
                                            com.google.common.util.concurrent.h0 h0VarA;
                                            com.google.common.util.concurrent.a aVarB;
                                            int i5 = 2;
                                            int i6 = 1;
                                            int i7 = 0;
                                            switch (i4) {
                                                case 0:
                                                    this.y.b();
                                                    return;
                                                case 1:
                                                    pc pcVar = this.y;
                                                    na naVar2 = pcVar.b;
                                                    String str = pcVar.c;
                                                    re reVar = uc.a;
                                                    Object obj = f1.z;
                                                    byte b = (byte) (((byte) 2) | 1);
                                                    Context context = naVar2.b;
                                                    Pattern pattern = xd.a;
                                                    com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(context);
                                                    y1Var.y0("phenotype");
                                                    y1Var.z0("all_accounts.pb");
                                                    Uri uriA0 = y1Var.A0();
                                                    if (uriA0 == null) {
                                                        com.google.gson.b.h("Null uri");
                                                        return;
                                                    }
                                                    yb ybVarV = yb.v();
                                                    if (ybVarV == null) {
                                                        com.google.gson.b.h("Null schema");
                                                        return;
                                                    }
                                                    re reVar2 = uc.a;
                                                    reVar2.getClass();
                                                    com.google.common.base.p pVar2 = new com.google.common.base.p(reVar2);
                                                    byte b2 = (byte) (b | 2);
                                                    com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                                                    com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                                                    if (b2 != 3) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if ((b2 & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((2 & b2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(sb.toString()));
                                                        return;
                                                    }
                                                    je jeVar = new je(uriA0, ybVarV, pVar2, a1Var);
                                                    androidx.compose.runtime.internal.c cVar = uc.c;
                                                    if (cVar == null) {
                                                        synchronized (uc.b) {
                                                            try {
                                                                cVar = uc.c;
                                                                if (cVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    com.google.common.util.concurrent.w0 w0VarA = naVar2.a();
                                                                    td tdVar = (td) naVar2.f.get();
                                                                    me meVar = me.a;
                                                                    com.google.android.material.motion.a.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", meVar);
                                                                    androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(w0VarA, tdVar, map);
                                                                    uc.c = cVar2;
                                                                    cVar = cVar2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        i6 = 1;
                                                        naVar2 = naVar2;
                                                        pVar2 = pVar2;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.e;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriA0);
                                                    if (pairCreate == null) {
                                                        com.google.android.material.motion.a.h(uriA0.isHierarchical(), "Uri must be hierarchical: %s", uriA0);
                                                        String lastPathSegment = uriA0.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        com.google.android.material.motion.a.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriA0);
                                                        me meVar2 = (me) ((HashMap) cVar.B).get("singleproc");
                                                        com.google.android.material.motion.a.h(meVar2 != null ? i6 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriA0.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        String str2 = strSubstring;
                                                        com.google.common.util.concurrent.s sVarG = com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.d(uriA0), (db) cVar.A, com.google.common.util.concurrent.d0.e);
                                                        Executor executor = (Executor) cVar.y;
                                                        td tdVar2 = (td) cVar.z;
                                                        meVar2.getClass();
                                                        pVar = pVar2;
                                                        le leVar = new le(new androidx.compose.ui.node.a1(str2, com.google.common.util.concurrent.n0.d(uriA0), new se(ybVarV, a1.a()), executor, tdVar2, pVar2, new f1(19)), sVarG);
                                                        if (!a1Var.isEmpty()) {
                                                            xc xcVar = new xc(i6, a1Var, executor);
                                                            synchronized (leVar.g) {
                                                                leVar.i.add(xcVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(leVar, jeVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriA0, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        pVar = pVar2;
                                                    }
                                                    le leVar2 = (le) pairCreate.first;
                                                    je jeVar2 = (je) pairCreate.second;
                                                    if (jeVar.equals(jeVar2)) {
                                                        com.google.common.util.concurrent.t tVarA = leVar2.a(new nc(str, 1), naVar2.a());
                                                        tVarA.a(new lc(pcVar, tVarA, 0), naVar2.a());
                                                        return;
                                                    }
                                                    String strP = com.google.android.material.resources.b.p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", yb.class.getSimpleName(), uriA0);
                                                    com.google.android.material.motion.a.h(uriA0.equals(jeVar2.a), strP, "uri");
                                                    com.google.android.material.motion.a.h(ybVarV.equals(jeVar2.b), strP, "schema");
                                                    com.google.android.material.motion.a.h(pVar.equals(jeVar2.c), strP, "handler");
                                                    com.google.android.material.motion.a.h(a1Var.equals(jeVar2.d), strP, "migrations");
                                                    com.google.android.material.motion.a.h(obj.equals(obj), strP, "variantConfig");
                                                    net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p(strP, "unknown"));
                                                    return;
                                                case 2:
                                                    pc pcVar2 = this.y;
                                                    zc zcVar = pcVar2.b.i;
                                                    boolean z = pcVar2.e;
                                                    mc mcVar = mc.a;
                                                    dd ddVar = (dd) zcVar.c.get();
                                                    if (ddVar == null && !z) {
                                                        com.google.common.util.concurrent.q0 q0Var = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    if ((zcVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zcVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i8 = zcVar.e;
                                                                if ((i8 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(mcVar);
                                                                    zcVar.e = i8 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (zcVar.h == null) {
                                                        synchronized (zcVar.g) {
                                                            try {
                                                                if (zcVar.h == null) {
                                                                    if (ddVar == null) {
                                                                        ddVar = yc.a;
                                                                    }
                                                                    Context context2 = zcVar.a;
                                                                    if (ea.s(context2)) {
                                                                        h0VarA = ((eb) zcVar.d.get()).a(new j5(zcVar, ddVar));
                                                                        zcVar.h = h0VarA;
                                                                    } else {
                                                                        wc wcVar = wc.y;
                                                                        com.google.common.base.t tVar = zcVar.b;
                                                                        h0VarA = com.google.common.util.concurrent.n0.g(ea.j(context2, Executors.callable(wcVar, null), (Executor) tVar.get()), new xc(i7, zcVar, ddVar), (Executor) tVar.get());
                                                                        zcVar.h = h0VarA;
                                                                    }
                                                                    h0VarA.a(new vc(h0VarA, i5), (Executor) zcVar.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    pc pcVar3 = this.y;
                                                    androidx.compose.material.ripple.g gVarA2 = pcVar3.a();
                                                    String str3 = (String) gVarA2.b;
                                                    na naVar3 = pcVar3.b;
                                                    com.google.common.base.t tVar2 = naVar3.d;
                                                    ed edVarB = naVar3.g.b();
                                                    boolean z2 = edVarB.i;
                                                    if (edVarB.j) {
                                                        if (com.google.common.base.i.u(str3) && !z2) {
                                                            com.google.common.util.concurrent.q0 q0Var2 = com.google.common.util.concurrent.q0.y;
                                                            return;
                                                        }
                                                        ua uaVarV = xa.v();
                                                        androidx.core.view.r rVar = (androidx.core.view.r) gVarA2.e;
                                                        int i9 = rVar.a;
                                                        va vaVarU = wa.u();
                                                        vaVarU.b();
                                                        ((wa) vaVarU.y).v(i9);
                                                        int i10 = rVar.b;
                                                        vaVarU.b();
                                                        ((wa) vaVarU.y).w(i10);
                                                        wa waVar = (wa) vaVarU.d();
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).x(waVar);
                                                        if (!com.google.common.base.i.u(str3)) {
                                                            uaVarV.b();
                                                            ((xa) uaVarV.y).w(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = pcVar3.c;
                                                            uaVarV.b();
                                                            ((xa) uaVarV.y).y(str4);
                                                        }
                                                        eb ebVar = (eb) tVar2.get();
                                                        xa xaVar = (xa) uaVarV.d();
                                                        z9 z9Var = ebVar.a;
                                                        androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
                                                        q0VarC.z = new s5(xaVar, 7);
                                                        q0VarC.A = new com.google.android.gms.common.d[]{h.a};
                                                        q0VarC.y = false;
                                                        aVarB = eb.b(z9Var.b(0, q0VarC.b()).d(com.google.common.util.concurrent.d0.e, new j5(i6, z9Var, xaVar)));
                                                    } else {
                                                        if (com.google.common.base.i.u(str3)) {
                                                            com.google.common.util.concurrent.q0 q0Var3 = com.google.common.util.concurrent.q0.y;
                                                            return;
                                                        }
                                                        eb ebVar2 = (eb) tVar2.get();
                                                        ebVar2.getClass();
                                                        str3.getClass();
                                                        aVarB = eb.b(ebVar2.a.c(str3));
                                                    }
                                                    com.google.common.util.concurrent.n0.a(aVarB, cb.class, new kc(pcVar3, i7), naVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.h.b()) {
                                    final int i5 = 2;
                                    naVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.jc
                                        public final /* synthetic */ pc y;

                                        {
                                            this.y = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            com.google.common.base.p pVar;
                                            com.google.common.util.concurrent.h0 h0VarA;
                                            com.google.common.util.concurrent.a aVarB;
                                            int i6 = 2;
                                            int i7 = 1;
                                            int i8 = 0;
                                            switch (i5) {
                                                case 0:
                                                    this.y.b();
                                                    return;
                                                case 1:
                                                    pc pcVar = this.y;
                                                    na naVar2 = pcVar.b;
                                                    String str = pcVar.c;
                                                    re reVar = uc.a;
                                                    Object obj = f1.z;
                                                    byte b = (byte) (((byte) 2) | 1);
                                                    Context context = naVar2.b;
                                                    Pattern pattern = xd.a;
                                                    com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(context);
                                                    y1Var.y0("phenotype");
                                                    y1Var.z0("all_accounts.pb");
                                                    Uri uriA0 = y1Var.A0();
                                                    if (uriA0 == null) {
                                                        com.google.gson.b.h("Null uri");
                                                        return;
                                                    }
                                                    yb ybVarV = yb.v();
                                                    if (ybVarV == null) {
                                                        com.google.gson.b.h("Null schema");
                                                        return;
                                                    }
                                                    re reVar2 = uc.a;
                                                    reVar2.getClass();
                                                    com.google.common.base.p pVar2 = new com.google.common.base.p(reVar2);
                                                    byte b2 = (byte) (b | 2);
                                                    com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                                                    com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                                                    if (b2 != 3) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if ((b2 & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((2 & b2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(sb.toString()));
                                                        return;
                                                    }
                                                    je jeVar = new je(uriA0, ybVarV, pVar2, a1Var);
                                                    androidx.compose.runtime.internal.c cVar = uc.c;
                                                    if (cVar == null) {
                                                        synchronized (uc.b) {
                                                            try {
                                                                cVar = uc.c;
                                                                if (cVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    com.google.common.util.concurrent.w0 w0VarA = naVar2.a();
                                                                    td tdVar = (td) naVar2.f.get();
                                                                    me meVar = me.a;
                                                                    com.google.android.material.motion.a.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", meVar);
                                                                    androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(w0VarA, tdVar, map);
                                                                    uc.c = cVar2;
                                                                    cVar = cVar2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        i7 = 1;
                                                        naVar2 = naVar2;
                                                        pVar2 = pVar2;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.e;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriA0);
                                                    if (pairCreate == null) {
                                                        com.google.android.material.motion.a.h(uriA0.isHierarchical(), "Uri must be hierarchical: %s", uriA0);
                                                        String lastPathSegment = uriA0.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        com.google.android.material.motion.a.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriA0);
                                                        me meVar2 = (me) ((HashMap) cVar.B).get("singleproc");
                                                        com.google.android.material.motion.a.h(meVar2 != null ? i7 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriA0.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        String str2 = strSubstring;
                                                        com.google.common.util.concurrent.s sVarG = com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.d(uriA0), (db) cVar.A, com.google.common.util.concurrent.d0.e);
                                                        Executor executor = (Executor) cVar.y;
                                                        td tdVar2 = (td) cVar.z;
                                                        meVar2.getClass();
                                                        pVar = pVar2;
                                                        le leVar = new le(new androidx.compose.ui.node.a1(str2, com.google.common.util.concurrent.n0.d(uriA0), new se(ybVarV, a1.a()), executor, tdVar2, pVar2, new f1(19)), sVarG);
                                                        if (!a1Var.isEmpty()) {
                                                            xc xcVar = new xc(i7, a1Var, executor);
                                                            synchronized (leVar.g) {
                                                                leVar.i.add(xcVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(leVar, jeVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriA0, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        pVar = pVar2;
                                                    }
                                                    le leVar2 = (le) pairCreate.first;
                                                    je jeVar2 = (je) pairCreate.second;
                                                    if (jeVar.equals(jeVar2)) {
                                                        com.google.common.util.concurrent.t tVarA = leVar2.a(new nc(str, 1), naVar2.a());
                                                        tVarA.a(new lc(pcVar, tVarA, 0), naVar2.a());
                                                        return;
                                                    }
                                                    String strP = com.google.android.material.resources.b.p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", yb.class.getSimpleName(), uriA0);
                                                    com.google.android.material.motion.a.h(uriA0.equals(jeVar2.a), strP, "uri");
                                                    com.google.android.material.motion.a.h(ybVarV.equals(jeVar2.b), strP, "schema");
                                                    com.google.android.material.motion.a.h(pVar.equals(jeVar2.c), strP, "handler");
                                                    com.google.android.material.motion.a.h(a1Var.equals(jeVar2.d), strP, "migrations");
                                                    com.google.android.material.motion.a.h(obj.equals(obj), strP, "variantConfig");
                                                    net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p(strP, "unknown"));
                                                    return;
                                                case 2:
                                                    pc pcVar2 = this.y;
                                                    zc zcVar = pcVar2.b.i;
                                                    boolean z = pcVar2.e;
                                                    mc mcVar = mc.a;
                                                    dd ddVar = (dd) zcVar.c.get();
                                                    if (ddVar == null && !z) {
                                                        com.google.common.util.concurrent.q0 q0Var = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    if ((zcVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zcVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i9 = zcVar.e;
                                                                if ((i9 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(mcVar);
                                                                    zcVar.e = i9 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (zcVar.h == null) {
                                                        synchronized (zcVar.g) {
                                                            try {
                                                                if (zcVar.h == null) {
                                                                    if (ddVar == null) {
                                                                        ddVar = yc.a;
                                                                    }
                                                                    Context context2 = zcVar.a;
                                                                    if (ea.s(context2)) {
                                                                        h0VarA = ((eb) zcVar.d.get()).a(new j5(zcVar, ddVar));
                                                                        zcVar.h = h0VarA;
                                                                    } else {
                                                                        wc wcVar = wc.y;
                                                                        com.google.common.base.t tVar = zcVar.b;
                                                                        h0VarA = com.google.common.util.concurrent.n0.g(ea.j(context2, Executors.callable(wcVar, null), (Executor) tVar.get()), new xc(i8, zcVar, ddVar), (Executor) tVar.get());
                                                                        zcVar.h = h0VarA;
                                                                    }
                                                                    h0VarA.a(new vc(h0VarA, i6), (Executor) zcVar.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    pc pcVar3 = this.y;
                                                    androidx.compose.material.ripple.g gVarA2 = pcVar3.a();
                                                    String str3 = (String) gVarA2.b;
                                                    na naVar3 = pcVar3.b;
                                                    com.google.common.base.t tVar2 = naVar3.d;
                                                    ed edVarB = naVar3.g.b();
                                                    boolean z2 = edVarB.i;
                                                    if (edVarB.j) {
                                                        if (com.google.common.base.i.u(str3) && !z2) {
                                                            com.google.common.util.concurrent.q0 q0Var2 = com.google.common.util.concurrent.q0.y;
                                                            return;
                                                        }
                                                        ua uaVarV = xa.v();
                                                        androidx.core.view.r rVar = (androidx.core.view.r) gVarA2.e;
                                                        int i10 = rVar.a;
                                                        va vaVarU = wa.u();
                                                        vaVarU.b();
                                                        ((wa) vaVarU.y).v(i10);
                                                        int i11 = rVar.b;
                                                        vaVarU.b();
                                                        ((wa) vaVarU.y).w(i11);
                                                        wa waVar = (wa) vaVarU.d();
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).x(waVar);
                                                        if (!com.google.common.base.i.u(str3)) {
                                                            uaVarV.b();
                                                            ((xa) uaVarV.y).w(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = pcVar3.c;
                                                            uaVarV.b();
                                                            ((xa) uaVarV.y).y(str4);
                                                        }
                                                        eb ebVar = (eb) tVar2.get();
                                                        xa xaVar = (xa) uaVarV.d();
                                                        z9 z9Var = ebVar.a;
                                                        androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
                                                        q0VarC.z = new s5(xaVar, 7);
                                                        q0VarC.A = new com.google.android.gms.common.d[]{h.a};
                                                        q0VarC.y = false;
                                                        aVarB = eb.b(z9Var.b(0, q0VarC.b()).d(com.google.common.util.concurrent.d0.e, new j5(i7, z9Var, xaVar)));
                                                    } else {
                                                        if (com.google.common.base.i.u(str3)) {
                                                            com.google.common.util.concurrent.q0 q0Var3 = com.google.common.util.concurrent.q0.y;
                                                            return;
                                                        }
                                                        eb ebVar2 = (eb) tVar2.get();
                                                        ebVar2.getClass();
                                                        str3.getClass();
                                                        aVarB = eb.b(ebVar2.a.c(str3));
                                                    }
                                                    com.google.common.util.concurrent.n0.a(aVarB, cb.class, new kc(pcVar3, i8), naVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                gVar = gVarA;
                            } else {
                                final int i6 = 0;
                                naVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.jc
                                    public final /* synthetic */ pc y;

                                    {
                                        this.y = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() throws Throwable {
                                        com.google.common.base.p pVar;
                                        com.google.common.util.concurrent.h0 h0VarA;
                                        com.google.common.util.concurrent.a aVarB;
                                        int i7 = 2;
                                        int i8 = 1;
                                        int i9 = 0;
                                        switch (i6) {
                                            case 0:
                                                this.y.b();
                                                return;
                                            case 1:
                                                pc pcVar = this.y;
                                                na naVar2 = pcVar.b;
                                                String str = pcVar.c;
                                                re reVar = uc.a;
                                                Object obj = f1.z;
                                                byte b = (byte) (((byte) 2) | 1);
                                                Context context = naVar2.b;
                                                Pattern pattern = xd.a;
                                                com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(context);
                                                y1Var.y0("phenotype");
                                                y1Var.z0("all_accounts.pb");
                                                Uri uriA0 = y1Var.A0();
                                                if (uriA0 == null) {
                                                    com.google.gson.b.h("Null uri");
                                                    return;
                                                }
                                                yb ybVarV = yb.v();
                                                if (ybVarV == null) {
                                                    com.google.gson.b.h("Null schema");
                                                    return;
                                                }
                                                re reVar2 = uc.a;
                                                reVar2.getClass();
                                                com.google.common.base.p pVar2 = new com.google.common.base.p(reVar2);
                                                byte b2 = (byte) (b | 2);
                                                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                                                com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                                                if (b2 != 3) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if ((b2 & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((2 & b2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(sb.toString()));
                                                    return;
                                                }
                                                je jeVar = new je(uriA0, ybVarV, pVar2, a1Var);
                                                androidx.compose.runtime.internal.c cVar = uc.c;
                                                if (cVar == null) {
                                                    synchronized (uc.b) {
                                                        try {
                                                            cVar = uc.c;
                                                            if (cVar == null) {
                                                                HashMap map = new HashMap();
                                                                com.google.common.util.concurrent.w0 w0VarA = naVar2.a();
                                                                td tdVar = (td) naVar2.f.get();
                                                                me meVar = me.a;
                                                                com.google.android.material.motion.a.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", meVar);
                                                                androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(w0VarA, tdVar, map);
                                                                uc.c = cVar2;
                                                                cVar = cVar2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    i8 = 1;
                                                    naVar2 = naVar2;
                                                    pVar2 = pVar2;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.e;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriA0);
                                                if (pairCreate == null) {
                                                    com.google.android.material.motion.a.h(uriA0.isHierarchical(), "Uri must be hierarchical: %s", uriA0);
                                                    String lastPathSegment = uriA0.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    com.google.android.material.motion.a.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriA0);
                                                    me meVar2 = (me) ((HashMap) cVar.B).get("singleproc");
                                                    com.google.android.material.motion.a.h(meVar2 != null ? i8 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriA0.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    String str2 = strSubstring;
                                                    com.google.common.util.concurrent.s sVarG = com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.d(uriA0), (db) cVar.A, com.google.common.util.concurrent.d0.e);
                                                    Executor executor = (Executor) cVar.y;
                                                    td tdVar2 = (td) cVar.z;
                                                    meVar2.getClass();
                                                    pVar = pVar2;
                                                    le leVar = new le(new androidx.compose.ui.node.a1(str2, com.google.common.util.concurrent.n0.d(uriA0), new se(ybVarV, a1.a()), executor, tdVar2, pVar2, new f1(19)), sVarG);
                                                    if (!a1Var.isEmpty()) {
                                                        xc xcVar = new xc(i8, a1Var, executor);
                                                        synchronized (leVar.g) {
                                                            leVar.i.add(xcVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(leVar, jeVar);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriA0, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                } else {
                                                    pVar = pVar2;
                                                }
                                                le leVar2 = (le) pairCreate.first;
                                                je jeVar2 = (je) pairCreate.second;
                                                if (jeVar.equals(jeVar2)) {
                                                    com.google.common.util.concurrent.t tVarA = leVar2.a(new nc(str, 1), naVar2.a());
                                                    tVarA.a(new lc(pcVar, tVarA, 0), naVar2.a());
                                                    return;
                                                }
                                                String strP = com.google.android.material.resources.b.p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", yb.class.getSimpleName(), uriA0);
                                                com.google.android.material.motion.a.h(uriA0.equals(jeVar2.a), strP, "uri");
                                                com.google.android.material.motion.a.h(ybVarV.equals(jeVar2.b), strP, "schema");
                                                com.google.android.material.motion.a.h(pVar.equals(jeVar2.c), strP, "handler");
                                                com.google.android.material.motion.a.h(a1Var.equals(jeVar2.d), strP, "migrations");
                                                com.google.android.material.motion.a.h(obj.equals(obj), strP, "variantConfig");
                                                net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p(strP, "unknown"));
                                                return;
                                            case 2:
                                                pc pcVar2 = this.y;
                                                zc zcVar = pcVar2.b.i;
                                                boolean z = pcVar2.e;
                                                mc mcVar = mc.a;
                                                dd ddVar = (dd) zcVar.c.get();
                                                if (ddVar == null && !z) {
                                                    com.google.common.util.concurrent.q0 q0Var = com.google.common.util.concurrent.q0.y;
                                                    return;
                                                }
                                                if ((zcVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zcVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i10 = zcVar.e;
                                                            if ((i10 & 64) == 0) {
                                                                copyOnWriteArrayList.add(mcVar);
                                                                zcVar.e = i10 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (zcVar.h == null) {
                                                    synchronized (zcVar.g) {
                                                        try {
                                                            if (zcVar.h == null) {
                                                                if (ddVar == null) {
                                                                    ddVar = yc.a;
                                                                }
                                                                Context context2 = zcVar.a;
                                                                if (ea.s(context2)) {
                                                                    h0VarA = ((eb) zcVar.d.get()).a(new j5(zcVar, ddVar));
                                                                    zcVar.h = h0VarA;
                                                                } else {
                                                                    wc wcVar = wc.y;
                                                                    com.google.common.base.t tVar = zcVar.b;
                                                                    h0VarA = com.google.common.util.concurrent.n0.g(ea.j(context2, Executors.callable(wcVar, null), (Executor) tVar.get()), new xc(i9, zcVar, ddVar), (Executor) tVar.get());
                                                                    zcVar.h = h0VarA;
                                                                }
                                                                h0VarA.a(new vc(h0VarA, i7), (Executor) zcVar.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                pc pcVar3 = this.y;
                                                androidx.compose.material.ripple.g gVarA2 = pcVar3.a();
                                                String str3 = (String) gVarA2.b;
                                                na naVar3 = pcVar3.b;
                                                com.google.common.base.t tVar2 = naVar3.d;
                                                ed edVarB = naVar3.g.b();
                                                boolean z2 = edVarB.i;
                                                if (edVarB.j) {
                                                    if (com.google.common.base.i.u(str3) && !z2) {
                                                        com.google.common.util.concurrent.q0 q0Var2 = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    ua uaVarV = xa.v();
                                                    androidx.core.view.r rVar = (androidx.core.view.r) gVarA2.e;
                                                    int i11 = rVar.a;
                                                    va vaVarU = wa.u();
                                                    vaVarU.b();
                                                    ((wa) vaVarU.y).v(i11);
                                                    int i12 = rVar.b;
                                                    vaVarU.b();
                                                    ((wa) vaVarU.y).w(i12);
                                                    wa waVar = (wa) vaVarU.d();
                                                    uaVarV.b();
                                                    ((xa) uaVarV.y).x(waVar);
                                                    if (!com.google.common.base.i.u(str3)) {
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).w(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = pcVar3.c;
                                                        uaVarV.b();
                                                        ((xa) uaVarV.y).y(str4);
                                                    }
                                                    eb ebVar = (eb) tVar2.get();
                                                    xa xaVar = (xa) uaVarV.d();
                                                    z9 z9Var = ebVar.a;
                                                    androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
                                                    q0VarC.z = new s5(xaVar, 7);
                                                    q0VarC.A = new com.google.android.gms.common.d[]{h.a};
                                                    q0VarC.y = false;
                                                    aVarB = eb.b(z9Var.b(0, q0VarC.b()).d(com.google.common.util.concurrent.d0.e, new j5(i8, z9Var, xaVar)));
                                                } else {
                                                    if (com.google.common.base.i.u(str3)) {
                                                        com.google.common.util.concurrent.q0 q0Var3 = com.google.common.util.concurrent.q0.y;
                                                        return;
                                                    }
                                                    eb ebVar2 = (eb) tVar2.get();
                                                    ebVar2.getClass();
                                                    str3.getClass();
                                                    aVarB = eb.b(ebVar2.a.c(str3));
                                                }
                                                com.google.common.util.concurrent.n0.a(aVarB, cb.class, new kc(pcVar3, i9), naVar3.a());
                                                return;
                                        }
                                    }
                                });
                                gVar = new androidx.compose.material.ripple.g(id.B(), (androidx.core.view.r) gVarA.e);
                            }
                        }
                        if (!this.e || ((androidx.core.view.r) gVar.e).b != 17) {
                            this.a = gVar;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final void b() {
        gd gdVar = this.h;
        na naVar = gdVar.a;
        eb ebVar = (eb) naVar.d.get();
        String str = gdVar.c;
        ebVar.getClass();
        str.getClass();
        z9 z9Var = ebVar.a;
        androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
        q0VarC.z = new sc(str, 1);
        com.google.common.util.concurrent.t tVarF = com.google.common.util.concurrent.n0.f(eb.b(z9Var.b(0, q0VarC.b()).j(com.google.common.util.concurrent.d0.e, new f1(13))), c3.A, naVar.a());
        kc kcVar = new kc(gdVar, 1);
        na naVar2 = this.b;
        com.google.common.util.concurrent.n0.g(tVarF, kcVar, naVar2.a()).a(new lc(this, tVarF, 1), naVar2.a());
    }
}
