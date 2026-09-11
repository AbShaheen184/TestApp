package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.u1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.unit.c y;
    public final /* synthetic */ androidx.compose.runtime.y0 z;

    public /* synthetic */ f1(androidx.compose.ui.unit.c cVar, androidx.compose.runtime.y0 y0Var, int i) {
        this.e = i;
        this.y = cVar;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                h1 h1Var = new h1(0, (kotlin.jvm.functions.a) obj);
                f1 f1Var = new f1(this.y, this.z, 1);
                if (androidx.compose.foundation.h1.a()) {
                    return androidx.compose.foundation.h1.a() ? new androidx.compose.foundation.e1(h1Var, f1Var, Build.VERSION.SDK_INT == 28 ? u1.b : u1.c) : androidx.compose.ui.o.b;
                }
                com.google.gson.b.r("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                androidx.compose.ui.unit.h hVar = (androidx.compose.ui.unit.h) obj;
                float fB = androidx.compose.ui.unit.h.b(hVar.a);
                androidx.compose.ui.unit.c cVar = this.y;
                this.z.setValue(new androidx.compose.ui.unit.l((((long) cVar.g0(fB)) << 32) | (((long) cVar.g0(androidx.compose.ui.unit.h.a(hVar.a))) & 4294967295L)));
                return kotlin.y.a;
        }
    }
}
