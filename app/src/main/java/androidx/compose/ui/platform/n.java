package androidx.compose.ui.platform;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.j implements kotlin.jvm.functions.q {
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            androidx.transition.k.i();
            return null;
        }
        u uVar = (u) this.receiver;
        Resources resources = uVar.getContext().getResources();
        return Boolean.valueOf(d0.a.a(uVar, null, new androidx.compose.ui.draganddrop.c(new androidx.compose.ui.unit.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((androidx.compose.ui.geometry.e) obj2).a, (kotlin.jvm.functions.l) obj3)));
    }
}
