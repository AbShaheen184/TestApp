package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ m1 y;

    public /* synthetic */ i1(m1 m1Var, int i) {
        this.e = i;
        this.y = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                q1 q1Var = this.y.z;
                if (q1Var != null) {
                    q1Var.setListSelectionHidden(true);
                    q1Var.requestLayout();
                }
                break;
            default:
                m1 m1Var = this.y;
                q1 q1Var2 = m1Var.z;
                if (q1Var2 != null && q1Var2.isAttachedToWindow() && m1Var.z.getCount() > m1Var.z.getChildCount() && m1Var.z.getChildCount() <= Integer.MAX_VALUE) {
                    m1Var.S.setInputMethodMode(2);
                    m1Var.f();
                    break;
                }
                break;
        }
    }
}
