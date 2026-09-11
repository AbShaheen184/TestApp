package androidx.media3.extractor.text.cea;

import androidx.activity.y;
import androidx.media3.common.util.j0;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements androidx.media3.extractor.text.e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public g d;
    public long e;
    public long f;
    public long g;

    public h() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new g(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            y yVar = new y(this, 23);
            androidx.media3.extractor.text.c cVar = new androidx.media3.extractor.text.c();
            cVar.E = yVar;
            arrayDeque.add(cVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // androidx.media3.decoder.b
    public final void a(long j) {
        this.g = j;
    }

    @Override // androidx.media3.extractor.text.e
    public final void b(long j) {
        this.e = j;
    }

    @Override // androidx.media3.decoder.b
    public final Object d() {
        com.google.android.material.motion.a.q(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // androidx.media3.decoder.b
    public final void e(androidx.media3.extractor.text.i iVar) {
        com.google.android.material.motion.a.f(iVar == this.d);
        g gVar = (g) iVar;
        if (gVar.g(4)) {
            long j = this.f;
            this.f = 1 + j;
            gVar.H = j;
            this.c.add(gVar);
        } else {
            long j2 = gVar.D;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    gVar.H = j4;
                    this.c.add(gVar);
                } else {
                    gVar.o();
                    this.a.add(gVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                gVar.H = j5;
                this.c.add(gVar);
            }
        }
        this.d = null;
    }

    public abstract i f();

    @Override // androidx.media3.decoder.b
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = j0.a;
            gVar.o();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.o();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // androidx.media3.decoder.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.media3.extractor.text.c c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            String str = j0.a;
            if (gVar.D > this.e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zG = gVar2.g(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zG) {
                androidx.media3.extractor.text.c cVar = (androidx.media3.extractor.text.c) arrayDeque.pollFirst();
                cVar.a(4);
                gVar2.o();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            g(gVar2);
            if (i()) {
                i iVarF = f();
                androidx.media3.extractor.text.c cVar2 = (androidx.media3.extractor.text.c) arrayDeque.pollFirst();
                long j = gVar2.D;
                cVar2.z = j;
                cVar2.B = iVarF;
                cVar2.C = j;
                gVar2.o();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.o();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // androidx.media3.decoder.b
    public void release() {
    }
}
