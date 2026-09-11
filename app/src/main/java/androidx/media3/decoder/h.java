package androidx.media3.decoder;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements b {
    public final g a;
    public final e[] e;
    public final f[] f;
    public int g;
    public int h;
    public e i;
    public c j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public h(e[] eVarArr, f[] fVarArr) {
        this.e = eVarArr;
        this.g = eVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = fVarArr;
        this.h = fVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        g gVar = new g(this);
        this.a = gVar;
        gVar.start();
    }

    @Override // androidx.media3.decoder.b
    public final void a(long j) {
        synchronized (this.b) {
            try {
                com.google.android.material.motion.a.q(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.b
    public final Object d() {
        e eVar;
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                com.google.android.material.motion.a.q(this.i == null);
                int i = this.g;
                if (i == 0) {
                    eVar = null;
                } else {
                    e[] eVarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    eVar = eVarArr[i2];
                }
                this.i = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public abstract e f();

    @Override // androidx.media3.decoder.b
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                e eVar = this.i;
                if (eVar != null) {
                    eVar.o();
                    e[] eVarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    eVarArr[i] = eVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    e eVar2 = (e) this.c.removeFirst();
                    eVar2.o();
                    e[] eVarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    eVarArr2[i2] = eVar2;
                }
                while (!this.d.isEmpty()) {
                    ((f) this.d.removeFirst()).p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract f g();

    public abstract c h(Throwable th);

    public abstract c i(e eVar, f fVar, boolean z);

    public final boolean j() {
        boolean z;
        c cVarH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            e eVar = (e) this.c.removeFirst();
            f[] fVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            f fVar = fVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (eVar.g(4)) {
                fVar.a(4);
            } else {
                fVar.z = eVar.D;
                if (eVar.g(134217728)) {
                    fVar.a(134217728);
                }
                long j = eVar.D;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    fVar.A = true;
                }
                try {
                    cVarH = i(eVar, fVar, z2);
                } catch (OutOfMemoryError e) {
                    cVarH = h(e);
                } catch (RuntimeException e2) {
                    cVarH = h(e2);
                }
                if (cVarH != null) {
                    synchronized (this.b) {
                        this.j = cVarH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || fVar.A) {
                        fVar.p();
                    } else {
                        this.d.addLast(fVar);
                    }
                    eVar.o();
                    e[] eVarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    eVarArr[i2] = eVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // androidx.media3.decoder.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final f c() {
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (f) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void e(e eVar) {
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                com.google.android.material.motion.a.f(eVar == this.i);
                this.c.addLast(eVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(f fVar) {
        synchronized (this.b) {
            fVar.o();
            f[] fVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            fVarArr[i] = fVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // androidx.media3.decoder.b
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
