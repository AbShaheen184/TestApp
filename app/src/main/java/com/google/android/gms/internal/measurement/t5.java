package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 {
    public final b7 a;
    public b7 b;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c c;
    public final j5 d;

    public t5() {
        b7 b7Var = new b7();
        this.a = b7Var;
        this.b = ((b7) b7Var.y).d();
        this.c = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(3);
        this.d = new j5(11);
        a aVar = new a(this, 1);
        s5 s5Var = (s5) b7Var.B;
        ((HashMap) s5Var.y).put("internal.registerCallback", aVar);
        ((HashMap) s5Var.y).put("internal.eventLogger", new a(this, 0));
    }

    public final boolean a(b bVar) throws h6 {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.c;
        try {
            cVar.y = bVar;
            cVar.z = bVar.clone();
            ((ArrayList) cVar.A).clear();
            ((b7) this.a.A).f("runtime.counter", new j3(Double.valueOf(0.0d)));
            this.d.h(this.b.d(), cVar);
            return (((b) cVar.z).equals((b) cVar.y) && ((ArrayList) cVar.A).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new h6(th);
        }
    }

    public final void b(n9 n9Var) throws h6 {
        c4 c4Var;
        try {
            b7 b7Var = this.a;
            this.b = ((b7) b7Var.y).d();
            if (b7Var.b(this.b, (o9[]) n9Var.u().toArray(new o9[0])) instanceof r2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (m9 m9Var : n9Var.v().u()) {
                List listV = m9Var.v();
                String strU = m9Var.u();
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    d5 d5VarB = b7Var.b(this.b, (o9) it.next());
                    if (!(d5VarB instanceof a5)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    b7 b7Var2 = this.b;
                    if (b7Var2.e(strU)) {
                        d5 d5VarH = b7Var2.h(strU);
                        if (!(d5VarH instanceof c4)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strU)));
                        }
                        c4Var = (c4) d5VarH;
                    } else {
                        c4Var = null;
                    }
                    if (c4Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strU)));
                    }
                    c4Var.a(this.b, Collections.singletonList(d5VarB));
                }
            }
        } catch (Throwable th) {
            throw new h6(th);
        }
    }
}
