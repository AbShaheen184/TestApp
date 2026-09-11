package com.app.mlounge.ui.screens.music;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.material3.f3;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.h0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(36220684, false, new n(23));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(1410688345, false, new n(24));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(-1385360816, false, new n(25));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(-1749763220, false, new n(26));
    public static final androidx.compose.runtime.internal.f e = new androidx.compose.runtime.internal.f(-1688896939, false, new androidx.compose.foundation.contextmenu.b(16));
    public static final androidx.compose.runtime.internal.f f = new androidx.compose.runtime.internal.f(1101965455, false, new androidx.compose.foundation.contextmenu.b(17));

    public static final void a(String str, kotlin.jvm.functions.a aVar, l lVar, h0 h0Var, r rVar, int i) {
        h0 h0Var2;
        int i2;
        h0 h0Var3;
        y yVar;
        y yVar2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.d dVar;
        y yVar3;
        o oVar;
        androidx.compose.ui.i iVar;
        boolean z;
        o oVar2;
        y yVar4;
        h0 h0Var4;
        r rVar2 = rVar;
        aVar.getClass();
        lVar.getClass();
        rVar2.c0(726675736);
        int i3 = i | (rVar2.f(str) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16) | (rVar2.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (rVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    h0 h0Var5 = (h0) h1.B(a0.a(h0.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                    i2 = i3 & (-7169);
                    h0Var3 = h0Var5;
                }
            } else {
                rVar2.W();
                i2 = i3 & (-7169);
                h0Var3 = h0Var;
            }
            rVar2.q();
            Context context = (Context) rVar2.j(m0.b);
            y0 y0VarG = s.g(h0Var3.y, rVar2);
            y0 y0VarG2 = s.g(h0Var3.i, rVar2);
            String strConcat = "music_album_".concat(str);
            com.app.mlounge.data.repository.a0 a0Var = h0Var3.c;
            a0Var.getClass();
            int i4 = i2;
            y0 y0VarF = s.f(a0Var.a.c(strConcat), Boolean.FALSE, null, rVar, 48, 2);
            rVar2 = rVar;
            int i5 = i4 & 14;
            boolean zH = rVar2.h(h0Var3) | (i5 == 4);
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (zH || objQ == fVar) {
                objQ = new e(h0Var3, str, null, 0);
                rVar2.l0(objQ);
            }
            j0.c(rVar2, str, (p) objQ);
            boolean zH2 = rVar2.h(h0Var3) | rVar2.h(context);
            Object objQ2 = rVar2.Q();
            if (zH2 || objQ2 == fVar) {
                objQ2 = new androidx.room.coroutines.f(h0Var3, context, null, 10);
                rVar2.l0(objQ2);
            }
            kotlin.y yVar5 = kotlin.y.a;
            j0.c(rVar2, yVar5, (p) objQ2);
            boolean zH3 = rVar2.h(h0Var3) | (i5 == 4);
            Object objQ3 = rVar2.Q();
            if (zH3 || objQ3 == fVar) {
                objQ3 = new e(h0Var3, str, null, 1);
                rVar2.l0(objQ3);
            }
            j0.c(rVar2, str, (p) objQ3);
            boolean zH4 = rVar2.h(h0Var3);
            Object objQ4 = rVar2.Q();
            if (zH4 || objQ4 == fVar) {
                objQ4 = new b(h0Var3, 0);
                rVar2.l0(objQ4);
            }
            j0.b(yVar5, (l) objQ4, rVar2);
            if (((Boolean) y0VarG2.getValue()).booleanValue() && ((MusicAlbumDetail) y0VarG.getValue()) == null) {
                rVar2.b0(1762623257);
                b0.n(null, rVar2, 0);
                rVar2.p(false);
                q1 q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new c(str, aVar, lVar, h0Var3, i, 0);
                    return;
                }
                return;
            }
            h0 h0Var6 = h0Var3;
            rVar2.b0(1762670346);
            rVar2.p(false);
            MusicAlbumDetail musicAlbumDetail = (MusicAlbumDetail) y0VarG.getValue();
            if (musicAlbumDetail == null) {
                rVar2.b0(1762828352);
                rVar2.p(false);
                h0Var4 = h0Var6;
            } else {
                rVar2.b0(1762828353);
                androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.c, androidx.compose.foundation.s.o(rVar2), true);
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                v vVarA = t.a(cVar, hVar, rVar2, 0);
                int iHashCode = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                androidx.compose.ui.node.g.b.getClass();
                y yVar6 = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar6);
                } else {
                    rVar2.o0();
                }
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.e;
                s.x(rVar2, vVarA, eVar4);
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.d;
                s.x(rVar2, jVarL, eVar5);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.f;
                s.p(rVar2, numValueOf, eVar6);
                androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                s.t(rVar2, dVar2);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.c;
                s.x(rVar2, rVarC, eVar7);
                o oVar3 = o.b;
                float f2 = 16;
                androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.d(oVar3, 1.0f), f2);
                androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
                androidx.compose.foundation.layout.a aVar2 = androidx.compose.foundation.layout.h.a;
                t0 t0VarA = r0.a(aVar2, iVar2, rVar2, 48);
                int iHashCode2 = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarO);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar6);
                } else {
                    rVar2.o0();
                }
                s.x(rVar2, t0VarA, eVar4);
                s.x(rVar2, jVarL2, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar6, rVar2, dVar2);
                s.x(rVar2, rVarC2, eVar7);
                Object objQ5 = rVar2.Q();
                if (objQ5 == fVar) {
                    objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                k kVar = (k) objQ5;
                t2.e(aVar, androidx.compose.foundation.s.g(oVar3, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a), false, null, kVar, null, a, rVar, ((i4 >> 3) & 14) | 1597440, 44);
                androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.p(oVar3, f2));
                String strE = musicAlbumDetail.e();
                androidx.compose.ui.text.m0 m0Var = t2.n(rVar).f;
                long j = androidx.compose.ui.graphics.t.d;
                int i6 = i4;
                p3.b(strE, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 384, 0, 131066);
                rVar.p(true);
                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar3, 1.0f), f2, 0.0f, 2);
                androidx.compose.ui.i iVar3 = androidx.compose.ui.c.G;
                t0 t0VarA2 = r0.a(aVar2, iVar3, rVar, 48);
                int iHashCode3 = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, rVarQ);
                rVar.e0();
                if (rVar.S) {
                    yVar = yVar6;
                    rVar.k(yVar);
                } else {
                    yVar = yVar6;
                    rVar.o0();
                }
                s.x(rVar, t0VarA2, eVar4);
                s.x(rVar, jVarL3, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar6, rVar, dVar2);
                s.x(rVar, rVarC3, eVar7);
                String strD = musicAlbumDetail.d();
                if (strD == null) {
                    strD = "";
                }
                float f3 = 8;
                coil3.compose.k.a(strD, musicAlbumDetail.e(), androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.w0.l(oVar3, 160), androidx.compose.foundation.shape.e.a(f3)), null, androidx.compose.ui.layout.i.a, rVar, 1572864, 1976);
                androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.p(oVar3, f2));
                v vVarA2 = t.a(cVar, hVar, rVar, 0);
                int iHashCode4 = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL4 = rVar.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, oVar3);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.o0();
                }
                s.x(rVar, vVarA2, eVar4);
                s.x(rVar, jVarL4, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar6, rVar, dVar2);
                s.x(rVar, rVarC4, eVar7);
                y yVar7 = yVar;
                p3.b(musicAlbumDetail.a(), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar).h, rVar, 384, 0, 131066);
                r rVar3 = rVar;
                t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(f3), iVar3, rVar3, 6);
                int iHashCode5 = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarL5 = rVar3.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar3, oVar3);
                rVar3.e0();
                if (rVar3.S) {
                    yVar2 = yVar7;
                    rVar3.k(yVar2);
                } else {
                    yVar2 = yVar7;
                    rVar3.o0();
                }
                s.x(rVar3, t0VarA3, eVar4);
                s.x(rVar3, jVarL5, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar3, eVar6, rVar3, dVar2);
                s.x(rVar3, rVarC5, eVar7);
                String strG = musicAlbumDetail.g();
                if (strG == null) {
                    rVar3.b0(1043015162);
                    rVar3.p(false);
                    iVar = iVar3;
                    eVar = eVar7;
                    eVar2 = eVar6;
                    oVar = oVar3;
                    z = false;
                    yVar3 = yVar2;
                    eVar3 = eVar4;
                    dVar = dVar2;
                } else {
                    rVar3.b0(1043015163);
                    eVar = eVar7;
                    eVar2 = eVar6;
                    eVar3 = eVar4;
                    dVar = dVar2;
                    yVar3 = yVar2;
                    oVar = oVar3;
                    iVar = iVar3;
                    p3.b(strG, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar3).l, rVar, 384, 0, 131066);
                    rVar3 = rVar;
                    z = false;
                    rVar3.p(false);
                }
                String strC = musicAlbumDetail.c();
                if (strC == null) {
                    rVar3.b0(1043198062);
                    rVar3.p(z);
                } else {
                    rVar3.b0(1043198063);
                    p3.b("•", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar3).l, rVar, 390, 0, 131066);
                    p3.b(strC, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar).l, rVar, 384, 0, 131066);
                    rVar3 = rVar;
                    z = false;
                    rVar3.p(false);
                }
                rVar3.p(true);
                p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(musicAlbumDetail.f().size(), " tracks"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar3).l, rVar, 384, 0, 131066);
                r rVar4 = rVar;
                String strB = musicAlbumDetail.b();
                if (strB == null) {
                    rVar4.b0(-1588941362);
                    rVar4.p(false);
                    oVar2 = oVar;
                } else {
                    rVar4.b0(-1588941361);
                    o oVar4 = oVar;
                    androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar4, f3));
                    oVar2 = oVar4;
                    p3.b(strB, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 4, 0, t2.n(rVar4).l, rVar, 384, 24960, 110586);
                    rVar4 = rVar;
                    rVar4.p(false);
                }
                rVar4.p(true);
                rVar4.p(true);
                o oVar5 = oVar2;
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar5, f2));
                androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar5, 1.0f), f2, 0.0f, 2);
                t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05fc: INVOKE (r1v28 't0VarA4' androidx.compose.foundation.layout.t0) = 
                      (wrap androidx.compose.foundation.layout.f:0x05f5: INVOKE (r32v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) STATIC call: androidx.compose.foundation.layout.h.g(float):androidx.compose.foundation.layout.f A[MD:(float):androidx.compose.foundation.layout.f (m), WRAPPED] (LINE:1526))
                      (r76v1 'iVar' androidx.compose.ui.i)
                      (r5v15 'rVar4' androidx.compose.runtime.r)
                      (6 int)
                     STATIC call: androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.e, androidx.compose.ui.i, androidx.compose.runtime.r, int):androidx.compose.foundation.layout.t0 A[DECLARE_VAR, MD:(androidx.compose.foundation.layout.e, androidx.compose.ui.i, androidx.compose.runtime.r, int):androidx.compose.foundation.layout.t0 (m)] (LINE:1533) in method: com.app.mlounge.ui.screens.music.a.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, com.app.mlounge.ui.viewmodel.h0, androidx.compose.runtime.r, int):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v1 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2117
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.music.a.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, com.app.mlounge.ui.viewmodel.h0, androidx.compose.runtime.r, int):void");
            }

            public static final void b(String str, kotlin.jvm.functions.a aVar, l lVar, h0 h0Var, r rVar, int i) {
                h0 h0Var2;
                int i2;
                h0 h0Var3;
                h0 h0Var4;
                r rVar2 = rVar;
                aVar.getClass();
                lVar.getClass();
                rVar2.c0(-1640975508);
                int i3 = i | (rVar2.f(str) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16) | (rVar2.h(lVar) ? 256 : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (rVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
                    rVar2.Y();
                    if ((i & 1) == 0 || rVar2.C()) {
                        w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                        if (w0VarA == null) {
                            net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            h0 h0Var5 = (h0) h1.B(a0.a(h0.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                            i2 = i3 & (-7169);
                            h0Var3 = h0Var5;
                        }
                    } else {
                        rVar2.W();
                        i2 = i3 & (-7169);
                        h0Var3 = h0Var;
                    }
                    rVar2.q();
                    y0 y0VarG = s.g(h0Var3.A, rVar2);
                    y0 y0VarG2 = s.g(h0Var3.i, rVar2);
                    String strConcat = "music_artist_".concat(str);
                    com.app.mlounge.data.repository.a0 a0Var = h0Var3.c;
                    a0Var.getClass();
                    androidx.room.coroutines.l lVarC = a0Var.a.c(strConcat);
                    int i4 = i2;
                    y0 y0VarF = s.f(lVarC, Boolean.FALSE, null, rVar2, 48, 2);
                    int i5 = i4 & 14;
                    boolean zH = rVar2.h(h0Var3) | (i5 == 4);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar = m.a;
                    if (zH || objQ == fVar) {
                        objQ = new e(h0Var3, str, null, 2);
                        rVar2.l0(objQ);
                    }
                    j0.c(rVar2, str, (p) objQ);
                    boolean zH2 = rVar2.h(h0Var3);
                    Object objQ2 = rVar2.Q();
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new b(h0Var3, 1);
                        rVar2.l0(objQ2);
                    }
                    j0.b(kotlin.y.a, (l) objQ2, rVar2);
                    if (((Boolean) y0VarG2.getValue()).booleanValue() && ((MusicArtistDetail) y0VarG.getValue()) == null) {
                        rVar2.b0(-982996059);
                        b0.n(null, rVar2, 0);
                        rVar2.p(false);
                        q1 q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new c(str, aVar, lVar, h0Var3, i, 2);
                            return;
                        }
                        return;
                    }
                    h0 h0Var6 = h0Var3;
                    rVar2.b0(-982948970);
                    rVar2.p(false);
                    MusicArtistDetail musicArtistDetail = (MusicArtistDetail) y0VarG.getValue();
                    if (musicArtistDetail == null) {
                        rVar2.b0(-982801783);
                        rVar2.p(false);
                        rVar2 = rVar2;
                        h0Var4 = h0Var6;
                    } else {
                        rVar2.b0(-982801782);
                        androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                        androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                        androidx.compose.foundation.layout.m0 m0VarC = androidx.compose.foundation.layout.b.c(32);
                        boolean zH3 = rVar2.h(musicArtistDetail) | ((i4 & Token.ASSIGN_MOD) == 32) | rVar2.f(y0VarF) | rVar2.h(h0Var6) | (i5 == 4) | ((i4 & 896) == 256);
                        Object objQ3 = rVar2.Q();
                        if (zH3 || objQ3 == fVar) {
                            rVar2 = rVar2;
                            androidx.compose.foundation.layout.r rVar3 = new androidx.compose.foundation.layout.r(musicArtistDetail, aVar, h0Var6, str, y0VarF, lVar, 2);
                            h0Var4 = h0Var6;
                            rVar2.l0(rVar3);
                            objQ3 = rVar3;
                        } else {
                            rVar2 = rVar2;
                            h0Var4 = h0Var6;
                        }
                        com.google.android.gms.dynamite.g.a(aVar2, a0Var2, null, m0VarC, null, null, null, false, null, (l) objQ3, rVar2, 3120, 1012);
                        rVar2.p(false);
                    }
                    h0Var2 = h0Var4;
                } else {
                    rVar2.W();
                    h0Var2 = h0Var;
                }
                q1 q1VarT2 = rVar2.t();
                if (q1VarT2 != null) {
                    q1VarT2.d = new c(str, aVar, lVar, h0Var2, i, 3);
                }
            }

            public static final void c(l lVar, l lVar2, h0 h0Var, r rVar, int i) {
                h0 h0Var2;
                int i2;
                h0 h0Var3;
                r rVar2 = rVar;
                lVar.getClass();
                lVar2.getClass();
                rVar2.c0(-1920160550);
                int i3 = i | (rVar2.h(lVar) ? 4 : 2) | (rVar2.h(lVar2) ? 32 : 16) | 128;
                if (rVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    rVar2.Y();
                    if ((i & 1) == 0 || rVar2.C()) {
                        w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                        if (w0VarA == null) {
                            net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            i2 = i3 & (-897);
                            h0Var3 = (h0) h1.B(a0.a(h0.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                        }
                    } else {
                        rVar2.W();
                        i2 = i3 & (-897);
                        h0Var3 = h0Var;
                    }
                    int i4 = i2;
                    rVar2.q();
                    y0 y0VarG = s.g(h0Var3.g, rVar2);
                    y0 y0VarG2 = s.g(h0Var3.i, rVar2);
                    y0 y0VarG3 = s.g(h0Var3.k, rVar2);
                    y0 y0VarG4 = s.g(h0Var3.o, rVar2);
                    y0 y0VarG5 = s.g(h0Var3.q, rVar2);
                    y0 y0VarG6 = s.g(h0Var3.s, rVar2);
                    x xVarA = z.a(0, 0, rVar2, 3);
                    Context context = (Context) rVar2.j(m0.b);
                    Resources resources = (Resources) rVar2.j(m0.c);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = androidx.core.content.res.j.a;
                    long jC = androidx.compose.ui.graphics.a0.c(resources.getColor(R.color.gray_medium, theme));
                    boolean zF = rVar2.f(xVarA) | rVar2.f(y0VarG) | rVar2.h(h0Var3);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar = m.a;
                    if (zF || objQ == fVar) {
                        objQ = new com.app.mlounge.ui.screens.adult.e(xVarA, h0Var3, y0VarG, null, 4);
                        rVar2.l0(objQ);
                    }
                    j0.c(rVar2, xVarA, (p) objQ);
                    androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar2, androidx.compose.ui.node.f.g);
                    s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    float f2 = 16;
                    h0 h0Var4 = h0Var3;
                    p3.b("Music", androidx.compose.foundation.layout.b.s(o.b, f2, f2, 0.0f, 4, 4), ((n0) rVar2.j(o0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).e, rVar, 54, 0, 131064);
                    rVar2 = rVar;
                    String str = (String) y0VarG6.getValue();
                    boolean zH = rVar2.h(h0Var4);
                    Object objQ2 = rVar2.Q();
                    if (zH || objQ2 == fVar) {
                        androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, h0Var4, h0.class, "setSource", "setSource(Ljava/lang/String;)V", 0, 11);
                        rVar2.l0(cVar);
                        objQ2 = cVar;
                    }
                    l lVar3 = (l) ((kotlin.reflect.e) objQ2);
                    MusicGenre musicGenre = (MusicGenre) y0VarG4.getValue();
                    boolean zH2 = rVar2.h(h0Var4);
                    Object objQ3 = rVar2.Q();
                    if (zH2 || objQ3 == fVar) {
                        androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, h0Var4, h0.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/MusicGenre;)V", 0, 12);
                        rVar2.l0(cVar2);
                        objQ3 = cVar2;
                    }
                    l lVar4 = (l) ((kotlin.reflect.e) objQ3);
                    String str2 = (String) y0VarG5.getValue();
                    List list = h0Var4.D;
                    boolean zH3 = rVar2.h(h0Var4);
                    Object objQ4 = rVar2.Q();
                    if (zH3 || objQ4 == fVar) {
                        androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, h0Var4, h0.class, "setSection", "setSection(Ljava/lang/String;)V", 0, 13);
                        rVar2.l0(cVar3);
                        objQ4 = cVar3;
                    }
                    b0.o(str, lVar3, musicGenre, lVar4, str2, list, (l) ((kotlin.reflect.e) objQ4), null, rVar2, 0);
                    if (((Boolean) y0VarG2.getValue()).booleanValue() && ((List) y0VarG.getValue()).isEmpty()) {
                        rVar2.b0(1536387476);
                        b0.n(null, rVar2, 0);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(1536534261);
                        androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                        float f3 = 12;
                        androidx.compose.foundation.layout.m0 m0Var = new androidx.compose.foundation.layout.m0(f3, f3, f3, f3);
                        float f4 = 8;
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                        androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                        boolean zF2 = rVar2.f(y0VarG) | rVar2.e(jC) | ((i4 & 14) == 4) | ((i4 & Token.ASSIGN_MOD) == 32) | rVar2.f(y0VarG3);
                        Object objQ5 = rVar2.Q();
                        if (zF2 || objQ5 == fVar) {
                            com.app.mlounge.ui.screens.livetv.c cVar4 = new com.app.mlounge.ui.screens.livetv.c(y0VarG, jC, lVar, lVar2, y0VarG3);
                            rVar2.l0(cVar4);
                            objQ5 = cVar4;
                        }
                        com.google.android.gms.dynamite.g.a(aVar, a0Var, xVarA, m0Var, fVarG2, fVarG, null, false, null, (l) objQ5, rVar, 1772592, 912);
                        rVar2 = rVar;
                        rVar2.p(false);
                    }
                    rVar2.p(true);
                    h0Var2 = h0Var4;
                } else {
                    rVar2.W();
                    h0Var2 = h0Var;
                }
                q1 q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new w1(lVar, lVar2, h0Var2, i, 10);
                }
            }

            public static final void d(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, r rVar, int i) {
                rVar.c0(-1671029443);
                int i2 = (rVar.f(musicTrack) ? 4 : 2) | i | (rVar.h(aVar) ? 32 : 16) | (rVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128);
                if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    float f2 = 8;
                    f3.a(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(o.b, 1.0f), 0.0f, 2, 1), androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(801405762, new d(musicTrack, aVar, aVar2), rVar), rVar, 12583296, 120);
                } else {
                    rVar.W();
                }
                q1 q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new d(musicTrack, aVar, aVar2, i);
                }
            }
        }
