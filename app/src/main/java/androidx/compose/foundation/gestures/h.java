package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.compose.foundation.text.selection.n nVar, String str, long j, androidx.compose.ui.text.l0 l0Var, androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.ui.text.input.q qVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = nVar;
        this.B = str;
        this.z = j;
        this.C = l0Var;
        this.D = c1Var;
        this.E = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                h hVar = new h((b3) this.B, (j) this.C, (c) this.D, this.z, (Job) this.E, dVar);
                hVar.A = obj;
                return hVar;
            case 1:
                return new h((androidx.compose.foundation.text.selection.n) this.A, (String) this.B, this.z, (androidx.compose.ui.text.l0) this.C, (androidx.compose.foundation.text.selection.c1) this.D, (androidx.compose.ui.text.input.q) this.E, dVar);
            default:
                return new h((com.app.mlounge.ui.screens.player.z0) this.C, (androidx.media3.exoplayer.source.a) this.D, (com.app.mlounge.ui.screens.player.b1) this.E, this.z, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((h) create((l2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((h) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((h) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d5 A[LOOP:1: B:24:0x00a2->B:28:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b5 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        androidx.media3.exoplayer.c0 c0Var;
        com.app.mlounge.ui.screens.player.b1 b1Var;
        int i;
        int i2;
        androidx.media3.common.b1 b1Var2;
        int i3;
        int i4;
        androidx.media3.common.r rVarA;
        int i5 = this.e;
        long j = this.z;
        int i6 = 0;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        switch (i5) {
            case 0:
                c cVar = (c) obj3;
                j jVar = (j) obj4;
                b3 b3Var = (b3) this.B;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                l2 l2Var = (l2) this.A;
                b3Var.e = j.L0(jVar, cVar, j);
                androidx.compose.animation.core.a aVar2 = new androidx.compose.animation.core.a(jVar, b3Var, (Job) obj2, l2Var);
                g gVar = new g(i6, jVar, b3Var, cVar);
                this.y = 1;
                return b3Var.a(aVar2, gVar, this) == aVar ? aVar : yVar;
            case 1:
                androidx.compose.ui.text.input.q qVar = (androidx.compose.ui.text.input.q) obj2;
                String str = (String) this.B;
                androidx.compose.foundation.text.selection.c1 c1Var = (androidx.compose.foundation.text.selection.c1) obj3;
                int i8 = this.y;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.text.selection.n nVar = (androidx.compose.foundation.text.selection.n) this.A;
                    this.y = 1;
                    androidx.compose.foundation.text.selection.t tVar = (androidx.compose.foundation.text.selection.t) nVar;
                    tVar.getClass();
                    if (str.length() == 0) {
                        objWithContext = null;
                    } else {
                        long j2 = this.z;
                        if (androidx.compose.ui.text.l0.c(j2)) {
                            objWithContext = null;
                        } else {
                            objWithContext = BuildersKt.withContext(tVar.a, new androidx.compose.foundation.text.selection.r(tVar, new androidx.compose.foundation.text.selection.s(j2, tVar, str, null), null), this);
                        }
                    }
                    if (objWithContext == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objWithContext = obj;
                    str = str;
                }
                androidx.compose.ui.text.l0 l0Var = (androidx.compose.ui.text.l0) objWithContext;
                if (l0Var == null) {
                    return yVar;
                }
                long j3 = l0Var.a;
                long jB = androidx.compose.ui.text.d0.b(qVar.j((int) (j3 >> 32)), qVar.j((int) (j3 & 4294967295L)));
                if (androidx.compose.ui.text.l0.a(jB, (androidx.compose.ui.text.l0) obj4) || !kotlin.jvm.internal.l.a(c1Var.n().a.y, str) || qVar != c1Var.b) {
                    return yVar;
                }
                c1Var.c.invoke(androidx.compose.foundation.text.selection.c1.e(c1Var.n().a, jB));
                c1Var.w = new androidx.compose.ui.text.l0(jB);
                return yVar;
            default:
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0Var = (androidx.media3.exoplayer.c0) this.B;
                    b1Var = (com.app.mlounge.ui.screens.player.b1) this.A;
                    kotlin.a.e(obj);
                    androidx.media3.common.c1 c1VarM = c0Var.m();
                    c1VarM.getClass();
                    com.google.common.collect.h0 h0Var = c1VarM.a;
                    h0Var.getClass();
                    i = 0;
                    for (Object obj5 : h0Var) {
                        i2 = i + 1;
                        if (i >= 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        b1Var2 = (androidx.media3.common.b1) obj5;
                        if (b1Var2.b.c == 3) {
                            i3 = b1Var2.a;
                            for (i4 = 0; i4 < i3; i4++) {
                                rVarA = b1Var2.a(i4);
                                rVarA.getClass();
                                if (kotlin.jvm.internal.l.a(rVarA.b, b1Var.a)) {
                                    androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(b1Var2.b, i4);
                                    androidx.media3.exoplayer.trackselection.j jVar2 = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                                    jVar2.getClass();
                                    androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar2);
                                    iVar.e(x0Var);
                                    c0Var.O(iVar.a());
                                }
                                break;
                            }
                        }
                        i = i2;
                    }
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    return yVar;
                }
                kotlin.a.e(obj);
                c0Var = ((com.app.mlounge.ui.screens.player.z0) obj4).g;
                if (c0Var != null) {
                    com.app.mlounge.ui.screens.player.b1 b1Var3 = (com.app.mlounge.ui.screens.player.b1) obj2;
                    c0Var.K((androidx.media3.exoplayer.source.a) obj3);
                    androidx.media3.exoplayer.trackselection.j jVar3 = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                    jVar3.getClass();
                    androidx.media3.exoplayer.trackselection.i iVar2 = new androidx.media3.exoplayer.trackselection.i(jVar3);
                    iVar2.i(3, false);
                    iVar2.f(b1Var3.c);
                    c0Var.O(iVar2.a());
                    c0Var.C();
                    c0Var.G(j);
                    c0Var.M(true);
                    this.A = b1Var3;
                    this.B = c0Var;
                    this.y = 1;
                    if (DelayKt.delay(500L, this) == aVar) {
                        return aVar;
                    }
                    b1Var = b1Var3;
                    androidx.media3.common.c1 c1VarM2 = c0Var.m();
                    c1VarM2.getClass();
                    com.google.common.collect.h0 h0Var2 = c1VarM2.a;
                    h0Var2.getClass();
                    i = 0;
                    while (r3.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        b1Var2 = (androidx.media3.common.b1) obj5;
                        if (b1Var2.b.c == 3) {
                            i3 = b1Var2.a;
                            while (i4 < i3) {
                                rVarA = b1Var2.a(i4);
                                rVarA.getClass();
                                if (kotlin.jvm.internal.l.a(rVarA.b, b1Var.a)) {
                                    androidx.media3.common.x0 x0Var2 = new androidx.media3.common.x0(b1Var2.b, i4);
                                    androidx.media3.exoplayer.trackselection.j jVar4 = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                                    jVar4.getClass();
                                    androidx.media3.exoplayer.trackselection.i iVar3 = new androidx.media3.exoplayer.trackselection.i(jVar4);
                                    iVar3.e(x0Var2);
                                    c0Var.O(iVar3.a());
                                }
                                break;
                            }
                        }
                        i = i2;
                    }
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    return yVar;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b3 b3Var, j jVar, c cVar, long j, Job job, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = b3Var;
        this.C = jVar;
        this.D = cVar;
        this.z = j;
        this.E = job;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.app.mlounge.ui.screens.player.z0 z0Var, androidx.media3.exoplayer.source.a aVar, com.app.mlounge.ui.screens.player.b1 b1Var, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = z0Var;
        this.D = aVar;
        this.E = b1Var;
        this.z = j;
    }
}
