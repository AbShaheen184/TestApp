package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.m1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ androidx.compose.runtime.p A;
    public final /* synthetic */ androidx.compose.runtime.saveable.h B;
    public final /* synthetic */ int C;
    public final /* synthetic */ View D;
    public final /* synthetic */ Context y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, kotlin.jvm.functions.l lVar, androidx.compose.runtime.p pVar, androidx.compose.runtime.saveable.h hVar, int i, View view) {
        super(0);
        this.y = context;
        this.z = lVar;
        this.A = pVar;
        this.B = hVar;
        this.C = i;
        this.D = view;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.D;
        callback.getClass();
        return new v(this.y, this.z, this.A, this.B, this.C, (m1) callback).getLayoutNode();
    }
}
