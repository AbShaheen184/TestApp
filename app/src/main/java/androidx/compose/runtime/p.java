package androidx.compose.runtime;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends v {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final h1 f = new h1(androidx.compose.runtime.internal.j.A, f.B);
    public final /* synthetic */ r g;

    public p(r rVar, long j, boolean z, boolean z2, com.app.mlounge.data.music.e eVar) {
        this.g = rVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // androidx.compose.runtime.v
    public final void a(y yVar, kotlin.jvm.functions.p pVar) {
        this.g.b.a(yVar, pVar);
    }

    @Override // androidx.compose.runtime.v
    public final androidx.collection.p0 b(y yVar, androidx.compose.ui.graphics.a aVar, kotlin.jvm.functions.p pVar) {
        return this.g.b.b(yVar, aVar, pVar);
    }

    @Override // androidx.compose.runtime.v
    public final void c() {
        this.g.A--;
    }

    @Override // androidx.compose.runtime.v
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // androidx.compose.runtime.v
    public final boolean e() {
        return this.b;
    }

    @Override // androidx.compose.runtime.v
    public final boolean f() {
        return this.c;
    }

    @Override // androidx.compose.runtime.v
    public final long g() {
        return this.a;
    }

    @Override // androidx.compose.runtime.v
    public final u h() {
        return this.g.h;
    }

    @Override // androidx.compose.runtime.v
    public final androidx.compose.runtime.internal.j i() {
        return (androidx.compose.runtime.internal.j) this.f.getValue();
    }

    @Override // androidx.compose.runtime.v
    public final kotlin.coroutines.i j() {
        return this.g.b.j();
    }

    @Override // androidx.compose.runtime.v
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // androidx.compose.runtime.v
    public final void l(y yVar) {
        r rVar = this.g;
        rVar.b.l(rVar.h);
        rVar.b.l(yVar);
    }

    @Override // androidx.compose.runtime.v
    public final w0 m(x0 x0Var) {
        return this.g.b.m(x0Var);
    }

    @Override // androidx.compose.runtime.v
    public final androidx.collection.p0 n(y yVar, androidx.compose.ui.graphics.a aVar, androidx.collection.p0 p0Var) {
        return this.g.b.n(yVar, aVar, p0Var);
    }

    @Override // androidx.compose.runtime.v
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // androidx.compose.runtime.v
    public final void p(r rVar) {
        this.e.add(rVar);
    }

    @Override // androidx.compose.runtime.v
    public final void q(q1 q1Var) {
        this.g.b.q(q1Var);
    }

    @Override // androidx.compose.runtime.v
    public final void r(y yVar) {
        this.g.b.r(yVar);
    }

    @Override // androidx.compose.runtime.v
    public final g s(androidx.compose.animation.z zVar) {
        return this.g.b.s(zVar);
    }

    @Override // androidx.compose.runtime.v
    public final void t() {
        this.g.A++;
    }

    @Override // androidx.compose.runtime.v
    public final void u(r rVar) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                rVar.getClass();
                set.remove(rVar.z());
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        kotlin.jvm.internal.c0.a(linkedHashSet);
        linkedHashSet.remove(rVar);
    }

    @Override // androidx.compose.runtime.v
    public final void v(y yVar) {
        this.g.b.v(yVar);
    }

    public final void w() {
        LinkedHashSet<r> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (r rVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(rVar.z());
                }
            }
        }
        linkedHashSet.clear();
    }
}
