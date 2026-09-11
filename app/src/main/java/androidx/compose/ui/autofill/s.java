package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements kotlin.jvm.functions.r {
    public final /* synthetic */ ViewStructure y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ViewStructure viewStructure) {
        super(4);
        this.y = viewStructure;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.y.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return y.a;
    }
}
