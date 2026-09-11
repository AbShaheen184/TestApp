package androidx.compose.animation;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.e2;
import androidx.compose.ui.layout.l1;
import androidx.compose.ui.platform.z1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, int i) {
        super(0);
        this.y = i;
        this.z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0112 A[LOOP:0: B:53:0x00dc->B:63:0x0112, LOOP_END] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.compose.runtime.y yVar;
        switch (this.y) {
            case 0:
                e2 e2Var = (e2) this.z;
                Object objN = e2Var.a.n();
                m0 m0Var = m0.z;
                return Boolean.valueOf(objN == m0Var && e2Var.d.getValue() == m0Var);
            case 1:
                ((androidx.compose.ui.focus.e0) this.z).N0();
                return kotlin.y.a;
            case 2:
                androidx.compose.runtime.h1 h1Var = ((androidx.compose.ui.graphics.vector.j0) this.z).F;
                kotlin.y yVar2 = kotlin.y.a;
                h1Var.setValue(yVar2);
                return yVar2;
            case 3:
                return ((androidx.compose.ui.input.nestedscroll.d) this.z).d;
            case 4:
                return ((androidx.compose.ui.input.nestedscroll.i) this.z).L0();
            case 5:
                androidx.compose.ui.layout.f0 f0Var = (androidx.compose.ui.layout.f0) this.z;
                if (!((Boolean) f0Var.g.getValue()).booleanValue() && (yVar = f0Var.c) != null) {
                    yVar.l();
                }
                return kotlin.y.a;
            case 6:
                androidx.compose.ui.layout.m0 m0VarA = ((l1) this.z).a();
                androidx.compose.ui.node.f0 f0Var2 = m0VarA.e;
                if (m0VarA.K != ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var2.o()).y).z) {
                    androidx.collection.o0 o0Var = m0VarA.C;
                    Object[] objArr = o0Var.c;
                    long[] jArr = o0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        ((androidx.compose.ui.layout.f0) objArr[(i << 3) + i3]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i2 == 8) {
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            } else if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (f0Var2.F != null) {
                        if (!f0Var2.e0.e) {
                            androidx.compose.ui.node.f0.T(f0Var2, false, 7);
                        }
                    } else if (!f0Var2.r()) {
                        androidx.compose.ui.node.f0.V(f0Var2, false, 7);
                    }
                }
                return kotlin.y.a;
            case 7:
                androidx.compose.ui.node.j0 j0Var = ((androidx.compose.ui.node.f0) this.z).e0;
                j0Var.p.V = true;
                androidx.compose.ui.node.r0 r0Var = j0Var.q;
                if (r0Var != null) {
                    r0Var.P = true;
                }
                return kotlin.y.a;
            case 8:
                CoroutineScopeKt.cancel$default(((androidx.compose.ui.platform.o0) this.z).z, null, 1, null);
                return kotlin.y.a;
            case 9:
                return kotlin.y.a;
            case 10:
                androidx.compose.runtime.retain.c cVar = (androidx.compose.runtime.retain.c) ((z1) this.z).a.y;
                if (!cVar.y) {
                    if (cVar.z) {
                        androidx.compose.runtime.retain.impl.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.z = true;
                }
                return kotlin.y.a;
            case 11:
                androidx.compose.ui.spatial.b bVar = (androidx.compose.ui.spatial.b) this.z;
                bVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    return kotlin.y.a;
                } finally {
                    Trace.endSection();
                }
            case 12:
                Object systemService = ((View) ((c2) this.z).y).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                return new BaseInputConnection(((androidx.compose.ui.text.input.a0) this.z).a, false);
            case 14:
                return (androidx.compose.ui.geometry.c) this.z;
            default:
                androidx.compose.ui.window.z zVar = (androidx.compose.ui.window.z) this.z;
                androidx.compose.ui.layout.x parentLayoutCoordinates = zVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.l()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || zVar.m11getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }
}
