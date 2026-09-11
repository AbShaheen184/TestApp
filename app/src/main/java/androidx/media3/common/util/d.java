package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.appcompat.widget.o y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(androidx.appcompat.widget.o oVar, Object obj, int i) {
        this.e = i;
        this.y = oVar;
        this.z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.appcompat.widget.o oVar = this.y;
                int i = oVar.a - 1;
                oVar.a = i;
                if (i == 0) {
                    oVar.o(this.z);
                }
                break;
            default:
                androidx.appcompat.widget.o oVar2 = this.y;
                if (oVar2.a == 0) {
                    oVar2.o(this.z);
                }
                break;
        }
    }
}
