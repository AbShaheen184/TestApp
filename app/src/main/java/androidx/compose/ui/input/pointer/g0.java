package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w0 {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public g0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.b = obj;
        this.c = obj2;
        this.d = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new l0(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.l.a(this.b, g0Var.b) && kotlin.jvm.internal.l.a(this.c, g0Var.c) && this.d == g0Var.d;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        l0 l0Var = (l0) qVar;
        Object obj = l0Var.L;
        Object obj2 = this.b;
        boolean z = !kotlin.jvm.internal.l.a(obj, obj2);
        l0Var.L = obj2;
        Object obj3 = l0Var.M;
        Object obj4 = this.c;
        if (!kotlin.jvm.internal.l.a(obj3, obj4)) {
            z = true;
        }
        l0Var.M = obj4;
        Class<?> cls = l0Var.N.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            l0Var.N0();
        }
        l0Var.N = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
