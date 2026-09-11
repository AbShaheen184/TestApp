package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements i {
    public final m2 a;
    public final l2 b;
    public Object c;
    public Object d;
    public s e;
    public s f;
    public final s g;
    public long h;
    public s i;

    public t1(m mVar, l2 l2Var, Object obj, Object obj2, s sVar) {
        this.a = mVar.a(l2Var);
        this.b = l2Var;
        this.c = obj2;
        this.d = obj;
        this.e = (s) l2Var.a.invoke(obj);
        kotlin.jvm.functions.l lVar = l2Var.a;
        this.f = (s) lVar.invoke(obj2);
        this.g = sVar != null ? e.g(sVar) : ((s) lVar.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // androidx.compose.animation.core.i
    public final boolean a() {
        return this.a.a();
    }

    @Override // androidx.compose.animation.core.i
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // androidx.compose.animation.core.i
    public final l2 c() {
        return this.b;
    }

    @Override // androidx.compose.animation.core.i
    public final s d(long j) {
        if (!e(j)) {
            return this.a.i(j, this.e, this.f, this.g);
        }
        s sVar = this.i;
        if (sVar != null) {
            return sVar;
        }
        s sVarQ = this.a.q(this.e, this.f, this.g);
        this.i = sVarQ;
        return sVarQ;
    }

    @Override // androidx.compose.animation.core.i
    public final Object f(long j) {
        if (e(j)) {
            return this.c;
        }
        s sVarT = this.a.t(j, this.e, this.f, this.g);
        int iB = sVarT.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(sVarT.a(i))) {
                v0.b("AnimationVector cannot contain a NaN. " + sVarT + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(sVarT);
    }

    @Override // androidx.compose.animation.core.i
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (kotlin.jvm.internal.l.a(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (s) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (kotlin.jvm.internal.l.a(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (s) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
