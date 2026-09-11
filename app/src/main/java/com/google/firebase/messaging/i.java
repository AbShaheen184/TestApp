package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements com.google.android.gms.tasks.f {
    public final /* synthetic */ int e;
    public final /* synthetic */ FirebaseMessaging y;

    public /* synthetic */ i(FirebaseMessaging firebaseMessaging, int i) {
        this.e = i;
        this.y = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.f
    public final void b(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                if (!this.y.e.k() || sVar.h.a() == null) {
                    return;
                }
                synchronized (sVar) {
                    z = sVar.g;
                }
                if (z) {
                    return;
                }
                sVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.y;
                com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) obj;
                if (aVar != null) {
                    v.f(aVar.e);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
