package androidx.compose.runtime.internal;

import androidx.compose.animation.core.g2;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.runtime.q1;
import java.util.ArrayList;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.t;
import kotlin.jvm.functions.u;
import kotlin.jvm.functions.v;
import kotlin.jvm.functions.w;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p, q, r, s, t, u, v, w, kotlin.jvm.functions.b, kotlin.jvm.functions.c, kotlin.jvm.functions.e, kotlin.jvm.functions.f, kotlin.jvm.functions.g, kotlin.jvm.functions.h, kotlin.jvm.functions.i, kotlin.jvm.functions.j, kotlin.jvm.functions.k, kotlin.jvm.functions.m, kotlin.jvm.functions.n {
    public q1 A;
    public ArrayList B;
    public final int e;
    public final boolean y;
    public kotlin.d z;

    public f(int i, boolean z, kotlin.d dVar) {
        this.e = i;
        this.y = z;
        this.z = dVar;
    }

    @Override // kotlin.jvm.functions.v
    public final /* bridge */ /* synthetic */ Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.r rVar, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, rVar, num.intValue());
    }

    @Override // kotlin.jvm.functions.w
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return k(obj, obj2, obj3, obj4, obj5, obj6, obj7, (androidx.compose.runtime.r) obj8, ((Number) obj9).intValue());
    }

    @Override // kotlin.jvm.functions.s
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (androidx.compose.runtime.r) obj4, ((Number) obj5).intValue());
    }

    public final Object d(int i, androidx.compose.runtime.r rVar) {
        rVar.c0(this.e);
        l(rVar);
        int iA = i | (rVar.f(this) ? k.a(2, 0) : k.a(1, 0));
        kotlin.d dVar = this.z;
        c0.c(2, dVar);
        Object objInvoke = ((p) dVar).invoke(rVar, Integer.valueOf(iA));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new b2(2, this, f.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objInvoke;
    }

    public final Object e(Object obj, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 1) : k.a(1, 1);
        kotlin.d dVar = this.z;
        c0.c(3, dVar);
        Object objInvoke = ((q) dVar).invoke(obj, rVar, Integer.valueOf(iA | i));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(this, obj, i, 8);
        }
        return objInvoke;
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 6) : k.a(1, 6);
        kotlin.d dVar = this.z;
        c0.c(8, dVar);
        Object objA = ((v) dVar).a(obj, bool, obj2, obj3, obj4, rVar, Integer.valueOf(i | iA));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new d(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objA;
    }

    public final Object g(Object obj, Object obj2, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 2) : k.a(1, 2);
        kotlin.d dVar = this.z;
        c0.c(4, dVar);
        Object objInvoke = ((r) dVar).invoke(obj, obj2, rVar, Integer.valueOf(iA | i));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, obj2, i, 7);
        }
        return objInvoke;
    }

    public final Object h(Object obj, Object obj2, Object obj3, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 3) : k.a(1, 3);
        kotlin.d dVar = this.z;
        c0.c(5, dVar);
        Object objC = ((s) dVar).c(obj, obj2, obj3, rVar, Integer.valueOf(iA | i));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.material3.d(this, obj, obj2, obj3, i);
        }
        return objC;
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 4) : k.a(1, 4);
        kotlin.d dVar = this.z;
        c0.c(6, dVar);
        Object objI = ((f) ((t) dVar)).i(obj, obj2, obj3, obj4, rVar, Integer.valueOf(iA | i).intValue());
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g2(this, obj, obj2, obj3, obj4, i);
        }
        return objI;
    }

    @Override // kotlin.jvm.functions.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (androidx.compose.runtime.r) obj);
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 5) : k.a(1, 5);
        kotlin.d dVar = this.z;
        c0.c(7, dVar);
        Object objJ = ((f) ((u) dVar)).j(obj, obj2, obj3, obj4, obj5, rVar, Integer.valueOf(i | iA).intValue());
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new d(this, obj, obj2, obj3, obj4, obj5, i, 0);
        }
        return objJ;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(this.e);
        l(rVar);
        int iA = rVar.f(this) ? k.a(2, 7) : k.a(1, 7);
        kotlin.d dVar = this.z;
        c0.c(9, dVar);
        Object objB = ((w) dVar).b(obj, obj2, obj3, obj4, obj5, obj6, obj7, rVar, Integer.valueOf(i | iA));
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new e(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i, 0);
        }
        return objB;
    }

    public final void l(androidx.compose.runtime.r rVar) {
        q1 q1VarB;
        if (!this.y || (q1VarB = rVar.B()) == null) {
            return;
        }
        rVar.getClass();
        q1VarB.b |= 1;
        if (k.d(this.A, q1VarB)) {
            this.A = q1VarB;
            return;
        }
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.B = arrayList2;
            arrayList2.add(q1VarB);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (k.d((q1) arrayList.get(i), q1VarB)) {
                arrayList.set(i, q1VarB);
                return;
            }
        }
        arrayList.add(q1VarB);
    }

    @Override // kotlin.jvm.functions.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return e(obj, (androidx.compose.runtime.r) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (androidx.compose.runtime.r) obj3, ((Number) obj4).intValue());
    }
}
