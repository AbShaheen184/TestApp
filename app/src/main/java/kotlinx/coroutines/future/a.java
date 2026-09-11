package kotlinx.coroutines.future;

import androidx.compose.animation.core.g0;
import androidx.constraintlayout.core.g;
import com.google.android.datatransport.runtime.backends.c;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import kotlin.jvm.functions.p;
import net.luminis.quic.impl.h;
import net.luminis.quic.impl.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements BiFunction {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        boolean z;
        switch (this.e) {
            case 0:
                return ((g0) this.y).invoke(obj, (Throwable) obj2);
            case 1:
                return FutureKt.setupCancellation$lambda$3((p) this.y, obj, (Throwable) obj2);
            default:
                i iVar = (i) this.y;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byte[] bArr = new byte[16];
                byteBuffer.get(bArr);
                for (net.luminis.quic.cid.a aVar : iVar.Y.f.a.values()) {
                    int i = aVar.c;
                    z = true;
                    if (!g.b(i, 1) && !g.b(i, 4) && Arrays.equals(aVar.d, bArr)) {
                        if (c.a(iVar.L)) {
                            iVar.z.getClass();
                        } else {
                            iVar.T.i();
                            iVar.L = 5;
                            try {
                                iVar.N.schedule(new h(iVar, 4), iVar.T.d() * 3, TimeUnit.MILLISECONDS);
                                break;
                            } catch (RejectedExecutionException unused) {
                            }
                            iVar.z.getClass();
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
