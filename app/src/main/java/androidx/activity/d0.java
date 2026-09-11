package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.compose.ui.window.a aVar) {
        super(true);
        this.d = 0;
        this.e = aVar;
    }

    @Override // androidx.activity.u
    public void a() {
        switch (this.d) {
            case 1:
                ((androidx.activity.compose.internal.b) this.e).e();
                break;
        }
    }

    @Override // androidx.activity.u
    public final void b() {
        switch (this.d) {
            case 0:
                ((androidx.compose.ui.window.a) this.e).invoke(this);
                return;
            case 1:
                ((androidx.activity.compose.internal.b) this.e).f();
                return;
            case 2:
                ((androidx.fragment.app.h) this.e).v();
                throw null;
            default:
                ((androidx.navigation.y) this.e).c();
                return;
        }
    }

    @Override // androidx.activity.u
    public void c(a aVar) {
        switch (this.d) {
            case 1:
                ((androidx.activity.compose.internal.b) this.e).g(aVar);
                break;
        }
    }

    @Override // androidx.activity.u
    public void d(a aVar) {
        switch (this.d) {
            case 1:
                ((androidx.activity.compose.internal.b) this.e).h();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
