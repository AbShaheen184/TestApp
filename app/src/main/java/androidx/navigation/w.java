package androidx.navigation;

import androidx.collection.z0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends u {
    public final l0 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l0 l0Var, String str) {
        super(l0Var.b(f.d(x.class)), null);
        l0Var.getClass();
        str.getClass();
        this.h = new ArrayList();
        this.f = l0Var;
        this.g = str;
    }

    public final v c() {
        int iHashCode;
        v vVar = (v) super.a();
        ArrayList<t> arrayList = this.h;
        arrayList.getClass();
        androidx.fragment.app.h hVar = vVar.C;
        hVar.getClass();
        for (t tVar : arrayList) {
            if (tVar != null) {
                z0 z0Var = (z0) hVar.A;
                v vVar2 = (v) hVar.z;
                androidx.appcompat.widget.o oVar = vVar2.y;
                androidx.appcompat.widget.o oVar2 = tVar.y;
                int i = oVar2.a;
                String str = (String) oVar2.e;
                if (i == 0 && str == null) {
                    net.luminis.tls.engine.impl.c.o("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) oVar.e;
                if (str2 != null && kotlin.jvm.internal.l.a(str, str2)) {
                    net.luminis.tls.engine.impl.c.h("Destination ", tVar, " cannot have the same route as graph ", vVar2);
                    return null;
                }
                if (i == oVar.a) {
                    net.luminis.tls.engine.impl.c.h("Destination ", tVar, " cannot have the same id as graph ", vVar2);
                    return null;
                }
                t tVar2 = (t) z0Var.c(i);
                if (tVar2 == tVar) {
                    continue;
                } else {
                    if (tVar.z != null) {
                        net.luminis.tls.engine.impl.c.r("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (tVar2 != null) {
                        tVar2.z = null;
                    }
                    tVar.z = vVar2;
                    z0Var.e(oVar2.a, tVar);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                net.luminis.tls.engine.impl.c.r("You must set a start destination route");
                return null;
            }
            net.luminis.tls.engine.impl.c.r("You must set a start destination id");
            return null;
        }
        v vVar3 = (v) hVar.z;
        if (str3 != null) {
            if (str3.equals((String) vVar3.y.e)) {
                net.luminis.tls.engine.impl.c.h("Start destination ", str3, " cannot use the same route as the graph ", vVar3);
            } else if (kotlin.text.k.d0(str3)) {
                net.luminis.tls.engine.impl.c.o("Cannot have an empty start destination route");
            } else {
                int i2 = t.B;
                iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return vVar;
        }
        iHashCode = 0;
        hVar.y = iHashCode;
        hVar.C = str3;
        return vVar;
    }
}
