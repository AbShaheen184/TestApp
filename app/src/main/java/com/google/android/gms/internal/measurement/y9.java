package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends c4 {
    public final Object A;
    public final /* synthetic */ int z = 2;

    public y9(androidx.media3.exoplayer.dash.manifest.t tVar) {
        super("internal.logger");
        this.A = tVar;
        this.y.put("log", new wd(this, false, true));
        this.y.put("silent", new lb("silent", 1));
        ((c4) this.y.get("silent")).f("log", new wd(this, true, true));
        this.y.put("unmonitored", new lb("unmonitored", 2));
        ((c4) this.y.get("unmonitored")).f("log", new wd(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        TreeMap treeMap;
        switch (this.z) {
            case 0:
                ea.c(this.e, 3, list);
                String strD = ((j5) b7Var.z).f(b7Var, (d5) list.get(0)).d();
                d5 d5Var = (d5) list.get(1);
                j5 j5Var = (j5) b7Var.z;
                long jR = (long) ea.r(j5Var.f(b7Var, d5Var).h().doubleValue());
                d5 d5VarF = j5Var.f(b7Var, (d5) list.get(2));
                HashMap mapW = d5VarF instanceof a5 ? ea.w((a5) d5VarF) : new HashMap();
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) this.A;
                cVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapW.keySet()) {
                    HashMap map2 = ((b) cVar.y).c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, mapW.get(str), str));
                }
                ((ArrayList) cVar.A).add(new b(strD, jR, map));
                return d5.m;
            case 1:
                ea.c("getValue", 2, list);
                d5 d5VarF2 = ((j5) b7Var.z).f(b7Var, (d5) list.get(0));
                d5 d5VarF3 = ((j5) b7Var.z).f(b7Var, (d5) list.get(1));
                String strD2 = d5VarF2.d();
                coil3.memory.c cVar2 = (coil3.memory.c) this.A;
                Map map3 = (Map) ((com.google.android.gms.measurement.internal.l1) cVar2.z).A.get((String) cVar2.y);
                String str2 = (map3 == null || !map3.containsKey(strD2)) ? null : (String) map3.get(strD2);
                return str2 != null ? new g5(str2) : d5VarF3;
            case 2:
                return d5.m;
            case 3:
                try {
                    return ka.b(((com.google.android.gms.measurement.internal.j1) this.A).call());
                } catch (Exception unused) {
                    return d5.m;
                }
            default:
                ea.c(this.e, 3, list);
                ((j5) b7Var.z).f(b7Var, (d5) list.get(0)).d();
                d5 d5Var2 = (d5) list.get(1);
                j5 j5Var2 = (j5) b7Var.z;
                d5 d5VarF4 = j5Var2.f(b7Var, d5Var2);
                if (d5VarF4 instanceof c5) {
                    d5 d5VarF5 = j5Var2.f(b7Var, (d5) list.get(2));
                    if (d5VarF5 instanceof a5) {
                        a5 a5Var = (a5) d5VarF5;
                        HashMap map4 = a5Var.e;
                        if (map4.containsKey("type")) {
                            String strD3 = a5Var.e("type").d();
                            int iP = map4.containsKey("priority") ? ea.p(a5Var.e("priority").h().doubleValue()) : 1000;
                            j5 j5Var3 = (j5) this.A;
                            c5 c5Var = (c5) d5VarF4;
                            j5Var3.getClass();
                            if ("create".equals(strD3)) {
                                treeMap = (TreeMap) j5Var3.z;
                            } else if ("edit".equals(strD3)) {
                                treeMap = (TreeMap) j5Var3.y;
                            } else {
                                net.luminis.tls.engine.impl.c.r("Unknown callback type: ".concat(String.valueOf(strD3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iP))) {
                                iP = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iP), c5Var);
                            return d5.m;
                        }
                        net.luminis.tls.engine.impl.c.o("Undefined rule type");
                    } else {
                        net.luminis.tls.engine.impl.c.o("Invalid callback params");
                    }
                } else {
                    net.luminis.tls.engine.impl.c.o("Invalid callback type");
                }
                return null;
        }
    }

    public y9(com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        super("internal.eventLogger");
        this.A = cVar;
    }

    public y9(j5 j5Var) {
        super("internal.registerCallback");
        this.A = j5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(lb lbVar, coil3.memory.c cVar) {
        super("getValue");
        this.A = cVar;
    }

    public y9(com.google.android.gms.measurement.internal.j1 j1Var) {
        super("internal.appMetadata");
        this.A = j1Var;
    }
}
