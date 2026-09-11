package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3 implements y1, kotlin.jvm.internal.g {
    public final /* synthetic */ androidx.compose.runtime.v e;

    public g3(androidx.compose.runtime.v vVar) {
        this.e = vVar;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return new kotlin.jvm.internal.j(1, 0, androidx.compose.runtime.v.class, this.e, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y1) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
