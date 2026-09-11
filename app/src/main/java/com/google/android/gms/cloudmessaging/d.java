package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.q;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.google.android.gms.tasks.b, com.google.android.gms.tasks.h {
    public final /* synthetic */ int e;
    public static final /* synthetic */ d y = new d(0);
    public static final /* synthetic */ d z = new d(1);
    public static final /* synthetic */ d A = new d(2);

    public /* synthetic */ d(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) throws IOException {
        switch (this.e) {
            case 0:
                if (iVar.h()) {
                    return (Bundle) iVar.f();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(iVar.e())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", iVar.e());
            default:
                Intent intent = (Intent) ((Bundle) iVar.f()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.h
    public q e(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? kotlin.math.a.t(bundle) : kotlin.math.a.t(null);
    }
}
