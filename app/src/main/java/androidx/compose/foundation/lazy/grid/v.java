package androidx.compose.foundation.lazy.grid;

import android.media.audiofx.Visualizer;
import androidx.compose.foundation.lazy.layout.k0;
import androidx.compose.runtime.h0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v(x xVar, int i) {
        this.e = 0;
        this.z = xVar;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Visualizer visualizer;
        switch (this.e) {
            case 0:
                k0 k0Var = (k0) obj;
                androidx.compose.foundation.lazy.a aVar = ((x) this.z).a;
                androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
                androidx.compose.runtime.snapshots.r.k(fVarE, androidx.compose.runtime.snapshots.r.h(fVarE), fVarE != null ? fVarE.e() : null);
                aVar.getClass();
                int i = k0Var.a;
                if (i == -1) {
                    i = 2;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    k0Var.a(this.y + i2);
                }
                return kotlin.y.a;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(this.y, (Collection) this.z));
            default:
                int i3 = this.y;
                androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) this.z;
                ((h0) obj).getClass();
                try {
                    visualizer = new Visualizer(i3);
                    visualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    visualizer.setDataCaptureListener(new com.app.mlounge.ui.components.n(qVar), Visualizer.getMaxCaptureRate() / 2, false, true);
                    visualizer.setEnabled(true);
                    break;
                } catch (Exception e) {
                    com.app.mlounge.util.a.b("AudioVisualizer", "Visualizer init failed", e);
                    visualizer = null;
                }
                return new androidx.activity.compose.d(visualizer, 10);
        }
    }

    public /* synthetic */ v(int i, Collection collection, int i2) {
        this.e = i2;
        this.y = i;
        this.z = collection;
    }
}
