package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(j0.z);
    public static final androidx.compose.runtime.u2 b = new androidx.compose.runtime.u2(j0.A);
    public static final androidx.compose.runtime.b0 c = new androidx.compose.runtime.b0(o.B);
    public static final androidx.compose.runtime.u2 d = new androidx.compose.runtime.u2(j0.B);
    public static final androidx.compose.runtime.u2 e = new androidx.compose.runtime.u2(j0.C);
    public static final androidx.compose.runtime.u2 f = new androidx.compose.runtime.u2(j0.D);

    public static final void a(u uVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        rVar.c0(-520299287);
        int i2 = (rVar.h(uVar) ? 4 : 2) | i | (rVar.h(pVar) ? 32 : 16);
        int i3 = 1;
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = uVar.getContext();
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = new u0();
                rVar.l0(objQ);
            }
            u0 u0Var = (u0) objQ;
            l viewTreeOwners = uVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                net.luminis.tls.engine.impl.c.r("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            androidx.savedstate.g gVar = viewTreeOwners.b;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                Object parent = uVar.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = androidx.compose.runtime.saveable.h.class.getSimpleName() + ':' + strValueOf;
                androidx.savedstate.e savedStateRegistry = gVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                o oVar = o.C;
                androidx.compose.runtime.u2 u2Var = androidx.compose.runtime.saveable.j.a;
                androidx.compose.runtime.saveable.i iVar = new androidx.compose.runtime.saveable.i(linkedHashMap, oVar);
                try {
                    savedStateRegistry.c(str, new androidx.activity.g(iVar, i3));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object n1Var = new n1(iVar, new o1(z, savedStateRegistry, str));
                rVar.l0(n1Var);
                objQ2 = n1Var;
            }
            Object obj2 = (n1) objQ2;
            boolean zH = rVar.h(obj2);
            Object objQ3 = rVar.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new androidx.compose.animation.e(obj2, 16);
                rVar.l0(objQ3);
            }
            androidx.compose.runtime.j0.b(kotlin.y.a, (kotlin.jvm.functions.l) objQ3, rVar);
            Object objQ4 = rVar.Q();
            if (objQ4 == obj) {
                objQ4 = r1.a(context) ? new androidx.compose.ui.hapticfeedback.b(uVar.getView(), 1) : new d2();
                rVar.l0(objQ4);
            }
            androidx.compose.ui.hapticfeedback.a aVar = (androidx.compose.ui.hapticfeedback.a) objQ4;
            Configuration configuration = uVar.getConfiguration();
            Object objQ5 = rVar.Q();
            if (objQ5 == obj) {
                objQ5 = new androidx.compose.ui.res.c();
                rVar.l0(objQ5);
            }
            androidx.compose.ui.res.c cVar = (androidx.compose.ui.res.c) objQ5;
            Object objQ6 = rVar.Q();
            Object obj3 = objQ6;
            if (objQ6 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                rVar.l0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objQ7 = rVar.Q();
            if (objQ7 == obj) {
                objQ7 = new k0(configuration3, cVar);
                rVar.l0(objQ7);
            }
            k0 k0Var = (k0) objQ7;
            boolean zH2 = rVar.h(context);
            Object objQ8 = rVar.Q();
            if (zH2 || objQ8 == obj) {
                objQ8 = new androidx.compose.animation.c(4, context, k0Var);
                rVar.l0(objQ8);
            }
            androidx.compose.runtime.j0.b(cVar, (kotlin.jvm.functions.l) objQ8, rVar);
            Object objQ9 = rVar.Q();
            if (objQ9 == obj) {
                objQ9 = new androidx.compose.ui.res.d();
                rVar.l0(objQ9);
            }
            androidx.compose.ui.res.d dVar = (androidx.compose.ui.res.d) objQ9;
            Object objQ10 = rVar.Q();
            if (objQ10 == obj) {
                objQ10 = new l0(dVar);
                rVar.l0(objQ10);
            }
            l0 l0Var = (l0) objQ10;
            boolean zH3 = rVar.h(context);
            Object objQ11 = rVar.Q();
            if (zH3 || objQ11 == obj) {
                objQ11 = new androidx.compose.animation.c(5, context, l0Var);
                rVar.l0(objQ11);
            }
            androidx.compose.runtime.j0.b(dVar, (kotlin.jvm.functions.l) objQ11, rVar);
            androidx.compose.runtime.p1 p1Var = l1.v;
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{a.a(uVar.getConfiguration()), b.a(context), androidx.lifecycle.compose.c.a.a(viewTreeOwners.a), androidx.savedstate.compose.a.a.a(gVar), androidx.compose.runtime.saveable.j.a.a(obj2), f.a(uVar.getView()), d.a(cVar), e.a(dVar), p1Var.a(Boolean.valueOf(((Boolean) rVar.j(p1Var)).booleanValue() | uVar.getScrollCaptureInProgress$ui())), l1.l.a(aVar)}, androidx.compose.runtime.internal.k.c(1059770793, new androidx.compose.ui.layout.h1(uVar, u0Var, pVar), rVar), rVar, 56);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.ui.contentcapture.e(uVar, pVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
