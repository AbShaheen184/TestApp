package androidx.navigationevent;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.f2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends g {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new f2(this, 2) : new l(this);
    }

    @Override // androidx.navigationevent.g
    public final void b(boolean z) {
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, this.e);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            this.c.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
