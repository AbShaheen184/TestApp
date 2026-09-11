package com.app.mlounge.ui;

import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.ui.viewmodel.x1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.r {
    public final /* synthetic */ t2 A;
    public final /* synthetic */ t2 B;
    public final /* synthetic */ t2 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.d z;

    public /* synthetic */ o(x1 x1Var, kotlin.jvm.functions.l lVar, t2 t2Var, t2 t2Var2, t2 t2Var3, t2 t2Var4) {
        this.e = 2;
        this.y = x1Var;
        this.z = lVar;
        this.B = t2Var;
        this.C = t2Var2;
        this.A = t2Var3;
        this.D = t2Var4;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                androidx.navigation.y yVar = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                y0 y0Var = (y0) this.A;
                final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH = rVar2.h(yVar);
                Object objQ = rVar2.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (zH || objQ == fVar) {
                    objQ = new d(yVar, y0Var, 15);
                    rVar2.l0(objQ);
                }
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
                boolean zH2 = rVar2.h(yVar);
                Object objQ2 = rVar2.Q();
                if (zH2 || objQ2 == fVar) {
                    objQ2 = new d(yVar, y0Var, 16);
                    rVar2.l0(objQ2);
                }
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ2;
                boolean zH3 = rVar2.h(yVar);
                Object objQ3 = rVar2.Q();
                if (zH3 || objQ3 == fVar) {
                    objQ3 = new d(yVar, y0Var, 17);
                    rVar2.l0(objQ3);
                }
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ3;
                boolean zH4 = rVar2.h(yVar);
                Object objQ4 = rVar2.Q();
                if (zH4 || objQ4 == fVar) {
                    objQ4 = new d(yVar, y0Var, 18);
                    rVar2.l0(objQ4);
                }
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ4;
                boolean zH5 = rVar2.h(yVar);
                Object objQ5 = rVar2.Q();
                if (zH5 || objQ5 == fVar) {
                    objQ5 = new d(yVar, y0Var, 19);
                    rVar2.l0(objQ5);
                }
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ5;
                boolean zF = rVar2.f(rVar);
                Object objQ6 = rVar2.Q();
                if (zF || objQ6 == fVar) {
                    objQ6 = new c(1, rVar);
                    rVar2.l0(objQ6);
                }
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ6;
                boolean zH6 = rVar2.h(yVar);
                Object objQ7 = rVar2.Q();
                if (zH6 || objQ7 == fVar) {
                    objQ7 = new d(yVar, y0Var, 20);
                    rVar2.l0(objQ7);
                }
                kotlin.jvm.functions.l lVar6 = (kotlin.jvm.functions.l) objQ7;
                boolean z = ((Boolean) this.B.getValue()).booleanValue() && ((Boolean) this.C.getValue()).booleanValue();
                Object objQ8 = rVar2.Q();
                if (objQ8 == fVar) {
                    final int i = 0;
                    objQ8 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.a0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    androidx.compose.ui.focus.y.a(yVar2);
                                    break;
                                default:
                                    androidx.compose.ui.focus.y.a(yVar2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    rVar2.l0(objQ8);
                }
                _COROUTINE.a.d(lVar, lVar2, lVar3, lVar4, lVar5, qVar, lVar6, z, (kotlin.jvm.functions.a) objQ8, null, rVar2, 100663296);
                break;
            case 1:
                androidx.navigation.y yVar3 = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar3 = (kotlin.jvm.functions.r) this.z;
                y0 y0Var2 = (y0) this.A;
                final androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH7 = rVar4.h(yVar3);
                Object objQ9 = rVar4.Q();
                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                if (zH7 || objQ9 == fVar2) {
                    objQ9 = new d(yVar3, y0Var2, 21);
                    rVar4.l0(objQ9);
                }
                kotlin.jvm.functions.l lVar7 = (kotlin.jvm.functions.l) objQ9;
                boolean zH8 = rVar4.h(yVar3);
                Object objQ10 = rVar4.Q();
                if (zH8 || objQ10 == fVar2) {
                    objQ10 = new d(yVar3, y0Var2, 22);
                    rVar4.l0(objQ10);
                }
                kotlin.jvm.functions.l lVar8 = (kotlin.jvm.functions.l) objQ10;
                boolean zH9 = rVar4.h(yVar3);
                Object objQ11 = rVar4.Q();
                if (zH9 || objQ11 == fVar2) {
                    objQ11 = new d(yVar3, y0Var2, 23);
                    rVar4.l0(objQ11);
                }
                kotlin.jvm.functions.l lVar9 = (kotlin.jvm.functions.l) objQ11;
                boolean zF2 = rVar4.f(rVar3);
                Object objQ12 = rVar4.Q();
                if (zF2 || objQ12 == fVar2) {
                    objQ12 = new k(2, rVar3);
                    rVar4.l0(objQ12);
                }
                kotlin.jvm.functions.r rVar5 = (kotlin.jvm.functions.r) objQ12;
                boolean zH10 = rVar4.h(yVar3);
                Object objQ13 = rVar4.Q();
                if (zH10 || objQ13 == fVar2) {
                    objQ13 = new d(yVar3, y0Var2, 24);
                    rVar4.l0(objQ13);
                }
                kotlin.jvm.functions.l lVar10 = (kotlin.jvm.functions.l) objQ13;
                boolean z2 = ((Boolean) this.B.getValue()).booleanValue() && ((Boolean) this.C.getValue()).booleanValue();
                Object objQ14 = rVar4.Q();
                if (objQ14 == fVar2) {
                    final int i2 = 1;
                    objQ14 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.a0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    androidx.compose.ui.focus.y.a(yVar4);
                                    break;
                                default:
                                    androidx.compose.ui.focus.y.a(yVar4);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    rVar4.l0(objQ14);
                }
                com.app.mlounge.ui.screens.history.a.a(lVar7, lVar8, lVar9, rVar5, lVar10, z2, (kotlin.jvm.functions.a) objQ14, null, rVar4, 1572864);
                break;
            default:
                x1 x1Var = (x1) this.y;
                kotlin.jvm.functions.l lVar11 = (kotlin.jvm.functions.l) this.z;
                t2 t2Var = (t2) this.D;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= rVar6.d(iIntValue) ? 32 : 16;
                }
                if (rVar6.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) ((List) this.B.getValue()).get(iIntValue);
                    Integer num = (Integer) ((Map) this.C.getValue()).get(Integer.valueOf(tmdbTvShow.b()));
                    int iIntValue3 = num != null ? num.intValue() : 0;
                    Integer numD = (Integer) ((Map) this.A.getValue()).get(Integer.valueOf(tmdbTvShow.b()));
                    if (numD == null) {
                        numD = tmdbTvShow.d();
                    }
                    boolean z3 = numD != null && numD.intValue() > 0 && iIntValue3 >= numD.intValue();
                    boolean z4 = iIntValue3 > 0 && !z3;
                    String strC = tmdbTvShow.c();
                    if (strC == null) {
                        strC = "Unknown";
                    }
                    String strF = tmdbTvShow.f();
                    x1Var.b.getClass();
                    String strB = com.app.mlounge.data.repository.j0.b(strF, "w500");
                    Double dG = tmdbTvShow.g();
                    String strA = tmdbTvShow.a();
                    String strY0 = strA != null ? kotlin.text.k.y0(4, strA) : null;
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_tv_placeholder, rVar6);
                    Float f = (Float) ((Map) t2Var.getValue()).get("movie:" + tmdbTvShow.b());
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    boolean zF3 = rVar6.f(lVar11) | rVar6.h(tmdbTvShow);
                    Object objQ15 = rVar6.Q();
                    if (zF3 || objQ15 == androidx.compose.runtime.m.a) {
                        objQ15 = new com.app.mlounge.ui.screens.movies.g(13, lVar11, tmdbTvShow);
                        rVar6.l0(objQ15);
                    }
                    com.app.mlounge.ui.components.b0.h(strC, strB, (kotlin.jvm.functions.a) objQ15, null, dG, strY0, null, null, bVarQ, fFloatValue, z3, z4, 0.0f, null, rVar6, 134217728, 0, 12488);
                } else {
                    rVar6.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o(androidx.navigation.y yVar, kotlin.jvm.functions.r rVar, y0 y0Var, t2 t2Var, t2 t2Var2, androidx.compose.ui.focus.y yVar2, int i) {
        this.e = i;
        this.y = yVar;
        this.z = rVar;
        this.A = y0Var;
        this.B = t2Var;
        this.C = t2Var2;
        this.D = yVar2;
    }
}
