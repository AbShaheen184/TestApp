package androidx.activity.compose;

import android.graphics.Paint;
import android.os.Bundle;
import androidx.compose.foundation.gestures.b1;
import androidx.compose.foundation.gestures.c1;
import androidx.compose.foundation.gestures.j1;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        List listSubList;
        int i = this.e;
        y yVar = y.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                a aVar = (a) obj6;
                androidx.activity.result.h hVar = (androidx.activity.result.h) obj5;
                String str = (String) obj4;
                androidx.activity.result.contract.a aVar2 = (androidx.activity.result.contract.a) obj3;
                androidx.activity.y yVar2 = new androidx.activity.y((y0) obj2, 1);
                Bundle bundle = hVar.g;
                str.getClass();
                hVar.c(str);
                hVar.e.put(str, new androidx.activity.result.e(aVar2, yVar2));
                LinkedHashMap linkedHashMap = hVar.f;
                if (linkedHashMap.containsKey(str)) {
                    Object obj7 = linkedHashMap.get(str);
                    linkedHashMap.remove(str);
                    yVar2.c(obj7);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) androidx.room.r.n(str, bundle);
                if (aVar3 != null) {
                    bundle.remove(str);
                    yVar2.c(aVar2.c(aVar3.y, aVar3.e));
                }
                aVar.a = new androidx.activity.result.g(hVar, str, aVar2, 1);
                return new d(aVar, 0);
            case 1:
                j1 j1Var = (j1) obj6;
                z zVar = (z) obj5;
                w wVar = (w) obj4;
                m2 m2Var = (m2) obj3;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                c1 c1VarG = j1.g((Channel) j1Var.f);
                if (c1VarG != null) {
                    j1Var.h(c1VarG);
                    c1 c1VarA = ((c1) zVar.e).a(c1VarG);
                    zVar.e = c1VarA;
                    float fI = m2Var.i(m2Var.e(c1VarA.a));
                    wVar.e = fI;
                    vVar.e = !b1.a(fI - fFloatValue);
                }
                return Boolean.valueOf(c1VarG != null);
            case 2:
                androidx.compose.ui.text.input.q qVar = (androidx.compose.ui.text.input.q) obj5;
                x xVar = (x) obj4;
                r0 r0Var = (r0) obj3;
                p0 p0Var = (p0) obj2;
                h0 h0Var = (h0) obj;
                h0Var.b();
                androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                float fG = ((androidx.compose.foundation.text.input.internal.l) obj6).c.g();
                if (fG != 0.0f) {
                    long j = xVar.b;
                    int i2 = l0.c;
                    int iV = qVar.v((int) (j >> 32));
                    k1 k1VarD = r0Var.d();
                    androidx.compose.ui.geometry.c cVarC = k1VarD != null ? k1VarD.a.c(iV) : new androidx.compose.ui.geometry.c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(h0Var.V(androidx.compose.foundation.text.y0.a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2;
                    float f2 = cVarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.d)) & 4294967295L);
                    androidx.compose.ui.graphics.r rVar = bVar.e.c;
                    com.google.android.gms.cloudmessaging.n nVarG = bVar.A;
                    if (nVarG == null) {
                        nVarG = a0.g();
                        nVarG.o(1);
                        bVar.A = nVarG;
                    }
                    Paint paint = (Paint) nVarG.y;
                    p0Var.a(fG, bVar.d(), nVarG);
                    if (!kotlin.jvm.internal.l.a((androidx.compose.ui.graphics.m) nVarG.A, null)) {
                        nVarG.i(null);
                    }
                    if (nVarG.e != 3) {
                        nVarG.g(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        nVarG.n(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (nVarG.b() != 0) {
                        nVarG.l(0);
                    }
                    if (nVarG.c() != 0) {
                        nVarG.m(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        nVarG.j(1);
                    }
                    rVar.i(jFloatToRawIntBits, jFloatToRawIntBits2, nVarG);
                }
                return yVar;
            case 3:
                androidx.compose.foundation.text.input.internal.w wVar2 = (androidx.compose.foundation.text.input.internal.w) obj;
                androidx.compose.foundation.text.input.internal.q qVar2 = ((androidx.compose.foundation.text.input.internal.c) obj5).a;
                wVar2.h = (x) obj6;
                wVar2.i = (androidx.compose.ui.text.input.k) obj4;
                wVar2.c = (androidx.compose.animation.core.a) obj3;
                wVar2.d = (kotlin.jvm.functions.l) obj2;
                wVar2.e = qVar2 != null ? qVar2.M : null;
                wVar2.f = qVar2 != null ? qVar2.N : null;
                wVar2.g = qVar2 != null ? (p2) androidx.compose.ui.node.k.h(qVar2, l1.s) : null;
                return yVar;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) obj4;
                androidx.navigation.internal.f fVar = (androidx.navigation.internal.f) obj3;
                Bundle bundle2 = (Bundle) obj2;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                ((kotlin.jvm.internal.v) obj6).e = true;
                int iIndexOf = arrayList.indexOf(iVar);
                if (iIndexOf != -1) {
                    int i3 = iIndexOf + 1;
                    listSubList = arrayList.subList(xVar2.e, i3);
                    xVar2.e = i3;
                } else {
                    listSubList = kotlin.collections.u.e;
                }
                fVar.a(iVar.y, bundle2, iVar, listSubList);
                return yVar;
        }
    }
}
