package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends _COROUTINE.b {
    public final f m;

    public g(TextView textView) {
        this.m = new f(textView);
    }

    @Override // _COROUTINE.b
    public final void E(boolean z) {
        if (androidx.emoji2.text.j.d()) {
            this.m.E(z);
        }
    }

    @Override // _COROUTINE.b
    public final void F(boolean z) {
        boolean zD = androidx.emoji2.text.j.d();
        f fVar = this.m;
        if (zD) {
            fVar.F(z);
        } else {
            fVar.o = z;
        }
    }

    @Override // _COROUTINE.b
    public final InputFilter[] q(InputFilter[] inputFilterArr) {
        return !androidx.emoji2.text.j.d() ? inputFilterArr : this.m.q(inputFilterArr);
    }
}
