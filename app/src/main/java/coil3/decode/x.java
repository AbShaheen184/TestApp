package coil3.decode;

import android.graphics.ImageDecoder;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements k {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final coil3.request.n c;
    public final Semaphore d;

    public x(ImageDecoder.Source source, AutoCloseable autoCloseable, coil3.request.n nVar, Semaphore semaphore) {
        this.a = source;
        this.b = autoCloseable;
        this.c = nVar;
        this.d = semaphore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil3.decode.k
    public final Object a(kotlin.coroutines.d dVar) {
        v vVar;
        Semaphore semaphore;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i = vVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.A = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            vVar = new v(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object obj = vVar.y;
        int i2 = vVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            Semaphore semaphore2 = this.d;
            vVar.e = semaphore2;
            vVar.A = 1;
            Object objAcquire = semaphore2.acquire(vVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAcquire == aVar) {
                return aVar;
            }
            semaphore = semaphore2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            semaphore = vVar.e;
            kotlin.a.e(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                i iVar = new i(new coil3.a(ImageDecoder.decodeBitmap(this.a, new w(this, vVar2))), vVar2.e);
                com.google.common.base.i.c(autoCloseable, null);
                semaphore.release();
                return iVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.i.c(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            semaphore.release();
            throw th3;
        }
    }
}
