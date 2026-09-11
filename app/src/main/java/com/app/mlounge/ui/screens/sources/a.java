package com.app.mlounge.ui.screens.sources;

import android.content.Context;
import androidx.activity.compose.i;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.r0;
import androidx.compose.foundation.s;
import androidx.compose.foundation.shape.e;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.t2;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.draw.h;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.j;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.screens.player.v;
import com.app.mlounge.ui.viewmodel.r1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.w;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(-1741442298, false, new com.app.mlounge.ui.screens.settings.a(10));
    public static final f b = new f(-2080977553, false, new com.app.mlounge.ui.screens.search.a(23));
    public static final f c = new f(-1830133351, false, new com.app.mlounge.ui.screens.search.a(24));
    public static final f d = new f(-805600161, false, new com.app.mlounge.ui.screens.settings.a(11));

    public static final void a(List list, l lVar, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(-1522015970);
        int i2 = (rVar.h(list) ? 4 : 2) | i | (rVar.h(lVar) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            t1.a(aVar, null, k.c(-799520729, new v(list, aVar, lVar, 2), rVar), rVar, ((i2 >> 6) & 14) | 384, 2);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v(list, lVar, aVar, i, 3);
        }
    }

    public static final void b(ChqStream chqStream, boolean z, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(-1174766216);
        int i2 = (rVar.h(chqStream) ? 4 : 2) | i | (rVar.g(z) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            androidx.compose.ui.r rVarG = s.g(h.a(w0.d(o.b, 1.0f), e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, e.a(f));
            boolean z2 = (i2 & 896) == 256;
            Object objQ2 = rVar.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new j2(19, aVar);
                rVar.l0(objQ2);
            }
            f3.a(s.m(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, k.c(-521817987, new i(z, chqStream), rVar), rVar, 12583296, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.movies.c(chqStream, z, aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static final void c(kotlin.jvm.functions.a aVar, w wVar, r1 r1Var, r rVar, int i) {
        r1 r1Var2;
        r1 r1Var3;
        int i2;
        r1 r1Var4;
        String str;
        r1 r1Var5;
        int i3;
        y0 y0Var;
        ?? r0;
        androidx.compose.runtime.f fVar;
        y yVar;
        y yVar2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.foundation.layout.c cVar;
        androidx.compose.ui.node.e eVar3;
        j0 j0Var;
        u2 u2Var;
        y yVar3;
        d dVar;
        androidx.compose.ui.node.e eVar4;
        androidx.compose.runtime.f fVar2;
        boolean z;
        j jVar;
        r1 r1Var6;
        androidx.compose.ui.node.e eVar5;
        androidx.compose.ui.node.e eVar6;
        androidx.compose.ui.node.e eVar7;
        d dVar2;
        androidx.compose.ui.node.e eVar8;
        androidx.compose.foundation.layout.c cVar2;
        androidx.compose.runtime.f fVar3;
        a0 a0Var;
        boolean z2;
        boolean z3;
        y yVar4;
        Object r0Var;
        r rVar2 = rVar;
        androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
        j jVar2 = androidx.compose.ui.c.B;
        aVar.getClass();
        wVar.getClass();
        rVar2.c0(1075398829);
        int i4 = 16;
        int i5 = i | (rVar2.h(aVar) ? 4 : 2) | (rVar2.h(wVar) ? 32 : 16) | 128;
        if (rVar2.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                androidx.lifecycle.w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    r1Var3 = (r1) h1.B(kotlin.jvm.internal.a0.a(r1.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                    i2 = i5 & (-897);
                }
            } else {
                rVar2.W();
                i2 = i5 & (-897);
                r1Var3 = r1Var;
            }
            int i6 = i2;
            rVar2.q();
            y0 y0VarG = androidx.compose.runtime.s.g(r1Var3.i, rVar2);
            y0 y0VarG2 = androidx.compose.runtime.s.g(r1Var3.k, rVar2);
            y0 y0VarG3 = androidx.compose.runtime.s.g(r1Var3.m, rVar2);
            y0 y0VarG4 = androidx.compose.runtime.s.g(r1Var3.o, rVar2);
            String str2 = r1Var3.u;
            boolean zA = kotlin.jvm.internal.l.a(r1Var3.x, "download");
            Context context = (Context) rVar2.j(m0.b);
            boolean zH = rVar2.h(r1Var3) | ((i6 & Token.ASSIGN_MOD) == 32);
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar4 = m.a;
            kotlin.coroutines.d dVar3 = null;
            if (zH || objQ == fVar4) {
                objQ = new androidx.room.coroutines.f(r1Var3, wVar, dVar3, i4);
                rVar2.l0(objQ);
            }
            kotlin.y yVar5 = kotlin.y.a;
            androidx.compose.runtime.j0.c(rVar2, yVar5, (p) objQ);
            boolean zH2 = rVar2.h(r1Var3) | rVar2.h(context);
            Object objQ2 = rVar2.Q();
            if (zH2 || objQ2 == fVar4) {
                objQ2 = new androidx.room.coroutines.f(r1Var3, context, dVar3, 17);
                rVar2.l0(objQ2);
            }
            androidx.compose.runtime.j0.c(rVar2, yVar5, (p) objQ2);
            if (((com.app.mlounge.ui.viewmodel.m) y0VarG4.getValue()).d) {
                rVar2.b0(1046616501);
                List list = ((com.app.mlounge.ui.viewmodel.m) y0VarG4.getValue()).f;
                boolean zH3 = rVar2.h(r1Var3);
                Object objQ3 = rVar2.Q();
                if (zH3 || objQ3 == fVar4) {
                    objQ3 = new androidx.compose.ui.text.font.e(r1Var3, 14);
                    rVar2.l0(objQ3);
                }
                l lVar = (l) objQ3;
                boolean zH4 = rVar2.h(r1Var3);
                Object objQ4 = rVar2.Q();
                if (zH4 || objQ4 == fVar4) {
                    str = str2;
                    r1 r1Var7 = r1Var3;
                    r0Var = new r0(0, r1Var7, r1.class, "dismissDebridPicker", "dismissDebridPicker()V", 0, 10);
                    r1Var4 = r1Var7;
                    rVar2.l0(r0Var);
                } else {
                    str = str2;
                    r0Var = objQ4;
                    r1Var4 = r1Var3;
                }
                a(list, lVar, (kotlin.jvm.functions.a) ((kotlin.reflect.e) r0Var), rVar2, 0);
                rVar2.p(false);
            } else {
                r1Var4 = r1Var3;
                str = str2;
                rVar2.b0(1046831765);
                rVar2.p(false);
            }
            String str3 = ((com.app.mlounge.ui.viewmodel.m) y0VarG4.getValue()).b;
            if (str3 == null) {
                rVar2.b0(1046899065);
                rVar2.p(false);
                y0Var = y0VarG;
                fVar = fVar4;
                r1Var5 = r1Var4;
                i3 = 14;
                r0 = 0;
            } else {
                rVar2.b0(1046899066);
                long j = com.app.mlounge.ui.theme.b.d;
                boolean zH5 = rVar2.h(r1Var4);
                Object objQ5 = rVar2.Q();
                if (zH5 || objQ5 == fVar4) {
                    objQ5 = new b(r1Var4, 1);
                    rVar2.l0(objQ5);
                }
                r1Var5 = r1Var4;
                i3 = 14;
                y0Var = y0VarG;
                r0 = 0;
                fVar = fVar4;
                t2.a((kotlin.jvm.functions.a) objQ5, k.c(838136355, new g0(r1Var4, 24), rVar2), null, null, k.c(1812283807, new androidx.compose.material3.m(y0VarG4, 11), rVar2), k.c(2055820670, new com.app.mlounge.ui.components.s(str3, 14), rVar2), null, j, 0L, 0L, 0L, 0.0f, null, rVar, 102432816, 0, 16028);
                rVar2 = rVar;
                rVar2.p(false);
            }
            a0 a0Var2 = w0.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, r0);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var2);
            g.b.getClass();
            y yVar6 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar6);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, q0VarD, eVar9);
            androidx.compose.ui.node.e eVar10 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar10);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar11 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar11);
            d dVar4 = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar2, dVar4);
            androidx.compose.ui.node.e eVar12 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar12);
            long j2 = com.app.mlounge.ui.theme.b.a;
            j0 j0Var2 = androidx.compose.ui.graphics.a0.b;
            androidx.compose.ui.r rVarF = s.f(a0Var2, j2, j0Var2);
            androidx.compose.foundation.layout.c cVar3 = androidx.compose.foundation.layout.h.c;
            androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(cVar3, hVar2, rVar2, r0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarF);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar6);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, eVar9);
            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar11, rVar2, dVar4);
            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar12);
            o oVar = o.b;
            androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
            androidx.compose.runtime.f fVar5 = fVar;
            long j3 = com.app.mlounge.ui.theme.b.b;
            float f = 8;
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(s.f(rVarD, j3, j0Var2), f);
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, iVar, rVar2, 48);
            int iHashCode3 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, rVarO);
            rVar2.e0();
            if (rVar2.S) {
                yVar = yVar6;
                rVar2.k(yVar);
            } else {
                yVar = yVar6;
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar9);
            androidx.compose.runtime.s.x(rVar2, jVarL3, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar11, rVar2, dVar4);
            androidx.compose.runtime.s.x(rVar2, rVarC3, eVar12);
            Object objQ6 = rVar2.Q();
            if (objQ6 == fVar5) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ6;
            y0 y0VarG5 = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            androidx.compose.foundation.shape.d dVar5 = e.a;
            float f2 = 2;
            y yVar7 = yVar;
            t2.e(aVar, s.g(h.a(oVar, dVar5), f2, ((Boolean) y0VarG5.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, dVar5), false, null, kVar, null, b, rVar, 1597440 | (i6 & 14), 44);
            androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, f));
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            h0 h0Var = new h0(1.0f, true);
            androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(cVar3, hVar2, rVar, 0);
            int iHashCode4 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL4 = rVar.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, h0Var);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar7);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA2, eVar9);
            androidx.compose.runtime.s.x(rVar, jVarL4, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar11, rVar, dVar4);
            androidx.compose.runtime.s.x(rVar, rVarC4, eVar12);
            String str4 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r4v27 'str4' java.lang.String) = ((r76v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])) ? ("Download Sources") : ("Sources") in method: com.app.mlounge.ui.screens.sources.a.c(kotlin.jvm.functions.a, kotlin.jvm.functions.w, com.app.mlounge.ui.viewmodel.r1, androidx.compose.runtime.r, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r76v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2951
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.sources.a.c(kotlin.jvm.functions.a, kotlin.jvm.functions.w, com.app.mlounge.ui.viewmodel.r1, androidx.compose.runtime.r, int):void");
        }

        public static final boolean d(y0 y0Var) {
            return ((Boolean) y0Var.getValue()).booleanValue();
        }
    }
