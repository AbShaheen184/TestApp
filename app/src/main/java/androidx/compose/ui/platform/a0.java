package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.core.view.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final androidx.collection.y l0;
    public final u A;
    public int B = Integer.MIN_VALUE;
    public final z C;
    public final AccessibilityManager D;
    public long E;
    public List F;
    public final Handler G;
    public final v H;
    public int I;
    public int J;
    public androidx.core.view.accessibility.d K;
    public androidx.core.view.accessibility.d L;
    public boolean M;
    public final androidx.collection.z N;
    public final androidx.collection.z O;
    public final androidx.collection.z0 P;
    public final androidx.collection.z0 Q;
    public int R;
    public Integer S;
    public final androidx.collection.h T;
    public final Channel U;
    public boolean V;
    public w W;
    public androidx.collection.z X;
    public final androidx.collection.a0 Y;
    public final androidx.collection.x Z;
    public final androidx.collection.x a0;
    public final String b0;
    public final String c0;
    public final androidx.appcompat.widget.c2 d0;
    public final androidx.collection.z e0;
    public j2 f0;
    public boolean g0;
    public final androidx.collection.x h0;
    public final androidx.activity.l i0;
    public final ArrayList j0;
    public final z k0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        androidx.collection.y yVar = androidx.collection.m.a;
        androidx.collection.y yVar2 = new androidx.collection.y(32);
        int i = yVar2.b;
        if (i < 0) {
            com.google.gson.b.n("");
            return;
        }
        int i2 = i + 32;
        yVar2.b(i2);
        int[] iArr2 = yVar2.a;
        int i3 = yVar2.b;
        if (i != i3) {
            kotlin.collections.n.C(i2, i, i3, iArr2, iArr2);
        }
        kotlin.collections.n.G(i, 0, 12, iArr, iArr2);
        yVar2.b += 32;
        l0 = yVar2;
    }

    public a0(u uVar) {
        this.A = uVar;
        int i = 0;
        this.C = new z(this, i);
        Object systemService = uVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.D = (AccessibilityManager) systemService;
        this.E = 100L;
        this.G = new Handler(Looper.getMainLooper());
        this.H = new v(this, i);
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.N = new androidx.collection.z();
        this.O = new androidx.collection.z();
        this.P = new androidx.collection.z0(0);
        this.Q = new androidx.collection.z0(0);
        this.R = -1;
        this.T = new androidx.collection.h(0);
        this.U = ChannelKt.Channel$default(1, null, null, 6, null);
        this.V = true;
        androidx.collection.z zVar = androidx.collection.o.a;
        zVar.getClass();
        this.X = zVar;
        this.Y = new androidx.collection.a0();
        this.Z = new androidx.collection.x();
        this.a0 = new androidx.collection.x();
        this.b0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.c0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.d0 = new androidx.appcompat.widget.c2(10);
        this.e0 = new androidx.collection.z();
        this.f0 = new j2(uVar.getSemanticsOwner().a(), zVar);
        int i2 = androidx.collection.l.a;
        this.h0 = new androidx.collection.x();
        uVar.addOnAttachStateChangeListener(this);
        this.i0 = new androidx.activity.l(this, 5);
        this.j0 = new ArrayList();
        this.k0 = new z(this, 1);
    }

    public static /* synthetic */ void E(a0 a0Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        a0Var.D(i, i2, num, null);
    }

    public static Rect L(androidx.compose.ui.graphics.a0 a0Var, float f, float f2) {
        if (!(a0Var instanceof androidx.compose.ui.graphics.h0) && !(a0Var instanceof androidx.compose.ui.graphics.i0)) {
            return null;
        }
        androidx.compose.ui.geometry.c cVarM = a0Var.m();
        return new Rect((int) (cVarM.a + f), (int) (cVarM.b + f2), (int) (cVarM.c + f), (int) (cVarM.d + f2));
    }

    public static float[] N(androidx.compose.ui.graphics.a0 a0Var) {
        if (!(a0Var instanceof androidx.compose.ui.graphics.i0)) {
            return null;
        }
        androidx.compose.ui.geometry.d dVar = ((androidx.compose.ui.graphics.i0) a0Var).f;
        long j = dVar.h;
        long j2 = dVar.g;
        long j3 = dVar.f;
        long j4 = dVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(androidx.compose.ui.graphics.a0 a0Var, float f, float f2) {
        if (!(a0Var instanceof androidx.compose.ui.graphics.g0)) {
            return null;
        }
        androidx.compose.ui.graphics.g0 g0Var = (androidx.compose.ui.graphics.g0) a0Var;
        androidx.compose.ui.geometry.c cVarH = g0Var.m().h(f, f2);
        Region region = new Region(new Rect((int) (cVarH.a + 0.0f), (int) (cVarH.b + 0.0f), (int) (cVarH.c + 0.0f), (int) (cVarH.d + 0.0f)));
        Region region2 = new Region();
        androidx.compose.ui.graphics.j jVar = g0Var.f;
        if (!(jVar instanceof androidx.compose.ui.graphics.j)) {
            com.google.gson.b.r("Unable to obtain android.graphics.Path");
            return null;
        }
        Path path = jVar.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(androidx.compose.ui.semantics.p pVar) {
        androidx.compose.ui.text.g gVar;
        if (pVar != null) {
            androidx.compose.ui.semantics.l lVar = pVar.d;
            androidx.collection.o0 o0Var = lVar.e;
            androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.a;
            if (o0Var.c(wVar)) {
                return androidx.compose.ui.util.a.a((List) lVar.d(wVar), ",", null, 62);
            }
            androidx.compose.ui.semantics.w wVar2 = androidx.compose.ui.semantics.t.F;
            if (o0Var.c(wVar2)) {
                Object objG = o0Var.g(wVar2);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.text.g gVar2 = (androidx.compose.ui.text.g) objG;
                if (gVar2 != null) {
                    return gVar2.y;
                }
            } else {
                Object objG2 = o0Var.g(androidx.compose.ui.semantics.t.B);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (gVar = (androidx.compose.ui.text.g) kotlin.collections.o.M(list)) != null) {
                    return gVar.y;
                }
            }
        }
        return null;
    }

    public static final boolean x(androidx.compose.ui.semantics.i iVar, float f) {
        kotlin.jvm.functions.a aVar = iVar.a;
        if (f >= 0.0f || ((Number) aVar.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) aVar.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(androidx.compose.ui.semantics.i iVar) {
        kotlin.jvm.functions.a aVar = iVar.a;
        if (((Number) aVar.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        ((Number) iVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(androidx.compose.ui.semantics.i iVar) {
        kotlin.jvm.functions.a aVar = iVar.a;
        if (((Number) aVar.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.A.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(androidx.compose.ui.semantics.p pVar, j2 j2Var) {
        int[] iArr = androidx.collection.p.a;
        androidx.collection.a0 a0Var = new androidx.collection.a0();
        List listJ = androidx.compose.ui.semantics.p.j(4, pVar);
        androidx.compose.ui.node.f0 f0Var = pVar.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.p pVar2 = (androidx.compose.ui.semantics.p) listJ.get(i);
            androidx.collection.n nVarS = s();
            int i2 = pVar2.g;
            if (nVarS.a(i2)) {
                if (!j2Var.b.b(i2)) {
                    w(f0Var);
                    return;
                }
                a0Var.a(i2);
            }
        }
        androidx.collection.a0 a0Var2 = j2Var.b;
        int[] iArr2 = a0Var2.b;
        long[] jArr = a0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !a0Var.b(iArr2[(i3 << 3) + i5])) {
                            w(f0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = androidx.compose.ui.semantics.p.j(4, pVar);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.semantics.p pVar3 = (androidx.compose.ui.semantics.p) listJ2.get(i6);
            j2 j2Var2 = (j2) this.e0.b(pVar3.g);
            if (j2Var2 != null && s().a(pVar3.g)) {
                B(pVar3, j2Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.M = true;
        }
        try {
            return ((Boolean) this.C.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.M = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(androidx.compose.ui.util.a.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        w wVar = this.W;
        if (wVar != null) {
            androidx.compose.ui.semantics.p pVar = wVar.a;
            if (i != pVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - wVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(pVar.g), 131072);
                accessibilityEventO.setFromIndex(wVar.d);
                accessibilityEventO.setToIndex(wVar.e);
                accessibilityEventO.setAction(wVar.b);
                accessibilityEventO.setMovementGranularity(wVar.c);
                accessibilityEventO.getText().add(t(pVar));
                C(accessibilityEventO);
            }
        }
        this.W = null;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:244:0x0506  */
    /* JADX WARN: Code duplicated, block: B:289:0x0632  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    public final void H(androidx.collection.n nVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num;
        int i2;
        int i3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num2;
        androidx.compose.ui.semantics.l lVar;
        androidx.compose.ui.semantics.p pVar;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.collection.o0 o0Var;
        androidx.compose.ui.node.f0 f0Var;
        int i11;
        androidx.compose.ui.semantics.l lVar2;
        long j;
        int i12;
        Integer num3;
        androidx.collection.o0 o0Var2;
        int i13;
        i2 i2Var;
        boolean z;
        androidx.compose.ui.semantics.w wVar;
        i2 i2Var2;
        boolean z2;
        kotlin.d dVar;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        Integer num4;
        AccessibilityEvent accessibilityEventP;
        String str2;
        androidx.collection.n nVar2 = nVar;
        ArrayList arrayList3 = this.j0;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = nVar2.b;
        long[] jArr3 = nVar2.a;
        int i18 = 2;
        int length = jArr3.length - 2;
        int i19 = 0;
        Integer num5 = 0;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j2 = jArr3[i20];
            int i21 = i18;
            int i22 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8;
                int i24 = 8 - ((~(i20 - i22)) >>> 31);
                long j3 = j2;
                int i25 = i19;
                while (i25 < i24) {
                    if ((j3 & 255) < 128) {
                        int i26 = iArr3[(i20 << 3) + i25];
                        j2 j2Var = (j2) this.e0.b(i26);
                        if (j2Var == null) {
                            i3 = i25;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i24;
                            i5 = i19;
                            i6 = i20;
                            num2 = num5;
                        } else {
                            androidx.compose.ui.semantics.l lVar3 = j2Var.a;
                            androidx.collection.o0 o0Var3 = lVar3.e;
                            androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) nVar2.b(i26);
                            int i27 = i23;
                            androidx.compose.ui.semantics.p pVar2 = qVar != null ? qVar.a : null;
                            if (pVar2 == null) {
                                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("no value for specified key");
                            }
                            androidx.compose.ui.node.f0 f0Var2 = pVar2.c;
                            androidx.compose.ui.semantics.l lVar4 = pVar2.d;
                            iArr2 = iArr3;
                            int i28 = pVar2.g;
                            jArr2 = jArr3;
                            androidx.collection.o0 o0Var4 = lVar4.e;
                            i6 = i20;
                            Object[] objArr = o0Var4.b;
                            Object[] objArr2 = o0Var4.c;
                            long[] jArr4 = o0Var4.a;
                            i3 = i25;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                androidx.compose.ui.node.f0 f0Var3 = f0Var2;
                                i4 = i24;
                                int i29 = 0;
                                i9 = 0;
                                while (true) {
                                    long j4 = jArr4[i29];
                                    pVar = pVar2;
                                    int i30 = i29;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                        int i32 = 0;
                                        while (i32 < i31) {
                                            if ((j4 & 255) < 128) {
                                                int i33 = (i30 << 3) + i32;
                                                Object obj = objArr[i33];
                                                int i34 = length2;
                                                Object obj2 = objArr2[i33];
                                                lVar2 = lVar3;
                                                androidx.compose.ui.semantics.w wVar2 = (androidx.compose.ui.semantics.w) obj;
                                                j = j4;
                                                androidx.compose.ui.semantics.w wVar3 = androidx.compose.ui.semantics.t.u;
                                                if (kotlin.jvm.internal.l.a(wVar2, wVar3) || kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.v)) {
                                                    int size = arrayList4.size();
                                                    int i35 = 0;
                                                    while (true) {
                                                        if (i35 >= size) {
                                                            i2Var = null;
                                                            break;
                                                        }
                                                        int i36 = size;
                                                        if (((i2) arrayList4.get(i35)).e == i26) {
                                                            i2Var = (i2) arrayList4.get(i35);
                                                            break;
                                                        } else {
                                                            i35++;
                                                            size = i36;
                                                        }
                                                    }
                                                    if (i2Var != null) {
                                                        z = false;
                                                    } else {
                                                        i2Var = new i2(i26, arrayList3);
                                                        z = true;
                                                    }
                                                    arrayList3.add(i2Var);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    wVar = androidx.compose.ui.semantics.t.d;
                                                    if (kotlin.jvm.internal.l.a(wVar2, wVar)) {
                                                        obj2.getClass();
                                                        str2 = (String) obj2;
                                                        if (o0Var3.c(wVar)) {
                                                            F(i26, i27, str2);
                                                        }
                                                        i26 = i26;
                                                        arrayList4 = arrayList4;
                                                        i31 = i31;
                                                        i12 = 8;
                                                        num3 = num5;
                                                        o0Var2 = o0Var3;
                                                        i13 = i34;
                                                    } else if (!kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.b) || kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.J)) {
                                                        i26 = i26;
                                                        arrayList4 = arrayList4;
                                                        i31 = i31;
                                                        f0Var3 = f0Var3;
                                                        num3 = num5;
                                                        o0Var2 = o0Var3;
                                                        i13 = i34;
                                                        i12 = 8;
                                                        E(this, A(i26), 2048, 64, 8);
                                                        E(this, A(i26), 2048, num3, 8);
                                                    } else if (kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.c)) {
                                                        i12 = 8;
                                                        E(this, A(i26), 2048, 64, 8);
                                                        E(this, A(i26), 2048, num5, 8);
                                                        num3 = num5;
                                                        o0Var2 = o0Var3;
                                                        i13 = i34;
                                                    } else {
                                                        androidx.compose.ui.semantics.w wVar4 = androidx.compose.ui.semantics.t.I;
                                                        arrayList4 = arrayList4;
                                                        if (kotlin.jvm.internal.l.a(wVar2, wVar4)) {
                                                            Object objG = o0Var4.g(androidx.compose.ui.semantics.t.y);
                                                            if (objG == null) {
                                                                objG = null;
                                                            }
                                                            androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) objG;
                                                            if (hVar != null && hVar.a == 4) {
                                                                Object objG2 = o0Var4.g(wVar4);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                if (kotlin.jvm.internal.l.a(objG2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventO = o(A(i26), 4);
                                                                    androidx.compose.ui.semantics.p pVar3 = pVar;
                                                                    f0Var3 = f0Var3;
                                                                    androidx.compose.ui.semantics.p pVar4 = new androidx.compose.ui.semantics.p(pVar3.a, true, f0Var3, lVar4);
                                                                    Object objG3 = pVar4.k().e.g(androidx.compose.ui.semantics.t.a);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    List list = (List) objG3;
                                                                    pVar = pVar3;
                                                                    String strA = list != null ? androidx.compose.ui.util.a.a(list, ",", null, 62) : null;
                                                                    Object objG4 = pVar4.k().e.g(androidx.compose.ui.semantics.t.B);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    List list2 = (List) objG4;
                                                                    String strA2 = list2 != null ? androidx.compose.ui.util.a.a(list2, ",", null, 62) : null;
                                                                    if (strA != null) {
                                                                        accessibilityEventO.setContentDescription(strA);
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventO.getText().add(strA2);
                                                                    }
                                                                    C(accessibilityEventO);
                                                                } else {
                                                                    f0Var3 = f0Var3;
                                                                    E(this, A(i26), 2048, num5, 8);
                                                                }
                                                            } else {
                                                                f0Var3 = f0Var3;
                                                                E(this, A(i26), 2048, 64, 8);
                                                                E(this, A(i26), 2048, num5, 8);
                                                            }
                                                            num3 = num5;
                                                            i26 = i26;
                                                            o0Var2 = o0Var3;
                                                            i13 = i34;
                                                            i12 = 8;
                                                        } else {
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            if (kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.a)) {
                                                                int iA = A(i26);
                                                                obj2.getClass();
                                                                D(iA, 2048, 4, (List) obj2);
                                                                num3 = num5;
                                                                i26 = i26;
                                                                o0Var2 = o0Var3;
                                                            } else {
                                                                androidx.compose.ui.semantics.w wVar5 = androidx.compose.ui.semantics.t.F;
                                                                String str3 = "";
                                                                if (!kotlin.jvm.internal.l.a(wVar2, wVar5)) {
                                                                    Integer num6 = num5;
                                                                    i26 = i26;
                                                                    o0Var2 = o0Var3;
                                                                    androidx.compose.ui.semantics.w wVar6 = androidx.compose.ui.semantics.t.G;
                                                                    if (kotlin.jvm.internal.l.a(wVar2, wVar6)) {
                                                                        Object objG5 = o0Var4.g(wVar5);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) objG5;
                                                                        if (gVar != null && (str = gVar.y) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j5 = ((androidx.compose.ui.text.l0) lVar4.d(wVar6)).a;
                                                                        num3 = num6;
                                                                        C(p(A(i26), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), P(str3)));
                                                                        G(i28);
                                                                    } else {
                                                                        i13 = i34;
                                                                        num3 = num6;
                                                                        if (kotlin.jvm.internal.l.a(wVar2, wVar3) || kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.v)) {
                                                                            w(f0Var3);
                                                                            int size2 = arrayList3.size();
                                                                            int i37 = 0;
                                                                            while (true) {
                                                                                if (i37 >= size2) {
                                                                                    i2Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((i2) arrayList3.get(i37)).e == i26) {
                                                                                        i2Var2 = (i2) arrayList3.get(i37);
                                                                                        break;
                                                                                    }
                                                                                    i37++;
                                                                                }
                                                                            }
                                                                            i2Var2.getClass();
                                                                            Object objG6 = o0Var4.g(wVar3);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            i2Var2.B = (androidx.compose.ui.semantics.i) objG6;
                                                                            Object objG7 = o0Var4.g(androidx.compose.ui.semantics.t.v);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            i2Var2.C = (androidx.compose.ui.semantics.i) objG7;
                                                                            if (i2Var2.y.contains(i2Var2)) {
                                                                                this.A.getSnapshotObserver().a.d(i2Var2, this.k0, new androidx.compose.ui.draw.b(6, i2Var2, this));
                                                                            }
                                                                        } else if (kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.k)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i14 = 8;
                                                                                C(o(A(i28), 8));
                                                                            } else {
                                                                                i14 = 8;
                                                                            }
                                                                            E(this, A(i28), 2048, num3, i14);
                                                                            i12 = i14;
                                                                        } else {
                                                                            androidx.compose.ui.semantics.w wVar7 = androidx.compose.ui.semantics.k.x;
                                                                            if (kotlin.jvm.internal.l.a(wVar2, wVar7)) {
                                                                                List list3 = (List) lVar4.d(wVar7);
                                                                                Object objG8 = o0Var2.g(wVar7);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                List list4 = (List) objG8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        androidx.transition.k.i();
                                                                                        return;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        androidx.transition.k.i();
                                                                                        return;
                                                                                    }
                                                                                    i9 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? 0 : 1;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i9 = 1;
                                                                                }
                                                                            } else if (obj2 instanceof androidx.compose.ui.semantics.a) {
                                                                                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) obj2;
                                                                                Object objG9 = o0Var2.g(wVar2);
                                                                                if (objG9 == null) {
                                                                                    objG9 = null;
                                                                                }
                                                                                if (aVar != objG9) {
                                                                                    if (objG9 instanceof androidx.compose.ui.semantics.a) {
                                                                                        String str4 = aVar.a;
                                                                                        androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) objG9;
                                                                                        kotlin.d dVar2 = aVar2.b;
                                                                                        if (kotlin.jvm.internal.l.a(str4, aVar2.a) && (((dVar = aVar.b) != null || dVar2 == null) && (dVar == null || dVar2 != null))) {
                                                                                            z2 = true;
                                                                                        }
                                                                                    }
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = true;
                                                                                }
                                                                                if (z2) {
                                                                                    i9 = 0;
                                                                                } else {
                                                                                    i9 = 1;
                                                                                }
                                                                            } else {
                                                                                i9 = 1;
                                                                            }
                                                                        }
                                                                    }
                                                                    i12 = 8;
                                                                } else if (o0Var4.c(androidx.compose.ui.semantics.k.k)) {
                                                                    Object objG10 = o0Var3.g(wVar5);
                                                                    if (objG10 == null) {
                                                                        objG10 = null;
                                                                    }
                                                                    androidx.compose.ui.text.g gVar2 = (androidx.compose.ui.text.g) objG10;
                                                                    if (gVar2 == null) {
                                                                        gVar2 = "";
                                                                    }
                                                                    Object objG11 = o0Var4.g(wVar5);
                                                                    if (objG11 == null) {
                                                                        objG11 = null;
                                                                    }
                                                                    CharSequence charSequence = (androidx.compose.ui.text.g) objG11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceP = P(charSequence);
                                                                    int length3 = gVar2.length();
                                                                    int length4 = charSequence.length();
                                                                    int i38 = length3 > length4 ? length4 : length3;
                                                                    Integer num7 = num5;
                                                                    int i39 = 0;
                                                                    while (true) {
                                                                        i15 = length3;
                                                                        if (i39 >= i38) {
                                                                            i16 = length4;
                                                                            break;
                                                                        }
                                                                        i16 = length4;
                                                                        if (gVar2.charAt(i39) != charSequence.charAt(i39)) {
                                                                            break;
                                                                        }
                                                                        i39++;
                                                                        length3 = i15;
                                                                        length4 = i16;
                                                                    }
                                                                    int i40 = 0;
                                                                    while (true) {
                                                                        if (i40 >= i38 - i39) {
                                                                            i17 = i40;
                                                                            break;
                                                                        }
                                                                        i17 = i40;
                                                                        if (gVar2.charAt((i15 - 1) - i40) != charSequence.charAt((i16 - 1) - i17)) {
                                                                            break;
                                                                        } else {
                                                                            i40 = i17 + 1;
                                                                        }
                                                                    }
                                                                    int i41 = (i15 - i17) - i39;
                                                                    int i42 = (i16 - i17) - i39;
                                                                    androidx.compose.ui.semantics.w wVar8 = androidx.compose.ui.semantics.t.K;
                                                                    boolean zC = o0Var3.c(wVar8);
                                                                    boolean zC2 = o0Var4.c(wVar8);
                                                                    boolean zC3 = o0Var3.c(androidx.compose.ui.semantics.t.F);
                                                                    boolean z3 = zC3 && !zC && zC2;
                                                                    boolean z4 = zC3 && zC && !zC2;
                                                                    if (z3 || z4) {
                                                                        i26 = i26;
                                                                        num4 = num7;
                                                                        accessibilityEventP = p(A(i26), num4, num7, Integer.valueOf(i16), charSequenceP);
                                                                    } else {
                                                                        accessibilityEventP = o(A(i26), 16);
                                                                        accessibilityEventP.setFromIndex(i39);
                                                                        accessibilityEventP.setRemovedCount(i41);
                                                                        accessibilityEventP.setAddedCount(i42);
                                                                        accessibilityEventP.setBeforeText(gVar2);
                                                                        accessibilityEventP.getText().add(charSequenceP);
                                                                        i26 = i26;
                                                                        num4 = num7;
                                                                    }
                                                                    accessibilityEventP.setClassName("android.widget.EditText");
                                                                    C(accessibilityEventP);
                                                                    if (z3 || z4) {
                                                                        long j6 = ((androidx.compose.ui.text.l0) lVar4.d(androidx.compose.ui.semantics.t.G)).a;
                                                                        accessibilityEventP.setFromIndex((int) (j6 >> 32));
                                                                        accessibilityEventP.setToIndex((int) (j6 & 4294967295L));
                                                                        C(accessibilityEventP);
                                                                    }
                                                                    i13 = i34;
                                                                    num3 = num4;
                                                                    o0Var2 = o0Var3;
                                                                    i12 = 8;
                                                                } else {
                                                                    Integer num8 = num5;
                                                                    i26 = i26;
                                                                    i12 = 8;
                                                                    E(this, A(i26), 2048, Integer.valueOf(i21), 8);
                                                                    i13 = i34;
                                                                    num3 = num8;
                                                                    o0Var2 = o0Var3;
                                                                }
                                                            }
                                                            i13 = i34;
                                                            i12 = 8;
                                                        }
                                                    }
                                                } else {
                                                    Object objG12 = o0Var3.g(wVar2);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (kotlin.jvm.internal.l.a(obj2, objG12)) {
                                                        i12 = i27;
                                                    } else {
                                                        wVar = androidx.compose.ui.semantics.t.d;
                                                        if (kotlin.jvm.internal.l.a(wVar2, wVar)) {
                                                            obj2.getClass();
                                                            str2 = (String) obj2;
                                                            if (o0Var3.c(wVar)) {
                                                                F(i26, i27, str2);
                                                            }
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            i12 = 8;
                                                            num3 = num5;
                                                            o0Var2 = o0Var3;
                                                            i13 = i34;
                                                        } else if (kotlin.jvm.internal.l.a(wVar2, androidx.compose.ui.semantics.t.b)) {
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            num3 = num5;
                                                            o0Var2 = o0Var3;
                                                            i13 = i34;
                                                            i12 = 8;
                                                            E(this, A(i26), 2048, 64, 8);
                                                            E(this, A(i26), 2048, num3, 8);
                                                        } else {
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            num3 = num5;
                                                            o0Var2 = o0Var3;
                                                            i13 = i34;
                                                            i12 = 8;
                                                            E(this, A(i26), 2048, 64, 8);
                                                            E(this, A(i26), 2048, num3, 8);
                                                        }
                                                    }
                                                    num3 = num5;
                                                    o0Var2 = o0Var3;
                                                    i13 = i34;
                                                }
                                            } else {
                                                lVar2 = lVar3;
                                                arrayList4 = arrayList4;
                                                j = j4;
                                                i31 = i31;
                                                i32 = i32;
                                                i12 = i27;
                                                f0Var3 = f0Var3;
                                                num3 = num5;
                                                i26 = i26;
                                                o0Var2 = o0Var3;
                                                i13 = length2;
                                            }
                                            i27 = i12;
                                            o0Var3 = o0Var2;
                                            f0Var3 = f0Var3;
                                            i31 = i31;
                                            i32++;
                                            length2 = i13;
                                            num5 = num3;
                                            arrayList4 = arrayList4;
                                            i26 = i26;
                                            j4 = j >> i12;
                                            lVar3 = lVar2;
                                        }
                                        i8 = i26;
                                        lVar = lVar3;
                                        arrayList2 = arrayList4;
                                        f0Var = f0Var3;
                                        i7 = 1;
                                        num2 = num5;
                                        i11 = length2;
                                        int i43 = i31;
                                        o0Var = o0Var3;
                                        i5 = 0;
                                        if (i43 != i27) {
                                            break;
                                        }
                                    } else {
                                        i8 = i26;
                                        lVar = lVar3;
                                        o0Var = o0Var3;
                                        arrayList2 = arrayList4;
                                        f0Var = f0Var3;
                                        i5 = 0;
                                        i7 = 1;
                                        num2 = num5;
                                        i11 = length2;
                                    }
                                    if (i30 == i11) {
                                        break;
                                    }
                                    i26 = i8;
                                    o0Var3 = o0Var;
                                    f0Var3 = f0Var;
                                    pVar2 = pVar;
                                    lVar3 = lVar;
                                    i27 = 8;
                                    i29 = i30 + 1;
                                    length2 = i11;
                                    num5 = num2;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                lVar = lVar3;
                                arrayList2 = arrayList4;
                                i4 = i24;
                                pVar = pVar2;
                                i5 = 0;
                                i7 = 1;
                                num2 = num5;
                                i8 = i26;
                                i9 = 0;
                            }
                            if (i9 == 0) {
                                Iterator it = lVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i10 = i5;
                                        break;
                                    } else {
                                        if (!pVar.k().e.c((androidx.compose.ui.semantics.w) ((Map.Entry) it.next()).getKey())) {
                                            i10 = i7;
                                            break;
                                        }
                                    }
                                }
                                i9 = i10;
                            }
                            if (i9 != 0) {
                                i23 = 8;
                                E(this, A(i8), 2048, num2, 8);
                            } else {
                                i23 = 8;
                            }
                        }
                    } else {
                        i3 = i25;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i24;
                        i5 = i19;
                        i6 = i20;
                        num2 = num5;
                    }
                    j3 >>= i23;
                    i25 = i3 + 1;
                    nVar2 = nVar;
                    i19 = i5;
                    num5 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i20 = i6;
                    i24 = i4;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i19;
                int i44 = i20;
                num = num5;
                if (i24 != i23) {
                    return;
                } else {
                    i2 = i44;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i19;
                num = num5;
                i2 = i20;
            }
            if (i2 == i22) {
                return;
            }
            i20 = i2 + 1;
            nVar2 = nVar;
            length = i22;
            i19 = i;
            num5 = num;
            i18 = i21;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
        }
    }

    public final void I(androidx.compose.ui.node.f0 f0Var, androidx.collection.a0 a0Var) {
        androidx.compose.ui.semantics.l lVarX;
        if (f0Var.H() && !this.A.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            androidx.compose.ui.node.f0 f0Var2 = null;
            if (!f0Var.d0.f(8)) {
                f0Var = f0Var.v();
                while (true) {
                    if (f0Var == null) {
                        f0Var = null;
                        break;
                    } else if (f0Var.d0.f(8)) {
                        break;
                    } else {
                        f0Var = f0Var.v();
                    }
                }
            }
            if (f0Var == null || (lVarX = f0Var.x()) == null) {
                return;
            }
            if (!lVarX.z) {
                for (androidx.compose.ui.node.f0 f0VarV = f0Var.v(); f0VarV != null; f0VarV = f0VarV.v()) {
                    androidx.compose.ui.semantics.l lVarX2 = f0VarV.x();
                    if (lVarX2 != null && lVarX2.z) {
                        f0Var2 = f0VarV;
                        break;
                    }
                }
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                }
            }
            int i = f0Var.y;
            if (a0Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(androidx.compose.ui.node.f0 f0Var) {
        if (f0Var.H() && !this.A.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            int i = f0Var.y;
            androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) this.N.b(i);
            androidx.compose.ui.semantics.i iVar2 = (androidx.compose.ui.semantics.i) this.O.b(i);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (iVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) iVar.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) iVar.b.invoke()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) iVar2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) iVar2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(androidx.compose.ui.semantics.p pVar, int i, int i2, boolean z) {
        String strT;
        androidx.compose.ui.semantics.l lVar = pVar.d;
        int i3 = pVar.g;
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.k.j;
        if (lVar.e.c(wVar) && i0.b(pVar)) {
            kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) ((androidx.compose.ui.semantics.a) pVar.d.d(wVar)).b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.R) && (strT = t(pVar)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.R = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.R) : null, z2 ? Integer.valueOf(this.R) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        u uVar = this.A;
        long jT = uVar.t(jFloatToRawIntBits);
        long jT2 = uVar.t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jT >> 32);
        int i2 = (int) (jT2 >> 32);
        int i3 = (int) (jT & 4294967295L);
        int i4 = (int) (jT2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        j2 j2Var;
        androidx.collection.a0 a0Var = new androidx.collection.a0();
        androidx.collection.a0 a0Var2 = this.Y;
        int[] iArr = a0Var2.b;
        long[] jArr3 = a0Var2.a;
        int length = jArr3.length - 2;
        androidx.collection.z zVar = this.e0;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) s().b(i6);
                            Object obj = null;
                            androidx.compose.ui.semantics.p pVar = qVar != null ? qVar.a : null;
                            if (pVar != null) {
                                if (!pVar.d.e.c(androidx.compose.ui.semantics.t.d)) {
                                    a0Var.a(i6);
                                    j2Var = (j2) zVar.b(i6);
                                    if (j2Var != null) {
                                        Object objG = j2Var.a.e.g(androidx.compose.ui.semantics.t.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                a0Var.a(i6);
                                j2Var = (j2) zVar.b(i6);
                                if (j2Var != null) {
                                    Object objG2 = j2Var.a.e.g(androidx.compose.ui.semantics.t.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = a0Var.b;
        long[] jArr4 = a0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = a0Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = a0Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (a0Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                a0Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        zVar.c();
        androidx.collection.n nVarS = s();
        int[] iArr3 = nVarS.b;
        Object[] objArr = nVarS.c;
        long[] jArr6 = nVarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            androidx.compose.ui.semantics.p pVar2 = ((androidx.compose.ui.semantics.q) objArr[i25]).a;
                            androidx.compose.ui.semantics.l lVar = pVar2.d;
                            androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.d;
                            if (lVar.e.c(wVar) && a0Var2.a(i26)) {
                                F(i26, 16, (String) pVar2.d.d(wVar));
                            }
                            zVar.h(i26, new j2(pVar2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f0 = new j2(this.A.getSemanticsOwner().a(), s());
    }

    @Override // androidx.core.view.b
    public final com.app.mlounge.data.music.e b(View view) {
        return this.H;
    }

    public final void j(int i, androidx.core.view.accessibility.d dVar, String str, Bundle bundle) {
        androidx.compose.ui.semantics.p pVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) s().b(i);
        if (qVar == null || (pVar = qVar.a) == null) {
            return;
        }
        androidx.compose.ui.node.f0 f0Var = pVar.c;
        androidx.compose.ui.semantics.l lVar = pVar.d;
        androidx.collection.o0 o0Var = lVar.e;
        String strT = t(pVar);
        if (kotlin.jvm.internal.l.a(str, this.b0)) {
            int iD = this.Z.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, this.c0)) {
            int iD2 = this.a0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = o0Var.c(androidx.compose.ui.semantics.k.a);
        u uVar = this.A;
        boolean z = false;
        if (zC && bundle != null && kotlin.jvm.internal.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    androidx.compose.ui.text.j0 j0VarK = i0.k(lVar);
                    if (j0VarK == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= j0VarK.a.a.y.length()) {
                            arrayList.add(z);
                            uVar = uVar;
                        } else {
                            androidx.compose.ui.geometry.c cVarB = j0VarK.b(i5);
                            androidx.compose.ui.node.d1 d1VarD = pVar.d();
                            long jW = 0;
                            if (d1VarD != null) {
                                if (!d1VarD.T0().K) {
                                    d1VarD = null;
                                }
                                if (d1VarD != null) {
                                    jW = d1VarD.W(0L);
                                }
                            }
                            androidx.compose.ui.geometry.c cVarI = cVarB.i(jW);
                            androidx.compose.ui.geometry.c cVarG = pVar.g();
                            androidx.compose.ui.geometry.c cVarE = cVarI.g(cVarG) ? cVarI.e(cVarG) : null;
                            if (cVarE != null) {
                                long jT = uVar.t((((long) Float.floatToRawIntBits(cVarE.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarE.a)) << 32));
                                long jT2 = uVar.t((((long) Float.floatToRawIntBits(cVarE.c)) << 32) | (((long) Float.floatToRawIntBits(cVarE.d)) & 4294967295L));
                                int i6 = (int) (jT >> 32);
                                int i7 = (int) (jT2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                                int i8 = (int) (jT & 4294967295L);
                                int i9 = (int) (jT2 & 4294967295L);
                                rectF = new RectF(fMin, Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        uVar = uVar;
                        z = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.z;
        if (o0Var.c(wVar) && bundle != null && kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = o0Var.g(wVar);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, pVar.g);
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = o0Var.g(androidx.compose.ui.semantics.t.P);
            androidx.compose.ui.graphics.n0 n0Var = (androidx.compose.ui.graphics.n0) (objG2 == null ? null : objG2);
            if (n0Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                androidx.compose.ui.geometry.c cVarU = u(pVar, rect, n0Var);
                float f = cVarU.b;
                float f2 = cVarU.a;
                androidx.compose.ui.graphics.a0 a0VarA = n0Var.a(cVarU.c(), f0Var.X, uVar.getDensity());
                if (a0VarA instanceof androidx.compose.ui.graphics.h0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a0VarA, f2, f));
                    return;
                } else if (a0VarA instanceof androidx.compose.ui.graphics.i0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a0VarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a0VarA));
                    return;
                } else if (!(a0VarA instanceof androidx.compose.ui.graphics.g0)) {
                    coil3.g.a();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(a0VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = o0Var.g(androidx.compose.ui.semantics.t.P);
            androidx.compose.ui.graphics.n0 n0Var2 = (androidx.compose.ui.graphics.n0) (objG3 == null ? null : objG3);
            if (n0Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                androidx.compose.ui.geometry.c cVarU2 = u(pVar, rect2, n0Var2);
                Rect rectL = L(n0Var2.a(cVarU2.c(), f0Var.X, uVar.getDensity()), cVarU2.a, cVarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = o0Var.g(androidx.compose.ui.semantics.t.P);
            androidx.compose.ui.graphics.n0 n0Var3 = (androidx.compose.ui.graphics.n0) (objG4 == null ? null : objG4);
            if (n0Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(n0Var3.a(u(pVar, rect3, n0Var3).c(), f0Var.X, uVar.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = o0Var.g(androidx.compose.ui.semantics.t.P);
            androidx.compose.ui.graphics.n0 n0Var4 = (androidx.compose.ui.graphics.n0) (objG5 == null ? null : objG5);
            if (n0Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                androidx.compose.ui.geometry.c cVarU3 = u(pVar, rect4, n0Var4);
                Region regionO = O(n0Var4.a(cVarU3.c(), f0Var.X, uVar.getDensity()), cVarU3.a, cVarU3.b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(androidx.compose.ui.semantics.q qVar) {
        androidx.compose.ui.unit.k kVar = qVar.b;
        return M(kVar.a, kVar.b, kVar.c, kVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[Catch: all -> 0x0037, LOOP:0: B:33:0x007e->B:34:0x0080, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:39:0x00b2, B:41:0x00b6, B:43:0x00c5, B:47:0x00d2), top: B:57:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ec -> B:50:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(kotlin.coroutines.jvm.internal.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a0.l(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(long j, int i, boolean z) {
        androidx.compose.ui.semantics.w wVar;
        int i2;
        if (!kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        androidx.collection.n nVarS = s();
        if (androidx.compose.ui.geometry.b.b(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            wVar = androidx.compose.ui.semantics.t.v;
        } else {
            if (z) {
                coil3.g.a();
                return false;
            }
            wVar = androidx.compose.ui.semantics.t.u;
        }
        Object[] objArr = nVarS.c;
        long[] jArr = nVarS.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) objArr[(i3 << 3) + i6];
                        androidx.compose.ui.unit.k kVar = qVar.b;
                        float f = kVar.a;
                        i2 = i4;
                        float f2 = kVar.b;
                        float f3 = kVar.c;
                        float f4 = kVar.d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                            Object objG = qVar.a.d.e.g(wVar);
                            if (objG == null) {
                                objG = null;
                            }
                            androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) objG;
                            if (iVar != null) {
                                kotlin.jvm.functions.a aVar = iVar.a;
                                if (i < 0) {
                                    if (((Number) aVar.invoke()).floatValue() > 0.0f) {
                                        z2 = true;
                                    }
                                } else if (((Number) aVar.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue()) {
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.A.getSemanticsOwner().a(), this.f0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        androidx.compose.ui.semantics.q qVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        u uVar = this.A;
        accessibilityEventObtain.setPackageName(uVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(uVar, i);
        if (v() && (qVar = (androidx.compose.ui.semantics.q) s().b(i)) != null) {
            androidx.compose.ui.semantics.p pVar = qVar.a;
            accessibilityEventObtain.setPassword(pVar.d.e.c(androidx.compose.ui.semantics.t.K));
            Object objG = pVar.d.e.g(androidx.compose.ui.semantics.t.n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = kotlin.jvm.internal.l.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                androidx.compose.ui.text.android.b.k(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.F = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.F = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager.isEnabled()) {
            this.F = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.G.removeCallbacks(this.i0);
        AccessibilityManager accessibilityManager = this.D;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(androidx.compose.ui.semantics.p pVar) {
        androidx.compose.ui.semantics.l lVar = pVar.d;
        if (!lVar.e.c(androidx.compose.ui.semantics.t.a)) {
            androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.G;
            if (lVar.e.c(wVar)) {
                return (int) (((androidx.compose.ui.text.l0) lVar.d(wVar)).a & 4294967295L);
            }
        }
        return this.R;
    }

    public final int r(androidx.compose.ui.semantics.p pVar) {
        androidx.compose.ui.semantics.l lVar = pVar.d;
        if (!lVar.e.c(androidx.compose.ui.semantics.t.a)) {
            androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.G;
            if (lVar.e.c(wVar)) {
                return (int) (((androidx.compose.ui.text.l0) lVar.d(wVar)).a >> 32);
            }
        }
        return this.R;
    }

    public final androidx.collection.n s() {
        if (this.V) {
            this.V = false;
            u uVar = this.A;
            this.X = androidx.compose.ui.semantics.s.b(uVar.getSemanticsOwner(), o.A);
            if (v()) {
                androidx.collection.z zVar = this.X;
                Resources resources = uVar.getContext().getResources();
                androidx.collection.x xVar = this.Z;
                xVar.a();
                androidx.collection.x xVar2 = this.a0;
                xVar2.a();
                androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) zVar.b(-1);
                androidx.compose.ui.semantics.p pVar = qVar != null ? qVar.a : null;
                pVar.getClass();
                ArrayList arrayListB = androidx.compose.ui.semantics.a0.b(pVar, new androidx.compose.animation.e(zVar, 14), new androidx.compose.animation.e(resources, 15), com.google.common.base.c.p(pVar));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((androidx.compose.ui.semantics.p) arrayListB.get(i - 1)).g;
                        int i3 = ((androidx.compose.ui.semantics.p) arrayListB.get(i)).g;
                        xVar.f(i2, i3);
                        xVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.X;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final androidx.compose.ui.geometry.c u(androidx.compose.ui.semantics.p pVar, Rect rect, androidx.compose.ui.graphics.n0 n0Var) {
        y yVar = new y(n0Var);
        androidx.compose.ui.node.f0 f0Var = pVar.c;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) f0Var.d0.g;
        androidx.compose.ui.node.i iVar = null;
        if ((qVar.A & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.z & 8) == 0) {
                    if ((qVar.A & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.C;
                } else {
                    androidx.compose.ui.q qVarE = qVar;
                    androidx.compose.runtime.collection.b bVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof androidx.compose.ui.node.u1) {
                            ((androidx.compose.ui.node.u1) qVarE).l0(yVar);
                            if (yVar.e) {
                                iVar = qVarE;
                                break loop0;
                            }
                        } else if ((qVarE.z & 8) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                            int i = 0;
                            for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                if ((qVar2.z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVarE = qVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (qVarE != null) {
                                            bVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        bVar.b(qVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVarE = androidx.compose.ui.node.k.e(bVar);
                    }
                    if ((qVar.A & 8) != 0) {
                        break;
                    }
                    qVar = qVar.C;
                }
            }
        }
        androidx.compose.ui.node.i iVar2 = (androidx.compose.ui.node.u1) iVar;
        if (iVar2 == null || !((androidx.compose.ui.q) iVar2).e.K) {
            return androidx.compose.ui.layout.a0.e((androidx.compose.ui.node.d1) f0Var.d0.e, false);
        }
        androidx.compose.ui.node.d1 d1VarS = androidx.compose.ui.node.k.s(iVar2);
        androidx.compose.ui.geometry.c cVarS = androidx.compose.ui.layout.a0.g(d1VarS).s(d1VarS, true);
        Rect rectM = M(cVarS.a, cVarS.b, cVarS.c, cVarS.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new androidx.compose.ui.geometry.c(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.D;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.F;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.F = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(androidx.compose.ui.node.f0 f0Var) {
        if (this.T.add(f0Var)) {
            this.U.mo28trySendJP2dKIU(kotlin.y.a);
        }
    }
}
