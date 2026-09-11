package androidx.navigation.compose;

import androidx.collection.e0;
import androidx.compose.animation.core.e2;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.t2;
import androidx.navigation.y;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ e0 A;
    public final /* synthetic */ t2 B;
    public final /* synthetic */ i C;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ y y;
    public final /* synthetic */ androidx.navigation.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e2 e2Var, y yVar, androidx.navigation.i iVar, e0 e0Var, t2 t2Var, i iVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = e2Var;
        this.y = yVar;
        this.z = iVar;
        this.A = e0Var;
        this.B = t2Var;
        this.C = iVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new u(this.e, this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        uVar.invokeSuspend(yVar);
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[LOOP:1: B:15:0x005f->B:28:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[EDGE_INSN: B:33:0x00e3->B:29:0x00e3 BREAK  A[LOOP:1: B:15:0x005f->B:28:0x00df], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        char c;
        kotlin.a.e(obj);
        e2 e2Var = this.e;
        Object objN = e2Var.a.n();
        h1 h1Var = e2Var.d;
        if (kotlin.jvm.internal.l.a(objN, h1Var.getValue()) && (((androidx.navigation.i) this.y.b.f.i()) == null || kotlin.jvm.internal.l.a(h1Var.getValue(), this.z))) {
            Iterator it = ((List) this.B.getValue()).iterator();
            while (it.hasNext()) {
                this.C.b().c((androidx.navigation.i) it.next());
            }
            e0 e0Var = this.A;
            long[] jArr = e0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    char c2 = 7;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = e0Var.b[i4];
                                c = c2;
                                float f = e0Var.c[i4];
                                if (!kotlin.jvm.internal.l.a((String) obj2, ((androidx.navigation.i) h1Var.getValue()).C)) {
                                    e0Var.e--;
                                    long[] jArr2 = e0Var.a;
                                    int i5 = e0Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    e0Var.b[i4] = null;
                                }
                            } else {
                                c = c2;
                            }
                            j >>= 8;
                            i3++;
                            c2 = c;
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
        }
        return kotlin.y.a;
    }
}
