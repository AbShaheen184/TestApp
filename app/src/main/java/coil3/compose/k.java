package coil3.compose;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.r1;
import androidx.compose.runtime.q1;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.w1;
import coil3.t;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final j a = new j();
    public static final coil3.i b;
    public static final coil3.i c;

    static {
        Boolean bool = Boolean.FALSE;
        b = new coil3.i(bool);
        c = new coil3.i(bool);
    }

    public static final void a(Object obj, String str, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.ui.layout.j jVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        kotlin.jvm.functions.l lVar2 = (i2 & 16) != 0 ? null : lVar;
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.B;
        coil3.q qVarA = t.a((Context) rVar2.j(m0.b));
        int i3 = i << 3;
        int i4 = (i & Token.ELSE) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        b(new coil3.compose.internal.a(obj, (b) rVar2.j(r.a), qVarA), str, rVar, i.T, lVar2, jVar2, jVar, rVar2, (i4 & Token.ASSIGN_MOD) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x019e  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0211  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x023d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x024a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0250  */
    /* JADX WARN: Code duplicated, block: B:140:0x0256  */
    /* JADX WARN: Code duplicated, block: B:142:0x025c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0262  */
    public static final void b(final coil3.compose.internal.a aVar, final String str, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final androidx.compose.ui.e eVar, final androidx.compose.ui.layout.j jVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        String str2;
        androidx.compose.ui.layout.j jVar2;
        int i4;
        coil3.request.g gVar;
        Object obj;
        m mVar;
        int iHashCode;
        kotlin.jvm.functions.a aVar2;
        androidx.compose.ui.node.e eVar2;
        rVar2.c0(1236588022);
        if ((i & 6) == 0) {
            i3 = (rVar2.f(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= rVar2.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i3 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= rVar2.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar2.h(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= rVar2.f(eVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            jVar2 = jVar;
            i3 |= rVar2.f(jVar2) ? 1048576 : 524288;
        } else {
            jVar2 = jVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= rVar2.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= rVar2.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= rVar2.d(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar2.g(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (rVar2.T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object obj2 = aVar.a;
            int i5 = coil3.compose.internal.h.b;
            rVar2.b0(-329318062);
            boolean z = obj2 instanceof coil3.request.g;
            Object obj3 = androidx.compose.runtime.m.a;
            if (z) {
                rVar2.b0(-1008942344);
                gVar = (coil3.request.g) obj2;
                if (gVar.s.g != null) {
                    rVar2.b0(-1008902292);
                    rVar2.p(false);
                    rVar2.p(false);
                } else {
                    rVar2.b0(-1008854118);
                    coil3.size.i iVarA = coil3.compose.internal.h.a(jVar, rVar2);
                    boolean zF = rVar2.f(obj2) | rVar2.f(iVarA);
                    Object objQ = rVar2.Q();
                    if (zF || objQ == obj3) {
                        coil3.request.d dVarA = coil3.request.g.a(gVar);
                        dVarA.l = iVarA;
                        objQ = dVarA.a();
                        rVar2.l0(objQ);
                    }
                    gVar = (coil3.request.g) objQ;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, false, false, false);
                }
                obj = gVar.b;
                if (!(obj instanceof coil3.request.d)) {
                    net.luminis.tls.engine.impl.c.o("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                    return;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.g)) {
                    coil3.compose.internal.h.c("ImageBitmap");
                    throw null;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.vector.f)) {
                    coil3.compose.internal.h.c("ImageVector");
                    throw null;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.painter.b)) {
                    coil3.compose.internal.h.c("Painter");
                    throw null;
                }
                if (gVar.c == null) {
                    net.luminis.tls.engine.impl.c.o("request.target must be null.");
                    return;
                }
                if (((androidx.lifecycle.p) coil3.m.d(gVar, coil3.request.i.e)) == null) {
                    net.luminis.tls.engine.impl.c.o("request.lifecycle must be null.");
                    return;
                }
                coil3.q qVar = aVar.c;
                b bVar = aVar.b;
                if (((Boolean) rVar2.j(w1.a)).booleanValue()) {
                    rVar2.b0(2019030948);
                    m mVar2 = (m) rVar2.j(s.a);
                    rVar2.p(false);
                    mVar = mVar2;
                } else {
                    rVar2.b0(2019088453);
                    rVar2.p(false);
                    mVar = null;
                }
                androidx.compose.ui.r rVarD = rVar.d(new coil3.compose.internal.b(gVar, qVar, bVar, lVar, lVar2, eVar, jVar2, mVar, str2));
                iHashCode = Long.hashCode(rVar2.T);
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarD);
                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                androidx.compose.ui.node.g.b.getClass();
                aVar2 = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar2);
                } else {
                    rVar2.o0();
                }
                androidx.compose.runtime.s.x(rVar2, coil3.compose.internal.g.a, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                eVar2 = androidx.compose.ui.node.f.f;
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode))) {
                    androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar2);
                }
                rVar2.p(true);
            } else {
                rVar2.b0(-1008595950);
                Context context = (Context) rVar2.j(m0.b);
                coil3.size.i iVarA2 = coil3.compose.internal.h.a(jVar, rVar2);
                boolean zF2 = rVar2.f(context) | rVar2.f(obj2) | rVar2.f(iVarA2);
                Object objQ2 = rVar2.Q();
                if (zF2 || objQ2 == obj3) {
                    coil3.request.d dVar = new coil3.request.d(context);
                    dVar.c = obj2;
                    dVar.l = iVarA2;
                    objQ2 = dVar.a();
                    rVar2.l0(objQ2);
                }
                gVar = (coil3.request.g) objQ2;
                rVar2.p(false);
            }
            rVar2.p(false);
            obj = gVar.b;
            if (!(obj instanceof coil3.request.d)) {
                net.luminis.tls.engine.impl.c.o("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.g)) {
                coil3.compose.internal.h.c("ImageBitmap");
                throw null;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.vector.f)) {
                coil3.compose.internal.h.c("ImageVector");
                throw null;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.painter.b)) {
                coil3.compose.internal.h.c("Painter");
                throw null;
            }
            if (gVar.c == null) {
                net.luminis.tls.engine.impl.c.o("request.target must be null.");
                return;
            }
            if (((androidx.lifecycle.p) coil3.m.d(gVar, coil3.request.i.e)) == null) {
                net.luminis.tls.engine.impl.c.o("request.lifecycle must be null.");
                return;
            }
            coil3.q qVar2 = aVar.c;
            b bVar2 = aVar.b;
            if (((Boolean) rVar2.j(w1.a)).booleanValue()) {
                rVar2.b0(2019030948);
                m mVar3 = (m) rVar2.j(s.a);
                rVar2.p(false);
                mVar = mVar3;
            } else {
                rVar2.b0(2019088453);
                rVar2.p(false);
                mVar = null;
            }
            androidx.compose.ui.r rVarD2 = rVar.d(new coil3.compose.internal.b(gVar, qVar2, bVar2, lVar, lVar2, eVar, jVar2, mVar, str2));
            iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD2);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.node.g.b.getClass();
            aVar2 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar2);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, coil3.compose.internal.g.a, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
            eVar2 = androidx.compose.ui.node.f.f;
            if (rVar2.S) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar2);
            } else {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar2);
            }
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: coil3.compose.a
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    k.b(aVar, str, rVar, lVar, lVar2, eVar, jVar, (androidx.compose.runtime.r) obj4, androidx.compose.runtime.s.A(i | 1), androidx.compose.runtime.s.A(i2));
                    return y.a;
                }
            };
        }
    }

    public static final void c(Object obj, String str, androidx.compose.ui.r rVar, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, kotlin.jvm.functions.l lVar, androidx.compose.ui.layout.j jVar, androidx.compose.runtime.r rVar2, int i, int i2, int i3) {
        if ((i3 & LibretroCore.SCREEN_WIDTH) != 0) {
            lVar = null;
        }
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.B;
        coil3.q qVarA = t.a((Context) rVar2.j(m0.b));
        int i4 = (i2 << 3) & Token.ASSIGN_MOD;
        coil3.compose.internal.a aVar = new coil3.compose.internal.a(obj, (b) rVar2.j(r.a), qVarA);
        int i5 = coil3.compose.internal.h.b;
        b(aVar, str, rVar, (bVar == null && bVar2 == null && bVar2 == null) ? i.T : new androidx.compose.animation.core.a(14, bVar, bVar2, bVar2), lVar != null ? new r1(2, lVar) : null, jVar2, jVar, rVar2, (i4 << 15) & 3670016, 0);
    }

    public static final androidx.compose.ui.graphics.painter.b d(coil3.k kVar, Context context, int i) {
        if (!(kVar instanceof coil3.a)) {
            return kVar instanceof coil3.e ? new com.google.accompanist.drawablepainter.b(coil3.m.b(kVar, context.getResources()).mutate()) : new q(kVar);
        }
        Bitmap bitmap = ((coil3.a) kVar).a;
        androidx.compose.ui.graphics.painter.a aVar = new androidx.compose.ui.graphics.painter.a(new androidx.compose.ui.graphics.g(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.E = i;
        return aVar;
    }
}
