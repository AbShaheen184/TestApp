package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.app.mlounge.ui.viewmodel.w1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final com.google.firebase.g a;
    public final com.google.firebase.sessions.settings.j b;

    public o(com.google.firebase.g gVar, com.google.firebase.sessions.settings.j jVar, kotlin.coroutines.i iVar, y0 y0Var) {
        gVar.getClass();
        jVar.getClass();
        iVar.getClass();
        y0Var.getClass();
        this.a = gVar;
        this.b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.5.");
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(y0Var);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(iVar), null, null, new w1(this, y0Var, (kotlin.coroutines.d) null, 10), 3, null);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
