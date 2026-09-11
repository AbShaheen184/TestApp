package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public v1(f3 f3Var, Bundle bundle, c3 c3Var, c3 c3Var2, long j) {
        this.e = 2;
        this.y = bundle;
        this.z = c3Var;
        this.B = c3Var2;
        this.A = j;
        Objects.requireNonNull(f3Var);
        this.C = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                String str = (String) this.z;
                z1 z1Var = (z1) this.C;
                String str2 = (String) this.y;
                if (str2 != null) {
                    c3 c3Var = new c3(this.A, (String) this.B, str2);
                    l4 l4Var = z1Var.d;
                    l4Var.e().v();
                    String str3 = l4Var.d0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    l4Var.d0 = str;
                    l4Var.c0 = c3Var;
                } else {
                    l4 l4Var2 = z1Var.d;
                    l4Var2.e().v();
                    String str4 = l4Var2.d0;
                    if (str4 == null || str4.equals(str)) {
                        l4Var2.d0 = str;
                        l4Var2.c0 = null;
                    }
                }
                break;
            case 1:
                v2 v2Var = (v2) this.C;
                String str5 = (String) this.y;
                String str6 = (String) this.z;
                v2Var.G(this.A, this.B, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.y;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                f3 f3Var = (f3) this.C;
                r4 r4Var = ((s1) f3Var.e).F;
                s1.k(r4Var);
                f3Var.B((c3) this.z, (c3) this.B, this.A, true, r4Var.F("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ v1(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.e = i;
        this.y = str;
        this.z = str2;
        this.B = obj2;
        this.A = j;
        this.C = obj;
    }
}
