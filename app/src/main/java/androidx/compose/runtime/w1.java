package androidx.compose.runtime;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends v {
    public final e a;
    public final androidx.appcompat.widget.c2 b;
    public final Object c;
    public Job d;
    public Throwable e;
    public final ArrayList f;
    public Object g;
    public androidx.collection.p0 h;
    public final androidx.compose.runtime.collection.b i;
    public final ArrayList j;
    public final ArrayList k;
    public final androidx.collection.o0 l;
    public final androidx.compose.foundation.text.input.internal.o m;
    public final androidx.collection.o0 n;
    public final androidx.collection.o0 o;
    public ArrayList p;
    public LinkedHashSet q;
    public CancellableContinuationImpl r;
    public com.google.firebase.platforminfo.c s;
    public boolean t;
    public final MutableStateFlow u;
    public final androidx.appcompat.widget.c2 v;
    public final CompletableJob w;
    public final kotlin.coroutines.i x;
    public final f y;
    public static final MutableStateFlow z = StateFlowKt.MutableStateFlow(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b.A);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public w1(kotlin.coroutines.i iVar) {
        e eVar = new e(new r1(this, 0));
        this.a = eVar;
        this.b = new androidx.appcompat.widget.c2(new r1(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new androidx.collection.p0();
        this.i = new androidx.compose.runtime.collection.b(new y[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new androidx.collection.o0();
        this.m = new androidx.compose.foundation.text.input.internal.o(10);
        this.n = new androidx.collection.o0();
        this.o = new androidx.collection.o0();
        this.u = StateFlowKt.MutableStateFlow(s1.z);
        this.v = new androidx.appcompat.widget.c2(3);
        CompletableJob completableJobJob = JobKt.Job((Job) iVar.get(Job.Key));
        completableJobJob.invokeOnCompletion(new androidx.activity.compose.g(this, 26));
        this.w = completableJobJob;
        this.x = iVar.plus(eVar).plus(completableJobJob);
        this.y = new f(9);
    }

    public static final void G(ArrayList arrayList, w1 w1Var, y yVar) {
        arrayList.clear();
        synchronized (w1Var.c) {
            Iterator it = w1Var.k.iterator();
            if (it.hasNext()) {
                ((x0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(androidx.compose.runtime.snapshots.b bVar) {
        try {
            if (bVar.w() instanceof androidx.compose.runtime.snapshots.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (Throwable th) {
            bVar.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.z != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((androidx.compose.runtime.internal.a) ((androidx.compose.runtime.internal.c) this.b.z).z).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.z != 0 || z() || B();
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List D() {
        ?? r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? kotlin.collections.u.e : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        CancellableContinuation cancellableContinuationY;
        synchronized (this.c) {
            cancellableContinuationY = y();
            if (((s1) this.u.getValue()).compareTo(s1.y) <= 0) {
                throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (cancellableContinuationY != null) {
            cancellableContinuationY.resumeWith(kotlin.y.a);
        }
    }

    public final void F(y yVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((x0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, androidx.collection.p0 p0Var) {
        androidx.compose.runtime.snapshots.b bVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((x0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            y yVar = (y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (yVar.S.F) {
                t.a("Check failed");
            }
            androidx.activity.compose.g gVar = new androidx.activity.compose.g(yVar, 25);
            androidx.activity.compose.h hVar = new androidx.activity.compose.h(28, yVar, p0Var);
            androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
            androidx.compose.runtime.snapshots.b bVar = fVarJ instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(gVar, hVar)) == null) {
                net.luminis.tls.engine.impl.c.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                androidx.compose.runtime.snapshots.f fVarJ2 = bVarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                x0 x0Var = (x0) list2.get(i2);
                                androidx.collection.o0 o0Var = this.l;
                                x0Var.getClass();
                                Object objA = androidx.compose.runtime.collection.a.a(o0Var);
                                arrayList.add(new kotlin.k(x0Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                kotlin.k kVar = (kotlin.k) arrayList.get(i3);
                                if (kVar.y == null) {
                                    androidx.compose.foundation.text.input.internal.o oVar = this.m;
                                    ((x0) kVar.e).getClass();
                                    if (((androidx.collection.o0) oVar.y).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            kotlin.k kVar2 = (kotlin.k) arrayList.get(i4);
                                            if (kVar2.y == null) {
                                                androidx.compose.foundation.text.input.internal.o oVar2 = this.m;
                                                ((x0) kVar2.e).getClass();
                                                androidx.collection.o0 o0Var2 = (androidx.collection.o0) oVar2.y;
                                                if (o0Var2.i()) {
                                                    ((androidx.collection.o0) oVar2.z).a();
                                                }
                                            }
                                            arrayList3.add(kVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((kotlin.k) arrayList.get(i5)).y != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((kotlin.k) arrayList.get(i6)).y == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        kotlin.k kVar3 = (kotlin.k) arrayList.get(i7);
                                        if (kVar3.y == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        kotlin.collections.o.C(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((kotlin.k) obj2).y != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    yVar.r(arrayList);
                    androidx.compose.runtime.snapshots.f.q(fVarJ2);
                    w(bVarC);
                } catch (Throwable th2) {
                    androidx.compose.runtime.snapshots.f.q(fVarJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return kotlin.collections.o.k0(map.keySet());
    }

    public final y I(y yVar, androidx.collection.p0 p0Var) {
        androidx.compose.runtime.snapshots.b bVarC;
        if (yVar.S.F || yVar.T == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.q;
        if (linkedHashSet == null || !linkedHashSet.contains(yVar)) {
            androidx.activity.compose.g gVar = new androidx.activity.compose.g(yVar, 25);
            androidx.activity.compose.h hVar = new androidx.activity.compose.h(28, yVar, p0Var);
            androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
            androidx.compose.runtime.snapshots.b bVar = fVarJ instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(gVar, hVar)) == null) {
                net.luminis.tls.engine.impl.c.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                androidx.compose.runtime.snapshots.f fVarJ2 = bVarC.j();
                if (p0Var != null) {
                    try {
                        if (p0Var.h()) {
                            androidx.activity.compose.f fVar = new androidx.activity.compose.f(15, p0Var, yVar);
                            r rVar = yVar.S;
                            if (rVar.F) {
                                t.a("Preparing a composition while composing is not supported");
                            }
                            rVar.F = true;
                            try {
                                fVar.invoke();
                                rVar.F = false;
                            } catch (Throwable th) {
                                rVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        androidx.compose.runtime.snapshots.f.q(fVarJ2);
                        throw th2;
                    }
                }
                boolean zX = yVar.x();
                androidx.compose.runtime.snapshots.f.q(fVarJ2);
                w(bVarC);
                if (zX) {
                    return yVar;
                }
            } catch (Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return null;
    }

    public final void J(Throwable th, y yVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof l)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                com.google.firebase.platforminfo.c cVar = this.s;
                if (cVar != null) {
                    throw ((Throwable) cVar.e);
                }
                this.s = new com.google.firebase.platforminfo.c(th);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new androidx.collection.p0();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.s = new com.google.firebase.platforminfo.c(th);
                if (yVar != null) {
                    L(yVar);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(this.h);
            this.h = new androidx.collection.p0();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((y) listD.get(i)).y(dVar);
                    if (((s1) this.u.getValue()).compareTo(s1.y) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    androidx.collection.p0 p0Var = this.h;
                    p0Var.getClass();
                    Iterator<E> it = dVar.iterator();
                    while (it.hasNext()) {
                        p0Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(y yVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
        }
        if (this.f.remove(yVar)) {
            this.g = null;
        }
    }

    @Override // androidx.compose.runtime.v
    public final void a(y yVar, kotlin.jvm.functions.p pVar) throws Throwable {
        s1 s1Var;
        boolean zContains;
        androidx.compose.runtime.snapshots.b bVarC;
        boolean z2 = yVar.S.F;
        synchronized (this.c) {
            s1 s1Var2 = (s1) this.u.getValue();
            s1Var = s1.y;
            zContains = s1Var2.compareTo(s1Var) > 0 ? true ^ D().contains(yVar) : true;
        }
        try {
            androidx.activity.compose.g gVar = new androidx.activity.compose.g(yVar, 25);
            androidx.activity.compose.h hVar = new androidx.activity.compose.h(28, yVar, (Object) null);
            androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
            androidx.compose.runtime.snapshots.b bVar = fVarJ instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(gVar, hVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                androidx.compose.runtime.snapshots.f fVarJ2 = bVarC.j();
                try {
                    yVar.j(pVar);
                    androidx.compose.runtime.snapshots.f.q(fVarJ2);
                    w(bVarC);
                    synchronized (this.c) {
                        if (((s1) this.u.getValue()).compareTo(s1Var) > 0 && !D().contains(yVar)) {
                            this.f.add(yVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        androidx.compose.runtime.snapshots.n.j().m();
                    }
                    try {
                        F(yVar);
                        try {
                            yVar.d();
                            yVar.f();
                            if (z2) {
                                return;
                            }
                            androidx.compose.runtime.snapshots.n.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, yVar);
                    }
                } catch (Throwable th3) {
                    androidx.compose.runtime.snapshots.f.q(fVarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(bVarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th5, yVar);
        }
    }

    @Override // androidx.compose.runtime.v
    public final androidx.collection.p0 b(y yVar, androidx.compose.ui.graphics.a aVar, kotlin.jvm.functions.p pVar) {
        androidx.appcompat.widget.c2 c2Var = this.v;
        try {
            androidx.compose.ui.graphics.a aVar2 = yVar.M;
            yVar.M = aVar;
            try {
                a(yVar, pVar);
                androidx.collection.p0 p0Var = (androidx.collection.p0) c2Var.v();
                if (p0Var == null) {
                    p0Var = androidx.collection.x0.a;
                    p0Var.getClass();
                }
                yVar.M = aVar2;
                c2Var.X(null);
                return p0Var;
            } catch (Throwable th) {
                yVar.M = aVar2;
                throw th;
            }
        } catch (Throwable th2) {
            c2Var.X(null);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.v
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.v
    public final boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.v
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.v
    public final long g() {
        return 1000;
    }

    @Override // androidx.compose.runtime.v
    public final u h() {
        return null;
    }

    @Override // androidx.compose.runtime.v
    public final kotlin.coroutines.i j() {
        return this.x;
    }

    @Override // androidx.compose.runtime.v
    public final boolean k() {
        return false;
    }

    @Override // androidx.compose.runtime.v
    public final void l(y yVar) {
        CancellableContinuation cancellableContinuationY;
        synchronized (this.c) {
            if (this.i.h(yVar)) {
                cancellableContinuationY = null;
            } else {
                this.i.b(yVar);
                cancellableContinuationY = y();
            }
        }
        if (cancellableContinuationY != null) {
            cancellableContinuationY.resumeWith(kotlin.y.a);
        }
    }

    @Override // androidx.compose.runtime.v
    public final w0 m(x0 x0Var) {
        w0 w0Var;
        synchronized (this.c) {
            w0Var = (w0) this.n.k(x0Var);
        }
        return w0Var;
    }

    @Override // androidx.compose.runtime.v
    public final androidx.collection.p0 n(y yVar, androidx.compose.ui.graphics.a aVar, androidx.collection.p0 p0Var) {
        androidx.appcompat.widget.c2 c2Var = this.v;
        try {
            K();
            yVar.y(new androidx.compose.runtime.collection.d(p0Var));
            androidx.compose.ui.graphics.a aVar2 = yVar.M;
            yVar.M = aVar;
            try {
                y yVarI = I(yVar, null);
                if (yVarI != null) {
                    F(yVar);
                    yVarI.d();
                    yVarI.f();
                }
                androidx.collection.p0 p0Var2 = (androidx.collection.p0) c2Var.v();
                if (p0Var2 == null) {
                    p0Var2 = androidx.collection.x0.a;
                    p0Var2.getClass();
                }
                yVar.M = aVar2;
                c2Var.X(null);
                return p0Var2;
            } catch (Throwable th) {
                yVar.M = aVar2;
                throw th;
            }
        } catch (Throwable th2) {
            c2Var.X(null);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.v
    public final void q(q1 q1Var) {
        androidx.appcompat.widget.c2 c2Var = this.v;
        androidx.collection.p0 p0Var = (androidx.collection.p0) c2Var.v();
        if (p0Var == null) {
            androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
            p0Var = new androidx.collection.p0();
            c2Var.X(p0Var);
        }
        p0Var.a(q1Var);
    }

    @Override // androidx.compose.runtime.v
    public final void r(y yVar) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.v
    public final g s(androidx.compose.animation.z zVar) {
        androidx.appcompat.widget.c2 c2Var = this.b;
        androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) c2Var.z;
        a1 a1Var = new a1();
        a1Var.a = zVar;
        return cVar.m(a1Var, (androidx.activity.compose.f) c2Var.A);
    }

    @Override // androidx.compose.runtime.v
    public final void v(y yVar) {
        synchronized (this.c) {
            if (this.f.remove(yVar)) {
                this.g = null;
            }
            this.i.j(yVar);
            this.j.remove(yVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((s1) this.u.getValue()).compareTo(s1.B) >= 0) {
                this.u.setValue(s1.y);
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.w, (CancellationException) null, 1, (Object) null);
    }

    public final CancellableContinuation y() {
        MutableStateFlow mutableStateFlow = this.u;
        int iCompareTo = ((s1) mutableStateFlow.getValue()).compareTo(s1.y);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        androidx.compose.runtime.collection.b bVar = this.i;
        if (iCompareTo > 0) {
            com.google.firebase.platforminfo.c cVar = this.s;
            s1 s1Var = s1.C;
            s1 s1Var2 = s1.z;
            if (cVar == null) {
                if (this.d == null) {
                    this.h = new androidx.collection.p0();
                    bVar.g();
                    if (z() || B()) {
                        s1Var2 = s1.A;
                    }
                } else {
                    s1Var2 = (bVar.z != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? s1Var : s1.B;
                }
            }
            mutableStateFlow.setValue(s1Var2);
            if (s1Var2 != s1Var) {
                return null;
            }
            CancellableContinuationImpl cancellableContinuationImpl = this.r;
            this.r = null;
            return cancellableContinuationImpl;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = kotlin.collections.u.e;
        this.h = new androidx.collection.p0();
        bVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        CancellableContinuationImpl cancellableContinuationImpl2 = this.r;
        if (cancellableContinuationImpl2 != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl2, null, 1, null);
        }
        this.r = null;
        this.s = null;
        return null;
    }

    public final boolean z() {
        return !this.t && (((androidx.compose.runtime.internal.a) ((androidx.compose.runtime.internal.c) this.a.z).z).get() & 134217727) > 0;
    }

    @Override // androidx.compose.runtime.v
    public final void o(Set set) {
    }
}
