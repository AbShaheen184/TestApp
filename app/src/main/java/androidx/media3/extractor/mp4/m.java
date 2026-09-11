package androidx.media3.extractor.mp4;

import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.g0;
import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.i0;
import androidx.media3.extractor.v;
import androidx.media3.extractor.y;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.media3.extractor.n {
    public androidx.media3.extractor.p A;
    public l[] B;
    public long[][] C;
    public int D;
    public final androidx.media3.extractor.text.j a;
    public final int b;
    public final boolean c = false;
    public final w d;
    public final w e;
    public final w f;
    public final w g;
    public final ArrayDeque h;
    public final p i;
    public final ArrayList j;
    public a1 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public w p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public m(androidx.media3.extractor.text.j jVar, int i) {
        this.a = jVar;
        this.b = i;
        e0 e0Var = h0.y;
        this.k = a1.B;
        this.l = 0;
        this.i = new p();
        this.j = new ArrayList();
        this.g = new w(16);
        this.h = new ArrayDeque();
        this.d = new w(androidx.media3.container.r.a);
        this.e = new w(6);
        this.f = new w();
        this.q = -1;
        this.A = androidx.media3.extractor.p.f;
        this.B = new l[0];
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        a1 a1VarS;
        androidx.media3.extractor.e0 e0VarK = q.k(oVar, false, false);
        if (e0VarK != null) {
            a1VarS = h0.s(e0VarK);
        } else {
            e0 e0Var = h0.y;
            a1VarS = a1.B;
        }
        this.k = a1VarS;
        return e0VarK == null;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.y = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                p pVar = this.i;
                pVar.a.clear();
                pVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (l lVar : this.B) {
            u uVar = lVar.b;
            int iA = uVar.a(j2);
            if (iA == -1) {
                iA = uVar.b(j2);
            }
            lVar.e = iA;
            i0 i0Var = lVar.d;
            if (i0Var != null) {
                i0Var.b = false;
                i0Var.c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:276:0x0578  */
    /* JADX WARN: Code duplicated, block: B:281:0x058c  */
    /* JADX WARN: Code duplicated, block: B:293:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:294:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:296:0x05da  */
    /* JADX WARN: Code duplicated, block: B:303:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:306:0x0604  */
    /* JADX WARN: Code duplicated, block: B:328:0x0643  */
    /* JADX WARN: Code duplicated, block: B:376:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:381:0x0716  */
    /* JADX WARN: Code duplicated, block: B:382:0x071a  */
    /* JADX WARN: Code duplicated, block: B:388:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0167 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) throws j0 {
        char c;
        int i;
        int i2;
        int i3;
        int iG;
        int i4;
        int iM;
        int i5;
        byte b;
        char c2;
        int i6;
        ArrayList arrayList;
        List listD;
        int i7;
        List listD2;
        boolean z;
        boolean z2;
        long j;
        long length;
        androidx.media3.container.d dVar;
        long j2;
        long j3;
        int i8;
        boolean z3;
        long j4;
        long j5;
        long j6;
        boolean z4;
        if (!this.c || !this.y) {
            while (true) {
                int i9 = this.l;
                ArrayDeque arrayDeque = this.h;
                w wVar = this.f;
                if (i9 != 0) {
                    int i10 = 4;
                    int i11 = 2;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            long position = oVar.getPosition();
                            if (this.q == -1) {
                                int i12 = 0;
                                int i13 = -1;
                                int i14 = -1;
                                boolean z5 = true;
                                boolean z6 = true;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                while (true) {
                                    l[] lVarArr = this.B;
                                    if (i12 >= lVarArr.length) {
                                        break;
                                    }
                                    l lVar = lVarArr[i12];
                                    int i15 = lVar.e;
                                    u uVar = lVar.b;
                                    if (i15 != uVar.b) {
                                        long j10 = uVar.c[i15];
                                        long[][] jArr = this.C;
                                        jArr.getClass();
                                        long j11 = jArr[i12][i15];
                                        long j12 = j10 - position;
                                        boolean z7 = j12 < 0 || j12 >= 262144;
                                        if ((!z7 && z6) || (z7 == z6 && j12 < j9)) {
                                            z6 = z7;
                                            i14 = i12;
                                            j9 = j12;
                                            j8 = j11;
                                        }
                                        if (j11 < j7) {
                                            z5 = z7;
                                            i13 = i12;
                                            j7 = j11;
                                        }
                                    }
                                    i12++;
                                }
                                if (j7 == Long.MAX_VALUE || !z5 || j8 < j7 + 10485760) {
                                    i13 = i14;
                                }
                                this.q = i13;
                                if (i13 == -1) {
                                    return -1;
                                }
                            }
                            l lVar2 = this.B[this.q];
                            androidx.media3.extractor.h0 h0Var = lVar2.c;
                            u uVar2 = lVar2.b;
                            r rVar2 = lVar2.a;
                            int i16 = lVar2.e;
                            long[] jArr2 = uVar2.c;
                            int[] iArr = uVar2.d;
                            long j13 = jArr2[i16] + this.z;
                            int i17 = iArr[i16];
                            i0 i0Var = lVar2.d;
                            int i18 = 0;
                            long j14 = (j13 - position) + ((long) this.r);
                            if (j14 < 0 || j14 >= 262144) {
                                rVar.a = j13;
                                return 1;
                            }
                            int i19 = rVar2.h;
                            int i20 = rVar2.k;
                            androidx.media3.common.r rVar3 = rVar2.g;
                            if (i19 == 1) {
                                j14 += 8;
                                i17 -= 8;
                            }
                            int i21 = i17;
                            oVar.r((int) j14);
                            String str = rVar3.o;
                            String str2 = rVar3.o;
                            boolean zEquals = Objects.equals(str, "video/avc");
                            int i22 = this.b;
                            if (!zEquals ? !Objects.equals(str2, "video/hevc") || (i22 & 128) == 0 : (i22 & 32) == 0) {
                                c = 1;
                                this.u = true;
                            } else {
                                c = 1;
                            }
                            if (i20 != 0) {
                                w wVar2 = this.e;
                                byte[] bArr = wVar2.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i23 = 4 - i20;
                                int i24 = i21 + i23;
                                while (this.s < i24) {
                                    int i25 = this.t;
                                    if (i25 == 0) {
                                        if (this.u) {
                                            i2 = i24;
                                        } else {
                                            i2 = i24;
                                            if (androidx.media3.container.r.g(rVar3) + i20 <= iArr[i16] - this.r) {
                                                iG = androidx.media3.container.r.g(rVar3);
                                                i3 = i20 + iG;
                                            }
                                            oVar.readFully(bArr, i23, i3);
                                            this.r += i3;
                                            i4 = i18;
                                            wVar2.M(i4);
                                            iM = wVar2.m();
                                            if (iM >= 0) {
                                                throw j0.a(null, "Invalid NAL length");
                                            }
                                            this.t = iM - iG;
                                            w wVar3 = this.d;
                                            wVar3.M(i4);
                                            h0Var.f(4, wVar3);
                                            this.s += 4;
                                            if (iG > 0) {
                                                h0Var.f(iG, wVar2);
                                                this.s += iG;
                                                if (androidx.media3.container.r.f(bArr, iG, rVar3)) {
                                                    this.u = true;
                                                }
                                            }
                                        }
                                        i3 = i20;
                                        iG = i18;
                                        oVar.readFully(bArr, i23, i3);
                                        this.r += i3;
                                        i4 = i18;
                                        wVar2.M(i4);
                                        iM = wVar2.m();
                                        if (iM >= 0) {
                                            throw j0.a(null, "Invalid NAL length");
                                        }
                                        this.t = iM - iG;
                                        w wVar4 = this.d;
                                        wVar4.M(i4);
                                        h0Var.f(4, wVar4);
                                        this.s += 4;
                                        if (iG > 0) {
                                            h0Var.f(iG, wVar2);
                                            this.s += iG;
                                            if (androidx.media3.container.r.f(bArr, iG, rVar3)) {
                                                this.u = true;
                                            }
                                        }
                                    } else {
                                        i2 = i24;
                                        int iA = h0Var.a(oVar, i25, i18);
                                        this.r += iA;
                                        this.s += iA;
                                        this.t -= iA;
                                    }
                                    i24 = i2;
                                    i18 = 0;
                                }
                                i = i24;
                            } else {
                                if ("audio/ac4".equals(str2)) {
                                    if (this.s == 0) {
                                        androidx.media3.extractor.b.f(i21, wVar);
                                        h0Var.f(7, wVar);
                                        this.s += 7;
                                    }
                                    i21 += 7;
                                } else if (lVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                    androidx.media3.common.r rVar4 = lVar2.f;
                                    wVar.J(4);
                                    oVar.x(wVar.a, 0, 4);
                                    oVar.n();
                                    y yVar = new y();
                                    androidx.media3.extractor.h0 h0Var2 = lVar2.c;
                                    if (yVar.a(wVar.m()) && !Objects.equals(rVar4.o, (String) yVar.g)) {
                                        androidx.media3.common.q qVarA = rVar4.a();
                                        String str3 = (String) yVar.g;
                                        str3.getClass();
                                        qVarA.n = androidx.media3.common.i0.p(str3);
                                        rVar4 = new androidx.media3.common.r(qVarA);
                                    }
                                    h0Var2.e(rVar4);
                                    lVar2.f = null;
                                } else if (i0Var != null) {
                                    i0Var.c(oVar);
                                }
                                while (true) {
                                    int i26 = this.s;
                                    if (i26 >= i21) {
                                        break;
                                    }
                                    int iA2 = h0Var.a(oVar, i21 - i26, false);
                                    this.r += iA2;
                                    this.s += iA2;
                                    this.t -= iA2;
                                }
                                i = i21;
                            }
                            long j15 = uVar2.f[i16];
                            int i27 = uVar2.g[i16];
                            if (!this.u) {
                                i27 |= 67108864;
                            }
                            int i28 = i27;
                            if (i0Var != null) {
                                i0Var.b(h0Var, j15, i28, i, 0, null);
                                if (i16 + 1 == uVar2.b) {
                                    i0Var.a(h0Var, null);
                                }
                            } else {
                                h0Var.g(j15, i28, i, 0, null);
                            }
                            lVar2.e++;
                            this.q = -1;
                            this.r = 0;
                            this.s = 0;
                            this.t = 0;
                            this.u = false;
                            return 0;
                        }
                        if (i9 != 3) {
                            org.mozilla.javascript.c.a();
                            return 0;
                        }
                        p pVar = this.i;
                        ArrayList arrayList2 = pVar.a;
                        int i29 = pVar.b;
                        if (i29 != 0) {
                            if (i29 != 1) {
                                char c3 = 2817;
                                int i30 = 8;
                                short s = 2816;
                                if (i29 == 2) {
                                    long length2 = oVar.getLength();
                                    int i31 = pVar.c - 20;
                                    w wVar5 = new w(i31);
                                    oVar.readFully(wVar5.a, 0, i31);
                                    int i32 = 0;
                                    while (i32 < i31 / 12) {
                                        wVar5.N(i11);
                                        wVar5.f(i11);
                                        byte[] bArr2 = wVar5.a;
                                        int i33 = wVar5.b;
                                        int i34 = i33 + 1;
                                        wVar5.b = i34;
                                        int i35 = i11;
                                        int i36 = bArr2[i33] & 255;
                                        wVar5.b = i33 + 2;
                                        short s2 = (short) (i36 | ((bArr2[i34] & 255) << 8));
                                        if (s2 != 2192 && s2 != s) {
                                            if (s2 != 2817) {
                                                if (s2 != 2819 && s2 != 2820) {
                                                    wVar5.N(i30);
                                                }
                                                i32++;
                                                i11 = i35;
                                                s = 2816;
                                                i30 = 8;
                                            }
                                            arrayList2.add(new o((length2 - ((long) pVar.c)) - ((long) wVar5.o()), wVar5.o()));
                                            i32++;
                                            i11 = i35;
                                            s = 2816;
                                            i30 = 8;
                                        }
                                        arrayList2.add(new o((length2 - ((long) pVar.c)) - ((long) wVar5.o()), wVar5.o()));
                                        i32++;
                                        i11 = i35;
                                        s = 2816;
                                        i30 = 8;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        rVar.a = 0L;
                                    } else {
                                        pVar.b = 3;
                                        rVar.a = ((o) arrayList2.get(0)).a;
                                    }
                                } else {
                                    if (i29 != 3) {
                                        org.mozilla.javascript.c.a();
                                        return 0;
                                    }
                                    long position2 = oVar.getPosition();
                                    int length3 = (int) ((oVar.getLength() - oVar.getPosition()) - ((long) pVar.c));
                                    w wVar6 = new w(length3);
                                    oVar.readFully(wVar6.a, 0, length3);
                                    int i37 = 0;
                                    while (i37 < arrayList2.size()) {
                                        o oVar2 = (o) arrayList2.get(i37);
                                        wVar6.M((int) (oVar2.a - position2));
                                        wVar6.N(i10);
                                        int iO = wVar6.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String strX = wVar6.x(iO, charset);
                                        switch (strX.hashCode()) {
                                            case -1711564334:
                                                if (strX.equals("SlowMotion_Data")) {
                                                    b = 0;
                                                }
                                                switch (b) {
                                                    case 0:
                                                        c2 = 2192;
                                                        break;
                                                    case 1:
                                                        c2 = 2819;
                                                        break;
                                                    case 2:
                                                        c2 = 2816;
                                                        break;
                                                    case 3:
                                                        c2 = 2820;
                                                        break;
                                                    case 4:
                                                        c2 = c3;
                                                        break;
                                                    default:
                                                        throw j0.a(null, "Invalid SEF name");
                                                }
                                                i6 = oVar2.b - (iO + 8);
                                                if (c2 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = p.e.d(wVar6.x(i6, charset));
                                                    for (i7 = 0; i7 < listD.size(); i7++) {
                                                        listD2 = p.d.d((CharSequence) listD.get(i7));
                                                        if (listD2.size() == 3) {
                                                            throw j0.a(null, null);
                                                        }
                                                        try {
                                                            arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                        } catch (NumberFormatException e) {
                                                            throw j0.a(e, null);
                                                        }
                                                    }
                                                    this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                                } else if (c2 != 2816 && c2 != c3 && c2 != 2819 && c2 != 2820) {
                                                    org.mozilla.javascript.c.a();
                                                    return 0;
                                                }
                                                i37++;
                                                c3 = 2817;
                                                i10 = 4;
                                                break;
                                            case -1332107749:
                                                if (strX.equals("Super_SlowMotion_Edit_Data")) {
                                                    b = 1;
                                                }
                                                switch (b) {
                                                    case 0:
                                                        c2 = 2192;
                                                        break;
                                                    case 1:
                                                        c2 = 2819;
                                                        break;
                                                    case 2:
                                                        c2 = 2816;
                                                        break;
                                                    case 3:
                                                        c2 = 2820;
                                                        break;
                                                    case 4:
                                                        c2 = c3;
                                                        break;
                                                    default:
                                                        throw j0.a(null, "Invalid SEF name");
                                                }
                                                i6 = oVar2.b - (iO + 8);
                                                if (c2 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = p.e.d(wVar6.x(i6, charset));
                                                    while (i7 < listD.size()) {
                                                        listD2 = p.d.d((CharSequence) listD.get(i7));
                                                        if (listD2.size() == 3) {
                                                            throw j0.a(null, null);
                                                        }
                                                        arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                                } else if (c2 != 2816) {
                                                    continue;
                                                }
                                                i37++;
                                                c3 = 2817;
                                                i10 = 4;
                                                break;
                                            case -1251387154:
                                                if (strX.equals("Super_SlowMotion_Data")) {
                                                    b = 2;
                                                }
                                                switch (b) {
                                                    case 0:
                                                        c2 = 2192;
                                                        break;
                                                    case 1:
                                                        c2 = 2819;
                                                        break;
                                                    case 2:
                                                        c2 = 2816;
                                                        break;
                                                    case 3:
                                                        c2 = 2820;
                                                        break;
                                                    case 4:
                                                        c2 = c3;
                                                        break;
                                                    default:
                                                        throw j0.a(null, "Invalid SEF name");
                                                }
                                                i6 = oVar2.b - (iO + 8);
                                                if (c2 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = p.e.d(wVar6.x(i6, charset));
                                                    while (i7 < listD.size()) {
                                                        listD2 = p.d.d((CharSequence) listD.get(i7));
                                                        if (listD2.size() == 3) {
                                                            throw j0.a(null, null);
                                                        }
                                                        arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                                } else if (c2 != 2816) {
                                                    continue;
                                                }
                                                i37++;
                                                c3 = 2817;
                                                i10 = 4;
                                                break;
                                            case -830665521:
                                                if (strX.equals("Super_SlowMotion_Deflickering_On")) {
                                                    b = 3;
                                                }
                                                switch (b) {
                                                    case 0:
                                                        c2 = 2192;
                                                        break;
                                                    case 1:
                                                        c2 = 2819;
                                                        break;
                                                    case 2:
                                                        c2 = 2816;
                                                        break;
                                                    case 3:
                                                        c2 = 2820;
                                                        break;
                                                    case 4:
                                                        c2 = c3;
                                                        break;
                                                    default:
                                                        throw j0.a(null, "Invalid SEF name");
                                                }
                                                i6 = oVar2.b - (iO + 8);
                                                if (c2 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = p.e.d(wVar6.x(i6, charset));
                                                    while (i7 < listD.size()) {
                                                        listD2 = p.d.d((CharSequence) listD.get(i7));
                                                        if (listD2.size() == 3) {
                                                            throw j0.a(null, null);
                                                        }
                                                        arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                                } else if (c2 != 2816) {
                                                    continue;
                                                }
                                                i37++;
                                                c3 = 2817;
                                                i10 = 4;
                                                break;
                                            case 1760745220:
                                                if (strX.equals("Super_SlowMotion_BGM")) {
                                                    b = 4;
                                                }
                                                switch (b) {
                                                    case 0:
                                                        c2 = 2192;
                                                        break;
                                                    case 1:
                                                        c2 = 2819;
                                                        break;
                                                    case 2:
                                                        c2 = 2816;
                                                        break;
                                                    case 3:
                                                        c2 = 2820;
                                                        break;
                                                    case 4:
                                                        c2 = c3;
                                                        break;
                                                    default:
                                                        throw j0.a(null, "Invalid SEF name");
                                                }
                                                i6 = oVar2.b - (iO + 8);
                                                if (c2 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = p.e.d(wVar6.x(i6, charset));
                                                    while (i7 < listD.size()) {
                                                        listD2 = p.d.d((CharSequence) listD.get(i7));
                                                        if (listD2.size() == 3) {
                                                            throw j0.a(null, null);
                                                        }
                                                        arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                                } else if (c2 != 2816) {
                                                    continue;
                                                }
                                                i37++;
                                                c3 = 2817;
                                                i10 = 4;
                                                break;
                                        }
                                        b = -1;
                                        switch (b) {
                                            case 0:
                                                c2 = 2192;
                                                break;
                                            case 1:
                                                c2 = 2819;
                                                break;
                                            case 2:
                                                c2 = 2816;
                                                break;
                                            case 3:
                                                c2 = 2820;
                                                break;
                                            case 4:
                                                c2 = c3;
                                                break;
                                            default:
                                                throw j0.a(null, "Invalid SEF name");
                                        }
                                        i6 = oVar2.b - (iO + 8);
                                        if (c2 != 2192) {
                                            arrayList = new ArrayList();
                                            listD = p.e.d(wVar6.x(i6, charset));
                                            while (i7 < listD.size()) {
                                                listD2 = p.d.d((CharSequence) listD.get(i7));
                                                if (listD2.size() == 3) {
                                                    throw j0.a(null, null);
                                                }
                                                arrayList.add(new androidx.media3.extractor.metadata.mp4.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                            }
                                            this.j.add(new androidx.media3.extractor.metadata.mp4.b(arrayList));
                                        } else if (c2 != 2816) {
                                            continue;
                                        }
                                        i37++;
                                        c3 = 2817;
                                        i10 = 4;
                                    }
                                    rVar.a = 0L;
                                }
                            } else {
                                w wVar7 = new w(8);
                                oVar.readFully(wVar7.a, 0, 8);
                                pVar.c = wVar7.o() + 8;
                                if (wVar7.m() != 1397048916) {
                                    rVar.a = 0L;
                                } else {
                                    rVar.a = oVar.getPosition() - ((long) (pVar.c - 12));
                                    pVar.b = 2;
                                }
                            }
                            i5 = 1;
                        } else {
                            long length4 = oVar.getLength();
                            rVar.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i5 = 1;
                            pVar.b = 1;
                        }
                        if (rVar.a != 0) {
                            return i5;
                        }
                        this.l = 0;
                        this.o = 0;
                        return i5;
                    }
                    long j16 = this.n - ((long) this.o);
                    long position3 = oVar.getPosition() + j16;
                    w wVar8 = this.p;
                    if (wVar8 != null) {
                        oVar.readFully(wVar8.a, this.o, (int) j16);
                        if (this.m == 1718909296) {
                            this.v = true;
                            wVar8.M(8);
                            int iM2 = wVar8.m();
                            int i38 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i38 == 0) {
                                wVar8.N(4);
                                do {
                                    if (wVar8.a() <= 0) {
                                        i38 = 0;
                                        break;
                                    }
                                    int iM3 = wVar8.m();
                                    i38 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i38 == 0);
                            }
                            this.D = i38;
                        } else if (!arrayDeque.isEmpty()) {
                            ((androidx.media3.container.d) arrayDeque.peek()).A.add(new androidx.media3.container.e(this.m, wVar8));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.D = 1;
                        }
                        if (j16 < 262144) {
                            oVar.r((int) j16);
                        } else {
                            rVar.a = oVar.getPosition() + j16;
                            z = true;
                        }
                        f(position3);
                        if (this.w) {
                            this.x = true;
                            rVar.a = 0L;
                            this.w = false;
                            z = true;
                        }
                        if (z || this.l == 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            return 1;
                        }
                    }
                    z = false;
                    f(position3);
                    if (this.w) {
                        this.x = true;
                        rVar.a = 0L;
                        this.w = false;
                        z = true;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return 1;
                    }
                } else {
                    int i39 = this.o;
                    w wVar9 = this.g;
                    if (i39 != 0) {
                        j = this.n;
                        if (j == 1) {
                            oVar.readFully(wVar9.a, 8, 8);
                            this.o += 8;
                            this.n = wVar9.F();
                        } else if (j == 0) {
                            length = oVar.getLength();
                            if (length == -1 && (dVar = (androidx.media3.container.d) arrayDeque.peek()) != null) {
                                length = dVar.z;
                            }
                            if (length != -1) {
                                this.n = (length - oVar.getPosition()) + ((long) this.o);
                            }
                        }
                        j2 = this.n;
                        int i40 = this.o;
                        j3 = i40;
                        if (j2 < j3) {
                            if (this.m == 1718773093 || i40 != 8) {
                                throw j0.c("Atom size less than header length (unsupported).");
                            }
                            this.n = j3;
                        }
                        i8 = this.m;
                        if (i8 != 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1701082227 || i8 == 1835365473 || i8 == 1635284069) {
                            z3 = true;
                            long position4 = oVar.getPosition();
                            j4 = this.n;
                            j5 = this.o;
                            j6 = (position4 + j4) - j5;
                            if (j4 != j5 && this.m == 1835365473) {
                                wVar.J(8);
                                oVar.x(wVar.a, 0, 8);
                                e.a(wVar);
                                oVar.r(wVar.b);
                                oVar.n();
                            }
                            arrayDeque.push(new androidx.media3.container.d(this.m, j6));
                            if (this.n == this.o) {
                                f(j6);
                            } else {
                                this.l = 0;
                                this.o = 0;
                            }
                        } else if (i8 == 1835296868 || i8 == 1836476516 || i8 == 1751411826 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1937011571 || i8 == 1668576371 || i8 == 1701606260 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1953196132 || i8 == 1718909296 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                            com.google.android.material.motion.a.q(i40 == 8);
                            com.google.android.material.motion.a.q(this.n <= 2147483647L);
                            w wVar10 = new w((int) this.n);
                            System.arraycopy(wVar9.a, 0, wVar10.a, 0, 8);
                            this.p = wVar10;
                            z3 = true;
                            this.l = 1;
                        } else {
                            oVar.getPosition();
                            this.p = null;
                            z3 = true;
                            this.l = 1;
                        }
                        z4 = z3;
                    } else if (oVar.b(wVar9.a, 0, 8, true)) {
                        this.o = 8;
                        wVar9.M(0);
                        this.n = wVar9.B();
                        this.m = wVar9.m();
                        j = this.n;
                        if (j == 1) {
                            oVar.readFully(wVar9.a, 8, 8);
                            this.o += 8;
                            this.n = wVar9.F();
                        } else if (j == 0) {
                            length = oVar.getLength();
                            if (length == -1) {
                                length = dVar.z;
                            }
                            if (length != -1) {
                                this.n = (length - oVar.getPosition()) + ((long) this.o);
                            }
                        }
                        j2 = this.n;
                        int i41 = this.o;
                        j3 = i41;
                        if (j2 < j3) {
                            if (this.m == 1718773093) {
                            }
                            throw j0.c("Atom size less than header length (unsupported).");
                        }
                        i8 = this.m;
                        if (i8 != 1836019574) {
                            z3 = true;
                            long position5 = oVar.getPosition();
                            j4 = this.n;
                            j5 = this.o;
                            j6 = (position5 + j4) - j5;
                            if (j4 != j5) {
                                wVar.J(8);
                                oVar.x(wVar.a, 0, 8);
                                e.a(wVar);
                                oVar.r(wVar.b);
                                oVar.n();
                            }
                            arrayDeque.push(new androidx.media3.container.d(this.m, j6));
                            if (this.n == this.o) {
                                f(j6);
                            } else {
                                this.l = 0;
                                this.o = 0;
                            }
                        } else {
                            z3 = true;
                            long position6 = oVar.getPosition();
                            j4 = this.n;
                            j5 = this.o;
                            j6 = (position6 + j4) - j5;
                            if (j4 != j5) {
                                wVar.J(8);
                                oVar.x(wVar.a, 0, 8);
                                e.a(wVar);
                                oVar.r(wVar.b);
                                oVar.n();
                            }
                            arrayDeque.push(new androidx.media3.container.d(this.m, j6));
                            if (this.n == this.o) {
                                f(j6);
                            } else {
                                this.l = 0;
                                this.o = 0;
                            }
                        }
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                    }
                }
            }
        }
        return -1;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        if ((this.b & 16) == 0) {
            pVar = new b1(pVar, this.a);
        }
        this.A = pVar;
    }

    @Override // androidx.media3.extractor.n
    public final List e() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:146:0x02da  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0300  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    public final void f(long j) {
        androidx.media3.common.h0 h0VarF;
        androidx.media3.common.h0 h0VarK;
        long[][] jArr;
        String str;
        int i;
        long j2;
        int i2;
        androidx.media3.common.h0 h0Var;
        ArrayList arrayList;
        androidx.media3.common.h0 h0Var2;
        androidx.media3.common.h0 h0Var3;
        androidx.media3.common.h0 h0Var4;
        ArrayList arrayList2;
        int i3;
        int i4;
        int i5;
        int i6;
        g0 g0Var;
        g0 g0Var2;
        int i7;
        while (true) {
            ArrayDeque arrayDeque = this.h;
            if (arrayDeque.isEmpty() || ((androidx.media3.container.d) arrayDeque.peek()).z != j) {
                break;
            }
            androidx.media3.container.d dVar = (androidx.media3.container.d) arrayDeque.pop();
            if (dVar.y == 1836019574) {
                androidx.media3.container.d dVarO = dVar.o(1835365473);
                ArrayList arrayList3 = new ArrayList();
                if (dVarO != null) {
                    h0VarF = e.f(dVarO);
                    if (this.x) {
                        h0VarF.getClass();
                        g0[] g0VarArr = h0VarF.a;
                        int length = g0VarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                g0Var = null;
                                break;
                            }
                            g0 g0Var3 = g0VarArr[i8];
                            if (androidx.media3.container.b.class.isAssignableFrom(g0Var3.getClass())) {
                                g0Var = (g0) androidx.media3.container.b.class.cast(g0Var3);
                                if (!((androidx.media3.container.b) g0Var).a.equals("auxiliary.tracks.interleaved")) {
                                    g0Var = null;
                                }
                            } else {
                                g0Var = null;
                            }
                            if (g0Var != null) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        androidx.media3.container.b bVar = (androidx.media3.container.b) g0Var;
                        if (bVar != null && bVar.b[0] == 0) {
                            this.z = 16 + 0;
                        }
                        int length2 = g0VarArr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length2) {
                                g0Var2 = null;
                                break;
                            }
                            g0 g0Var4 = g0VarArr[i9];
                            if (androidx.media3.container.b.class.isAssignableFrom(g0Var4.getClass())) {
                                g0Var2 = (g0) androidx.media3.container.b.class.cast(g0Var4);
                                if (!((androidx.media3.container.b) g0Var2).a.equals("auxiliary.tracks.map")) {
                                    g0Var2 = null;
                                }
                            } else {
                                g0Var2 = null;
                            }
                            if (g0Var2 != null) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        androidx.media3.container.b bVar2 = (androidx.media3.container.b) g0Var2;
                        bVar2.getClass();
                        ArrayList arrayListD = bVar2.d();
                        ArrayList arrayList4 = new ArrayList(arrayListD.size());
                        for (int i10 = 0; i10 < arrayListD.size(); i10++) {
                            int iIntValue = ((Integer) arrayListD.get(i10)).intValue();
                            if (iIntValue == 0) {
                                i7 = 1;
                            } else if (iIntValue != 1) {
                                i7 = 3;
                                if (iIntValue != 2) {
                                    i7 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i7 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i7));
                        }
                        arrayList3 = arrayList4;
                    }
                } else {
                    h0VarF = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z = this.D == 1;
                ArrayList arrayList6 = arrayList3;
                v vVar = new v();
                androidx.media3.container.e eVarP = dVar.p(1969517665);
                if (eVarP != null) {
                    h0VarK = e.k(eVarP);
                    vVar.b(h0VarK);
                } else {
                    h0VarK = null;
                }
                androidx.media3.container.e eVarP2 = dVar.p(1836476516);
                eVarP2.getClass();
                androidx.media3.common.h0 h0Var5 = new androidx.media3.common.h0(e.g(eVarP2.z));
                ArrayList arrayList7 = arrayList5;
                androidx.media3.common.h0 h0Var6 = h0VarK;
                ArrayList arrayListJ = e.j(dVar, vVar, -9223372036854775807L, null, false, z, new androidx.media3.common.p(11), this.c);
                if (this.x) {
                    boolean z2 = arrayList6.size() == arrayListJ.size();
                    Locale locale = Locale.US;
                    com.google.android.material.motion.a.p("The number of auxiliary track types from metadata (" + arrayList6.size() + ") is not same as the number of auxiliary tracks (" + arrayListJ.size() + ")", z2);
                }
                String strB = q.b(arrayListJ);
                int i11 = 0;
                long j3 = -9223372036854775807L;
                int size = -1;
                for (int i12 = 0; i12 < arrayListJ.size(); i12 = i + 1) {
                    u uVar = (u) arrayListJ.get(i12);
                    int i13 = uVar.b;
                    long[] jArr2 = uVar.f;
                    ArrayDeque arrayDeque2 = arrayDeque;
                    r rVar = uVar.a;
                    if (i13 == 0) {
                        str = strB;
                        i = i12;
                        h0Var3 = h0Var5;
                        h0Var4 = h0VarF;
                        arrayList2 = arrayList7;
                    } else {
                        androidx.media3.extractor.p pVar = this.A;
                        int i14 = i11 + 1;
                        str = strB;
                        int i15 = rVar.b;
                        androidx.media3.common.h0 h0Var7 = h0VarF;
                        androidx.media3.common.r rVar2 = rVar.g;
                        androidx.media3.extractor.h0 h0VarU = pVar.u(i11, i15);
                        l lVar = new l(rVar, uVar, h0VarU);
                        androidx.media3.common.h0 h0Var8 = h0Var6;
                        long j4 = rVar.e;
                        if (j4 == -9223372036854775807L) {
                            j4 = uVar.i;
                        }
                        h0VarU.d(j4);
                        long jMax = Math.max(j3, j4);
                        String str2 = rVar2.o;
                        String str3 = rVar2.o;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i16 = uVar.e;
                        int i17 = zEquals ? i16 * 16 : i16 + 30;
                        androidx.media3.common.q qVarA = rVar2.a();
                        qVarA.o = i17;
                        if (i15 == 2) {
                            int i18 = rVar2.f;
                            if ((this.b & 8) != 0) {
                                i18 |= size == -1 ? 1 : 2;
                            }
                            if (this.x) {
                                i18 |= 32768;
                                qVarA.g = ((Integer) arrayList6.get(i12)).intValue();
                            }
                            qVarA.f = i18;
                        }
                        int[] iArr = uVar.h;
                        boolean z3 = uVar.j;
                        if (androidx.media3.common.i0.o(str3)) {
                            i = i12;
                            if (jArr2.length > 0) {
                                int iMin = Math.min(z3 ? uVar.b : iArr.length, 20);
                                com.google.android.material.motion.a.q(j4 != -9223372036854775807L);
                                long jMin = Math.min(j4, 10000000L);
                                int i19 = 0;
                                int i20 = -1;
                                for (int i21 = 0; i21 < iMin; i21++) {
                                    int i22 = z3 ? i21 : iArr[i21];
                                    long j5 = jArr2[i22];
                                    if (j5 > jMin) {
                                        break;
                                    }
                                    if (j5 >= 0 && (i6 = uVar.d[(i5 = i22)]) > i19) {
                                        i19 = i6;
                                        i20 = i5;
                                    }
                                }
                                if (i20 != -1) {
                                    j2 = jArr2[i20];
                                }
                            }
                            if (j2 != -9223372036854775807L) {
                                i2 = 1;
                                h0Var = new androidx.media3.common.h0(new androidx.media3.extractor.metadata.c(j2));
                            } else {
                                i2 = 1;
                                h0Var = null;
                            }
                            if (i15 == i2 && (i3 = vVar.a) != -1 && (i4 = vVar.b) != -1) {
                                qVarA.I = i3;
                                qVarA.J = i4;
                            }
                            androidx.media3.common.h0 h0Var9 = rVar2.l;
                            arrayList = this.j;
                            if (arrayList.isEmpty()) {
                                h0Var2 = null;
                            } else {
                                h0Var2 = new androidx.media3.common.h0(arrayList);
                            }
                            h0Var6 = h0Var8;
                            h0Var3 = h0Var5;
                            h0Var4 = h0Var7;
                            q.j(i15, h0Var4, qVarA, h0Var9, h0Var2, h0Var6, h0Var3, h0Var);
                            qVarA.m = androidx.media3.common.i0.p(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                lVar.f = new androidx.media3.common.r(qVarA);
                            } else {
                                lVar.c.e(new androidx.media3.common.r(qVarA));
                            }
                            if (i15 == 2 && size == -1) {
                                size = arrayList7.size();
                            }
                            arrayList2 = arrayList7;
                            arrayList2.add(lVar);
                            i11 = i14;
                            j3 = jMax;
                        } else {
                            i = i12;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            i2 = 1;
                            h0Var = new androidx.media3.common.h0(new androidx.media3.extractor.metadata.c(j2));
                        } else {
                            i2 = 1;
                            h0Var = null;
                        }
                        if (i15 == i2) {
                            qVarA.I = i3;
                            qVarA.J = i4;
                        }
                        androidx.media3.common.h0 h0Var10 = rVar2.l;
                        arrayList = this.j;
                        if (arrayList.isEmpty()) {
                            h0Var2 = null;
                        } else {
                            h0Var2 = new androidx.media3.common.h0(arrayList);
                        }
                        h0Var6 = h0Var8;
                        h0Var3 = h0Var5;
                        h0Var4 = h0Var7;
                        q.j(i15, h0Var4, qVarA, h0Var10, h0Var2, h0Var6, h0Var3, h0Var);
                        qVarA.m = androidx.media3.common.i0.p(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            lVar.f = new androidx.media3.common.r(qVarA);
                        } else {
                            lVar.c.e(new androidx.media3.common.r(qVarA));
                        }
                        if (i15 == 2) {
                            size = arrayList7.size();
                        }
                        arrayList2 = arrayList7;
                        arrayList2.add(lVar);
                        i11 = i14;
                        j3 = jMax;
                    }
                    arrayList7 = arrayList2;
                    h0VarF = h0Var4;
                    h0Var5 = h0Var3;
                    arrayDeque = arrayDeque2;
                    arrayListJ = arrayListJ;
                    strB = str;
                }
                ArrayDeque arrayDeque3 = arrayDeque;
                int i23 = -1;
                l[] lVarArr = (l[]) arrayList7.toArray(new l[0]);
                this.B = lVarArr;
                boolean z4 = this.c;
                if (z4) {
                    jArr = null;
                } else {
                    jArr = new long[lVarArr.length][];
                    int[] iArr2 = new int[lVarArr.length];
                    long[] jArr3 = new long[lVarArr.length];
                    boolean[] zArr = new boolean[lVarArr.length];
                    for (int i24 = 0; i24 < lVarArr.length; i24++) {
                        jArr[i24] = new long[lVarArr[i24].b.b];
                        jArr3[i24] = lVarArr[i24].b.f[0];
                    }
                    long j6 = 0;
                    int i25 = 0;
                    while (i25 < lVarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i26 = i23;
                        for (int i27 = 0; i27 < lVarArr.length; i27++) {
                            if (!zArr[i27]) {
                                long j8 = jArr3[i27];
                                if (j8 <= j7) {
                                    i26 = i27;
                                    j7 = j8;
                                }
                            }
                        }
                        int i28 = iArr2[i26];
                        long[] jArr4 = jArr[i26];
                        jArr4[i28] = j6;
                        u uVar2 = lVarArr[i26].b;
                        l[] lVarArr2 = lVarArr;
                        boolean z5 = z4;
                        j6 += (long) uVar2.d[i28];
                        int i29 = i28 + 1;
                        iArr2[i26] = i29;
                        if (i29 < jArr4.length) {
                            jArr3[i26] = uVar2.f[i29];
                        } else {
                            zArr[i26] = true;
                            i25++;
                        }
                        lVarArr = lVarArr2;
                        z4 = z5;
                        i23 = -1;
                    }
                }
                boolean z6 = z4;
                this.C = jArr;
                this.A.o();
                this.A.g(new k(j3, this.B, size));
                arrayDeque3.clear();
                this.y = true;
                if (!this.w && !z6) {
                    this.l = 2;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((androidx.media3.container.d) arrayDeque.peek()).B.add(dVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
