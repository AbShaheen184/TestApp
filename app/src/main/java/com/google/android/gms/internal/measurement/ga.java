package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ga extends a5 {
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c y;

    public ga(com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this.y = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.a5, com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.y;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    ea.c("getEventName", 0, arrayList);
                    return new g5(((b) cVar.z).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    ea.c("getTimestamp", 0, arrayList);
                    return new j3(Double.valueOf(((b) cVar.z).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    ea.c("getParamValue", 1, arrayList);
                    String strD = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d();
                    HashMap map = ((b) cVar.z).c;
                    return ka.b(map.containsKey(strD) ? map.get(strD) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    ea.c("getParams", 0, arrayList);
                    HashMap map2 = ((b) cVar.z).c;
                    a5 a5Var = new a5();
                    for (String str2 : map2.keySet()) {
                        a5Var.f(str2, ka.b(map2.get(str2)));
                    }
                    return a5Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    ea.c("setParamValue", 2, arrayList);
                    String strD2 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d();
                    d5 d5VarF = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                    b bVar = (b) cVar.z;
                    Object objU = ea.u(d5VarF);
                    HashMap map3 = bVar.c;
                    if (objU == null) {
                        map3.remove(strD2);
                        return d5VarF;
                    }
                    map3.put(strD2, b.b(map3.get(strD2), objU, strD2));
                    return d5VarF;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    ea.c("setEventName", 1, arrayList);
                    d5 d5VarF2 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    if (d5.m.equals(d5VarF2) || d5.n.equals(d5VarF2)) {
                        net.luminis.tls.engine.impl.c.o("Illegal event name");
                        return null;
                    }
                    ((b) cVar.z).a = d5VarF2.d();
                    return new g5(d5VarF2.d());
                }
                break;
        }
        return super.j(str, b7Var, arrayList);
    }
}
