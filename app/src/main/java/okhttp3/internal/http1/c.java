package okhttp3.internal.http1;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.g;
import okhttp3.s;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public long B;
    public boolean C;
    public final /* synthetic */ f D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, s sVar) {
        super(fVar, sVar);
        sVar.getClass();
        this.D = fVar;
        this.B = -1L;
        this.C = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        if (r16.C == false) goto L55;
     */
    @Override // okhttp3.internal.http1.a, okio.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long K(okio.f r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.c.K(okio.f, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.z) {
            return;
        }
        if (this.C) {
            TimeZone timeZone = g.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.D.b.f();
                a(f.f);
            }
        }
        this.z = true;
    }
}
