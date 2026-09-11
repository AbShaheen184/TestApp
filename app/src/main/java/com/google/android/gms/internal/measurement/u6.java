package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements Callable {
    public static final /* synthetic */ u6 b = new u6(0);
    public static final /* synthetic */ u6 c = new u6(1);
    public final /* synthetic */ int a;

    public /* synthetic */ u6(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                lb lbVar = new lb("internal.platform", 4);
                lbVar.y.put("getVersion", new lb("getVersion", 3));
                return lbVar;
            default:
                return null;
        }
    }
}
