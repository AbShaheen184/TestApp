package androidx.media3.ui;

import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int e = 0;
    public boolean y;
    public final /* synthetic */ Object z;

    public b(v2 v2Var, boolean z) {
        this.y = z;
        Objects.requireNonNull(v2Var);
        this.z = v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.e) {
            case 0:
                this.y = false;
                int i = AspectRatioFrameLayout.A;
                break;
            default:
                v2 v2Var = (v2) this.z;
                s1 s1Var = (s1) v2Var.e;
                boolean zD = s1Var.d();
                boolean z2 = s1Var.V != null && s1Var.V.booleanValue();
                boolean z3 = this.y;
                s1Var.V = Boolean.valueOf(z3);
                if (z2 == z3) {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.K.b(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (s1Var.d() != zD) {
                    boolean zD2 = s1Var.d();
                    if (s1Var.V != null && s1Var.V.booleanValue()) {
                        z = true;
                    }
                    if (zD2 != z) {
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.H.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
                    }
                } else {
                    x0 x0Var3 = s1Var.C;
                    s1.m(x0Var3);
                    x0Var3.H.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
                }
                v2Var.N();
                break;
        }
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.z = aspectRatioFrameLayout;
    }
}
