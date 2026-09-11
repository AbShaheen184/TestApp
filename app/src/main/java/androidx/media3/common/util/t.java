package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.z0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.x0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public t(s1 s1Var) {
        this.a = 2;
        this.b = s1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((u) this.b).a.execute(new androidx.activity.c(6, this, context));
                break;
            case 1:
                androidx.media3.exoplayer.audio.e eVar = (androidx.media3.exoplayer.audio.e) this.b;
                if (!isInitialStickyBroadcast()) {
                    eVar.b(androidx.media3.exoplayer.audio.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                }
                break;
            default:
                s1 s1Var = (s1) this.b;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                x0 x0Var = s1Var.C;
                                s1.m(x0Var);
                                x0Var.K.a("[sgtm] App Receiver notified batches are available");
                                p1 p1Var = s1Var.D;
                                s1.m(p1Var);
                                p1Var.E(new z0(this, 23));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            g4.a();
                            if (s1Var.A.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                                x0 x0Var2 = s1Var.C;
                                s1.m(x0Var2);
                                x0Var2.K.a("App receiver notified triggers are available");
                                p1 p1Var2 = s1Var.D;
                                s1.m(p1Var2);
                                p1Var2.E(new z0(s1Var, 24));
                                break;
                            }
                        }
                        x0 x0Var3 = s1Var.C;
                        s1.m(x0Var3);
                        x0Var3.F.a("App receiver called with unknown action");
                    } else {
                        x0 x0Var4 = s1Var.C;
                        s1.m(x0Var4);
                        x0Var4.F.a("App receiver called with null action");
                    }
                } else {
                    x0 x0Var5 = s1Var.C;
                    s1.m(x0Var5);
                    x0Var5.F.a("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
