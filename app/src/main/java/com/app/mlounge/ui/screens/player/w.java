package com.app.mlounge.ui.screens.player;

import android.graphics.Color;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.datastore.preferences.protobuf.h1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ kotlin.jvm.functions.l C;
    public final /* synthetic */ kotlin.jvm.functions.l D;
    public final /* synthetic */ kotlin.jvm.functions.l E;
    public final /* synthetic */ kotlin.jvm.functions.l F;
    public final /* synthetic */ kotlin.jvm.functions.a G;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    public /* synthetic */ w(float f, int i, int i2, long j, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, int i3) {
        this.y = f;
        this.z = i;
        this.A = i2;
        this.B = j;
        this.C = lVar;
        this.D = lVar2;
        this.E = lVar3;
        this.F = lVar4;
        this.G = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarC = androidx.compose.foundation.layout.w0.c(androidx.compose.foundation.layout.w0.d(androidx.compose.ui.o.b, 0.85f), 0.85f);
                    androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                    androidx.compose.material3.a0 a0VarI = t2.i(com.app.mlounge.ui.theme.b.b, rVar, 6);
                    final kotlin.jvm.functions.a aVar = this.G;
                    final kotlin.jvm.functions.l lVar = this.C;
                    final float f = this.y;
                    final kotlin.jvm.functions.l lVar2 = this.D;
                    final long j = this.B;
                    final int i = this.z;
                    final kotlin.jvm.functions.l lVar3 = this.E;
                    final int i2 = this.A;
                    final kotlin.jvm.functions.l lVar4 = this.F;
                    t2.c(rVarC, dVarA, a0VarI, null, androidx.compose.runtime.internal.k.c(48059655, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.x
                        @Override // kotlin.jvm.functions.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((androidx.compose.foundation.layout.w) obj3).getClass();
                            if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.c, 20);
                                final kotlin.jvm.functions.a aVar2 = aVar;
                                boolean zF = rVar2.f(aVar2);
                                final kotlin.jvm.functions.l lVar5 = lVar;
                                boolean zF2 = zF | rVar2.f(lVar5);
                                final float f2 = f;
                                boolean zC = zF2 | rVar2.c(f2);
                                final kotlin.jvm.functions.l lVar6 = lVar2;
                                boolean zF3 = zC | rVar2.f(lVar6);
                                final long j2 = j;
                                boolean zE = zF3 | rVar2.e(j2);
                                final int i3 = i;
                                boolean zD = zE | rVar2.d(i3);
                                final kotlin.jvm.functions.l lVar7 = lVar3;
                                boolean zF4 = zD | rVar2.f(lVar7);
                                final int i4 = i2;
                                boolean zD2 = zF4 | rVar2.d(i4);
                                final kotlin.jvm.functions.l lVar8 = lVar4;
                                boolean zF5 = zD2 | rVar2.f(lVar8);
                                Object objQ = rVar2.Q();
                                if (zF5 || objQ == androidx.compose.runtime.m.a) {
                                    kotlin.jvm.functions.l lVar9 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.player.o
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj6) {
                                            androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj6;
                                            kVar.getClass();
                                            androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(1399435676, true, new androidx.compose.material3.internal.p(2, aVar2)), 3);
                                            final kotlin.jvm.functions.l lVar10 = lVar5;
                                            final float f3 = f2;
                                            androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(311693587, true, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.e
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                    if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        p3.b("Subtitle Size", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 24966, 0, 262122);
                                                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                                                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                        androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
                                                        androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(dVar, iVar, rVar3, 54);
                                                        int iHashCode = Long.hashCode(rVar3.T);
                                                        androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarD);
                                                        androidx.compose.ui.node.g.b.getClass();
                                                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                                        rVar3.e0();
                                                        if (rVar3.S) {
                                                            rVar3.k(yVar);
                                                        } else {
                                                            rVar3.o0();
                                                        }
                                                        androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                                                        androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                                                        androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                                        androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                                                        androidx.compose.runtime.s.x(rVar3, rVarC2, androidx.compose.ui.node.f.c);
                                                        androidx.compose.ui.graphics.vector.f fVarA = _COROUTINE.a.A();
                                                        kotlin.jvm.functions.l lVar11 = lVar10;
                                                        boolean zF6 = rVar3.f(lVar11);
                                                        float f4 = f3;
                                                        boolean zC2 = zF6 | rVar3.c(f4);
                                                        Object objQ2 = rVar3.Q();
                                                        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                                        if (zC2 || objQ2 == fVar) {
                                                            objQ2 = new j(lVar11, f4, 0);
                                                            rVar3.l0(objQ2);
                                                        }
                                                        i0.f(fVarA, (kotlin.jvm.functions.a) objQ2, rVar3, 0);
                                                        p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d((int) f4, "sp"), androidx.compose.foundation.layout.b.q(oVar, 16, 0.0f, 2), com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 1573296, 0, 262072);
                                                        androidx.compose.ui.graphics.vector.f fVarM = _COROUTINE.b.m();
                                                        boolean zF7 = rVar3.f(lVar11) | rVar3.c(f4);
                                                        Object objQ3 = rVar3.Q();
                                                        if (zF7 || objQ3 == fVar) {
                                                            objQ3 = new j(lVar11, f4, 1);
                                                            rVar3.l0(objQ3);
                                                        }
                                                        i0.f(fVarM, (kotlin.jvm.functions.a) objQ3, rVar3, 0);
                                                        rVar3.p(true);
                                                        androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.f(oVar, 24));
                                                    } else {
                                                        rVar3.W();
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final long j3 = j2;
                                            final kotlin.jvm.functions.l lVar11 = lVar6;
                                            androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(2137329364, true, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.f
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                    if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        p3.b("Sync Offset", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 24966, 0, 262122);
                                                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                                                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                        androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
                                                        androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(dVar, iVar, rVar3, 54);
                                                        int iHashCode = Long.hashCode(rVar3.T);
                                                        androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarD);
                                                        androidx.compose.ui.node.g.b.getClass();
                                                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                                        rVar3.e0();
                                                        if (rVar3.S) {
                                                            rVar3.k(yVar);
                                                        } else {
                                                            rVar3.o0();
                                                        }
                                                        androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                                                        androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                                                        androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                                        androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                                                        androidx.compose.runtime.s.x(rVar3, rVarC2, androidx.compose.ui.node.f.c);
                                                        androidx.compose.ui.graphics.vector.f fVarA = _COROUTINE.a.A();
                                                        final kotlin.jvm.functions.l lVar12 = lVar11;
                                                        boolean zF6 = rVar3.f(lVar12);
                                                        final long j4 = j3;
                                                        boolean zE2 = zF6 | rVar3.e(j4);
                                                        Object objQ2 = rVar3.Q();
                                                        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                                        if (zE2 || objQ2 == fVar) {
                                                            final int i5 = 0;
                                                            objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.k
                                                                @Override // kotlin.jvm.functions.a
                                                                public final Object invoke() {
                                                                    switch (i5) {
                                                                        case 0:
                                                                            lVar12.invoke(Long.valueOf(j4 - ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                        default:
                                                                            lVar12.invoke(Long.valueOf(j4 + ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                    }
                                                                    return kotlin.y.a;
                                                                }
                                                            };
                                                            rVar3.l0(objQ2);
                                                        }
                                                        i0.f(fVarA, (kotlin.jvm.functions.a) objQ2, rVar3, 0);
                                                        p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(j4 >= 0 ? "+" : "", String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1000.0d)}, 1)), "s"), androidx.compose.foundation.layout.b.q(oVar, 16, 0.0f, 2), com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 1573296, 0, 262072);
                                                        androidx.compose.ui.graphics.vector.f fVarM = _COROUTINE.b.m();
                                                        boolean zF7 = rVar3.f(lVar12) | rVar3.e(j4);
                                                        Object objQ3 = rVar3.Q();
                                                        if (zF7 || objQ3 == fVar) {
                                                            final int i6 = 1;
                                                            objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.k
                                                                @Override // kotlin.jvm.functions.a
                                                                public final Object invoke() {
                                                                    switch (i6) {
                                                                        case 0:
                                                                            lVar12.invoke(Long.valueOf(j4 - ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                        default:
                                                                            lVar12.invoke(Long.valueOf(j4 + ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                    }
                                                                    return kotlin.y.a;
                                                                }
                                                            };
                                                            rVar3.l0(objQ3);
                                                        }
                                                        i0.f(fVarM, (kotlin.jvm.functions.a) objQ3, rVar3, 0);
                                                        if (j4 != 0) {
                                                            rVar3.b0(-1250496576);
                                                            boolean zF8 = rVar3.f(lVar12);
                                                            Object objQ4 = rVar3.Q();
                                                            if (zF8 || objQ4 == fVar) {
                                                                objQ4 = new d(2, lVar12);
                                                                rVar3.l0(objQ4);
                                                            }
                                                            t2.h((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, b.b, rVar3, 805306368, 510);
                                                            rVar3.p(false);
                                                        } else {
                                                            rVar3.b0(-1250363958);
                                                            rVar3.p(false);
                                                        }
                                                        rVar3.p(true);
                                                        androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.f(oVar, 24));
                                                    } else {
                                                        rVar3.W();
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final int i5 = 0;
                                            final int i6 = i3;
                                            final kotlin.jvm.functions.l lVar12 = lVar7;
                                            androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(-332002155, true, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.g
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    switch (i5) {
                                                        case 0:
                                                            androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                p3.b("Text Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 24966, 0, 262122);
                                                                androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar3, 6);
                                                                int iHashCode = Long.hashCode(rVar3.T);
                                                                androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, oVar);
                                                                androidx.compose.ui.node.g.b.getClass();
                                                                androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                                                rVar3.e0();
                                                                if (rVar3.S) {
                                                                    rVar3.k(yVar);
                                                                } else {
                                                                    rVar3.o0();
                                                                }
                                                                androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                                                                androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                                                                androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                                                androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                                                                androidx.compose.runtime.s.x(rVar3, rVarC2, androidx.compose.ui.node.f.c);
                                                                rVar3.b0(-860516516);
                                                                Iterator it = com.google.common.base.c.q(-1, -256, -16711936, -16711681).iterator();
                                                                while (it.hasNext()) {
                                                                    final int iIntValue4 = ((Number) it.next()).intValue();
                                                                    long jC = androidx.compose.ui.graphics.a0.c(iIntValue4);
                                                                    boolean z = i6 == iIntValue4;
                                                                    final kotlin.jvm.functions.l lVar13 = lVar12;
                                                                    boolean zF6 = rVar3.f(lVar13) | rVar3.d(iIntValue4);
                                                                    Object objQ2 = rVar3.Q();
                                                                    if (zF6 || objQ2 == androidx.compose.runtime.m.a) {
                                                                        final int i7 = 1;
                                                                        objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.i
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i7) {
                                                                                    case 0:
                                                                                        lVar13.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                    default:
                                                                                        lVar13.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        rVar3.l0(objQ2);
                                                                    }
                                                                    i0.c(jC, z, (kotlin.jvm.functions.a) objQ2, rVar3, 0);
                                                                }
                                                                rVar3.p(false);
                                                                rVar3.p(true);
                                                                androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.f(oVar, 24));
                                                            } else {
                                                                rVar3.W();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj8;
                                                            int iIntValue5 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (rVar4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                p3.b("Background Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 24966, 0, 262122);
                                                                List listQ = com.google.common.base.c.q(new kotlin.k(Integer.valueOf(Color.argb(128, 0, 0, 0)), "Semi"), new kotlin.k(Integer.valueOf(Color.argb(255, 0, 0, 0)), "Black"), new kotlin.k(0, "None"), new kotlin.k(Integer.valueOf(Color.argb(160, 50, 50, 50)), "Gray"));
                                                                androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar4, 6);
                                                                int iHashCode2 = Long.hashCode(rVar4.T);
                                                                androidx.compose.runtime.internal.j jVarL2 = rVar4.l();
                                                                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar4, oVar2);
                                                                androidx.compose.ui.node.g.b.getClass();
                                                                androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                                                                rVar4.e0();
                                                                if (rVar4.S) {
                                                                    rVar4.k(yVar2);
                                                                } else {
                                                                    rVar4.o0();
                                                                }
                                                                androidx.compose.runtime.s.x(rVar4, t0VarA2, androidx.compose.ui.node.f.e);
                                                                androidx.compose.runtime.s.x(rVar4, jVarL2, androidx.compose.ui.node.f.d);
                                                                androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                                                                androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                                                                androidx.compose.runtime.s.x(rVar4, rVarC3, androidx.compose.ui.node.f.c);
                                                                rVar4.b0(1228804714);
                                                                Iterator it2 = listQ.iterator();
                                                                while (it2.hasNext()) {
                                                                    final int iIntValue6 = ((Number) ((kotlin.k) it2.next()).e).intValue();
                                                                    long jC2 = iIntValue6 == 0 ? androidx.compose.ui.graphics.t.h : androidx.compose.ui.graphics.a0.c(iIntValue6);
                                                                    boolean z2 = i6 == iIntValue6;
                                                                    final kotlin.jvm.functions.l lVar14 = lVar12;
                                                                    boolean zF7 = rVar4.f(lVar14) | rVar4.d(iIntValue6);
                                                                    Object objQ3 = rVar4.Q();
                                                                    if (zF7 || objQ3 == androidx.compose.runtime.m.a) {
                                                                        final int i8 = 0;
                                                                        objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.i
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i8) {
                                                                                    case 0:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                    default:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        rVar4.l0(objQ3);
                                                                    }
                                                                    i0.c(jC2, z2, (kotlin.jvm.functions.a) objQ3, rVar4, 0);
                                                                }
                                                                rVar4.p(false);
                                                                rVar4.p(true);
                                                                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar2, 16));
                                                            } else {
                                                                rVar4.W();
                                                            }
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final int i7 = 1;
                                            final int i8 = i4;
                                            final kotlin.jvm.functions.l lVar13 = lVar8;
                                            androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(1493633622, true, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.g
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    switch (i7) {
                                                        case 0:
                                                            androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                p3.b("Text Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 24966, 0, 262122);
                                                                androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar3, 6);
                                                                int iHashCode = Long.hashCode(rVar3.T);
                                                                androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, oVar);
                                                                androidx.compose.ui.node.g.b.getClass();
                                                                androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                                                rVar3.e0();
                                                                if (rVar3.S) {
                                                                    rVar3.k(yVar);
                                                                } else {
                                                                    rVar3.o0();
                                                                }
                                                                androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                                                                androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                                                                androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                                                androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                                                                androidx.compose.runtime.s.x(rVar3, rVarC2, androidx.compose.ui.node.f.c);
                                                                rVar3.b0(-860516516);
                                                                Iterator it = com.google.common.base.c.q(-1, -256, -16711936, -16711681).iterator();
                                                                while (it.hasNext()) {
                                                                    final int iIntValue4 = ((Number) it.next()).intValue();
                                                                    long jC = androidx.compose.ui.graphics.a0.c(iIntValue4);
                                                                    boolean z = i8 == iIntValue4;
                                                                    final kotlin.jvm.functions.l lVar14 = lVar13;
                                                                    boolean zF6 = rVar3.f(lVar14) | rVar3.d(iIntValue4);
                                                                    Object objQ2 = rVar3.Q();
                                                                    if (zF6 || objQ2 == androidx.compose.runtime.m.a) {
                                                                        final int i9 = 1;
                                                                        objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.i
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i9) {
                                                                                    case 0:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                    default:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        rVar3.l0(objQ2);
                                                                    }
                                                                    i0.c(jC, z, (kotlin.jvm.functions.a) objQ2, rVar3, 0);
                                                                }
                                                                rVar3.p(false);
                                                                rVar3.p(true);
                                                                androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.f(oVar, 24));
                                                            } else {
                                                                rVar3.W();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj8;
                                                            int iIntValue5 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (rVar4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                p3.b("Background Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), h1.r(13), null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 24966, 0, 262122);
                                                                List listQ = com.google.common.base.c.q(new kotlin.k(Integer.valueOf(Color.argb(128, 0, 0, 0)), "Semi"), new kotlin.k(Integer.valueOf(Color.argb(255, 0, 0, 0)), "Black"), new kotlin.k(0, "None"), new kotlin.k(Integer.valueOf(Color.argb(160, 50, 50, 50)), "Gray"));
                                                                androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar4, 6);
                                                                int iHashCode2 = Long.hashCode(rVar4.T);
                                                                androidx.compose.runtime.internal.j jVarL2 = rVar4.l();
                                                                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar4, oVar2);
                                                                androidx.compose.ui.node.g.b.getClass();
                                                                androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                                                                rVar4.e0();
                                                                if (rVar4.S) {
                                                                    rVar4.k(yVar2);
                                                                } else {
                                                                    rVar4.o0();
                                                                }
                                                                androidx.compose.runtime.s.x(rVar4, t0VarA2, androidx.compose.ui.node.f.e);
                                                                androidx.compose.runtime.s.x(rVar4, jVarL2, androidx.compose.ui.node.f.d);
                                                                androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                                                                androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                                                                androidx.compose.runtime.s.x(rVar4, rVarC3, androidx.compose.ui.node.f.c);
                                                                rVar4.b0(1228804714);
                                                                Iterator it2 = listQ.iterator();
                                                                while (it2.hasNext()) {
                                                                    final int iIntValue6 = ((Number) ((kotlin.k) it2.next()).e).intValue();
                                                                    long jC2 = iIntValue6 == 0 ? androidx.compose.ui.graphics.t.h : androidx.compose.ui.graphics.a0.c(iIntValue6);
                                                                    boolean z2 = i8 == iIntValue6;
                                                                    final kotlin.jvm.functions.l lVar15 = lVar13;
                                                                    boolean zF7 = rVar4.f(lVar15) | rVar4.d(iIntValue6);
                                                                    Object objQ3 = rVar4.Q();
                                                                    if (zF7 || objQ3 == androidx.compose.runtime.m.a) {
                                                                        final int i10 = 0;
                                                                        objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.i
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        lVar15.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                    default:
                                                                                        lVar15.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        rVar4.l0(objQ3);
                                                                    }
                                                                    i0.c(jC2, z2, (kotlin.jvm.functions.a) objQ3, rVar4, 0);
                                                                }
                                                                rVar4.p(false);
                                                                rVar4.p(true);
                                                                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar2, 16));
                                                            } else {
                                                                rVar4.W();
                                                            }
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            return kotlin.y.a;
                                        }
                                    };
                                    rVar2.l0(lVar9);
                                    objQ = lVar9;
                                }
                                coil3.network.g.a(rVarO, null, null, null, null, null, false, null, (kotlin.jvm.functions.l) objQ, rVar2, 6, 510);
                            } else {
                                rVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, rVar), rVar, 196614, 24);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i0.n(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ w(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, float f, kotlin.jvm.functions.l lVar2, long j, int i, kotlin.jvm.functions.l lVar3, int i2, kotlin.jvm.functions.l lVar4) {
        this.G = aVar;
        this.C = lVar;
        this.y = f;
        this.D = lVar2;
        this.B = j;
        this.z = i;
        this.E = lVar3;
        this.A = i2;
        this.F = lVar4;
    }
}
