package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ View z;

    public d0(TextView textView, Typeface typeface, int i) {
        this.z = textView;
        this.A = typeface;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((TextView) this.z).setTypeface((Typeface) this.A, this.y);
                break;
            default:
                ((BottomSheetBehavior) this.A).E(this.z, this.y, false);
                break;
        }
    }

    public d0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.A = bottomSheetBehavior;
        this.z = view;
        this.y = i;
    }
}
