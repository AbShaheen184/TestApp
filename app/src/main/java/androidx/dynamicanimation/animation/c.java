package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import androidx.activity.l;
import androidx.collection.y0;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.ui.text.input.c0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final ThreadLocal i = new ThreadLocal();
    public final o e;
    public b h;
    public final y0 a = new y0(0);
    public final ArrayList b = new ArrayList();
    public final com.google.firebase.platforminfo.c c = new com.google.firebase.platforminfo.c(this);
    public final l d = new l(this, 7);
    public boolean f = false;
    public float g = 1.0f;

    public c(o oVar) {
        this.e = oVar;
    }

    public final void a(e eVar) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.y).postFrameCallback(new c0(1, this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                if (this.h == null) {
                    b bVar = new b();
                    bVar.b = this;
                    this.h = bVar;
                }
                final b bVar2 = this.h;
                if (((a) bVar2.a) == null) {
                    ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            ((c) bVar2.b).g = f;
                        }
                    };
                    bVar2.a = durationScaleChangeListener;
                    ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
                }
            }
        }
        if (arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
    }
}
