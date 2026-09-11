package androidx.navigation;

import androidx.appcompat.widget.c2;
import androidx.collection.b1;
import androidx.collection.z0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class v extends t implements Iterable, kotlin.jvm.internal.markers.a {
    public static final /* synthetic */ int D = 0;
    public final androidx.fragment.app.h C;

    public v(x xVar) {
        super(xVar);
        this.C = new androidx.fragment.app.h(this);
    }

    @Override // androidx.navigation.t
    public final s d(c2 c2Var) {
        s sVarD = super.d(c2Var);
        androidx.fragment.app.h hVar = this.C;
        hVar.getClass();
        return hVar.G(sVarD, c2Var, false, (v) hVar.z);
    }

    public final s e(c2 c2Var, t tVar) {
        return this.C.G(super.d(c2Var), c2Var, true, tVar);
    }

    @Override // androidx.navigation.t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        androidx.fragment.app.h hVar = this.C;
        int iF = ((z0) hVar.A).f();
        androidx.fragment.app.h hVar2 = ((v) obj).C;
        if (iF != ((z0) hVar2.A).f() || hVar.y != hVar2.y) {
            return false;
        }
        z0 z0Var = (z0) hVar.A;
        z0Var.getClass();
        for (t tVar : (kotlin.sequences.a) kotlin.sequences.k.n(new b1(z0Var, 0))) {
            if (!tVar.equals(((z0) hVar2.A).c(tVar.y.a))) {
                return false;
            }
        }
        return true;
    }

    public final s f(String str, boolean z, t tVar) {
        s sVarF;
        str.getClass();
        androidx.fragment.app.h hVar = this.C;
        hVar.getClass();
        v vVar = (v) hVar.z;
        s sVarG = vVar.y.g(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = vVar.iterator();
        while (true) {
            androidx.navigation.internal.h hVar2 = (androidx.navigation.internal.h) it;
            sVarF = null;
            if (!hVar2.hasNext()) {
                break;
            }
            t tVar2 = (t) hVar2.next();
            if (!kotlin.jvm.internal.l.a(tVar2, tVar)) {
                if (tVar2 instanceof v) {
                    sVarF = ((v) tVar2).f(str, false, vVar);
                } else {
                    tVar2.getClass();
                    sVarF = tVar2.y.g(str);
                }
            }
            if (sVarF != null) {
                arrayList.add(sVarF);
            }
        }
        s sVar = (s) kotlin.collections.o.U(arrayList);
        v vVar2 = vVar.z;
        if (vVar2 != null && z && !vVar2.equals(tVar)) {
            sVarF = vVar2.f(str, true, vVar);
        }
        return (s) kotlin.collections.o.U(kotlin.collections.n.N(new s[]{sVarG, sVar, sVarF}));
    }

    @Override // androidx.navigation.t
    public final int hashCode() {
        androidx.fragment.app.h hVar = this.C;
        int iD = hVar.y;
        z0 z0Var = (z0) hVar.A;
        int iF = z0Var.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + z0Var.d(i)) * 31) + ((t) z0Var.g(i)).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        androidx.fragment.app.h hVar = this.C;
        hVar.getClass();
        return new androidx.navigation.internal.h(hVar);
    }

    @Override // androidx.navigation.t
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        androidx.fragment.app.h hVar = this.C;
        String str = (String) hVar.C;
        hVar.getClass();
        t tVarA = (str == null || kotlin.text.k.d0(str)) ? null : hVar.A(str, true);
        if (tVarA == null) {
            tVarA = hVar.z(hVar.y);
        }
        sb.append(" startDestination=");
        if (tVarA == null) {
            String str2 = (String) hVar.C;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) hVar.B;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(hVar.y));
                }
            }
        } else {
            sb.append("{");
            sb.append(tVarA.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
