package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements kotlin.jvm.functions.p {
    public static final b e = new b(2, kotlin.math.a.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
