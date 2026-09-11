package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.compose.foundation.gestures.j1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ n(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = i;
        this.A = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                Serializable serializable = (Serializable) ((com.app.mlounge.data.music.e) this.A).y;
                String str = (String) oVar.a.get(Integer.valueOf(this.z));
                if (str != null) {
                    androidx.activity.result.e eVar = (androidx.activity.result.e) oVar.e.get(str);
                    if ((eVar != null ? eVar.a : null) == null) {
                        oVar.g.remove(str);
                        oVar.f.put(str, serializable);
                    } else {
                        androidx.activity.result.b bVar = eVar.a;
                        if (oVar.d.remove(str)) {
                            bVar.c(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((o) this.y).a(this.z, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.A));
                break;
            case 2:
                CopyOnWriteArraySet<androidx.media3.common.util.o> copyOnWriteArraySet = (CopyOnWriteArraySet) this.y;
                androidx.media3.common.util.m mVar = (androidx.media3.common.util.m) this.A;
                for (androidx.media3.common.util.o oVar2 : copyOnWriteArraySet) {
                    if (!oVar2.d) {
                        int i = this.z;
                        if (i != -1) {
                            oVar2.b.b(i);
                        }
                        oVar2.c = true;
                        mVar.invoke(oVar2.a);
                    }
                }
                break;
            case 3:
                ((androidx.profileinstaller.b) ((j1) this.y).c).j(this.z, this.A);
                break;
            case 4:
                net.luminis.quic.recovery.g gVar = (net.luminis.quic.recovery.g) this.y;
                gVar.d.h(this.z, (List) this.A);
                break;
            default:
                net.luminis.quic.recovery.g gVar2 = (net.luminis.quic.recovery.g) this.y;
                gVar2.d.h(this.z, (ArrayList) this.A);
                break;
        }
    }

    public /* synthetic */ n(net.luminis.quic.recovery.g gVar, List list, int i, int i2) {
        this.e = i2;
        this.y = gVar;
        this.A = list;
        this.z = i;
    }
}
