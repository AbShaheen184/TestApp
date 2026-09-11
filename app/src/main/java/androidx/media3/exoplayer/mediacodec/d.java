package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import androidx.media3.common.util.j0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {
    public static final ArrayDeque D = new ArrayDeque();
    public static final Object E = new Object();
    public final AtomicReference A;
    public final androidx.media3.common.util.h B;
    public boolean C;
    public final MediaCodec e;
    public final HandlerThread y;
    public androidx.localbroadcastmanager.content.a z;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        androidx.media3.common.util.h hVar = new androidx.media3.common.util.h();
        this.e = mediaCodec;
        this.y = handlerThread;
        this.B = hVar;
        this.A = new AtomicReference();
    }

    public static c a() {
        ArrayDeque arrayDeque = D;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void c(int i, androidx.media3.decoder.a aVar, long j, int i2) {
        v();
        c cVarA = a();
        cVarA.a = i;
        cVarA.b = 0;
        cVarA.d = j;
        cVarA.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = cVarA.c;
        cryptoInfo.numSubSamples = aVar.f;
        int[] iArr = aVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = aVar.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = aVar.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = aVar.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = aVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(aVar.g, aVar.h));
        androidx.localbroadcastmanager.content.a aVar2 = this.z;
        String str = j0.a;
        aVar2.obtainMessage(2, cVarA).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void d(Bundle bundle) {
        v();
        androidx.localbroadcastmanager.content.a aVar = this.z;
        String str = j0.a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void f(int i, int i2, int i3, long j) {
        v();
        c cVarA = a();
        cVarA.a = i;
        cVarA.b = i2;
        cVarA.d = j;
        cVarA.e = i3;
        androidx.localbroadcastmanager.content.a aVar = this.z;
        String str = j0.a;
        aVar.obtainMessage(1, cVarA).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void flush() {
        if (this.C) {
            try {
                androidx.localbroadcastmanager.content.a aVar = this.z;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                androidx.media3.common.util.h hVar = this.B;
                synchronized (hVar) {
                    hVar.b = false;
                }
                androidx.localbroadcastmanager.content.a aVar2 = this.z;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (hVar) {
                    while (!hVar.b) {
                        hVar.a.getClass();
                        hVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void shutdown() {
        if (this.C) {
            flush();
            this.y.quit();
        }
        this.C = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void start() {
        if (this.C) {
            return;
        }
        HandlerThread handlerThread = this.y;
        handlerThread.start();
        this.z = new androidx.localbroadcastmanager.content.a(this, handlerThread.getLooper(), 1);
        this.C = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public final void v() {
        RuntimeException runtimeException = (RuntimeException) this.A.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
