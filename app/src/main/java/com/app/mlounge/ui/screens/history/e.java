package com.app.mlounge.ui.screens.history;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import com.app.mlounge.ui.viewmodel.t;
import com.app.mlounge.ui.viewmodel.w1;
import com.app.mlounge.ui.viewmodel.z1;
import java.util.List;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ y0 C;
    public final /* synthetic */ q0 D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ List z;

    public /* synthetic */ e(int i, List list, kotlin.jvm.functions.a aVar, q0 q0Var, Object obj, Context context, y0 y0Var, int i2) {
        this.e = i2;
        this.y = i;
        this.z = list;
        this.A = aVar;
        this.D = q0Var;
        this.E = obj;
        this.B = context;
        this.C = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                com.app.mlounge.data.local.entity.c cVar = (com.app.mlounge.data.local.entity.c) this.E;
                List list = this.z;
                int size = list.size() - 1;
                int i = this.y;
                if (i == size) {
                    this.A.invoke();
                } else {
                    this.C.setValue(((com.app.mlounge.data.local.entity.c) list.get(i + 1)).a);
                }
                t tVar = (t) this.D;
                String str = cVar.a;
                str.getClass();
                BuildersKt__Builders_commonKt.launch$default(l0.g(tVar), null, null, new androidx.room.coroutines.f(tVar, str, null, 24), 3, null);
                Toast.makeText(this.B, cVar.c + " removed from history", 0).show();
                break;
            default:
                com.app.mlounge.data.local.entity.f fVar = (com.app.mlounge.data.local.entity.f) this.E;
                List list2 = this.z;
                int size2 = list2.size() - 1;
                int i2 = this.y;
                if (i2 == size2) {
                    this.A.invoke();
                } else {
                    this.C.setValue(((com.app.mlounge.data.local.entity.f) list2.get(i2 + 1)).a);
                }
                z1 z1Var = (z1) this.D;
                String str2 = fVar.a;
                str2.getClass();
                BuildersKt__Builders_commonKt.launch$default(l0.g(z1Var), null, null, new w1(z1Var, str2, (kotlin.coroutines.d) null, 2), 3, null);
                Toast.makeText(this.B, fVar.c + " removed from favourites", 0).show();
                break;
        }
        return y.a;
    }
}
