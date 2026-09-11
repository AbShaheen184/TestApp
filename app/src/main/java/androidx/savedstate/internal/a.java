package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.room.coroutines.d;
import androidx.savedstate.g;
import com.google.android.gms.common.internal.k;
import java.util.LinkedHashMap;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final g a;
    public final d b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final k c = new k(24);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public a(g gVar, d dVar) {
        this.a = gVar;
        this.b = dVar;
    }

    public final void a() {
        g gVar = this.a;
        if (((x) gVar.getLifecycle()).d != o.y) {
            c.r("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                c.r("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            gVar.getLifecycle().a(new androidx.navigation.internal.d(this, 1));
            this.e = true;
        }
    }
}
