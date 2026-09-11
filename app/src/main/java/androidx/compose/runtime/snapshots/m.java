package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ m(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, int i) {
        this.e = i;
        this.y = lVar;
        this.z = lVar2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                this.y.invoke(obj);
                this.z.invoke(obj);
                break;
            default:
                this.y.invoke(obj);
                this.z.invoke(obj);
                break;
        }
        return kotlin.y.a;
    }
}
