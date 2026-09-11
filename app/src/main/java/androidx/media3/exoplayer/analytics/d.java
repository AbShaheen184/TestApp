package androidx.media3.exoplayer.analytics;

import android.media.AudioDescriptor;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import androidx.compose.foundation.lazy.grid.l;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.m;
import androidx.media3.exoplayer.audio.d0;
import androidx.media3.exoplayer.audio.i0;
import androidx.media3.exoplayer.audio.k0;
import androidx.media3.exoplayer.audio.n0;
import androidx.media3.exoplayer.audio.o0;
import androidx.media3.exoplayer.audio.p;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.audio.r;
import androidx.media3.exoplayer.f0;
import androidx.media3.exoplayer.trackselection.o;
import com.google.common.base.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements m, t {
    public final /* synthetic */ int e;

    public /* synthetic */ d(int i) {
        this.e = i;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // com.google.common.base.t
    public Object get() {
        byte[] bArr = new byte[12];
        i.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        long jW;
        com.app.mlounge.data.music.e eVar;
        f0 f0Var;
        o oVar;
        switch (this.e) {
            case 0:
                ((b) obj).getClass();
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).getClass();
                return;
            case 3:
                ((b) obj).getClass();
                return;
            case 4:
                ((b) obj).getClass();
                return;
            case 5:
                ((b) obj).getClass();
                return;
            case 6:
                ((b) obj).getClass();
                return;
            case 7:
                ((b) obj).getClass();
                return;
            case 8:
                ((b) obj).getClass();
                return;
            case 9:
                ((b) obj).getClass();
                return;
            case 10:
                ((b) obj).getClass();
                return;
            case 11:
                ((b) obj).getClass();
                return;
            case 12:
                ((b) obj).getClass();
                return;
            case 13:
                ((b) obj).getClass();
                return;
            case 14:
                ((b) obj).getClass();
                return;
            case 15:
                ((b) obj).getClass();
                return;
            case 16:
                ((b) obj).getClass();
                return;
            case 17:
                ((b) obj).getClass();
                return;
            case 18:
                ((b) obj).getClass();
                return;
            case 19:
                ((b) obj).getClass();
                return;
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                com.app.mlounge.data.music.e eVar2 = ((i0) obj).a.n;
                if (eVar2 != null) {
                    q0 q0Var = (q0) eVar2.y;
                    synchronized (q0Var.e) {
                        oVar = q0Var.O;
                        break;
                    }
                    if (oVar != null) {
                        synchronized (oVar.c) {
                            oVar.f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                k0 k0Var = (k0) obj;
                n0 n0Var = k0Var.b;
                if (k0Var.equals(n0Var.j) && n0Var.n != null) {
                    l lVar = n0Var.p;
                    int i = lVar.b;
                    if (i != -1) {
                        long j = ((p) lVar.e).f / i;
                        d0 d0Var = n0Var.t;
                        d0Var.getClass();
                        jW = j0.W(d0Var.a.getSampleRate(), j);
                    } else {
                        jW = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - n0Var.W;
                    com.app.mlounge.data.music.e eVar3 = n0Var.n;
                    int i2 = ((p) n0Var.p.e).f;
                    long jD0 = j0.d0(jW);
                    androidx.media3.exoplayer.audio.t tVar = ((q0) eVar3.y).g1;
                    Handler handler = tVar.a;
                    if (handler != null) {
                        handler.post(new r(tVar, i2, jD0, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                n0.c0.getAndDecrement();
                com.app.mlounge.data.music.e eVar4 = k0Var2.b.n;
                if (eVar4 != null) {
                    int i3 = k0Var2.a.a;
                    o0 o0Var = new o0();
                    androidx.media3.exoplayer.audio.t tVar2 = ((q0) eVar4.y).g1;
                    Handler handler2 = tVar2.a;
                    if (handler2 != null) {
                        handler2.post(new r(tVar2, o0Var, 1));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                k0 k0Var3 = (k0) obj;
                n0 n0Var2 = k0Var3.b;
                if (k0Var3.equals(n0Var2.j) && (eVar = n0Var2.n) != null && n0Var2.O && (f0Var = ((q0) eVar.y).f0) != null) {
                    f0Var.a();
                    return;
                }
                return;
            case 27:
                k0 k0Var4 = (k0) obj;
                n0 n0Var3 = k0Var4.b;
                if (k0Var4.equals(n0Var3.j) && n0Var3.M) {
                    n0Var3.N = true;
                    return;
                }
                return;
        }
    }
}
