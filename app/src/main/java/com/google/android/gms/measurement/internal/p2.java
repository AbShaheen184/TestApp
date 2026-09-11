package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.TreeSet;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ v2 z;

    public /* synthetic */ p2(v2 v2Var, Bundle bundle, int i) {
        this.e = i;
        this.y = bundle;
        this.z = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                v2 v2Var = this.z;
                v2Var.v();
                v2Var.w();
                Bundle bundle = this.y;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                com.google.android.gms.common.internal.x.d(string);
                com.google.android.gms.common.internal.x.d(string2);
                com.google.android.gms.common.internal.x.g(bundle.get(ES6Iterator.VALUE_PROPERTY));
                s1 s1Var = (s1) v2Var.e;
                if (!s1Var.d()) {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.K.a("Conditional property not set since app measurement is disabled");
                } else {
                    o4 o4Var = new o4(bundle.getLong("triggered_timestamp"), bundle.get(ES6Iterator.VALUE_PROPERTY), string, string2);
                    try {
                        r4 r4Var = s1Var.F;
                        s1.k(r4Var);
                        bundle.getString("app_id");
                        u uVarD0 = r4Var.d0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        s1.k(r4Var);
                        bundle.getString("app_id");
                        u uVarD1 = r4Var.d0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        s1Var.p().O(new e(bundle.getString("app_id"), string2, o4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), uVarD1, bundle.getLong("trigger_timeout"), uVarD0, bundle.getLong("time_to_live"), r4Var.d0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                v2 v2Var2 = this.z;
                v2Var2.v();
                v2Var2.w();
                Bundle bundle2 = this.y;
                String string3 = bundle2.getString("name");
                com.google.android.gms.common.internal.x.d(string3);
                s1 s1Var2 = (s1) v2Var2.e;
                if (!s1Var2.d()) {
                    x0 x0Var2 = s1Var2.C;
                    s1.m(x0Var2);
                    x0Var2.K.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    o4 o4Var2 = new o4(0L, null, string3, "");
                    try {
                        r4 r4Var2 = s1Var2.F;
                        s1.k(r4Var2);
                        bundle2.getString("app_id");
                        s1Var2.p().O(new e(bundle2.getString("app_id"), "", o4Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), r4Var2.d0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                v2 v2Var3 = this.z;
                androidx.media3.exoplayer.hls.c cVar = v2Var3.S;
                s1 s1Var3 = (s1) v2Var3.e;
                Bundle bundle3 = this.y;
                if (!bundle3.isEmpty()) {
                    g1 g1Var = s1Var3.B;
                    r4 r4Var3 = s1Var3.F;
                    g gVar = s1Var3.A;
                    x0 x0Var3 = s1Var3.C;
                    s1.k(g1Var);
                    Bundle bundle4 = new Bundle(g1Var.V.H());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            s1.k(r4Var3);
                            if (r4.I0(obj)) {
                                r4.N(cVar, null, 27, null, null, 0);
                            }
                            s1.m(x0Var3);
                            x0Var3.H.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (r4.a0(str)) {
                            s1.m(x0Var3);
                            x0Var3.H.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            s1.k(r4Var3);
                            gVar.getClass();
                            if (r4Var3.z("param", str, 500, obj)) {
                                r4Var3.M(bundle4, str, obj);
                            }
                        }
                    }
                    s1.k(r4Var3);
                    r4 r4Var4 = ((s1) gVar.e).F;
                    s1.k(r4Var4);
                    int i = r4Var4.g0(201500000) ? 100 : 25;
                    if (bundle4.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle4.remove(str2);
                            }
                        }
                        s1.k(r4Var3);
                        r4.N(cVar, null, 26, null, null, 0);
                        s1.m(x0Var3);
                        x0Var3.H.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                g1 g1Var2 = s1Var3.B;
                s1.k(g1Var2);
                g1Var2.V.I(bundle3);
                s1Var3.p().A(bundle3);
                break;
        }
    }
}
