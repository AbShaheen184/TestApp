package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {
    public static final androidx.compose.ui.r a = androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, androidx.compose.material3.tokens.w.d);

    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    public static final void a(final androidx.compose.ui.graphics.painter.b bVar, final String str, final androidx.compose.ui.r rVar, final long j, androidx.compose.runtime.r rVar2, final int i) {
        int i2;
        androidx.compose.ui.r rVarA;
        rVar2.c0(-2142239481);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            rVar2.Y();
            if ((i & 1) != 0 && !rVar2.C()) {
                rVar2.W();
            }
            rVar2.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && rVar2.e(j)) || (i2 & 3072) == 2048;
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (z || objQ == fVar) {
                objQ = androidx.compose.ui.graphics.t.c(j, androidx.compose.ui.graphics.t.i) ? null : new androidx.compose.ui.graphics.m(j, 5);
                rVar2.l0(objQ);
            }
            androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) objQ;
            androidx.compose.ui.r rVar3 = androidx.compose.ui.o.b;
            if (str != null) {
                rVar2.b0(-536990979);
                boolean z2 = (i2 & Token.ASSIGN_MOD) == 32;
                Object objQ2 = rVar2.Q();
                if (z2 || objQ2 == fVar) {
                    objQ2 = new r0(str, 1);
                    rVar2.l0(objQ2);
                }
                rVarA = androidx.compose.ui.semantics.n.a(rVar3, false, (kotlin.jvm.functions.l) objQ2);
                rVar2.p(false);
            } else {
                rVar2.b0(-536832197);
                rVar2.p(false);
                rVarA = rVar3;
            }
            if (androidx.compose.ui.geometry.e.a(bVar.h(), 9205357640488583168L)) {
                rVar3 = a;
            } else {
                long jH = bVar.h();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jH & 4294967295L)))) {
                    rVar3 = a;
                }
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.f(rVar.d(rVar3), bVar, 0.0f, mVar, 22).d(rVarA), rVar2, 0);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.e1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f1.a(bVar, str, rVar, j, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.graphics.vector.f fVar, String str, androidx.compose.ui.r rVar, long j, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        String str2;
        androidx.compose.runtime.r rVar3;
        final long j2;
        final androidx.compose.ui.r rVar4;
        rVar2.c0(-126890956);
        if ((i & 6) == 0) {
            i3 = (rVar2.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar2.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && rVar2.e(j)) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                if (i4 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 8) != 0) {
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    i3 &= -7169;
                }
            } else {
                rVar2.W();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            androidx.compose.ui.r rVar5 = rVar;
            long j3 = j;
            rVar2.q();
            str2 = str;
            rVar3 = rVar2;
            a(androidx.compose.ui.graphics.vector.b.d(fVar, rVar2), str2, rVar5, j3, rVar3, (i3 & Token.ASSIGN_MOD) | 8 | (i3 & 896) | (i3 & 7168));
            rVar4 = rVar5;
            j2 = j3;
        } else {
            str2 = str;
            rVar3 = rVar2;
            rVar3.W();
            j2 = j;
            rVar4 = rVar;
        }
        androidx.compose.runtime.q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            final String str3 = str2;
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.d1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f1.b(fVar, str3, rVar4, j2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }
}
