package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z6 z6Var, Activity activity, w5 w5Var) {
        super(z6Var.e, true);
        this.B = 3;
        this.D = activity;
        this.E = w5Var;
        this.C = z6Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.B) {
            case 0:
                try {
                    Context context = (Context) this.D;
                    com.google.android.gms.common.internal.x.g(context);
                    String strA = com.google.android.gms.measurement.internal.g2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = com.google.android.gms.measurement.internal.g2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    z5 z5VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    a7 a7Var = (a7) this.C;
                    boolean z = boolValueOf == null || !boolValueOf.booleanValue();
                    a7Var.getClass();
                    try {
                        z5VarAsInterface = y5.asInterface(com.google.android.gms.dynamite.e.c(context, z ? com.google.android.gms.dynamite.e.c : com.google.android.gms.dynamite.e.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (com.google.android.gms.dynamite.b e) {
                        a7Var.b(e, true, false);
                    }
                    a7Var.f = z5VarAsInterface;
                    if (a7Var.f != null) {
                        int iA = com.google.android.gms.dynamite.e.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = com.google.android.gms.dynamite.e.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z2 = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j = iMax;
                        a7Var.g = j;
                        j6 j6Var = new j6(161000L, j, z2, (Bundle) this.E, com.google.android.gms.measurement.internal.g2.a(context));
                        boolean z3 = a7Var.g >= 169;
                        z5 z5Var = a7Var.f;
                        if (!z3) {
                            com.google.android.gms.common.internal.x.g(z5Var);
                            z5Var.initialize(new com.google.android.gms.dynamic.b(context), j6Var, this.e);
                        } else {
                            com.google.android.gms.common.internal.x.g(z5Var);
                            z5Var.initializeWithElapsedTime(new com.google.android.gms.dynamic.b(context), j6Var, this.e, this.y);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((a7) this.C).b(e2, true, false);
                    return;
                }
                break;
            case 1:
                z5 z5Var2 = ((a7) this.C).f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.getMaxUserProperties((String) this.D, (w5) this.E);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.E;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                z5 z5Var3 = ((z6) this.C).e.f;
                com.google.android.gms.common.internal.x.g(z5Var3);
                z5Var3.onActivityCreatedByScionActivityInfo(l6.d((Activity) this.D), bundle, this.y);
                break;
            default:
                z5 z5Var4 = ((z6) this.C).e.f;
                com.google.android.gms.common.internal.x.g(z5Var4);
                z5Var4.onActivitySaveInstanceStateByScionActivityInfo(l6.d((Activity) this.D), (w5) this.E, this.y);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public void b() {
        switch (this.B) {
            case 1:
                ((w5) this.E).w(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(a7 a7Var, Object obj, Object obj2, int i) {
        super(a7Var, true);
        this.B = i;
        this.D = obj;
        this.E = obj2;
        this.C = a7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z6 z6Var, Bundle bundle, Activity activity) {
        super(z6Var.e, true);
        this.B = 2;
        this.E = bundle;
        this.D = activity;
        this.C = z6Var;
    }
}
