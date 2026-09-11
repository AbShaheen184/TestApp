package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.e0;
import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final b0 a = new b0(new b(3));

    public static e0 a(androidx.compose.runtime.r rVar) {
        e0 e0Var = (e0) rVar.j(a);
        Object obj = null;
        if (e0Var == null) {
            rVar.b0(1208426157);
            View view = (View) rVar.j(m0.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    e0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                e0 e0Var2 = tag instanceof e0 ? (e0) tag : null;
                if (e0Var2 != null) {
                    e0Var = e0Var2;
                    break;
                }
                Object objW = android.support.v4.media.session.b.w(view);
                view = objW instanceof View ? (View) objW : null;
            }
        } else {
            rVar.b0(1208423708);
        }
        rVar.p(false);
        if (e0Var != null) {
            rVar.b0(1208423789);
            rVar.p(false);
            return e0Var;
        }
        rVar.b0(1208428160);
        for (Context baseContext = (Context) rVar.j(m0.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof e0) {
                obj = baseContext;
                break;
            }
        }
        e0 e0Var3 = (e0) obj;
        rVar.p(false);
        return e0Var3;
    }
}
