package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        h2.b(null, null, this);
        return kotlin.coroutines.intrinsics.a.e;
    }
}
