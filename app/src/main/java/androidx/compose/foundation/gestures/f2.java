package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends androidx.compose.ui.node.j implements androidx.compose.ui.input.key.e, androidx.compose.ui.node.u1, androidx.compose.ui.node.r1, androidx.compose.ui.input.indirect.c, androidx.compose.ui.node.h {
    public k1 N;
    public okio.internal.j O;
    public boolean P;
    public androidx.compose.foundation.interaction.k Q;
    public Channel R;
    public androidx.compose.foundation.interaction.b S;
    public boolean T;
    public boolean U;
    public p V;
    public s W;
    public r X;
    public q Y;
    public com.google.firebase.crashlytics.internal.model.t1 Z;
    public com.google.firebase.platforminfo.c a0;
    public long b0;
    public y2 c0;
    public v0 d0;
    public long e0;
    public androidx.compose.foundation.n f0;
    public l g0;
    public final androidx.compose.ui.input.nestedscroll.d h0;
    public final q1 i0;
    public final l j0;
    public final m2 k0;
    public final z1 l0;
    public final androidx.compose.ui.focus.e0 m0;
    public final j n0;
    public androidx.compose.animation.core.g0 o0;
    public d2 p0;
    public j1 q0;

    public f2(androidx.compose.foundation.n nVar, l lVar, k1 k1Var, g2 g2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        okio.internal.j jVar = x1.a;
        this.N = k1Var;
        this.O = jVar;
        this.P = z;
        this.Q = kVar;
        this.b0 = 9205357640488583168L;
        this.e0 = 0L;
        this.f0 = nVar;
        this.g0 = lVar;
        androidx.compose.ui.input.nestedscroll.d dVar = new androidx.compose.ui.input.nestedscroll.d();
        this.h0 = dVar;
        q1 q1Var = new q1();
        q1Var.L = z;
        L0(q1Var);
        this.i0 = q1Var;
        l lVar2 = new l(new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(x1.d)));
        this.j0 = lVar2;
        androidx.compose.foundation.n nVar2 = this.f0;
        l lVar3 = this.g0;
        m2 m2Var = new m2(g2Var, nVar2, lVar3 == null ? lVar2 : lVar3, k1Var, z2, dVar, this, new a2(this, 0));
        this.k0 = m2Var;
        z1 z1Var = new z1(m2Var, z);
        this.l0 = z1Var;
        androidx.compose.ui.focus.e0 e0Var = new androidx.compose.ui.focus.e0(2, null, 10);
        L0(e0Var);
        this.m0 = e0Var;
        j jVar2 = new j(k1Var, m2Var, z2, new a2(this, 1));
        L0(jVar2);
        this.n0 = jVar2;
        L0(new androidx.compose.ui.input.nestedscroll.i(z1Var, dVar));
        androidx.compose.foundation.relocation.h hVar = new androidx.compose.foundation.relocation.h();
        hVar.L = jVar2;
        L0(hVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O0(f2 f2Var, kotlin.coroutines.jvm.internal.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i = h0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0Var.z = i - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(f2Var, cVar);
            }
        } else {
            h0Var = new h0(f2Var, cVar);
        }
        Object obj = h0Var.e;
        int i2 = h0Var.z;
        kotlin.coroutines.d dVar = null;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar = f2Var.S;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = f2Var.Q;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.a aVar = new androidx.compose.foundation.interaction.a(bVar);
                    h0Var.z = 1;
                    Object objA = kVar.a(aVar, h0Var);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                }
            }
            BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new androidx.activity.compose.p(new w(0L, false), f2Var, dVar, 5), 3, null);
            return kotlin.y.a;
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        f2Var.S = null;
        BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new androidx.activity.compose.p(new w(0L, false), f2Var, dVar, 5), 3, null);
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P0(f2 f2Var, v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        i0 i0Var;
        androidx.compose.foundation.interaction.k kVar;
        androidx.compose.foundation.interaction.b bVar;
        v vVar2;
        androidx.compose.foundation.interaction.b bVar2;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.B = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(f2Var, cVar);
            }
        } else {
            i0Var = new i0(f2Var, cVar);
        }
        Object obj = i0Var.z;
        int i2 = i0Var.B;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar3 = f2Var.S;
            if (bVar3 != null && (kVar = f2Var.Q) != null) {
                androidx.compose.foundation.interaction.a aVar2 = new androidx.compose.foundation.interaction.a(bVar3);
                i0Var.e = vVar;
                i0Var.B = 1;
                if (kVar.a(aVar2, i0Var) != aVar) {
                }
                return aVar;
            }
            f2Var.S = bVar;
            long j = vVar.a;
            return kotlin.y.a;
        }
        if (i2 == 1) {
            vVar = i0Var.e;
            kotlin.a.e(obj);
        } else {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = i0Var.y;
            vVar2 = i0Var.e;
            kotlin.a.e(obj);
        }
        bVar = bVar2;
        vVar = vVar2;
        f2Var.S = bVar;
        long j2 = vVar.a;
        return kotlin.y.a;
        bVar = new androidx.compose.foundation.interaction.b();
        androidx.compose.foundation.interaction.k kVar2 = f2Var.Q;
        if (kVar2 != null) {
            i0Var.e = vVar;
            i0Var.y = bVar;
            i0Var.B = 2;
            if (kVar2.a(bVar, i0Var) != aVar) {
                vVar2 = vVar;
                bVar2 = bVar;
                bVar = bVar2;
                vVar = vVar2;
            }
            return aVar;
        }
        f2Var.S = bVar;
        long j3 = vVar.a;
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q0(f2 f2Var, w wVar, kotlin.coroutines.jvm.internal.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i = j0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.A = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(f2Var, cVar);
            }
        } else {
            j0Var = new j0(f2Var, cVar);
        }
        Object obj = j0Var.y;
        int i2 = j0Var.A;
        kotlin.coroutines.d dVar = null;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar = f2Var.S;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = f2Var.Q;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.c cVar2 = new androidx.compose.foundation.interaction.c(bVar);
                    j0Var.e = wVar;
                    j0Var.A = 1;
                    Object objA = kVar.a(cVar2, j0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
            }
            BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new androidx.activity.compose.p(wVar, f2Var, dVar, 5), 3, null);
            return kotlin.y.a;
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wVar = j0Var.e;
        kotlin.a.e(obj);
        f2Var.S = null;
        BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new androidx.activity.compose.p(wVar, f2Var, dVar, 5), 3, null);
        return kotlin.y.a;
    }

    public static void U0(f2 f2Var, androidx.compose.ui.input.pointer.v vVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        r rVar = f2Var.X;
        if (rVar == null) {
            rVar = new r();
            rVar.o = null;
            rVar.p = Long.MAX_VALUE;
            rVar.q = false;
            f2Var.X = rVar;
        }
        rVar.o = vVar;
        rVar.p = j;
        y2 y2Var = f2Var.c0;
        k1 k1Var = f2Var.N;
        if (y2Var == null) {
            f2Var.c0 = new y2(k1Var);
        } else {
            y2Var.z = k1Var;
            y2Var.y = j2;
        }
        rVar.q = false;
        f2Var.Z = rVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        androidx.compose.ui.input.pointer.n nVar2;
        androidx.compose.ui.input.pointer.n nVar3;
        androidx.compose.ui.input.pointer.n nVar4;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        f2 f2Var = this;
        androidx.compose.ui.input.pointer.m mVar2 = mVar;
        ?? r10 = mVar2.a;
        ?? r11 = mVar2.a;
        int size = r10.size();
        int i = 0;
        while (true) {
            androidx.compose.ui.input.pointer.n nVar5 = androidx.compose.ui.input.pointer.n.y;
            nVar2 = androidx.compose.ui.input.pointer.n.e;
            if (i < size) {
                androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) r10.get(i);
                okio.internal.j jVar = f2Var.O;
                int i2 = vVar.i;
                jVar.getClass();
                if (!(i2 == 2)) {
                    f2Var.U = true;
                    if (!f2Var.P) {
                        break;
                    }
                    if (f2Var.Z == null) {
                        p pVar = f2Var.V;
                        if (pVar == null) {
                            pVar = new p();
                            pVar.o = o.z;
                            pVar.p = false;
                            f2Var.V = pVar;
                        }
                        f2Var.Z = pVar;
                    }
                    com.google.firebase.crashlytics.internal.model.t1 t1Var = f2Var.Z;
                    if (t1Var == null) {
                        net.luminis.tls.engine.impl.c.o("currentDragState should not be null");
                        return;
                    }
                    if (!(t1Var instanceof p)) {
                        boolean z2 = t1Var instanceof r;
                        androidx.compose.ui.input.pointer.n nVar6 = androidx.compose.ui.input.pointer.n.z;
                        if (z2) {
                            r rVar = (r) t1Var;
                            if (nVar != nVar2) {
                                int size2 = r10.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size2) {
                                        nVar3 = nVar5;
                                        obj3 = null;
                                        break;
                                    }
                                    Object obj6 = r10.get(i3);
                                    obj3 = obj6;
                                    nVar3 = nVar5;
                                    if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj6).a, rVar.p)) {
                                        break;
                                    }
                                    i3++;
                                    nVar5 = nVar3;
                                }
                                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) obj3;
                                if (vVar2 == null) {
                                    int size3 = r10.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size3) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = r10.get(i4);
                                        if (((androidx.compose.ui.input.pointer.v) obj5).d) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    vVar2 = (androidx.compose.ui.input.pointer.v) obj5;
                                    if (vVar2 == null) {
                                        f2Var.S0();
                                    } else {
                                        rVar.p = vVar2.a;
                                    }
                                }
                                androidx.compose.ui.input.pointer.n nVar7 = nVar3;
                                if (nVar != nVar7) {
                                    nVar4 = nVar7;
                                } else if (vVar2.b()) {
                                    nVar4 = nVar7;
                                    androidx.compose.ui.input.pointer.v vVar3 = rVar.o;
                                    if (vVar3 == null) {
                                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    long j2 = rVar.p;
                                    y2 y2Var = f2Var.c0;
                                    if (y2Var == null) {
                                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                    f2Var.T0(vVar3, j2, y2Var);
                                } else if (androidx.compose.ui.input.pointer.u.d(vVar2)) {
                                    int size4 = r10.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size4) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = r10.get(i5);
                                        if (((androidx.compose.ui.input.pointer.v) obj4).d) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) obj4;
                                    if (vVar4 == null) {
                                        f2Var.S0();
                                    } else {
                                        rVar.p = vVar4.a;
                                    }
                                    nVar4 = nVar7;
                                } else {
                                    float f = f0.f((androidx.compose.ui.platform.p2) androidx.compose.ui.node.k.h(f2Var, androidx.compose.ui.platform.l1.s), vVar2.i);
                                    y2 y2Var2 = f2Var.c0;
                                    if (y2Var2 == null) {
                                        net.luminis.tls.engine.impl.c.o("Touch slop detector not initialized.");
                                        return;
                                    }
                                    nVar4 = nVar7;
                                    long jA = y2Var2.A(vVar2.c, vVar2.g, f);
                                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                        vVar2.a();
                                        androidx.compose.ui.input.pointer.v vVar5 = rVar.o;
                                        vVar5.getClass();
                                        f2Var.Z0(vVar5, vVar2, jA);
                                        f2Var.Y0(vVar2, jA);
                                        long j3 = vVar2.a;
                                        s sVar = f2Var.W;
                                        if (sVar == null) {
                                            sVar = new s();
                                            sVar.o = Long.MAX_VALUE;
                                            f2Var.W = sVar;
                                        }
                                        sVar.o = j3;
                                        f2Var.Z = sVar;
                                    } else {
                                        rVar.q = true;
                                    }
                                }
                                if (nVar == nVar6 && rVar.q) {
                                    if (!vVar2.b()) {
                                        rVar.q = false;
                                        nVar3 = nVar4;
                                        break;
                                    }
                                    androidx.compose.ui.input.pointer.v vVar6 = rVar.o;
                                    if (vVar6 == null) {
                                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    long j4 = rVar.p;
                                    y2 y2Var3 = f2Var.c0;
                                    if (y2Var3 == null) {
                                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                    f2Var.T0(vVar6, j4, y2Var3);
                                }
                                nVar3 = nVar4;
                            }
                            break;
                        }
                        nVar4 = nVar5;
                        if (t1Var instanceof q) {
                            q qVar = (q) t1Var;
                            if (nVar == nVar6) {
                                int size5 = r10.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size5) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((androidx.compose.ui.input.pointer.v) r10.get(i6)).b()) {
                                            z = false;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                int size6 = r10.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size6) {
                                        if (((androidx.compose.ui.input.pointer.v) r10.get(i7)).d) {
                                            if (!r10.isEmpty()) {
                                                if (!z) {
                                                    break;
                                                }
                                                long j5 = ((androidx.compose.ui.input.pointer.v) kotlin.collections.o.K(r10)).c;
                                                androidx.compose.ui.input.pointer.v vVar7 = qVar.o;
                                                vVar7.getClass();
                                                long jD = androidx.compose.ui.geometry.b.d(j5, vVar7.c);
                                                androidx.compose.ui.input.pointer.v vVar8 = qVar.o;
                                                if (vVar8 != null) {
                                                    U0(f2Var, vVar8, qVar.p, jD, 8);
                                                    break;
                                                } else {
                                                    net.luminis.tls.engine.impl.c.o("AwaitGesturePickup.initialDown was not initialized.");
                                                    return;
                                                }
                                            }
                                            break;
                                        }
                                        i7++;
                                    }
                                    f2Var.S0();
                                    break;
                                }
                            }
                            nVar3 = nVar4;
                            break;
                            break;
                        }
                        if (!(t1Var instanceof s)) {
                            coil3.g.a();
                            return;
                        }
                        s sVar2 = (s) t1Var;
                        nVar5 = nVar4;
                        if (nVar == nVar5) {
                            long j6 = sVar2.o;
                            int size7 = r10.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size7) {
                                    nVar3 = nVar5;
                                    obj = null;
                                    break;
                                }
                                obj = r10.get(i8);
                                nVar3 = nVar5;
                                if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj).a, j6)) {
                                    break;
                                }
                                i8++;
                                nVar5 = nVar3;
                            }
                            androidx.compose.ui.input.pointer.v vVar9 = (androidx.compose.ui.input.pointer.v) obj;
                            if (vVar9 == null) {
                                break;
                            }
                            boolean zD = androidx.compose.ui.input.pointer.u.d(vVar9);
                            t tVar = t.a;
                            if (!zD) {
                                if (!vVar9.b()) {
                                    if (androidx.compose.ui.geometry.b.c(androidx.compose.ui.input.pointer.u.g(vVar9, true)) != 0.0f) {
                                        f2Var.Y0(vVar9, androidx.compose.ui.input.pointer.u.g(vVar9, false));
                                        vVar9.a();
                                        break;
                                    }
                                    break;
                                }
                                f2Var.W0().mo28trySendJP2dKIU(tVar);
                            } else {
                                int size8 = r10.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size8) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = r10.get(i9);
                                    if (((androidx.compose.ui.input.pointer.v) obj2).d) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                androidx.compose.ui.input.pointer.v vVar10 = (androidx.compose.ui.input.pointer.v) obj2;
                                if (vVar10 == null) {
                                    if (vVar9.b() || !androidx.compose.ui.input.pointer.u.d(vVar9)) {
                                        f2Var.W0().mo28trySendJP2dKIU(tVar);
                                    } else {
                                        okhttp3.internal.platform.android.g.e(f2Var.X0(), vVar9, 0L);
                                        float fE = ((androidx.compose.ui.platform.p2) androidx.compose.ui.node.k.h(f2Var, androidx.compose.ui.platform.l1.s)).e();
                                        long jH = f2Var.X0().h(com.google.android.gms.dynamite.g.d(fE, fE));
                                        androidx.compose.ui.input.pointer.util.b bVar = (androidx.compose.ui.input.pointer.util.b) f2Var.X0().e;
                                        androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar.b;
                                        androidx.compose.ui.input.pointer.util.a[] aVarArr = eVar.d;
                                        kotlin.collections.n.K(0, aVarArr.length, null, aVarArr);
                                        eVar.e = 0;
                                        androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar.c;
                                        androidx.compose.ui.input.pointer.util.a[] aVarArr2 = eVar2.d;
                                        kotlin.collections.n.K(0, aVarArr2.length, null, aVarArr2);
                                        eVar2.e = 0;
                                        bVar.a = 0L;
                                        f2Var.W0().mo28trySendJP2dKIU(new w(m0.a(jH), false));
                                        f2Var.U = false;
                                    }
                                    f2Var.S0();
                                } else {
                                    sVar2.o = vVar10.a;
                                }
                            }
                        }
                        break;
                        break;
                    }
                    p pVar2 = (p) t1Var;
                    if (!r10.isEmpty() && x2.e(mVar2, false)) {
                        androidx.compose.ui.input.pointer.v vVar11 = (androidx.compose.ui.input.pointer.v) kotlin.collections.o.K(r10);
                        int i10 = g0.a[pVar2.o.ordinal()];
                        o oVar = o.y;
                        o oVar2 = o.e;
                        o oVar3 = i10 == 1 ? !f2Var.a1() ? oVar2 : oVar : pVar2.o;
                        pVar2.o = oVar3;
                        if (nVar == nVar2 && oVar3 == oVar) {
                            vVar11.a();
                            pVar2.p = true;
                        }
                        if (nVar == nVar5) {
                            if (oVar3 == oVar2) {
                                U0(f2Var, vVar11, vVar11.a, 0L, 12);
                            } else if (pVar2.p) {
                                f2Var.Z0(vVar11, vVar11, 0L);
                                f2Var.Y0(vVar11, 0L);
                                long j7 = vVar11.a;
                                s sVar3 = f2Var.W;
                                if (sVar3 == null) {
                                    sVar3 = new s();
                                    sVar3.o = Long.MAX_VALUE;
                                    f2Var.W = sVar3;
                                }
                                sVar3.o = j7;
                                f2Var.Z = sVar3;
                            }
                        }
                    }
                    nVar3 = nVar5;
                    break;
                    break;
                }
                i++;
                mVar2 = mVar;
            }
            nVar3 = nVar5;
            break;
        }
        if (f2Var.P) {
            if (nVar == nVar2 && mVar.f == 6) {
                if (f2Var.q0 == null) {
                    f2Var = this;
                    f2Var.q0 = new j1(f2Var.k0, new com.google.firebase.platforminfo.c(ViewConfiguration.get(androidx.compose.ui.node.k.v(f2Var).getContext())), new b2(2, this, f2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), androidx.compose.ui.node.k.t(f2Var).W);
                }
                j1 j1Var = f2Var.q0;
                if (j1Var != null) {
                    CoroutineScope coroutineScopeZ0 = f2Var.z0();
                    if (((Job) j1Var.g) == null) {
                        j1Var.g = BuildersKt__Builders_commonKt.launch$default(coroutineScopeZ0, null, null, new androidx.activity.compose.p(j1Var, (kotlin.coroutines.d) null, 3), 3, null);
                    }
                }
            }
            j1 j1Var2 = f2Var.q0;
            if (j1Var2 == null || mVar.f != 6) {
                return;
            }
            int size9 = r10.size();
            for (int i11 = 0; i11 < size9; i11++) {
                if (((androidx.compose.ui.input.pointer.v) r10.get(i11)).b()) {
                    return;
                }
            }
            if (nVar == nVar2 && j1Var2.a) {
                j1Var2.d(mVar);
                int size10 = r11.size();
                for (int i12 = 0; i12 < size10; i12++) {
                    ((androidx.compose.ui.input.pointer.v) r11.get(i12)).a();
                }
            }
            if (nVar == nVar3 && !j1Var2.a && j1Var2.d(mVar)) {
                int size11 = r11.size();
                for (int i13 = 0; i13 < size11; i13++) {
                    ((androidx.compose.ui.input.pointer.v) r11.get(i13)).a();
                }
            }
        }
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        if (this.K) {
            androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.k.t(this).W;
            l lVar = this.j0;
            lVar.getClass();
            lVar.a = new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(cVar));
        }
        j1 j1Var = this.q0;
        if (j1Var != null) {
            j1Var.e = androidx.compose.ui.node.k.t(this).W;
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        if (this.U) {
            S0();
            if (this.T) {
                W0().mo28trySendJP2dKIU(t.a);
            }
            this.a0 = null;
        }
        this.U = false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.T = false;
        R0();
        this.e0 = 0L;
    }

    @Override // androidx.compose.ui.input.indirect.c
    public final void Q(androidx.appcompat.widget.x xVar, androidx.compose.ui.input.pointer.n nVar) {
        Object obj;
        Object obj2;
        boolean z;
        androidx.compose.ui.input.pointer.n nVar2;
        androidx.compose.ui.input.pointer.n nVar3;
        Object obj3;
        float fIntBitsToFloat;
        Object obj4;
        int i = xVar.y;
        ArrayList arrayList = (ArrayList) xVar.z;
        if (this.P) {
            if (this.d0 == null) {
                this.d0 = new v0(this);
            }
            v0 v0Var = this.d0;
            if (v0Var != null) {
                f2 f2Var = v0Var.a;
                if (v0Var.f == null) {
                    q0 q0Var = v0Var.b;
                    if (q0Var == null) {
                        q0Var = new q0();
                        q0Var.H = p0.z;
                        q0Var.I = false;
                        v0Var.b = q0Var;
                    }
                    v0Var.f = q0Var;
                }
                okhttp3.internal.platform.android.g gVar = v0Var.f;
                if (gVar == null) {
                    net.luminis.tls.engine.impl.c.o("currentDragState should not be null");
                    return;
                }
                boolean z2 = gVar instanceof q0;
                androidx.compose.ui.input.pointer.n nVar4 = androidx.compose.ui.input.pointer.n.e;
                androidx.compose.ui.input.pointer.n nVar5 = androidx.compose.ui.input.pointer.n.y;
                if (z2) {
                    q0 q0Var2 = (q0) gVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        androidx.compose.ui.input.indirect.b bVar = (androidx.compose.ui.input.indirect.b) arrayList.get(i2);
                        if (bVar.h || !bVar.d) {
                            return;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar2 = (androidx.compose.ui.input.indirect.b) kotlin.collections.o.K(arrayList);
                    int i3 = u0.a[q0Var2.H.ordinal()];
                    p0 p0Var = p0.y;
                    p0 p0Var2 = p0.e;
                    p0 p0Var3 = i3 == 1 ? !f2Var.a1() ? p0Var2 : p0Var : q0Var2.H;
                    q0Var2.H = p0Var3;
                    if (nVar == nVar4 && p0Var3 == p0Var) {
                        bVar2.i = true;
                        q0Var2.I = true;
                    }
                    if (nVar == nVar5) {
                        if (p0Var3 == p0Var2) {
                            v0.c(v0Var, bVar2, bVar2.a, 0L, 12);
                            return;
                        }
                        if (q0Var2.I) {
                            v0Var.f(bVar2, bVar2, new androidx.compose.ui.input.indirect.a(i), 0L);
                            v0Var.e(bVar2, new androidx.compose.ui.input.indirect.a(i), 0L);
                            long j = bVar2.a;
                            t0 t0Var = v0Var.c;
                            if (t0Var == null) {
                                t0Var = new t0();
                                t0Var.H = Long.MAX_VALUE;
                                v0Var.c = t0Var;
                            }
                            t0Var.H = j;
                            v0Var.f = t0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = gVar instanceof s0;
                androidx.compose.ui.input.pointer.n nVar6 = androidx.compose.ui.input.pointer.n.z;
                Object obj5 = null;
                if (!z3) {
                    if (gVar instanceof r0) {
                        r0 r0Var = (r0) gVar;
                        if (nVar != nVar6) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                z = true;
                                break;
                            } else {
                                if (((androidx.compose.ui.input.indirect.b) arrayList.get(i4)).i) {
                                    z = false;
                                    break;
                                }
                                i4++;
                            }
                        }
                        int size3 = arrayList.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            if (((androidx.compose.ui.input.indirect.b) arrayList.get(i5)).d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    long J = org.jsoup.helper.n.J((androidx.compose.ui.input.indirect.b) kotlin.collections.o.K(arrayList), f2Var.N, new androidx.compose.ui.input.indirect.a(i));
                                    androidx.compose.ui.input.indirect.b bVar3 = r0Var.H;
                                    bVar3.getClass();
                                    long jD = androidx.compose.ui.geometry.b.d(J, org.jsoup.helper.n.J(bVar3, f2Var.N, new androidx.compose.ui.input.indirect.a(i)));
                                    androidx.compose.ui.input.indirect.b bVar4 = r0Var.H;
                                    if (bVar4 != null) {
                                        v0.c(v0Var, bVar4, r0Var.I, jD, 8);
                                        return;
                                    } else {
                                        net.luminis.tls.engine.impl.c.o("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        v0Var.a();
                        return;
                    }
                    if (!(gVar instanceof t0)) {
                        coil3.g.a();
                        return;
                    }
                    t0 t0Var2 = (t0) gVar;
                    if (nVar != nVar5) {
                        return;
                    }
                    long j2 = t0Var2.H;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.indirect.b) obj).a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar5 = (androidx.compose.ui.input.indirect.b) obj;
                    if (bVar5 == null) {
                        return;
                    }
                    boolean zB = org.jsoup.helper.n.b(bVar5);
                    t tVar = t.a;
                    if (!zB) {
                        if (bVar5.i) {
                            f2Var.V0(tVar);
                            return;
                        }
                        k1 k1Var = f2Var.N;
                        androidx.compose.ui.input.indirect.a aVar = new androidx.compose.ui.input.indirect.a(i);
                        if (androidx.compose.ui.geometry.b.c(androidx.compose.ui.geometry.b.d(org.jsoup.helper.n.J(bVar5, k1Var, aVar), org.jsoup.helper.n.K(bVar5, k1Var, aVar))) == 0.0f) {
                            return;
                        }
                        k1 k1Var2 = f2Var.N;
                        androidx.compose.ui.input.indirect.a aVar2 = new androidx.compose.ui.input.indirect.a(i);
                        v0Var.e(bVar5, new androidx.compose.ui.input.indirect.a(i), bVar5.i ? 0L : androidx.compose.ui.geometry.b.d(org.jsoup.helper.n.J(bVar5, k1Var2, aVar2), org.jsoup.helper.n.K(bVar5, k1Var2, aVar2)));
                        bVar5.i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i7);
                        if (((androidx.compose.ui.input.indirect.b) obj2).d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar6 = (androidx.compose.ui.input.indirect.b) obj2;
                    if (bVar6 != null) {
                        t0Var2.H = bVar6.a;
                        return;
                    }
                    if (bVar5.i || !org.jsoup.helper.n.b(bVar5)) {
                        f2Var.V0(tVar);
                    } else {
                        org.jsoup.helper.n.a(v0Var.d(), bVar5, f2Var.N, new androidx.compose.ui.input.indirect.a(i), v0Var.j, v0Var.l);
                        float fE = ((androidx.compose.ui.platform.p2) androidx.compose.ui.node.k.h(f2Var, androidx.compose.ui.platform.l1.s)).e();
                        long jH = v0Var.d().h(com.google.android.gms.dynamite.g.d(fE, fE));
                        androidx.compose.ui.input.pointer.util.b bVar7 = (androidx.compose.ui.input.pointer.util.b) v0Var.d().e;
                        androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar7.b;
                        androidx.compose.ui.input.pointer.util.a[] aVarArr = eVar.d;
                        kotlin.collections.n.K(0, aVarArr.length, null, aVarArr);
                        eVar.e = 0;
                        androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar7.c;
                        androidx.compose.ui.input.pointer.util.a[] aVarArr2 = eVar2.d;
                        kotlin.collections.n.K(0, aVarArr2.length, null, aVarArr2);
                        eVar2.e = 0;
                        bVar7.a = 0L;
                        f2Var.V0(new w(m0.a(jH), true));
                    }
                    v0Var.a();
                    return;
                }
                s0 s0Var = (s0) gVar;
                if (nVar == nVar4) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        nVar2 = nVar5;
                        nVar3 = nVar6;
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i8);
                    nVar3 = nVar6;
                    nVar2 = nVar5;
                    if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.indirect.b) obj3).a, s0Var.I)) {
                        break;
                    }
                    i8++;
                    nVar6 = nVar3;
                    nVar5 = nVar2;
                }
                androidx.compose.ui.input.indirect.b bVar8 = (androidx.compose.ui.input.indirect.b) obj3;
                if (bVar8 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i9);
                        if (((androidx.compose.ui.input.indirect.b) obj4).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    bVar8 = (androidx.compose.ui.input.indirect.b) obj4;
                    if (bVar8 == null) {
                        v0Var.a();
                        return;
                    }
                    s0Var.I = bVar8.a;
                }
                androidx.compose.ui.input.indirect.b bVar9 = bVar8;
                if (nVar == nVar2) {
                    if (bVar9.i) {
                        androidx.compose.ui.input.indirect.b bVar10 = s0Var.H;
                        if (bVar10 == null) {
                            net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = s0Var.I;
                        y2 y2Var = v0Var.i;
                        if (y2Var == null) {
                            net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        v0Var.b(bVar10, j3, y2Var);
                    } else if (org.jsoup.helper.n.b(bVar9)) {
                        int size8 = arrayList.size();
                        for (int i10 = 0; i10 < size8; i10++) {
                            Object obj6 = arrayList.get(i10);
                            if (((androidx.compose.ui.input.indirect.b) obj6).d) {
                                obj5 = obj6;
                                break;
                            }
                        }
                        androidx.compose.ui.input.indirect.b bVar11 = (androidx.compose.ui.input.indirect.b) obj5;
                        if (bVar11 == null) {
                            v0Var.a();
                        } else {
                            s0Var.I = bVar11.a;
                        }
                    } else {
                        androidx.compose.ui.platform.p2 p2Var = (androidx.compose.ui.platform.p2) androidx.compose.ui.node.k.h(f2Var, androidx.compose.ui.platform.l1.s);
                        float f = f0.a;
                        float f2 = p2Var.f();
                        y2 y2Var2 = v0Var.i;
                        if (y2Var2 == null) {
                            net.luminis.tls.engine.impl.c.o("Touch slop detector not initialized.");
                            return;
                        }
                        long J2 = org.jsoup.helper.n.J(bVar9, f2Var.N, new androidx.compose.ui.input.indirect.a(i));
                        k1 k1Var3 = f2Var.N;
                        long jFloatToRawIntBits = bVar9.g;
                        if (k1Var3 == null) {
                            bVar9 = bVar9;
                        } else {
                            if (i == 1) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                            } else if (i == 2) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                            }
                            jFloatToRawIntBits = k1Var3 == k1.y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                        }
                        long jA = y2Var2.A(J2, jFloatToRawIntBits, f2);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            bVar9.i = true;
                            bVar9 = bVar9;
                            androidx.compose.ui.input.indirect.b bVar12 = s0Var.H;
                            bVar12.getClass();
                            v0Var.f(bVar12, bVar9, new androidx.compose.ui.input.indirect.a(i), jA);
                            v0Var.e(bVar9, new androidx.compose.ui.input.indirect.a(i), jA);
                            long j4 = bVar9.a;
                            t0 t0Var3 = v0Var.c;
                            if (t0Var3 == null) {
                                t0Var3 = new t0();
                                t0Var3.H = Long.MAX_VALUE;
                                v0Var.c = t0Var3;
                            }
                            t0Var3.H = j4;
                            v0Var.f = t0Var3;
                        } else {
                            bVar9 = bVar9;
                            s0Var.J = true;
                        }
                    }
                }
                if (nVar == nVar3 && s0Var.J) {
                    if (!bVar9.i) {
                        s0Var.J = false;
                        return;
                    }
                    androidx.compose.ui.input.indirect.b bVar13 = s0Var.H;
                    if (bVar13 == null) {
                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = s0Var.I;
                    y2 y2Var3 = v0Var.i;
                    if (y2Var3 != null) {
                        v0Var.b(bVar13, j5, y2Var3);
                    } else {
                        net.luminis.tls.engine.impl.c.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    public final void R0() {
        androidx.compose.foundation.interaction.b bVar = this.S;
        if (bVar != null) {
            androidx.compose.foundation.interaction.k kVar = this.Q;
            if (kVar != null) {
                kVar.b(new androidx.compose.foundation.interaction.a(bVar));
            }
            this.S = null;
        }
    }

    public final void S0() {
        p pVar = this.V;
        o oVar = o.z;
        if (pVar == null) {
            pVar = new p();
            pVar.o = oVar;
            pVar.p = false;
            this.V = pVar;
        }
        pVar.o = oVar;
        pVar.p = false;
        this.Z = pVar;
    }

    public final void T0(androidx.compose.ui.input.pointer.v vVar, long j, y2 y2Var) {
        q qVar = this.Y;
        if (qVar == null) {
            qVar = new q();
            qVar.o = null;
            qVar.p = Long.MAX_VALUE;
            this.Y = qVar;
        }
        qVar.o = vVar;
        qVar.p = j;
        y2Var.y = 0L;
        this.Z = qVar;
    }

    public final void V0(x xVar) {
        if ((xVar instanceof v) && !this.T) {
            this.T = true;
            b1();
        }
        W0().mo28trySendJP2dKIU(xVar);
    }

    public final Channel W0() {
        Channel channel = this.R;
        if (channel != null) {
            return channel;
        }
        net.luminis.tls.engine.impl.c.o("Events channel not initialized.");
        return null;
    }

    public final com.google.firebase.platforminfo.c X0() {
        com.google.firebase.platforminfo.c cVar = this.a0;
        if (cVar != null) {
            return cVar;
        }
        net.luminis.tls.engine.impl.c.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void Y0(androidx.compose.ui.input.pointer.v vVar, long j) {
        long jE = androidx.compose.ui.node.k.s(this.e).E(0L);
        if (!androidx.compose.ui.geometry.b.b(this.b0, 9205357640488583168L) && !androidx.compose.ui.geometry.b.b(jE, this.b0)) {
            this.e0 = androidx.compose.ui.geometry.b.e(this.e0, androidx.compose.ui.geometry.b.d(jE, this.b0));
        }
        this.b0 = jE;
        okhttp3.internal.platform.android.g.e(X0(), vVar, this.e0);
        W0().mo28trySendJP2dKIU(new u(j, false));
    }

    @Override // androidx.compose.ui.input.indirect.c
    public final void Z() {
        v0 v0Var = this.d0;
        if (v0Var != null) {
            v0Var.a();
            f2 f2Var = v0Var.a;
            if (f2Var.T) {
                f2Var.V0(t.a);
            }
            v0Var.g = null;
            w0 w0Var = v0Var.k;
            w0Var.a = 0;
            w0Var.b.clear();
        }
    }

    public final void Z0(androidx.compose.ui.input.pointer.v vVar, androidx.compose.ui.input.pointer.v vVar2, long j) {
        if (this.a0 == null) {
            this.a0 = new com.google.firebase.platforminfo.c(15);
        }
        okhttp3.internal.platform.android.g.e(X0(), vVar, 0L);
        long jD = androidx.compose.ui.geometry.b.d(vVar2.c, j);
        this.e0 = 0L;
        okio.internal.j jVar = this.O;
        int i = vVar.i;
        jVar.getClass();
        if (i == 2) {
            return;
        }
        if (!this.T) {
            if (this.R == null) {
                this.R = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            }
            b1();
        }
        this.b0 = androidx.compose.ui.node.k.s(this).E(0L);
        W0().mo28trySendJP2dKIU(new v(jD));
    }

    public final boolean a1() {
        m2 m2Var = this.k0;
        if (m2Var.a.a()) {
            return true;
        }
        androidx.compose.foundation.n nVar = m2Var.b;
        if (nVar == null) {
            return false;
        }
        androidx.compose.foundation.p0 p0Var = nVar.c;
        EdgeEffect edgeEffect = p0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = p0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = p0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = p0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.i, androidx.compose.ui.node.r1
    public final void b() {
        E();
        if (this.K) {
            androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.k.t(this).W;
            l lVar = this.j0;
            lVar.getClass();
            lVar.a = new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(cVar));
        }
        j1 j1Var = this.q0;
        if (j1Var != null) {
            j1Var.e = androidx.compose.ui.node.k.t(this).W;
        }
    }

    public final void b1() {
        this.T = true;
        if (this.R == null) {
            this.R = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new k0(this, null), 3, null);
    }

    public final void c1(androidx.compose.foundation.n nVar, l lVar, k1 k1Var, g2 g2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.P != z) {
            this.l0.e = z;
            this.i0.L = z;
            z3 = true;
        } else {
            z3 = false;
        }
        l lVar2 = lVar == null ? this.j0 : lVar;
        m2 m2Var = this.k0;
        if (kotlin.jvm.internal.l.a(m2Var.a, g2Var)) {
            z4 = false;
        } else {
            m2Var.a = g2Var;
            z4 = true;
        }
        m2Var.b = nVar;
        if (m2Var.d != k1Var) {
            m2Var.d = k1Var;
            z4 = true;
        }
        if (m2Var.e != z2) {
            m2Var.e = z2;
            z4 = true;
        }
        m2Var.c = lVar2;
        m2Var.f = this.h0;
        j jVar = this.n0;
        jVar.L = k1Var;
        jVar.N = z2;
        this.f0 = nVar;
        this.g0 = lVar;
        okio.internal.j jVar2 = x1.a;
        k1 k1Var2 = m2Var.d;
        k1 k1Var3 = k1.e;
        if (k1Var2 != k1Var3) {
            k1Var3 = k1.y;
        }
        this.O = jVar2;
        if (this.P != z) {
            this.P = z;
            if (!z) {
                R0();
                this.d0 = null;
            }
            z4 = true;
        }
        if (!kotlin.jvm.internal.l.a(this.Q, kVar)) {
            R0();
            this.Q = kVar;
        }
        if (this.N != k1Var3) {
            this.N = k1Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.U;
            t tVar = t.a;
            if (z6) {
                S0();
                if (this.T) {
                    W0().mo28trySendJP2dKIU(tVar);
                }
                this.a0 = null;
            }
            v0 v0Var = this.d0;
            if (v0Var != null) {
                v0Var.a();
                f2 f2Var = v0Var.a;
                if (f2Var.T) {
                    f2Var.V0(tVar);
                }
                v0Var.g = null;
                w0 w0Var = v0Var.k;
                w0Var.a = 0;
                w0Var.b.clear();
            }
        }
        if (z3) {
            this.o0 = null;
            this.p0 = null;
            androidx.compose.ui.node.k.l(this);
        }
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        if (this.P && (this.o0 == null || this.p0 == null)) {
            this.o0 = new androidx.compose.animation.core.g0(this, 1);
            this.p0 = new d2(this, null);
        }
        androidx.compose.animation.core.g0 g0Var = this.o0;
        if (g0Var != null) {
            kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
            xVar.b(androidx.compose.ui.semantics.k.d, new androidx.compose.ui.semantics.a(null, g0Var));
        }
        d2 d2Var = this.p0;
        if (d2Var != null) {
            kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
            xVar.b(androidx.compose.ui.semantics.k.e, d2Var);
        }
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean x(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.P || ((!androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.b(keyEvent), androidx.compose.ui.input.key.a.D) && !androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C)) || androidx.compose.ui.input.key.c.c(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.k0.d == k1.e;
        j jVar = this.n0;
        if (z) {
            int i = (int) (jVar.R & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C) ? i : -i)));
        } else {
            int i2 = (int) (jVar.R >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C) ? i2 : -i2)) << 32);
        }
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new d2(this, jFloatToRawIntBits, null, 0), 3, null);
        return true;
    }
}
