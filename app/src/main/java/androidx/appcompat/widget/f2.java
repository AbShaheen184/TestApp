package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ((androidx.navigationevent.m) this.b).a();
                break;
        }
    }
}
