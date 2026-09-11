package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final androidx.savedstate.internal.a a;
    public a b;

    public e(androidx.savedstate.internal.a aVar) {
        this.a = aVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        androidx.savedstate.internal.a aVar = this.a;
        if (!aVar.g) {
            net.luminis.tls.engine.impl.c.r("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = aVar.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                android.support.v4.media.session.b.z(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            aVar.f = null;
        }
        return bundle;
    }

    public final d b() {
        d dVar;
        androidx.savedstate.internal.a aVar = this.a;
        synchronized (aVar.c) {
            Iterator it = aVar.d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String str, d dVar) {
        dVar.getClass();
        androidx.savedstate.internal.a aVar = this.a;
        synchronized (aVar.c) {
            if (aVar.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.d.put(str, dVar);
        }
    }

    public final void d() {
        if (!this.a.h) {
            net.luminis.tls.engine.impl.c.r("Can not perform this action after onSaveInstanceState");
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.b = aVar;
        try {
            k.class.getDeclaredConstructor(null);
            a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a.add(k.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
