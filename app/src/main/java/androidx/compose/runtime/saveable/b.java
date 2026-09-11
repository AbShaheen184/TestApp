package androidx.compose.runtime.saveable;

import android.content.Context;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.viewmodel.s;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(y0 y0Var, GameDetailResponse gameDetailResponse, String str, s sVar, y0 y0Var2, Context context) {
        this.z = y0Var;
        this.A = gameDetailResponse;
        this.y = str;
        this.B = sVar;
        this.C = y0Var2;
        this.D = context;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean z;
        switch (this.e) {
            case 0:
                c cVar = (c) this.z;
                l lVar = (l) this.A;
                h hVar = (h) this.B;
                Object[] objArr = (Object[]) this.D;
                boolean z2 = true;
                if (cVar.y != hVar) {
                    cVar.y = hVar;
                    z = true;
                } else {
                    z = false;
                }
                String str = cVar.z;
                String str2 = this.y;
                if (kotlin.jvm.internal.l.a(str, str2)) {
                    z2 = z;
                } else {
                    cVar.z = str2;
                }
                cVar.e = lVar;
                cVar.A = this.C;
                cVar.B = objArr;
                g gVar = cVar.C;
                if (gVar != null && z2) {
                    ((c2) gVar).f0();
                    cVar.C = null;
                    cVar.d();
                }
                break;
            default:
                y0 y0Var = (y0) this.z;
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.A;
                s sVar = (s) this.B;
                y0 y0Var2 = (y0) this.C;
                Context context = (Context) this.D;
                if (!((Boolean) y0Var2.getValue()).booleanValue() && !((Boolean) y0Var.getValue()).booleanValue()) {
                    String strJ = gameDetailResponse.j();
                    if (strJ == null) {
                        strJ = this.y;
                    }
                    String str3 = strJ;
                    androidx.compose.animation.core.a aVar = new androidx.compose.animation.core.a(17, y0Var, gameDetailResponse, context);
                    if (!((Boolean) sVar.q.getValue()).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(l0.g(sVar), null, null, new androidx.compose.animation.core.f(sVar, (GamePlatform) sVar.u.getValue(), str3, aVar, null, 17), 3, null);
                    }
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ b(c cVar, l lVar, h hVar, String str, Object obj, Object[] objArr) {
        this.z = cVar;
        this.A = lVar;
        this.B = hVar;
        this.y = str;
        this.C = obj;
        this.D = objArr;
    }
}
