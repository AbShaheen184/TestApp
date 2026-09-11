package androidx.activity.compose;

import android.media.audiofx.Visualizer;
import android.view.ActionMode;
import android.view.View;
import androidx.activity.y;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.runtime.g0;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.window.x;
import androidx.compose.ui.window.z;
import com.app.mlounge.R;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.x1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.g0
    public final void dispose() {
        switch (this.a) {
            case 0:
                androidx.activity.result.g gVar = ((a) this.b).a;
                if (gVar == null) {
                    net.luminis.tls.engine.impl.c.r("Launcher has not been initialized");
                } else {
                    gVar.b.d(gVar.c);
                }
                break;
            case 1:
                ((w) this.b).d = null;
                break;
            case 2:
                m0 m0Var = (m0) this.b;
                b1 b1Var = m0Var.c;
                if (b1Var != null) {
                    b1Var.e = false;
                }
                m0Var.c = null;
                break;
            case 3:
                ((h0) this.b).f = true;
                break;
            case 4:
                ((c1) this.b).o();
                break;
            case 5:
                androidx.compose.foundation.text.contextmenu.internal.i iVar = (androidx.compose.foundation.text.contextmenu.internal.i) this.b;
                androidx.compose.runtime.snapshots.t tVar = iVar.e;
                y yVar = tVar.h;
                if (yVar != null) {
                    yVar.f();
                }
                tVar.a();
                ActionMode actionMode = iVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                iVar.h = null;
                break;
            case 6:
                androidx.compose.foundation.text.contextmenu.provider.b bVar = (androidx.compose.foundation.text.contextmenu.provider.b) ((androidx.compose.foundation.text.contextmenu.provider.c) this.b).c.getValue();
                if (bVar != null) {
                    bVar.close();
                }
                break;
            case 7:
                ((n1) this.b).y.invoke();
                break;
            case 8:
                x xVar = (x) this.b;
                xVar.dismiss();
                xVar.E.c();
                break;
            case 9:
                z zVar = (z) this.b;
                zVar.c();
                zVar.setTag(R.id.view_tree_lifecycle_owner, null);
                zVar.L.removeViewImmediate(zVar);
                break;
            case 10:
                Visualizer visualizer = (Visualizer) this.b;
                if (visualizer != null) {
                    try {
                        visualizer.setEnabled(false);
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (visualizer != null) {
                    visualizer.release();
                }
                break;
            case 11:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.b;
                cVar.s.setValue(null);
                cVar.w.setValue(kotlin.collections.v.e);
                break;
            case 12:
                com.app.mlounge.ui.viewmodel.g gVar2 = (com.app.mlounge.ui.viewmodel.g) this.b;
                gVar2.t.setValue(null);
                MutableStateFlow mutableStateFlow = gVar2.x;
                kotlin.collections.u uVar = kotlin.collections.u.e;
                mutableStateFlow.setValue(uVar);
                gVar2.z.setValue(uVar);
                break;
            case 13:
                ((com.app.mlounge.ui.viewmodel.s) this.b).m.setValue(null);
                break;
            case 14:
                e0 e0Var = (e0) this.b;
                e0Var.B.setValue(null);
                e0Var.H.setValue(kotlin.collections.u.e);
                break;
            case 15:
                ((View) this.b).setOnGenericMotionListener(null);
                break;
            default:
                x1 x1Var = (x1) this.b;
                x1Var.H.setValue(null);
                x1Var.N.setValue(null);
                x1Var.P.setValue(kotlin.collections.u.e);
                break;
        }
    }
}
