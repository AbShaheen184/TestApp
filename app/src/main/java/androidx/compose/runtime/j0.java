package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final h0 a = new h0();

    public static final void a(Object obj, Object obj2, kotlin.jvm.functions.l lVar, r rVar) {
        boolean zF = rVar.f(obj) | rVar.f(obj2);
        Object objQ = rVar.Q();
        if (zF || objQ == m.a) {
            objQ = new f0(lVar);
            rVar.l0(objQ);
        }
    }

    public static final void b(Object obj, kotlin.jvm.functions.l lVar, r rVar) {
        boolean zF = rVar.f(obj);
        Object objQ = rVar.Q();
        if (zF || objQ == m.a) {
            objQ = new f0(lVar);
            rVar.l0(objQ);
        }
    }

    public static final void c(r rVar, Object obj, kotlin.jvm.functions.p pVar) {
        kotlin.coroutines.i iVar = rVar.R;
        boolean zF = rVar.f(obj);
        Object objQ = rVar.Q();
        if (zF || objQ == m.a) {
            objQ = new t0(iVar, pVar);
            rVar.l0(objQ);
        }
    }

    public static final void d(Object obj, Object obj2, kotlin.jvm.functions.p pVar, r rVar) {
        kotlin.coroutines.i iVar = rVar.R;
        boolean zF = rVar.f(obj) | rVar.f(obj2);
        Object objQ = rVar.Q();
        if (zF || objQ == m.a) {
            objQ = new t0(iVar, pVar);
            rVar.l0(objQ);
        }
    }

    public static final void e(kotlin.jvm.functions.a aVar, r rVar) {
        androidx.compose.runtime.changelist.l0 l0Var = rVar.M.b.l;
        l0Var.J(androidx.compose.runtime.changelist.b0.c);
        androidx.room.r.v(l0Var, 0, aVar);
    }

    public static final CoroutineScope f(r rVar) {
        Job.Key.getClass();
        return new c2(rVar.R);
    }
}
