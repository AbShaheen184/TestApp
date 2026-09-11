package androidx.media3.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.common.a1;
import androidx.media3.common.w0;
import androidx.media3.common.x0;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.recyclerview.widget.v {
    public List d = new ArrayList();
    public final /* synthetic */ v e;
    public final /* synthetic */ int f;
    public final /* synthetic */ v g;

    public j(v vVar, int i) {
        this.f = i;
        this.g = vVar;
        this.e = vVar;
    }

    @Override // androidx.recyclerview.widget.v
    public final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.v
    public /* bridge */ /* synthetic */ void c(androidx.recyclerview.widget.p0 p0Var, int i) {
        switch (this.f) {
            case 1:
                g((r) p0Var, i);
                break;
            default:
                g((r) p0Var, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.v
    public final androidx.recyclerview.widget.p0 d(ViewGroup viewGroup) {
        return new r(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean e(a1 a1Var) {
        for (int i = 0; i < this.d.size(); i++) {
            if (a1Var.v.containsKey(((s) this.d.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void f(List list) {
        v vVar = this.g;
        ImageView imageView = vVar.d0;
        boolean z = false;
        for (int i = 0; i < ((com.google.common.collect.a1) list).A; i++) {
            s sVar = (s) ((com.google.common.collect.a1) list).get(i);
            if (sVar.a.e[sVar.b]) {
                z = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? vVar.F0 : vVar.G0);
            imageView.setContentDescription(z ? vVar.H0 : vVar.I0);
        }
        this.d = list;
    }

    public void g(r rVar, int i) {
        switch (this.f) {
            case 1:
                h(rVar, i);
                if (i > 0) {
                    s sVar = (s) this.d.get(i - 1);
                    rVar.v.setVisibility(sVar.a.e[sVar.b] ? 0 : 4);
                }
                break;
            default:
                h(rVar, i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    public final void h(r rVar, int i) {
        boolean z;
        boolean z2;
        final androidx.media3.common.q0 q0Var = this.e.N0;
        if (q0Var == null) {
        }
        if (i != 0) {
            final s sVar = (s) this.d.get(i - 1);
            final w0 w0Var = sVar.a.b;
            if (((androidx.media3.exoplayer.c0) q0Var).t().v.get(w0Var) != null) {
                z = sVar.a.e[sVar.b];
            }
            rVar.u.setText(sVar.c);
            rVar.v.setVisibility(z ? 0 : 4);
            rVar.a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                    if (c0Var.u(29)) {
                        androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                        jVar.getClass();
                        androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
                        s sVar2 = sVar;
                        iVar.e(new x0(w0Var, com.google.common.collect.h0.s(Integer.valueOf(sVar2.b))));
                        iVar.i(sVar2.a.b.c, false);
                        c0Var.O(iVar.a());
                        String str = sVar2.c;
                        j jVar2 = this.e;
                        switch (jVar2.f) {
                            case 0:
                                jVar2.g.J.e[1] = str;
                                break;
                        }
                        jVar2.e.O.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f) {
            case 0:
                rVar.u.setText(R.string.exo_track_selection_auto);
                androidx.media3.common.q0 q0Var2 = this.g.N0;
                q0Var2.getClass();
                rVar.v.setVisibility(e(((androidx.media3.exoplayer.c0) q0Var2).t()) ? 4 : 0);
                rVar.a.setOnClickListener(new h(this, 1));
                break;
            default:
                rVar.u.setText(R.string.exo_track_selection_none);
                int i2 = 0;
                while (true) {
                    if (i2 < this.d.size()) {
                        s sVar2 = (s) this.d.get(i2);
                        if (sVar2.a.e[sVar2.b]) {
                            z2 = false;
                        } else {
                            i2++;
                        }
                    } else {
                        z2 = true;
                    }
                }
                rVar.v.setVisibility(z2 ? 0 : 4);
                rVar.a.setOnClickListener(new h(this, 3));
                break;
        }
    }

    private final void i(String str) {
    }
}
