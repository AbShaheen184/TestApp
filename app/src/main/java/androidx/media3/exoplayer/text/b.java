package androidx.media3.exoplayer.text;

import androidx.media3.decoder.f;
import androidx.media3.decoder.h;
import androidx.media3.extractor.text.i;
import androidx.media3.extractor.text.l;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements androidx.media3.extractor.text.e {
    public final l n;

    public b(l lVar) {
        super(new i[2], new androidx.media3.extractor.text.c[2]);
        int i = this.g;
        androidx.media3.decoder.e[] eVarArr = this.e;
        com.google.android.material.motion.a.q(i == eVarArr.length);
        for (androidx.media3.decoder.e eVar : eVarArr) {
            eVar.q(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        this.n = lVar;
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.e f() {
        return new i(1);
    }

    @Override // androidx.media3.decoder.h
    public final f g() {
        return new androidx.media3.extractor.text.c(this);
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.c h(Throwable th) {
        return new androidx.media3.extractor.text.f("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.c i(androidx.media3.decoder.e eVar, f fVar, boolean z) {
        i iVar = (i) eVar;
        androidx.media3.extractor.text.c cVar = (androidx.media3.extractor.text.c) fVar;
        try {
            ByteBuffer byteBuffer = iVar.B;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            l lVar = this.n;
            if (z) {
                lVar.reset();
            }
            androidx.media3.extractor.text.d dVarO = lVar.o(bArrArray, 0, iLimit);
            long j = iVar.D;
            long j2 = iVar.G;
            cVar.z = j;
            cVar.B = dVarO;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            cVar.C = j;
            cVar.A = false;
            return null;
        } catch (androidx.media3.extractor.text.f e) {
            return e;
        }
    }

    @Override // androidx.media3.extractor.text.e
    public final void b(long j) {
    }
}
