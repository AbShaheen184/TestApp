package coil3.compose;

import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.datastore.preferences.protobuf.h1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.v;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements coil3.size.i, c0 {
    public long b;
    public ArrayList c;

    @Override // androidx.compose.ui.layout.c0
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        f(j);
        c1 c1VarF = p0Var.F(j);
        return s0Var.q(c1VarF.e, c1VarF.y, v.e, new androidx.compose.foundation.layout.j(c1VarF, 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil3.size.i
    public final Object e(kotlin.coroutines.d dVar) throws Throwable {
        n nVar;
        z zVar;
        Throwable th;
        coil3.size.c aVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i = nVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.A = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            nVar = new n(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object obj = nVar.y;
        int i2 = nVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (androidx.compose.ui.unit.a.k(this.b)) {
                z zVar2 = new z();
                try {
                    nVar.e = zVar2;
                    nVar.A = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(nVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    zVar2.e = cancellableContinuationImpl;
                    this.c.add(cancellableContinuationImpl);
                    Object result = cancellableContinuationImpl.getResult();
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (result == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                    ArrayList arrayList = this.c;
                    Object obj2 = zVar.e;
                    kotlin.jvm.internal.c0.a(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th2) {
                    zVar = zVar2;
                    th = th2;
                    ArrayList arrayList2 = this.c;
                    Object obj3 = zVar.e;
                    kotlin.jvm.internal.c0.a(arrayList2);
                    arrayList2.remove(obj3);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = nVar.e;
            try {
                kotlin.a.e(obj);
                ArrayList arrayList3 = this.c;
                Object obj4 = zVar.e;
                kotlin.jvm.internal.c0.a(arrayList3);
                arrayList3.remove(obj4);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.c;
                Object obj5 = zVar.e;
                kotlin.jvm.internal.c0.a(arrayList4);
                arrayList4.remove(obj5);
                throw th;
            }
        }
        long j = this.b;
        int iH = androidx.compose.ui.unit.a.h(j);
        coil3.size.c aVar3 = coil3.size.b.a;
        if (iH != Integer.MAX_VALUE) {
            h1.a(iH);
            aVar = new coil3.size.a(iH);
        } else {
            aVar = aVar3;
        }
        int iG = androidx.compose.ui.unit.a.g(j);
        if (iG != Integer.MAX_VALUE) {
            h1.a(iG);
            aVar3 = new coil3.size.a(iG);
        }
        return new coil3.size.h(aVar, aVar3);
    }

    public final void f(long j) {
        this.b = j;
        if (androidx.compose.ui.unit.a.k(j)) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kotlin.coroutines.d) it.next()).resumeWith(y.a);
        }
    }
}
