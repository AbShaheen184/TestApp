package com.google.firebase.crashlytics.internal;

import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.firebase.components.p;
import com.google.firebase.crashlytics.internal.model.k1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new l(this, 4));
    }

    public final b a() {
        a aVar = (a) this.b.get();
        return aVar == null ? c : aVar.a();
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.c();
    }

    public final void d(String str, long j, k1 k1Var) {
        String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strH, null);
        }
        this.a.a(new i(str, j, k1Var));
    }
}
