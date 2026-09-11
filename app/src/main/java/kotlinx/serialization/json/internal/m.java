package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.x;
import androidx.compose.foundation.s0;
import androidx.media3.common.util.m0;
import com.google.android.gms.measurement.internal.c0;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a0;
import kotlinx.serialization.json.s;
import kotlinx.serialization.json.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.android.material.shape.k implements kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.a {
    public final kotlinx.serialization.json.b b;
    public final q c;
    public final androidx.fragment.app.h d;
    public final c0 e;
    public int f;
    public final m0 g;
    public final h h;

    public m(kotlinx.serialization.json.b bVar, q qVar, androidx.fragment.app.h hVar, kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        this.b = bVar;
        this.c = qVar;
        this.d = hVar;
        this.e = bVar.b;
        this.f = -1;
        m0 m0Var = bVar.a;
        this.g = m0Var;
        this.h = m0Var.b ? null : new h(eVar);
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final float A() {
        androidx.fragment.app.h hVar = this.d;
        String strM = hVar.m();
        try {
            float f = Float.parseFloat(strM);
            this.b.a.getClass();
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            i.j(hVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'float' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final double B() {
        androidx.fragment.app.h hVar = this.d;
        String strM = hVar.m();
        try {
            double d = Double.parseDouble(strM);
            this.b.a.getClass();
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            i.j(hVar, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'double' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    public final kotlinx.serialization.json.i M() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(this.b.a, this.d).h();
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final boolean c() {
        boolean z;
        boolean z2;
        androidx.fragment.app.h hVar = this.d;
        int iL = hVar.L();
        String str = (String) hVar.C;
        if (iL == str.length()) {
            androidx.fragment.app.h.x(hVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iL) == '\"') {
            iL++;
            z = true;
        } else {
            z = false;
        }
        int iK = hVar.K(iL);
        if (iK >= str.length() || iK == -1) {
            androidx.fragment.app.h.x(hVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iK + 1;
        int iCharAt = str.charAt(iK) | ' ';
        if (iCharAt == 102) {
            hVar.f(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                androidx.fragment.app.h.x(hVar, "Expected valid boolean literal prefix, but had '" + hVar.m() + '\'', 0, null, 6);
                throw null;
            }
            hVar.f(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (hVar.y == str.length()) {
            androidx.fragment.app.h.x(hVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(hVar.y) == '\"') {
            hVar.y++;
            return z2;
        }
        androidx.fragment.app.h.x(hVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final char e() {
        androidx.fragment.app.h hVar = this.d;
        String strM = hVar.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Expected single char, but got '", strM), 0, null, 6);
        throw null;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.a
    public final void h(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        m0 m0Var = this.b.a;
        m0Var.getClass();
        androidx.fragment.app.h hVar = this.d;
        if (hVar.M()) {
            m0Var.getClass();
            i.f(hVar, "");
            throw null;
        }
        hVar.j(this.c.y);
        x xVar = (x) hVar.z;
        int i = xVar.y;
        int[] iArr = (int[]) xVar.A;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            xVar.y = i - 1;
        }
        int i2 = xVar.y;
        if (i2 != -1) {
            xVar.y = i2 - 1;
        }
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final int j() {
        androidx.fragment.app.h hVar = this.d;
        long jK = hVar.k();
        int i = (int) jK;
        if (jK == i) {
            return i;
        }
        androidx.fragment.app.h.x(hVar, "Failed to parse int for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a
    public final c0 l() {
        return this.e;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final String m() {
        this.g.getClass();
        return this.d.l();
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final kotlinx.serialization.encoding.a n(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        kotlinx.serialization.json.b bVar = this.b;
        q qVarI = i.i(eVar, bVar);
        androidx.fragment.app.h hVar = this.d;
        x xVar = (x) hVar.z;
        int i = xVar.y + 1;
        xVar.y = i;
        Object[] objArr = (Object[]) xVar.z;
        if (i == objArr.length) {
            int i2 = i * 2;
            xVar.z = Arrays.copyOf(objArr, i2);
            xVar.A = Arrays.copyOf((int[]) xVar.A, i2);
        }
        ((Object[]) xVar.z)[i] = eVar;
        hVar.j(qVarI.e);
        if (hVar.I() == 4) {
            androidx.fragment.app.h.x(hVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = qVarI.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new m(bVar, qVarI, hVar, eVar);
        }
        return (this.c == qVarI && bVar.a.b) ? this : new m(bVar, qVarI, hVar, eVar);
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final long o() {
        return this.d.k();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0124, please report this as an issue */
    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final Object p(kotlinx.serialization.a aVar) {
        String message;
        String strB;
        kotlinx.serialization.json.b bVar = this.b;
        androidx.fragment.app.h hVar = this.d;
        x xVar = (x) hVar.z;
        aVar.getClass();
        try {
            if (!(aVar instanceof kotlinx.serialization.c)) {
                return aVar.a(this);
            }
            bVar.a.getClass();
            String strE = i.e(((kotlinx.serialization.c) aVar).d(), bVar);
            this.g.getClass();
            String strH = hVar.H(strE);
            if (strH != null) {
                try {
                    com.google.android.material.motion.a.t((kotlinx.serialization.c) aVar, this, strH);
                    throw null;
                } catch (kotlinx.serialization.d e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strK0 = kotlin.text.k.k0(kotlin.text.k.u0(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iA0 = kotlin.text.k.a0(message3, '\n', 0, 6);
                    if (iA0 != -1) {
                        strSubstring = message3.substring(iA0 + 1, message3.length());
                    }
                    androidx.fragment.app.h.x(hVar, strK0, 0, strSubstring, 2);
                    throw null;
                }
            }
            if (!(aVar instanceof kotlinx.serialization.c)) {
                return aVar.a(this);
            }
            bVar.a.getClass();
            String strE2 = i.e(((kotlinx.serialization.c) aVar).d(), bVar);
            kotlinx.serialization.json.i iVarM = M();
            String strA = ((kotlinx.serialization.c) aVar).d().a();
            if (!(iVarM instanceof s)) {
                throw i.b(-1, iVarM.toString(), "Expected " + a0.a(s.class).c() + ", but had " + a0.a(iVarM.getClass()).c() + " as the serialized body of " + strA + " at element: " + xVar.l());
            }
            s sVar = (s) iVarM;
            kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) sVar.get(strE2);
            if (iVar != null) {
                w wVarA = kotlinx.serialization.json.j.a(iVar);
                strB = wVarA instanceof kotlinx.serialization.json.p ? null : wVarA.b();
            }
            try {
                com.google.android.material.motion.a.t((kotlinx.serialization.c) aVar, this, strB);
                throw null;
            } catch (kotlinx.serialization.d e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw i.b(-1, sVar.toString(), message4);
            }
            message = e.getMessage();
            message.getClass();
            if (kotlin.text.k.T(message, "at path", false)) {
                throw e;
            }
            throw new kotlinx.serialization.b(e.e, e.getMessage() + " at path: " + xVar.l(), e);
        } catch (kotlinx.serialization.b e3) {
            message = e3.getMessage();
            message.getClass();
            if (kotlin.text.k.T(message, "at path", false)) {
                throw e3;
            }
            throw new kotlinx.serialization.b(e3.e, e3.getMessage() + " at path: " + xVar.l(), e3);
        }
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final boolean r() {
        h hVar = this.h;
        if (!(hVar != null ? hVar.b : false)) {
            androidx.fragment.app.h hVar2 = this.d;
            int iK = hVar2.K(hVar2.L());
            String str = (String) hVar2.C;
            int length = str.length() - iK;
            boolean z = false;
            if (length >= 4 && iK != -1) {
                for (int i = 0; i < 4; i++) {
                    if ("null".charAt(i) == str.charAt(iK + i)) {
                    }
                }
                if (length <= 4 || i.d(str.charAt(iK + 4)) != 0) {
                    z = true;
                    hVar2.y = iK + 4;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.encoding.a
    public final int s(kotlinx.serialization.descriptors.e eVar) {
        Object obj;
        kotlinx.serialization.json.b bVar = this.b;
        m0 m0Var = bVar.a;
        eVar.getClass();
        q qVar = this.c;
        int iOrdinal = qVar.ordinal();
        int i = 0;
        zM = false;
        boolean zM = false;
        int iIntValue = -1;
        androidx.fragment.app.h hVar = this.d;
        if (iOrdinal == 0) {
            boolean zM2 = hVar.M();
            boolean zE = hVar.e();
            h hVar2 = this.h;
            if (zE) {
                this.g.getClass();
                String strG = hVar.g();
                hVar.j(':');
                eVar.getClass();
                bVar.getClass();
                strG.getClass();
                m0 m0Var2 = bVar.a;
                m0Var2.getClass();
                i.h(eVar, bVar);
                int iD = eVar.d(strG);
                if (iD == -3 && m0Var2.c) {
                    com.google.android.material.internal.b bVar2 = bVar.c;
                    com.app.mlounge.ui.screens.movies.g gVar = new com.app.mlounge.ui.screens.movies.g(15, eVar, bVar);
                    bVar2.getClass();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar2.e;
                    Map map = (Map) concurrentHashMap.get(eVar);
                    j jVar = i.a;
                    Object obj2 = map != null ? map.get(jVar) : null;
                    Object objInvoke = obj2 != null ? obj2 : null;
                    if (objInvoke == null) {
                        objInvoke = gVar.invoke();
                        Object obj3 = concurrentHashMap.get(eVar);
                        if (obj3 == null) {
                            obj = obj3;
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(eVar, concurrentHashMap2);
                            obj = concurrentHashMap2;
                        }
                        obj = obj3;
                        ((Map) obj).put(jVar, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(strG);
                    iIntValue = num != null ? num.intValue() : -3;
                } else {
                    iIntValue = iD;
                }
                if (iIntValue == -3) {
                    hVar.w(androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Encountered an unknown key '", strG), kotlin.text.k.f0(((String) hVar.C).subSequence(0, hVar.y).toString(), 6, strG), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (hVar2 != null) {
                    kotlinx.serialization.internal.s sVar = hVar2.a;
                    if (iIntValue < 64) {
                        sVar.c |= 1 << iIntValue;
                    } else {
                        int i2 = (iIntValue >>> 6) - 1;
                        long[] jArr = sVar.d;
                        jArr[i2] = jArr[i2] | (1 << (iIntValue & 63));
                    }
                }
            } else if (!zM2) {
                if (hVar2 != null) {
                    kotlinx.serialization.internal.s sVar2 = hVar2.a;
                    s0 s0Var = sVar2.b;
                    kotlinx.serialization.descriptors.e eVar2 = sVar2.a;
                    int iF = eVar2.f();
                    while (true) {
                        long j = sVar2.c;
                        long j2 = -1;
                        if (j == -1) {
                            if (iF <= 64) {
                                break;
                            }
                            long[] jArr2 = sVar2.d;
                            int length = jArr2.length;
                            loop1: while (i < length) {
                                int i3 = i + 1;
                                int i4 = i3 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i5 = iNumberOfTrailingZeros + i4;
                                        if (((Boolean) s0Var.invoke(eVar2, Integer.valueOf(i5))).booleanValue()) {
                                            jArr2[i] = j3;
                                            iIntValue = i5;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i3;
                                        j2 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        sVar2.c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) s0Var.invoke(eVar2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            iIntValue = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                }
            } else {
                m0Var.getClass();
                i.f(hVar, "object");
                throw null;
            }
        } else if (iOrdinal != 2) {
            boolean zM3 = hVar.M();
            if (hVar.e()) {
                int i6 = this.f;
                if (i6 != -1 && !zM3) {
                    androidx.fragment.app.h.x(hVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iIntValue = i6 + 1;
                this.f = iIntValue;
            } else if (zM3) {
                m0Var.getClass();
                i.f(hVar, "array");
                throw null;
            }
        } else {
            int i7 = this.f;
            boolean z = i7 % 2 != 0;
            if (!z) {
                hVar.j(':');
            } else if (i7 != -1) {
                zM = hVar.M();
            }
            if (hVar.e()) {
                if (z) {
                    int i8 = this.f;
                    int i9 = hVar.y;
                    if (i8 == -1) {
                        if (zM) {
                            androidx.fragment.app.h.x(hVar, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else if (!zM) {
                        androidx.fragment.app.h.x(hVar, "Expected comma after the key-value pair", i9, null, 4);
                        throw null;
                    }
                }
                iIntValue = this.f + 1;
                this.f = iIntValue;
            } else if (zM) {
                m0Var.getClass();
                i.f(hVar, "object");
                throw null;
            }
        }
        if (qVar != q.MAP) {
            x xVar = (x) hVar.z;
            ((int[]) xVar.A)[xVar.y] = iIntValue;
        }
        return iIntValue;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final kotlinx.serialization.encoding.b u(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return o.a(eVar) ? new f(this.d, this.b) : this;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.a
    public final Object w(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        x xVar = (x) this.d.z;
        eVar.getClass();
        aVar.getClass();
        boolean z = this.c == q.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) xVar.A;
            int i2 = xVar.y;
            if (iArr[i2] == -2) {
                ((Object[]) xVar.z)[i2] = j.a;
            }
        }
        Object objP = p(aVar);
        if (z) {
            int[] iArr2 = (int[]) xVar.A;
            int i3 = xVar.y;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                xVar.y = i4;
                Object[] objArr = (Object[]) xVar.z;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    xVar.z = Arrays.copyOf(objArr, i5);
                    xVar.A = Arrays.copyOf((int[]) xVar.A, i5);
                }
            }
            Object[] objArr2 = (Object[]) xVar.z;
            int i6 = xVar.y;
            objArr2[i6] = objP;
            ((int[]) xVar.A)[i6] = -2;
        }
        return objP;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final byte y() {
        androidx.fragment.app.h hVar = this.d;
        long jK = hVar.k();
        byte b = (byte) jK;
        if (jK == b) {
            return b;
        }
        androidx.fragment.app.h.x(hVar, "Failed to parse byte for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final short z() {
        androidx.fragment.app.h hVar = this.d;
        long jK = hVar.k();
        short s = (short) jK;
        if (jK == s) {
            return s;
        }
        androidx.fragment.app.h.x(hVar, "Failed to parse short for input '" + jK + '\'', 0, null, 6);
        throw null;
    }
}
