package androidx.media3.common;

import android.text.TextUtils;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final h E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final com.google.common.collect.h0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final h0 l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final m s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new q().a();
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
        androidx.media3.common.util.j0.K(3);
        androidx.media3.common.util.j0.K(4);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(5, 6, 7, 8, 9);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(10, 11, 12, 13, 14);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(15, 16, 17, 18, 19);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(20, 21, 22, 23, 24);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(25, 26, 27, 28, 29);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(30, 31, 32, 33, 34);
        androidx.media3.common.util.j0.K(35);
        androidx.media3.common.util.j0.K(36);
        androidx.media3.common.util.j0.K(37);
    }

    public r(q qVar) {
        boolean z;
        String str;
        this.a = qVar.a;
        String strR = androidx.media3.common.util.j0.R(qVar.d);
        this.d = strR;
        if (qVar.c.isEmpty() && qVar.b != null) {
            this.c = com.google.common.collect.h0.s(new t(strR, qVar.b));
            this.b = qVar.b;
        } else if (qVar.c.isEmpty() || qVar.b != null) {
            if (!qVar.c.isEmpty() || qVar.b != null) {
                int i = 0;
                while (true) {
                    if (i >= qVar.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((t) qVar.c.get(i)).b.equals(qVar.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            com.google.android.material.motion.a.q(z);
            this.c = qVar.c;
            this.b = qVar.b;
        } else {
            com.google.common.collect.h0 h0Var = qVar.c;
            this.c = h0Var;
            Iterator it = h0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((t) h0Var.get(0)).b;
                    break;
                }
                t tVar = (t) it.next();
                if (TextUtils.equals(tVar.a, strR)) {
                    str = tVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = qVar.e;
        com.google.android.material.motion.a.p("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", qVar.g == 0 || (qVar.f & 32768) != 0);
        this.f = qVar.f;
        this.g = qVar.g;
        int i2 = qVar.h;
        this.h = i2;
        int i3 = qVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = qVar.j;
        this.l = qVar.k;
        this.m = qVar.l;
        this.n = qVar.m;
        this.o = qVar.n;
        this.p = qVar.o;
        this.q = qVar.p;
        List list = qVar.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        m mVar = qVar.r;
        this.s = mVar;
        this.t = qVar.s;
        this.u = qVar.t;
        this.v = qVar.u;
        this.w = qVar.v;
        this.x = qVar.w;
        this.y = qVar.x;
        this.z = qVar.y;
        int i4 = qVar.z;
        this.A = i4 == -1 ? 0 : i4;
        float f = qVar.A;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = qVar.B;
        this.D = qVar.C;
        this.E = qVar.D;
        this.F = qVar.E;
        this.G = qVar.F;
        this.H = qVar.G;
        this.I = qVar.H;
        int i5 = qVar.I;
        this.J = i5 == -1 ? 0 : i5;
        int i6 = qVar.J;
        this.K = i6 != -1 ? i6 : 0;
        this.L = qVar.K;
        this.M = qVar.L;
        this.N = qVar.M;
        this.O = qVar.N;
        int i7 = qVar.O;
        if (i7 != 0 || mVar == null) {
            this.P = i7;
        } else {
            this.P = 1;
        }
    }

    public static String c(r rVar) {
        int i;
        String str;
        String str2;
        if (rVar == null) {
            return "null";
        }
        int i2 = rVar.e;
        com.google.common.collect.h0 h0Var = rVar.c;
        String str3 = rVar.d;
        int i3 = rVar.H;
        int i4 = rVar.G;
        int i5 = rVar.F;
        float f = rVar.z;
        h hVar = rVar.E;
        float f2 = rVar.B;
        int i6 = rVar.y;
        int i7 = rVar.x;
        int i8 = rVar.w;
        int i9 = rVar.v;
        m mVar = rVar.s;
        String str4 = rVar.k;
        int i10 = rVar.j;
        String str5 = rVar.m;
        String str6 = rVar.n;
        int i11 = rVar.f;
        androidx.media3.container.a aVar = new androidx.media3.container.a(String.valueOf(','));
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("id=");
        sbN.append(rVar.a);
        sbN.append(", mimeType=");
        sbN.append(rVar.o);
        if (str6 != null) {
            sbN.append(", container=");
            sbN.append(str6);
        }
        if (str5 != null) {
            sbN.append(", primaryGroupId=");
            sbN.append(str5);
        }
        if (i10 != -1) {
            sbN.append(", bitrate=");
            sbN.append(i10);
        }
        if (str4 != null) {
            sbN.append(", codecs=");
            sbN.append(str4);
        }
        if (mVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < mVar.A; i12++) {
                UUID uuid = mVar.e[i12].y;
                if (uuid.equals(g.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(g.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(g.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(g.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(g.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbN.append(", drm=[");
            aVar.b(sbN, linkedHashSet.iterator());
            sbN.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            sbN.append(", res=");
            sbN.append(i9);
            sbN.append("x");
            sbN.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            sbN.append(", decRes=");
            sbN.append(i7);
            sbN.append("x");
            sbN.append(i6);
        }
        double d = f2;
        int i13 = com.google.common.math.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbN.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = androidx.media3.common.util.j0.a;
            sbN.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (hVar != null) {
            int i14 = hVar.f;
            int i15 = hVar.e;
            if ((i15 != -1 && i14 != -1) || hVar.d()) {
                sbN.append(", color=");
                if (hVar.d()) {
                    String strB = h.b(hVar.a);
                    String strA = h.a(hVar.b);
                    String strC = h.c(hVar.c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbN.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            sbN.append(", fps=");
            sbN.append(f);
        }
        if (i5 != -1) {
            sbN.append(", maxSubLayers=");
            sbN.append(i5);
        }
        if (i4 != -1) {
            sbN.append(", channels=");
            sbN.append(i4);
        }
        if (i3 != -1) {
            sbN.append(", sample_rate=");
            sbN.append(i3);
        }
        if (str3 != null) {
            sbN.append(", language=");
            sbN.append(str3);
        }
        if (!h0Var.isEmpty()) {
            sbN.append(", labels=[");
            aVar.b(sbN, com.google.common.collect.q.w(h0Var, new p(0)).iterator());
            sbN.append("]");
        }
        if (i2 != 0) {
            sbN.append(", selectionFlags=[");
            String str8 = androidx.media3.common.util.j0.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            aVar.b(sbN, arrayList.iterator());
            sbN.append("]");
        }
        if (i11 != 0) {
            sbN.append(", roleFlags=[");
            String str9 = androidx.media3.common.util.j0.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            aVar.b(sbN, arrayList2.iterator());
            sbN.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbN.append(", auxiliaryTrackType=");
            int i16 = rVar.g;
            String str10 = androidx.media3.common.util.j0.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    net.luminis.tls.engine.impl.c.r("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbN.append(str);
        }
        return sbN.toString();
    }

    public final q a() {
        q qVar = new q();
        qVar.a = this.a;
        qVar.b = this.b;
        qVar.c = this.c;
        qVar.d = this.d;
        qVar.e = this.e;
        qVar.f = this.f;
        qVar.h = this.h;
        qVar.i = this.i;
        qVar.j = this.k;
        qVar.k = this.l;
        qVar.l = this.m;
        qVar.m = this.n;
        qVar.n = this.o;
        qVar.o = this.p;
        qVar.p = this.q;
        qVar.q = this.r;
        qVar.r = this.s;
        qVar.s = this.t;
        qVar.t = this.u;
        qVar.u = this.v;
        qVar.v = this.w;
        qVar.w = this.x;
        qVar.x = this.y;
        qVar.y = this.z;
        qVar.z = this.A;
        qVar.A = this.B;
        qVar.B = this.C;
        qVar.C = this.D;
        qVar.D = this.E;
        qVar.E = this.F;
        qVar.F = this.G;
        qVar.G = this.H;
        qVar.H = this.I;
        qVar.I = this.J;
        qVar.J = this.K;
        qVar.K = this.L;
        qVar.L = this.M;
        qVar.M = this.N;
        qVar.N = this.O;
        qVar.O = this.P;
        return qVar;
    }

    public final boolean b(r rVar) {
        List list = this.r;
        if (list.size() != rVar.r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) rVar.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final r d(r rVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == rVar) {
            return this;
        }
        int i3 = i0.i(this.o);
        String str3 = rVar.a;
        com.google.common.collect.h0 h0Var = rVar.c;
        int i4 = rVar.N;
        int i5 = rVar.O;
        String str4 = rVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (h0Var.isEmpty()) {
            h0Var = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = rVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = rVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = rVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strW = androidx.media3.common.util.j0.w(i3, rVar.k);
            if (androidx.media3.common.util.j0.b0(strW).length == 1) {
                str5 = strW;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = rVar.m;
        }
        h0 h0VarB = rVar.l;
        h0 h0Var2 = this.l;
        if (h0Var2 != null) {
            h0VarB = h0Var2.b(h0VarB);
        }
        float f = this.z;
        if (f == -1.0f && i3 == 2) {
            f = rVar.z;
        }
        int i8 = this.e | rVar.e;
        com.google.common.collect.h0 h0Var3 = h0Var;
        int i9 = rVar.f | this.f;
        m mVar = rVar.s;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            String str7 = mVar.z;
            l[] lVarArr = mVar.e;
            int length = lVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                l lVar = lVarArr[i11];
                int i12 = length;
                if (lVar.B != null) {
                    arrayList.add(lVar);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        m mVar2 = this.s;
        if (mVar2 != null) {
            if (str2 == null) {
                str2 = mVar2.z;
            }
            int size = arrayList.size();
            l[] lVarArr2 = mVar2.e;
            String str8 = str2;
            int length2 = lVarArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                l lVar2 = lVarArr2[i14];
                int i15 = length2;
                if (lVar2.B != null) {
                    UUID uuid = lVar2.y;
                    i2 = i4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(lVar2);
                            break;
                        }
                        i = size;
                        if (((l) arrayList.get(i16)).y.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i13 = i14 + 1;
                length2 = i15;
                i4 = i2;
                size = i;
            }
            str2 = str8;
        }
        int i17 = i4;
        m mVar3 = arrayList.isEmpty() ? null : new m(str2, arrayList);
        q qVarA = a();
        qVarA.a = str3;
        qVarA.b = str4;
        qVarA.c = com.google.common.collect.h0.o(h0Var3);
        qVarA.d = str;
        qVarA.e = i8;
        qVarA.f = i9;
        qVarA.h = i6;
        qVarA.i = i7;
        qVarA.j = str5;
        qVarA.k = h0VarB;
        qVarA.l = str6;
        qVarA.r = mVar3;
        qVarA.y = f;
        qVarA.M = i17;
        qVarA.N = i5;
        return new r(qVarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = rVar.Q) == 0 || i2 == i) && this.e == rVar.e && this.f == rVar.f && this.g == rVar.g && this.h == rVar.h && this.i == rVar.i && this.p == rVar.p && this.t == rVar.t && this.v == rVar.v && this.w == rVar.w && this.x == rVar.x && this.y == rVar.y && this.A == rVar.A && this.D == rVar.D && this.F == rVar.F && this.G == rVar.G && this.H == rVar.H && this.I == rVar.I && this.J == rVar.J && this.K == rVar.K && this.L == rVar.L && this.N == rVar.N && this.O == rVar.O && this.P == rVar.P && Float.compare(this.z, rVar.z) == 0 && Float.compare(this.B, rVar.B) == 0 && Objects.equals(this.a, rVar.a) && Objects.equals(this.b, rVar.b) && this.c.equals(rVar.c) && Objects.equals(this.k, rVar.k) && Objects.equals(this.m, rVar.m) && Objects.equals(this.n, rVar.n) && Objects.equals(this.o, rVar.o) && Objects.equals(this.d, rVar.d) && Arrays.equals(this.C, rVar.C) && Objects.equals(this.l, rVar.l) && Objects.equals(this.E, rVar.E) && Objects.equals(this.s, rVar.s) && b(rVar);
    }

    public final int hashCode() {
        if (this.Q == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            h0 h0Var = this.l;
            int iHashCode5 = (iHashCode4 + (h0Var == null ? 0 : h0Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.o;
            this.Q = ((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.E);
        sb.append("], [");
        sb.append(this.G);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.H, "])", sb);
    }
}
