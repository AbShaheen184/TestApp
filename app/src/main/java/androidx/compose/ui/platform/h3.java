package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import com.app.mlounge.R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Collection] */
    public static final e3 a(a aVar, androidx.compose.runtime.v vVar, androidx.compose.runtime.internal.f fVar) {
        u uVar;
        e3 e3Var;
        byte b = 0;
        if (p1.a.compareAndSet(false, true)) {
            Channel channelChannel$default = ChannelKt.Channel$default(1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope((kotlin.coroutines.i) s0.H.getValue()), null, null, new androidx.compose.animation.b0((Object) channelChannel$default, (kotlin.coroutines.d) (b == true ? 1 : 0), 15), 3, null);
            androidx.compose.animation.e eVar = new androidx.compose.animation.e(channelChannel$default, 17);
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                androidx.compose.runtime.snapshots.n.i = kotlin.collections.o.W(androidx.compose.runtime.snapshots.n.i, eVar);
            }
            androidx.compose.runtime.snapshots.n.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof u) {
                uVar = (u) childAt;
            }
            if (uVar == null) {
                uVar = new u(aVar.getContext(), vVar.j());
                aVar.addView(uVar.getView(), a);
            }
            Object tag = uVar.getView().getTag(R.id.wrapped_composition_tag);
            e3Var = tag instanceof e3 ? (e3) tag : null;
            if (e3Var == null) {
                e3Var = new e3(uVar, new androidx.compose.runtime.y(vVar, new androidx.compose.ui.node.a2(uVar.getRoot())));
                uVar.getView().setTag(R.id.wrapped_composition_tag, e3Var);
            }
            e3Var.c(fVar);
            if (!kotlin.jvm.internal.l.a(uVar.getCoroutineContext(), vVar.j())) {
                uVar.setCoroutineContext(vVar.j());
            }
            uVar.setFrameEndScheduler$ui(new g3(vVar));
            return e3Var;
        }
        aVar.removeAllViews();
        uVar = null;
        if (uVar == null) {
            uVar = new u(aVar.getContext(), vVar.j());
            aVar.addView(uVar.getView(), a);
        }
        Object tag2 = uVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof e3) {
        }
        if (e3Var == null) {
            e3Var = new e3(uVar, new androidx.compose.runtime.y(vVar, new androidx.compose.ui.node.a2(uVar.getRoot())));
            uVar.getView().setTag(R.id.wrapped_composition_tag, e3Var);
        }
        e3Var.c(fVar);
        if (!kotlin.jvm.internal.l.a(uVar.getCoroutineContext(), vVar.j())) {
            uVar.setCoroutineContext(vVar.j());
        }
        uVar.setFrameEndScheduler$ui(new g3(vVar));
        return e3Var;
    }
}
