package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {
    public final com.google.android.material.shape.g a;
    public final a b;
    public final androidx.compose.foundation.text.input.internal.o c;
    public final i d;
    public final com.google.firebase.platforminfo.c e;

    public f(com.google.android.material.shape.g gVar, a aVar) {
        androidx.compose.foundation.text.input.internal.o oVar = g.a;
        androidx.compose.foundation.text.input.internal.o oVar2 = g.a;
        i iVar = new i();
        kotlin.coroutines.i iVarPlus = i.b.plus(androidx.compose.ui.text.platform.i.a).plus(kotlin.coroutines.j.e);
        Job.Key.getClass();
        iVar.a = CoroutineScopeKt.CoroutineScope(iVarPlus.plus(SupervisorKt.SupervisorJob((Job) null)));
        com.google.firebase.platforminfo.c cVar = new com.google.firebase.platforminfo.c(17);
        this.a = gVar;
        this.b = aVar;
        this.c = oVar;
        this.d = iVar;
        this.e = cVar;
        new e(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079 A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #2 {Exception -> 0x0081, blocks: (B:15:0x0027, B:17:0x003a, B:20:0x003f, B:22:0x0043, B:25:0x0050, B:42:0x0079, B:43:0x0080, B:24:0x004c), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final u a(t tVar) {
        Typeface typefaceC;
        u uVar;
        androidx.compose.foundation.text.input.internal.o oVar = this.c;
        synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
            u uVar2 = (u) ((androidx.collection.u) oVar.z).h(tVar);
            if (uVar2 != null) {
                if (uVar2.y) {
                    return uVar2;
                }
            }
            try {
                this.d.getClass();
                s sVar = tVar.a;
                q qVar = (q) this.e.e;
                int i = tVar.c;
                l lVar = tVar.b;
                if (sVar != null && !(sVar instanceof b)) {
                    if (sVar instanceof n) {
                        typefaceC = qVar.b((n) sVar, lVar, i);
                    } else {
                        uVar = null;
                    }
                    if (uVar != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
                        if (((androidx.collection.u) oVar.z).h(tVar) == null && uVar.y) {
                            ((androidx.collection.u) oVar.z).l(tVar, uVar);
                        }
                    }
                    return uVar;
                }
                typefaceC = qVar.c(lVar, i);
                uVar = new u(typefaceC);
                if (uVar != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
                    if (((androidx.collection.u) oVar.z).h(tVar) == null) {
                        ((androidx.collection.u) oVar.z).l(tVar, uVar);
                    }
                    return uVar;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final u b(s sVar, l lVar, int i, int i2) {
        a aVar = this.b;
        aVar.getClass();
        int i3 = aVar.e;
        l lVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? lVar : new l(com.google.android.material.resources.c.c(lVar.e + i3, 1, 1000));
        this.a.getClass();
        return a(new t(sVar, lVar2, i, i2, null));
    }
}
