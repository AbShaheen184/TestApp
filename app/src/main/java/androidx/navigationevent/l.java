package androidx.navigationevent;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements OnBackAnimationCallback {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    public final void onBackCancelled() {
        m mVar = this.a;
        c cVar = mVar.a;
        if (cVar == null) {
            net.luminis.tls.engine.impl.c.r("This input is not added to any dispatcher.");
            return;
        }
        if (!mVar.b) {
            cVar.d(mVar, null);
        }
        h hVar = cVar.b;
        hVar.getClass();
        if (mVar.equals(hVar.i) && -1 == hVar.h) {
            e eVarC = hVar.g;
            if (eVarC == null) {
                eVarC = hVar.c(-1);
            }
            hVar.g = null;
            hVar.h = 0;
            hVar.i = null;
            if (eVarC != null) {
                eVarC.a();
            }
            hVar.a.setValue(i.o);
        }
        mVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = androidx.core.app.i.a(backEvent);
        m mVar = this.a;
        c cVar = mVar.a;
        if (cVar == null) {
            net.luminis.tls.engine.impl.c.r("This input is not added to any dispatcher.");
            return;
        }
        if (mVar.b) {
            h hVar = cVar.b;
            hVar.getClass();
            if (mVar.equals(hVar.i) && -1 == hVar.h) {
                e eVarC = hVar.g;
                if (eVarC == null) {
                    eVarC = hVar.c(-1);
                }
                if (eVarC != null) {
                    eVarC.c(bVarA);
                }
                hVar.a.setValue(new j(bVarA));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = androidx.core.app.i.a(backEvent);
        m mVar = this.a;
        c cVar = mVar.a;
        if (cVar == null) {
            net.luminis.tls.engine.impl.c.r("This input is not added to any dispatcher.");
        } else {
            if (mVar.b) {
                return;
            }
            cVar.d(mVar, bVarA);
            mVar.b = true;
        }
    }
}
