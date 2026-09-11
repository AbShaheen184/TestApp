package _COROUTINE;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.v1;
import androidx.compose.animation.g1;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.a0;
import androidx.compose.ui.graphics.vector.e;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.k;
import androidx.compose.ui.graphics.vector.m;
import androidx.compose.ui.graphics.vector.o;
import androidx.compose.ui.graphics.vector.u;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.y;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.semantics.p;
import androidx.core.view.accessibility.d;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.d0;
import com.app.mlounge.ui.viewmodel.y1;
import com.app.mlounge.ui.viewmodel.z1;
import com.google.common.base.i;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.q;
import kotlin.text.l;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.luminis.tls.engine.impl.c;
import okio.x;
import org.jsoup.helper.n;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a;
    public static f b;
    public static f c;
    public static f d;
    public static f e;
    public static f f;
    public static f g;
    public static f h;
    public static f i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public a() {
        new ConcurrentHashMap();
    }

    public static final f A() {
        f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Remove", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new o(19.0f, 13.0f));
        arrayList.add(new m(5.0f));
        arrayList.add(new a0(-2.0f));
        arrayList.add(new u(14.0f));
        arrayList.add(new a0(2.0f));
        arrayList.add(k.c);
        e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static boolean C(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || !(i2 == 26 || i2 == 27)) {
            return i3 >= 33 && i2 == 30;
        }
        return true;
    }

    public static final String D(Collection collection) {
        return l.C(kotlin.collections.o.R(collection, ",", null, null, null, 62)).concat(l.C(" }"));
    }

    public static final String E(Collection collection) {
        return l.C(kotlin.collections.o.R(collection, ",", null, null, null, 62)).concat(l.C("},"));
    }

    public static androidx.emoji2.text.flatbuffer.b F(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            c.t("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    androidx.emoji2.text.flatbuffer.b bVar = new androidx.emoji2.text.flatbuffer.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.A = byteBufferDuplicate;
                    bVar.e = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.y = i7;
                    bVar.z = ((ByteBuffer) bVar.A).getShort(i7);
                    return bVar;
                }
            }
        }
        c.t("Cannot read metadata.");
        return null;
    }

    public static void G(androidx.media3.common.text.a aVar) {
        aVar.k = -3.4028235E38f;
        aVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.a = SpannableString.valueOf(charSequence);
                aVar.b = null;
            }
            CharSequence charSequence2 = aVar.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float H(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }

    public static final void I(p pVar, d dVar) {
        Object objG = pVar.k().e.g(androidx.compose.ui.semantics.t.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            androidx.transition.k.i();
            return;
        }
        p pVarL = pVar.l();
        if (pVarL == null) {
            return;
        }
        Object objG2 = pVarL.k().e.g(androidx.compose.ui.semantics.t.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = pVarL.k().e.g(androidx.compose.ui.semantics.t.f);
            androidx.compose.ui.semantics.c cVar = (androidx.compose.ui.semantics.c) (objG3 != null ? objG3 : null);
            if (cVar == null || (cVar.a >= 0 && cVar.b >= 0)) {
                if (pVar.k().e.c(androidx.compose.ui.semantics.t.I)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = p.j(4, pVarL);
                    int size = listJ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        p pVar2 = (p) listJ.get(i3);
                        if (pVar2.k().e.c(androidx.compose.ui.semantics.t.I)) {
                            arrayList.add(pVar2);
                            if (pVar2.c.w() < pVar.c.w()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zK = k(arrayList);
                    int i4 = zK ? 0 : i2;
                    int i5 = zK ? i2 : 0;
                    Object objG4 = pVar.k().e.g(androidx.compose.ui.semantics.t.I);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final androidx.compose.ui.autofill.f a(String str) {
        return new androidx.compose.ui.autofill.f(i.t(str));
    }

    public static androidx.compose.ui.unit.d b() {
        return new androidx.compose.ui.unit.d(1.0f, 1.0f);
    }

    public static coil3.decode.p c(x xVar, okio.k kVar, String str, coil3.disk.f fVar, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            fVar = null;
        }
        return new coil3.decode.p(xVar, kVar, str, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r18v8, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r5v34, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r71v0, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v37, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v39, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v43, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v44, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v53, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void d(final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final kotlin.jvm.functions.l lVar3, final kotlin.jvm.functions.l lVar4, final kotlin.jvm.functions.l lVar5, final q qVar, final kotlin.jvm.functions.l lVar6, boolean z, final kotlin.jvm.functions.a aVar, z1 z1Var, r rVar, int i2) {
        z1 z1Var2;
        ?? r9;
        z1 z1Var3;
        int i3;
        ?? arrayList;
        ArrayList arrayList2;
        boolean z2;
        ?? r10;
        z1 z1Var4;
        z1 z1Var5;
        boolean z3;
        ?? r11;
        String str;
        String str2;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        rVar.c0(942234431);
        int i4 = i2 | (rVar.h(lVar) ? 4 : 2) | (rVar.h(lVar2) ? 32 : 16) | (rVar.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(lVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(lVar5) ? 16384 : 8192) | (rVar.h(qVar) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(lVar6) ? 1048576 : 524288) | (rVar.g(z) ? 8388608 : 4194304) | 268435456;
        if (rVar.T(i4 & 1, (i4 & 306783379) != 306783378)) {
            rVar.Y();
            if ((i2 & 1) == 0 || rVar.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    z1Var3 = (z1) h1.B(kotlin.jvm.internal.a0.a(z1.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                    i3 = i4 & (-1879048193);
                }
            } else {
                rVar.W();
                i3 = i4 & (-1879048193);
                z1Var3 = z1Var;
            }
            rVar.q();
            StateFlow stateFlow = z1Var3.p;
            e1 e1Var = z1Var3.j;
            y0 y0VarG = s.g(stateFlow, rVar);
            final y0 y0VarG2 = s.g(z1Var3.d, rVar);
            final y0 y0VarG3 = s.g(z1Var3.e, rVar);
            final y0 y0VarG4 = s.g(z1Var3.g, rVar);
            final y0 y0VarG5 = s.g(z1Var3.i, rVar);
            y0 y0VarG6 = s.g(z1Var3.o, rVar);
            final Context context = (Context) rVar.j(m0.b);
            androidx.compose.foundation.lazy.grid.x xVarA = z.a(z1Var3.k.g(), z1Var3.l.g(), rVar, 0);
            boolean zF = rVar.f(xVarA) | rVar.h(z1Var3);
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            kotlin.coroutines.d dVar = null;
            if (zF || objQ == obj) {
                objQ = new androidx.room.coroutines.f(xVarA, z1Var3, dVar, 19);
                rVar.l0(objQ);
            }
            j0.c(rVar, xVarA, (kotlin.jvm.functions.p) objQ);
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = new LinkedHashMap();
                rVar.l0(objQ2);
            }
            final Map map = (Map) objQ2;
            Object objQ3 = rVar.Q();
            if (objQ3 == obj) {
                objQ3 = s.r(null);
                rVar.l0(objQ3);
            }
            final y0 y0Var = (y0) objQ3;
            List listQ = z ? com.google.common.base.c.q("All", "Movies", "TV Shows", "Live TV", "Anime", "Music", "Adult") : com.google.common.base.c.q("All", "Movies", "TV Shows", "Live TV", "Anime", "Music");
            if (z) {
                arrayList = (List) y0VarG.getValue();
            } else {
                List list = (List) y0VarG.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj2).b, "adult")) {
                        arrayList.add(obj2);
                    }
                }
            }
            boolean zD = rVar.d(e1Var.g()) | rVar.f(arrayList) | ((29360128 & i3) == 8388608);
            Object objQ4 = rVar.Q();
            ?? r12 = objQ4;
            if (zD || objQ4 == obj) {
                ?? r6 = arrayList;
                r6 = arrayList;
                switch (e1Var.g()) {
                    case 1:
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj3).b, "movie")) {
                                arrayList2.add(obj3);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 2:
                        arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj4).b, "tv")) {
                                arrayList2.add(obj4);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 3:
                        arrayList2 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj5).b, "live_tv")) {
                                arrayList2.add(obj5);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 4:
                        arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Iterator it2 = it;
                            if (kotlin.text.r.O(((com.app.mlounge.data.local.entity.f) next).b, "anime", false)) {
                                arrayList2.add(next);
                            }
                            it = it2;
                        }
                        r6 = arrayList2;
                        break;
                    case 5:
                        arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            Iterator it4 = it3;
                            if (kotlin.text.r.O(((com.app.mlounge.data.local.entity.f) next2).b, "music", false)) {
                                arrayList2.add(next2);
                            }
                            it3 = it4;
                        }
                        r6 = arrayList2;
                        break;
                    case 6:
                        if (z) {
                            arrayList2 = new ArrayList();
                            for (Object obj6 : arrayList) {
                                if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj6).b, "adult")) {
                                    arrayList2.add(obj6);
                                }
                            }
                            r6 = arrayList2;
                        }
                        break;
                }
                rVar.l0(r6);
                r12 = r6;
            }
            final List list2 = (List) r12;
            boolean zH = rVar.h(map);
            Object objQ5 = rVar.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new com.app.mlounge.ui.screens.history.c(map, y0Var, null, 1);
                rVar.l0(objQ5);
            }
            j0.c(rVar, list2, (kotlin.jvm.functions.p) objQ5);
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            v vVarA = androidx.compose.foundation.layout.t.a(h.c, androidx.compose.ui.c.J, rVar, 0);
            List list3 = listQ;
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, a0Var);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            s.x(rVar, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            s.x(rVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            s.p(rVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
            s.t(rVar, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            s.x(rVar, rVarC, eVar4);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 16;
            int i5 = i3;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f2, f2, f2, 4);
            androidx.compose.foundation.layout.d dVar3 = h.e;
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            t0 t0VarA = r0.a(dVar3, iVar, rVar, 54);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarR);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            s.x(rVar, t0VarA, eVar);
            s.x(rVar, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar2);
            s.x(rVar, rVarC2, eVar4);
            u2 u2Var = u3.a;
            z1 z1Var6 = z1Var3;
            Object obj7 = obj;
            p3.b("My Favourites", null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).e, rVar, 390, 0, 131066);
            ?? r13 = rVar;
            if (((List) y0VarG.getValue()).isEmpty()) {
                z2 = false;
                r13.b0(1669433181);
                r13.p(false);
                r10 = r13;
            } else {
                r13.b0(1669235742);
                p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(((List) y0VarG.getValue()).size(), " items"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) r13.j(u2Var)).k, rVar, 384, 0, 131066);
                ?? r14 = rVar;
                z2 = false;
                r14.p(false);
                r10 = r14;
            }
            r10.p(true);
            float f3 = 8;
            androidx.compose.foundation.layout.b.d(r10, androidx.compose.foundation.layout.w0.f(oVar, f3));
            float f4 = 12;
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(r10), z2), f4, 0.0f, f4, f3, 2);
            t0 t0VarA2 = r0.a(h.g(f3), iVar, r10, 54);
            int iHashCode3 = Long.hashCode(r10.T);
            androidx.compose.runtime.internal.j jVarL3 = r10.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(r10, rVarS);
            r10.e0();
            if (r10.S) {
                r10.k(yVar);
            } else {
                r10.o0();
            }
            s.x(r10, t0VarA2, eVar);
            s.x(r10, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, r10, eVar3, r10, dVar2);
            s.x(r10, rVarC3, eVar4);
            r10.b0(497347839);
            int i6 = 0;
            ?? r15 = r10;
            for (Object obj8 : list3) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    com.google.common.base.c.w();
                    throw null;
                }
                String str3 = (String) obj8;
                Object objQ6 = r15.Q();
                Object obj9 = obj7;
                if (objQ6 == obj9) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(r15);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ6;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f3)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, r15, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f3));
                z1 z1Var7 = z1Var6;
                boolean zH2 = r15.h(z1Var7) | r15.d(i6);
                Object objQ7 = r15.Q();
                if (zH2 || objQ7 == obj9) {
                    objQ7 = new b0(z1Var7, i6, 3);
                    r15.l0(objQ7);
                }
                ?? r18 = r15;
                f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ7, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f3), e1Var.g() == i6 ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-253074515, new v1(z1Var7, i6, str3, 13), r15), r18, 12582912, 120);
                f4 = f4;
                z1Var6 = z1Var7;
                obj7 = obj9;
                r15 = r18;
                i6 = i7;
            }
            float f5 = f4;
            z1 z1Var8 = z1Var6;
            Object obj10 = obj7;
            r15.p(false);
            y1 y1Var = (y1) y0VarG6.getValue();
            boolean zH3 = r15.h(z1Var8);
            Object objQ8 = r15.Q();
            if (zH3 || objQ8 == obj10) {
                objQ8 = new androidx.compose.foundation.c(1, z1Var8, z1.class, "setSortBy", "setSortBy(Lcom/app/mlounge/ui/viewmodel/WatchlistSortOption;)V", 0, 26);
                z1Var4 = z1Var8;
                r15.l0(objQ8);
            } else {
                z1Var4 = z1Var8;
            }
            e(y1Var, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ8), r15, 0);
            r15.p(true);
            if (list2.isEmpty()) {
                r15.b0(796582648);
                androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                int iHashCode4 = Long.hashCode(r15.T);
                androidx.compose.runtime.internal.j jVarL4 = r15.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(r15, a0Var2);
                g.b.getClass();
                y yVar2 = androidx.compose.ui.node.f.b;
                r15.e0();
                if (r15.S) {
                    r15.k(yVar2);
                } else {
                    r15.o0();
                }
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
                s.x(r15, q0VarD, eVar5);
                androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
                s.x(r15, jVarL4, eVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                s.p(r15, numValueOf2, eVar7);
                androidx.compose.ui.node.d dVar4 = androidx.compose.ui.node.f.g;
                s.t(r15, dVar4);
                androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
                s.x(r15, rVarC4, eVar8);
                v vVarA2 = androidx.compose.foundation.layout.t.a(h.c, androidx.compose.ui.c.K, r15, 48);
                int iHashCode5 = Long.hashCode(r15.T);
                androidx.compose.runtime.internal.j jVarL5 = r15.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(r15, oVar);
                r15.e0();
                if (r15.S) {
                    r15.k(yVar2);
                } else {
                    r15.o0();
                }
                s.x(r15, vVarA2, eVar5);
                s.x(r15, jVarL5, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, r15, eVar7, r15, dVar4);
                s.x(r15, rVarC5, eVar8);
                f fVarP = com.google.android.gms.dynamite.g.p();
                long j2 = com.app.mlounge.ui.theme.b.m;
                ?? r5 = r15;
                f1.b(fVarP, null, androidx.compose.foundation.layout.w0.l(oVar, 64), j2, r5, 3504, 0);
                androidx.compose.foundation.layout.b.d(r5, androidx.compose.foundation.layout.w0.f(oVar, f2));
                if (e1Var.g() == 0) {
                    str = "Your favourites is empty";
                } else {
                    String lowerCase = ((String) list3.get(e1Var.g())).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str = "No " + lowerCase + " in your favourites";
                }
                u2 u2Var2 = u3.a;
                p3.b(str, null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) r5.j(u2Var2)).g, r5, 384, 0, 131066);
                androidx.compose.foundation.layout.b.d(r5, androidx.compose.foundation.layout.w0.f(oVar, f3));
                if (e1Var.g() == 0) {
                    str2 = "Add movies and TV shows to your favourites\nfrom their detail pages";
                } else {
                    String lowerCase2 = ((String) list3.get(e1Var.g())).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = "Add " + lowerCase2 + " to your favourites\nfrom their detail pages";
                }
                p3.b(str2, null, j2, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) r5.j(u2Var2)).k, r5, 384, 0, 130042);
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(r5, true, true, false);
                z3 = true;
                r11 = r5;
                z1Var5 = z1Var4;
            } else {
                ?? r3 = r15;
                r3.b0(798233212);
                androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) r3.j(com.app.mlounge.ui.theme.f.a)).y);
                androidx.compose.foundation.layout.f fVarG = h.g(f3);
                androidx.compose.foundation.layout.f fVarG2 = h.g(f3);
                androidx.compose.foundation.layout.m0 m0Var = new androidx.compose.foundation.layout.m0(f5, f5, f5, f5);
                androidx.compose.foundation.layout.a0 a0Var3 = androidx.compose.foundation.layout.w0.c;
                boolean zH4 = ((i5 & 14) == 4) | r3.h(list2) | r3.h(map) | r3.f(y0VarG2) | r3.f(y0VarG3) | r3.f(y0VarG4) | r3.f(y0VarG5) | ((i5 & Token.ASSIGN_MOD) == 32) | ((i5 & 458752) == 131072) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((3670016 & i5) == 1048576) | r3.h(z1Var4) | r3.h(context);
                Object objQ9 = r3.Q();
                if (zH4 || objQ9 == obj10) {
                    final z1 z1Var9 = z1Var4;
                    kotlin.jvm.functions.l lVar7 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.watchlist.b
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj11) {
                            androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj11;
                            hVar.getClass();
                            c cVar = new c(0);
                            List list4 = list2;
                            hVar.q(list4.size(), new com.app.mlounge.ui.screens.tvshows.r(cVar, list4, 1), new com.app.mlounge.ui.screens.adult.g(25, list4), new androidx.compose.runtime.internal.f(-1942245546, true, new e(list4, map, lVar, lVar2, qVar, lVar3, lVar4, lVar5, lVar6, list4, aVar, z1Var9, context, y0VarG2, y0VarG3, y0VarG4, y0VarG5, y0Var)));
                            return kotlin.y.a;
                        }
                    };
                    z1Var5 = z1Var9;
                    r3.l0(lVar7);
                    objQ9 = lVar7;
                } else {
                    z1Var5 = z1Var4;
                }
                com.google.android.gms.dynamite.g.a(aVar2, a0Var3, null, m0Var, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) objQ9, r3, 1772592, 916);
                ?? r16 = r3;
                r16.p(false);
                z3 = true;
                r11 = r16;
            }
            r11.p(z3);
            z1Var2 = z1Var5;
            r9 = r11;
        } else {
            ?? r17 = rVar;
            r17.W();
            z1Var2 = z1Var;
            r9 = r17;
        }
        q1 q1VarT = r9.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.o(lVar, lVar2, lVar3, lVar4, lVar5, qVar, lVar6, z, aVar, z1Var2, i2);
        }
    }

    public static final void e(y1 y1Var, kotlin.jvm.functions.l lVar, r rVar, int i2) {
        r rVar2 = rVar;
        rVar2.c0(-1330068317);
        int i3 = i2 | (rVar2.d(y1Var.ordinal()) ? 4 : 2) | (rVar2.h(lVar) ? 32 : 16);
        if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = s.r(Boolean.FALSE);
                rVar2.l0(objQ);
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, oVar);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            s.t(rVar2, androidx.compose.ui.node.f.g);
            s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            float f2 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f2));
            Object objQ3 = rVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = new com.app.mlounge.ui.screens.settings.q(y0Var, 17);
                rVar2.l0(objQ3);
            }
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(128661252, new g0(y1Var, 25), rVar2), rVar2, 12583296, 120);
            boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
            Object objQ4 = rVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = new com.app.mlounge.ui.screens.settings.q(y0Var, 18);
                rVar2.l0(objQ4);
            }
            androidx.compose.ui.r rVarH = androidx.compose.foundation.layout.w0.h(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1);
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-494387570, new d0(8, lVar, y1Var, y0Var), rVar2);
            rVar2 = rVar;
            androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, rVarH, 0L, null, null, null, 0L, 0.0f, 0.0f, fVarC, rVar2, 432, 2040);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.watchlist.a(y1Var, lVar, i2);
        }
    }

    public static final StackTraceElement f(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(File file, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) throws IOException {
        androidx.datastore.core.h0 h0Var;
        if (cVar instanceof androidx.datastore.core.h0) {
            h0Var = (androidx.datastore.core.h0) cVar;
            int i2 = h0Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.z = i2 - Integer.MIN_VALUE;
            } else {
                h0Var = new androidx.datastore.core.h0(cVar);
            }
        } else {
            h0Var = new androidx.datastore.core.h0(cVar);
        }
        Object obj = h0Var.y;
        int i3 = h0Var.z;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = h0Var.e;
                kotlin.a.e(obj);
                return obj;
            }
            kotlin.a.e(obj);
            h0Var.e = file;
            h0Var.z = 1;
            Object objInvoke = lVar.invoke(h0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (IOException e2) {
            if (e2 instanceof androidx.datastore.core.b) {
                throw e2;
            }
            file.getClass();
            if (!file.exists()) {
                throw n.d(file, e2);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw n.d(file, e2);
                    }
                    throw n.d(file, e2);
                }
                if (file.canWrite()) {
                    throw n.d(file, e2);
                }
                throw n.d(file, e2);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw n.d(file, e2);
                }
                throw n.d(file, e2);
            }
            if (file.canWrite()) {
                throw n.d(file, e2);
            }
            throw n.d(file, e2);
        }
    }

    public static final boolean k(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = kotlin.collections.u.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    p pVar = (p) obj2;
                    p pVar2 = (p) obj;
                    arrayList2.add(new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (pVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (pVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((androidx.compose.ui.geometry.b) kotlin.collections.o.K(list)).a;
            } else {
                if (list.isEmpty()) {
                    androidx.compose.ui.util.a.c("Empty collection can't be reduced.");
                }
                Object objK = kotlin.collections.o.K(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objK = new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(((androidx.compose.ui.geometry.b) objK).a, ((androidx.compose.ui.geometry.b) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((androidx.compose.ui.geometry.b) objK).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean q(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                int i5 = i4 + 1;
                if (i4 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i3++;
                    } else if (cCharAt == ')' && (i3 = i3 - 1) == 0 && i4 != str.length() - 1) {
                    }
                    i2++;
                    i4 = i5;
                }
            }
            if (i3 == 0) {
                return kotlin.jvm.internal.l.a(kotlin.text.k.A0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static androidx.core.provider.i r(androidx.core.provider.i[] iVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        androidx.core.provider.i iVar = null;
        int i4 = Integer.MAX_VALUE;
        for (androidx.core.provider.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.c - i3) * 2) + (iVar2.d == z ? 0 : 1);
            if (iVar == null || i4 > iAbs) {
                iVar = iVar2;
                i4 = iAbs;
            }
        }
        return iVar;
    }

    public static androidx.compose.foundation.gestures.l s(r rVar) {
        float f2 = g1.a;
        androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) rVar.j(l1.h);
        boolean zC = rVar.c(cVar.a());
        Object objQ = rVar.Q();
        Object obj = androidx.compose.runtime.m.a;
        if (zC || objQ == obj) {
            objQ = new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(cVar));
            rVar.l0(objQ);
        }
        androidx.compose.animation.core.x xVar = (androidx.compose.animation.core.x) objQ;
        boolean zF = rVar.f(xVar);
        Object objQ2 = rVar.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new androidx.compose.foundation.gestures.l(xVar);
            rVar.l0(objQ2);
        }
        return (androidx.compose.foundation.gestures.l) objQ2;
    }

    public static final String t(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? l.C(kotlin.collections.o.R(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final f u() {
        f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new o(9.0f, 16.17f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(4.83f, 12.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.v(-1.42f, 1.41f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(9.0f, 19.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(21.0f, 7.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.v(-1.41f, -1.41f));
        arrayList.add(k.c);
        e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final String[] v(androidx.compose.ui.autofill.p pVar) {
        pVar.getClass();
        return (String[]) ((androidx.compose.ui.autofill.f) pVar).b.toArray(new String[0]);
    }

    public static final f w() {
        f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(5.0f, 20.0f);
        gVar.l(14.0f);
        gVar.s(-2.0f);
        gVar.k(5.0f);
        gVar.r(20.0f);
        gVar.f();
        gVar.o(19.0f, 9.0f);
        gVar.l(-4.0f);
        gVar.r(3.0f);
        gVar.k(9.0f);
        gVar.s(6.0f);
        gVar.k(5.0f);
        gVar.n(7.0f, 7.0f);
        gVar.m(19.0f, 9.0f);
        gVar.f();
        e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static final float x(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : androidx.compose.ui.text.android.style.d.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float y(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? androidx.compose.ui.text.android.style.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final f z() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(18.0f, 4.0f);
        gVar.n(2.0f, 4.0f);
        gVar.l(-3.0f);
        gVar.n(-2.0f, -4.0f);
        gVar.l(-2.0f);
        gVar.n(2.0f, 4.0f);
        gVar.l(-3.0f);
        gVar.n(-2.0f, -4.0f);
        gVar.k(8.0f);
        gVar.n(2.0f, 4.0f);
        gVar.k(7.0f);
        gVar.m(5.0f, 4.0f);
        gVar.k(4.0f);
        gVar.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        gVar.m(2.0f, 18.0f);
        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.l(16.0f);
        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.r(4.0f);
        gVar.l(-4.0f);
        gVar.f();
        e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public void B(androidx.sqlite.a aVar, Object obj) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U(p());
        try {
            h(cVarU, obj);
            cVarU.Q();
            i.c(cVarU, null);
            t1.s(aVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public abstract void h(androidx.sqlite.c cVar, Object obj);

    public com.google.android.gms.common.api.c i(Context context, Looper looper, com.caverock.androidsvg.y1 y1Var, Object obj, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.h hVar) {
        return j(context, looper, y1Var, obj, (com.google.android.gms.common.api.internal.k) gVar, (com.google.android.gms.common.api.internal.k) hVar);
    }

    public com.google.android.gms.common.api.c j(Context context, Looper looper, com.caverock.androidsvg.y1 y1Var, Object obj, com.google.android.gms.common.api.internal.k kVar, com.google.android.gms.common.api.internal.k kVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface l(Context context, androidx.core.content.res.e eVar, Resources resources, int i2);

    public abstract Typeface m(Context context, androidx.core.provider.i[] iVarArr, int i2);

    public Typeface n(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface o(Context context, Resources resources, int i2, String str, int i3) {
        File fileV = b.v(context);
        if (fileV == null) {
            return null;
        }
        try {
            if (b.i(fileV, resources, i2)) {
                return Typeface.createFromFile(fileV.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileV.delete();
        }
    }

    public abstract String p();
}
