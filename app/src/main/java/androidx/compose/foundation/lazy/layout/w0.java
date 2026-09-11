package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.q1;
import androidx.compose.runtime.u2;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements androidx.compose.runtime.saveable.h, androidx.compose.runtime.saveable.d {
    public final androidx.compose.runtime.saveable.i e;
    public final androidx.compose.runtime.saveable.d y;
    public final androidx.collection.p0 z;

    public w0(androidx.compose.runtime.saveable.h hVar, Map map, androidx.compose.runtime.saveable.d dVar) {
        androidx.activity.compose.g gVar = new androidx.activity.compose.g(hVar, 14);
        u2 u2Var = androidx.compose.runtime.saveable.j.a;
        this.e = new androidx.compose.runtime.saveable.i(map, gVar);
        this.y = dVar;
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        this.z = new androidx.collection.p0();
    }

    @Override // androidx.compose.runtime.saveable.h
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.h
    public final Map b() {
        androidx.collection.p0 p0Var = this.z;
        Object[] objArr = p0Var.b;
        long[] jArr = p0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.y.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final androidx.compose.runtime.saveable.g d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void e(Object obj, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(-858296452);
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
            this.y.e(obj, fVar, rVar, i2 & Token.ELSE);
            boolean zH = rVar.h(this) | rVar.h(obj);
            Object objQ = rVar.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.h(18, this, obj);
                rVar.l0(objQ);
            }
            androidx.compose.runtime.j0.b(obj, (kotlin.jvm.functions.l) objQ, rVar);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, fVar, i, 3);
        }
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void f(Object obj) {
        this.y.f(obj);
    }
}
