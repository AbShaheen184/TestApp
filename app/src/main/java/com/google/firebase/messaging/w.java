package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.material.shape.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Binder {
    public final c0 d;

    public w(c0 c0Var) {
        this.d = c0Var;
    }

    public final void a(x xVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = xVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.d.e;
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        firebaseMessagingService.e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(6, firebaseMessagingService, intent, jVar));
        jVar.a.a(new androidx.arch.core.executor.a(2), new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(xVar, 9));
    }
}
