package com.app.mlounge.ui;

import android.os.Bundle;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.w0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.Game;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(kotlin.jvm.functions.p pVar, y0 y0Var, t2 t2Var) {
        this.e = 2;
        this.y = pVar;
        this.A = y0Var;
        this.z = t2Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        String string;
        switch (this.e) {
            case 0:
                androidx.navigation.y yVar = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                y0 y0Var = (y0) this.A;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH = rVar2.h(yVar);
                Object objQ = rVar2.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (zH || objQ == fVar) {
                    objQ = new d(yVar, y0Var, 26);
                    rVar2.l0(objQ);
                }
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
                boolean zH2 = rVar2.h(yVar);
                Object objQ2 = rVar2.Q();
                if (zH2 || objQ2 == fVar) {
                    objQ2 = new d(yVar, y0Var, 27);
                    rVar2.l0(objQ2);
                }
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ2;
                boolean zH3 = rVar2.h(yVar);
                Object objQ3 = rVar2.Q();
                if (zH3 || objQ3 == fVar) {
                    objQ3 = new d(yVar, y0Var, 28);
                    rVar2.l0(objQ3);
                }
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ3;
                boolean zH4 = rVar2.h(yVar);
                Object objQ4 = rVar2.Q();
                if (zH4 || objQ4 == fVar) {
                    objQ4 = new b(yVar, y0Var, 0);
                    rVar2.l0(objQ4);
                }
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) objQ4;
                boolean zF = rVar2.f(rVar);
                Object objQ5 = rVar2.Q();
                if (zF || objQ5 == fVar) {
                    objQ5 = new c(0, rVar);
                    rVar2.l0(objQ5);
                }
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ5;
                boolean zH5 = rVar2.h(yVar);
                Object objQ6 = rVar2.Q();
                if (zH5 || objQ6 == fVar) {
                    objQ6 = new d(yVar, y0Var, 0);
                    rVar2.l0(objQ6);
                }
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ6;
                boolean zH6 = rVar2.h(yVar);
                Object objQ7 = rVar2.Q();
                if (zH6 || objQ7 == fVar) {
                    objQ7 = new d(yVar, y0Var, 1);
                    rVar2.l0(objQ7);
                }
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ7;
                boolean zH7 = rVar2.h(yVar);
                Object objQ8 = rVar2.Q();
                if (zH7 || objQ8 == fVar) {
                    objQ8 = new d(yVar, y0Var, 2);
                    rVar2.l0(objQ8);
                }
                com.app.mlounge.ui.screens.search.b.a(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, (kotlin.jvm.functions.l) objQ8, null, rVar2, 0);
                return kotlin.y.a;
            case 1:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.A;
                androidx.navigation.i iVar = (androidx.navigation.i) obj2;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar.getClass();
                Bundle bundleA = iVar.E.a();
                if (bundleA != null && (string = bundleA.getString("albumUrl")) != null) {
                    w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar3);
                    if (w0VarA == null) {
                        net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) h1.B(kotlin.jvm.internal.a0.a(com.app.mlounge.ui.viewmodel.h0.class), w0VarA, androidx.room.r.i(w0VarA, rVar3), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar3);
                    boolean zH8 = rVar3.h(yVar2);
                    Object objQ9 = rVar3.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                    if (zH8 || objQ9 == fVar2) {
                        objQ9 = new androidx.navigation.k(yVar2, 5);
                        rVar3.l0(objQ9);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ9;
                    boolean zH9 = rVar3.h(coroutineScope) | rVar3.h(h0Var) | rVar3.f(wVar);
                    Object objQ10 = rVar3.Q();
                    if (zH9 || objQ10 == fVar2) {
                        objQ10 = new androidx.compose.animation.core.a(15, coroutineScope, h0Var, wVar);
                        rVar3.l0(objQ10);
                    }
                    com.app.mlounge.ui.screens.music.a.a(string, aVar, (kotlin.jvm.functions.l) objQ10, null, rVar3, 0);
                }
                return kotlin.y.a;
            default:
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                y0 y0Var2 = (y0) this.A;
                t2 t2Var = (t2) this.z;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= rVar4.d(iIntValue) ? 32 : 16;
                }
                if (rVar4.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    Game game = (Game) ((List) t2Var.getValue()).get(iIntValue);
                    String strA = game.a();
                    if (strA == null) {
                        strA = "Unknown";
                    }
                    String strB = game.b();
                    String strD = game.d();
                    String strY0 = strD != null ? kotlin.text.k.y0(4, strD) : null;
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_menu_games, rVar4);
                    boolean zF2 = rVar4.f(pVar2) | rVar4.f(y0Var2) | rVar4.f(game);
                    Object objQ11 = rVar4.Q();
                    if (zF2 || objQ11 == androidx.compose.runtime.m.a) {
                        objQ11 = new androidx.compose.foundation.gestures.g(10, pVar2, game, y0Var2);
                        rVar4.l0(objQ11);
                    }
                    com.app.mlounge.ui.components.b0.h(strA, strB, (kotlin.jvm.functions.a) objQ11, null, null, strY0, null, null, bVarQ, 0.0f, false, false, 0.0f, null, rVar4, 134217728, 0, 16088);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ f(androidx.navigation.y yVar, Object obj, Object obj2, int i) {
        this.e = i;
        this.y = yVar;
        this.z = obj;
        this.A = obj2;
    }
}
