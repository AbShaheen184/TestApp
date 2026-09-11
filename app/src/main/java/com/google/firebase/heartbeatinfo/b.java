package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.caverock.androidsvg.y1;
import com.google.firebase.components.r;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.google.firebase.components.e {
    public final /* synthetic */ int e;
    public final /* synthetic */ r y;

    public /* synthetic */ b(r rVar, int i) {
        this.e = i;
        this.y = rVar;
    }

    @Override // com.google.firebase.components.e
    public final Object b(y1 y1Var) {
        switch (this.e) {
            case 0:
                return new d((Context) y1Var.a(Context.class), ((com.google.firebase.g) y1Var.a(com.google.firebase.g.class)).d(), y1Var.d(r.a(e.class)), y1Var.c(com.google.firebase.platforminfo.b.class), (Executor) y1Var.f(this.y));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.y, y1Var);
        }
    }
}
