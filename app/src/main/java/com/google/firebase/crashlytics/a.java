package com.google.firebase.crashlytics;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import com.google.android.gms.measurement.internal.c0;
import com.google.common.util.concurrent.g0;
import com.google.firebase.crashlytics.internal.common.p;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.google.firebase.crashlytics.internal.breadcrumbs.a, com.google.firebase.crashlytics.internal.analytics.a, com.google.firebase.inject.a {
    public final /* synthetic */ f e;

    public /* synthetic */ a(f fVar) {
        this.e = fVar;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public void b(p pVar) {
        f fVar = this.e;
        synchronized (fVar) {
            try {
                if (((com.google.firebase.crashlytics.internal.breadcrumbs.a) fVar.c) instanceof com.google.firebase.crashlytics.internal.breadcrumbs.b) {
                    ((ArrayList) fVar.a).add(pVar);
                }
                ((com.google.firebase.crashlytics.internal.breadcrumbs.a) fVar.c).b(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.inject.a
    public void e(com.google.firebase.inject.b bVar) {
        f fVar = this.e;
        com.google.firebase.crashlytics.internal.b bVar2 = com.google.firebase.crashlytics.internal.b.a;
        bVar2.b("AnalyticsConnector now available.");
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        com.google.android.material.internal.b bVar3 = new com.google.android.material.internal.b(aVar);
        g0 g0Var = new g0(2, false);
        com.google.firebase.analytics.connector.b bVar4 = (com.google.firebase.analytics.connector.b) aVar;
        c0 c0VarB = bVar4.b("clx", g0Var);
        if (c0VarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            c0VarB = bVar4.b("crash", g0Var);
            if (c0VarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (c0VarB == null) {
            bVar2.d(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        bVar2.b("Registered Firebase Analytics listener.");
        com.google.android.material.shape.c0 c0Var = new com.google.android.material.shape.c0();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(bVar3);
        synchronized (fVar) {
            try {
                Iterator it = ((ArrayList) fVar.a).iterator();
                while (it.hasNext()) {
                    c0Var.b((p) it.next());
                }
                g0Var.z = c0Var;
                g0Var.y = cVar;
                fVar.c = c0Var;
                fVar.b = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void l(Bundle bundle) {
        ((com.google.firebase.crashlytics.internal.analytics.a) this.e.b).l(bundle);
    }
}
