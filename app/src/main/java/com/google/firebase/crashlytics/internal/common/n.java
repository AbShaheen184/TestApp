package com.google.firebase.crashlytics.internal.common;

import com.appsalt.internal.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ q y;
    public final /* synthetic */ j0 z;

    public /* synthetic */ n(q qVar, j0 j0Var, int i) {
        this.e = i;
        this.y = qVar;
        this.z = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.a(this.z);
                break;
            default:
                this.y.a(this.z);
                break;
        }
    }
}
