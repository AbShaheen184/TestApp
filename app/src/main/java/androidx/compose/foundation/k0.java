package androidx.compose.foundation;

import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends j {
    public kotlin.jvm.functions.a j0;
    public boolean k0;
    public final androidx.collection.c0 l0;
    public final androidx.collection.c0 m0;

    public k0(androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        super(kVar, null, false, true, null, null, aVar);
        this.j0 = aVar2;
        this.k0 = true;
        int i = androidx.collection.q.a;
        this.l0 = new androidx.collection.c0(6);
        this.m0 = new androidx.collection.c0(6);
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        a1();
    }

    @Override // androidx.compose.foundation.j
    public final void O0(androidx.compose.ui.semantics.x xVar) {
        if (this.j0 != null) {
            androidx.activity.w wVar = new androidx.activity.w(this, 3);
            kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
            xVar.b(androidx.compose.ui.semantics.k.c, new androidx.compose.ui.semantics.a(null, wVar));
        }
    }

    @Override // androidx.compose.foundation.j
    public final androidx.compose.ui.input.pointer.l0 P0() {
        m mVar = new m(this, 1);
        androidx.compose.ui.input.pointer.m mVar2 = androidx.compose.ui.input.pointer.h0.a;
        return new androidx.compose.ui.input.pointer.l0(null, null, mVar);
    }

    @Override // androidx.compose.foundation.j
    public final void W0() {
        a1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // androidx.compose.foundation.j
    public final boolean X0(KeyEvent keyEvent) {
        boolean z;
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        if (this.j0 != null) {
            androidx.collection.c0 c0Var = this.l0;
            if (c0Var.d(jB) == null) {
                c0Var.g(jB, BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new androidx.compose.animation.core.c1(this, null, 1), 3, null));
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.j
    public final void Y0(KeyEvent keyEvent) {
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        androidx.collection.c0 c0Var = this.l0;
        boolean z = false;
        if (c0Var.d(jB) != null) {
            Job job = (Job) c0Var.d(jB);
            if (job != null) {
                if (job.isActive()) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                } else {
                    z = true;
                }
            }
            c0Var.f(jB);
        }
        if (z) {
            return;
        }
        this.T.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x0018->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:2: B:20:0x0065->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:17:0x0056 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[EDGE_INSN: B:39:0x0099->B:31:0x0099 BREAK  A[LOOP:2: B:20:0x0065->B:30:0x0096], SYNTHETIC] */
    public final void a1() {
        long j;
        long j2;
        long j3;
        androidx.collection.c0 c0Var = this.l0;
        Object[] objArr = c0Var.c;
        long[] jArr = c0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr[i];
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j4 & 255) < 128) {
                            Job.DefaultImpls.cancel$default((Job) objArr[(i << 3) + i3], (CancellationException) null, 1, (Object) null);
                        }
                        j4 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        c0Var.a();
        androidx.collection.c0 c0Var2 = this.m0;
        Object[] objArr2 = c0Var2.c;
        long[] jArr2 = c0Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & j3) == j3) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & j2) < j) {
                            ((h0) objArr2[(i4 << 3) + i6]).getClass();
                            Job.DefaultImpls.cancel$default((Job) null, (CancellationException) null, 1, (Object) null);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        c0Var2.a();
    }
}
