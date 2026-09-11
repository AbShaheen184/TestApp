package androidx.compose.ui.autofill;

import androidx.compose.ui.node.f0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.r {
    public final /* synthetic */ d y;
    public final /* synthetic */ f0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f0 f0Var) {
        super(4);
        this.y = dVar;
        this.z = f0Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d dVar = this.y;
        dVar.C.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        dVar.e.i(dVar.z, this.z.y, dVar.C);
        return y.a;
    }
}
