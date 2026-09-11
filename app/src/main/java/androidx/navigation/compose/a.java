package androidx.navigation.compose;

import android.os.Looper;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends q0 {
    public final String b;
    public androidx.media3.exoplayer.hls.c c;

    public a(i0 i0Var) {
        String string = (String) i0Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            if (string != null) {
                ArrayList arrayList = androidx.lifecycle.internal.a.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((Class) it.next()).isInstance(string));
                }
                androidx.media3.exoplayer.hls.playlist.a.g(string.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = androidx.lifecycle.internal.a.a;
            Object obj = i0Var.a.get("SaveableStateHolder_BackStackEntryKey");
            a0 a0Var = obj instanceof a0 ? (a0) obj : null;
            if (a0Var != null) {
                androidx.arch.core.executor.b.O().l.getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.q("Cannot invoke ", "setValue", " on a background thread"));
                }
                a0Var.e++;
                a0Var.c = string;
                if (a0Var.f) {
                    a0Var.g = true;
                } else {
                    a0Var.f = true;
                    do {
                        a0Var.g = false;
                        androidx.arch.core.internal.f fVar = a0Var.b;
                        fVar.getClass();
                        androidx.arch.core.internal.d dVar = new androidx.arch.core.internal.d(fVar);
                        fVar.z.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext()) {
                            a0Var.a((z) ((Map.Entry) dVar.next()).getValue());
                            if (a0Var.g) {
                                break;
                            }
                        }
                    } while (a0Var.g);
                    a0Var.f = false;
                }
            }
            i0Var.b.F(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = string;
    }

    @Override // androidx.lifecycle.q0
    public final void d() {
        androidx.media3.exoplayer.hls.c cVar = this.c;
        if (cVar == null) {
            kotlin.jvm.internal.l.f("saveableStateHolderRef");
            throw null;
        }
        androidx.compose.runtime.saveable.d dVar = (androidx.compose.runtime.saveable.d) ((WeakReference) cVar.e).get();
        if (dVar != null) {
            dVar.f(this.b);
        }
        androidx.media3.exoplayer.hls.c cVar2 = this.c;
        if (cVar2 != null) {
            ((WeakReference) cVar2.e).clear();
        } else {
            kotlin.jvm.internal.l.f("saveableStateHolderRef");
            throw null;
        }
    }
}
