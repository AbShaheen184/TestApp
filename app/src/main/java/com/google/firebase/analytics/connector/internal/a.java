package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.internal.g2;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.q;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final k0 a = k0.o("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final a1 b;
    public static final a1 c;
    public static final a1 d;

    static {
        e0 e0Var = h0.y;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        q.e(7, objArr);
        b = h0.j(7, objArr);
        Object[] objArr2 = {DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am"};
        q.e(3, objArr2);
        c = h0.j(3, objArr2);
        d = h0.t("_r", "_dbg");
        d0 d0Var = new d0(4);
        d0Var.f(g2.l);
        d0Var.f(g2.m);
        d0Var.g();
        h0.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
