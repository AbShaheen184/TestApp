package android.support.v4.media.session;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.compose.e;
import androidx.activity.compose.h;
import androidx.activity.compose.i;
import androidx.activity.compose.s;
import androidx.activity.e0;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.material3.y;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.g;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import androidx.navigationevent.d;
import androidx.room.v;
import androidx.room.w;
import coil3.network.o;
import coil3.network.q;
import com.app.mlounge.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.a0;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.text.k;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okio.b0;
import okio.z;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static g a;
    public static androidx.compose.ui.graphics.c b;
    public static androidx.compose.ui.graphics.drawscope.b c;
    public static f d;
    public static f e;
    public static f f;
    public static f g;
    public static f h;
    public static f i;
    public static f j;
    public static f k;
    public static Boolean l;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    public static final long A(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static final void B(i2 i2Var, androidx.compose.runtime.c cVar, int i2) {
        while (true) {
            int i3 = i2Var.v;
            if (i2 > i3 && i2 < i2Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            i2Var.M();
            if (i2Var.y(i2Var.v)) {
                cVar.k();
            }
            i2Var.j();
        }
    }

    public static boolean C(Parcel parcel, int i2) {
        O(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static q D(b0 b0Var) {
        int i2 = Integer.parseInt(b0Var.s(Long.MAX_VALUE));
        long j2 = Long.parseLong(b0Var.s(Long.MAX_VALUE));
        long j3 = Long.parseLong(b0Var.s(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(b0Var.s(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strS = b0Var.s(Long.MAX_VALUE);
            int iA0 = k.a0(strS, ':', 0, 6);
            if (iA0 == -1) {
                net.luminis.tls.engine.impl.c.p("Unexpected header: ".concat(strS));
                return null;
            }
            String string = k.A0(strS.substring(0, iA0)).toString();
            String strSubstring = strS.substring(iA0 + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new q(i2, j2, j3, new o(a0.H(linkedHashMap)), null, null);
    }

    public static IBinder E(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iH);
        return strongBinder;
    }

    public static int F(Parcel parcel, int i2) {
        O(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long G(Parcel parcel, int i2) {
        O(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int H(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static final long I(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static void J(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i2));
    }

    public static boolean K(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static Bundle L(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static int M(Parcel parcel) {
        int i2 = parcel.readInt();
        int iH = H(parcel, i2);
        char c2 = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iH + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i3);
        throw new com.google.android.gms.common.internal.safeparcel.b(sb.toString(), parcel);
    }

    public static void N(q qVar, z zVar) {
        zVar.S(qVar.a);
        zVar.writeByte(10);
        zVar.S(qVar.b);
        zVar.writeByte(10);
        zVar.S(qVar.c);
        zVar.writeByte(10);
        Set<Map.Entry> setEntrySet = qVar.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        zVar.S(size);
        zVar.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                zVar.x((String) entry.getKey());
                zVar.x(":");
                zVar.x(str);
                zVar.writeByte(10);
            }
        }
    }

    public static void O(Parcel parcel, int i2, int i3) {
        int iH = H(parcel, i2);
        if (iH == i3) {
            return;
        }
        String hexString = Integer.toHexString(iH);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iH).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iH);
        throw new com.google.android.gms.common.internal.safeparcel.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(sb, " (0x", hexString, ")"), parcel);
    }

    public static void P(Parcel parcel, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i2).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        throw new com.google.android.gms.common.internal.safeparcel.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(boolean z, kotlin.jvm.functions.a aVar, r rVar, int i2) {
        rVar.c0(-361453782);
        int i3 = i2 | 6 | (rVar.h(aVar) ? 32 : 16);
        if (rVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objA = androidx.navigationevent.compose.a.a(rVar);
            if (objA == null) {
                rVar.b0(535274673);
                objA = s.a(rVar);
            } else {
                rVar.b0(535271790);
            }
            rVar.p(false);
            if (objA == null) {
                net.luminis.tls.engine.impl.c.r("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = rVar.f(objA);
            Object objQ = rVar.Q();
            Object obj = m.a;
            if (zF || objQ == obj) {
                d dVar = objA instanceof d ? (d) objA : null;
                androidx.navigationevent.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                e0 e0Var = objA instanceof e0 ? (e0) objA : null;
                objQ = new androidx.activity.compose.internal.c(navigationEventDispatcher, e0Var != null ? e0Var.getOnBackPressedDispatcher() : null);
                rVar.l0(objQ);
            }
            Object obj2 = (androidx.activity.compose.internal.c) objQ;
            long j2 = rVar.T;
            boolean zF2 = rVar.f(obj2) | rVar.e(j2);
            Object objQ2 = rVar.Q();
            Object obj3 = objQ2;
            if (zF2 || objQ2 == obj) {
                androidx.activity.compose.m mVar = new androidx.activity.compose.m(new e(j2, objA));
                mVar.c = new androidx.activity.compose.b(1);
                rVar.l0(mVar);
                obj3 = mVar;
            }
            Object obj4 = (androidx.activity.compose.m) obj3;
            rVar.b0(-585307852);
            boolean zH = rVar.h(obj4) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ3 = rVar.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.f(0, obj4, aVar);
                rVar.l0(objQ3);
            }
            j0.e((kotlin.jvm.functions.a) objQ3, rVar);
            boolean zH2 = rVar.h(obj4);
            Object objQ4 = rVar.Q();
            if (zH2 || objQ4 == obj) {
                objQ4 = new androidx.activity.compose.g(obj4, 0);
                rVar.l0(objQ4);
            }
            coil3.network.g.c(true, obj4, null, (l) objQ4, rVar, 6);
            boolean zH3 = rVar.h(obj2) | rVar.h(obj4);
            Object objQ5 = rVar.Q();
            if (zH3 || objQ5 == obj) {
                objQ5 = new h(0, obj2, obj4);
                rVar.l0(objQ5);
            }
            j0.a(obj2, obj4, (l) objQ5, rVar);
            rVar.p(false);
            z = true;
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new i(z, aVar, i2, 0);
        }
    }

    public static final void b(androidx.navigation.i iVar, androidx.compose.runtime.saveable.d dVar, androidx.compose.runtime.internal.f fVar, r rVar, int i2) {
        rVar.c0(233973821);
        if ((((rVar.h(iVar) ? 4 : 2) | i2 | (rVar.h(dVar) ? 32 : 16)) & Token.EXPR_VOID) == 146 && rVar.F()) {
            rVar.W();
        } else {
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{androidx.lifecycle.viewmodel.compose.a.a.a(iVar), androidx.lifecycle.compose.c.a.a(iVar), androidx.savedstate.compose.a.a.a(iVar)}, androidx.compose.runtime.internal.k.c(1808964477, new y(4, dVar, fVar), rVar), rVar, 56);
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(iVar, dVar, fVar, i2, 3);
        }
    }

    public static final void c(androidx.compose.runtime.saveable.d dVar, androidx.compose.runtime.internal.f fVar, r rVar, int i2) {
        rVar.c0(832919318);
        int i3 = (rVar.h(dVar) ? 4 : 2) | i2 | (rVar.h(fVar) ? 32 : 16);
        if ((i3 & 19) == 18 && rVar.F()) {
            rVar.W();
        } else {
            Object objQ = rVar.Q();
            if (objQ == m.a) {
                objQ = new androidx.compose.ui.text.y(19);
                rVar.l0(objQ);
            }
            l lVar = (l) objQ;
            w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
            if (w0VarA == null) {
                net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(androidx.navigation.compose.a.class);
            androidx.collection.internal.b bVar = new androidx.collection.internal.b(1);
            bVar.b(kotlin.jvm.internal.a0.a(androidx.navigation.compose.a.class), lVar);
            androidx.navigation.compose.a aVar = (androidx.navigation.compose.a) h1.B(eVarA, w0VarA, bVar.d(), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
            androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c();
            cVar.e = new WeakReference(dVar);
            aVar.c = cVar;
            dVar.e(aVar.b, fVar, rVar, ((i3 << 6) & 896) | (i3 & Token.ASSIGN_MOD));
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(dVar, fVar, i2, 13);
        }
    }

    public static final boolean d(androidx.compose.ui.draganddrop.g gVar, long j2) {
        if (!gVar.e.K) {
            return false;
        }
        androidx.compose.ui.node.r rVar = (androidx.compose.ui.node.r) androidx.compose.ui.node.k.t(gVar).d0.d;
        if (!rVar.o0.K) {
            return false;
        }
        long jW = rVar.W(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jW & 4294967295L));
        long j3 = gVar.N;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final Object e(androidx.compose.ui.node.i iVar, kotlin.jvm.functions.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object obj;
        d1 d1VarS;
        Object objH;
        a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) iVar;
        boolean z = qVar.e.K;
        if (z) {
            if (!z) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar2 = qVar.e.B;
            f0 f0VarT = androidx.compose.ui.node.k.t(iVar);
            loop0: while (true) {
                obj = null;
                if (f0VarT == null) {
                    break;
                }
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 524288) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.z & 524288) != 0) {
                            androidx.compose.ui.q qVarE = qVar2;
                            androidx.compose.runtime.collection.b bVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof androidx.compose.ui.relocation.a) {
                                    obj = qVarE;
                                    break loop0;
                                }
                                if ((qVarE.z & 524288) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                        if ((qVar3.z & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        qVar2 = qVar2.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar2 = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
            }
            androidx.compose.ui.relocation.a aVar2 = (androidx.compose.ui.relocation.a) obj;
            if (aVar2 != null && (objH = aVar2.H((d1VarS = androidx.compose.ui.node.k.s(iVar)), new androidx.compose.ui.draw.b(7, aVar, d1VarS), cVar)) == kotlin.coroutines.intrinsics.a.e) {
                return objH;
            }
        }
        return kotlin.y.a;
    }

    public static int f(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static final y0 g(androidx.compose.foundation.interaction.k kVar, r rVar, int i2) {
        Object objQ = rVar.Q();
        androidx.compose.runtime.f fVar = m.a;
        if (objQ == fVar) {
            objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
            rVar.l0(objQ);
        }
        y0 y0Var = (y0) objQ;
        boolean z = (((i2 & 14) ^ 6) > 4 && rVar.f(kVar)) || (i2 & 6) == 4;
        Object objQ2 = rVar.Q();
        if (z || objQ2 == fVar) {
            objQ2 = new androidx.compose.foundation.interaction.g(kVar, y0Var, null, 0);
            rVar.l0(objQ2);
        }
        j0.c(rVar, kVar, (p) objQ2);
        return y0Var;
    }

    public static final Object h(androidx.room.q qVar, l lVar, kotlin.coroutines.d dVar) {
        if (qVar.g() && qVar.i() && qVar.h()) {
            return lVar.invoke(dVar);
        }
        if (dVar.getContext().get(androidx.room.s.e) == null) {
            return lVar.invoke(dVar);
        }
        androidx.activity.compose.p pVar = new androidx.activity.compose.p(lVar, (kotlin.coroutines.d) null, 28);
        v vVar = (v) dVar.getContext().get(v.y);
        kotlin.coroutines.f fVar = vVar != null ? vVar.e : null;
        if (fVar != null) {
            return BuildersKt.withContext(fVar, pVar, dVar);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            w wVar = qVar.d;
            if (wVar != null) {
                wVar.execute(new androidx.core.provider.m(1, cancellableContinuationImpl, qVar, pVar));
                return cancellableContinuationImpl.getResult();
            }
            kotlin.jvm.internal.l.f("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static Bundle j(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iH);
        return bundle;
    }

    public static byte[] k(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iH);
        return bArrCreateByteArray;
    }

    public static byte[][] l(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        byte[][] bArr = new byte[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iH);
        return bArr;
    }

    public static final androidx.compose.ui.text.font.f m(Context context) {
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        context.getApplicationContext();
        return new androidx.compose.ui.text.font.f(gVar, new androidx.compose.ui.text.font.a(Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.text.font.m.a.a(context) : 0));
    }

    public static int[] n(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iH);
        return iArrCreateIntArray;
    }

    public static Parcelable o(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iH);
        return parcelable;
    }

    public static String p(Parcel parcel, int i2) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iH);
        return string;
    }

    public static Object[] q(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return objArrCreateTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iH = H(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return arrayListCreateTypedArrayList;
    }

    public static final Object s(androidx.datastore.core.e eVar, p pVar, kotlin.coroutines.d dVar) {
        return eVar.a(new androidx.datastore.preferences.core.b(pVar, null, 1), dVar);
    }

    public static void t(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new com.google.android.gms.common.internal.safeparcel.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i2, "Overread allowed size end=", new StringBuilder(String.valueOf(i2).length() + 26)), parcel);
        }
    }

    public static final f u() {
        f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Animation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(15.0f, 2.0f);
        gVarH.h(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f);
        gVarH.h(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
        gVarH.g(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
        gVarH.h(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        gVarH.h(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f);
        gVarH.h(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
        gVarH.g(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
        gVarH.h(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        gVarH.f();
        gVarH.o(9.0f, 20.0f);
        gVarH.h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarH.h(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        gVarH.h(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        gVarH.h(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
        gVarH.f();
        gVarH.o(12.0f, 17.0f);
        gVarH.h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarH.h(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        gVarH.h(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
        gVarH.h(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
        gVarH.f();
        gVarH.o(16.7f, 13.7f);
        gVarH.h(-0.53f, 0.19f, -1.1f, 0.3f, -1.7f, 0.3f);
        gVarH.h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarH.h(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
        gVarH.h(0.53f, -0.19f, 1.1f, -0.3f, 1.7f, -0.3f);
        gVarH.h(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        gVarH.h(0.0f, 0.6f, -0.11f, 1.17f, -0.3f, 1.7f);
        gVarH.f();
        gVarH.o(19.0f, 12.0f);
        gVarH.h(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
        gVarH.h(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
        gVarH.h(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        gVarH.h(0.0f, 1.12f, -0.37f, 2.16f, -1.0f, 3.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final f v() {
        f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(13.0f, 3.0f);
        gVarH.h(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        gVarH.m(1.0f, 12.0f);
        gVarH.n(3.89f, 3.89f);
        gVarH.n(0.07f, 0.14f);
        gVarH.m(9.0f, 12.0f);
        gVarH.m(6.0f, 12.0f);
        gVarH.h(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        gVarH.q(7.0f, 3.13f, 7.0f, 7.0f);
        gVarH.q(-3.13f, 7.0f, -7.0f, 7.0f);
        gVarH.h(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        gVarH.n(-1.42f, 1.42f);
        gVarH.g(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        gVarH.h(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        gVarH.q(-4.03f, -9.0f, -9.0f, -9.0f);
        gVarH.f();
        gVarH.o(12.0f, 8.0f);
        gVarH.s(5.0f);
        gVarH.n(4.28f, 2.54f);
        gVarH.n(0.72f, -1.21f);
        gVarH.n(-3.5f, -2.08f);
        gVarH.m(13.5f, 8.0f);
        gVarH.m(12.0f, 8.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static final ViewParent w(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final f x() {
        f fVar = i;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Replay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(12.0f, 5.0f);
        gVar.r(1.0f);
        gVar.m(7.0f, 6.0f);
        gVar.n(5.0f, 5.0f);
        gVar.r(7.0f);
        gVar.h(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        gVar.q(-2.69f, 6.0f, -6.0f, 6.0f);
        gVar.q(-6.0f, -2.69f, -6.0f, -6.0f);
        gVar.k(4.0f);
        gVar.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        gVar.q(8.0f, -3.58f, 8.0f, -8.0f);
        gVar.q(-3.58f, -8.0f, -8.0f, -8.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        i = fVarB;
        return fVarB;
    }

    public static final f y() {
        f fVar = j;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SubtitlesOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        long j2 = t.b;
        p0 p0Var = new p0(j2);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(20.0f, 4.0f);
        gVar.k(6.83f);
        gVar.n(8.0f, 8.0f);
        gVar.k(20.0f);
        gVar.s(2.0f);
        gVar.l(-3.17f);
        gVar.n(4.93f, 4.93f);
        gVar.g(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
        gVar.r(6.0f);
        gVar.g(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        p0 p0Var2 = new p0(j2);
        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
        gVar2.o(1.04f, 3.87f);
        gVar2.n(1.2f, 1.2f);
        gVar2.g(2.09f, 5.35f, 2.0f, 5.66f, 2.0f, 6.0f);
        gVar2.s(12.0f);
        gVar2.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar2.l(13.17f);
        gVar2.n(2.96f, 2.96f);
        gVar2.n(1.41f, -1.41f);
        gVar2.m(2.45f, 2.45f);
        gVar2.m(1.04f, 3.87f);
        gVar2.f();
        gVar2.o(8.0f, 12.0f);
        gVar2.s(2.0f);
        gVar2.k(4.0f);
        gVar2.s(-2.0f);
        gVar2.k(8.0f);
        gVar2.f();
        gVar2.o(14.0f, 16.83f);
        gVar2.r(18.0f);
        gVar2.k(4.0f);
        gVar2.s(-2.0f);
        gVar2.l(9.17f);
        gVar2.m(14.0f, 16.83f);
        gVar2.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar2.a, 0, p0Var2);
        f fVarB = eVar.b();
        j = fVarB;
        return fVarB;
    }

    public static final void z(String str) {
        str.getClass();
        throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.q("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
