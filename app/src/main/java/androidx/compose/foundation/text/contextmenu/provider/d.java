package androidx.compose.foundation.text.contextmenu.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.n;
import androidx.compose.material3.f1;
import androidx.compose.material3.j1;
import androidx.compose.material3.j2;
import androidx.compose.material3.n0;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.z2;
import androidx.compose.runtime.internal.j;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.player.i0;
import com.app.mlounge.ui.screens.settings.e0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(n0 n0Var, z2 z2Var, t3 t3Var, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 1;
        this.z = n0Var;
        this.A = z2Var;
        this.B = t3Var;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Iterator it;
        boolean z;
        androidx.compose.runtime.f fVar;
        o oVar;
        i iVar;
        h hVar;
        r rVar;
        i iVar2;
        int i2 = this.e;
        androidx.compose.runtime.f fVar2 = m.a;
        y yVar = y.a;
        Object obj3 = this.B;
        Object obj4 = this.y;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (i2) {
            case 0:
                androidx.compose.ui.r rVar2 = (androidx.compose.ui.r) obj6;
                y0 y0Var = (y0) obj5;
                androidx.compose.runtime.internal.f fVar3 = (androidx.compose.runtime.internal.f) obj4;
                c cVar = (c) obj3;
                r rVar3 = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!rVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar3.W();
                } else {
                    Object objQ = rVar3.Q();
                    if (objQ == fVar2) {
                        objQ = new h2(y0Var, 4);
                        rVar3.l0(objQ);
                    }
                    androidx.compose.ui.r rVarL = a0.l(rVar2, (l) objQ);
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(rVar3.T);
                    j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarL);
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
                    fVar3.invoke(rVar3, 0);
                    Object objQ2 = rVar3.Q();
                    if (objQ2 == fVar2) {
                        i = 6;
                        objQ2 = new n(y0Var, 6);
                        rVar3.l0(objQ2);
                    } else {
                        i = 6;
                    }
                    cVar.b((kotlin.jvm.functions.a) objQ2, rVar3, i);
                    rVar3.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                j1.b((n0) obj6, (z2) obj5, (t3) obj3, (androidx.compose.runtime.internal.f) obj4, (r) obj, s.A(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b0.a((List) obj5, (String) obj4, (l) obj3, (androidx.compose.ui.r) obj6, (r) obj, s.A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.b((List) obj6, (Map) obj5, (l) obj4, (l) obj3, (r) obj, s.A(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.movies.a.a((String) obj6, (String) obj5, (String) obj4, (kotlin.jvm.functions.a) obj3, (r) obj, s.A(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                i0.d((String) obj5, (androidx.compose.ui.graphics.vector.f) obj4, (androidx.compose.ui.r) obj6, (kotlin.jvm.functions.a) obj3, (r) obj, s.A(7));
                break;
            case 6:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj6;
                p pVar = (p) obj5;
                PackageManager packageManager = (PackageManager) obj4;
                Context context = (Context) obj3;
                r rVar4 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i iVar3 = androidx.compose.ui.c.H;
                h hVar2 = androidx.compose.ui.c.J;
                if (!rVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar4.W();
                } else {
                    b2 b2VarO = androidx.compose.foundation.s.o(rVar4);
                    o oVar2 = o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(oVar2, b2VarO, true);
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, hVar2, rVar4, 0);
                    int iHashCode2 = Long.hashCode(rVar4.T);
                    j jVarL2 = rVar4.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar4, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar3);
                    } else {
                        rVar4.o0();
                    }
                    s.x(rVar4, vVarA, androidx.compose.ui.node.f.e);
                    s.x(rVar4, jVarL2, androidx.compose.ui.node.f.d);
                    s.p(rVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    s.t(rVar4, androidx.compose.ui.node.f.g);
                    s.x(rVar4, rVarC2, androidx.compose.ui.node.f.c);
                    rVar4.b0(265554837);
                    Iterator it2 = e0.b.iterator();
                    while (true) {
                        h hVar3 = hVar2;
                        if (!it2.hasNext()) {
                            o oVar3 = oVar2;
                            kotlin.jvm.functions.a aVar2 = aVar;
                            i iVar4 = iVar3;
                            r rVar5 = rVar4;
                            androidx.compose.runtime.f fVar4 = fVar2;
                            rVar5.p(false);
                            float f = 4;
                            t2.d(androidx.compose.foundation.layout.b.q(oVar3, 0.0f, f, 1), 0.0f, com.app.mlounge.ui.theme.b.e, rVar5, 6, 2);
                            Object objQ3 = rVar5.Q();
                            if (objQ3 == fVar4) {
                                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar5);
                            }
                            k kVar = (k) objQ3;
                            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(w0.d(oVar3, 1.0f), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean zF = rVar5.f(aVar2);
                            Object objQ4 = rVar5.Q();
                            if (zF || objQ4 == fVar4) {
                                objQ4 = new j2(14, aVar2);
                                rVar5.l0(objQ4);
                            }
                            float f2 = 12;
                            androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar, 1), f, f2);
                            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, iVar4, rVar5, 48);
                            int iHashCode3 = Long.hashCode(rVar5.T);
                            j jVarL3 = rVar5.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar5, rVarP2);
                            androidx.compose.ui.node.g.b.getClass();
                            androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                            rVar5.e0();
                            if (rVar5.S) {
                                rVar5.k(yVar4);
                            } else {
                                rVar5.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                            s.x(rVar5, t0VarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                            s.x(rVar5, jVarL3, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode3);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                            s.p(rVar5, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                            s.t(rVar5, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                            s.x(rVar5, rVarC3, eVar4);
                            androidx.compose.ui.graphics.vector.f fVarB = androidx.room.r.a;
                            if (fVarB == null) {
                                androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.AppShortcut", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i3 = h0.a;
                                long j = androidx.compose.ui.graphics.t.b;
                                p0 p0Var = new p0(j);
                                androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                gVar.o(17.0f, 18.0f);
                                gVar.k(7.0f);
                                gVar.r(6.0f);
                                gVar.l(10.0f);
                                gVar.s(1.0f);
                                gVar.l(2.0f);
                                gVar.r(3.0f);
                                gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                gVar.k(7.0f);
                                gVar.g(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
                                gVar.s(18.0f);
                                gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                gVar.l(10.0f);
                                gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                gVar.s(-4.0f);
                                gVar.l(-2.0f);
                                gVar.r(18.0f);
                                gVar.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var);
                                p0 p0Var2 = new p0(j);
                                androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                                gVar2.o(20.38f, 9.62f);
                                gVar2.n(0.62f, 1.38f);
                                gVar2.n(0.62f, -1.38f);
                                gVar2.n(1.38f, -0.62f);
                                gVar2.n(-1.38f, -0.62f);
                                gVar2.n(-0.62f, -1.38f);
                                gVar2.n(-0.62f, 1.38f);
                                gVar2.n(-1.38f, 0.62f);
                                gVar2.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar2.a, 0, p0Var2);
                                p0 p0Var3 = new p0(j);
                                androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                                gVar3.o(16.0f, 8.0f);
                                gVar3.n(-1.25f, 2.75f);
                                gVar3.n(-2.75f, 1.25f);
                                gVar3.n(2.75f, 1.25f);
                                gVar3.n(1.25f, 2.75f);
                                gVar3.n(1.25f, -2.75f);
                                gVar3.n(2.75f, -1.25f);
                                gVar3.n(-2.75f, -1.25f);
                                gVar3.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar3.a, 0, p0Var3);
                                p0 p0Var4 = new p0(j);
                                androidx.compose.ui.graphics.vector.g gVar4 = new androidx.compose.ui.graphics.vector.g(0);
                                gVar4.o(21.0f, 13.0f);
                                gVar4.n(-0.62f, 1.38f);
                                gVar4.n(-1.38f, 0.62f);
                                gVar4.n(1.38f, 0.62f);
                                gVar4.n(0.62f, 1.38f);
                                gVar4.n(0.62f, -1.38f);
                                gVar4.n(1.38f, -0.62f);
                                gVar4.n(-1.38f, -0.62f);
                                gVar4.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar4.a, 0, p0Var4);
                                fVarB = eVar5.b();
                                androidx.room.r.a = fVarB;
                            }
                            f1.b(fVarB, null, w0.l(oVar3, 24), com.app.mlounge.ui.theme.b.f, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x07c5: INVOKE 
                                  (r0v19 'fVarB' androidx.compose.ui.graphics.vector.f)
                                  (null java.lang.String)
                                  (wrap androidx.compose.ui.r:0x07bc: INVOKE (r6v12 'oVar3' androidx.compose.ui.o), (24 int) STATIC call: androidx.compose.foundation.layout.w0.l(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:1981))
                                  (wrap long:0x07b7: SGET  A[WRAPPED] (LINE:1976) com.app.mlounge.ui.theme.b.f long)
                                  (r14v7 ?? I:??[OBJECT, ARRAY])
                                  (432 int)
                                  (0 int)
                                 STATIC call: androidx.compose.material3.f1.b(androidx.compose.ui.graphics.vector.f, java.lang.String, androidx.compose.ui.r, long, androidx.compose.runtime.r, int, int):void A[MD:(androidx.compose.ui.graphics.vector.f, java.lang.String, androidx.compose.ui.r, long, androidx.compose.runtime.r, int, int):void (m)] (LINE:1990) in method: androidx.compose.foundation.text.contextmenu.provider.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v7 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 2544
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.provider.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
                            this.e = i;
                            this.z = obj;
                            this.A = obj2;
                            this.y = obj3;
                            this.B = obj4;
                        }

                        public /* synthetic */ d(Object obj, Object obj2, Object obj3, kotlin.d dVar, int i, int i2) {
                            this.e = i2;
                            this.z = obj;
                            this.A = obj2;
                            this.y = obj3;
                            this.B = dVar;
                        }

                        public /* synthetic */ d(String str, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, int i) {
                            this.e = 5;
                            this.A = str;
                            this.y = fVar;
                            this.z = rVar;
                            this.B = aVar;
                        }

                        public /* synthetic */ d(List list, String str, l lVar, androidx.compose.ui.r rVar, int i) {
                            this.e = 2;
                            this.A = list;
                            this.y = str;
                            this.B = lVar;
                            this.z = rVar;
                        }
                    }
