package androidx.compose.material3.internal;

import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.j2;
import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import androidx.compose.animation.core.y1;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.text.selection.k0;
import androidx.compose.material3.c2;
import androidx.compose.material3.i1;
import androidx.compose.material3.k3;
import androidx.compose.material3.n3;
import androidx.compose.material3.q0;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.platform.l1;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final float a;
    public static final float b = 4;
    public static final float c = 2;
    public static final float d = 24;
    public static final float e;
    public static final float f;

    static {
        float f2 = 16;
        a = f2;
        e = f2;
        f = f2;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x031b  */
    /* JADX WARN: Code duplicated, block: B:214:0x031e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0325  */
    /* JADX WARN: Code duplicated, block: B:220:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x032c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0348  */
    /* JADX WARN: Code duplicated, block: B:227:0x034c  */
    /* JADX WARN: Code duplicated, block: B:234:0x037c  */
    /* JADX WARN: Code duplicated, block: B:236:0x037f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0382  */
    /* JADX WARN: Code duplicated, block: B:240:0x0386  */
    /* JADX WARN: Code duplicated, block: B:242:0x038a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x038c  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:260:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:263:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x040f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0437  */
    /* JADX WARN: Code duplicated, block: B:269:0x043b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0458  */
    /* JADX WARN: Code duplicated, block: B:274:0x045c  */
    /* JADX WARN: Code duplicated, block: B:277:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x049e  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:284:0x0501  */
    /* JADX WARN: Code duplicated, block: B:285:0x0519  */
    /* JADX WARN: Code duplicated, block: B:287:0x0546  */
    /* JADX WARN: Code duplicated, block: B:288:0x0549 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x054b  */
    /* JADX WARN: Code duplicated, block: B:290:0x054e  */
    /* JADX WARN: Code duplicated, block: B:293:0x0556  */
    /* JADX WARN: Code duplicated, block: B:296:0x0569  */
    /* JADX WARN: Code duplicated, block: B:301:0x0596  */
    /* JADX WARN: Code duplicated, block: B:304:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:307:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:308:0x05d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:310:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:312:0x05da  */
    /* JADX WARN: Code duplicated, block: B:313:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:315:0x0600  */
    /* JADX WARN: Code duplicated, block: B:316:0x0603 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x0605  */
    /* JADX WARN: Code duplicated, block: B:318:0x0608  */
    /* JADX WARN: Code duplicated, block: B:320:0x060c  */
    /* JADX WARN: Code duplicated, block: B:321:0x061b  */
    /* JADX WARN: Code duplicated, block: B:324:0x0649  */
    /* JADX WARN: Code duplicated, block: B:328:0x068e  */
    /* JADX WARN: Code duplicated, block: B:331:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:332:0x069e  */
    public static final void a(final CharSequence charSequence, final kotlin.jvm.functions.p pVar, final n3 n3Var, final kotlin.jvm.functions.q qVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final kotlin.jvm.functions.p pVar4, final boolean z, final boolean z2, final androidx.compose.foundation.interaction.k kVar, final m0 m0Var, final k3 k3Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.r rVar2;
        j jVar;
        long j;
        float f2;
        float f3;
        h1 h1Var;
        float f4;
        int iOrdinal;
        float f5;
        y1 y1VarF;
        k1 k1Var;
        a2 a2VarC;
        int iOrdinal2;
        float f6;
        int iOrdinal3;
        a2 a2VarC2;
        j jVar2;
        int[] iArr;
        long j2;
        androidx.compose.ui.graphics.colorspace.c cVarF;
        boolean zF;
        Object objQ;
        long j3;
        androidx.compose.runtime.f fVar2;
        j jVar3;
        long j4;
        j jVar4;
        long j5;
        a2 a2VarC3;
        androidx.compose.ui.graphics.colorspace.c cVarF2;
        boolean zF2;
        Object objQ2;
        a2 a2VarC4;
        Object objQ3;
        w wVar;
        androidx.compose.ui.text.m0 m0Var2;
        androidx.compose.runtime.internal.f fVar3;
        boolean z3;
        androidx.compose.runtime.internal.f fVar4;
        long j6;
        Object objQ4;
        androidx.compose.runtime.internal.f fVarC;
        Object objQ5;
        long j7;
        androidx.compose.runtime.internal.f fVarC2;
        long j8;
        boolean z4;
        androidx.compose.runtime.internal.f fVarC3;
        Object objQ6;
        y0 y0Var;
        boolean zF3;
        Object objQ7;
        rVar.c0(546805032);
        if ((i & 6) == 0) {
            i3 = (rVar.d(1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.h(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rVar.h(pVar) ? 256 : 128;
        }
        int i5 = i3;
        int i6 = i & 3072;
        int i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i6 == 0) {
            i5 |= rVar.f(n3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= rVar.h(qVar) ? 16384 : 8192;
        }
        int i8 = i & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i5 |= rVar.h(pVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= rVar.h(pVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= rVar.h(pVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= rVar.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= rVar.h(null) ? 536870912 : 268435456;
        }
        int i10 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar.h(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= rVar.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.g(false)) {
                i7 = 2048;
            }
            i4 |= i7;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rVar.f(kVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            if (rVar.f(m0Var)) {
                i9 = 131072;
            }
            i4 |= i9;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rVar.f(k3Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= rVar.h(fVar) ? 8388608 : 4194304;
        }
        int i11 = i4;
        if (rVar.T(i10 & 1, ((306783379 & i10) == 306783378 && (i11 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, (i11 >> 12) & 14).getValue()).booleanValue();
            j jVar5 = j.z;
            j jVar6 = j.y;
            j jVar7 = j.e;
            if (zBooleanValue) {
                jVar = jVar7;
            } else {
                jVar = charSequence.length() == 0 ? jVar6 : jVar5;
            }
            if (z2) {
                j = zBooleanValue ? k3Var.x : k3Var.y;
            } else {
                j = k3Var.z;
            }
            t3 t3Var = (t3) rVar.j(u3.a);
            androidx.compose.ui.text.m0 m0Var3 = t3Var.j;
            androidx.compose.ui.text.m0 m0Var4 = t3Var.l;
            long jB = m0Var3.b();
            long j9 = androidx.compose.ui.graphics.t.i;
            boolean z5 = (androidx.compose.ui.graphics.t.c(jB, j9) && !androidx.compose.ui.graphics.t.c(m0Var4.b(), j9)) || (!androidx.compose.ui.graphics.t.c(m0Var3.b(), j9) && androidx.compose.ui.graphics.t.c(m0Var4.b(), j9));
            long jB2 = m0Var4.b();
            if (z5 && jB2 == 16) {
                jB2 = j;
            }
            long jB3 = m0Var3.b();
            long j10 = (z5 && jB3 == 16) ? j : jB3;
            boolean z6 = qVar != null;
            e2 e2VarE = i2.e(jVar, "TextFieldInputState", rVar, 48, 0);
            j2 j2Var = e2VarE.a;
            h1 h1Var2 = e2VarE.d;
            k1 k1VarO = t2.o(androidx.compose.material3.tokens.p.e, rVar);
            l2 l2Var = androidx.compose.animation.core.e.j;
            j jVar8 = (j) j2Var.n();
            rVar.b0(-1436405362);
            int iOrdinal4 = jVar8.ordinal();
            float f7 = 0.0f;
            if (iOrdinal4 == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        coil3.g.a();
                        return;
                    }
                } else if (z6) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            rVar.p(false);
            Float fValueOf = Float.valueOf(f2);
            j jVar9 = (j) h1Var2.getValue();
            rVar.b0(-1436405362);
            int iOrdinal5 = jVar9.ordinal();
            if (iOrdinal5 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        coil3.g.a();
                        return;
                    }
                } else if (z6) {
                    f3 = 0.0f;
                }
                f3 = 1.0f;
            }
            rVar.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            e2VarE.f();
            rVar.b0(-709912974);
            rVar.p(false);
            a2 a2VarC5 = i2.c(e2VarE, fValueOf, fValueOf2, k1VarO, l2Var, rVar, 196608);
            androidx.compose.material3.tokens.p pVar5 = androidx.compose.material3.tokens.p.z;
            k1 k1VarO2 = t2.o(pVar5, rVar);
            k1 k1VarO3 = t2.o(androidx.compose.material3.tokens.p.A, rVar);
            j jVar10 = (j) j2Var.n();
            rVar.b0(-1093194547);
            int iOrdinal6 = jVar10.ordinal();
            if (iOrdinal6 != 0) {
                h1Var = h1Var2;
                if (iOrdinal6 == 1) {
                    if (z6) {
                    }
                    rVar.p(false);
                    Float fValueOf3 = Float.valueOf(f4);
                    j jVar11 = (j) h1Var.getValue();
                    rVar.b0(-1093194547);
                    iOrdinal = jVar11.ordinal();
                    if (iOrdinal == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                coil3.g.a();
                                return;
                            }
                        } else if (!z6) {
                            f5 = 1.0f;
                        }
                        f5 = 0.0f;
                    }
                    rVar.p(false);
                    Float fValueOf4 = Float.valueOf(f5);
                    y1VarF = e2VarE.f();
                    rVar.b0(-984009111);
                    if (y1VarF.a(jVar7, jVar6) && (y1VarF.a(jVar6, jVar7) || y1VarF.a(jVar5, jVar6))) {
                        k1Var = k1VarO3;
                    } else {
                        k1Var = k1VarO2;
                    }
                    rVar.p(false);
                    a2VarC = i2.c(e2VarE, fValueOf3, fValueOf4, k1Var, l2Var, rVar, 196608);
                    j jVar12 = (j) j2Var.n();
                    rVar.b0(-1258455321);
                    iOrdinal2 = jVar12.ordinal();
                    if (iOrdinal2 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                coil3.g.a();
                                return;
                            }
                        } else if (z6) {
                            f6 = 0.0f;
                        }
                        f6 = 1.0f;
                    }
                    rVar.p(false);
                    Float fValueOf5 = Float.valueOf(f6);
                    j jVar13 = (j) h1Var.getValue();
                    rVar.b0(-1258455321);
                    iOrdinal3 = jVar13.ordinal();
                    if (iOrdinal3 == 0) {
                        f7 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                coil3.g.a();
                                return;
                            }
                        } else if (!z6) {
                        }
                        f7 = 1.0f;
                    }
                    rVar.p(false);
                    Float fValueOf6 = Float.valueOf(f7);
                    e2VarE.f();
                    rVar.b0(2126293195);
                    rVar.p(false);
                    a2VarC2 = i2.c(e2VarE, fValueOf5, fValueOf6, k1VarO2, l2Var, rVar, 196608);
                    k1 k1VarO4 = t2.o(pVar5, rVar);
                    jVar2 = (j) h1Var.getValue();
                    rVar.b0(-12973394);
                    iArr = x.a;
                    if (iArr[jVar2.ordinal()] == 1) {
                        j2 = jB2;
                    } else {
                        j2 = j10;
                    }
                    rVar.p(false);
                    cVarF = androidx.compose.ui.graphics.t.f(j2);
                    zF = rVar.f(cVarF);
                    objQ = rVar.Q();
                    j3 = jB2;
                    fVar2 = androidx.compose.runtime.m.a;
                    if (zF || objQ == fVar2) {
                        l2 l2Var2 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF, 1));
                        rVar.l0(l2Var2);
                        objQ = l2Var2;
                    }
                    l2 l2Var3 = (l2) objQ;
                    jVar3 = (j) j2Var.n();
                    rVar.b0(-12973394);
                    if (iArr[jVar3.ordinal()] == 1) {
                        j4 = j3;
                    } else {
                        j4 = j10;
                    }
                    rVar.p(false);
                    androidx.compose.ui.graphics.t tVar = new androidx.compose.ui.graphics.t(j4);
                    jVar4 = (j) h1Var.getValue();
                    rVar.b0(-12973394);
                    if (iArr[jVar4.ordinal()] == 1) {
                        j5 = j3;
                    } else {
                        j5 = j10;
                    }
                    rVar.p(false);
                    androidx.compose.ui.graphics.t tVar2 = new androidx.compose.ui.graphics.t(j5);
                    e2VarE.f();
                    rVar.b0(1954111929);
                    rVar.p(false);
                    a2VarC3 = i2.c(e2VarE, tVar, tVar2, k1VarO4, l2Var3, rVar, 196608);
                    rVar.b0(-464752477);
                    rVar.p(false);
                    cVarF2 = androidx.compose.ui.graphics.t.f(j);
                    zF2 = rVar.f(cVarF2);
                    objQ2 = rVar.Q();
                    if (zF2 || objQ2 == fVar2) {
                        l2 l2Var4 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF2, 1));
                        rVar.l0(l2Var4);
                        objQ2 = l2Var4;
                    }
                    l2 l2Var5 = (l2) objQ2;
                    rVar.b0(-464752477);
                    rVar.p(false);
                    androidx.compose.ui.graphics.t tVar3 = new androidx.compose.ui.graphics.t(j);
                    rVar.b0(-464752477);
                    rVar.p(false);
                    androidx.compose.ui.graphics.t tVar4 = new androidx.compose.ui.graphics.t(j);
                    e2VarE.f();
                    rVar.b0(1190923886);
                    rVar.p(false);
                    a2VarC4 = i2.c(e2VarE, tVar3, tVar4, k1VarO4, l2Var5, rVar, 196608);
                    objQ3 = rVar.Q();
                    if (objQ3 == fVar2) {
                        objQ3 = new w();
                        rVar.l0(objQ3);
                    }
                    wVar = (w) objQ3;
                    if (qVar == null) {
                        rVar.b0(-1891724857);
                        rVar.p(false);
                        m0Var2 = m0Var3;
                        fVar4 = null;
                        fVar3 = null;
                        z3 = true;
                    } else {
                        rVar.b0(-1891724856);
                        m0Var2 = m0Var3;
                        fVar3 = null;
                        z3 = true;
                        androidx.compose.runtime.internal.f fVarC4 = androidx.compose.runtime.internal.k.c(-1076580032, new s(m0Var2, m0Var4, a2VarC5, a2VarC4, z5, a2VarC3, qVar, wVar), rVar);
                        rVar.p(false);
                        fVar4 = fVarC4;
                    }
                    if (!z2) {
                        j6 = k3Var.D;
                    } else if (zBooleanValue) {
                        j6 = k3Var.B;
                    } else {
                        j6 = k3Var.C;
                    }
                    objQ4 = rVar.Q();
                    if (objQ4 == fVar2) {
                        objQ4 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC, 2));
                        rVar.l0(objQ4);
                    }
                    androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) objQ4;
                    if (pVar2 == null && charSequence.length() == 0 && ((Boolean) t2Var.getValue()).booleanValue()) {
                        rVar.b0(-1890614312);
                        fVarC = androidx.compose.runtime.internal.k.c(1405547205, new v(a2VarC, j6, m0Var2, pVar2), rVar);
                        rVar.p(false);
                    } else {
                        rVar.b0(-1890217110);
                        rVar.p(false);
                        fVarC = fVar3;
                    }
                    objQ5 = rVar.Q();
                    if (objQ5 == fVar2) {
                        objQ5 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC2, 3));
                        rVar.l0(objQ5);
                    }
                    rVar.b0(-1889500886);
                    rVar.p(false);
                    rVar.b0(-1888924534);
                    rVar.p(false);
                    if (!z2) {
                        j7 = k3Var.r;
                    } else if (zBooleanValue) {
                        j7 = k3Var.p;
                    } else {
                        j7 = k3Var.q;
                    }
                    if (pVar3 == null) {
                        rVar.b0(-1888749663);
                        rVar.p(false);
                        fVarC2 = fVar3;
                    } else {
                        rVar.b0(-1888749662);
                        fVarC2 = androidx.compose.runtime.internal.k.c(-1736293487, new t(j7, pVar3, 0), rVar);
                        rVar.p(false);
                    }
                    if (!z2) {
                        j8 = k3Var.v;
                    } else if (zBooleanValue) {
                        j8 = k3Var.t;
                    } else {
                        j8 = k3Var.u;
                    }
                    if (pVar4 == null) {
                        rVar.b0(-1888469888);
                        z4 = false;
                        rVar.p(false);
                        fVarC3 = fVar3;
                    } else {
                        z4 = false;
                        rVar.b0(-1888469887);
                        fVarC3 = androidx.compose.runtime.internal.k.c(1334518521, new t(j8, pVar4, 1), rVar);
                        rVar.p(false);
                    }
                    rVar.b0(-1888176380);
                    rVar.p(z4);
                    rVar.b0(-1886778186);
                    objQ6 = rVar.Q();
                    if (objQ6 == fVar2) {
                        objQ6 = androidx.compose.runtime.s.r(new androidx.compose.ui.geometry.e(0L));
                        rVar.l0(objQ6);
                    }
                    y0Var = (y0) objQ6;
                    androidx.compose.runtime.internal.f fVarC5 = androidx.compose.runtime.internal.k.c(528115858, new r(y0Var, n3Var, m0Var, fVar), rVar);
                    y yVar = new y(new androidx.compose.foundation.lazy.o(0, 3, androidx.compose.runtime.t2.class, a2VarC5, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;"));
                    androidx.compose.runtime.internal.f fVar5 = fVar4;
                    if ((i10 & 7168) != 2048) {
                        z3 = false;
                    }
                    zF3 = z3 | rVar.f(a2VarC5);
                    objQ7 = rVar.Q();
                    if (zF3 || objQ7 == fVar2) {
                        objQ7 = new androidx.activity.compose.h(n3Var, a2VarC5, y0Var);
                        rVar.l0(objQ7);
                    }
                    c2.b(pVar, fVarC, fVar5, fVarC2, fVarC3, fVar3, fVar3, z, n3Var, yVar, (kotlin.jvm.functions.l) objQ7, fVarC5, fVar3, m0Var, rVar, ((i10 >> 3) & Token.ASSIGN_MOD) | 6 | ((i11 << 21) & 234881024) | ((i10 << 18) & 1879048192), (57344 & (i11 >> 3)) | 384);
                    rVar2 = rVar;
                    rVar2.p(false);
                } else if (iOrdinal6 != 2) {
                    coil3.g.a();
                    return;
                }
                f4 = 0.0f;
                rVar.p(false);
                Float fValueOf7 = Float.valueOf(f4);
                j jVar14 = (j) h1Var.getValue();
                rVar.b0(-1093194547);
                iOrdinal = jVar14.ordinal();
                if (iOrdinal == 0) {
                    f5 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            coil3.g.a();
                            return;
                        }
                    } else if (!z6) {
                        f5 = 1.0f;
                    }
                    f5 = 0.0f;
                }
                rVar.p(false);
                Float fValueOf8 = Float.valueOf(f5);
                y1VarF = e2VarE.f();
                rVar.b0(-984009111);
                if (y1VarF.a(jVar7, jVar6)) {
                    k1Var = k1VarO2;
                } else {
                    k1Var = k1VarO3;
                }
                rVar.p(false);
                a2VarC = i2.c(e2VarE, fValueOf7, fValueOf8, k1Var, l2Var, rVar, 196608);
                j jVar15 = (j) j2Var.n();
                rVar.b0(-1258455321);
                iOrdinal2 = jVar15.ordinal();
                if (iOrdinal2 == 0) {
                    f6 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            coil3.g.a();
                            return;
                        }
                    } else if (z6) {
                        f6 = 0.0f;
                    }
                    f6 = 1.0f;
                }
                rVar.p(false);
                Float fValueOf9 = Float.valueOf(f6);
                j jVar16 = (j) h1Var.getValue();
                rVar.b0(-1258455321);
                iOrdinal3 = jVar16.ordinal();
                if (iOrdinal3 == 0) {
                    f7 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            coil3.g.a();
                            return;
                        }
                    } else if (!z6) {
                    }
                    f7 = 1.0f;
                }
                rVar.p(false);
                Float fValueOf10 = Float.valueOf(f7);
                e2VarE.f();
                rVar.b0(2126293195);
                rVar.p(false);
                a2VarC2 = i2.c(e2VarE, fValueOf9, fValueOf10, k1VarO2, l2Var, rVar, 196608);
                k1 k1VarO5 = t2.o(pVar5, rVar);
                jVar2 = (j) h1Var.getValue();
                rVar.b0(-12973394);
                iArr = x.a;
                if (iArr[jVar2.ordinal()] == 1) {
                    j2 = jB2;
                } else {
                    j2 = j10;
                }
                rVar.p(false);
                cVarF = androidx.compose.ui.graphics.t.f(j2);
                zF = rVar.f(cVarF);
                objQ = rVar.Q();
                j3 = jB2;
                fVar2 = androidx.compose.runtime.m.a;
                if (zF) {
                    l2 l2Var6 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF, 1));
                    rVar.l0(l2Var6);
                    objQ = l2Var6;
                } else {
                    l2 l2Var7 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF, 1));
                    rVar.l0(l2Var7);
                    objQ = l2Var7;
                }
                l2 l2Var8 = (l2) objQ;
                jVar3 = (j) j2Var.n();
                rVar.b0(-12973394);
                if (iArr[jVar3.ordinal()] == 1) {
                    j4 = j3;
                } else {
                    j4 = j10;
                }
                rVar.p(false);
                androidx.compose.ui.graphics.t tVar5 = new androidx.compose.ui.graphics.t(j4);
                jVar4 = (j) h1Var.getValue();
                rVar.b0(-12973394);
                if (iArr[jVar4.ordinal()] == 1) {
                    j5 = j3;
                } else {
                    j5 = j10;
                }
                rVar.p(false);
                androidx.compose.ui.graphics.t tVar6 = new androidx.compose.ui.graphics.t(j5);
                e2VarE.f();
                rVar.b0(1954111929);
                rVar.p(false);
                a2VarC3 = i2.c(e2VarE, tVar5, tVar6, k1VarO5, l2Var8, rVar, 196608);
                rVar.b0(-464752477);
                rVar.p(false);
                cVarF2 = androidx.compose.ui.graphics.t.f(j);
                zF2 = rVar.f(cVarF2);
                objQ2 = rVar.Q();
                if (zF2) {
                    l2 l2Var9 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF2, 1));
                    rVar.l0(l2Var9);
                    objQ2 = l2Var9;
                } else {
                    l2 l2Var10 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF2, 1));
                    rVar.l0(l2Var10);
                    objQ2 = l2Var10;
                }
                l2 l2Var11 = (l2) objQ2;
                rVar.b0(-464752477);
                rVar.p(false);
                androidx.compose.ui.graphics.t tVar7 = new androidx.compose.ui.graphics.t(j);
                rVar.b0(-464752477);
                rVar.p(false);
                androidx.compose.ui.graphics.t tVar8 = new androidx.compose.ui.graphics.t(j);
                e2VarE.f();
                rVar.b0(1190923886);
                rVar.p(false);
                a2VarC4 = i2.c(e2VarE, tVar7, tVar8, k1VarO5, l2Var11, rVar, 196608);
                objQ3 = rVar.Q();
                if (objQ3 == fVar2) {
                    objQ3 = new w();
                    rVar.l0(objQ3);
                }
                wVar = (w) objQ3;
                if (qVar == null) {
                    rVar.b0(-1891724857);
                    rVar.p(false);
                    m0Var2 = m0Var3;
                    fVar4 = null;
                    fVar3 = null;
                    z3 = true;
                } else {
                    rVar.b0(-1891724856);
                    m0Var2 = m0Var3;
                    fVar3 = null;
                    z3 = true;
                    androidx.compose.runtime.internal.f fVarC6 = androidx.compose.runtime.internal.k.c(-1076580032, new s(m0Var2, m0Var4, a2VarC5, a2VarC4, z5, a2VarC3, qVar, wVar), rVar);
                    rVar.p(false);
                    fVar4 = fVarC6;
                }
                if (!z2) {
                    j6 = k3Var.D;
                } else if (zBooleanValue) {
                    j6 = k3Var.B;
                } else {
                    j6 = k3Var.C;
                }
                objQ4 = rVar.Q();
                if (objQ4 == fVar2) {
                    objQ4 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC, 2));
                    rVar.l0(objQ4);
                }
                androidx.compose.runtime.t2 t2Var2 = (androidx.compose.runtime.t2) objQ4;
                if (pVar2 == null) {
                    rVar.b0(-1890217110);
                    rVar.p(false);
                    fVarC = fVar3;
                } else {
                    rVar.b0(-1890217110);
                    rVar.p(false);
                    fVarC = fVar3;
                }
                objQ5 = rVar.Q();
                if (objQ5 == fVar2) {
                    objQ5 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC2, 3));
                    rVar.l0(objQ5);
                }
                rVar.b0(-1889500886);
                rVar.p(false);
                rVar.b0(-1888924534);
                rVar.p(false);
                if (!z2) {
                    j7 = k3Var.r;
                } else if (zBooleanValue) {
                    j7 = k3Var.p;
                } else {
                    j7 = k3Var.q;
                }
                if (pVar3 == null) {
                    rVar.b0(-1888749663);
                    rVar.p(false);
                    fVarC2 = fVar3;
                } else {
                    rVar.b0(-1888749662);
                    fVarC2 = androidx.compose.runtime.internal.k.c(-1736293487, new t(j7, pVar3, 0), rVar);
                    rVar.p(false);
                }
                if (!z2) {
                    j8 = k3Var.v;
                } else if (zBooleanValue) {
                    j8 = k3Var.t;
                } else {
                    j8 = k3Var.u;
                }
                if (pVar4 == null) {
                    rVar.b0(-1888469888);
                    z4 = false;
                    rVar.p(false);
                    fVarC3 = fVar3;
                } else {
                    z4 = false;
                    rVar.b0(-1888469887);
                    fVarC3 = androidx.compose.runtime.internal.k.c(1334518521, new t(j8, pVar4, 1), rVar);
                    rVar.p(false);
                }
                rVar.b0(-1888176380);
                rVar.p(z4);
                rVar.b0(-1886778186);
                objQ6 = rVar.Q();
                if (objQ6 == fVar2) {
                    objQ6 = androidx.compose.runtime.s.r(new androidx.compose.ui.geometry.e(0L));
                    rVar.l0(objQ6);
                }
                y0Var = (y0) objQ6;
                androidx.compose.runtime.internal.f fVarC7 = androidx.compose.runtime.internal.k.c(528115858, new r(y0Var, n3Var, m0Var, fVar), rVar);
                y yVar2 = new y(new androidx.compose.foundation.lazy.o(0, 3, androidx.compose.runtime.t2.class, a2VarC5, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;"));
                androidx.compose.runtime.internal.f fVar6 = fVar4;
                if ((i10 & 7168) != 2048) {
                    z3 = false;
                }
                zF3 = z3 | rVar.f(a2VarC5);
                objQ7 = rVar.Q();
                if (zF3) {
                    objQ7 = new androidx.activity.compose.h(n3Var, a2VarC5, y0Var);
                    rVar.l0(objQ7);
                } else {
                    objQ7 = new androidx.activity.compose.h(n3Var, a2VarC5, y0Var);
                    rVar.l0(objQ7);
                }
                c2.b(pVar, fVarC, fVar6, fVarC2, fVarC3, fVar3, fVar3, z, n3Var, yVar2, (kotlin.jvm.functions.l) objQ7, fVarC7, fVar3, m0Var, rVar, ((i10 >> 3) & Token.ASSIGN_MOD) | 6 | ((i11 << 21) & 234881024) | ((i10 << 18) & 1879048192), (57344 & (i11 >> 3)) | 384);
                rVar2 = rVar;
                rVar2.p(false);
            } else {
                h1Var = h1Var2;
            }
            f4 = 1.0f;
            rVar.p(false);
            Float fValueOf11 = Float.valueOf(f4);
            j jVar17 = (j) h1Var.getValue();
            rVar.b0(-1093194547);
            iOrdinal = jVar17.ordinal();
            if (iOrdinal == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return;
                    }
                } else if (!z6) {
                    f5 = 1.0f;
                }
                f5 = 0.0f;
            }
            rVar.p(false);
            Float fValueOf12 = Float.valueOf(f5);
            y1VarF = e2VarE.f();
            rVar.b0(-984009111);
            if (y1VarF.a(jVar7, jVar6)) {
                k1Var = k1VarO2;
            } else {
                k1Var = k1VarO3;
            }
            rVar.p(false);
            a2VarC = i2.c(e2VarE, fValueOf11, fValueOf12, k1Var, l2Var, rVar, 196608);
            j jVar18 = (j) j2Var.n();
            rVar.b0(-1258455321);
            iOrdinal2 = jVar18.ordinal();
            if (iOrdinal2 == 0) {
                f6 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        coil3.g.a();
                        return;
                    }
                } else if (z6) {
                    f6 = 0.0f;
                }
                f6 = 1.0f;
            }
            rVar.p(false);
            Float fValueOf13 = Float.valueOf(f6);
            j jVar19 = (j) h1Var.getValue();
            rVar.b0(-1258455321);
            iOrdinal3 = jVar19.ordinal();
            if (iOrdinal3 == 0) {
                f7 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        coil3.g.a();
                        return;
                    }
                } else if (!z6) {
                }
                f7 = 1.0f;
            }
            rVar.p(false);
            Float fValueOf14 = Float.valueOf(f7);
            e2VarE.f();
            rVar.b0(2126293195);
            rVar.p(false);
            a2VarC2 = i2.c(e2VarE, fValueOf13, fValueOf14, k1VarO2, l2Var, rVar, 196608);
            k1 k1VarO6 = t2.o(pVar5, rVar);
            jVar2 = (j) h1Var.getValue();
            rVar.b0(-12973394);
            iArr = x.a;
            if (iArr[jVar2.ordinal()] == 1) {
                j2 = jB2;
            } else {
                j2 = j10;
            }
            rVar.p(false);
            cVarF = androidx.compose.ui.graphics.t.f(j2);
            zF = rVar.f(cVarF);
            objQ = rVar.Q();
            j3 = jB2;
            fVar2 = androidx.compose.runtime.m.a;
            if (zF) {
                l2 l2Var12 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF, 1));
                rVar.l0(l2Var12);
                objQ = l2Var12;
            } else {
                l2 l2Var13 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF, 1));
                rVar.l0(l2Var13);
                objQ = l2Var13;
            }
            l2 l2Var14 = (l2) objQ;
            jVar3 = (j) j2Var.n();
            rVar.b0(-12973394);
            if (iArr[jVar3.ordinal()] == 1) {
                j4 = j3;
            } else {
                j4 = j10;
            }
            rVar.p(false);
            androidx.compose.ui.graphics.t tVar9 = new androidx.compose.ui.graphics.t(j4);
            jVar4 = (j) h1Var.getValue();
            rVar.b0(-12973394);
            if (iArr[jVar4.ordinal()] == 1) {
                j5 = j3;
            } else {
                j5 = j10;
            }
            rVar.p(false);
            androidx.compose.ui.graphics.t tVar10 = new androidx.compose.ui.graphics.t(j5);
            e2VarE.f();
            rVar.b0(1954111929);
            rVar.p(false);
            a2VarC3 = i2.c(e2VarE, tVar9, tVar10, k1VarO6, l2Var14, rVar, 196608);
            rVar.b0(-464752477);
            rVar.p(false);
            cVarF2 = androidx.compose.ui.graphics.t.f(j);
            zF2 = rVar.f(cVarF2);
            objQ2 = rVar.Q();
            if (zF2) {
                l2 l2Var15 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF2, 1));
                rVar.l0(l2Var15);
                objQ2 = l2Var15;
            } else {
                l2 l2Var16 = new l2(androidx.compose.animation.c0.A, new androidx.compose.animation.e(cVarF2, 1));
                rVar.l0(l2Var16);
                objQ2 = l2Var16;
            }
            l2 l2Var17 = (l2) objQ2;
            rVar.b0(-464752477);
            rVar.p(false);
            androidx.compose.ui.graphics.t tVar11 = new androidx.compose.ui.graphics.t(j);
            rVar.b0(-464752477);
            rVar.p(false);
            androidx.compose.ui.graphics.t tVar12 = new androidx.compose.ui.graphics.t(j);
            e2VarE.f();
            rVar.b0(1190923886);
            rVar.p(false);
            a2VarC4 = i2.c(e2VarE, tVar11, tVar12, k1VarO6, l2Var17, rVar, 196608);
            objQ3 = rVar.Q();
            if (objQ3 == fVar2) {
                objQ3 = new w();
                rVar.l0(objQ3);
            }
            wVar = (w) objQ3;
            if (qVar == null) {
                rVar.b0(-1891724857);
                rVar.p(false);
                m0Var2 = m0Var3;
                fVar4 = null;
                fVar3 = null;
                z3 = true;
            } else {
                rVar.b0(-1891724856);
                m0Var2 = m0Var3;
                fVar3 = null;
                z3 = true;
                androidx.compose.runtime.internal.f fVarC8 = androidx.compose.runtime.internal.k.c(-1076580032, new s(m0Var2, m0Var4, a2VarC5, a2VarC4, z5, a2VarC3, qVar, wVar), rVar);
                rVar.p(false);
                fVar4 = fVarC8;
            }
            if (!z2) {
                j6 = k3Var.D;
            } else if (zBooleanValue) {
                j6 = k3Var.B;
            } else {
                j6 = k3Var.C;
            }
            objQ4 = rVar.Q();
            if (objQ4 == fVar2) {
                objQ4 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC, 2));
                rVar.l0(objQ4);
            }
            androidx.compose.runtime.t2 t2Var3 = (androidx.compose.runtime.t2) objQ4;
            if (pVar2 == null) {
                rVar.b0(-1890217110);
                rVar.p(false);
                fVarC = fVar3;
            } else {
                rVar.b0(-1890217110);
                rVar.p(false);
                fVarC = fVar3;
            }
            objQ5 = rVar.Q();
            if (objQ5 == fVar2) {
                objQ5 = androidx.compose.runtime.s.j(androidx.compose.runtime.f.D, new k0(a2VarC2, 3));
                rVar.l0(objQ5);
            }
            rVar.b0(-1889500886);
            rVar.p(false);
            rVar.b0(-1888924534);
            rVar.p(false);
            if (!z2) {
                j7 = k3Var.r;
            } else if (zBooleanValue) {
                j7 = k3Var.p;
            } else {
                j7 = k3Var.q;
            }
            if (pVar3 == null) {
                rVar.b0(-1888749663);
                rVar.p(false);
                fVarC2 = fVar3;
            } else {
                rVar.b0(-1888749662);
                fVarC2 = androidx.compose.runtime.internal.k.c(-1736293487, new t(j7, pVar3, 0), rVar);
                rVar.p(false);
            }
            if (!z2) {
                j8 = k3Var.v;
            } else if (zBooleanValue) {
                j8 = k3Var.t;
            } else {
                j8 = k3Var.u;
            }
            if (pVar4 == null) {
                rVar.b0(-1888469888);
                z4 = false;
                rVar.p(false);
                fVarC3 = fVar3;
            } else {
                z4 = false;
                rVar.b0(-1888469887);
                fVarC3 = androidx.compose.runtime.internal.k.c(1334518521, new t(j8, pVar4, 1), rVar);
                rVar.p(false);
            }
            rVar.b0(-1888176380);
            rVar.p(z4);
            rVar.b0(-1886778186);
            objQ6 = rVar.Q();
            if (objQ6 == fVar2) {
                objQ6 = androidx.compose.runtime.s.r(new androidx.compose.ui.geometry.e(0L));
                rVar.l0(objQ6);
            }
            y0Var = (y0) objQ6;
            androidx.compose.runtime.internal.f fVarC9 = androidx.compose.runtime.internal.k.c(528115858, new r(y0Var, n3Var, m0Var, fVar), rVar);
            y yVar3 = new y(new androidx.compose.foundation.lazy.o(0, 3, androidx.compose.runtime.t2.class, a2VarC5, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;"));
            androidx.compose.runtime.internal.f fVar7 = fVar4;
            if ((i10 & 7168) != 2048) {
                z3 = false;
            }
            zF3 = z3 | rVar.f(a2VarC5);
            objQ7 = rVar.Q();
            if (zF3) {
                objQ7 = new androidx.activity.compose.h(n3Var, a2VarC5, y0Var);
                rVar.l0(objQ7);
            } else {
                objQ7 = new androidx.activity.compose.h(n3Var, a2VarC5, y0Var);
                rVar.l0(objQ7);
            }
            c2.b(pVar, fVarC, fVar7, fVarC2, fVarC3, fVar3, fVar3, z, n3Var, yVar3, (kotlin.jvm.functions.l) objQ7, fVarC9, fVar3, m0Var, rVar, ((i10 >> 3) & Token.ASSIGN_MOD) | 6 | ((i11 << 21) & 234881024) | ((i10 << 18) & 1879048192), (57344 & (i11 >> 3)) | 384);
            rVar2 = rVar;
            rVar2.p(false);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.internal.o
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    int iA2 = androidx.compose.runtime.s.A(i2);
                    z.a(charSequence, pVar, n3Var, qVar, pVar2, pVar3, pVar4, z, z2, kVar, m0Var, k3Var, fVar, (androidx.compose.runtime.r) obj, iA, iA2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(long j, androidx.compose.ui.text.m0 m0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar, int i) {
        long j2;
        androidx.compose.ui.text.m0 m0Var2;
        kotlin.jvm.functions.p pVar2;
        androidx.compose.runtime.r rVar2;
        rVar.c0(396611577);
        int i2 = (rVar.e(j) ? 4 : 2) | i | (rVar.f(m0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= rVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            rVar2 = rVar;
            g.a(j, m0Var, pVar, rVar2, i2 & 1022);
            j2 = j;
            m0Var2 = m0Var;
            pVar2 = pVar;
        } else {
            j2 = j;
            m0Var2 = m0Var;
            pVar2 = pVar;
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new n(j2, m0Var2, pVar2, i, 1);
        }
    }

    public static final void c(long j, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(590397809);
        int i2 = (rVar.e(j) ? 4 : 2) | i | (rVar.h(pVar) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.runtime.s.a(q0.a.a(new androidx.compose.ui.graphics.t(j)), pVar, rVar, (i2 & Token.ASSIGN_MOD) | 8);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.a(j, pVar, i);
        }
    }

    public static final androidx.compose.ui.d d(n3 n3Var) {
        if (n3Var instanceof n3) {
            return n3Var.a;
        }
        com.google.gson.b.g(n3Var, "Unknown position: ");
        return null;
    }

    public static final float e(androidx.compose.runtime.r rVar) {
        long j = ((t3) rVar.j(u3.a)).l.b.c;
        long j2 = androidx.compose.material3.tokens.y.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((androidx.compose.ui.unit.c) rVar.j(l1.h)).t(j) / 2;
    }

    public static final float f(androidx.compose.runtime.r rVar) {
        float f2 = ((androidx.compose.ui.unit.f) rVar.j(i1.c)).e;
        if (Float.isNaN(f2)) {
            f2 = 0;
        }
        float f3 = (f2 - androidx.compose.material3.tokens.w.d) / 2;
        float f4 = 0;
        return f3 < f4 ? f4 : f3;
    }
}
