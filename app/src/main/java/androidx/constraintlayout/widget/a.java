package androidx.constraintlayout.widget;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public int E;
    public int F;
    public androidx.constraintlayout.core.widgets.a G;

    public boolean getAllowsGoneWidget() {
        return this.G.s0;
    }

    public int getMargin() {
        return this.G.t0;
    }

    public int getType() {
        return this.E;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(androidx.constraintlayout.core.widgets.d dVar, boolean z) {
        int i = this.E;
        this.F = i;
        if (z) {
            if (i == 5) {
                this.F = 1;
            } else if (i == 6) {
                this.F = 0;
            }
        } else if (i == 5) {
            this.F = 0;
        } else if (i == 6) {
            this.F = 1;
        }
        if (dVar instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) dVar).r0 = this.F;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.G.s0 = z;
    }

    public void setDpMargin(int i) {
        this.G.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.G.t0 = i;
    }

    public void setType(int i) {
        this.E = i;
    }
}
