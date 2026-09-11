package androidx.appcompat.widget;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public i2(i2 i2Var) {
        super((ViewGroup.MarginLayoutParams) i2Var);
        this.a = 0;
        this.a = i2Var.a;
    }

    public i2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
