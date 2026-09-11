package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.y9;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ j1(l1 l1Var, String str, int i) {
        this.a = i;
        this.b = l1Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.a) {
            case 0:
                return new y9(new j1(this.b, this.c, 1));
            case 1:
                l1 l1Var = this.b;
                m mVar = l1Var.y.z;
                l4.U(mVar);
                String str = this.c;
                c1 c1VarZ0 = mVar.z0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((s1) l1Var.e).A.B();
                map.put("gmp_version", 161000L);
                if (c1VarZ0 != null) {
                    String strO = c1VarZ0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(c1VarZ0.Q()));
                    map.put("dynamite_version", Long.valueOf(c1VarZ0.b()));
                }
                return map;
            default:
                coil3.memory.c cVar = new coil3.memory.c(23, this.b, this.c, false);
                lb lbVar = new lb("internal.remoteConfig", 0);
                lbVar.y.put("getValue", new y9(lbVar, cVar));
                return lbVar;
        }
    }
}
