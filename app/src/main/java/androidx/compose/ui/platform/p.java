package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, int i) {
        super(1);
        this.y = i;
        this.z = uVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                ((androidx.compose.ui.focus.p) this.z.getFocusOwner()).g(((androidx.compose.ui.focus.f) obj).a, false);
                return kotlin.y.a;
            case 1:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj;
                u uVar = this.z;
                uVar.getUncaughtExceptionHandler$ui();
                Handler handler = uVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = uVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new androidx.compose.foundation.text.contextmenu.internal.c(2, aVar));
                    }
                }
                return kotlin.y.a;
            default:
                u uVar2 = this.z;
                return new o0(uVar2, uVar2.getTextInputService(), (CoroutineScope) obj);
        }
    }
}
