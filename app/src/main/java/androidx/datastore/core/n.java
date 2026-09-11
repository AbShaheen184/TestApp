package androidx.datastore.core;

import com.app.mlounge.data.local.prefs.y1;
import java.util.Collection;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector y;

    public /* synthetic */ n(FlowCollector flowCollector, int i) {
        this.e = i;
        this.y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:129:0x021e  */
    /* JADX WARN: Code duplicated, block: B:148:0x026c  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:200:0x0352  */
    /* JADX WARN: Code duplicated, block: B:220:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:240:0x0400  */
    /* JADX WARN: Code duplicated, block: B:260:0x0456  */
    /* JADX WARN: Code duplicated, block: B:279:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:295:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:314:0x053a  */
    /* JADX WARN: Code duplicated, block: B:334:0x0592  */
    /* JADX WARN: Code duplicated, block: B:350:0x05da  */
    /* JADX WARN: Code duplicated, block: B:366:0x0622  */
    /* JADX WARN: Code duplicated, block: B:382:0x066a  */
    /* JADX WARN: Code duplicated, block: B:398:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:414:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:430:0x0742  */
    /* JADX WARN: Code duplicated, block: B:446:0x078a  */
    /* JADX WARN: Code duplicated, block: B:466:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:486:0x0838  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:505:0x0886  */
    /* JADX WARN: Code duplicated, block: B:524:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:544:0x092a  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) throws Throwable {
        m mVar;
        com.app.mlounge.o oVar;
        com.app.mlounge.p pVar;
        com.app.mlounge.q qVar;
        com.app.mlounge.data.local.prefs.o oVar2;
        com.app.mlounge.data.local.prefs.p pVar2;
        com.app.mlounge.data.local.prefs.q qVar2;
        com.app.mlounge.data.local.prefs.r rVar;
        com.app.mlounge.data.local.prefs.s sVar;
        com.app.mlounge.data.local.prefs.t tVar;
        com.app.mlounge.data.local.prefs.u uVar;
        com.app.mlounge.data.local.prefs.v vVar;
        com.app.mlounge.data.local.prefs.w wVar;
        com.app.mlounge.data.local.prefs.x xVar;
        com.app.mlounge.data.local.prefs.y yVar;
        com.app.mlounge.data.local.prefs.z zVar;
        com.app.mlounge.data.local.prefs.a0 a0Var;
        com.app.mlounge.data.local.prefs.b0 b0Var;
        com.app.mlounge.data.local.prefs.c0 c0Var;
        com.app.mlounge.data.local.prefs.d0 d0Var;
        com.app.mlounge.data.local.prefs.e0 e0Var;
        com.app.mlounge.data.local.prefs.f0 f0Var;
        com.app.mlounge.data.local.prefs.g0 g0Var;
        com.app.mlounge.data.local.prefs.h0 h0Var;
        com.app.mlounge.data.local.prefs.i0 i0Var;
        com.app.mlounge.data.local.prefs.j0 j0Var;
        com.app.mlounge.data.local.prefs.k0 k0Var;
        com.app.mlounge.data.local.prefs.l0 l0Var;
        com.app.mlounge.data.local.prefs.m0 m0Var;
        com.app.mlounge.data.local.prefs.n0 n0Var;
        switch (this.e) {
            case 0:
                if (dVar instanceof m) {
                    mVar = (m) dVar;
                    int i = mVar.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mVar.y = i - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, dVar);
                    }
                } else {
                    mVar = new m(this, dVar);
                }
                Object obj2 = mVar.e;
                int i2 = mVar.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj2);
                        return kotlin.y.a;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj2);
                g1 g1Var = (g1) obj;
                if (g1Var instanceof w0) {
                    throw ((w0) g1Var).b;
                }
                if (!(g1Var instanceof c)) {
                    if ((g1Var instanceof j0) || (g1Var instanceof i1) || (g1Var instanceof v0)) {
                        net.luminis.tls.engine.impl.c.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        coil3.g.a();
                    }
                    return null;
                }
                Object obj3 = ((c) g1Var).b;
                mVar.y = 1;
                Object objEmit = this.y.emit(obj3, mVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
                return kotlin.y.a;
            case 1:
                if (dVar instanceof com.app.mlounge.o) {
                    oVar = (com.app.mlounge.o) dVar;
                    int i3 = oVar.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oVar.y = i3 - Integer.MIN_VALUE;
                    } else {
                        oVar = new com.app.mlounge.o(this, dVar);
                    }
                } else {
                    oVar = new com.app.mlounge.o(this, dVar);
                }
                Object obj4 = oVar.e;
                int i4 = oVar.y;
                if (i4 == 0) {
                    kotlin.a.e(obj4);
                    Boolean bool = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.a1);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    oVar.y = 1;
                    Object objEmit2 = this.y.emit(boolValueOf, oVar);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj4);
                }
                return kotlin.y.a;
            case 2:
                if (dVar instanceof com.app.mlounge.p) {
                    pVar = (com.app.mlounge.p) dVar;
                    int i5 = pVar.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pVar.y = i5 - Integer.MIN_VALUE;
                    } else {
                        pVar = new com.app.mlounge.p(this, dVar);
                    }
                } else {
                    pVar = new com.app.mlounge.p(this, dVar);
                }
                Object obj5 = pVar.e;
                int i6 = pVar.y;
                if (i6 == 0) {
                    kotlin.a.e(obj5);
                    String str = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.b1);
                    if (str == null) {
                        str = "MEDIUM";
                    }
                    pVar.y = 1;
                    Object objEmit3 = this.y.emit(str, pVar);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj5);
                }
                return kotlin.y.a;
            case 3:
                if (dVar instanceof com.app.mlounge.q) {
                    qVar = (com.app.mlounge.q) dVar;
                    int i7 = qVar.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qVar.y = i7 - Integer.MIN_VALUE;
                    } else {
                        qVar = new com.app.mlounge.q(this, dVar);
                    }
                } else {
                    qVar = new com.app.mlounge.q(this, dVar);
                }
                Object obj6 = qVar.e;
                int i8 = qVar.y;
                if (i8 == 0) {
                    kotlin.a.e(obj6);
                    String str2 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.c1);
                    if (str2 == null) {
                        str2 = "MEDIUM";
                    }
                    qVar.y = 1;
                    Object objEmit4 = this.y.emit(str2, qVar);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i8 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj6);
                }
                return kotlin.y.a;
            case 4:
                if (dVar instanceof com.app.mlounge.data.local.prefs.o) {
                    oVar2 = (com.app.mlounge.data.local.prefs.o) dVar;
                    int i9 = oVar2.y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        oVar2.y = i9 - Integer.MIN_VALUE;
                    } else {
                        oVar2 = new com.app.mlounge.data.local.prefs.o(this, dVar);
                    }
                } else {
                    oVar2 = new com.app.mlounge.data.local.prefs.o(this, dVar);
                }
                Object obj7 = oVar2.e;
                int i10 = oVar2.y;
                if (i10 == 0) {
                    kotlin.a.e(obj7);
                    Boolean bool2 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.j0);
                    Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    oVar2.y = 1;
                    Object objEmit5 = this.y.emit(boolValueOf2, oVar2);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i10 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj7);
                }
                return kotlin.y.a;
            case 5:
                if (dVar instanceof com.app.mlounge.data.local.prefs.p) {
                    pVar2 = (com.app.mlounge.data.local.prefs.p) dVar;
                    int i11 = pVar2.y;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pVar2.y = i11 - Integer.MIN_VALUE;
                    } else {
                        pVar2 = new com.app.mlounge.data.local.prefs.p(this, dVar);
                    }
                } else {
                    pVar2 = new com.app.mlounge.data.local.prefs.p(this, dVar);
                }
                Object obj8 = pVar2.e;
                int i12 = pVar2.y;
                if (i12 == 0) {
                    kotlin.a.e(obj8);
                    Long l = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.s0);
                    Long l2 = new Long(l != null ? l.longValue() : 0L);
                    pVar2.y = 1;
                    Object objEmit6 = this.y.emit(l2, pVar2);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj8);
                }
                return kotlin.y.a;
            case 6:
                if (dVar instanceof com.app.mlounge.data.local.prefs.q) {
                    qVar2 = (com.app.mlounge.data.local.prefs.q) dVar;
                    int i13 = qVar2.y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qVar2.y = i13 - Integer.MIN_VALUE;
                    } else {
                        qVar2 = new com.app.mlounge.data.local.prefs.q(this, dVar);
                    }
                } else {
                    qVar2 = new com.app.mlounge.data.local.prefs.q(this, dVar);
                }
                Object obj9 = qVar2.e;
                int i14 = qVar2.y;
                if (i14 == 0) {
                    kotlin.a.e(obj9);
                    Object objC = ((androidx.datastore.preferences.core.a) obj).c(y1.t0);
                    qVar2.y = 1;
                    Object objEmit7 = this.y.emit(objC, qVar2);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit7 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj9);
                }
                return kotlin.y.a;
            case 7:
                if (dVar instanceof com.app.mlounge.data.local.prefs.r) {
                    rVar = (com.app.mlounge.data.local.prefs.r) dVar;
                    int i15 = rVar.y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        rVar.y = i15 - Integer.MIN_VALUE;
                    } else {
                        rVar = new com.app.mlounge.data.local.prefs.r(this, dVar);
                    }
                } else {
                    rVar = new com.app.mlounge.data.local.prefs.r(this, dVar);
                }
                Object obj10 = rVar.e;
                int i16 = rVar.y;
                if (i16 == 0) {
                    kotlin.a.e(obj10);
                    Object objC2 = ((androidx.datastore.preferences.core.a) obj).c(y1.u0);
                    rVar.y = 1;
                    Object objEmit8 = this.y.emit(objC2, rVar);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit8 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj10);
                }
                return kotlin.y.a;
            case 8:
                if (dVar instanceof com.app.mlounge.data.local.prefs.s) {
                    sVar = (com.app.mlounge.data.local.prefs.s) dVar;
                    int i17 = sVar.y;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        sVar.y = i17 - Integer.MIN_VALUE;
                    } else {
                        sVar = new com.app.mlounge.data.local.prefs.s(this, dVar);
                    }
                } else {
                    sVar = new com.app.mlounge.data.local.prefs.s(this, dVar);
                }
                Object obj11 = sVar.e;
                int i18 = sVar.y;
                if (i18 == 0) {
                    kotlin.a.e(obj11);
                    Object objC3 = ((androidx.datastore.preferences.core.a) obj).c(y1.v0);
                    sVar.y = 1;
                    Object objEmit9 = this.y.emit(objC3, sVar);
                    kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit9 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj11);
                }
                return kotlin.y.a;
            case 9:
                if (dVar instanceof com.app.mlounge.data.local.prefs.t) {
                    tVar = (com.app.mlounge.data.local.prefs.t) dVar;
                    int i19 = tVar.y;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        tVar.y = i19 - Integer.MIN_VALUE;
                    } else {
                        tVar = new com.app.mlounge.data.local.prefs.t(this, dVar);
                    }
                } else {
                    tVar = new com.app.mlounge.data.local.prefs.t(this, dVar);
                }
                Object obj12 = tVar.e;
                int i20 = tVar.y;
                if (i20 == 0) {
                    kotlin.a.e(obj12);
                    Object objC4 = ((androidx.datastore.preferences.core.a) obj).c(y1.w0);
                    tVar.y = 1;
                    Object objEmit10 = this.y.emit(objC4, tVar);
                    kotlin.coroutines.intrinsics.a aVar10 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit10 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj12);
                }
                return kotlin.y.a;
            case 10:
                if (dVar instanceof com.app.mlounge.data.local.prefs.u) {
                    uVar = (com.app.mlounge.data.local.prefs.u) dVar;
                    int i21 = uVar.y;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        uVar.y = i21 - Integer.MIN_VALUE;
                    } else {
                        uVar = new com.app.mlounge.data.local.prefs.u(this, dVar);
                    }
                } else {
                    uVar = new com.app.mlounge.data.local.prefs.u(this, dVar);
                }
                Object obj13 = uVar.e;
                int i22 = uVar.y;
                if (i22 == 0) {
                    kotlin.a.e(obj13);
                    Object objC5 = ((androidx.datastore.preferences.core.a) obj).c(y1.x0);
                    uVar.y = 1;
                    Object objEmit11 = this.y.emit(objC5, uVar);
                    kotlin.coroutines.intrinsics.a aVar11 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit11 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj13);
                }
                return kotlin.y.a;
            case 11:
                if (dVar instanceof com.app.mlounge.data.local.prefs.v) {
                    vVar = (com.app.mlounge.data.local.prefs.v) dVar;
                    int i23 = vVar.y;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        vVar.y = i23 - Integer.MIN_VALUE;
                    } else {
                        vVar = new com.app.mlounge.data.local.prefs.v(this, dVar);
                    }
                } else {
                    vVar = new com.app.mlounge.data.local.prefs.v(this, dVar);
                }
                Object obj14 = vVar.e;
                int i24 = vVar.y;
                if (i24 == 0) {
                    kotlin.a.e(obj14);
                    Object objC6 = ((androidx.datastore.preferences.core.a) obj).c(y1.y0);
                    vVar.y = 1;
                    Object objEmit12 = this.y.emit(objC6, vVar);
                    kotlin.coroutines.intrinsics.a aVar12 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit12 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i24 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj14);
                }
                return kotlin.y.a;
            case 12:
                if (dVar instanceof com.app.mlounge.data.local.prefs.w) {
                    wVar = (com.app.mlounge.data.local.prefs.w) dVar;
                    int i25 = wVar.y;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        wVar.y = i25 - Integer.MIN_VALUE;
                    } else {
                        wVar = new com.app.mlounge.data.local.prefs.w(this, dVar);
                    }
                } else {
                    wVar = new com.app.mlounge.data.local.prefs.w(this, dVar);
                }
                Object obj15 = wVar.e;
                int i26 = wVar.y;
                if (i26 == 0) {
                    kotlin.a.e(obj15);
                    Object objC7 = ((androidx.datastore.preferences.core.a) obj).c(y1.z0);
                    wVar.y = 1;
                    Object objEmit13 = this.y.emit(objC7, wVar);
                    kotlin.coroutines.intrinsics.a aVar13 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit13 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i26 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj15);
                }
                return kotlin.y.a;
            case 13:
                if (dVar instanceof com.app.mlounge.data.local.prefs.x) {
                    xVar = (com.app.mlounge.data.local.prefs.x) dVar;
                    int i27 = xVar.y;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        xVar.y = i27 - Integer.MIN_VALUE;
                    } else {
                        xVar = new com.app.mlounge.data.local.prefs.x(this, dVar);
                    }
                } else {
                    xVar = new com.app.mlounge.data.local.prefs.x(this, dVar);
                }
                Object obj16 = xVar.e;
                int i28 = xVar.y;
                if (i28 == 0) {
                    kotlin.a.e(obj16);
                    Long l3 = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.A0);
                    Long l4 = new Long(l3 != null ? l3.longValue() : 0L);
                    xVar.y = 1;
                    Object objEmit14 = this.y.emit(l4, xVar);
                    kotlin.coroutines.intrinsics.a aVar14 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit14 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i28 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj16);
                }
                return kotlin.y.a;
            case 14:
                if (dVar instanceof com.app.mlounge.data.local.prefs.y) {
                    yVar = (com.app.mlounge.data.local.prefs.y) dVar;
                    int i29 = yVar.y;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yVar.y = i29 - Integer.MIN_VALUE;
                    } else {
                        yVar = new com.app.mlounge.data.local.prefs.y(this, dVar);
                    }
                } else {
                    yVar = new com.app.mlounge.data.local.prefs.y(this, dVar);
                }
                Object obj17 = yVar.e;
                int i30 = yVar.y;
                if (i30 == 0) {
                    kotlin.a.e(obj17);
                    Collection collection = (Set) ((androidx.datastore.preferences.core.a) obj).c(y1.B0);
                    if (collection == null) {
                        collection = kotlin.collections.w.e;
                    }
                    yVar.y = 1;
                    Object objEmit15 = this.y.emit(collection, yVar);
                    kotlin.coroutines.intrinsics.a aVar15 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit15 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i30 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj17);
                }
                return kotlin.y.a;
            case 15:
                if (dVar instanceof com.app.mlounge.data.local.prefs.z) {
                    zVar = (com.app.mlounge.data.local.prefs.z) dVar;
                    int i31 = zVar.y;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        zVar.y = i31 - Integer.MIN_VALUE;
                    } else {
                        zVar = new com.app.mlounge.data.local.prefs.z(this, dVar);
                    }
                } else {
                    zVar = new com.app.mlounge.data.local.prefs.z(this, dVar);
                }
                Object obj18 = zVar.e;
                int i32 = zVar.y;
                if (i32 == 0) {
                    kotlin.a.e(obj18);
                    Object objC8 = ((androidx.datastore.preferences.core.a) obj).c(y1.k0);
                    zVar.y = 1;
                    Object objEmit16 = this.y.emit(objC8, zVar);
                    kotlin.coroutines.intrinsics.a aVar16 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit16 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i32 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj18);
                }
                return kotlin.y.a;
            case 16:
                if (dVar instanceof com.app.mlounge.data.local.prefs.a0) {
                    a0Var = (com.app.mlounge.data.local.prefs.a0) dVar;
                    int i33 = a0Var.y;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        a0Var.y = i33 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new com.app.mlounge.data.local.prefs.a0(this, dVar);
                    }
                } else {
                    a0Var = new com.app.mlounge.data.local.prefs.a0(this, dVar);
                }
                Object obj19 = a0Var.e;
                int i34 = a0Var.y;
                if (i34 == 0) {
                    kotlin.a.e(obj19);
                    String str3 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.C0);
                    if (str3 == null) {
                        str3 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    }
                    a0Var.y = 1;
                    Object objEmit17 = this.y.emit(str3, a0Var);
                    kotlin.coroutines.intrinsics.a aVar17 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit17 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i34 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj19);
                }
                return kotlin.y.a;
            case 17:
                if (dVar instanceof com.app.mlounge.data.local.prefs.b0) {
                    b0Var = (com.app.mlounge.data.local.prefs.b0) dVar;
                    int i35 = b0Var.y;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        b0Var.y = i35 - Integer.MIN_VALUE;
                    } else {
                        b0Var = new com.app.mlounge.data.local.prefs.b0(this, dVar);
                    }
                } else {
                    b0Var = new com.app.mlounge.data.local.prefs.b0(this, dVar);
                }
                Object obj20 = b0Var.e;
                int i36 = b0Var.y;
                if (i36 == 0) {
                    kotlin.a.e(obj20);
                    Boolean bool3 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.D0);
                    Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : true);
                    b0Var.y = 1;
                    Object objEmit18 = this.y.emit(boolValueOf3, b0Var);
                    kotlin.coroutines.intrinsics.a aVar18 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit18 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i36 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj20);
                }
                return kotlin.y.a;
            case 18:
                if (dVar instanceof com.app.mlounge.data.local.prefs.c0) {
                    c0Var = (com.app.mlounge.data.local.prefs.c0) dVar;
                    int i37 = c0Var.y;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c0Var.y = i37 - Integer.MIN_VALUE;
                    } else {
                        c0Var = new com.app.mlounge.data.local.prefs.c0(this, dVar);
                    }
                } else {
                    c0Var = new com.app.mlounge.data.local.prefs.c0(this, dVar);
                }
                Object obj21 = c0Var.e;
                int i38 = c0Var.y;
                if (i38 == 0) {
                    kotlin.a.e(obj21);
                    Boolean bool4 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.E0);
                    Boolean boolValueOf4 = Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false);
                    c0Var.y = 1;
                    Object objEmit19 = this.y.emit(boolValueOf4, c0Var);
                    kotlin.coroutines.intrinsics.a aVar19 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit19 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i38 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj21);
                }
                return kotlin.y.a;
            case 19:
                if (dVar instanceof com.app.mlounge.data.local.prefs.d0) {
                    d0Var = (com.app.mlounge.data.local.prefs.d0) dVar;
                    int i39 = d0Var.y;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        d0Var.y = i39 - Integer.MIN_VALUE;
                    } else {
                        d0Var = new com.app.mlounge.data.local.prefs.d0(this, dVar);
                    }
                } else {
                    d0Var = new com.app.mlounge.data.local.prefs.d0(this, dVar);
                }
                Object obj22 = d0Var.e;
                int i40 = d0Var.y;
                if (i40 == 0) {
                    kotlin.a.e(obj22);
                    Long l5 = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.F0);
                    Long l6 = new Long(l5 != null ? l5.longValue() : 30000L);
                    d0Var.y = 1;
                    Object objEmit20 = this.y.emit(l6, d0Var);
                    kotlin.coroutines.intrinsics.a aVar20 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit20 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i40 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj22);
                }
                return kotlin.y.a;
            case 20:
                if (dVar instanceof com.app.mlounge.data.local.prefs.e0) {
                    e0Var = (com.app.mlounge.data.local.prefs.e0) dVar;
                    int i41 = e0Var.y;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        e0Var.y = i41 - Integer.MIN_VALUE;
                    } else {
                        e0Var = new com.app.mlounge.data.local.prefs.e0(this, dVar);
                    }
                } else {
                    e0Var = new com.app.mlounge.data.local.prefs.e0(this, dVar);
                }
                Object obj23 = e0Var.e;
                int i42 = e0Var.y;
                if (i42 == 0) {
                    kotlin.a.e(obj23);
                    Boolean bool5 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.G0);
                    Boolean boolValueOf5 = Boolean.valueOf(bool5 != null ? bool5.booleanValue() : true);
                    e0Var.y = 1;
                    Object objEmit21 = this.y.emit(boolValueOf5, e0Var);
                    kotlin.coroutines.intrinsics.a aVar21 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit21 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i42 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj23);
                }
                return kotlin.y.a;
            case 21:
                if (dVar instanceof com.app.mlounge.data.local.prefs.f0) {
                    f0Var = (com.app.mlounge.data.local.prefs.f0) dVar;
                    int i43 = f0Var.y;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        f0Var.y = i43 - Integer.MIN_VALUE;
                    } else {
                        f0Var = new com.app.mlounge.data.local.prefs.f0(this, dVar);
                    }
                } else {
                    f0Var = new com.app.mlounge.data.local.prefs.f0(this, dVar);
                }
                Object obj24 = f0Var.e;
                int i44 = f0Var.y;
                if (i44 == 0) {
                    kotlin.a.e(obj24);
                    Object objC9 = ((androidx.datastore.preferences.core.a) obj).c(y1.K0);
                    f0Var.y = 1;
                    Object objEmit22 = this.y.emit(objC9, f0Var);
                    kotlin.coroutines.intrinsics.a aVar22 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit22 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i44 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj24);
                }
                return kotlin.y.a;
            case 22:
                if (dVar instanceof com.app.mlounge.data.local.prefs.g0) {
                    g0Var = (com.app.mlounge.data.local.prefs.g0) dVar;
                    int i45 = g0Var.y;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        g0Var.y = i45 - Integer.MIN_VALUE;
                    } else {
                        g0Var = new com.app.mlounge.data.local.prefs.g0(this, dVar);
                    }
                } else {
                    g0Var = new com.app.mlounge.data.local.prefs.g0(this, dVar);
                }
                Object obj25 = g0Var.e;
                int i46 = g0Var.y;
                if (i46 == 0) {
                    kotlin.a.e(obj25);
                    Object objC10 = ((androidx.datastore.preferences.core.a) obj).c(y1.L0);
                    g0Var.y = 1;
                    Object objEmit23 = this.y.emit(objC10, g0Var);
                    kotlin.coroutines.intrinsics.a aVar23 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit23 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i46 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj25);
                }
                return kotlin.y.a;
            case 23:
                if (dVar instanceof com.app.mlounge.data.local.prefs.h0) {
                    h0Var = (com.app.mlounge.data.local.prefs.h0) dVar;
                    int i47 = h0Var.y;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        h0Var.y = i47 - Integer.MIN_VALUE;
                    } else {
                        h0Var = new com.app.mlounge.data.local.prefs.h0(this, dVar);
                    }
                } else {
                    h0Var = new com.app.mlounge.data.local.prefs.h0(this, dVar);
                }
                Object obj26 = h0Var.e;
                int i48 = h0Var.y;
                if (i48 == 0) {
                    kotlin.a.e(obj26);
                    String str4 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.M0);
                    if (str4 == null) {
                        str4 = "fit";
                    }
                    h0Var.y = 1;
                    Object objEmit24 = this.y.emit(str4, h0Var);
                    kotlin.coroutines.intrinsics.a aVar24 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit24 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i48 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj26);
                }
                return kotlin.y.a;
            case 24:
                if (dVar instanceof com.app.mlounge.data.local.prefs.i0) {
                    i0Var = (com.app.mlounge.data.local.prefs.i0) dVar;
                    int i49 = i0Var.y;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        i0Var.y = i49 - Integer.MIN_VALUE;
                    } else {
                        i0Var = new com.app.mlounge.data.local.prefs.i0(this, dVar);
                    }
                } else {
                    i0Var = new com.app.mlounge.data.local.prefs.i0(this, dVar);
                }
                Object obj27 = i0Var.e;
                int i50 = i0Var.y;
                if (i50 == 0) {
                    kotlin.a.e(obj27);
                    Boolean bool6 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.N0);
                    Boolean boolValueOf6 = Boolean.valueOf(bool6 != null ? bool6.booleanValue() : true);
                    i0Var.y = 1;
                    Object objEmit25 = this.y.emit(boolValueOf6, i0Var);
                    kotlin.coroutines.intrinsics.a aVar25 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit25 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i50 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj27);
                }
                return kotlin.y.a;
            case 25:
                if (dVar instanceof com.app.mlounge.data.local.prefs.j0) {
                    j0Var = (com.app.mlounge.data.local.prefs.j0) dVar;
                    int i51 = j0Var.y;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        j0Var.y = i51 - Integer.MIN_VALUE;
                    } else {
                        j0Var = new com.app.mlounge.data.local.prefs.j0(this, dVar);
                    }
                } else {
                    j0Var = new com.app.mlounge.data.local.prefs.j0(this, dVar);
                }
                Object obj28 = j0Var.e;
                int i52 = j0Var.y;
                if (i52 == 0) {
                    kotlin.a.e(obj28);
                    Float f = (Float) ((androidx.datastore.preferences.core.a) obj).c(y1.O0);
                    Float f2 = new Float(f != null ? f.floatValue() : 0.5f);
                    j0Var.y = 1;
                    Object objEmit26 = this.y.emit(f2, j0Var);
                    kotlin.coroutines.intrinsics.a aVar26 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit26 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i52 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj28);
                }
                return kotlin.y.a;
            case 26:
                if (dVar instanceof com.app.mlounge.data.local.prefs.k0) {
                    k0Var = (com.app.mlounge.data.local.prefs.k0) dVar;
                    int i53 = k0Var.y;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        k0Var.y = i53 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new com.app.mlounge.data.local.prefs.k0(this, dVar);
                    }
                } else {
                    k0Var = new com.app.mlounge.data.local.prefs.k0(this, dVar);
                }
                Object obj29 = k0Var.e;
                int i54 = k0Var.y;
                if (i54 == 0) {
                    kotlin.a.e(obj29);
                    Boolean bool7 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.l0);
                    Boolean boolValueOf7 = Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false);
                    k0Var.y = 1;
                    Object objEmit27 = this.y.emit(boolValueOf7, k0Var);
                    kotlin.coroutines.intrinsics.a aVar27 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit27 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i54 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj29);
                }
                return kotlin.y.a;
            case 27:
                if (dVar instanceof com.app.mlounge.data.local.prefs.l0) {
                    l0Var = (com.app.mlounge.data.local.prefs.l0) dVar;
                    int i55 = l0Var.y;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        l0Var.y = i55 - Integer.MIN_VALUE;
                    } else {
                        l0Var = new com.app.mlounge.data.local.prefs.l0(this, dVar);
                    }
                } else {
                    l0Var = new com.app.mlounge.data.local.prefs.l0(this, dVar);
                }
                Object obj30 = l0Var.e;
                int i56 = l0Var.y;
                if (i56 == 0) {
                    kotlin.a.e(obj30);
                    Boolean bool8 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.P0);
                    Boolean boolValueOf8 = Boolean.valueOf(bool8 != null ? bool8.booleanValue() : false);
                    l0Var.y = 1;
                    Object objEmit28 = this.y.emit(boolValueOf8, l0Var);
                    kotlin.coroutines.intrinsics.a aVar28 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit28 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i56 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj30);
                }
                return kotlin.y.a;
            case 28:
                if (dVar instanceof com.app.mlounge.data.local.prefs.m0) {
                    m0Var = (com.app.mlounge.data.local.prefs.m0) dVar;
                    int i57 = m0Var.y;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        m0Var.y = i57 - Integer.MIN_VALUE;
                    } else {
                        m0Var = new com.app.mlounge.data.local.prefs.m0(this, dVar);
                    }
                } else {
                    m0Var = new com.app.mlounge.data.local.prefs.m0(this, dVar);
                }
                Object obj31 = m0Var.e;
                int i58 = m0Var.y;
                if (i58 == 0) {
                    kotlin.a.e(obj31);
                    Boolean bool9 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.Q0);
                    Boolean boolValueOf9 = Boolean.valueOf(bool9 != null ? bool9.booleanValue() : true);
                    m0Var.y = 1;
                    Object objEmit29 = this.y.emit(boolValueOf9, m0Var);
                    kotlin.coroutines.intrinsics.a aVar29 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit29 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i58 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj31);
                }
                return kotlin.y.a;
            default:
                if (dVar instanceof com.app.mlounge.data.local.prefs.n0) {
                    n0Var = (com.app.mlounge.data.local.prefs.n0) dVar;
                    int i59 = n0Var.y;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        n0Var.y = i59 - Integer.MIN_VALUE;
                    } else {
                        n0Var = new com.app.mlounge.data.local.prefs.n0(this, dVar);
                    }
                } else {
                    n0Var = new com.app.mlounge.data.local.prefs.n0(this, dVar);
                }
                Object obj32 = n0Var.e;
                int i60 = n0Var.y;
                if (i60 == 0) {
                    kotlin.a.e(obj32);
                    Boolean bool10 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.R0);
                    Boolean boolValueOf10 = Boolean.valueOf(bool10 != null ? bool10.booleanValue() : false);
                    n0Var.y = 1;
                    Object objEmit30 = this.y.emit(boolValueOf10, n0Var);
                    kotlin.coroutines.intrinsics.a aVar30 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit30 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i60 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj32);
                }
                return kotlin.y.a;
        }
    }
}
