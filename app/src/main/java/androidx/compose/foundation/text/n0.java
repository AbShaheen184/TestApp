package androidx.compose.foundation.text;

import android.os.Build;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.runtime.q1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.app.mlounge.emulator.LibretroCore;
import java.text.BreakIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final k0 a = new k0(1);
    public static final androidx.compose.ui.input.pointer.a b = new androidx.compose.ui.input.pointer.a(1022);

    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0194  */
    /* JADX WARN: Code duplicated, block: B:124:0x0197 A[Catch: RejectedExecutionException -> 0x0195, TryCatch #2 {RejectedExecutionException -> 0x0195, blocks: (B:120:0x018e, B:128:0x019e, B:130:0x01b0, B:136:0x01bd, B:138:0x01cf, B:142:0x01d6, B:132:0x01b6, B:124:0x0197), top: B:171:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:126:0x019b  */
    /* JADX WARN: Code duplicated, block: B:127:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b0 A[Catch: RejectedExecutionException -> 0x0195, TryCatch #2 {RejectedExecutionException -> 0x0195, blocks: (B:120:0x018e, B:128:0x019e, B:130:0x01b0, B:136:0x01bd, B:138:0x01cf, B:142:0x01d6, B:132:0x01b6, B:124:0x0197), top: B:171:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b6 A[Catch: RejectedExecutionException -> 0x0195, TryCatch #2 {RejectedExecutionException -> 0x0195, blocks: (B:120:0x018e, B:128:0x019e, B:130:0x01b0, B:136:0x01bd, B:138:0x01cf, B:142:0x01d6, B:132:0x01b6, B:124:0x0197), top: B:171:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf A[Catch: RejectedExecutionException -> 0x0195, TryCatch #2 {RejectedExecutionException -> 0x0195, blocks: (B:120:0x018e, B:128:0x019e, B:130:0x01b0, B:136:0x01bd, B:138:0x01cf, B:142:0x01d6, B:132:0x01b6, B:124:0x0197), top: B:171:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01d6 A[Catch: RejectedExecutionException -> 0x0195, TRY_LEAVE, TryCatch #2 {RejectedExecutionException -> 0x0195, blocks: (B:120:0x018e, B:128:0x019e, B:130:0x01b0, B:136:0x01bd, B:138:0x01cf, B:142:0x01d6, B:132:0x01b6, B:124:0x0197), top: B:171:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0234  */
    /* JADX WARN: Code duplicated, block: B:157:0x0238  */
    /* JADX WARN: Code duplicated, block: B:159:0x025f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0263  */
    /* JADX WARN: Code duplicated, block: B:164:0x026f  */
    /* JADX WARN: Code duplicated, block: B:171:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void a(final String str, final androidx.compose.ui.r rVar, final androidx.compose.ui.text.m0 m0Var, int i, boolean z, final int i2, int i3, androidx.compose.runtime.r rVar2, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zH;
        int i14;
        boolean z3;
        final int i15;
        final int i16;
        final boolean z4;
        q1 q1VarT;
        int i17;
        androidx.compose.ui.text.font.d dVar;
        int i18;
        Executor executor;
        boolean z5;
        kotlin.jvm.functions.a aVar;
        Boolean bool;
        androidx.compose.ui.unit.m mVar;
        Object obj;
        boolean z6;
        boolean zD;
        Object objQ;
        boolean z7;
        int i19;
        rVar2.c0(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (rVar2.f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= rVar2.f(rVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= rVar2.f(m0Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= rVar2.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i20 = i5 & 16;
        if (i20 == 0) {
            if ((i4 & 24576) == 0) {
                i7 = i;
                i6 |= rVar2.d(i7) ? 16384 : 8192;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (rVar2.g(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = Parser.ARGC_LIMIT;
                    }
                    i6 |= i9;
                }
                if ((1572864 & i4) == 0) {
                    if (rVar2.d(i2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i6 |= i19;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                    i11 = i3;
                } else {
                    i11 = i3;
                    if ((i4 & 12582912) == 0) {
                        if (rVar2.d(i11)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i6 | 100663296;
                if ((i5 & 512) != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zH = rVar2.f(null);
                    } else {
                        zH = rVar2.h(null);
                    }
                    if (zH) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i13 |= i14;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i13 & 1, z3)) {
                    if (i20 != 0) {
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i11;
                    }
                    t(i17, i2);
                    if (rVar2.j(androidx.compose.foundation.text.selection.n0.a) == null) {
                        androidx.transition.k.i();
                        return;
                    }
                    rVar2.b0(356914239);
                    rVar2.p(false);
                    dVar = (androidx.compose.ui.text.font.d) rVar2.j(androidx.compose.ui.platform.l1.k);
                    i18 = (i13 & 14) | ((i13 >> 3) & Token.ASSIGN_MOD);
                    executor = (Executor) rVar2.j(k.a);
                    if (executor != null) {
                        int length = str.length();
                        if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                            if (k.b == null) {
                                if (Runtime.getRuntime().availableProcessors() >= 4) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                k.b = Boolean.valueOf(z7);
                            }
                            bool = k.b;
                            bool.getClass();
                            if (bool.booleanValue()) {
                                rVar2.b0(1254274527);
                                mVar = (androidx.compose.ui.unit.m) rVar2.j(androidx.compose.ui.platform.l1.n);
                                obj = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                                if (((i18 & Token.ASSIGN_MOD) ^ 48) > 32) {
                                    try {
                                        if (!rVar2.f(m0Var)) {
                                            z6 = true;
                                        } else if ((i18 & 48) == 32) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                        objQ = rVar2.Q();
                                        if (!zD || objQ == androidx.compose.runtime.m.a) {
                                            z5 = false;
                                            try {
                                                Object jVar = new j(m0Var, mVar, str, obj, dVar, 0);
                                                dVar = dVar;
                                                try {
                                                    rVar2.l0(jVar);
                                                    objQ = jVar;
                                                } catch (RejectedExecutionException unused) {
                                                }
                                            } catch (RejectedExecutionException unused2) {
                                                dVar = dVar;
                                            }
                                        } else {
                                            z5 = false;
                                        }
                                        executor.execute((Runnable) objQ);
                                    } catch (RejectedExecutionException unused3) {
                                        z5 = false;
                                    }
                                } else {
                                    if ((i18 & 48) == 32) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                    objQ = rVar2.Q();
                                    if (zD) {
                                        z5 = false;
                                        Object jVar2 = new j(m0Var, mVar, str, obj, dVar, 0);
                                        dVar = dVar;
                                        rVar2.l0(jVar2);
                                        objQ = jVar2;
                                        executor.execute((Runnable) objQ);
                                    } else {
                                        z5 = false;
                                        Object jVar3 = new j(m0Var, mVar, str, obj, dVar, 0);
                                        dVar = dVar;
                                        rVar2.l0(jVar3);
                                        objQ = jVar3;
                                        executor.execute((Runnable) objQ);
                                    }
                                }
                            }
                            rVar2.p(z5);
                            rVar2.b0(357875859);
                            rVar2.p(z5);
                            i16 = i7;
                            i15 = i17;
                            z4 = z2;
                            androidx.compose.ui.r rVarD = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                            int iHashCode = Long.hashCode(rVar2.T);
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarD);
                            androidx.compose.runtime.internal.j jVarL = rVar2.l();
                            androidx.compose.ui.node.g.b.getClass();
                            aVar = androidx.compose.ui.node.f.b;
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(aVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                            rVar2.p(true);
                        }
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    rVar2.b0(1250991751);
                    rVar2.p(z5);
                    rVar2.b0(357875859);
                    rVar2.p(z5);
                    i16 = i7;
                    i15 = i17;
                    z4 = z2;
                    androidx.compose.ui.r rVarD2 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD2);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.node.g.b.getClass();
                    aVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                    i15 = i11;
                    i16 = i7;
                    z4 = z2;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.i
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            n0.a(str, rVar, m0Var, i16, z4, i2, i15, (androidx.compose.runtime.r) obj2, androidx.compose.runtime.s.A(i4 | 1), i5);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (rVar2.d(i2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i6 |= i19;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                i6 |= 12582912;
                i11 = i3;
            } else {
                i11 = i3;
                if ((i4 & 12582912) == 0) {
                    if (rVar2.d(i11)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
            }
            i13 = i6 | 100663296;
            if ((i5 & 512) != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zH = rVar2.f(null);
                } else {
                    zH = rVar2.h(null);
                }
                if (zH) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i13 & 1, z3)) {
                if (i20 != 0) {
                    i7 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i11;
                }
                t(i17, i2);
                if (rVar2.j(androidx.compose.foundation.text.selection.n0.a) == null) {
                    androidx.transition.k.i();
                    return;
                }
                rVar2.b0(356914239);
                rVar2.p(false);
                dVar = (androidx.compose.ui.text.font.d) rVar2.j(androidx.compose.ui.platform.l1.k);
                i18 = (i13 & 14) | ((i13 >> 3) & Token.ASSIGN_MOD);
                executor = (Executor) rVar2.j(k.a);
                if (executor != null) {
                    int length2 = str.length();
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (k.b == null) {
                            if (Runtime.getRuntime().availableProcessors() >= 4) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            k.b = Boolean.valueOf(z7);
                        }
                        bool = k.b;
                        bool.getClass();
                        if (bool.booleanValue()) {
                            rVar2.b0(1254274527);
                            mVar = (androidx.compose.ui.unit.m) rVar2.j(androidx.compose.ui.platform.l1.n);
                            obj = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                            if (((i18 & Token.ASSIGN_MOD) ^ 48) > 32) {
                                if (!rVar2.f(m0Var)) {
                                    z6 = true;
                                } else if ((i18 & 48) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                objQ = rVar2.Q();
                                if (zD) {
                                    z5 = false;
                                    Object jVar4 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar4);
                                    objQ = jVar4;
                                    executor.execute((Runnable) objQ);
                                } else {
                                    z5 = false;
                                    Object jVar5 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar5);
                                    objQ = jVar5;
                                    executor.execute((Runnable) objQ);
                                }
                            } else {
                                if ((i18 & 48) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                objQ = rVar2.Q();
                                if (zD) {
                                    z5 = false;
                                    Object jVar6 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar6);
                                    objQ = jVar6;
                                    executor.execute((Runnable) objQ);
                                } else {
                                    z5 = false;
                                    Object jVar7 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar7);
                                    objQ = jVar7;
                                    executor.execute((Runnable) objQ);
                                }
                            }
                        }
                        rVar2.p(z5);
                        rVar2.b0(357875859);
                        rVar2.p(z5);
                        i16 = i7;
                        i15 = i17;
                        z4 = z2;
                        androidx.compose.ui.r rVarD3 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                        int iHashCode3 = Long.hashCode(rVar2.T);
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, rVarD3);
                        androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                        androidx.compose.ui.node.g.b.getClass();
                        aVar = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(aVar);
                        } else {
                            rVar2.o0();
                        }
                        androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar2, jVarL3, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar2, rVarC3, androidx.compose.ui.node.f.c);
                        androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                        rVar2.p(true);
                    }
                    z5 = false;
                } else {
                    z5 = false;
                }
                rVar2.b0(1250991751);
                rVar2.p(z5);
                rVar2.b0(357875859);
                rVar2.p(z5);
                i16 = i7;
                i15 = i17;
                z4 = z2;
                androidx.compose.ui.r rVarD4 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                int iHashCode4 = Long.hashCode(rVar2.T);
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar2, rVarD4);
                androidx.compose.runtime.internal.j jVarL4 = rVar2.l();
                androidx.compose.ui.node.g.b.getClass();
                aVar = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.o0();
                }
                androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar2, jVarL4, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar2, rVarC4, androidx.compose.ui.node.f.c);
                androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                rVar2.p(true);
            } else {
                rVar2.W();
                i15 = i11;
                i16 = i7;
                z4 = z2;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.i
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        n0.a(str, rVar, m0Var, i16, z4, i2, i15, (androidx.compose.runtime.r) obj2, androidx.compose.runtime.s.A(i4 | 1), i5);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 24576;
        i7 = i;
        i8 = i5 & 32;
        if (i8 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (rVar2.g(z2)) {
                    i9 = 131072;
                } else {
                    i9 = Parser.ARGC_LIMIT;
                }
                i6 |= i9;
            }
            if ((1572864 & i4) == 0) {
                if (rVar2.d(i2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i6 |= i19;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                i6 |= 12582912;
                i11 = i3;
            } else {
                i11 = i3;
                if ((i4 & 12582912) == 0) {
                    if (rVar2.d(i11)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
            }
            i13 = i6 | 100663296;
            if ((i5 & 512) != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zH = rVar2.f(null);
                } else {
                    zH = rVar2.h(null);
                }
                if (zH) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i13 & 1, z3)) {
                if (i20 != 0) {
                    i7 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i11;
                }
                t(i17, i2);
                if (rVar2.j(androidx.compose.foundation.text.selection.n0.a) == null) {
                    androidx.transition.k.i();
                    return;
                }
                rVar2.b0(356914239);
                rVar2.p(false);
                dVar = (androidx.compose.ui.text.font.d) rVar2.j(androidx.compose.ui.platform.l1.k);
                i18 = (i13 & 14) | ((i13 >> 3) & Token.ASSIGN_MOD);
                executor = (Executor) rVar2.j(k.a);
                if (executor != null) {
                    int length3 = str.length();
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (k.b == null) {
                            if (Runtime.getRuntime().availableProcessors() >= 4) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            k.b = Boolean.valueOf(z7);
                        }
                        bool = k.b;
                        bool.getClass();
                        if (bool.booleanValue()) {
                            rVar2.b0(1254274527);
                            mVar = (androidx.compose.ui.unit.m) rVar2.j(androidx.compose.ui.platform.l1.n);
                            obj = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                            if (((i18 & Token.ASSIGN_MOD) ^ 48) > 32) {
                                if (!rVar2.f(m0Var)) {
                                    z6 = true;
                                } else if ((i18 & 48) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                objQ = rVar2.Q();
                                if (zD) {
                                    z5 = false;
                                    Object jVar8 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar8);
                                    objQ = jVar8;
                                    executor.execute((Runnable) objQ);
                                } else {
                                    z5 = false;
                                    Object jVar9 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar9);
                                    objQ = jVar9;
                                    executor.execute((Runnable) objQ);
                                }
                            } else {
                                if ((i18 & 48) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                                objQ = rVar2.Q();
                                if (zD) {
                                    z5 = false;
                                    Object jVar10 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar10);
                                    objQ = jVar10;
                                    executor.execute((Runnable) objQ);
                                } else {
                                    z5 = false;
                                    Object jVar11 = new j(m0Var, mVar, str, obj, dVar, 0);
                                    dVar = dVar;
                                    rVar2.l0(jVar11);
                                    objQ = jVar11;
                                    executor.execute((Runnable) objQ);
                                }
                            }
                        }
                        rVar2.p(z5);
                        rVar2.b0(357875859);
                        rVar2.p(z5);
                        i16 = i7;
                        i15 = i17;
                        z4 = z2;
                        androidx.compose.ui.r rVarD5 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                        int iHashCode5 = Long.hashCode(rVar2.T);
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar2, rVarD5);
                        androidx.compose.runtime.internal.j jVarL5 = rVar2.l();
                        androidx.compose.ui.node.g.b.getClass();
                        aVar = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(aVar);
                        } else {
                            rVar2.o0();
                        }
                        androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar2, jVarL5, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar2, rVarC5, androidx.compose.ui.node.f.c);
                        androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode5), androidx.compose.ui.node.f.f);
                        rVar2.p(true);
                    }
                    z5 = false;
                } else {
                    z5 = false;
                }
                rVar2.b0(1250991751);
                rVar2.p(z5);
                rVar2.b0(357875859);
                rVar2.p(z5);
                i16 = i7;
                i15 = i17;
                z4 = z2;
                androidx.compose.ui.r rVarD6 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                int iHashCode6 = Long.hashCode(rVar2.T);
                androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar2, rVarD6);
                androidx.compose.runtime.internal.j jVarL6 = rVar2.l();
                androidx.compose.ui.node.g.b.getClass();
                aVar = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.o0();
                }
                androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar2, jVarL6, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar2, rVarC6, androidx.compose.ui.node.f.c);
                androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode6), androidx.compose.ui.node.f.f);
                rVar2.p(true);
            } else {
                rVar2.W();
                i15 = i11;
                i16 = i7;
                z4 = z2;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.i
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        n0.a(str, rVar, m0Var, i16, z4, i2, i15, (androidx.compose.runtime.r) obj2, androidx.compose.runtime.s.A(i4 | 1), i5);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (rVar2.d(i2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i6 |= i19;
        }
        i10 = i5 & 128;
        if (i10 != 0) {
            i6 |= 12582912;
            i11 = i3;
        } else {
            i11 = i3;
            if ((i4 & 12582912) == 0) {
                if (rVar2.d(i11)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
        }
        i13 = i6 | 100663296;
        if ((i5 & 512) != 0) {
            i13 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zH = rVar2.f(null);
            } else {
                zH = rVar2.h(null);
            }
            if (zH) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i13 |= i14;
        }
        if ((i13 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.T(i13 & 1, z3)) {
            if (i20 != 0) {
                i7 = 1;
            }
            if (i8 != 0) {
                z2 = true;
            }
            if (i10 != 0) {
                i17 = 1;
            } else {
                i17 = i11;
            }
            t(i17, i2);
            if (rVar2.j(androidx.compose.foundation.text.selection.n0.a) == null) {
                androidx.transition.k.i();
                return;
            }
            rVar2.b0(356914239);
            rVar2.p(false);
            dVar = (androidx.compose.ui.text.font.d) rVar2.j(androidx.compose.ui.platform.l1.k);
            i18 = (i13 & 14) | ((i13 >> 3) & Token.ASSIGN_MOD);
            executor = (Executor) rVar2.j(k.a);
            if (executor != null) {
                int length4 = str.length();
                if (Build.VERSION.SDK_INT >= 28) {
                    if (k.b == null) {
                        if (Runtime.getRuntime().availableProcessors() >= 4) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        k.b = Boolean.valueOf(z7);
                    }
                    bool = k.b;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        rVar2.b0(1254274527);
                        mVar = (androidx.compose.ui.unit.m) rVar2.j(androidx.compose.ui.platform.l1.n);
                        obj = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                        if (((i18 & Token.ASSIGN_MOD) ^ 48) > 32) {
                            if (!rVar2.f(m0Var)) {
                                z6 = true;
                            } else if ((i18 & 48) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                            objQ = rVar2.Q();
                            if (zD) {
                                z5 = false;
                                Object jVar12 = new j(m0Var, mVar, str, obj, dVar, 0);
                                dVar = dVar;
                                rVar2.l0(jVar12);
                                objQ = jVar12;
                                executor.execute((Runnable) objQ);
                            } else {
                                z5 = false;
                                Object jVar13 = new j(m0Var, mVar, str, obj, dVar, 0);
                                dVar = dVar;
                                rVar2.l0(jVar13);
                                objQ = jVar13;
                                executor.execute((Runnable) objQ);
                            }
                        } else {
                            if ((i18 & 48) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zD = z6 | rVar2.d(mVar.ordinal()) | ((((i18 & 14) ^ 6) <= 4 && rVar2.f(str)) || (i18 & 6) == 4) | rVar2.f(obj) | rVar2.h(dVar);
                            objQ = rVar2.Q();
                            if (zD) {
                                z5 = false;
                                Object jVar14 = new j(m0Var, mVar, str, obj, dVar, 0);
                                dVar = dVar;
                                rVar2.l0(jVar14);
                                objQ = jVar14;
                                executor.execute((Runnable) objQ);
                            } else {
                                z5 = false;
                                Object jVar15 = new j(m0Var, mVar, str, obj, dVar, 0);
                                dVar = dVar;
                                rVar2.l0(jVar15);
                                objQ = jVar15;
                                executor.execute((Runnable) objQ);
                            }
                        }
                    }
                    rVar2.p(z5);
                    rVar2.b0(357875859);
                    rVar2.p(z5);
                    i16 = i7;
                    i15 = i17;
                    z4 = z2;
                    androidx.compose.ui.r rVarD7 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
                    int iHashCode7 = Long.hashCode(rVar2.T);
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(rVar2, rVarD7);
                    androidx.compose.runtime.internal.j jVarL7 = rVar2.l();
                    androidx.compose.ui.node.g.b.getClass();
                    aVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL7, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC7, androidx.compose.ui.node.f.c);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode7), androidx.compose.ui.node.f.f);
                    rVar2.p(true);
                }
                z5 = false;
            } else {
                z5 = false;
            }
            rVar2.b0(1250991751);
            rVar2.p(z5);
            rVar2.b0(357875859);
            rVar2.p(z5);
            i16 = i7;
            i15 = i17;
            z4 = z2;
            androidx.compose.ui.r rVarD8 = rVar.d(new androidx.compose.foundation.text.modifiers.e(str, m0Var, dVar, i16, z4, i2, i15));
            int iHashCode8 = Long.hashCode(rVar2.T);
            androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(rVar2, rVarD8);
            androidx.compose.runtime.internal.j jVarL8 = rVar2.l();
            androidx.compose.ui.node.g.b.getClass();
            aVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, e0.a, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL8, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC8, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode8), androidx.compose.ui.node.f.f);
            rVar2.p(true);
        } else {
            rVar2.W();
            i15 = i11;
            i16 = i7;
            z4 = z2;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.i
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    n0.a(str, rVar, m0Var, i16, z4, i2, i15, (androidx.compose.runtime.r) obj2, androidx.compose.runtime.s.A(i4 | 1), i5);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        androidx.compose.ui.r rVarD;
        rVar.c0(1533506138);
        if ((i & 6) == 0) {
            i2 = (rVar.h(c1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(fVar) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            rVar.b0(-885604480);
            if (c1Var.k()) {
                kotlin.coroutines.d dVar = null;
                rVarD = androidx.compose.foundation.text.contextmenu.modifier.h.d(androidx.compose.foundation.text.contextmenu.modifier.h.c(new androidx.compose.foundation.text.selection.u0(c1Var, dVar, 0)), c1Var.y, new androidx.compose.foundation.text.selection.v0(c1Var, dVar, 0), new androidx.compose.foundation.text.selection.w0(c1Var, dVar, 0), new m(c1Var, 2));
            } else {
                rVarD = androidx.compose.ui.o.b;
            }
            androidx.compose.foundation.text.contextmenu.internal.k.b(rVarD, fVar, rVar, i2 & Token.ASSIGN_MOD);
            rVar.p(false);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new l(c1Var, fVar, i, 0);
        }
    }

    public static final void c(androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(2080741862);
        if ((i & 6) == 0) {
            i2 = (rVar.h(c1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(fVar) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            b(c1Var, fVar, rVar, i2 & Token.ELSE);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new l(c1Var, fVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v30 androidx.compose.ui.focus.y
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void d(final androidx.compose.ui.text.input.x r70, final kotlin.jvm.functions.l r71, final androidx.compose.ui.r r72, final androidx.compose.ui.text.m0 r73, final androidx.compose.ui.text.input.g0 r74, final kotlin.jvm.functions.l r75, final androidx.compose.foundation.interaction.k r76, final androidx.compose.ui.graphics.p0 r77, final boolean r78, final int r79, final int r80, final androidx.compose.ui.text.input.k r81, final androidx.compose.foundation.text.p0 r82, final boolean r83, final boolean r84, final androidx.compose.runtime.internal.f r85, androidx.compose.runtime.r r86, final int r87, final int r88) {
        /*
            Method dump skipped, instruction units count: 2732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.n0.d(androidx.compose.ui.text.input.x, kotlin.jvm.functions.l, androidx.compose.ui.r, androidx.compose.ui.text.m0, androidx.compose.ui.text.input.g0, kotlin.jvm.functions.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.p0, boolean, int, int, androidx.compose.ui.text.input.k, androidx.compose.foundation.text.p0, boolean, boolean, androidx.compose.runtime.internal.f, androidx.compose.runtime.r, int, int):void");
    }

    public static final void e(androidx.compose.ui.r rVar, androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        rVar2.c0(2036174316);
        int i2 = (rVar2.f(rVar) ? 4 : 2) | i | (rVar2.h(c1Var) ? 32 : 16);
        if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            c(c1Var, fVar, rVar2, (i2 >> 3) & Token.ELSE);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(rVar, c1Var, fVar, i, 1);
        }
    }

    public static final void f(androidx.compose.foundation.text.selection.c1 c1Var, boolean z, androidx.compose.runtime.r rVar, int i) {
        k1 k1VarD;
        rVar.c0(626339208);
        int i2 = (rVar.h(c1Var) ? 4 : 2) | i | (rVar.g(z) ? 32 : 16);
        if (!rVar.T(i2 & 1, (i2 & 19) != 18)) {
            rVar.W();
        } else if (z) {
            rVar.b0(1530097388);
            r0 r0Var = c1Var.d;
            androidx.compose.ui.text.j0 j0Var = null;
            if (r0Var != null && (k1VarD = r0Var.d()) != null) {
                androidx.compose.ui.text.j0 j0Var2 = k1VarD.a;
                r0 r0Var2 = c1Var.d;
                if (!(r0Var2 != null ? r0Var2.p : true)) {
                    j0Var = j0Var2;
                }
            }
            if (j0Var == null) {
                rVar.b0(1530097387);
            } else {
                rVar.b0(1530097388);
                if (androidx.compose.ui.text.l0.c(c1Var.n().b)) {
                    rVar.b0(2062097806);
                } else {
                    rVar.b0(2109807302);
                    int iV = c1Var.b.v((int) (c1Var.n().b >> 32));
                    int iV2 = c1Var.b.v((int) (c1Var.n().b & 4294967295L));
                    androidx.compose.ui.text.style.j jVarA = j0Var.a(iV);
                    androidx.compose.ui.text.style.j jVarA2 = j0Var.a(Math.max(iV2 - 1, 0));
                    r0 r0Var3 = c1Var.d;
                    if (r0Var3 == null || !((Boolean) r0Var3.m.getValue()).booleanValue()) {
                        rVar.b0(2062097806);
                    } else {
                        rVar.b0(2110225306);
                        kotlin.math.a.a(true, jVarA, c1Var, rVar, ((i2 << 6) & 896) | 6);
                    }
                    rVar.p(false);
                    r0 r0Var4 = c1Var.d;
                    if (r0Var4 == null || !((Boolean) r0Var4.n.getValue()).booleanValue()) {
                        rVar.b0(2062097806);
                    } else {
                        rVar.b0(2110574459);
                        kotlin.math.a.a(false, jVarA2, c1Var, rVar, ((i2 << 6) & 896) | 6);
                    }
                    rVar.p(false);
                }
                rVar.p(false);
                r0 r0Var5 = c1Var.d;
                if (r0Var5 != null) {
                    androidx.compose.runtime.h1 h1Var = r0Var5.l;
                    if (!kotlin.jvm.internal.l.a(c1Var.u.a.y, c1Var.n().a.y)) {
                        h1Var.setValue(Boolean.FALSE);
                    }
                    if (r0Var5.b()) {
                        if (((Boolean) h1Var.getValue()).booleanValue()) {
                            c1Var.r();
                        } else {
                            c1Var.o();
                        }
                    }
                }
            }
            rVar.p(false);
            rVar.p(false);
        } else {
            rVar.b0(1989076778);
            rVar.p(false);
            c1Var.o();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.activity.compose.i(c1Var, z, i);
        }
    }

    public static final void g(androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.ui.text.g gVarM;
        rVar.c0(-1436003720);
        int i2 = 4;
        int i3 = (rVar.h(c1Var) ? 4 : 2) | i;
        int i4 = 1;
        if (rVar.T(i3 & 1, (i3 & 3) != 2)) {
            r0 r0Var = c1Var.d;
            if (r0Var == null || !((Boolean) r0Var.o.getValue()).booleanValue() || (gVarM = c1Var.m()) == null || gVarM.y.length() <= 0) {
                rVar.b0(2132946858);
            } else {
                rVar.b0(-2112351432);
                boolean zF = rVar.f(c1Var);
                Object objQ = rVar.Q();
                Object obj = androidx.compose.runtime.m.a;
                if (zF || objQ == obj) {
                    objQ = new androidx.compose.foundation.text.selection.y0(c1Var);
                    rVar.l0(objQ);
                }
                x0 x0Var = (x0) objQ;
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h);
                androidx.compose.ui.text.input.q qVar = c1Var.b;
                long j = c1Var.n().b;
                int i5 = androidx.compose.ui.text.l0.c;
                int iV = qVar.v((int) (j >> 32));
                r0 r0Var2 = c1Var.d;
                k1 k1VarD = r0Var2 != null ? r0Var2.d() : null;
                k1VarD.getClass();
                androidx.compose.ui.text.j0 j0Var = k1VarD.a;
                androidx.compose.ui.geometry.c cVarC = j0Var.c(com.google.android.material.resources.c.c(iV, 0, j0Var.a.a.y.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVarC.d)) & 4294967295L) | (((long) Float.floatToRawIntBits((cVar.V(y0.a) / 2) + cVarC.a)) << 32);
                boolean zE = rVar.e(jFloatToRawIntBits);
                Object objQ2 = rVar.Q();
                if (zE || objQ2 == obj) {
                    objQ2 = new y(jFloatToRawIntBits);
                    rVar.l0(objQ2);
                }
                androidx.compose.foundation.text.selection.m mVar = (androidx.compose.foundation.text.selection.m) objQ2;
                boolean zH = rVar.h(x0Var) | rVar.h(c1Var);
                Object objQ3 = rVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new b0(x0Var, c1Var);
                    rVar.l0(objQ3);
                }
                androidx.compose.ui.r rVarA = androidx.compose.ui.input.pointer.h0.a(androidx.compose.ui.o.b, x0Var, (PointerInputEventHandler) objQ3);
                boolean zE2 = rVar.e(jFloatToRawIntBits);
                Object objQ4 = rVar.Q();
                if (zE2 || objQ4 == obj) {
                    objQ4 = new c(jFloatToRawIntBits, i4);
                    rVar.l0(objQ4);
                }
                d.a(mVar, androidx.compose.ui.semantics.n.a(rVarA, false, (kotlin.jvm.functions.l) objQ4), 0L, rVar, 0);
            }
            rVar.p(false);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.g0(c1Var, i, i2);
        }
    }

    public static final androidx.compose.ui.geometry.c h(androidx.compose.ui.layout.b1 b1Var, int i, androidx.compose.ui.text.input.e0 e0Var, androidx.compose.ui.text.j0 j0Var, boolean z, int i2) {
        androidx.compose.ui.geometry.c cVarC = j0Var != null ? j0Var.c(e0Var.b.v(i)) : androidx.compose.ui.geometry.c.e;
        float f = cVarC.a;
        int iG0 = b1Var.g0(y0.a);
        return new androidx.compose.ui.geometry.c(z ? (i2 - f) - iG0 : f, cVarC.b, z ? i2 - f : iG0 + f, cVarC.d);
    }

    public static final boolean i(int i, KeyEvent keyEvent) {
        return ((int) (androidx.compose.ui.input.key.c.b(keyEvent) >> 32)) == i;
    }

    public static final int j(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void k(r0 r0Var) {
        androidx.compose.ui.text.input.d0 d0Var = r0Var.e;
        if (d0Var != null) {
            r0Var.v.invoke(androidx.compose.ui.text.input.x.a((androidx.compose.ui.text.input.x) r0Var.d.y, null, 0L, 3));
            androidx.compose.ui.text.input.y yVar = d0Var.a;
            AtomicReference atomicReference = yVar.b;
            while (!atomicReference.compareAndSet(d0Var, null)) {
                if (atomicReference.get() != d0Var) {
                }
            }
            yVar.a.d();
        }
        r0Var.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.appcompat.widget.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int l(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        androidx.emoji2.text.j jVarP = p();
        Integer num = null;
        if (jVarP != null) {
            if (!(jVarP.c() == 1)) {
                net.luminis.tls.engine.impl.c.r("Not initialized yet");
                return 0;
            }
            com.google.firebase.b.h(str, "charSequence cannot be null");
            ?? r4 = (c2) jVarP.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                androidx.emoji2.text.z[] zVarArr = (androidx.emoji2.text.z[]) spanned.getSpans(i, i + 1, androidx.emoji2.text.z.class);
                if (zVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(zVarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((androidx.emoji2.text.q) r4.T(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.q(i))).z;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((androidx.emoji2.text.q) r4.T(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.q(i))).z;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int m(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int n(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final int o(int i, String str) {
        androidx.emoji2.text.j jVarP = p();
        Integer num = null;
        if (jVarP != null) {
            Integer numValueOf = Integer.valueOf(jVarP.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final androidx.emoji2.text.j p() {
        if (!androidx.emoji2.text.j.d()) {
            return null;
        }
        androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
        if (jVarA.c() == 1) {
            return jVarA;
        }
        return null;
    }

    public static final void q(r0 r0Var, androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.q qVar) {
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            k1 k1VarD = r0Var.d();
            if (k1VarD == null) {
                return;
            }
            androidx.compose.ui.text.input.d0 d0Var = r0Var.e;
            if (d0Var == null) {
                return;
            }
            androidx.compose.ui.layout.x xVarC = r0Var.c();
            if (xVarC == null) {
                return;
            }
            r(xVar, r0Var.a, k1VarD.a, xVarC, d0Var, r0Var.b(), qVar);
        } finally {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
        }
    }

    public static void r(androidx.compose.ui.text.input.x xVar, w0 w0Var, androidx.compose.ui.text.j0 j0Var, androidx.compose.ui.layout.x xVar2, androidx.compose.ui.text.input.d0 d0Var, boolean z, androidx.compose.ui.text.input.q qVar) {
        androidx.compose.ui.geometry.c cVarB;
        if (z) {
            int iV = qVar.v(androidx.compose.ui.text.l0.e(xVar.b));
            String str = a1.a;
            if (iV < j0Var.a.a.y.length()) {
                cVarB = j0Var.b(iV);
            } else {
                cVarB = iV != 0 ? j0Var.b(iV - 1) : new androidx.compose.ui.geometry.c(0.0f, 0.0f, 1.0f, (int) (a1.a(w0Var.b, w0Var.g, w0Var.h, a1.a, 1) & 4294967295L));
            }
            float f = cVarB.b;
            float f2 = cVarB.a;
            long jW = xVar2.W((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            androidx.compose.ui.geometry.c cVarC = com.google.android.gms.dynamite.g.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jW & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jW >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(cVarB.d - f)) & 4294967295L));
            if (kotlin.jvm.internal.l.a((androidx.compose.ui.text.input.d0) d0Var.a.b.get(), d0Var)) {
                d0Var.b.h(cVarC);
            }
        }
    }

    public static final void s(androidx.compose.ui.text.input.y yVar, r0 r0Var, androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.k kVar, androidx.compose.ui.text.input.q qVar) {
        androidx.compose.foundation.text.input.internal.o oVar = r0Var.d;
        s sVar = r0Var.v;
        s sVar2 = r0Var.w;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.compose.animation.core.a aVar = new androidx.compose.animation.core.a(4, oVar, sVar, zVar);
        androidx.compose.ui.text.input.s sVar3 = yVar.a;
        sVar3.a(xVar, kVar, aVar, sVar2);
        androidx.compose.ui.text.input.d0 d0Var = new androidx.compose.ui.text.input.d0(yVar, sVar3);
        yVar.b.set(d0Var);
        zVar.e = d0Var;
        r0Var.e = d0Var;
        q(r0Var, xVar, qVar);
    }

    public static final void t(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            androidx.compose.foundation.internal.b.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        androidx.compose.foundation.internal.b.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
