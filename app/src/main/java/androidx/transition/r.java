package androidx.transition;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends n {
    public final /* synthetic */ int a = 1;
    public m b;

    public r(m mVar) {
        this.b = mVar;
    }

    @Override // androidx.transition.n, androidx.transition.j
    public void b(m mVar) {
        switch (this.a) {
            case 1:
                a aVar = (a) this.b;
                if (!aVar.a0) {
                    aVar.H();
                    aVar.a0 = true;
                }
                break;
        }
    }

    @Override // androidx.transition.j
    public final void d(m mVar) {
        switch (this.a) {
            case 0:
                this.b.A();
                mVar.x(this);
                break;
            default:
                a aVar = (a) this.b;
                int i = aVar.Z - 1;
                aVar.Z = i;
                if (i == 0) {
                    aVar.a0 = false;
                    aVar.l();
                }
                mVar.x(this);
                break;
        }
    }

    public /* synthetic */ r() {
    }
}
