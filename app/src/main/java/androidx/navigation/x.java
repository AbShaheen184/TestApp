package androidx.navigation;

import android.os.Bundle;
import androidx.collection.z0;
import androidx.compose.foundation.lazy.layout.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@j0("navigation")
public class x extends k0 {
    public final l0 c;

    public x(l0 l0Var) {
        l0Var.getClass();
        this.c = l0Var;
    }

    @Override // androidx.navigation.k0
    public final void d(List list, b0 b0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            t tVar = iVar.y;
            tVar.getClass();
            v vVar = (v) tVar;
            androidx.appcompat.widget.o oVar = vVar.y;
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            zVar.e = iVar.E.a();
            androidx.fragment.app.h hVar = vVar.C;
            int i = hVar.y;
            String str = (String) hVar.C;
            if (i == 0 && str == null) {
                oVar.getClass();
                String strValueOf = String.valueOf(oVar.a);
                strValueOf.getClass();
                if (((v) hVar.z).y.a == 0) {
                    strValueOf = "the root navigation";
                }
                net.luminis.tls.engine.impl.c.c("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            t tVarA = str != null ? hVar.A(str, false) : (t) ((z0) hVar.A).c(i);
            if (tVarA == null) {
                if (((String) hVar.B) == null) {
                    String strValueOf2 = (String) hVar.C;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(hVar.y);
                    }
                    hVar.B = strValueOf2;
                }
                String str2 = (String) hVar.B;
                str2.getClass();
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.q("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            androidx.appcompat.widget.o oVar2 = tVarA.y;
            if (str != null) {
                if (!str.equals((String) oVar2.e)) {
                    s sVarG = oVar2.g(str);
                    Bundle bundle = sVarG != null ? sVarG.y : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                        bundleI.putAll(bundle);
                        Bundle bundle2 = (Bundle) zVar.e;
                        if (bundle2 != null) {
                            bundleI.putAll(bundle2);
                        }
                        zVar.e = bundleI;
                    }
                }
                if (tVarA.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListE = f.e(tVarA.c(), new y0(1, zVar));
                    if (!arrayListE.isEmpty()) {
                        net.luminis.tls.engine.impl.c.i("Cannot navigate to startDestination ", tVarA, ". Missing required arguments [", arrayListE, 93);
                        return;
                    }
                }
            }
            this.c.b(tVarA.e).d(com.google.common.base.c.p(b().b(tVarA, tVarA.b((Bundle) zVar.e))), b0Var);
        }
    }

    @Override // androidx.navigation.k0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v a() {
        return new v(this);
    }
}
