package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements com.google.common.base.t {
    public final /* synthetic */ int e;
    public final Context y;

    public oa(Context context) {
        this.e = 3;
        new ConcurrentHashMap();
        ka.e(context != null, "Context cannot be null", new Object[0]);
        this.y = context.getApplicationContext();
    }

    @Override // com.google.common.base.t
    public Object get() {
        int i = this.e;
        Context context = this.y;
        switch (i) {
            case 0:
                Object obj = na.j;
                final com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1();
                y1Var.a = context;
                context.getClass();
                if (((com.google.common.base.t) y1Var.b) == null) {
                    y1Var.b = na.m;
                }
                final int i2 = 1;
                if (((com.google.common.base.t) y1Var.c) == null) {
                    y1Var.c = com.google.android.material.resources.c.n(new oa((Context) y1Var.a, i2));
                }
                if (((ma) y1Var.d) == null) {
                    y1Var.d = new com.google.common.base.t() { // from class: com.google.android.gms.internal.measurement.ma
                        @Override // com.google.common.base.t
                        public final Object get() {
                            int i3 = i2;
                            com.caverock.androidsvg.y1 y1Var2 = y1Var;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) y1Var2.a;
                                    Object obj2 = na.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new com.google.common.base.p(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return com.google.common.base.a.e;
                                    }
                                default:
                                    return new com.google.common.base.p(new bd((com.google.common.base.t) y1Var2.b));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((com.google.common.base.t) y1Var.e) == null) {
                    Context context2 = (Context) y1Var.a;
                    ArrayList arrayList = new ArrayList();
                    vd vdVar = new vd(new oa(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, vdVar, new yd());
                    y1Var.e = com.google.android.material.resources.c.n(new s5(arrayList, 11));
                }
                if (((ma) y1Var.f) == null) {
                    y1Var.f = new com.google.common.base.t() { // from class: com.google.android.gms.internal.measurement.ma
                        @Override // com.google.common.base.t
                        public final Object get() {
                            int i4 = i3;
                            com.caverock.androidsvg.y1 y1Var2 = y1Var;
                            switch (i4) {
                                case 0:
                                    Context context3 = (Context) y1Var2.a;
                                    Object obj2 = na.j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new com.google.common.base.p(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return com.google.common.base.a.e;
                                    }
                                default:
                                    return new com.google.common.base.p(new bd((com.google.common.base.t) y1Var2.b));
                            }
                        }
                    };
                }
                return new na((Context) y1Var.a, (com.google.common.base.t) y1Var.b, (com.google.common.base.t) y1Var.c, (ma) y1Var.d, (com.google.common.base.t) y1Var.e, (ma) y1Var.f);
            case 1:
                Object obj2 = na.j;
                return new eb(new z9(context, e1.a, com.google.android.gms.common.api.b.a, com.google.android.gms.common.api.e.c));
            default:
                Object obj3 = ra.a;
                return ka.c(context);
        }
    }

    public /* synthetic */ oa(Context context, int i) {
        this.e = i;
        this.y = context;
    }
}
