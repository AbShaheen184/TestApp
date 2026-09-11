package androidx.activity.compose;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.text.n0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.w;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.CoroutineContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(c1 c1Var, boolean z, int i) {
        this.e = 1;
        this.z = c1Var;
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00dc A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:43:0x023d A[PHI: r17
  0x023d: PHI (r17v14 androidx.compose.ui.i) = (r17v13 androidx.compose.ui.i), (r17v15 androidx.compose.ui.i) binds: [B:41:0x023a, B:38:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0242 A[PHI: r17
  0x0242: PHI (r17v1 androidx.compose.ui.i) = 
  (r17v0 androidx.compose.ui.i)
  (r17v13 androidx.compose.ui.i)
  (r17v15 androidx.compose.ui.i)
  (r17v16 androidx.compose.ui.i)
 binds: [B:24:0x00dc, B:41:0x023a, B:38:0x022d, B:35:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0246  */
    /* JADX WARN: Code duplicated, block: B:47:0x024c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00d9. Please report as an issue. */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.i iVar;
        androidx.compose.ui.graphics.vector.f fVarB;
        androidx.compose.ui.graphics.vector.f fVar;
        boolean z;
        androidx.compose.ui.graphics.vector.f fVarP;
        int i = this.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        y yVar = y.a;
        boolean z2 = this.y;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.a(z2, (kotlin.jvm.functions.a) obj3, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                return yVar;
            case 1:
                ((Integer) obj2).getClass();
                n0.f((c1) obj3, z2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                com.google.android.gms.dynamite.g.b(z2, (kotlin.jvm.functions.p) obj3, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                return yVar;
            case 3:
                GamePlatform gamePlatform = (GamePlatform) obj3;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.b(gamePlatform.e(), androidx.compose.foundation.layout.b.p(oVar, 12, 8), z2 ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).n, rVar, 48, 0, 131064);
                } else {
                    rVar.W();
                }
                return yVar;
            case 4:
                ChqStream chqStream = (ChqStream) obj3;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                    return yVar;
                }
                float f = 12;
                androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), f);
                androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.e, iVar2, rVar2, 54);
                int iHashCode = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar2);
                } else {
                    rVar2.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                androidx.compose.runtime.s.t(rVar2, dVar);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                androidx.compose.ui.r rVarA = u0.a(1.0f);
                t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.a, iVar2, rVar2, 48);
                int iHashCode2 = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarA);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar2);
                } else {
                    rVar2.o0();
                }
                androidx.compose.runtime.s.x(rVar2, t0VarA2, eVar);
                androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                String strL = chqStream.l();
                if (strL != null) {
                    switch (strL.hashCode()) {
                        case -1137141488:
                            iVar = iVar2;
                            if (!strL.equals("torrent")) {
                                fVarB = _COROUTINE.a.g;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i2 = h0.a;
                                    long j = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var = new p0(j);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList.add(new w(-2.0f, 0.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                                    p0 p0Var2 = new p0(j);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList2.add(new w(-2.0f, 0.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList2, 0, p0Var2);
                                    p0 p0Var3 = new p0(j);
                                    ArrayList arrayList3 = new ArrayList(32);
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList3.add(new w(-2.0f, 0.0f));
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList3, 0, p0Var3);
                                    p0 p0Var4 = new p0(j);
                                    androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar.o(10.05f, 8.59f);
                                    gVar.m(6.03f, 4.55f);
                                    gVar.l(-0.01f);
                                    gVar.n(-0.31f, -0.32f);
                                    gVar.n(-1.42f, 1.41f);
                                    gVar.n(4.02f, 4.05f);
                                    gVar.n(0.01f, -0.01f);
                                    gVar.n(0.31f, 0.32f);
                                    gVar.f();
                                    gVar.o(13.943f, 8.617f);
                                    gVar.n(4.405f, -4.392f);
                                    gVar.m(19.76f, 5.64f);
                                    gVar.n(-4.405f, 4.393f);
                                    gVar.f();
                                    gVar.o(10.01f, 15.36f);
                                    gVar.n(-1.42f, -1.41f);
                                    gVar.n(-4.03f, 4.01f);
                                    gVar.n(-0.32f, 0.33f);
                                    gVar.n(1.41f, 1.41f);
                                    gVar.n(4.03f, -4.02f);
                                    gVar.f();
                                    gVar.o(19.76f, 18.3f);
                                    gVar.n(-3.99f, -4.01f);
                                    gVar.n(-0.36f, -0.35f);
                                    gVar.m(14.0f, 15.35f);
                                    gVar.n(3.99f, 4.01f);
                                    gVar.n(0.35f, 0.35f);
                                    gVar.f();
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var4);
                                    p0 p0Var5 = new p0(j);
                                    ArrayList arrayList4 = new ArrayList(32);
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList4.add(new w(-2.0f, 0.0f));
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList4, 0, p0Var5);
                                    fVarB = eVar5.b();
                                    _COROUTINE.a.g = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarP = t1.p();
                                fVar = fVarP;
                                rVar2 = rVar2;
                                yVar = yVar;
                            }
                            break;
                        case -1081630870:
                            iVar = iVar2;
                            if (!strL.equals("magnet")) {
                                fVarB = _COROUTINE.a.g;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i3 = h0.a;
                                    long j2 = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var6 = new p0(j2);
                                    ArrayList arrayList5 = new ArrayList(32);
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList5.add(new w(-2.0f, 0.0f));
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList5, 0, p0Var6);
                                    p0 p0Var7 = new p0(j2);
                                    ArrayList arrayList6 = new ArrayList(32);
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList6.add(new w(-2.0f, 0.0f));
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList6, 0, p0Var7);
                                    p0 p0Var8 = new p0(j2);
                                    ArrayList arrayList7 = new ArrayList(32);
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList7.add(new w(-2.0f, 0.0f));
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList7, 0, p0Var8);
                                    p0 p0Var9 = new p0(j2);
                                    androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar2.o(10.05f, 8.59f);
                                    gVar2.m(6.03f, 4.55f);
                                    gVar2.l(-0.01f);
                                    gVar2.n(-0.31f, -0.32f);
                                    gVar2.n(-1.42f, 1.41f);
                                    gVar2.n(4.02f, 4.05f);
                                    gVar2.n(0.01f, -0.01f);
                                    gVar2.n(0.31f, 0.32f);
                                    gVar2.f();
                                    gVar2.o(13.943f, 8.617f);
                                    gVar2.n(4.405f, -4.392f);
                                    gVar2.m(19.76f, 5.64f);
                                    gVar2.n(-4.405f, 4.393f);
                                    gVar2.f();
                                    gVar2.o(10.01f, 15.36f);
                                    gVar2.n(-1.42f, -1.41f);
                                    gVar2.n(-4.03f, 4.01f);
                                    gVar2.n(-0.32f, 0.33f);
                                    gVar2.n(1.41f, 1.41f);
                                    gVar2.n(4.03f, -4.02f);
                                    gVar2.f();
                                    gVar2.o(19.76f, 18.3f);
                                    gVar2.n(-3.99f, -4.01f);
                                    gVar2.n(-0.36f, -0.35f);
                                    gVar2.m(14.0f, 15.35f);
                                    gVar2.n(3.99f, 4.01f);
                                    gVar2.n(0.35f, 0.35f);
                                    gVar2.f();
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.a, 0, p0Var9);
                                    p0 p0Var10 = new p0(j2);
                                    ArrayList arrayList8 = new ArrayList(32);
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList8.add(new w(-2.0f, 0.0f));
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList8, 0, p0Var10);
                                    fVarB = eVar6.b();
                                    _COROUTINE.a.g = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarP = t1.p();
                                fVar = fVarP;
                                rVar2 = rVar2;
                                yVar = yVar;
                            }
                            break;
                        case 103407:
                            iVar = iVar2;
                            if (!strL.equals("hls")) {
                                fVarB = _COROUTINE.a.g;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i4 = h0.a;
                                    long j3 = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var11 = new p0(j3);
                                    ArrayList arrayList9 = new ArrayList(32);
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList9.add(new w(-2.0f, 0.0f));
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList9, 0, p0Var11);
                                    p0 p0Var12 = new p0(j3);
                                    ArrayList arrayList10 = new ArrayList(32);
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList10.add(new w(-2.0f, 0.0f));
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList10, 0, p0Var12);
                                    p0 p0Var13 = new p0(j3);
                                    ArrayList arrayList11 = new ArrayList(32);
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList11.add(new w(-2.0f, 0.0f));
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList11, 0, p0Var13);
                                    p0 p0Var14 = new p0(j3);
                                    androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar3.o(10.05f, 8.59f);
                                    gVar3.m(6.03f, 4.55f);
                                    gVar3.l(-0.01f);
                                    gVar3.n(-0.31f, -0.32f);
                                    gVar3.n(-1.42f, 1.41f);
                                    gVar3.n(4.02f, 4.05f);
                                    gVar3.n(0.01f, -0.01f);
                                    gVar3.n(0.31f, 0.32f);
                                    gVar3.f();
                                    gVar3.o(13.943f, 8.617f);
                                    gVar3.n(4.405f, -4.392f);
                                    gVar3.m(19.76f, 5.64f);
                                    gVar3.n(-4.405f, 4.393f);
                                    gVar3.f();
                                    gVar3.o(10.01f, 15.36f);
                                    gVar3.n(-1.42f, -1.41f);
                                    gVar3.n(-4.03f, 4.01f);
                                    gVar3.n(-0.32f, 0.33f);
                                    gVar3.n(1.41f, 1.41f);
                                    gVar3.n(4.03f, -4.02f);
                                    gVar3.f();
                                    gVar3.o(19.76f, 18.3f);
                                    gVar3.n(-3.99f, -4.01f);
                                    gVar3.n(-0.36f, -0.35f);
                                    gVar3.m(14.0f, 15.35f);
                                    gVar3.n(3.99f, 4.01f);
                                    gVar3.n(0.35f, 0.35f);
                                    gVar3.f();
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, gVar3.a, 0, p0Var14);
                                    p0 p0Var15 = new p0(j3);
                                    ArrayList arrayList12 = new ArrayList(32);
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList12.add(new w(-2.0f, 0.0f));
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList12, 0, p0Var15);
                                    fVarB = eVar7.b();
                                    _COROUTINE.a.g = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarP = okhttp3.internal.platform.android.g.t();
                                fVar = fVarP;
                                rVar2 = rVar2;
                                yVar = yVar;
                            }
                            break;
                        case 108273:
                            if (strL.equals("mp4")) {
                                fVarP = kotlin.math.a.g;
                                if (fVarP != null) {
                                    iVar = iVar2;
                                } else {
                                    androidx.compose.ui.graphics.vector.e eVar8 = new androidx.compose.ui.graphics.vector.e("Filled.VideoFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i5 = h0.a;
                                    iVar = iVar2;
                                    p0 p0Var16 = new p0(androidx.compose.ui.graphics.t.b);
                                    androidx.compose.ui.graphics.vector.g gVar4 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar4.o(14.0f, 2.0f);
                                    gVar4.k(6.01f);
                                    gVar4.h(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
                                    gVar4.m(4.0f, 20.0f);
                                    gVar4.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    gVar4.l(12.0f);
                                    gVar4.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    gVar4.r(8.0f);
                                    gVar4.m(14.0f, 2.0f);
                                    gVar4.f();
                                    gVar4.o(13.0f, 9.0f);
                                    gVar4.r(3.5f);
                                    gVar4.m(18.5f, 9.0f);
                                    gVar4.k(13.0f);
                                    gVar4.f();
                                    gVar4.o(14.0f, 14.0f);
                                    gVar4.n(2.0f, -1.06f);
                                    gVar4.s(4.12f);
                                    gVar4.m(14.0f, 16.0f);
                                    gVar4.s(1.0f);
                                    gVar4.h(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                                    gVar4.k(9.0f);
                                    gVar4.h(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                    gVar4.s(-4.0f);
                                    gVar4.h(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                                    gVar4.l(4.0f);
                                    gVar4.h(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                                    gVar4.r(14.0f);
                                    gVar4.f();
                                    androidx.compose.ui.graphics.vector.e.a(eVar8, gVar4.a, 0, p0Var16);
                                    fVarP = eVar8.b();
                                    kotlin.math.a.g = fVarP;
                                }
                                fVar = fVarP;
                                rVar2 = rVar2;
                                yVar = yVar;
                                break;
                            }
                        default:
                            iVar = iVar2;
                            fVarB = _COROUTINE.a.g;
                            if (fVarB == null) {
                                androidx.compose.ui.graphics.vector.e eVar9 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i6 = h0.a;
                                long j4 = androidx.compose.ui.graphics.t.b;
                                p0 p0Var17 = new p0(j4);
                                ArrayList arrayList13 = new ArrayList(32);
                                arrayList13.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                arrayList13.add(new w(-2.0f, 0.0f));
                                arrayList13.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList13.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList13, 0, p0Var17);
                                p0 p0Var18 = new p0(j4);
                                ArrayList arrayList14 = new ArrayList(32);
                                arrayList14.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                arrayList14.add(new w(-2.0f, 0.0f));
                                arrayList14.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList14.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList14, 0, p0Var18);
                                p0 p0Var19 = new p0(j4);
                                ArrayList arrayList15 = new ArrayList(32);
                                arrayList15.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                arrayList15.add(new w(-2.0f, 0.0f));
                                arrayList15.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList15.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList15, 0, p0Var19);
                                p0 p0Var110 = new p0(j4);
                                androidx.compose.ui.graphics.vector.g gVar5 = new androidx.compose.ui.graphics.vector.g(0);
                                gVar5.o(10.05f, 8.59f);
                                gVar5.m(6.03f, 4.55f);
                                gVar5.l(-0.01f);
                                gVar5.n(-0.31f, -0.32f);
                                gVar5.n(-1.42f, 1.41f);
                                gVar5.n(4.02f, 4.05f);
                                gVar5.n(0.01f, -0.01f);
                                gVar5.n(0.31f, 0.32f);
                                gVar5.f();
                                gVar5.o(13.943f, 8.617f);
                                gVar5.n(4.405f, -4.392f);
                                gVar5.m(19.76f, 5.64f);
                                gVar5.n(-4.405f, 4.393f);
                                gVar5.f();
                                gVar5.o(10.01f, 15.36f);
                                gVar5.n(-1.42f, -1.41f);
                                gVar5.n(-4.03f, 4.01f);
                                gVar5.n(-0.32f, 0.33f);
                                gVar5.n(1.41f, 1.41f);
                                gVar5.n(4.03f, -4.02f);
                                gVar5.f();
                                gVar5.o(19.76f, 18.3f);
                                gVar5.n(-3.99f, -4.01f);
                                gVar5.n(-0.36f, -0.35f);
                                gVar5.m(14.0f, 15.35f);
                                gVar5.n(3.99f, 4.01f);
                                gVar5.n(0.35f, 0.35f);
                                gVar5.f();
                                androidx.compose.ui.graphics.vector.e.a(eVar9, gVar5.a, 0, p0Var110);
                                p0 p0Var111 = new p0(j4);
                                ArrayList arrayList16 = new ArrayList(32);
                                arrayList16.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                arrayList16.add(new w(-2.0f, 0.0f));
                                arrayList16.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList16.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList16, 0, p0Var111);
                                fVarB = eVar9.b();
                                _COROUTINE.a.g = fVarB;
                            }
                            fVar = fVarB;
                            break;
                    }
                } else {
                    iVar = iVar2;
                    fVarB = _COROUTINE.a.g;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar10 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = h0.a;
                        long j5 = androidx.compose.ui.graphics.t.b;
                        p0 p0Var112 = new p0(j5);
                        ArrayList arrayList17 = new ArrayList(32);
                        arrayList17.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                        arrayList17.add(new w(-2.0f, 0.0f));
                        arrayList17.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList17.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList17, 0, p0Var112);
                        p0 p0Var113 = new p0(j5);
                        ArrayList arrayList18 = new ArrayList(32);
                        arrayList18.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                        arrayList18.add(new w(-2.0f, 0.0f));
                        arrayList18.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList18.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList18, 0, p0Var113);
                        p0 p0Var114 = new p0(j5);
                        ArrayList arrayList19 = new ArrayList(32);
                        arrayList19.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                        arrayList19.add(new w(-2.0f, 0.0f));
                        arrayList19.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList19.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList19, 0, p0Var114);
                        p0 p0Var115 = new p0(j5);
                        androidx.compose.ui.graphics.vector.g gVar6 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar6.o(10.05f, 8.59f);
                        gVar6.m(6.03f, 4.55f);
                        gVar6.l(-0.01f);
                        gVar6.n(-0.31f, -0.32f);
                        gVar6.n(-1.42f, 1.41f);
                        gVar6.n(4.02f, 4.05f);
                        gVar6.n(0.01f, -0.01f);
                        gVar6.n(0.31f, 0.32f);
                        gVar6.f();
                        gVar6.o(13.943f, 8.617f);
                        gVar6.n(4.405f, -4.392f);
                        gVar6.m(19.76f, 5.64f);
                        gVar6.n(-4.405f, 4.393f);
                        gVar6.f();
                        gVar6.o(10.01f, 15.36f);
                        gVar6.n(-1.42f, -1.41f);
                        gVar6.n(-4.03f, 4.01f);
                        gVar6.n(-0.32f, 0.33f);
                        gVar6.n(1.41f, 1.41f);
                        gVar6.n(4.03f, -4.02f);
                        gVar6.f();
                        gVar6.o(19.76f, 18.3f);
                        gVar6.n(-3.99f, -4.01f);
                        gVar6.n(-0.36f, -0.35f);
                        gVar6.m(14.0f, 15.35f);
                        gVar6.n(3.99f, 4.01f);
                        gVar6.n(0.35f, 0.35f);
                        gVar6.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar10, gVar6.a, 0, p0Var115);
                        p0 p0Var116 = new p0(j5);
                        ArrayList arrayList110 = new ArrayList(32);
                        arrayList110.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                        arrayList110.add(new w(-2.0f, 0.0f));
                        arrayList110.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList110.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList110, 0, p0Var116);
                        fVarB = eVar10.b();
                        _COROUTINE.a.g = fVarB;
                    }
                    fVar = fVarB;
                }
                long j6 = com.app.mlounge.ui.theme.b.f;
                androidx.compose.ui.i iVar3 = iVar;
                androidx.compose.runtime.r rVar3 = rVar2;
                f1.b(fVar, null, w0.l(oVar, 24), j6, rVar3, 3504, 0);
                androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar, f));
                androidx.compose.ui.r rVarA2 = u0.a(1.0f);
                androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar3, 0);
                int iHashCode3 = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, rVarA2);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(yVar2);
                } else {
                    rVar3.o0();
                }
                androidx.compose.runtime.s.x(rVar3, vVarA, eVar);
                androidx.compose.runtime.s.x(rVar3, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar3, eVar3, rVar3, dVar);
                androidx.compose.runtime.s.x(rVar3, rVarC3, eVar4);
                String strG = chqStream.g();
                if (strG == null) {
                    strG = "Unknown Source";
                }
                u2 u2Var = u3.a;
                p3.b(strG, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar3.j(u2Var)).k, rVar3, 384, 24960, 110586);
                androidx.compose.runtime.r rVar4 = rVar3;
                t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, rVar4, 6);
                int iHashCode4 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL4 = rVar4.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar4, oVar);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(yVar2);
                } else {
                    rVar4.o0();
                }
                androidx.compose.runtime.s.x(rVar4, t0VarA3, eVar);
                androidx.compose.runtime.s.x(rVar4, jVarL4, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar4, eVar3, rVar4, dVar);
                androidx.compose.runtime.s.x(rVar4, rVarC4, eVar4);
                if (chqStream.c() != null) {
                    rVar4.b0(1221272914);
                    p3.b(chqStream.c(), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((t3) rVar4.j(u2Var)).o, rVar4, 384, 24960, 110586);
                    rVar4 = rVar4;
                    rVar4.p(false);
                    z = true;
                } else {
                    boolean z3 = false;
                    rVar4.b0(1221680099);
                    String strH = chqStream.h();
                    if (strH == null) {
                        rVar4.b0(1221674394);
                        rVar4.p(false);
                    } else {
                        rVar4.b0(1221674395);
                        p3.b(strH, null, com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).o, rVar4, 384, 0, 131066);
                        rVar4 = rVar4;
                        z3 = false;
                        rVar4.p(false);
                    }
                    String strL2 = chqStream.l();
                    if (strL2 == null) {
                        rVar4.b0(1221847591);
                        rVar4.p(z3);
                    } else {
                        rVar4.b0(1221847592);
                        String upperCase = strL2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        androidx.compose.runtime.r rVar5 = rVar4;
                        p3.b(upperCase, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).o, rVar5, 384, 0, 131066);
                        rVar4 = rVar5;
                        z3 = false;
                        rVar4.p(false);
                    }
                    String strJ = chqStream.j();
                    if (strJ == null) {
                        rVar4.b0(1222038675);
                        rVar4.p(z3);
                    } else {
                        rVar4.b0(1222038676);
                        androidx.compose.runtime.r rVar6 = rVar4;
                        p3.b(strJ, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).o, rVar6, 384, 0, 131066);
                        rVar4 = rVar6;
                        z3 = false;
                        rVar4.p(false);
                    }
                    Integer numI = chqStream.i();
                    if (numI == null) {
                        rVar4.b0(1222249165);
                        rVar4.p(z3);
                        z = true;
                    } else {
                        rVar4.b0(1222249166);
                        int iIntValue3 = numI.intValue();
                        if (iIntValue3 > 0) {
                            rVar4.b0(1604983391);
                            t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.g(2), iVar3, rVar4, 54);
                            int iHashCode5 = Long.hashCode(rVar4.T);
                            androidx.compose.runtime.internal.j jVarL5 = rVar4.l();
                            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar4, oVar);
                            rVar4.e0();
                            if (rVar4.S) {
                                rVar4.k(yVar2);
                            } else {
                                rVar4.o0();
                            }
                            androidx.compose.runtime.s.x(rVar4, t0VarA4, eVar);
                            androidx.compose.runtime.s.x(rVar4, jVarL5, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar4, eVar3, rVar4, dVar);
                            androidx.compose.runtime.s.x(rVar4, rVarC5, eVar4);
                            androidx.compose.runtime.r rVar7 = rVar4;
                            f1.b(h1.m(), "Seeders", w0.l(oVar, f), a0.d(4283215696L), rVar7, 3504, 0);
                            p3.b(String.valueOf(iIntValue3), null, a0.d(4283215696L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var)).o, rVar7, 384, 0, 131066);
                            rVar4 = rVar7;
                            z = true;
                            rVar4.p(true);
                            z3 = false;
                            rVar4.p(false);
                        } else {
                            z = true;
                            z3 = false;
                            rVar4.b0(1605871324);
                            rVar4.p(false);
                        }
                        rVar4.p(z3);
                    }
                    rVar4.p(z3);
                }
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar4, z, z, z);
                androidx.compose.runtime.r rVar8 = rVar4;
                f1.b(z2 ? _COROUTINE.a.w() : kotlin.math.a.w(), z2 ? "Download" : "Play", w0.l(oVar, 20), j6, rVar8, 3456, 0);
                rVar8.p(true);
                return yVar;
            default:
                return CoroutineContextKt.foldCopies$lambda$1((z) obj3, z2, (kotlin.coroutines.i) obj, (kotlin.coroutines.g) obj2);
        }
    }

    public /* synthetic */ i(Serializable serializable, boolean z, int i) {
        this.e = i;
        this.z = serializable;
        this.y = z;
    }

    public /* synthetic */ i(boolean z, ChqStream chqStream) {
        this.e = 4;
        this.y = z;
        this.z = chqStream;
    }

    public /* synthetic */ i(boolean z, kotlin.d dVar, int i, int i2) {
        this.e = i2;
        this.y = z;
        this.z = dVar;
    }
}
