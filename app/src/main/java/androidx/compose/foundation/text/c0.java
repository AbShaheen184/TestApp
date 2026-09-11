package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.k2;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public c0(androidx.compose.ui.focus.l lVar, r0 r0Var) {
        this.e = 1;
        this.z = lVar;
        this.y = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03b3  */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        long j;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                if (((r0) this.y).a() == g0.y && keyEvent.getKeyCode() == 4) {
                    z = true;
                    if (androidx.compose.ui.input.key.c.c(keyEvent) == 1) {
                        ((androidx.compose.foundation.text.selection.c1) this.z).g(null);
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((androidx.compose.ui.input.key.b) obj).a;
                androidx.compose.ui.focus.l lVar = (androidx.compose.ui.focus.l) this.z;
                InputDevice device = keyEvent2.getDevice();
                boolean zG = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && androidx.compose.ui.input.key.c.c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (n0.i(19, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(5, true);
                    } else if (n0.i(20, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(6, true);
                    } else if (n0.i(21, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(3, true);
                    } else if (n0.i(22, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(4, true);
                    } else if (n0.i(23, keyEvent2)) {
                        k2 k2Var = ((r0) this.y).c;
                        if (k2Var != null) {
                            ((androidx.compose.ui.platform.m1) k2Var).b();
                        }
                        zG = true;
                    }
                }
                return Boolean.valueOf(zG);
            case 2:
                androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.y;
                Object obj2 = b1Var.y;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.z;
                synchronized (obj2) {
                    ((ArrayList) b1Var.z).remove(cancellableContinuationImpl);
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.runtime.snapshots.l lVar2 = (androidx.compose.runtime.snapshots.l) obj;
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    j = androidx.compose.runtime.snapshots.n.e;
                    androidx.compose.runtime.snapshots.n.e = ((long) 1) + j;
                }
                return new androidx.compose.runtime.snapshots.b(j, lVar2, (kotlin.jvm.functions.l) this.y, (kotlin.jvm.functions.l) this.z);
            case 4:
                return ((com.app.mlounge.ui.q) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 5:
                return ((com.app.mlounge.ui.q) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 6:
                int iIntValue = ((Number) obj).intValue();
                return ((androidx.compose.ui.text.x) this.y).invoke(Integer.valueOf(iIntValue), ((List) this.z).get(iIntValue));
            case 7:
                int iIntValue2 = ((Number) obj).intValue();
                return ((androidx.compose.ui.text.x) this.y).invoke(Integer.valueOf(iIntValue2), ((ArrayList) this.z).get(iIntValue2));
            case 8:
                return ((com.app.mlounge.ui.q) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 9:
                int iIntValue3 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue3), ((List) this.z).get(iIntValue3));
            case 10:
                int iIntValue4 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue4), ((List) this.z).get(iIntValue4));
            case 11:
                int iIntValue5 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue5), ((List) this.z).get(iIntValue5));
            case 12:
                int iIntValue6 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue6), ((List) this.z).get(iIntValue6));
            case 13:
                int iIntValue7 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue7), ((List) this.z).get(iIntValue7));
            case 14:
                int iIntValue8 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.anime.n) this.y).invoke(Integer.valueOf(iIntValue8), ((List) this.z).get(iIntValue8));
            case 15:
                return ((com.app.mlounge.ui.q) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 16:
                return ((com.app.mlounge.ui.q) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 17:
                KeyEvent keyEvent3 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent3.getClass();
                boolean z2 = false;
                if (androidx.compose.ui.input.key.c.c(keyEvent3) == 2) {
                    boolean z3 = ((com.app.mlounge.ui.screens.player.o0) ((androidx.compose.runtime.y0) this.z).getValue()).c;
                    com.app.mlounge.ui.screens.player.z0 z0Var = (com.app.mlounge.ui.screens.player.z0) this.y;
                    if (z3) {
                        z0Var.g();
                    } else {
                        z0Var.i();
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 18:
                int iIntValue9 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue9), ((List) this.z).get(iIntValue9));
            case 19:
                int iIntValue10 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue10), ((List) this.z).get(iIntValue10));
            case 20:
                int iIntValue11 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue11), ((List) this.z).get(iIntValue11));
            case 21:
                int iIntValue12 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue12), ((List) this.z).get(iIntValue12));
            case 22:
                int iIntValue13 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue13), ((List) this.z).get(iIntValue13));
            case 23:
                int iIntValue14 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue14), ((List) this.z).get(iIntValue14));
            case 24:
                int iIntValue15 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue15), ((List) this.z).get(iIntValue15));
            case 25:
                return ((com.app.mlounge.ui.screens.player.j0) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 26:
                int iIntValue16 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue16), ((List) this.z).get(iIntValue16));
            case 27:
                return ((com.app.mlounge.ui.screens.player.j0) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 28:
                int iIntValue17 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue17), ((List) this.z).get(iIntValue17));
            default:
                int iIntValue18 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.y).invoke(Integer.valueOf(iIntValue18), this.z.get(iIntValue18));
        }
    }

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
