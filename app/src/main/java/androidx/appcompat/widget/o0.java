package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends n0 {
    @Override // androidx.appcompat.widget.n0, androidx.appcompat.widget.p0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.p0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
