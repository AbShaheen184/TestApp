package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ComponentCallbacks, View.OnCreateContextMenuListener, v, w0, androidx.lifecycle.j, androidx.savedstate.g {
    public static final Object G = null;
    public x C;
    public androidx.savedstate.f D;
    public final ArrayList E;
    public final com.google.firebase.platforminfo.c F;
    public final int e = -1;
    public final String y = UUID.randomUUID().toString();
    public final h z = new h(0);
    public final boolean A = true;
    public final o B = o.B;

    public d() {
        new a0();
        new AtomicInteger();
        this.E = new ArrayList();
        this.F = new com.google.firebase.platforminfo.c(this);
        this.C = new x(this, true);
        this.D = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.room.coroutines.d(this, 2)));
        ArrayList arrayList = this.E;
        com.google.firebase.platforminfo.c cVar = this.F;
        if (arrayList.contains(cVar)) {
            return;
        }
        if (this.e < 0) {
            arrayList.add(cVar);
            return;
        }
        d dVar = (d) cVar.e;
        dVar.D.a();
        l0.c(dVar);
    }

    public final h a() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View b() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.viewmodel.c getDefaultViewModelCreationExtras() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.j
    public final s0 getDefaultViewModelProviderFactory() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return this.C;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.D.b;
    }

    @Override // androidx.lifecycle.w0
    public final v0 getViewModelStore() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
