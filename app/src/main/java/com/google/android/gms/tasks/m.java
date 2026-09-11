package com.google.android.gms.tasks;

import com.google.common.util.concurrent.l0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements o, f, e, c {
    public final q A;
    public final /* synthetic */ int e;
    public final Executor y;
    public final b z;

    public /* synthetic */ m(Executor executor, b bVar, q qVar, int i) {
        this.e = i;
        this.y = executor;
        this.z = bVar;
        this.A = qVar;
    }

    @Override // com.google.android.gms.tasks.o
    public final void a(i iVar) {
        switch (this.e) {
            case 0:
                this.y.execute(new l0(23, this, iVar, false));
                break;
            default:
                this.y.execute(new l0(24, this, iVar, false));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        this.A.k(obj);
    }

    @Override // com.google.android.gms.tasks.c
    public void l() {
        this.A.n();
    }

    @Override // com.google.android.gms.tasks.e
    public void z(Exception exc) {
        this.A.m(exc);
    }
}
