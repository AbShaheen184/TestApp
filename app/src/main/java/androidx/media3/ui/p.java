package androidx.media3.ui;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.recyclerview.widget.p0 {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ v x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, View view) {
        super(view);
        this.x = vVar;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_main_text);
        this.v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new h(this, 2));
    }
}
