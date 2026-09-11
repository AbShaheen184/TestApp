package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final f y = new f(2);

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
