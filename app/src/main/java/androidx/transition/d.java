package androidx.transition;

import android.view.ViewGroup;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {
    public boolean a = false;
    public final ViewGroup b;

    public d(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void a() {
        t1.D(this.b, false);
    }

    @Override // androidx.transition.j
    public final void d(m mVar) {
        if (!this.a) {
            t1.D(this.b, false);
        }
        mVar.x(this);
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void e(m mVar) {
        t1.D(this.b, false);
        this.a = true;
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void f() {
        t1.D(this.b, true);
    }
}
