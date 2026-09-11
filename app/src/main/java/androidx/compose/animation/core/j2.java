package androidx.compose.animation.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j2 implements com.google.android.gms.measurement.internal.b2, net.luminis.quic.packet.e {
    public Object e;

    public j2(int i) {
        switch (i) {
            case 1:
                androidx.collection.z zVar = androidx.collection.o.a;
                this.e = new androidx.collection.z();
                break;
            case 2:
                this.e = new ArrayList();
                break;
            default:
                this.e = androidx.compose.runtime.s.r(Boolean.FALSE);
                break;
        }
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public com.google.android.material.shape.g a() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public com.google.android.gms.measurement.internal.x0 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public com.google.android.gms.common.util.a c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public com.google.android.gms.measurement.internal.p1 e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public Context f() {
        throw null;
    }

    public boolean h(int i, androidx.compose.runtime.n0 n0Var, Object obj) {
        ArrayList arrayList = n0Var.a;
        if (arrayList == null) {
            i(i, n0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (obj2 instanceof androidx.compose.runtime.a) {
                if (obj2.equals(obj)) {
                    i(0, n0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof androidx.compose.runtime.n0)) {
                    com.google.gson.b.u(obj2, "Unexpected child source info ");
                    return false;
                }
                if (h(i, (androidx.compose.runtime.n0) obj2, obj)) {
                    i(0, n0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void i(int i, androidx.compose.runtime.n0 n0Var, Object obj) {
        ((ArrayList) this.e).add(new androidx.compose.runtime.tooling.b(i, null, null));
    }

    public abstract void j(com.google.firebase.messaging.o oVar);

    public abstract com.grack.nanojson.c k();

    public abstract com.grack.nanojson.c l();

    public abstract String m();

    public abstract Object n();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public List o(androidx.compose.foundation.lazy.layout.d0 d0Var, int i, long j) {
        androidx.collection.z zVar = (androidx.collection.z) this.e;
        List list = (List) zVar.b(i);
        if (list != null) {
            return list;
        }
        androidx.compose.foundation.lazy.layout.y yVar = d0Var.z;
        androidx.collection.z zVar2 = d0Var.A;
        List listJ = (List) zVar2.b(i);
        if (listJ == null) {
            Object objB = yVar.b(i);
            listJ = d0Var.y.j(objB, d0Var.e.a(i, objB, yVar.c(i)));
            zVar2.h(i, listJ);
        }
        int size = listJ.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((androidx.compose.ui.layout.p0) listJ.get(i2)).F(j));
        }
        zVar.h(i, arrayList);
        return arrayList;
    }

    public abstract Object p();

    public void q(net.luminis.quic.packet.g gVar, net.luminis.quic.packet.f fVar) {
        ((net.luminis.quic.packet.e) this.e).g(gVar, fVar);
    }

    public void r(int i, Object obj, androidx.compose.runtime.n0 n0Var, Object obj2) {
        if (kotlin.jvm.internal.l.a(obj, androidx.compose.runtime.m.a)) {
            i(i, n0Var, null);
        }
    }

    public abstract void s(Object obj);

    public abstract void t(e2 e2Var);

    public abstract void u();

    public void v() {
        com.google.android.gms.measurement.internal.p1 p1Var = ((com.google.android.gms.measurement.internal.s1) this.e).D;
        com.google.android.gms.measurement.internal.s1.m(p1Var);
        p1Var.v();
    }

    public j2(com.google.android.gms.measurement.internal.s1 s1Var) {
        com.google.android.gms.common.internal.x.g(s1Var);
        this.e = s1Var;
    }
}
