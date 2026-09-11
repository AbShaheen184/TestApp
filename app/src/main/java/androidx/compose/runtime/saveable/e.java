package androidx.compose.runtime.saveable;

import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Map;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public static final o B = new o(13, new a2(11), new androidx.compose.foundation.lazy.i(29));
    public final androidx.activity.compose.g A;
    public final Map e;
    public final o0 y;
    public h z;

    public e(Map map) {
        this.e = map;
        long[] jArr = w0.a;
        this.y = new o0();
        this.A = new androidx.activity.compose.g(this, 28);
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void e(Object obj, androidx.compose.runtime.internal.f fVar, r rVar, int i) {
        int i2;
        rVar.c0(533563200);
        if ((i & 6) == 0) {
            i2 = (rVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(this) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            rVar.d0(obj);
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (objQ == fVar2) {
                androidx.activity.compose.g gVar = this.A;
                if (!((Boolean) gVar.invoke(obj)).booleanValue()) {
                    androidx.media3.exoplayer.hls.playlist.a.g(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.e.get(obj);
                u2 u2Var = j.a;
                k kVar = new k(new i(map, gVar));
                rVar.l0(kVar);
                objQ = kVar;
            }
            k kVar2 = (k) objQ;
            s.b(new androidx.appcompat.widget.r[]{j.a.a(kVar2), androidx.savedstate.compose.a.a.a(kVar2)}, fVar, rVar, (i2 & Token.ASSIGN_MOD) | 8);
            boolean zH = rVar.h(this) | rVar.h(obj) | rVar.h(kVar2);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar2) {
                objQ2 = new androidx.compose.animation.core.a(10, this, obj, kVar2);
                rVar.l0(objQ2);
            }
            j0.b(y.a, (kotlin.jvm.functions.l) objQ2, rVar);
            if (rVar.y && rVar.G.i == rVar.z) {
                rVar.z = -1;
                rVar.y = false;
            }
            rVar.p(false);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, fVar, i, 8);
        }
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void f(Object obj) {
        if (this.y.k(obj) == null) {
            this.e.remove(obj);
        }
    }
}
