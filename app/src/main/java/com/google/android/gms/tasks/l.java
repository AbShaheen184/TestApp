package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements f, e, c {
    public int A;
    public int B;
    public int C;
    public Exception D;
    public boolean E;
    public final Object e = new Object();
    public final int y;
    public final q z;

    public l(int i, q qVar) {
        this.y = i;
        this.z = qVar;
    }

    public final void a() {
        int i = this.A;
        int i2 = this.B;
        int i3 = i + i2 + this.C;
        int i4 = this.y;
        if (i3 == i4) {
            Exception exc = this.D;
            q qVar = this.z;
            if (exc == null) {
                if (this.E) {
                    qVar.n();
                    return;
                } else {
                    qVar.k(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            qVar.m(new ExecutionException(sb.toString(), this.D));
        }
    }

    @Override // com.google.android.gms.tasks.f
    public final void b(Object obj) {
        synchronized (this.e) {
            this.A++;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.c
    public final void l() {
        synchronized (this.e) {
            this.C++;
            this.E = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.e
    public final void z(Exception exc) {
        synchronized (this.e) {
            this.B++;
            this.D = exc;
            a();
        }
    }
}
