package androidx.compose.foundation.text.input.internal;

import android.os.Looper;
import android.view.View;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.k0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(k0 k0Var, int i, boolean z) {
        this.e = 3;
        this.z = k0Var;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                ((androidx.core.content.res.b) obj).e(i2);
                break;
            case 2:
                ((androidx.media3.common.audio.f) obj).b.onAudioFocusChange(i2);
                break;
            case 3:
                k0 k0Var = (k0) obj;
                androidx.media3.exoplayer.analytics.g gVar = k0Var.T;
                int i3 = ((androidx.media3.exoplayer.a) k0Var.e[i2].e).y;
                gVar.M(gVar.L(), 1033, new androidx.media3.exoplayer.o(13));
                break;
            case 4:
                androidx.media3.exoplayer.x xVar = ((androidx.media3.exoplayer.audio.t) obj).b;
                String str = j0.a;
                androidx.appcompat.widget.o oVar = xVar.e.B;
                androidx.media3.exoplayer.w wVar = new androidx.media3.exoplayer.w(i2);
                oVar.getClass();
                com.google.android.material.motion.a.q(Looper.myLooper() == ((g0) oVar.c).a.getLooper());
                oVar.a++;
                oVar.j(new androidx.activity.c(4, oVar, wVar));
                oVar.o(Integer.valueOf(i2));
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i2, false);
                }
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }
}
