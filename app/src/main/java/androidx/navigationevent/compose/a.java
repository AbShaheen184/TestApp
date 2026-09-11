package androidx.navigationevent.compose;

import android.support.v4.media.session.b;
import android.view.View;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.r;
import androidx.compose.runtime.saveable.f;
import androidx.compose.ui.platform.m0;
import androidx.navigationevent.d;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final b0 a = new b0(new f(8));

    public static d a(r rVar) {
        d dVar;
        d dVar2 = (d) rVar.j(a);
        if (dVar2 != null) {
            rVar.b0(950834231);
            rVar.p(false);
            return dVar2;
        }
        rVar.b0(950836184);
        View view = (View) rVar.j(m0.f);
        view.getClass();
        while (true) {
            dVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            d dVar3 = tag instanceof d ? (d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            }
            Object objW = b.w(view);
            view = objW instanceof View ? (View) objW : null;
        }
        rVar.p(false);
        return dVar;
    }
}
