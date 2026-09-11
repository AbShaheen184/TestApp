package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.r;
import androidx.compose.runtime.saveable.f;
import androidx.compose.ui.platform.m0;
import androidx.lifecycle.l0;
import androidx.lifecycle.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final b0 a = new b0(new f(5));

    public static w0 a(r rVar) {
        w0 w0VarE = (w0) rVar.j(a);
        if (w0VarE == null) {
            rVar.b0(1260197608);
            w0VarE = l0.e((View) rVar.j(m0.f));
        } else {
            rVar.b0(1260196492);
        }
        rVar.p(false);
        return w0VarE;
    }
}
