package com.google.common.util.concurrent;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.android.material.resources.b {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                androidx.media3.exoplayer.hls.playlist.a.j("Could not initialize intrinsics", e2.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new o());
        }
        try {
            c = unsafe.objectFieldOffset(r.class.getDeclaredField("z"));
            b = unsafe.objectFieldOffset(r.class.getDeclaredField("y"));
            d = unsafe.objectFieldOffset(r.class.getDeclaredField("e"));
            e = unsafe.objectFieldOffset(q.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(q.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            net.luminis.tls.engine.impl.c.k(e3);
        }
    }

    @Override // com.google.android.material.resources.b
    public final boolean c(r rVar, f fVar, f fVar2) {
        return m.a(a, rVar, b, fVar, fVar2);
    }

    @Override // com.google.android.material.resources.b
    public final boolean d(r rVar, Object obj, Object obj2) {
        return n.a(a, rVar, d, obj, obj2);
    }

    @Override // com.google.android.material.resources.b
    public final boolean e(r rVar, q qVar, q qVar2) {
        return l.a(a, rVar, c, qVar, qVar2);
    }

    @Override // com.google.android.material.resources.b
    public final f j(r rVar) {
        f fVar;
        f fVar2 = f.d;
        do {
            fVar = rVar.y;
            if (fVar2 == fVar) {
                break;
            }
        } while (!c(rVar, fVar, fVar2));
        return fVar;
    }

    @Override // com.google.android.material.resources.b
    public final q k(r rVar) {
        q qVar;
        q qVar2 = q.c;
        do {
            qVar = rVar.z;
            if (qVar2 == qVar) {
                break;
            }
        } while (!e(rVar, qVar, qVar2));
        return qVar;
    }

    @Override // com.google.android.material.resources.b
    public final void r(q qVar, q qVar2) {
        a.putObject(qVar, f, qVar2);
    }

    @Override // com.google.android.material.resources.b
    public final void s(q qVar, Thread thread) {
        a.putObject(qVar, e, thread);
    }
}
