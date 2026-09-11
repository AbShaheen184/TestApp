package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc implements com.google.common.base.f {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ nc(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.e) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((pc) this.y).c)), (Throwable) obj);
                return null;
            case 1:
                yb ybVar = (yb) obj;
                re reVar = uc.a;
                String str = (String) this.y;
                ub ubVar = (ub) ybVar.u(str, vb.v()).l();
                if (!Collections.unmodifiableList(((vb) ubVar.y).u()).contains("")) {
                    ubVar.b();
                    ((vb) ubVar.y).w("");
                }
                xb xbVar = (xb) ybVar.l();
                ubVar.b();
                ((vb) ubVar.y).x("");
                vb vbVar = (vb) ubVar.d();
                xbVar.b();
                ((yb) xbVar.y).w().put(str, vbVar);
                return (yb) xbVar.d();
            default:
                ld ldVar = (ld) this.y;
                tb tbVar = (tb) obj;
                j5 j5Var = new j5(7);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (ld.j) {
                            td tdVar = (td) ldVar.d.get();
                            Uri uri = ldVar.g;
                            j5 j5Var2 = new j5(tbVar.u());
                            j5Var2.z = new j5[]{j5Var};
                            tdVar.a(uri, j5Var2);
                            ldVar.h = tbVar.u();
                            break;
                        }
                        synchronized (ld.k) {
                            td tdVar2 = (td) ldVar.d.get();
                            Uri uri2 = ldVar.i;
                            j5 j5Var3 = new j5(tbVar.v());
                            j5Var3.z = new j5[]{j5Var};
                            tdVar2.a(uri2, j5Var3);
                            tbVar.v();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
