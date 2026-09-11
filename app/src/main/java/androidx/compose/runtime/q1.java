package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    public y a;
    public int b;
    public a c;
    public kotlin.jvm.functions.p d;
    public int e;
    public androidx.collection.f0 f;
    public androidx.collection.o0 g;

    public q1(y yVar) {
        this.a = yVar;
    }

    public final boolean a() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final q0 b(Object obj) {
        q0 q0VarS;
        y yVar = this.a;
        return (yVar == null || (q0VarS = yVar.s(this, obj)) == null) ? q0.e : q0VarS;
    }

    public final void c() {
        y yVar = this.a;
        if (yVar != null) {
            yVar.L = true;
            yVar.Q.k();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(kotlin.jvm.functions.p pVar) {
        this.d = pVar;
    }
}
