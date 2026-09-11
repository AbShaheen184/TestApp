package androidx.compose.animation.core;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.emulator.EmulatorActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    private final Object d(Object obj, Object obj2) {
        com.app.mlounge.ui.viewmodel.y1 y1Var = (com.app.mlounge.ui.viewmodel.y1) this.y;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar, 12, 8);
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, rVar, 54);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.ui.graphics.vector.f fVarO = com.google.firebase.crashlytics.internal.model.t1.o();
            float f = 16;
            androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.w0.l(oVar, f);
            long j = com.app.mlounge.ui.theme.b.f;
            androidx.compose.material3.f1.b(fVarO, null, rVarL, j, rVar, 3504, 0);
            p3.b(y1Var.e, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).n, rVar, 384, 0, 131066);
            androidx.compose.material3.f1.b(coil3.network.g.n(), null, androidx.compose.foundation.layout.w0.l(oVar, f), j, rVar, 3504, 0);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x0a4b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x0a4d A[LOOP:2: B:228:0x0a11->B:243:0x0a4d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:352:0x0a7e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x039e  */
    /* JADX WARN: Code duplicated, block: B:63:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0420  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CancellableContinuation cancellableContinuationY;
        Collection collectionX;
        boolean zG;
        androidx.compose.ui.graphics.vector.f fVarB;
        androidx.compose.ui.graphics.vector.f fVarO;
        int iOrdinal;
        long jD;
        int i = 0;
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                ((k0) this.y).a(androidx.compose.runtime.s.A(1), (androidx.compose.runtime.r) obj);
                return kotlin.y.a;
            case 1:
                androidx.compose.foundation.gestures.f2 f2Var = (androidx.compose.foundation.gestures.f2) this.y;
                BuildersKt__Builders_commonKt.launch$default(f2Var.z0(), null, null, new androidx.compose.foundation.gestures.e2(f2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3, null);
                return Boolean.TRUE;
            case 2:
                return new androidx.compose.ui.unit.j((((long) 0) << 32) | (((long) ((androidx.compose.ui.i) this.y).a(0, (int) (((androidx.compose.ui.unit.l) obj).a & 4294967295L))) & 4294967295L));
            case 3:
                return new androidx.compose.ui.unit.j(((androidx.compose.ui.j) this.y).a(0L, ((androidx.compose.ui.unit.l) obj).a, (androidx.compose.ui.unit.m) obj2));
            case 4:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.n0.g((androidx.compose.foundation.text.selection.c1) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                return kotlin.y.a;
            case 5:
                ((androidx.compose.foundation.text.x0) this.y).e(((androidx.compose.ui.geometry.b) obj2).a);
                return kotlin.y.a;
            case 6:
                androidx.compose.foundation.text.contextmenu.data.d dVar = (androidx.compose.foundation.text.contextmenu.data.d) this.y;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                ((Integer) obj2).getClass();
                rVar.b0(666084174);
                String str = dVar.b;
                rVar.p(false);
                return str;
            case 7:
                ((Integer) obj2).getClass();
                return androidx.compose.foundation.text.contextmenu.internal.v.a((TextClassification) this.y, (androidx.compose.runtime.r) obj);
            case 8:
                ((Integer) obj2).getClass();
                return androidx.compose.foundation.text.contextmenu.internal.v.c((RemoteAction) this.y, (androidx.compose.runtime.r) obj);
            case 9:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.y;
                ((androidx.compose.ui.input.pointer.v) obj).a();
                yVar.e = ((androidx.compose.ui.geometry.b) obj2).a;
                return kotlin.y.a;
            case 10:
                androidx.compose.runtime.internal.l lVar = (androidx.compose.runtime.internal.l) this.y;
                ((Integer) obj).getClass();
                if (obj2 instanceof androidx.compose.runtime.i) {
                    androidx.compose.runtime.i iVar = (androidx.compose.runtime.i) obj2;
                    androidx.collection.p0 p0Var = lVar.h;
                    if (p0Var == null) {
                        androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
                        p0Var = new androidx.collection.p0();
                        lVar.h = p0Var;
                    }
                    p0Var.k(iVar);
                    lVar.f.b(iVar);
                }
                if (obj2 instanceof androidx.compose.runtime.a2) {
                    lVar.e((androidx.compose.runtime.a2) obj2);
                }
                if (obj2 instanceof androidx.compose.runtime.q1) {
                    ((androidx.compose.runtime.q1) obj2).c();
                }
                return kotlin.y.a;
            case 11:
                androidx.compose.runtime.w1 w1Var = (androidx.compose.runtime.w1) this.y;
                Set set = (Set) obj;
                synchronized (w1Var.c) {
                    try {
                        if (((androidx.compose.runtime.s1) w1Var.u.getValue()).compareTo(androidx.compose.runtime.s1.B) >= 0) {
                            androidx.collection.p0 p0Var3 = w1Var.h;
                            if (set instanceof androidx.compose.runtime.collection.d) {
                                androidx.collection.p0 p0Var4 = ((androidx.compose.runtime.collection.d) set).e;
                                Object[] objArr = p0Var4.b;
                                long[] jArr = p0Var4.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((j & 255) < 128) {
                                                    Object obj3 = objArr[(i2 << 3) + i4];
                                                    if (!(obj3 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj3).e(1)) {
                                                        p0Var3.a(obj3);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 == 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj4).e(1)) {
                                        p0Var3.a(obj4);
                                    }
                                }
                            }
                            cancellableContinuationY = w1Var.y();
                        } else {
                            cancellableContinuationY = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (cancellableContinuationY != null) {
                    cancellableContinuationY.resumeWith(kotlin.y.a);
                }
                return kotlin.y.a;
            case 12:
                Channel channel = (Channel) this.y;
                Set set2 = (Set) obj;
                if (set2 instanceof androidx.compose.runtime.collection.d) {
                    androidx.collection.p0 p0Var5 = ((androidx.compose.runtime.collection.d) set2).e;
                    Object[] objArr2 = p0Var5.b;
                    long[] jArr2 = p0Var5.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr2[i5];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < i6) {
                                        if ((j2 & 255) < 128) {
                                            Object obj5 = objArr2[(i5 << 3) + i7];
                                            if (!(obj5 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj5).e(4)) {
                                            }
                                        }
                                        j2 >>= 8;
                                        i7++;
                                    } else if (i6 == 8) {
                                        if (i5 != length2) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if (i5 != length2) {
                                i5++;
                            }
                        }
                        channel.mo28trySendJP2dKIU(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj6).e(4)) {
                                channel.mo28trySendJP2dKIU(set2);
                            }
                        }
                    }
                }
                return kotlin.y.a;
            case 13:
                androidx.compose.runtime.snapshots.t tVar = (androidx.compose.runtime.snapshots.t) this.y;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = tVar.b;
                while (true) {
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        collectionX = collection;
                    } else if (obj7 instanceof Set) {
                        collectionX = com.google.common.base.c.q(obj7, collection);
                    } else {
                        if (!(obj7 instanceof List)) {
                            androidx.compose.runtime.t.b("Unexpected notification");
                            com.google.gson.b.b();
                            return null;
                        }
                        collectionX = kotlin.collections.o.X((Collection) obj7, com.google.common.base.c.p(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj7, collectionX)) {
                            if (tVar.c()) {
                                tVar.a.invoke(new androidx.activity.w(tVar, 21));
                            }
                            return kotlin.y.a;
                        }
                    } while (atomicReference.get() == obj7);
                }
                break;
            case 14:
                androidx.compose.ui.graphics.a aVar = (androidx.compose.ui.graphics.a) this.y;
                androidx.compose.ui.geometry.c cVarA = androidx.compose.ui.graphics.a0.A((RectF) obj);
                androidx.compose.ui.geometry.c cVarA2 = androidx.compose.ui.graphics.a0.A((RectF) obj2);
                switch (aVar.a) {
                    case 26:
                        zG = cVarA.g(cVarA2);
                        break;
                    default:
                        zG = cVarA2.a(cVarA.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 15:
                ((Integer) obj2).getClass();
                _COROUTINE.b.a((androidx.navigation.compose.o) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                return kotlin.y.a;
            case 16:
                return EmulatorActivity.onCreate$lambda$3((EmulatorActivity) this.y, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            case 17:
                com.app.mlounge.ui.components.q0 q0Var = (com.app.mlounge.ui.components.q0) this.y;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.b.o(androidx.compose.ui.o.b, 12), androidx.compose.foundation.s.o(rVar2), true);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    p3.b(q0Var.b, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).l, rVar2, 0, 0, 131066);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            case 18:
                Double d = (Double) this.y;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d}, 1)), androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 6, 2), androidx.compose.ui.graphics.t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).o, rVar3, 432, 0, 131064);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
            case 19:
                com.app.mlounge.data.local.entity.a aVar2 = (com.app.mlounge.data.local.entity.a) this.y;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Are you sure you want to delete '", aVar2.d, "'? This will also remove the file from storage."), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 384, 0, 262138);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
            case 20:
                SportsMatch sportsMatch = (SportsMatch) this.y;
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    float f = 12;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f);
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar5, 48);
                    int iHashCode2 = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar5.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar5, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar3);
                    } else {
                        rVar5.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar5, t0VarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar5, jVarL2, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar5, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar5, dVar2);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar5, rVarC2, eVar4);
                    if (sportsMatch.d() != null) {
                        rVar5.b0(1357533649);
                        coil3.compose.k.a(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://streamed.pk", sportsMatch.d()), sportsMatch.g(), androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.p(oVar, 120), 80), androidx.compose.foundation.shape.e.a(6)), null, androidx.compose.ui.layout.i.b, rVar5, 1572864, 1976);
                        rVar5.p(false);
                    } else {
                        rVar5.b0(1357933890);
                        androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.p(oVar, 120), 80), androidx.compose.foundation.shape.e.a(6)), com.app.mlounge.ui.theme.b.c, androidx.compose.ui.graphics.a0.b);
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode3 = Long.hashCode(rVar5.T);
                        androidx.compose.runtime.internal.j jVarL3 = rVar5.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar5, rVarF);
                        rVar5.e0();
                        if (rVar5.S) {
                            rVar5.k(yVar3);
                        } else {
                            rVar5.o0();
                        }
                        androidx.compose.runtime.s.x(rVar5, q0VarD, eVar);
                        androidx.compose.runtime.s.x(rVar5, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar5, eVar3, rVar5, dVar2);
                        androidx.compose.runtime.s.x(rVar5, rVarC3, eVar4);
                        androidx.compose.material3.f1.b(okhttp3.internal.platform.android.g.p(), null, androidx.compose.foundation.layout.w0.l(oVar, 32), com.app.mlounge.ui.theme.b.m, rVar5, 432, 0);
                        rVar5.p(true);
                        rVar5.p(false);
                    }
                    androidx.compose.foundation.layout.b.d(rVar5, androidx.compose.foundation.layout.w0.p(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                    androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar5, 0);
                    int iHashCode4 = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar5.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar5, h0Var);
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar3);
                    } else {
                        rVar5.o0();
                    }
                    androidx.compose.runtime.s.x(rVar5, vVarA2, eVar);
                    androidx.compose.runtime.s.x(rVar5, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar5, eVar3, rVar5, dVar2);
                    androidx.compose.runtime.s.x(rVar5, rVarC4, eVar4);
                    String strG = sportsMatch.g();
                    if (strG == null) {
                        strG = "Unknown Match";
                    }
                    String str2 = strG;
                    androidx.compose.runtime.u2 u2Var = u3.a;
                    p3.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((t3) rVar5.j(u2Var)).m, rVar5, 0, 24960, 110586);
                    if (sportsMatch.h() != null) {
                        rVar5.b0(1088357153);
                        p3.b(sportsMatch.h(), null, com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar5.j(u2Var)).l, rVar5, 0, 24960, 110586);
                        rVar5.p(false);
                    } else {
                        rVar5.b0(1088649855);
                        rVar5.p(false);
                    }
                    if (sportsMatch.b() != null) {
                        rVar5.b0(1088721775);
                        String str3 = new SimpleDateFormat("MMM d, h:mm a", Locale.getDefault()).format(new Date(sportsMatch.b().longValue()));
                        str3.getClass();
                        p3.b(str3, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar5.j(u2Var)).o, rVar5, 0, 24960, 110586);
                        rVar5.p(false);
                    } else {
                        rVar5.b0(1089031775);
                        rVar5.p(false);
                    }
                    androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, rVar5, 6);
                    int iHashCode5 = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL5 = rVar5.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar5, oVar);
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar3);
                    } else {
                        rVar5.o0();
                    }
                    androidx.compose.runtime.s.x(rVar5, t0VarA2, eVar);
                    androidx.compose.runtime.s.x(rVar5, jVarL5, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar5, eVar3, rVar5, dVar2);
                    androidx.compose.runtime.s.x(rVar5, rVarC5, eVar4);
                    if (sportsMatch.e() != null) {
                        rVar5.b0(694852496);
                        p3.b(sportsMatch.e(), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((t3) rVar5.j(u2Var)).o, rVar5, 0, 24576, 114682);
                        rVar5.p(false);
                    } else {
                        rVar5.b0(695107843);
                        rVar5.p(false);
                    }
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar5, true, true, true);
                } else {
                    rVar5.W();
                }
                return kotlin.y.a;
            case 21:
                androidx.compose.ui.graphics.vector.f fVar = (androidx.compose.ui.graphics.vector.f) this.y;
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.material3.f1.b(fVar, null, null, androidx.compose.ui.graphics.t.d, rVar6, 3120, 4);
                } else {
                    rVar6.W();
                }
                return kotlin.y.a;
            case 22:
                kotlin.k kVar = (kotlin.k) this.y;
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.b("To save downloads to '" + kVar.y + "', Android requires you to use the system file manager to choose a folder. Please select the folder you wish to use in the next screen and then click 'Use this folder'.", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar7, 0, 0, 262138);
                } else {
                    rVar7.W();
                }
                return kotlin.y.a;
            case 23:
                com.app.mlounge.ui.viewmodel.l lVar2 = (com.app.mlounge.ui.viewmodel.l) this.y;
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (rVar8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    float f2 = 16;
                    androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), f2);
                    androidx.compose.foundation.layout.t0 t0VarA3 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar8, 48);
                    int iHashCode6 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL6 = rVar8.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar8, rVarO2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar4);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.runtime.s.x(rVar8, t0VarA3, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar8, jVarL6, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar8, Integer.valueOf(iHashCode6), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar8, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar8, rVarC6, androidx.compose.ui.node.f.c);
                    int iOrdinal2 = lVar2.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            fVarO = androidx.datastore.preferences.protobuf.h1.e;
                            if (fVarO == null) {
                                androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Inventory2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i8 = androidx.compose.ui.graphics.vector.h0.a;
                                androidx.compose.ui.graphics.p0 p0Var6 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                                androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                gVar.o(20.0f, 2.0f);
                                gVar.k(4.0f);
                                gVar.g(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
                                gVar.s(3.01f);
                                gVar.g(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
                                gVar.r(20.0f);
                                gVar.h(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
                                gVar.l(14.0f);
                                gVar.h(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                gVar.r(8.7f);
                                gVar.h(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
                                gVar.r(4.0f);
                                gVar.g(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
                                gVar.f();
                                gVar.o(15.0f, 14.0f);
                                gVar.k(9.0f);
                                gVar.s(-2.0f);
                                gVar.l(6.0f);
                                gVar.r(14.0f);
                                gVar.f();
                                gVar.o(20.0f, 7.0f);
                                gVar.k(4.0f);
                                gVar.r(4.0f);
                                gVar.l(16.0f);
                                gVar.r(7.0f);
                                gVar.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var6);
                                fVarB = eVar5.b();
                                androidx.datastore.preferences.protobuf.h1.e = fVarB;
                            }
                        } else {
                            if (iOrdinal2 != 2) {
                                if (iOrdinal2 == 3) {
                                    fVarO = org.jsoup.helper.n.q();
                                } else {
                                    coil3.g.a();
                                }
                                return null;
                            }
                            fVarO = coil3.network.g.o();
                        }
                        androidx.compose.ui.graphics.vector.f fVar2 = fVarO;
                        iOrdinal = lVar2.ordinal();
                        if (iOrdinal != 0) {
                            jD = androidx.compose.ui.graphics.a0.d(4294944550L);
                        } else if (iOrdinal != 1) {
                            jD = com.app.mlounge.ui.theme.b.f;
                        } else if (iOrdinal != 2) {
                            jD = androidx.compose.ui.graphics.a0.d(4292886779L);
                        } else {
                            if (iOrdinal == 3) {
                                coil3.g.a();
                                return null;
                            }
                            jD = androidx.compose.ui.graphics.a0.d(4278238420L);
                        }
                        androidx.compose.material3.f1.b(fVar2, null, androidx.compose.foundation.layout.w0.l(oVar2, 24), jD, rVar8, 432, 0);
                        androidx.compose.foundation.layout.b.d(rVar8, androidx.compose.foundation.layout.w0.p(oVar2, f2));
                        p3.b(lVar2.e, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar8.j(u3.a)).j, rVar8, 384, 0, 131066);
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        androidx.compose.foundation.layout.b.d(rVar8, new androidx.compose.foundation.layout.h0(1.0f, true));
                        androidx.compose.material3.f1.b(kotlin.math.a.w(), "Play", androidx.compose.foundation.layout.w0.l(oVar2, 20), com.app.mlounge.ui.theme.b.f, rVar8, 3504, 0);
                        rVar8.p(true);
                    } else {
                        fVarB = kotlin.math.a.b;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.Diamond", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i9 = androidx.compose.ui.graphics.vector.h0.a;
                            long j3 = androidx.compose.ui.graphics.t.b;
                            androidx.compose.ui.graphics.p0 p0Var7 = new androidx.compose.ui.graphics.p0(j3);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new androidx.compose.ui.graphics.vector.o(12.16f, 3.0f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.v(-0.32f, 0.0f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.v(-2.63f, 5.25f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.v(5.58f, 0.0f));
                            androidx.compose.ui.graphics.vector.k kVar2 = androidx.compose.ui.graphics.vector.k.c;
                            arrayList.add(kVar2);
                            androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList, 0, p0Var7);
                            androidx.compose.ui.graphics.p0 p0Var8 = new androidx.compose.ui.graphics.p0(j3);
                            ArrayList arrayList2 = new ArrayList(32);
                            arrayList2.add(new androidx.compose.ui.graphics.vector.o(16.46f, 8.25f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.v(5.16f, 0.0f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.v(-2.62f, -5.25f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.v(-5.16f, 0.0f));
                            arrayList2.add(kVar2);
                            androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList2, 0, p0Var8);
                            androidx.compose.ui.graphics.p0 p0Var9 = new androidx.compose.ui.graphics.p0(j3);
                            ArrayList arrayList3 = new ArrayList(32);
                            arrayList3.add(new androidx.compose.ui.graphics.vector.o(21.38f, 9.75f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.v(-8.63f, 0.0f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.v(0.0f, 10.35f));
                            arrayList3.add(kVar2);
                            androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList3, 0, p0Var9);
                            androidx.compose.ui.graphics.p0 p0Var10 = new androidx.compose.ui.graphics.p0(j3);
                            ArrayList arrayList4 = new ArrayList(32);
                            arrayList4.add(new androidx.compose.ui.graphics.vector.o(11.25f, 20.1f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(0.0f, -10.35f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(-8.63f, 0.0f));
                            arrayList4.add(kVar2);
                            androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList4, 0, p0Var10);
                            androidx.compose.ui.graphics.p0 p0Var11 = new androidx.compose.ui.graphics.p0(j3);
                            ArrayList arrayList5 = new ArrayList(32);
                            arrayList5.add(new androidx.compose.ui.graphics.vector.o(7.54f, 8.25f));
                            arrayList5.add(new androidx.compose.ui.graphics.vector.v(2.62f, -5.25f));
                            arrayList5.add(new androidx.compose.ui.graphics.vector.v(-5.16f, 0.0f));
                            arrayList5.add(new androidx.compose.ui.graphics.vector.v(-2.62f, 5.25f));
                            arrayList5.add(kVar2);
                            androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList5, 0, p0Var11);
                            fVarB = eVar6.b();
                            kotlin.math.a.b = fVarB;
                        }
                    }
                    fVarO = fVarB;
                    androidx.compose.ui.graphics.vector.f fVar3 = fVarO;
                    iOrdinal = lVar2.ordinal();
                    if (iOrdinal != 0) {
                        jD = androidx.compose.ui.graphics.a0.d(4294944550L);
                    } else if (iOrdinal != 1) {
                        jD = com.app.mlounge.ui.theme.b.f;
                    } else if (iOrdinal != 2) {
                        jD = androidx.compose.ui.graphics.a0.d(4292886779L);
                    } else {
                        if (iOrdinal == 3) {
                            coil3.g.a();
                            return null;
                        }
                        jD = androidx.compose.ui.graphics.a0.d(4278238420L);
                    }
                    androidx.compose.material3.f1.b(fVar3, null, androidx.compose.foundation.layout.w0.l(oVar2, 24), jD, rVar8, 432, 0);
                    androidx.compose.foundation.layout.b.d(rVar8, androidx.compose.foundation.layout.w0.p(oVar2, f2));
                    p3.b(lVar2.e, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar8.j(u3.a)).j, rVar8, 384, 0, 131066);
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.b.d(rVar8, new androidx.compose.foundation.layout.h0(1.0f, true));
                    androidx.compose.material3.f1.b(kotlin.math.a.w(), "Play", androidx.compose.foundation.layout.w0.l(oVar2, 20), com.app.mlounge.ui.theme.b.f, rVar8, 3504, 0);
                    rVar8.p(true);
                } else {
                    rVar8.W();
                }
                return kotlin.y.a;
            case 24:
                com.app.mlounge.ui.viewmodel.r1 r1Var = (com.app.mlounge.ui.viewmodel.r1) this.y;
                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (rVar9.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zH = rVar9.h(r1Var);
                    Object objQ = rVar9.Q();
                    if (zH || objQ == androidx.compose.runtime.m.a) {
                        objQ = new com.app.mlounge.ui.screens.sources.b(r1Var, i);
                        rVar9.l0(objQ);
                    }
                    androidx.compose.material3.t2.h((kotlin.jvm.functions.a) objQ, null, false, null, null, null, null, com.app.mlounge.ui.screens.sources.a.a, rVar9, 805306368, 510);
                } else {
                    rVar9.W();
                }
                return kotlin.y.a;
            case 25:
                return d(obj, obj2);
            case 26:
                char[] cArr = (char[]) this.y;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iC0 = kotlin.text.k.c0(charSequence, cArr, iIntValue9, false);
                if (iC0 < 0) {
                    return null;
                }
                return new kotlin.k(Integer.valueOf(iC0), 1);
            case 27:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) this.y, ((Integer) obj).intValue(), (kotlin.coroutines.g) obj2));
            default:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) this.y, obj, (Throwable) obj2);
        }
    }

    public /* synthetic */ g0(Object obj, int i, int i2) {
        this.e = i2;
        this.y = obj;
    }
}
