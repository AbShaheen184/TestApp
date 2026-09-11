package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ d(p pVar, int i) {
        this.e = i;
        this.y = pVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.reportFullyDrawn();
                return kotlin.y.a;
            case 1:
                return p.d(this.y);
            case 2:
                androidx.navigationevent.a aVar = new androidx.navigationevent.a();
                this.y.getNavigationEventDispatcher().b(aVar);
                return aVar;
            case 3:
                p pVar = this.y;
                return new o0(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
            default:
                p pVar2 = this.y;
                c0 c0Var = new c0(new b(pVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        pVar2.getLifecycle().a(new e(0, c0Var, pVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new c(0, pVar2, c0Var));
                    }
                }
                return c0Var;
        }
    }
}
