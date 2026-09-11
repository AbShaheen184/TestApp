package com.app.mlounge.ui.screens.anime;

import androidx.compose.animation.core.i0;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.c0;
import androidx.compose.foundation.lazy.z;
import androidx.compose.material3.f3;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.text.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.w0;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.repository.x;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.flow.FlowKt;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(1049527750, false, new n(0));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(-1642812827, false, new androidx.compose.foundation.contextmenu.b(9));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(1269196283, false, new androidx.compose.foundation.contextmenu.b(10));

    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.r, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v56 */
    public static final void a(final String str, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.l lVar, final q qVar, final r rVar, com.app.mlounge.ui.viewmodel.g gVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        com.app.mlounge.ui.viewmodel.g gVar2;
        final com.app.mlounge.ui.viewmodel.g gVar3;
        Object eVar;
        androidx.compose.runtime.f fVar;
        y0 y0Var;
        androidx.compose.runtime.r rVar3;
        final com.app.mlounge.ui.viewmodel.g gVar4;
        kotlin.coroutines.d dVar;
        y0 y0Var2;
        ?? r3;
        boolean z;
        final com.app.mlounge.ui.viewmodel.g gVar5;
        int i4;
        androidx.compose.runtime.r rVar4 = rVar2;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        qVar.getClass();
        rVar.getClass();
        rVar4.c0(-7504691);
        if ((i & 6) == 0) {
            i3 = (rVar4.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar4.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rVar4.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar4.h(rVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                gVar2 = gVar;
                if (rVar4.h(gVar2)) {
                    i4 = 131072;
                }
                i3 |= i4;
            } else {
                gVar2 = gVar;
            }
            i4 = Parser.ARGC_LIMIT;
            i3 |= i4;
        } else {
            gVar2 = gVar;
        }
        if (rVar4.T(i3 & 1, (73875 & i3) != 73874)) {
            rVar4.Y();
            if ((i & 1) != 0 && !rVar4.C()) {
                rVar4.W();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar4);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    gVar2 = (com.app.mlounge.ui.viewmodel.g) h1.B(a0.a(com.app.mlounge.ui.viewmodel.g.class), w0VarA, androidx.room.r.i(w0VarA, rVar4), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar4);
                    i3 &= -458753;
                }
            }
            com.app.mlounge.ui.viewmodel.g gVar6 = gVar2;
            int i5 = i3;
            rVar4.q();
            y0 y0VarG = s.g(gVar6.u, rVar4);
            y0 y0VarG2 = s.g(gVar6.w, rVar4);
            final y0 y0VarG3 = s.g(gVar6.y, rVar4);
            String strConcat = "anime_movie_".concat(str);
            String strConcat2 = "anime_tv_".concat(str);
            x xVar = gVar6.c;
            y0 y0VarF = s.f(FlowKt.combine(xVar.c(strConcat), xVar.c(strConcat2), new com.app.mlounge.ui.viewmodel.e(3, 0, null)), Boolean.FALSE, null, rVar4, 48, 2);
            final y0 y0VarG4 = s.g(gVar6.d, rVar4);
            final y0 y0VarG5 = s.g(gVar6.e, rVar4);
            z zVarA = c0.a(gVar6.E.g(), gVar6.F.g(), rVar4, 0);
            boolean zF = rVar4.f(zVarA) | rVar4.h(gVar6);
            Object objQ = rVar4.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (zF || objQ == fVar2) {
                objQ = new androidx.room.coroutines.f(zVarA, gVar6, null, 7);
                rVar4.l0(objQ);
            }
            j0.c(rVar4, zVarA, (p) objQ);
            Object objQ2 = rVar4.Q();
            if (objQ2 == fVar2) {
                objQ2 = new y();
                rVar4.l0(objQ2);
            }
            final y yVar = (y) objQ2;
            Object objQ3 = rVar4.Q();
            if (objQ3 == fVar2) {
                objQ3 = new LinkedHashMap();
                rVar4.l0(objQ3);
            }
            Map map = (Map) objQ3;
            HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) y0VarG.getValue();
            boolean zF2 = rVar4.f(y0VarG) | rVar4.h(gVar6);
            Object objQ4 = rVar4.Q();
            if (zF2 || objQ4 == fVar2) {
                fVar = fVar2;
                y0Var = y0VarF;
                rVar3 = rVar4;
                eVar = new com.app.mlounge.ui.screens.adult.e(gVar6, yVar, y0VarG, null, 1);
                gVar4 = gVar6;
                dVar = null;
                y0Var2 = y0VarG;
                rVar3.l0(eVar);
            } else {
                fVar = fVar2;
                y0Var2 = y0VarG;
                gVar4 = gVar6;
                y0Var = y0VarF;
                eVar = objQ4;
                rVar3 = rVar4;
                dVar = null;
            }
            j0.c(rVar3, hiAnimeDetailData, (p) eVar);
            List list = (List) y0VarG3.getValue();
            boolean zF3 = rVar3.f(y0VarG3) | rVar3.h(gVar4) | rVar3.h(map);
            Object objQ5 = rVar3.Q();
            if (zF3 || objQ5 == fVar) {
                com.app.mlounge.ui.viewmodel.g gVar7 = gVar4;
                kotlin.coroutines.d dVar2 = dVar;
                com.app.mlounge.ui.screens.adult.e eVar2 = new com.app.mlounge.ui.screens.adult.e(gVar7, map, y0VarG3, dVar2, 2);
                gVar4 = gVar7;
                r3 = dVar2;
                map = map;
                rVar3.l0(eVar2);
                objQ5 = eVar2;
            } else {
                r3 = dVar;
            }
            j0.c(rVar3, list, (p) objQ5);
            boolean zH = rVar3.h(gVar4) | ((i5 & 14) == 4);
            Object objQ6 = rVar3.Q();
            if (zH || objQ6 == fVar) {
                objQ6 = new androidx.compose.foundation.text.input.internal.k(gVar4, str, r3, 8);
                rVar3.l0(objQ6);
            }
            j0.c(rVar3, str, (p) objQ6);
            boolean zH2 = rVar3.h(gVar4);
            Object objQ7 = rVar3.Q();
            if (zH2 || objQ7 == fVar) {
                objQ7 = new androidx.compose.ui.text.font.e(gVar4, 10);
                rVar3.l0(objQ7);
            }
            j0.b(kotlin.y.a, (kotlin.jvm.functions.l) objQ7, rVar3);
            if (((Boolean) y0VarG2.getValue()).booleanValue() || ((HiAnimeDetailData) y0Var2.getValue()) == null) {
                androidx.compose.runtime.r rVar5 = rVar3;
                final com.app.mlounge.ui.viewmodel.g gVar8 = gVar4;
                rVar5.b0(-231966249);
                b0.n(r3, rVar5, 0);
                rVar5.p(false);
                q1 q1VarT = rVar5.t();
                if (q1VarT != null) {
                    final int i6 = 0;
                    q1VarT.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar8, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar8, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar8, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar8, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            rVar3.b0(-231937419);
            rVar3.p(false);
            final HiAnimeDetailData hiAnimeDetailData2 = (HiAnimeDetailData) y0Var2.getValue();
            hiAnimeDetailData2.getClass();
            HiAnimeAnimeData hiAnimeAnimeDataA = hiAnimeDetailData2.a();
            if (hiAnimeAnimeDataA == null) {
                q1 q1VarT2 = rVar3.t();
                if (q1VarT2 != null) {
                    final int i7 = 1;
                    q1VarT2.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            final HiAnimeInfo hiAnimeInfoA = hiAnimeAnimeDataA.a();
            if (hiAnimeInfoA == null) {
                q1 q1VarT3 = rVar3.t();
                if (q1VarT3 != null) {
                    final int i8 = 2;
                    q1VarT3.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    o.a(str, aVar, lVar, qVar, rVar, gVar4, (androidx.compose.runtime.r) obj, s.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            final HiAnimeMoreInfo hiAnimeMoreInfoB = hiAnimeAnimeDataA.b();
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarL = rVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(yVar2);
            } else {
                rVar3.o0();
            }
            s.x(rVar3, q0VarD, androidx.compose.ui.node.f.e);
            s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
            s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            s.t(rVar3, androidx.compose.ui.node.f.g);
            s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
            String strD = hiAnimeInfoA.d();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f = 320;
            com.app.mlounge.ui.viewmodel.g gVar9 = gVar4;
            final y0 y0Var3 = y0Var;
            androidx.compose.runtime.f fVar3 = fVar;
            final Map map2 = map;
            coil3.compose.k.a(strD, null, androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f), null, androidx.compose.ui.layout.i.a, rVar2, 1573296, 1976);
            androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarF, com.google.android.material.shape.g.l(com.google.common.base.c.q(new t(t.b(0.3f, j)), new t(t.b(0.5f, j)), new t(t.b(0.8f, j)), new t(j)), 0.0f, 0.0f, 14)), rVar2, 6);
            boolean zF4 = rVar2.f(hiAnimeInfoA) | ((i5 & Token.ASSIGN_MOD) == 32) | rVar2.h(hiAnimeMoreInfoB) | rVar2.f(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0403: ARITH (r0v29 'zF4' boolean) = (wrap boolean:0x03f7: ARITH (wrap boolean:0x03f0: ARITH (wrap boolean:0x03e9: ARITH (wrap boolean:0x03e2: ARITH (wrap boolean:0x03db: ARITH (wrap boolean:0x03ce: ARITH (wrap boolean:0x03c9: ARITH (wrap boolean:0x03c4: ARITH (wrap boolean:0x03bf: ARITH (wrap boolean:0x03ba: ARITH (wrap boolean:0x03b6: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r1v3 'hiAnimeInfoA' com.app.mlounge.data.remote.model.HiAnimeInfo) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:951)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03ad: ARITH (r3v12 'i5' int) & (wrap ??:SGET  A[WRAPPED] org.mozilla.javascript.Token.ASSIGN_MOD int) A[WRAPPED] (LINE:942)) == (32 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:955)) | (wrap boolean:0x03bb: INVOKE 
                  (r36v0 'rVar2' androidx.compose.runtime.r)
                  (r2v38 'hiAnimeMoreInfoB' com.app.mlounge.data.remote.model.HiAnimeMoreInfo)
                 VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:956)) A[DONT_WRAP, WRAPPED] (LINE:960)) | (wrap boolean:0x03c0: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r5v6 java.lang.Object) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:961)) A[DONT_WRAP, WRAPPED] (LINE:965)) | (wrap boolean:0x03c5: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r7v18 'gVar9' com.app.mlounge.ui.viewmodel.g) VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:966)) A[DONT_WRAP, WRAPPED] (LINE:970)) | (wrap boolean:0x03ca: INVOKE 
                  (r36v0 'rVar2' androidx.compose.runtime.r)
                  (r8v8 'hiAnimeDetailData2' com.app.mlounge.data.remote.model.HiAnimeDetailData)
                 VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:971)) A[DONT_WRAP, WRAPPED] (LINE:975)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03d2: ARITH (r3v12 'i5' int) & (57344 int) A[WRAPPED] (LINE:979)) == (16384 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:988)) | (wrap boolean:0x03de: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r27v1 'y0Var3' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:991)) A[DONT_WRAP, WRAPPED] (LINE:995)) | (wrap boolean:0x03e5: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r4v13 'y0VarG4' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:998)) A[DONT_WRAP, WRAPPED] (LINE:1002)) | (wrap boolean:0x03ec: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r5v4 'y0VarG5' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1005)) A[DONT_WRAP, WRAPPED] (LINE:1009)) | (wrap boolean:0x03f3: INVOKE (r36v0 'rVar2' androidx.compose.runtime.r), (r16v5 'map2' java.util.Map) VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1012)) A[DONT_WRAP, WRAPPED] (LINE:1016)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03fa: ARITH (r3v12 'i5' int) & (896 int) A[WRAPPED] (LINE:1019)) == (256 int)) ? true : false) A[DECLARE_VAR] (LINE:1028) in method: com.app.mlounge.ui.screens.anime.o.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.r, com.app.mlounge.ui.viewmodel.g, androidx.compose.runtime.r, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v6 java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1178
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.anime.o.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.r, com.app.mlounge.ui.viewmodel.g, androidx.compose.runtime.r, int, int):void");
        }

        public static final void b(kotlin.jvm.functions.l lVar, com.app.mlounge.ui.viewmodel.g gVar, androidx.compose.runtime.r rVar, int i) {
            com.app.mlounge.ui.viewmodel.g gVar2;
            int i2;
            com.app.mlounge.ui.viewmodel.g gVar3;
            com.app.mlounge.ui.viewmodel.g gVar4;
            androidx.compose.runtime.f fVar;
            Object i0Var;
            y0 y0Var;
            boolean z;
            androidx.compose.runtime.r rVar2 = rVar;
            lVar.getClass();
            rVar2.c0(-127353463);
            int i3 = i | (rVar2.h(lVar) ? 4 : 2) | 16;
            if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
                rVar2.Y();
                if ((i & 1) == 0 || rVar2.C()) {
                    w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                    if (w0VarA == null) {
                        net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    } else {
                        i2 = i3 & (-113);
                        gVar3 = (com.app.mlounge.ui.viewmodel.g) h1.B(a0.a(com.app.mlounge.ui.viewmodel.g.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                    }
                } else {
                    rVar2.W();
                    i2 = i3 & (-113);
                    gVar3 = gVar;
                }
                rVar2.q();
                y0 y0VarG = s.g(gVar3.g, rVar2);
                y0 y0VarG2 = s.g(gVar3.i, rVar2);
                y0 y0VarG3 = s.g(gVar3.k, rVar2);
                y0 y0VarG4 = s.g(gVar3.m, rVar2);
                y0 y0VarG5 = s.g(gVar3.o, rVar2);
                y0 y0VarG6 = s.g(gVar3.q, rVar2);
                y0 y0VarG7 = s.g(gVar3.s, rVar2);
                y0 y0VarG8 = s.g(gVar3.d, rVar2);
                androidx.compose.foundation.lazy.grid.x xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, rVar2, 3);
                boolean zF = rVar2.f(xVarA) | rVar2.h(gVar3);
                Object objQ = rVar2.Q();
                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                if (zF || objQ == fVar2) {
                    objQ = new androidx.room.coroutines.f(xVarA, gVar3, null, 8);
                    rVar2.l0(objQ);
                }
                j0.c(rVar2, xVarA, (p) objQ);
                androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
                v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                int iHashCode = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar);
                } else {
                    rVar2.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                s.x(rVar2, vVarA, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                s.x(rVar2, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                s.p(rVar2, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                s.t(rVar2, dVar);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                s.x(rVar2, rVarC, eVar4);
                m0 m0Var = ((t3) rVar2.j(u3.a)).e;
                long j = ((n0) rVar2.j(o0.a)).o;
                float f = 16;
                float f2 = 4;
                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar, f, f, 0.0f, f2, 4);
                androidx.compose.runtime.f fVar3 = fVar2;
                com.app.mlounge.ui.viewmodel.g gVar5 = gVar3;
                boolean z2 = false;
                p3.b("Anime", rVarS, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
                List listQ = com.google.common.base.c.q(new kotlin.k("tv", "TV"), new kotlin.k("movie", "Movies"), new kotlin.k("ova", "OVA"), new kotlin.k("ona", "ONA"), new kotlin.k("special", "Special"));
                androidx.compose.ui.o oVar2 = oVar;
                androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), androidx.compose.foundation.s.o(rVar), false), f, f2);
                float f3 = 8;
                int i4 = 6;
                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f3), androidx.compose.ui.c.G, rVar, 6);
                int iHashCode2 = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.o0();
                }
                s.x(rVar, t0VarA, eVar);
                s.x(rVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                s.x(rVar, rVarC2, eVar4);
                rVar.b0(1356509191);
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    kotlin.k kVar = (kotlin.k) it.next();
                    String str = (String) kVar.e;
                    String str2 = (String) kVar.y;
                    Object objQ2 = rVar.Q();
                    androidx.compose.runtime.f fVar4 = fVar3;
                    if (objQ2 == fVar4) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f3)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar, i4).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f3));
                    com.app.mlounge.ui.viewmodel.g gVar6 = gVar5;
                    boolean zH = rVar.h(gVar6) | rVar.f(str);
                    Object objQ3 = rVar.Q();
                    if (zH || objQ3 == fVar4) {
                        objQ3 = new androidx.activity.compose.f(27, gVar6, str);
                        rVar.l0(objQ3);
                    }
                    fVar3 = fVar4;
                    f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar2, 1), androidx.compose.foundation.shape.e.a(f3), kotlin.jvm.internal.l.a((String) y0VarG7.getValue(), str) ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2002892753, new w1(7, str, str2, y0VarG7), rVar), rVar, 12582912, 120);
                    it = it;
                    i4 = 6;
                    oVar2 = oVar2;
                    gVar5 = gVar6;
                    z2 = false;
                }
                boolean z3 = z2;
                com.app.mlounge.ui.viewmodel.g gVar7 = gVar5;
                androidx.compose.runtime.f fVar5 = fVar3;
                boolean z4 = true;
                rVar.p(z3);
                rVar.p(true);
                List list = (List) y0VarG2.getValue();
                String str3 = (String) y0VarG6.getValue();
                boolean zH2 = rVar.h(gVar7);
                Object objQ4 = rVar.Q();
                if (zH2 || objQ4 == fVar5) {
                    gVar4 = gVar7;
                    fVar = fVar5;
                    androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, gVar4, com.app.mlounge.ui.viewmodel.g.class, "setGenre", "setGenre(Ljava/lang/String;)V", 0, 6);
                    rVar.l0(cVar);
                    objQ4 = cVar;
                } else {
                    gVar4 = gVar7;
                    fVar = fVar5;
                }
                b0.a(list, str3, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ4), null, rVar, 0);
                if (((Boolean) y0VarG3.getValue()).booleanValue() && ((List) y0VarG.getValue()).isEmpty()) {
                    rVar.b0(-342089595);
                    b0.n(null, rVar, 0);
                    rVar.p(false);
                    rVar2 = rVar;
                    gVar4 = gVar4;
                } else if (((String) y0VarG5.getValue()) == null || !((List) y0VarG.getValue()).isEmpty()) {
                    gVar4 = gVar4;
                    rVar.b0(-2014621728);
                    androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode3 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, a0Var2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
                    s.x(rVar, q0VarD, eVar5);
                    androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
                    s.x(rVar, jVarL3, eVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                    s.p(rVar, numValueOf2, eVar7);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                    s.t(rVar, dVar2);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
                    s.x(rVar, rVarC3, eVar8);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f4 = 12;
                    androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f4, f4, f4, f4);
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    boolean zF2 = ((i2 & 14) == 4) | rVar.f(y0VarG) | rVar.f(y0VarG8) | rVar.f(y0VarG4);
                    Object objQ5 = rVar.Q();
                    if (zF2 || objQ5 == fVar) {
                        i0Var = new i0((Object) y0VarG, (Object) lVar, (Object) y0VarG8, (Object) y0VarG4, 6);
                        y0Var = y0VarG;
                        rVar.l0(i0Var);
                    } else {
                        y0Var = y0VarG;
                        i0Var = objQ5;
                    }
                    com.google.android.gms.dynamite.g.a(aVar, a0Var2, xVarA, m0Var2, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) i0Var, rVar, 1772592, 912);
                    rVar2 = rVar;
                    if (!((Boolean) y0VarG3.getValue()).booleanValue() || ((List) y0Var.getValue()).isEmpty()) {
                        z4 = true;
                        z = false;
                        rVar2.b0(1274246038);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(1273950050);
                        z = false;
                        q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode4 = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL4 = rVar2.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar2, a0Var2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(yVar2);
                        } else {
                            rVar2.o0();
                        }
                        s.x(rVar2, q0VarD2, eVar5);
                        s.x(rVar2, jVarL4, eVar6);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar7, rVar2, dVar2);
                        s.x(rVar2, rVarC4, eVar8);
                        o2.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 48, 61);
                        z4 = true;
                        rVar2.p(true);
                        rVar2.p(false);
                    }
                    rVar2.p(z4);
                    rVar2.p(z);
                } else {
                    rVar.b0(-342087278);
                    String str4 = (String) y0VarG5.getValue();
                    str4.getClass();
                    boolean zH3 = rVar.h(gVar4);
                    Object objQ6 = rVar.Q();
                    if (zH3 || objQ6 == fVar) {
                        androidx.compose.foundation.r0 r0Var = new androidx.compose.foundation.r0(0, gVar4, com.app.mlounge.ui.viewmodel.g.class, "loadAnime", "loadAnime()V", 0, 5);
                        rVar.l0(r0Var);
                        objQ6 = r0Var;
                    }
                    b0.i(str4, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), rVar, 0);
                    rVar.p(false);
                    rVar2 = rVar;
                }
                rVar2.p(z4);
                gVar2 = gVar4;
            } else {
                rVar2.W();
                gVar2 = gVar;
            }
            q1 q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, gVar2, i, 16);
            }
        }
    }
