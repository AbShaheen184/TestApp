package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((r) this.b).A--;
                break;
            default:
                ((androidx.compose.runtime.snapshots.s) this.b).k--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((r) this.b).A++;
                break;
            default:
                ((androidx.compose.runtime.snapshots.s) this.b).k++;
                break;
        }
    }
}
