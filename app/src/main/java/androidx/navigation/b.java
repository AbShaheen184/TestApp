package androidx.navigation;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@j0("activity")
public class b extends k0 {
    public final Activity c;

    public b(Context context) {
        context.getClass();
        for (Object obj : kotlin.sequences.k.o(context, new androidx.compose.ui.text.y(14))) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // androidx.navigation.k0
    public final t a() {
        return new a(this);
    }

    @Override // androidx.navigation.k0
    public final t c(t tVar) {
        throw new IllegalStateException(androidx.privacysandbox.ads.adservices.java.internal.a.m(((a) tVar).y.a, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
    }

    @Override // androidx.navigation.k0
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
