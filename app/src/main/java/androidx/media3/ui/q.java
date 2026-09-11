package androidx.media3.ui;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.recyclerview.widget.v {
    public final String[] d;
    public final String[] e;
    public final Drawable[] f;
    public final /* synthetic */ v g;

    public q(v vVar, String[] strArr, Drawable[] drawableArr) {
        this.g = vVar;
        this.d = strArr;
        this.e = new String[strArr.length];
        this.f = drawableArr;
    }

    @Override // androidx.recyclerview.widget.v
    public final int a() {
        return this.d.length;
    }

    @Override // androidx.recyclerview.widget.v
    public final long b(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.v
    public final void c(androidx.recyclerview.widget.p0 p0Var, int i) {
        p pVar = (p) p0Var;
        boolean zE = e(i);
        View view = pVar.a;
        if (zE) {
            view.setLayoutParams(new androidx.recyclerview.widget.d0(-1, -2));
        } else {
            view.setLayoutParams(new androidx.recyclerview.widget.d0(0, 0));
        }
        pVar.u.setText(this.d[i]);
        String str = this.e[i];
        TextView textView = pVar.v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f[i];
        ImageView imageView = pVar.w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.v
    public final androidx.recyclerview.widget.p0 d(ViewGroup viewGroup) {
        v vVar = this.g;
        return new p(vVar, LayoutInflater.from(vVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean e(int i) {
        v vVar = this.g;
        androidx.media3.common.q0 q0Var = vVar.N0;
        if (q0Var == null) {
            return false;
        }
        if (i != 0) {
            return i != 1 || (((androidx.media3.exoplayer.c0) q0Var).u(30) && ((androidx.media3.exoplayer.c0) vVar.N0).u(29));
        }
        return ((androidx.media3.exoplayer.c0) q0Var).u(13);
    }
}
