package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ i y;

    public /* synthetic */ a(i iVar, int i) {
        this.e = i;
        this.y = iVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj;
                View view = this.y.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new c(0, aVar));
                    }
                }
                return y.a;
            case 1:
                ActionMode actionMode = this.y.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return y.a;
            case 2:
                ActionMode actionMode2 = this.y.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return y.a;
            default:
                i iVar = this.y;
                iVar.e.e();
                return new androidx.activity.compose.d(iVar, 5);
        }
    }
}
