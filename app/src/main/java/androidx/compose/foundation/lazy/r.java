package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.n1;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.lazy.layout.f0;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.m1;
import androidx.compose.ui.layout.r0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements androidx.compose.foundation.lazy.layout.c0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ kotlin.jvm.functions.a d;
    public final /* synthetic */ androidx.compose.foundation.layout.g e;
    public final /* synthetic */ androidx.compose.foundation.layout.e f;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ f0 h;
    public final /* synthetic */ androidx.compose.ui.d i;
    public final /* synthetic */ androidx.compose.ui.i j;

    public r(z zVar, boolean z, m0 m0Var, kotlin.reflect.h hVar, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, CoroutineScope coroutineScope, androidx.compose.ui.graphics.y yVar, f0 f0Var, androidx.compose.ui.d dVar, androidx.compose.ui.i iVar) {
        this.a = zVar;
        this.b = z;
        this.c = m0Var;
        this.d = hVar;
        this.e = gVar;
        this.f = eVar;
        this.g = coroutineScope;
        this.h = f0Var;
        this.i = dVar;
        this.j = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:298:0x068e  */
    /* JADX WARN: Code duplicated, block: B:312:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:322:0x0706  */
    @Override // androidx.compose.foundation.lazy.layout.c0
    public final r0 a(d0 d0Var, long j) throws Throwable {
        float fA;
        z zVar;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        u uVar;
        float f;
        List arrayList;
        int i7;
        float f2;
        ArrayList arrayList2;
        u uVar2;
        int i8;
        Integer numValueOf;
        Integer numValueOf2;
        t tVar;
        m1 m1Var;
        int i9;
        boolean zA = androidx.compose.ui.unit.l.a(0L, 0L);
        m1 m1Var2 = d0Var.y;
        z zVar2 = this.a;
        zVar2.s.getValue();
        boolean z = zVar2.b || m1Var2.U();
        k1 k1Var = k1.y;
        k1 k1Var2 = k1.e;
        boolean z2 = this.b;
        androidx.compose.foundation.s.h(j, z2 ? k1Var2 : k1Var);
        m0 m0Var = this.c;
        int iG0 = z2 ? m1Var2.g0(m0Var.a(m1Var2.getLayoutDirection())) : m1Var2.g0(androidx.compose.foundation.layout.b.i(m0Var, m1Var2.getLayoutDirection()));
        int iG1 = z2 ? m1Var2.g0(m0Var.b(m1Var2.getLayoutDirection())) : m1Var2.g0(androidx.compose.foundation.layout.b.h(m0Var, m1Var2.getLayoutDirection()));
        int iG2 = m1Var2.g0(m0Var.b);
        int iG3 = m1Var2.g0(m0Var.d) + iG2;
        int i10 = iG0 + iG1;
        int i11 = z2 ? iG3 : i10;
        int i12 = z2 ? iG2 : !z2 ? iG0 : iG1;
        int i13 = i11 - i12;
        long jI = androidx.compose.ui.unit.b.i(-i10, -iG3, j);
        m mVar = (m) this.d.invoke();
        d dVar = mVar.c;
        int iH = androidx.compose.ui.unit.a.h(jI);
        int iG = androidx.compose.ui.unit.a.g(jI);
        dVar.a.h(iH);
        dVar.b.h(iG);
        androidx.compose.foundation.layout.e eVar = this.f;
        androidx.compose.foundation.layout.g gVar = this.e;
        if (z2) {
            if (gVar == null) {
                androidx.compose.foundation.internal.b.b("null verticalArrangement when isVertical == true");
                com.google.gson.b.b();
                return null;
            }
            fA = gVar.a();
        } else {
            if (eVar == null) {
                androidx.compose.foundation.internal.b.b("null horizontalAlignment when isVertical == false");
                com.google.gson.b.b();
                return null;
            }
            fA = eVar.a();
        }
        int iG4 = m1Var2.g0(fA);
        int iA = mVar.a();
        int iG5 = z2 ? androidx.compose.ui.unit.a.g(j) - iG3 : androidx.compose.ui.unit.a.h(j) - i10;
        int i14 = i12;
        q qVar = new q(jI, this.b, mVar, d0Var, iA, iG4, this.i, this.j, i14, i13, (((long) iG0) << 32) | (((long) iG2) & 4294967295L), this.a);
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            int iG6 = zVar2.g();
            v vVar = zVar2.e;
            int i15 = androidx.compose.foundation.lazy.layout.m.i(mVar, vVar.e, iG6);
            if (iG6 != i15) {
                vVar.b.h(i15);
                vVar.f.b(iG6);
            }
            int iH2 = zVar2.h();
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            List listG = androidx.compose.foundation.lazy.layout.m.g(mVar, zVar2.r, zVar2.o);
            float fFloatValue = (m1Var2.U() || !z) ? zVar2.h : ((Number) zVar2.w.b.y.getValue()).floatValue();
            androidx.compose.foundation.lazy.layout.v vVar2 = zVar2.n;
            boolean zU = m1Var2.U();
            y0 y0Var = zVar2.v;
            if (i14 < 0) {
                androidx.compose.foundation.internal.b.a("invalid beforeContentPadding");
            }
            if (i13 < 0) {
                androidx.compose.foundation.internal.b.a("invalid afterContentPadding");
            }
            kotlin.collections.v vVar3 = kotlin.collections.v.e;
            m mVar2 = qVar.y;
            int i16 = iA;
            CoroutineScope coroutineScope = this.g;
            kotlin.collections.u uVar3 = kotlin.collections.u.e;
            if (i16 <= 0) {
                int iJ = androidx.compose.ui.unit.a.j(jI);
                int i17 = androidx.compose.ui.unit.a.i(jI);
                vVar2.c(iJ, i17, new ArrayList(), mVar2.d, qVar, zU, 1, z, 0, 0);
                if (!zU) {
                    vVar2.b();
                    if (!zA) {
                        iJ = androidx.compose.ui.unit.b.g((int) 0, jI);
                        i17 = androidx.compose.ui.unit.b.f((int) 0, jI);
                    }
                }
                m1Var = m1Var2;
                tVar = new t(null, 0, false, 0.0f, m1Var2.q(androidx.compose.ui.unit.b.g(iJ + i10, j), androidx.compose.ui.unit.b.f(i17 + iG3, j), vVar3, new n1(23)), 0.0f, false, coroutineScope, d0Var, qVar.A, uVar3, -i14, iG5 + i13, 0, z2 ? k1Var2 : k1Var, i13, iG4);
                zVar = zVar2;
            } else {
                zVar = zVar2;
                if (i15 >= i16) {
                    i15 = i16 - 1;
                    iH2 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i18 = iH2 - iRound;
                if (i15 == 0 && i18 < 0) {
                    iRound += i18;
                    i18 = 0;
                }
                kotlin.collections.k kVar = new kotlin.collections.k();
                int i19 = -i14;
                int i20 = i15;
                int i21 = i19 + (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0266: ARITH (r0v12 'i21' int) = (r15v3 'i19' int) + (wrap int:?: TERNARY null = ((r2v9 int) < (0 int)) ? (r2v9 int) : (0 int)) A[DECLARE_VAR] (LINE:615) in method: androidx.compose.foundation.lazy.r.a(androidx.compose.foundation.lazy.layout.d0, long):androidx.compose.ui.layout.r0, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v9 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1952
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.r.a(androidx.compose.foundation.lazy.layout.d0, long):androidx.compose.ui.layout.r0");
            }
        }
