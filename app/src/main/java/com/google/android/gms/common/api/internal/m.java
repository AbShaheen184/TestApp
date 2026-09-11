package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.common.util.concurrent.l0;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.android.gms.common.internal.d {
    public Object B;
    public Object C;
    public Object y;
    public Object z;
    public Object A = new LinkedHashMap();
    public boolean e = true;

    public synchronized boolean a() {
        boolean zH;
        Boolean bool = (Boolean) this.B;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((com.google.firebase.g) this.y).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        b(zH);
        return zH;
    }

    public void b(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.B) == null) {
            str = "global Firebase setting";
        } else {
            str = this.e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strJ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strJ, null);
        }
    }

    public void c(com.google.android.gms.common.b bVar) {
        k kVar = (k) ((e) this.C).G.get((b) this.z);
        if (kVar != null) {
            kVar.q(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.d
    public void i(com.google.android.gms.common.b bVar) {
        ((e) this.C).J.post(new l0(6, this, bVar, false));
    }
}
