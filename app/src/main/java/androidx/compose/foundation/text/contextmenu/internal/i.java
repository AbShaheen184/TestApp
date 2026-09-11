package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.l1;
import androidx.compose.foundation.n1;
import kotlin.y;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.compose.foundation.text.contextmenu.provider.f {
    public final View a;
    public final kotlin.jvm.functions.l b;
    public final kotlin.jvm.functions.a c;
    public final n1 d = new n1();
    public final androidx.compose.runtime.snapshots.t e = new androidx.compose.runtime.snapshots.t(new a(this, 0));
    public final a f = new a(this, 1);
    public final a g = new a(this, 2);
    public ActionMode h;
    public g i;
    public Runnable j;

    public i(View view, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar) {
        this.a = view;
        this.b = lVar;
        this.c = aVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.f
    public final Object a(androidx.compose.foundation.text.contextmenu.provider.e eVar, kotlin.coroutines.jvm.internal.i iVar) {
        h hVar = new h(this, eVar, null, 0);
        n1 n1Var = this.d;
        n1Var.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new l1(n1Var, hVar, null), iVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }
}
