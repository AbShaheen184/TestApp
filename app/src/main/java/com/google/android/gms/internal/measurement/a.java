package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                return new y9(((t5) this.b).c);
            case 1:
                return new y9(((t5) this.b).d);
            default:
                j5 j5Var = (j5) this.b;
                synchronized (((le) j5Var.z).g) {
                    j5Var.y = null;
                    break;
                }
                return null;
        }
    }
}
