package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.b2;
import androidx.datastore.core.j0;
import androidx.datastore.core.z;
import androidx.lifecycle.l0;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.repository.b0;
import com.app.mlounge.ui.viewmodel.o0;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y0;
import com.app.mlounge.ui.viewmodel.z1;
import com.appsalt.internal.g1;
import com.appsalt.internal.g5;
import com.appsalt.internal.r0;
import com.google.firebase.sessions.b1;
import com.google.firebase.sessions.e1;
import com.google.firebase.sessions.k0;
import java.util.ArrayList;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object objG;
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                if (Build.VERSION.SDK_INT >= 34) {
                    e.b(oVar.l(), (View) oVar.y);
                }
                return y.a;
            case 1:
                ((b2) this.y).e.h(((Number) obj).floatValue());
                return y.a;
            case 2:
                z zVar = (z) this.y;
                return ((zVar.h.b() instanceof j0) || (objG = z.g(zVar, true, dVar)) != kotlin.coroutines.intrinsics.a.e) ? y.a : objG;
            case 3:
                ((MainActivity) this.y).setRequestedOrientation(((Boolean) obj).booleanValue() ? -1 : 0);
                return y.a;
            case 4:
                b0 b0Var = (b0) obj;
                if (b0Var.c) {
                    ((ArrayList) this.y).addAll(b0Var.b);
                }
                return y.a;
            case 5:
                kotlin.k kVar = (kotlin.k) obj;
                Integer num = (Integer) kVar.e;
                int iIntValue = ((Number) kVar.y).intValue();
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (iIntValue > 0 && iIntValue2 >= iIntValue - 6) {
                    y0 y0Var = (y0) this.y;
                    String str = (String) y0Var.h.getValue();
                    if (str.length() >= 2 && !((Boolean) y0Var.F.getValue()).booleanValue()) {
                        int iIntValue3 = ((Number) y0Var.H.getValue()).intValue();
                        boolean z = iIntValue3 == 0 && y0Var.S < y0Var.T;
                        boolean z2 = iIntValue3 == 1 && y0Var.U < y0Var.V;
                        boolean z3 = iIntValue3 == 2 && y0Var.X;
                        int iIntValue4 = ((Number) y0Var.J.getValue()).intValue();
                        boolean z4 = iIntValue3 == 3 && iIntValue4 == 0 && y0Var.a0 < y0Var.b0;
                        boolean z5 = iIntValue3 == 3 && iIntValue4 == 1 && y0Var.c0 < y0Var.d0;
                        boolean z6 = iIntValue3 == 3 && iIntValue4 == 2 && y0Var.e0 < y0Var.f0;
                        boolean z7 = iIntValue3 == 3 && iIntValue4 == 3 && y0Var.g0 < y0Var.h0;
                        boolean z8 = iIntValue3 == 5 && y0Var.j0 && y0Var.i0 != null;
                        boolean z9 = iIntValue3 == 6 && y0Var.Y < y0Var.Z;
                        if (z || z2 || z3 || z4 || z5 != 0 || z6 || z7 || z8 || z9) {
                            BuildersKt__Builders_commonKt.launch$default(l0.g(y0Var), null, null, new o0(y0Var, z, str, z2, z3, z4, z5, z6, z7, z8, z9, null), 3, null);
                        }
                    }
                }
                return y.a;
            case 6:
                com.app.mlounge.ui.viewmodel.j0 j0Var = (com.app.mlounge.ui.viewmodel.j0) obj;
                ((kotlin.jvm.functions.w) this.y).b(j0Var.a, j0Var.b, j0Var.c, j0Var.d, new Integer(j0Var.e), j0Var.f, new Integer(j0Var.g), new Integer(j0Var.h), j0Var.i);
                return y.a;
            case 7:
                kotlin.k kVar2 = (kotlin.k) obj;
                int iIntValue5 = ((Number) kVar2.e).intValue();
                int iIntValue6 = ((Number) kVar2.y).intValue();
                x1 x1Var = (x1) this.y;
                x1Var.k.h(iIntValue5);
                x1Var.l.h(iIntValue6);
                return y.a;
            case 8:
                kotlin.k kVar3 = (kotlin.k) obj;
                int iIntValue7 = ((Number) kVar3.e).intValue();
                int iIntValue8 = ((Number) kVar3.y).intValue();
                z1 z1Var = (z1) this.y;
                z1Var.k.h(iIntValue7);
                z1Var.l.h(iIntValue8);
                return y.a;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((com.app.mlounge.ui.viewmodel.s) this.y).J.setValue(bool);
                return y.a;
            case 10:
                g1 g1Var = (g1) obj;
                com.appsalt.internal.g gVar = (com.appsalt.internal.g) this.y;
                gVar.b.getClass();
                if (gVar.m && !kotlin.text.k.d0(gVar.f)) {
                    int iE = androidx.constraintlayout.core.g.e(g1Var.b);
                    if (iE != 0) {
                        if (iE == 1) {
                            int iE2 = androidx.constraintlayout.core.g.e(g1Var.a);
                            if (iE2 == 0) {
                                gVar.j.b(true);
                                r0 r0Var = gVar.h;
                                gVar.j = r0Var;
                                r0Var.c(gVar.f, true);
                            } else if (iE2 == 1) {
                                gVar.j.b(true);
                                g5 g5Var = gVar.i;
                                gVar.j = g5Var;
                                g5Var.c(gVar.f, true);
                            } else {
                                coil3.g.a();
                            }
                        } else {
                            coil3.g.a();
                        }
                        return null;
                    }
                    gVar.j.a();
                }
                return y.a;
            default:
                k0 k0Var = (k0) obj;
                e1 e1Var = (e1) this.y;
                k0Var.getClass();
                e1Var.h = k0Var;
                if (e1Var.j) {
                    e1Var.j = false;
                    e1Var.c();
                }
                Object objA = e1.a(e1Var, k0Var.a.a, b1.e, dVar);
                return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
        }
    }
}
