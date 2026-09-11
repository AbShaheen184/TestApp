package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.compose.foundation.lazy.layout.b1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.z9;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends p {
    public final com.google.android.gms.tasks.j b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(f fVar, com.google.android.gms.tasks.j jVar) {
        this(4, jVar);
        this.c = 1;
        this.d = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final boolean a(k kVar) {
        switch (this.c) {
            case 0:
                return ((s) this.d).a.e;
            default:
                s sVar = (s) kVar.i.get((f) this.d);
                return sVar != null && sVar.a.e;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final com.google.android.gms.common.d[] b(k kVar) {
        switch (this.c) {
            case 0:
                return (com.google.android.gms.common.d[]) ((s) this.d).a.z;
            default:
                s sVar = (s) kVar.i.get((f) this.d);
                if (sVar == null) {
                    return null;
                }
                return (com.google.android.gms.common.d[]) sVar.a.z;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void c(Status status) {
        this.b.c(new com.google.android.gms.common.api.d(status));
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void d(Exception exc) {
        this.b.c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void e(k kVar) throws DeadObjectException {
        try {
            h(kVar);
        } catch (DeadObjectException e) {
            c(p.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(p.g(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final /* bridge */ /* synthetic */ void f(coil3.memory.c cVar, boolean z) {
        int i = this.c;
    }

    public final void h(k kVar) {
        switch (this.c) {
            case 0:
                b1 b1Var = ((s) this.d).a;
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.c) ((androidx.compose.material.ripple.g) b1Var.A).b).accept(kVar.e, this.b);
                f fVar = (f) ((androidx.emoji2.text.f) ((s) this.d).a.y).c;
                if (fVar != null) {
                    kVar.i.put(fVar, (s) this.d);
                }
                break;
            default:
                s sVar = (s) kVar.i.remove((f) this.d);
                if (sVar == null) {
                    this.b.d(Boolean.FALSE);
                } else {
                    com.google.android.gms.common.api.c cVar = kVar.e;
                    ((f1) ((androidx.compose.material.ripple.g) sVar.b.y).c).getClass();
                    int i = z9.j;
                    androidx.emoji2.text.f fVar2 = (androidx.emoji2.text.f) sVar.a.y;
                    fVar2.b = null;
                    fVar2.c = null;
                }
                break;
        }
    }

    public v(int i, com.google.android.gms.tasks.j jVar) {
        super(i);
        this.b = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(s sVar, com.google.android.gms.tasks.j jVar) {
        this(3, jVar);
        this.c = 0;
        this.d = sVar;
    }

    private final /* bridge */ /* synthetic */ void i(coil3.memory.c cVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(coil3.memory.c cVar, boolean z) {
    }
}
