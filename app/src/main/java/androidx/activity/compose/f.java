package androidx.activity.compose;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import androidx.appcompat.widget.c2;
import androidx.collection.p0;
import androidx.compose.animation.core.c1;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.t0;
import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.e1;
import androidx.compose.runtime.a2;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.ui.navigation.w;
import com.google.firebase.crashlytics.internal.model.t1;
import io.hopmonsdk.Hopmn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(CoroutineScope coroutineScope, kotlin.jvm.functions.l lVar) {
        this.e = 12;
        this.y = coroutineScope;
        this.z = (kotlin.coroutines.jvm.internal.i) lVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x027d A[LOOP:3: B:106:0x0248->B:116:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x020e  */
    /* JADX WARN: Code duplicated, block: B:98:0x022b  */
    /* JADX WARN: Type inference failed for: r0v41, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.l] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws PendingIntent.CanceledException {
        long j;
        k1 k1VarD;
        r0 r0Var;
        androidx.compose.ui.text.g gVar;
        List listX;
        e2 e2VarD;
        int i = 1;
        androidx.compose.runtime.tooling.i iVar = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (this.e) {
            case 0:
                ((m) this.y).c = (kotlin.jvm.functions.a) this.z;
                return y.a;
            case 1:
                ((q) this.y).d = (kotlin.jvm.functions.p) this.z;
                return y.a;
            case 2:
                ((Channel) this.y).mo28trySendJP2dKIU(this.z);
                return y.a;
            case 3:
                androidx.compose.foundation.t tVar = (androidx.compose.foundation.t) this.y;
                h0 h0Var = (h0) this.z;
                tVar.T = tVar.O.a(h0Var.e.d(), h0Var.getLayoutDirection(), h0Var);
                return y.a;
            case 4:
                ((z) this.y).e = androidx.compose.ui.node.k.h((t0) this.z, a1.a);
                return y.a;
            case 5:
                e0 e0Var = (e0) this.y;
                x xVar = (x) this.z;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) e0Var.getValue();
                return new androidx.compose.foundation.lazy.grid.i(xVar, hVar, new androidx.appcompat.widget.x((kotlin.ranges.d) xVar.d.f.getValue(), hVar));
            case 6:
                return new w0((androidx.compose.runtime.saveable.h) this.y, kotlin.collections.v.e, (androidx.compose.runtime.saveable.d) this.z);
            case 7:
                androidx.compose.ui.text.input.x xVar2 = (androidx.compose.ui.text.input.x) this.y;
                y0 y0Var = (y0) this.z;
                if (!l0.b(xVar2.b, ((androidx.compose.ui.text.input.x) y0Var.getValue()).b) || !kotlin.jvm.internal.l.a(xVar2.c, ((androidx.compose.ui.text.input.x) y0Var.getValue()).c)) {
                    y0Var.setValue(xVar2);
                }
                return y.a;
            case 8:
                ((z) this.y).e = ((kotlin.jvm.functions.a) this.z).invoke();
                return y.a;
            case 9:
                return new androidx.compose.ui.unit.j(android.support.v4.media.session.b.I(((androidx.compose.foundation.text.contextmenu.provider.e) this.y).m0((androidx.compose.ui.layout.x) ((kotlin.jvm.functions.a) this.z).invoke())));
            case 10:
                ((androidx.compose.foundation.text.contextmenu.data.d) this.y).d.invoke((androidx.compose.foundation.text.contextmenu.data.g) this.z);
                return y.a;
            case 11:
                androidx.compose.foundation.text.contextmenu.internal.s.a((Context) this.y, (TextClassification) this.z);
                return y.a;
            case 12:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, CoroutineStart.UNDISPATCHED, new c1((kotlin.coroutines.jvm.internal.i) this.z, null), 1, null);
                return y.a;
            case 13:
                androidx.compose.foundation.text.selection.c1 c1Var = (androidx.compose.foundation.text.selection.c1) this.y;
                long j2 = ((androidx.compose.ui.unit.l) ((y0) this.z).getValue()).a;
                androidx.compose.ui.geometry.b bVarI = c1Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (bVarI != null) {
                    long j3 = bVarI.a;
                    androidx.compose.ui.text.g gVarM = c1Var.m();
                    if (gVarM != null && gVarM.y.length() != 0) {
                        f0 f0Var = (f0) c1Var.r.getValue();
                        int i2 = f0Var == null ? -1 : e1.a[f0Var.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = c1Var.n().b;
                                int i3 = l0.c;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    coil3.g.a();
                                    return null;
                                }
                                long j5 = c1Var.n().b;
                                int i4 = l0.c;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            r0 r0Var2 = c1Var.d;
                            if (r0Var2 != null && (k1VarD = r0Var2.d()) != null && (r0Var = c1Var.d) != null && (gVar = r0Var.a.a) != null) {
                                int iC = com.google.android.material.resources.c.c(c1Var.b.v(i5), 0, gVar.y.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (k1VarD.d(j3) >> 32));
                                j0 j0Var = k1VarD.a;
                                androidx.compose.ui.text.n nVar = j0Var.b;
                                int iD = nVar.d(iC);
                                float fD = j0Var.d(iD);
                                float fE = j0Var.e(iD);
                                float fB = com.google.android.material.resources.c.b(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (androidx.compose.ui.unit.l.a(j2, 0L) || Math.abs(fIntBitsToFloat - fB) <= ((int) (j2 >> 32)) / 2) {
                                    float f = nVar.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(((nVar.b(iD) - f) / 2) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new androidx.compose.ui.geometry.b(jFloatToRawIntBits);
            case 14:
                c2 c2Var = (c2) this.y;
                r1 r1Var = (r1) this.z;
                if (((androidx.compose.runtime.internal.a) c2Var.y).get() == 0) {
                    r1Var.invoke();
                }
                return y.a;
            case 15:
                p0 p0Var = (p0) this.y;
                androidx.compose.runtime.y yVar = (androidx.compose.runtime.y) this.z;
                Object[] objArr = p0Var.b;
                long[] jArr = p0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j6 = jArr[i6];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j6) < 128) {
                                    yVar.A(objArr[(i6 << 3) + i8]);
                                }
                                j6 >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        } else if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return y.a;
            case 16:
                androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) this.y;
                Object obj = this.z;
                androidx.compose.runtime.r rVar = dVar.e;
                f2 f2Var = rVar.c;
                e2 e2VarD2 = f2Var.d();
                int i9 = 0;
                while (true) {
                    try {
                        if (i9 < f2Var.y) {
                            if (e2VarD2.l(i9)) {
                                Object objN = e2VarD2.n(i9);
                                if (objN != obj) {
                                    a2 a2Var = objN instanceof a2 ? (a2) objN : null;
                                    if ((a2Var != null ? a2Var.a : null) == obj) {
                                    }
                                }
                                androidx.compose.runtime.tooling.i iVar2 = new androidx.compose.runtime.tooling.i(i9, null);
                                e2VarD2.c();
                                iVar = iVar2;
                                if (iVar != null) {
                                    int i10 = iVar.a;
                                    Integer num = iVar.b;
                                    e2VarD = f2Var.d();
                                    try {
                                        ArrayList arrayListL = kotlin.math.a.L(e2VarD, i10, num);
                                        e2VarD.c();
                                        listX = kotlin.collections.o.X(arrayListL, rVar.J());
                                    } catch (Throwable th) {
                                        e2VarD.c();
                                        throw th;
                                    }
                                } else {
                                    listX = kotlin.collections.u.e;
                                }
                                return new androidx.compose.runtime.tooling.a(listX);
                            }
                            int[] iArr = e2VarD2.b;
                            int i11 = i9 + 1;
                            int iB = (i11 < e2VarD2.c ? iArr[(i11 * 5) + 4] : e2VarD2.e) - h2.b(i9, iArr);
                            int i12 = 0;
                            while (true) {
                                if (i12 >= iB) {
                                    i9 = i11;
                                } else {
                                    Object objH = e2VarD2.h(i9, i12);
                                    if (objH != obj) {
                                        a2 a2Var2 = objH instanceof a2 ? (a2) objH : null;
                                        if ((a2Var2 != null ? a2Var2.a : null) != obj) {
                                            i12++;
                                        }
                                    }
                                    iVar = new androidx.compose.runtime.tooling.i(i9, Integer.valueOf(i12));
                                }
                            }
                        }
                        e2VarD2.c();
                        if (iVar != null) {
                            int i13 = iVar.a;
                            Integer num2 = iVar.b;
                            e2VarD = f2Var.d();
                            ArrayList arrayListL2 = kotlin.math.a.L(e2VarD, i13, num2);
                            e2VarD.c();
                            listX = kotlin.collections.o.X(arrayListL2, rVar.J());
                        } else {
                            listX = kotlin.collections.u.e;
                        }
                        return new androidx.compose.runtime.tooling.a(listX);
                    } catch (Throwable th2) {
                        e2VarD2.c();
                        throw th2;
                    }
                }
            case 17:
                return t1.j((Context) this.y, ((androidx.datastore.preferences.a) this.z).a.concat(".preferences_pb"));
            case 18:
                androidx.navigation.l lVar = (androidx.navigation.l) this.y;
                androidx.navigation.i iVar3 = (androidx.navigation.i) this.z;
                synchronized (lVar.a) {
                    try {
                        MutableStateFlow mutableStateFlow = lVar.b;
                        Iterable iterable = (Iterable) mutableStateFlow.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.l.a((androidx.navigation.i) obj2, iVar3)) {
                                mutableStateFlow.setValue(arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        mutableStateFlow.setValue(arrayList);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return y.a;
            case 19:
                ((androidx.navigation.compose.o) this.y).e((androidx.navigation.i) this.z, false);
                return y.a;
            case 20:
                return com.google.common.base.c.p(new kotlin.k((coil3.fetch.h) this.y, (kotlin.jvm.internal.e) this.z));
            case 21:
                Context context = (Context) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                com.app.mlounge.util.c.a();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                Application application = (Application) applicationContext;
                com.app.mlounge.util.c.c(application).reportUserConsent(Hopmn.ConsentChoice.BANDWIDTH);
                com.app.mlounge.util.c.f(application);
                lVar2.invoke(Boolean.TRUE);
                return y.a;
            case 22:
                ((kotlin.jvm.functions.l) this.y).invoke((w) this.z);
                return y.a;
            case 23:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.a(cVar, (EpornerVideoDetail) this.z, b == true ? 1 : 0, i), 3, null);
                return y.a;
            case 24:
                com.app.mlounge.ui.viewmodel.c cVar2 = (com.app.mlounge.ui.viewmodel.c) this.y;
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.z;
                MutableStateFlow mutableStateFlow2 = cVar2.g;
                aVar.getClass();
                MutableStateFlow mutableStateFlow3 = cVar2.o;
                if (mutableStateFlow3.getValue() != aVar) {
                    mutableStateFlow3.setValue(aVar);
                    MutableStateFlow mutableStateFlow4 = cVar2.e;
                    kotlin.collections.u uVar = kotlin.collections.u.e;
                    mutableStateFlow4.setValue(uVar);
                    mutableStateFlow2.setValue(uVar);
                    cVar2.m.setValue(null);
                    cVar2.E = 1;
                    cVar2.F = true;
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(cVar2), null, null, new androidx.room.coroutines.f(cVar2, aVar, b2 == true ? 1 : 0, 20), 3, null);
                    String str = (String) kotlin.collections.o.M((List) mutableStateFlow2.getValue());
                    if (str != null) {
                        cVar2.q.setValue(str);
                        cVar2.e();
                    }
                }
                return y.a;
            case 25:
                com.app.mlounge.ui.viewmodel.c cVar3 = (com.app.mlounge.ui.viewmodel.c) this.y;
                String str2 = (String) this.z;
                str2.getClass();
                cVar3.q.setValue(str2);
                cVar3.e();
                return y.a;
            case 26:
                com.app.mlounge.ui.viewmodel.g gVar2 = (com.app.mlounge.ui.viewmodel.g) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(gVar2), null, null, new androidx.room.coroutines.f((HiAnimeDetailData) this.z, gVar2, b3 == true ? 1 : 0, 22), 3, null);
                return y.a;
            case 27:
                com.app.mlounge.ui.viewmodel.g gVar3 = (com.app.mlounge.ui.viewmodel.g) this.y;
                String str3 = (String) this.z;
                str3.getClass();
                gVar3.r.setValue(str3);
                gVar3.e();
                return y.a;
            case 28:
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) this.z;
                pVar.invoke(bVar.b, bVar.a);
                return y.a;
            default:
                ((kotlin.jvm.functions.l) this.y).invoke((GamePlatform) this.z);
                return y.a;
        }
    }

    public /* synthetic */ f(androidx.navigation.l lVar, androidx.navigation.i iVar, boolean z) {
        this.e = 18;
        this.y = lVar;
        this.z = iVar;
    }

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
