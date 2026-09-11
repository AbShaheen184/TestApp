package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.compose.foundation.gestures.z1;
import androidx.compose.ui.node.a1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Handler.Callback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ l(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.e) {
            case 0:
                p pVar = (p) this.y;
                n nVar = pVar.c;
                nVar.getClass();
                for (o oVar : pVar.d) {
                    if (!oVar.d && oVar.c) {
                        androidx.media3.common.o oVarC = oVar.b.c();
                        oVar.b = new z1();
                        oVar.c = false;
                        nVar.c(oVar.a, oVarC);
                    }
                    g0 g0Var = pVar.b;
                    g0Var.getClass();
                    if (g0Var.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                a1 a1Var = (a1) this.y;
                int i = message.what;
                if (i == 1) {
                    ((z) a1Var.h).a();
                    return true;
                }
                if (i == 2) {
                    ((a0) a1Var.i).a();
                    return true;
                }
                if (i == 3) {
                    ((b0) a1Var.j).a();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                ((c0) a1Var.k).a();
                return true;
        }
    }
}
