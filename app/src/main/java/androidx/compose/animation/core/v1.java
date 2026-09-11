package androidx.compose.animation.core;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import com.app.mlounge.data.remote.model.SportsMatch;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v1(int i, String str, androidx.compose.runtime.e1 e1Var) {
        this.e = 10;
        this.y = i;
        this.z = str;
        this.A = e1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).intValue();
                ((e2) this.z).a(this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.s.b((androidx.compose.ui.r) this.z, (kotlin.jvm.functions.l) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.lazy.m) this.z).d(this.y, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.lazy.grid.i) this.z).d(this.y, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 4:
                androidx.compose.foundation.lazy.layout.y yVar = (androidx.compose.foundation.lazy.layout.y) this.z;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yVar.d(this.y, this.A, rVar, 0);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 5:
                ((Integer) obj2).getClass();
                p3.a((androidx.compose.ui.text.m0) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                androidx.compose.runtime.s.a((androidx.appcompat.widget.r) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                androidx.compose.runtime.s.b((androidx.appcompat.widget.r[]) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.z).e(this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y) | 1);
                break;
            case 9:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.z;
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.A;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                if (!com.app.mlounge.ui.h0.b(y0Var)) {
                    y0Var.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.h0.f(yVar2, str, str2, (936 & 8) != 0 ? null : null, "movie", (936 & 32) != 0 ? null : null, this.y, 0, 0, "");
                }
                return kotlin.y.a;
            case 10:
                String str3 = (String) this.z;
                androidx.compose.runtime.e1 e1Var = (androidx.compose.runtime.e1) this.A;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(str3, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), e1Var.g() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).n, rVar2, 48, 0, 131064);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            case 11:
                ((Integer) obj2).intValue();
                com.app.mlounge.ui.screens.livetv.a.e((SportsMatch) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.i0.f((androidx.compose.ui.graphics.vector.f) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            default:
                com.app.mlounge.ui.viewmodel.z1 z1Var = (com.app.mlounge.ui.viewmodel.z1) this.z;
                String str4 = (String) this.A;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.b(str4, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), z1Var.j.g() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).n, rVar3, 48, 0, 131064);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v1(androidx.compose.foundation.lazy.layout.y yVar, int i, Object obj, int i2, int i3) {
        this.e = i3;
        this.z = yVar;
        this.y = i;
        this.A = obj;
    }

    public /* synthetic */ v1(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
        this.A = obj2;
    }

    public /* synthetic */ v1(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }
}
