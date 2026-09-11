package com.app.mlounge.ui.screens.adult;

import androidx.compose.foundation.lazy.grid.n;
import androidx.compose.foundation.lazy.grid.o;
import androidx.compose.foundation.lazy.grid.x;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ x y;

    public /* synthetic */ d(x xVar, int i) {
        this.e = i;
        this.y = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                o oVar = (o) kotlin.collections.o.T(this.y.h().m);
                if (oVar != null) {
                    return Integer.valueOf(oVar.a);
                }
                return null;
            case 1:
                n nVarH = this.y.h();
                o oVar2 = (o) kotlin.collections.o.T(nVarH.m);
                return new k(Integer.valueOf(oVar2 != null ? oVar2.a : -1), Integer.valueOf(nVarH.p));
            case 2:
                o oVar3 = (o) kotlin.collections.o.T(this.y.h().m);
                if (oVar3 != null) {
                    return Integer.valueOf(oVar3.a);
                }
                return null;
            case 3:
                o oVar4 = (o) kotlin.collections.o.T(this.y.h().m);
                if (oVar4 != null) {
                    return Integer.valueOf(oVar4.a);
                }
                return null;
            case 4:
                o oVar5 = (o) kotlin.collections.o.T(this.y.h().m);
                if (oVar5 != null) {
                    return Integer.valueOf(oVar5.a);
                }
                return null;
            case 5:
                x xVar = this.y;
                o oVar6 = (o) kotlin.collections.o.T(xVar.h().m);
                return new k(oVar6 != null ? Integer.valueOf(oVar6.a) : null, Integer.valueOf(xVar.h().p));
            case 6:
                o oVar7 = (o) kotlin.collections.o.T(this.y.h().m);
                if (oVar7 != null) {
                    return Integer.valueOf(oVar7.a);
                }
                return null;
            default:
                x xVar2 = this.y;
                return new k(Integer.valueOf(xVar2.g()), Integer.valueOf(xVar2.d.c.g()));
        }
    }
}
