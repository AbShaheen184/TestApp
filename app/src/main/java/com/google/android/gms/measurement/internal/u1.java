package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.x7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ t4 y;
    public final /* synthetic */ z1 z;

    public /* synthetic */ u1(z1 z1Var, t4 t4Var, int i) {
        this.e = i;
        this.y = t4Var;
        this.z = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.e) {
            case 0:
                z1 z1Var = this.z;
                z1Var.d.W();
                z1Var.d.Z(this.y);
                break;
            case 1:
                z1 z1Var2 = this.z;
                z1Var2.d.W();
                l4 l4Var = z1Var2.d;
                l4Var.e().v();
                l4Var.m0();
                t4 t4Var = this.y;
                com.google.android.gms.common.internal.x.g(t4Var);
                String str = t4Var.e;
                com.google.android.gms.common.internal.x.d(str);
                int i = 0;
                if (l4Var.f0().G(null, h0.y0)) {
                    l4Var.c().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iE = l4Var.f0().E(null, h0.h0);
                    l4Var.f0();
                    long jLongValue = jCurrentTimeMillis - ((Long) h0.e.a(null)).longValue();
                    while (i < iE && l4Var.I(null, jLongValue)) {
                        i++;
                    }
                } else {
                    l4Var.f0();
                    long jIntValue = ((Integer) h0.l.a(null)).intValue();
                    while (i < jIntValue && l4Var.I(str, 0L)) {
                        i++;
                    }
                }
                if (l4Var.f0().G(null, h0.z0)) {
                    l4Var.e().v();
                    l4Var.H();
                }
                i4 i4Var = l4Var.G;
                int i2 = com.google.android.datatransport.runtime.backends.c.i(t4Var.b0);
                i4Var.v();
                if (i2 == 2 && !i4.y(str)) {
                    l1 l1Var = i4Var.y.e;
                    l4.U(l1Var);
                    x7 x7VarH = l1Var.H(str);
                    if (x7VarH != null && x7VarH.I() && !x7VarH.J().v().isEmpty()) {
                        l4Var.b().K.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        l4Var.c().getClass();
                        l4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                z1 z1Var3 = this.z;
                z1Var3.d.W();
                l4 l4Var2 = z1Var3.d;
                l4Var2.e().v();
                l4Var2.m0();
                t4 t4Var2 = this.y;
                com.google.android.gms.common.internal.x.d(t4Var2.e);
                l4Var2.d0(t4Var2);
                break;
            case 3:
                z1 z1Var4 = this.z;
                z1Var4.d.W();
                l4 l4Var3 = z1Var4.d;
                if (l4Var3.V != null) {
                    ArrayList arrayList = new ArrayList();
                    l4Var3.W = arrayList;
                    arrayList.addAll(l4Var3.V);
                }
                m mVar = l4Var3.z;
                l4.U(mVar);
                s1 s1Var = (s1) mVar.e;
                t4 t4Var3 = this.y;
                String str2 = t4Var3.e;
                com.google.android.gms.common.internal.x.g(str2);
                com.google.android.gms.common.internal.x.d(str2);
                mVar.v();
                mVar.w();
                try {
                    SQLiteDatabase sQLiteDatabaseM0 = mVar.m0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM0.delete("upload_queue", "app_id=?", strArr);
                    if (s1Var.A.G(null, h0.c1)) {
                        iDelete += sQLiteDatabaseM0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.K.c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.c(x0.D(str2), e, "Error resetting analytics data. appId, error");
                }
                if (t4Var3.E) {
                    l4Var3.Z(t4Var3);
                }
                break;
            case 4:
                z1 z1Var5 = this.z;
                z1Var5.d.W();
                l4 l4Var4 = z1Var5.d;
                l4Var4.e().v();
                l4Var4.m0();
                t4 t4Var4 = this.y;
                com.google.android.gms.common.internal.x.d(t4Var4.e);
                l4Var4.n0(t4Var4);
                l4Var4.o0(t4Var4);
                break;
            case 5:
                l4 l4Var5 = this.z.d;
                l4Var5.W();
                l4Var5.o0(this.y);
                break;
            default:
                l4 l4Var6 = this.z.d;
                l4Var6.W();
                l4Var6.n0(this.y);
                break;
        }
    }
}
