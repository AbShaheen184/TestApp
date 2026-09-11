package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ v2 y;

    public /* synthetic */ j2(v2 v2Var, int i) {
        this.e = i;
        this.y = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.S();
                break;
            case 1:
                r1 r1Var = this.y.N;
                s1 s1Var = r1Var.e;
                p1 p1Var = s1Var.D;
                v2 v2Var = s1Var.J;
                g1 g1Var = s1Var.B;
                s1.m(p1Var);
                p1Var.v();
                if (r1Var.d()) {
                    if (r1Var.c()) {
                        s1.k(g1Var);
                        g1Var.T.v(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        s1.l(v2Var);
                        v2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
                    } else {
                        s1.k(g1Var);
                        androidx.compose.foundation.lazy.layout.b1 b1Var = g1Var.T;
                        String strT = b1Var.t();
                        if (TextUtils.isEmpty(strT)) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.D.a("Cache still valid but referrer not found");
                        } else {
                            long jG = g1Var.U.g() / 3600000;
                            Uri uri = Uri.parse(strT);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jG - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            s1.l(v2Var);
                            v2Var.C(str2, "_cmp", (Bundle) pair.second);
                        }
                        b1Var.v(null);
                    }
                    s1.k(g1Var);
                    g1Var.U.h(0L);
                    break;
                }
                break;
            case 2:
                v2 v2Var2 = this.y;
                v2Var2.v();
                s1 s1Var2 = (s1) v2Var2.e;
                g1 g1Var2 = s1Var2.B;
                x0 x0Var2 = s1Var2.C;
                s1.k(g1Var2);
                e1 e1Var = g1Var2.Q;
                if (e1Var.a()) {
                    s1.m(x0Var2);
                    x0Var2.J.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    androidx.media3.exoplayer.l1 l1Var = g1Var2.R;
                    long jG2 = l1Var.g();
                    l1Var.h(1 + jG2);
                    if (jG2 >= 5) {
                        s1.m(x0Var2);
                        x0Var2.F.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        e1Var.b(true);
                    } else {
                        if (v2Var2.P == null) {
                            v2Var2.P = new k2(v2Var2, s1Var2, 3);
                        }
                        v2Var2.P.b(0L);
                    }
                }
                break;
            default:
                this.y.S();
                break;
        }
    }
}
