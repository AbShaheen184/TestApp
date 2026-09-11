package kotlinx.coroutines.flow;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int e;

    public /* synthetic */ c(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return FlowKt__DistinctKt.defaultKeySelector$lambda$0$FlowKt__DistinctKt(obj);
            default:
                return Boolean.valueOf(FlowKt__MigrationKt.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj));
        }
    }
}
