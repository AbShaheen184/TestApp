package _COROUTINE;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.collection.h0;
import androidx.collection.j0;
import androidx.collection.o0;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.grid.o;
import androidx.compose.foundation.text.selection.s0;
import androidx.compose.foundation.text.u0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.q;
import androidx.compose.runtime.snapshots.u;
import androidx.compose.runtime.y0;
import androidx.compose.ui.autofill.e;
import androidx.compose.ui.autofill.i;
import androidx.compose.ui.autofill.p;
import androidx.compose.ui.autofill.s;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.v;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.i0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.semantics.h;
import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.l;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.y;
import androidx.compose.ui.window.d0;
import androidx.compose.ui.window.e0;
import androidx.lifecycle.x;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.tasks.j;
import com.google.common.collect.f1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
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
    public static final /* synthetic */ int l = 0;

    public static final int A(o oVar, k1 k1Var) {
        return (int) (k1Var == k1.e ? oVar.o & 4294967295L : oVar.o >> 32);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x02af  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02db  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:145:0x030f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0319  */
    /* JADX WARN: Code duplicated, block: B:150:0x0322  */
    /* JADX WARN: Code duplicated, block: B:151:0x0324  */
    /* JADX WARN: Code duplicated, block: B:153:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x034f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0367  */
    /* JADX WARN: Code duplicated, block: B:172:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0371  */
    /* JADX WARN: Code duplicated, block: B:177:0x0374 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x037a  */
    /* JADX WARN: Code duplicated, block: B:184:0x038b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0392  */
    /* JADX WARN: Code duplicated, block: B:189:0x039c A[LOOP:5: B:188:0x039a->B:189:0x039c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:208:0x0197 A[EDGE_INSN: B:208:0x0197->B:70:0x0197 BREAK  A[LOOP:0: B:9:0x003e->B:68:0x0175], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0173 A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v12 androidx.compose.ui.autofill.e) = (r6v11 androidx.compose.ui.autofill.e), (r6v13 androidx.compose.ui.autofill.e) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v8 androidx.compose.ui.state.a) = (r21v7 androidx.compose.ui.state.a), (r21v9 androidx.compose.ui.state.a) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v5 androidx.compose.ui.text.g) = (r22v4 androidx.compose.ui.text.g), (r22v6 androidx.compose.ui.text.g) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v5 androidx.compose.ui.autofill.g) = (r23v4 androidx.compose.ui.autofill.g), (r23v6 androidx.compose.ui.autofill.g) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 androidx.compose.ui.autofill.p) = (r24v5 androidx.compose.ui.autofill.p), (r24v7 androidx.compose.ui.autofill.p) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v8 androidx.compose.ui.semantics.h) = (r26v7 androidx.compose.ui.semantics.h), (r26v9 androidx.compose.ui.semantics.h) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[LOOP:0: B:9:0x003e->B:68:0x0175, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(ViewStructure viewStructure, f0 f0Var, AutofillId autofillId, String str, androidx.compose.ui.spatial.b bVar) {
        long j2;
        long j3;
        char c2;
        long j4;
        boolean zBooleanValue;
        androidx.compose.ui.state.a aVar;
        g gVar;
        androidx.compose.ui.autofill.g gVar2;
        h hVar;
        e eVar;
        boolean z;
        p pVar;
        Boolean bool;
        boolean z2;
        Integer num;
        int i2;
        List list;
        Integer numValueOf;
        int iIntValue;
        Integer numValueOf2;
        String[] strArrV;
        boolean z3;
        boolean z4;
        boolean z5;
        String strR;
        int size;
        String strT;
        int i3;
        String[] strArrV2;
        boolean z6;
        String[] strArrV3;
        o0 o0Var;
        long[] jArr;
        Object[] objArr;
        int i4;
        long[] jArr2;
        Object[] objArr2;
        o0 o0Var2;
        androidx.compose.ui.state.a aVar2;
        g gVar3;
        androidx.compose.ui.autofill.g gVar4;
        h hVar2;
        w wVar = t.a;
        w wVar2 = k.a;
        l lVarX = f0Var.x();
        int i5 = 8;
        if (lVarX == null || (o0Var2 = lVarX.e) == null) {
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            zBooleanValue = true;
            aVar = null;
            gVar = null;
            gVar2 = null;
            hVar = null;
            eVar = null;
            z = false;
            pVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = o0Var2.b;
            j2 = 128;
            Object[] objArr4 = o0Var2.c;
            long[] jArr3 = o0Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i6 = 0;
                eVar = null;
                j3 = 255;
                z = false;
                aVar2 = null;
                gVar3 = null;
                gVar4 = null;
                pVar = null;
                bool = null;
                hVar2 = null;
                z2 = false;
                num = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr3[i6];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr3[i9];
                                Object obj2 = objArr4[i9];
                                w wVar3 = (w) obj;
                                if (kotlin.jvm.internal.l.a(wVar3, t.r)) {
                                    obj2.getClass();
                                    eVar = (e) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) kotlin.collections.o.M((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.q)) {
                                    obj2.getClass();
                                    pVar = (p) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.s)) {
                                    obj2.getClass();
                                    gVar4 = (androidx.compose.ui.autofill.g) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.F)) {
                                    obj2.getClass();
                                    gVar3 = (g) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.O)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.K)) {
                                    z2 = true;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.n)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.y)) {
                                    obj2.getClass();
                                    hVar2 = (h) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.I)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, t.J)) {
                                    obj2.getClass();
                                    aVar2 = (androidx.compose.ui.state.a) obj2;
                                } else if (kotlin.jvm.internal.l.a(wVar3, k.b)) {
                                    viewStructure.setClickable(true);
                                } else if (kotlin.jvm.internal.l.a(wVar3, k.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kotlin.jvm.internal.l.a(wVar3, k.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (kotlin.jvm.internal.l.a(wVar3, k.k)) {
                                    z = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            } else {
                j3 = 255;
                c2 = 7;
                j4 = -9187201950435737472L;
                zBooleanValue = true;
                eVar = null;
                z = false;
                aVar2 = null;
                gVar3 = null;
                gVar4 = null;
                pVar = null;
                bool = null;
                hVar2 = null;
                z2 = false;
                num = null;
            }
            aVar = aVar2;
            gVar = gVar3;
            gVar2 = gVar4;
            hVar = hVar2;
        }
        l lVarX2 = f0Var.x();
        if (lVarX2 != null && lVarX2.z && !lVarX2.A) {
            lVarX2 = lVarX2.c();
            j0 j0Var = new j0(((androidx.compose.runtime.collection.b) ((h0) f0Var.n()).y).z);
            j0Var.c(f0Var.n());
            while (j0Var.i()) {
                f0 f0Var2 = (f0) j0Var.k(j0Var.b - 1);
                l lVarX3 = f0Var2.x();
                if (lVarX3 != null && !lVarX3.z) {
                    lVarX2.e(lVarX3);
                    if (!lVarX3.A) {
                        j0Var.c(f0Var2.n());
                    }
                }
            }
        }
        if (lVarX2 != null && (o0Var = lVarX2.e) != null) {
            Object[] objArr5 = o0Var.b;
            Object[] objArr6 = o0Var.c;
            long[] jArr4 = o0Var.a;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j6 = jArr4[i10];
                    int i11 = i5;
                    int i12 = i10;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j6 & j3) < j2) {
                                int i15 = (i12 << 3) + i14;
                                Object obj3 = objArr5[i15];
                                Object obj4 = objArr6[i15];
                                jArr2 = jArr4;
                                w wVar4 = (w) obj3;
                                objArr2 = objArr5;
                                if (kotlin.jvm.internal.l.a(wVar4, t.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (kotlin.jvm.internal.l.a(wVar4, t.B)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j6 >>= i11;
                            i14++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                        if (i13 != i4) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                    }
                    if (i12 == length2) {
                        break;
                    }
                    i10 = i12 + 1;
                    i5 = i4;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
            numValueOf = Integer.valueOf(f0Var.y);
            if (f0Var.v() == null) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            i.d(viewStructure, autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            if (eVar != null) {
                numValueOf2 = Integer.valueOf(eVar.a);
            } else if (z) {
                numValueOf2 = Integer.valueOf(i2);
            } else if (aVar != null) {
                numValueOf2 = 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                i.e(viewStructure, numValueOf2.intValue());
            }
            if (gVar != null) {
                i.f(viewStructure, i.a(gVar.y));
            }
            if (gVar2 != null) {
                i.f(viewStructure, gVar2.a);
            }
            if (pVar != null && (strArrV3 = a.v(pVar)) != null) {
                i.c(viewStructure, strArrV3);
            }
            bVar.a.u(f0Var.y, new s(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (aVar != null) {
                viewStructure.setCheckable(i2);
                if (aVar == androidx.compose.ui.state.a.e) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                viewStructure.setChecked(z6);
            } else if (bool != null && (hVar == null || hVar.a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            p.a.getClass();
            strArrV = a.v(androidx.compose.ui.autofill.o.b);
            strArrV.getClass();
            if (strArrV.length != 0) {
                androidx.transition.k.m("Array is empty.");
                return;
            }
            String str2 = strArrV[0];
            if (pVar == null && (strArrV2 = a.v(pVar)) != null) {
                boolean zA = n.A(str2, strArrV2);
                z3 = true;
                boolean z7 = zA;
                if (!z2 || z7) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                if (!z4 || zBooleanValue) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                i.g(viewStructure, z5);
                viewStructure.setVisibility(((d1) f0Var.d0.e).b1() ? 4 : 0);
                if (list != null) {
                    size = list.size();
                    strT = "";
                    for (i3 = 0; i3 < size; i3++) {
                        strT = androidx.privacysandbox.ads.adservices.java.internal.a.t(c.n(strT), ((g) list.get(i3)).y, '\n');
                    }
                    viewStructure.setText(strT);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((h0) f0Var.n()).isEmpty() && hVar != null && (strR = i0.r(hVar.a)) != null) {
                    viewStructure.setClassName(strR);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        s0.r(viewStructure, num.intValue());
                    }
                    if (z4) {
                        i.h(viewStructure);
                    }
                }
            }
            z3 = true;
            if (z2) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            if (z4) {
                z5 = z3;
            } else {
                z5 = z3;
            }
            i.g(viewStructure, z5);
            viewStructure.setVisibility(((d1) f0Var.d0.e).b1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strT = "";
                while (i3 < size) {
                    strT = androidx.privacysandbox.ads.adservices.java.internal.a.t(c.n(strT), ((g) list.get(i3)).y, '\n');
                }
                viewStructure.setText(strT);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((h0) f0Var.n()).isEmpty()) {
                viewStructure.setClassName(strR);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28) {
                    s0.r(viewStructure, num.intValue());
                }
                if (z4) {
                    i.h(viewStructure);
                }
            }
        }
        i2 = 1;
        list = null;
        numValueOf = Integer.valueOf(f0Var.y);
        if (f0Var.v() == null) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        i.d(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (eVar != null) {
            numValueOf2 = Integer.valueOf(eVar.a);
        } else if (z) {
            numValueOf2 = Integer.valueOf(i2);
        } else if (aVar != null) {
            numValueOf2 = 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            i.e(viewStructure, numValueOf2.intValue());
        }
        if (gVar != null) {
            i.f(viewStructure, i.a(gVar.y));
        }
        if (gVar2 != null) {
            i.f(viewStructure, gVar2.a);
        }
        if (pVar != null) {
            i.c(viewStructure, strArrV3);
        }
        bVar.a.u(f0Var.y, new s(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(i2);
            if (aVar == androidx.compose.ui.state.a.e) {
                z6 = true;
            } else {
                z6 = false;
            }
            viewStructure.setChecked(z6);
        } else if (bool != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        p.a.getClass();
        strArrV = a.v(androidx.compose.ui.autofill.o.b);
        strArrV.getClass();
        if (strArrV.length != 0) {
            androidx.transition.k.m("Array is empty.");
            return;
        }
        String str3 = strArrV[0];
        if (pVar == null) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        i.g(viewStructure, z5);
        viewStructure.setVisibility(((d1) f0Var.d0.e).b1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strT = "";
            while (i3 < size) {
                strT = androidx.privacysandbox.ads.adservices.java.internal.a.t(c.n(strT), ((g) list.get(i3)).y, '\n');
            }
            viewStructure.setText(strT);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((h0) f0Var.n()).isEmpty()) {
            viewStructure.setClassName(strR);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                s0.r(viewStructure, num.intValue());
            }
            if (z4) {
                i.h(viewStructure);
            }
        }
    }

    public static androidx.datastore.preferences.a C(String str, androidx.compose.ui.draw.i iVar, com.google.firebase.datastorage.a aVar, int i2) {
        kotlin.jvm.functions.l yVar = aVar;
        if ((i2 & 4) != 0) {
            yVar = new y(12);
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        CoroutineScope.getClass();
        return new androidx.datastore.preferences.a(str, iVar, yVar, CoroutineScope);
    }

    public static final androidx.activity.compose.t D(androidx.activity.result.contract.a aVar, kotlin.jvm.functions.l lVar, r rVar, int i2) {
        Object obj;
        androidx.compose.runtime.s.v(aVar, rVar);
        Object objV = androidx.compose.runtime.s.v(lVar, rVar);
        Object[] objArr = new Object[0];
        Object objQ = rVar.Q();
        Object obj2 = m.a;
        if (objQ == obj2) {
            objQ = new androidx.activity.compose.b(0);
            rVar.l0(objQ);
        }
        Object obj3 = (String) androidx.compose.runtime.saveable.n.e(objArr, (kotlin.jvm.functions.a) objQ, rVar);
        androidx.activity.result.i iVar = (androidx.activity.result.i) rVar.j(androidx.activity.compose.r.a);
        if (iVar == null) {
            rVar.b0(1213380307);
            Object baseContext = (Context) rVar.j(m0.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof androidx.activity.result.i) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            iVar = (androidx.activity.result.i) baseContext;
        } else {
            rVar.b0(1213379439);
        }
        rVar.p(false);
        if (iVar == null) {
            net.luminis.tls.engine.impl.c.r("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = iVar.getActivityResultRegistry();
        Object objQ2 = rVar.Q();
        if (objQ2 == obj2) {
            objQ2 = new androidx.activity.compose.a();
            rVar.l0(objQ2);
        }
        androidx.activity.compose.a aVar2 = (androidx.activity.compose.a) objQ2;
        Object objQ3 = rVar.Q();
        if (objQ3 == obj2) {
            objQ3 = new androidx.activity.compose.t(aVar2);
            rVar.l0(objQ3);
        }
        androidx.activity.compose.t tVar = (androidx.activity.compose.t) objQ3;
        boolean zH = rVar.h(aVar2) | rVar.h(activityResultRegistry) | rVar.f(obj3) | rVar.h(aVar) | rVar.f(objV);
        Object objQ4 = rVar.Q();
        if (zH || objQ4 == obj2) {
            obj = aVar;
            objQ4 = new androidx.activity.compose.c(aVar2, activityResultRegistry, obj3, obj, objV, 0);
            rVar.l0(objQ4);
        } else {
            obj = aVar;
        }
        kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ4;
        boolean zF = rVar.f(activityResultRegistry) | rVar.f(obj3) | rVar.f(obj);
        Object objQ5 = rVar.Q();
        if (zF || objQ5 == obj2) {
            objQ5 = new androidx.compose.runtime.f0(lVar2);
            rVar.l0(objQ5);
        }
        return tVar;
    }

    public static void G(Status status, Object obj, j jVar) {
        if (status.e <= 0) {
            jVar.b(obj);
        } else {
            jVar.a(status.z != null ? new com.google.android.gms.common.api.j(status) : new d(status));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final coil3.intercept.a H(coil3.intercept.a aVar, coil3.request.g gVar, coil3.request.n nVar, coil3.f fVar, androidx.media3.exoplayer.dash.manifest.t tVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.intercept.g gVar2;
        Bitmap bitmapL;
        coil3.intercept.a aVar2;
        Bitmap bitmap;
        int size;
        coil3.f fVar2;
        List list;
        int i2;
        coil3.request.g gVar3 = gVar;
        coil3.request.n nVar2 = nVar;
        if (cVar instanceof coil3.intercept.g) {
            gVar2 = (coil3.intercept.g) cVar;
            int i3 = gVar2.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar2.F = i3 - Integer.MIN_VALUE;
            } else {
                gVar2 = new coil3.intercept.g(cVar);
            }
        } else {
            gVar2 = new coil3.intercept.g(cVar);
        }
        Object obj = gVar2.E;
        int i4 = gVar2.F;
        if (i4 == 0) {
            kotlin.a.e(obj);
            List list2 = (List) coil3.m.d(gVar3, coil3.request.h.a);
            if (list2.isEmpty()) {
                return aVar;
            }
            coil3.k kVar = aVar.a;
            boolean z = kVar instanceof coil3.a;
            coil3.util.h hVar = coil3.util.h.z;
            if (!z && !((Boolean) coil3.m.d(gVar3, coil3.request.h.d)).booleanValue()) {
                if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar) <= 0) {
                    androidx.media3.exoplayer.dash.manifest.t.N("EngineInterceptor", hVar, androidx.privacysandbox.ads.adservices.java.internal.a.q("allowConversionToBitmap=false, skipping transformations for type ", a0.a(aVar.a.getClass()).c(), "."), null);
                }
                return aVar;
            }
            if (z) {
                Bitmap bitmap2 = ((coil3.a) kVar).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (n.A(config, coil3.util.m.a)) {
                    bitmapL = bitmap2;
                } else if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar) <= 0) {
                    androidx.media3.exoplayer.dash.manifest.t.N("EngineInterceptor", hVar, "Converting bitmap with config " + config + " to apply transformations: " + list2 + ".", null);
                }
                fVar.getClass();
                aVar2 = aVar;
                bitmap = bitmapL;
                size = list2.size();
                fVar2 = fVar;
                list = list2;
                i2 = 0;
            } else if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar) <= 0) {
                androidx.media3.exoplayer.dash.manifest.t.N("EngineInterceptor", hVar, "Converting image of type " + a0.a(kVar.getClass()).b() + " to apply transformations: " + list2 + ".", null);
            }
            bitmapL = com.google.firebase.b.l(coil3.m.b(kVar, nVar2.a.getResources()), (Bitmap.Config) coil3.m.e(nVar2, coil3.request.i.b), nVar2.b, nVar2.c, (coil3.size.h) coil3.m.e(nVar2, coil3.request.h.b), nVar2.d == coil3.size.d.y);
            fVar.getClass();
            aVar2 = aVar;
            bitmap = bitmapL;
            size = list2.size();
            fVar2 = fVar;
            list = list2;
            i2 = 0;
        } else {
            if (i4 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = gVar2.D;
            int i5 = gVar2.C;
            List list3 = gVar2.B;
            fVar2 = gVar2.A;
            coil3.request.n nVar3 = gVar2.z;
            coil3.request.g gVar4 = gVar2.y;
            aVar2 = gVar2.e;
            kotlin.a.e(obj);
            Bitmap bitmap3 = (Bitmap) obj;
            JobKt.ensureActive(gVar2.getContext());
            i2 = i5 + 1;
            gVar3 = gVar4;
            bitmap = bitmap3;
            list = list3;
            nVar2 = nVar3;
        }
        if (i2 >= size) {
            fVar2.getClass();
            return new coil3.intercept.a(new coil3.a(bitmap), aVar2.b, aVar2.c, aVar2.d);
        }
        if (list.get(i2) != null) {
            androidx.transition.k.i();
            return null;
        }
        coil3.size.h hVar2 = nVar2.b;
        gVar2.e = aVar2;
        gVar2.y = gVar3;
        gVar2.z = nVar2;
        gVar2.A = fVar2;
        gVar2.B = list;
        gVar2.C = i2;
        gVar2.D = size;
        gVar2.F = 1;
        throw null;
    }

    public static final void a(androidx.navigation.compose.o oVar, r rVar, int i2) {
        q qVar;
        androidx.navigation.compose.o oVar2 = oVar;
        rVar.c0(294589392);
        if ((((rVar.h(oVar2) ? 4 : 2) | i2) & 3) == 2 && rVar.F()) {
            rVar.W();
        } else {
            androidx.compose.runtime.saveable.e eVarF = androidx.compose.runtime.saveable.n.f(rVar);
            y0 y0VarG = androidx.compose.runtime.s.g(oVar2.b().e, rVar);
            List list = (List) y0VarG.getValue();
            boolean zBooleanValue = ((Boolean) rVar.j(w1.a)).booleanValue();
            boolean zF = rVar.f(list);
            Object objQ = rVar.Q();
            Object obj = m.a;
            Object obj2 = objQ;
            if (zF || objQ == obj) {
                q qVar2 = new q();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                    if (zBooleanValue || iVar.E.j.d.compareTo(androidx.lifecycle.o.A) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                qVar2.addAll(arrayList);
                rVar.l0(qVar2);
                obj2 = qVar2;
            }
            q qVar3 = (q) obj2;
            d(qVar3, (List) y0VarG.getValue(), rVar, 0);
            y0 y0VarG2 = androidx.compose.runtime.s.g(oVar2.b().f, rVar);
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = new q();
                rVar.l0(objQ2);
            }
            q qVar4 = (q) objQ2;
            rVar.b0(-367418626);
            ListIterator listIterator = qVar3.listIterator();
            while (true) {
                u uVar = (u) listIterator;
                if (!uVar.hasNext()) {
                    break;
                }
                androidx.navigation.i iVar2 = (androidx.navigation.i) uVar.next();
                androidx.navigation.t tVar = iVar2.y;
                tVar.getClass();
                androidx.navigation.compose.n nVar = (androidx.navigation.compose.n) tVar;
                boolean zH = rVar.h(oVar2) | rVar.h(iVar2);
                Object objQ3 = rVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new androidx.activity.compose.f(19, oVar2, iVar2);
                    rVar.l0(objQ3);
                }
                t1.a((kotlin.jvm.functions.a) objQ3, nVar.C, androidx.compose.runtime.internal.k.c(1129586364, new androidx.navigation.compose.m(iVar2, oVar2, eVarF, qVar4, nVar), rVar), rVar, 384, 0);
                oVar2 = oVar2;
                eVarF = eVarF;
                qVar4 = qVar4;
            }
            androidx.navigation.compose.o oVar3 = oVar2;
            q qVar5 = qVar4;
            rVar.p(false);
            Set set = (Set) y0VarG2.getValue();
            boolean zF2 = rVar.f(y0VarG2) | rVar.h(oVar3);
            Object objQ4 = rVar.Q();
            if (zF2 || objQ4 == obj) {
                oVar2 = oVar3;
                qVar = qVar5;
                Object u0Var = new u0(y0VarG2, oVar2, qVar, null, 1);
                rVar.l0(u0Var);
                objQ4 = u0Var;
            } else {
                oVar2 = oVar3;
                qVar = qVar5;
            }
            androidx.compose.runtime.j0.d(set, qVar, (kotlin.jvm.functions.p) objQ4, rVar);
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g0(oVar2, i2, 15);
        }
    }

    public static final long b(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void c(androidx.compose.foundation.text.selection.m mVar, androidx.compose.ui.e eVar, androidx.compose.runtime.internal.f fVar, r rVar, int i2) {
        int i3;
        rVar.c0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? rVar.f(mVar) : rVar.h(mVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.f(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        boolean z = true;
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & Token.ASSIGN_MOD) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !rVar.f(mVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objQ = rVar.Q();
            if (z3 || objQ == m.a) {
                objQ = new androidx.compose.foundation.text.selection.l(eVar, mVar);
                rVar.l0(objQ);
            }
            androidx.compose.ui.window.o.a((androidx.compose.foundation.text.selection.l) objQ, null, new d0(false, e0.e, false), fVar, rVar, ((i3 << 3) & 7168) | 384, 2);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(mVar, eVar, fVar, i2, 6);
        }
    }

    public static final void d(List list, Collection collection, r rVar, int i2) {
        rVar.c0(1537894851);
        if ((((rVar.h(list) ? 4 : 2) | i2 | (rVar.h(collection) ? 32 : 16)) & 19) == 18 && rVar.F()) {
            rVar.W();
        } else {
            boolean zBooleanValue = ((Boolean) rVar.j(w1.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                androidx.navigation.i iVar = (androidx.navigation.i) it.next();
                x xVar = iVar.E.j;
                boolean zG = rVar.g(zBooleanValue) | rVar.h(list) | rVar.h(iVar);
                Object objQ = rVar.Q();
                if (zG || objQ == m.a) {
                    objQ = new androidx.navigation.compose.k(0, iVar, list, zBooleanValue);
                    rVar.l0(objQ);
                }
                androidx.compose.runtime.j0.b(xVar, (kotlin.jvm.functions.l) objQ, rVar);
            }
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(list, collection, i2, 12);
        }
    }

    public static final void e(final androidx.compose.foundation.text.selection.m mVar, final boolean z, final androidx.compose.ui.text.style.j jVar, final boolean z2, long j2, final float f2, final androidx.compose.ui.r rVar, r rVar2, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z3;
        rVar2.c0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? rVar2.f(mVar) : rVar2.h(mVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar2.d(jVar.ordinal()) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= rVar2.g(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= rVar2.f(rVar) ? 1048576 : 524288;
        }
        if (rVar2.T(i3 & 1, (533651 & i3) != 533650)) {
            rVar2.Y();
            if ((i2 & 1) == 0 || rVar2.C()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                rVar2.W();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            rVar2.q();
            androidx.compose.ui.text.style.j jVar2 = androidx.compose.ui.text.style.j.y;
            androidx.compose.ui.text.style.j jVar3 = androidx.compose.ui.text.style.j.e;
            if (z) {
                float f3 = androidx.compose.foundation.text.selection.j0.a;
                z3 = (jVar == jVar3 && !z2) || (jVar == jVar2 && z2);
            } else {
                float f4 = androidx.compose.foundation.text.selection.j0.a;
                z3 = !((jVar == jVar3 && !z2) || (jVar == jVar2 && z2));
            }
            androidx.compose.ui.g gVar = z3 ? androidx.compose.ui.a.b : androidx.compose.ui.a.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && rVar2.h(mVar))) | ((i4 & Token.ASSIGN_MOD) == 32) | rVar2.g(z3);
            Object objQ = rVar2.Q();
            if (zG || objQ == m.a) {
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.text.selection.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.semantics.x xVar = (androidx.compose.ui.semantics.x) obj;
                        long jA = mVar.a();
                        xVar.b(j0.c, new i0(z ? androidx.compose.foundation.text.f0.y : androidx.compose.foundation.text.f0.z, jA, z3 ? h0.e : h0.z, (9223372034707292159L & jA) != 9205357640488583168L));
                        return kotlin.y.a;
                    }
                };
                rVar2.l0(objQ);
            }
            final androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(rVar, false, (kotlin.jvm.functions.l) objQ);
            final p2 p2Var = (p2) rVar2.j(l1.s);
            long j5 = j4;
            androidx.compose.ui.g gVar2 = gVar;
            j3 = j5;
            c(mVar, gVar2, androidx.compose.runtime.internal.k.c(1365123137, new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.c
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (rVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.appcompat.widget.r rVarA2 = l1.s.a(p2Var);
                        final long j6 = j3;
                        final boolean z4 = z3;
                        final androidx.compose.ui.r rVar4 = rVarA;
                        final m mVar2 = mVar;
                        androidx.compose.runtime.s.a(rVarA2, androidx.compose.runtime.internal.k.c(1260045569, new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.e
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (rVar5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z5 = z4;
                                    androidx.compose.ui.r rVar6 = rVar4;
                                    final m mVar3 = mVar2;
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                    if (j7 != 9205357640488583168L) {
                                        rVar5.b0(3458246);
                                        androidx.compose.foundation.layout.a aVar = z5 ? androidx.compose.foundation.layout.b.b : androidx.compose.foundation.layout.b.a;
                                        androidx.compose.ui.r rVarK = androidx.compose.foundation.layout.w0.k(rVar6, androidx.compose.ui.unit.h.b(j7), androidx.compose.ui.unit.h.a(j7), 0.0f, 0.0f, 12);
                                        androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(aVar, androidx.compose.ui.c.G, rVar5, 0);
                                        int iHashCode = Long.hashCode(rVar5.T);
                                        androidx.compose.runtime.internal.j jVarL = rVar5.l();
                                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar5, rVarK);
                                        androidx.compose.ui.node.g.b.getClass();
                                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                        rVar5.e0();
                                        if (rVar5.S) {
                                            rVar5.k(yVar);
                                        } else {
                                            rVar5.o0();
                                        }
                                        androidx.compose.runtime.s.x(rVar5, t0VarA, androidx.compose.ui.node.f.e);
                                        androidx.compose.runtime.s.x(rVar5, jVarL, androidx.compose.ui.node.f.d);
                                        androidx.compose.runtime.s.p(rVar5, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                        androidx.compose.runtime.s.t(rVar5, androidx.compose.ui.node.f.g);
                                        androidx.compose.runtime.s.x(rVar5, rVarC, androidx.compose.ui.node.f.c);
                                        boolean zH = rVar5.h(mVar3);
                                        Object objQ2 = rVar5.Q();
                                        if (zH || objQ2 == fVar) {
                                            final int i6 = 0;
                                            objQ2 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f
                                                @Override // kotlin.jvm.functions.a
                                                public final Object invoke() {
                                                    switch (i6) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            rVar5.l0(objQ2);
                                        }
                                        _COROUTINE.b.f(androidx.compose.ui.o.b, (kotlin.jvm.functions.a) objQ2, z5, rVar5, 6);
                                        rVar5.p(true);
                                        rVar5.p(false);
                                    } else {
                                        rVar5.b0(4389176);
                                        boolean zH2 = rVar5.h(mVar3);
                                        Object objQ3 = rVar5.Q();
                                        if (zH2 || objQ3 == fVar) {
                                            final int i7 = 1;
                                            objQ3 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f
                                                @Override // kotlin.jvm.functions.a
                                                public final Object invoke() {
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            rVar5.l0(objQ3);
                                        }
                                        _COROUTINE.b.f(rVar6, (kotlin.jvm.functions.a) objQ3, z5, rVar5, 0);
                                        rVar5.p(false);
                                    }
                                } else {
                                    rVar5.W();
                                }
                                return kotlin.y.a;
                            }
                        }, rVar3), rVar3, 56);
                    } else {
                        rVar3.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar2), rVar2, i5 | 384);
        } else {
            rVar2.W();
            j3 = j2;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            final long j6 = j3;
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.d
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    _COROUTINE.b.e(mVar, z, jVar, z2, j6, f2, rVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i2 | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void f(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, boolean z, r rVar2, int i2) {
        int i3;
        rVar2.c0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (rVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (rVar2.h(aVar) ? 32 : 16) | (rVar2.g(z) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar2.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.ui.a.a(w0.m(rVar, androidx.compose.foundation.text.selection.j0.a, androidx.compose.foundation.text.selection.j0.b), new androidx.compose.foundation.text.selection.h(aVar, z)));
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.selection.g(rVar, aVar, z, i2);
        }
    }

    public static androidx.media3.datasource.l h(androidx.media3.exoplayer.dash.manifest.m mVar, String str, androidx.media3.exoplayer.dash.manifest.j jVar, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri uriR = androidx.media3.common.util.c.r(str, jVar.c);
        long j2 = jVar.a;
        long j3 = jVar.b;
        String strB = mVar.b();
        if (strB == null) {
            strB = androidx.media3.common.util.c.r(((androidx.media3.exoplayer.dash.manifest.b) mVar.y.get(0)).a, jVar.c).toString();
        }
        String str2 = strB;
        com.google.android.material.motion.a.m(uriR, "The uri must be set.");
        return new androidx.media3.datasource.l(uriR, 0L, 1, null, f1.D, j2, j3, str2, i2);
    }

    public static boolean i(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zJ = j(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zJ;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean j(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final androidx.compose.ui.graphics.g k(androidx.compose.ui.draw.d dVar, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        androidx.compose.ui.graphics.g gVarF = android.support.v4.media.session.b.a;
        androidx.compose.ui.graphics.c cVarA = android.support.v4.media.session.b.b;
        androidx.compose.ui.graphics.drawscope.b bVar = android.support.v4.media.session.b.c;
        if (gVarF == null || cVarA == null) {
            gVarF = androidx.compose.ui.graphics.a0.f(iCeil, iCeil, 1);
            android.support.v4.media.session.b.a = gVarF;
            cVarA = androidx.compose.ui.graphics.a0.a(gVarF);
            android.support.v4.media.session.b.b = cVarA;
        } else {
            Bitmap bitmap = gVarF.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                gVarF = androidx.compose.ui.graphics.a0.f(iCeil, iCeil, 1);
                android.support.v4.media.session.b.a = gVarF;
                cVarA = androidx.compose.ui.graphics.a0.a(gVarF);
                android.support.v4.media.session.b.b = cVarA;
            }
        }
        androidx.compose.ui.graphics.g gVar = gVarF;
        androidx.compose.ui.graphics.c cVar = cVarA;
        if (bVar == null) {
            bVar = new androidx.compose.ui.graphics.drawscope.b();
            android.support.v4.media.session.b.c = bVar;
        }
        androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
        androidx.compose.ui.graphics.drawscope.a aVar = bVar2.e;
        androidx.compose.ui.unit.m layoutDirection = dVar.e.getLayoutDirection();
        Bitmap bitmap2 = gVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        androidx.compose.ui.unit.c cVar2 = aVar.a;
        androidx.compose.ui.unit.m mVar = aVar.b;
        androidx.compose.ui.graphics.r rVar = aVar.c;
        long j2 = aVar.d;
        aVar.a = dVar;
        aVar.b = layoutDirection;
        aVar.c = cVar;
        aVar.d = jFloatToRawIntBits;
        cVar.f();
        androidx.compose.ui.graphics.drawscope.d.p0(bVar2, androidx.compose.ui.graphics.t.b, 0L, bVar2.d(), 58);
        androidx.compose.ui.graphics.drawscope.d.p0(bVar2, androidx.compose.ui.graphics.a0.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 120);
        androidx.compose.ui.graphics.drawscope.d.R(bVar2, androidx.compose.ui.graphics.a0.d(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        cVar.q();
        aVar.a = cVar2;
        aVar.b = mVar;
        aVar.c = rVar;
        aVar.d = j2;
        return gVar;
    }

    public static final f m() {
        f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(19.0f, 13.0f);
        gVar.l(-6.0f);
        gVar.s(6.0f);
        gVar.l(-2.0f);
        gVar.s(-6.0f);
        gVar.k(5.0f);
        gVar.s(-2.0f);
        gVar.l(6.0f);
        gVar.r(5.0f);
        gVar.l(2.0f);
        gVar.s(6.0f);
        gVar.l(6.0f);
        gVar.s(2.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final int n(androidx.compose.ui.text.font.l lVar, int i2) {
        boolean z = kotlin.jvm.internal.l.b(lVar.e, androidx.compose.ui.text.font.l.y.e) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static androidx.compose.ui.autofill.r o(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new androidx.compose.ui.autofill.r(com.google.android.gms.common.wrappers.a.c(view));
        }
        return null;
    }

    public static final f p() {
        f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(10.0f, 6.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(8.59f, 7.41f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(13.17f, 12.0f));
        arrayList.add(new v(-4.58f, 4.59f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(10.0f, 18.0f));
        arrayList.add(new v(6.0f, -6.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final int r(String str, Bundle bundle) {
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        android.support.v4.media.session.b.z(str);
        throw null;
    }

    public static final f s() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(12.0f, 3.0f);
        gVar.s(10.55f);
        gVar.h(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
        gVar.h(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        gVar.q(1.79f, 4.0f, 4.0f, 4.0f);
        gVar.q(4.0f, -1.79f, 4.0f, -4.0f);
        gVar.r(7.0f);
        gVar.l(4.0f);
        gVar.r(3.0f);
        gVar.l(-6.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final ArrayList t(String str, Bundle bundle) {
        Class clsA = a0.a(Bundle.class).a();
        clsA.getClass();
        ArrayList arrayListE = Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.text.android.d.e(bundle, str, clsA) : bundle.getParcelableArrayList(str);
        if (arrayListE != null) {
            return arrayListE;
        }
        android.support.v4.media.session.b.z(str);
        throw null;
    }

    public static final f u() {
        f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Subtitles", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(20.0f, 4.0f);
        gVar.m(4.0f, 4.0f);
        gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.s(12.0f);
        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.l(16.0f);
        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.m(22.0f, 6.0f);
        gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.f();
        gVar.o(4.0f, 12.0f);
        gVar.l(4.0f);
        gVar.s(2.0f);
        gVar.m(4.0f, 14.0f);
        gVar.s(-2.0f);
        gVar.f();
        gVar.o(14.0f, 18.0f);
        gVar.m(4.0f, 18.0f);
        gVar.s(-2.0f);
        gVar.l(10.0f);
        gVar.s(2.0f);
        gVar.f();
        gVar.o(20.0f, 18.0f);
        gVar.l(-4.0f);
        gVar.s(-2.0f);
        gVar.l(4.0f);
        gVar.s(2.0f);
        gVar.f();
        gVar.o(20.0f, 14.0f);
        gVar.m(10.0f, 14.0f);
        gVar.s(-2.0f);
        gVar.l(10.0f);
        gVar.s(2.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static File v(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final boolean y(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static MappedByteBuffer z(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public abstract void E(boolean z);

    public abstract void F(boolean z);

    public abstract void g(androidx.sqlite.c cVar, Object obj);

    public abstract String l();

    public abstract InputFilter[] q(InputFilter[] inputFilterArr);

    public void w(androidx.sqlite.a aVar, Iterable iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        androidx.sqlite.c cVarU = aVar.U(l());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    g(cVarU, obj);
                    cVarU.Q();
                    cVarU.reset();
                }
            }
            com.google.common.base.i.c(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public void x(androidx.sqlite.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return;
        }
        androidx.sqlite.c cVarU = aVar.U(l());
        try {
            g(cVarU, obj);
            cVarU.Q();
            com.google.common.base.i.c(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }
}
