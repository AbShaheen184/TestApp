package androidx.compose.foundation.lazy.layout;

import android.os.Bundle;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.internal.z y;

    public /* synthetic */ y0(int i, kotlin.jvm.internal.z zVar) {
        this.e = i;
        this.y = zVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                z1 z1Var = (z1) obj;
                z1Var.getClass();
                m0 m0Var = ((i1) z1Var).L;
                kotlin.jvm.internal.z zVar = this.y;
                List listS = (List) zVar.e;
                if (listS != null) {
                    listS.add(m0Var);
                } else {
                    listS = com.google.common.base.c.s(m0Var);
                }
                zVar.e = listS;
                return y1.y;
            default:
                String str = (String) obj;
                str.getClass();
                Object obj2 = this.y.e;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
        }
    }
}
