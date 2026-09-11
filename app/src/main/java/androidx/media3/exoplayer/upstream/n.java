package androidx.media3.exoplayer.upstream;

import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.z0;
import androidx.media3.common.util.j0;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o {
    public static final h d = new h(-9223372036854775807L, 0, false);
    public static final h e = new h(-9223372036854775807L, 2, false);
    public static final h f = new h(-9223372036854775807L, 3, false);
    public final androidx.media3.exoplayer.util.a a;
    public j b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = j0.a;
        this(new androidx.media3.exoplayer.util.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(strConcat, 1)), new androidx.media3.exoplayer.hls.playlist.a(2), 0));
    }

    public final void a() {
        j jVar = this.b;
        jVar.getClass();
        jVar.a(false);
    }

    @Override // androidx.media3.exoplayer.upstream.o
    public final void b() throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        j jVar = this.b;
        if (jVar != null) {
            int i = jVar.e;
            IOException iOException2 = jVar.B;
            if (iOException2 != null && jVar.C > i) {
                throw iOException2;
            }
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(l lVar) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(true);
        }
        androidx.media3.exoplayer.util.a aVar = this.a;
        if (lVar != null) {
            aVar.execute(new z0(lVar, 8));
        }
        ((androidx.media3.exoplayer.hls.playlist.a) aVar.z).accept(aVar.y);
    }

    public final void f(k kVar, i iVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.c = null;
        j jVar = new j(this, looperMyLooper, kVar, iVar, i, SystemClock.elapsedRealtime());
        com.google.android.material.motion.a.q(this.b == null);
        this.b = jVar;
        jVar.b();
    }

    public n(androidx.media3.exoplayer.util.a aVar) {
        this.a = aVar;
    }
}
