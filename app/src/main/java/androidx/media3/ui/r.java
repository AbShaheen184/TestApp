package androidx.media3.ui;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.recyclerview.widget.p0 {
    public final TextView u;
    public final View v;

    public r(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_text);
        this.v = view.findViewById(R.id.exo_check);
    }
}
