package androidx.compose.foundation.lazy.grid;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public l(net.luminis.quic.impl.o oVar, int i, net.luminis.quic.send.k kVar) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.c = oVar;
        this.a = 120;
        this.d = kVar;
        this.f = scheduledExecutorServiceNewScheduledThreadPool;
        this.e = Long.valueOf(System.currentTimeMillis());
        this.b = (i / 1000) / 2;
        d();
    }

    public static boolean a(l lVar) {
        return Objects.equals(((androidx.media3.common.r) lVar.c).o, "audio/raw");
    }

    public long b(int i, int i2) {
        int i3;
        androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) this.c;
        int[] iArr = (int[]) oVar.y;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) oVar.z;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            androidx.compose.ui.unit.i.a("width must be >= 0");
        }
        return androidx.compose.ui.unit.b.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public p c(int i) {
        t tVarC = ((u) this.f).c(i);
        int i2 = tVarC.a;
        int size = tVarC.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        o[] oVarArr = new o[size];
        int i5 = 0;
        while (true) {
            List list = tVarC.b;
            if (i3 >= size) {
                return new p(i, oVarArr, (androidx.compose.foundation.text.input.internal.o) this.d, list, i4);
            }
            int i6 = (int) ((b) list.get(i3)).a;
            int i7 = i4;
            o oVarW = ((k) this.e).w(i2 + i3, b(i5, i6), i5, i6, i7);
            i5 += i6;
            oVarArr[i3] = oVarW;
            i3++;
            i4 = i7;
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((Long) this.e).longValue();
        int i = this.a;
        int i2 = this.b;
        if (jCurrentTimeMillis < ((long) (i - i2)) * 1000) {
            ((ScheduledExecutorService) this.f).schedule(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 11), i2, TimeUnit.SECONDS);
        }
    }

    public l(androidx.compose.foundation.text.input.internal.o oVar, int i, int i2, k kVar, u uVar) {
        this.d = oVar;
        this.c = oVar;
        this.a = i;
        this.b = i2;
        this.e = kVar;
        this.f = uVar;
    }

    public l(androidx.media3.common.r rVar, androidx.media3.common.r rVar2, int i, int i2, androidx.media3.exoplayer.audio.p pVar, androidx.media3.common.audio.i iVar) {
        this.c = rVar;
        this.d = rVar2;
        this.a = i;
        this.b = i2;
        this.e = pVar;
        this.f = iVar;
    }
}
