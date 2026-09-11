package androidx.compose.foundation.text.contextmenu.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ c(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.invoke();
                break;
            case 1:
                this.y.invoke();
                break;
            case 2:
                this.y.invoke();
                break;
            case 3:
                this.y.invoke();
                break;
            case 4:
                this.y.invoke();
                break;
            default:
                this.y.invoke();
                break;
        }
    }
}
