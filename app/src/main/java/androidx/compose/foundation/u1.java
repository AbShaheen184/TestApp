package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements s1 {
    public static final u1 b = new u1(0);
    public static final u1 c = new u1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ u1(int i) {
        this.a = i;
    }

    @Override // androidx.compose.foundation.s1
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // androidx.compose.foundation.s1
    public final r1 b(View view, androidx.compose.ui.unit.c cVar) {
        switch (this.a) {
            case 0:
                return new t1(new Magnifier(view));
            default:
                return new v1(new Magnifier(view));
        }
    }
}
