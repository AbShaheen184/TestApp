package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.compose.ui.input.pointer.i;
import androidx.media3.common.g;
import androidx.media3.common.h;
import androidx.media3.common.h0;
import androidx.media3.common.m;
import androidx.media3.common.q;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import androidx.media3.container.r;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.i0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.s;
import androidx.media3.extractor.text.j;
import com.app.mlounge.emulator.LibretroCore;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final i a;
    public int a0;
    public final f b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final j f;
    public boolean f0;
    public final w g;
    public int g0;
    public final w h;
    public byte h0;
    public final w i;
    public boolean i0;
    public final w j;
    public p j0;
    public final w k;
    public final w l;
    public final w m;
    public final w n;
    public final w o;
    public final w p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public d y;
    public boolean z;

    static {
        String str = j0.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(map);
    }

    public e(j jVar, int i) {
        i iVar = new i(1);
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = iVar;
        iVar.g = new androidx.media3.exoplayer.hls.c(this);
        this.f = jVar;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new f();
        this.c = new SparseArray();
        this.i = new w(4);
        this.j = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new w(4);
        this.g = new w(r.a);
        this.h = new w(4);
        this.l = new w();
        this.m = new w();
        this.n = new w(8);
        this.o = new w();
        this.p = new w();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] i(long j, long j2, String str) {
        com.google.android.material.motion.a.f(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = j0.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        l lVar = new l(4, (byte) 0);
        w wVar = (w) lVar.z;
        k kVar = (k) oVar;
        long j = kVar.z;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        kVar.e(wVar.a, 0, 4, false);
        lVar.y = 4;
        for (long jB = wVar.B(); jB != 440786851; jB = ((jB << 8) & (-256)) | ((long) (wVar.a[0] & 255))) {
            int i2 = lVar.y + 1;
            lVar.y = i2;
            if (i2 == i) {
                return false;
            }
            kVar.e(wVar.a, 0, 1, false);
        }
        long jK = lVar.k(kVar);
        long j3 = lVar.y;
        if (jK != Long.MIN_VALUE && (j == -1 || j3 + jK < j)) {
            while (true) {
                long j4 = lVar.y;
                long j5 = j3 + jK;
                if (j4 < j5) {
                    if (lVar.k(kVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jK2 = lVar.k(kVar);
                    if (jK2 < 0 || jK2 > 2147483647L) {
                        break;
                    }
                    if (jK2 != 0) {
                        int i3 = (int) jK2;
                        kVar.a(i3, false);
                        lVar.y += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = 0;
        i iVar = this.a;
        iVar.a = 0;
        ((ArrayDeque) iVar.e).clear();
        f fVar = (f) iVar.f;
        fVar.b = 0;
        fVar.c = 0;
        f fVar2 = this.b;
        fVar2.b = 0;
        fVar2.c = 0;
        l();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            i0 i0Var = ((d) sparseArray.valueAt(i)).V;
            if (i0Var != null) {
                i0Var.b = false;
                i0Var.c = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x0368  */
    /* JADX WARN: Code duplicated, block: B:325:0x052d  */
    /* JADX WARN: Code duplicated, block: B:487:0x07b9 A[PHI: r0
  0x07b9: PHI (r0v124 int) = (r0v68 int), (r0v120 int), (r0v121 int), (r0v122 int), (r0v126 int) binds: [B:609:0x0a21, B:499:0x07d8, B:496:0x07d1, B:493:0x07ca, B:484:0x079e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:621:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:630:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:633:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:635:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:637:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:640:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:642:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:645:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:648:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:651:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:653:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:673:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:675:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:678:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:681:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:684:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:690:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:691:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:693:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:694:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:696:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:702:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:704:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:706:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:721:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:726:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:727:0x0c6b  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.hls.c] */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.media3.extractor.o] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.extractor.o] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [int] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.input.pointer.i] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.media3.extractor.mkv.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, androidx.media3.extractor.r rVar) throws androidx.media3.common.j0 {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        ?? r4;
        int i4;
        int iA;
        ?? r1;
        boolean z2;
        ?? r2;
        int i5;
        byte b;
        List listSingletonList;
        int iD;
        ?? r3;
        int i6;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list;
        List listS;
        String str3;
        List list2;
        List list3;
        int i7;
        q qVar;
        boolean zK;
        int i8;
        int i9;
        float f;
        h hVar;
        String str4;
        int iIntValue;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str5;
        String str6;
        androidx.media3.container.a aVarE;
        List list4;
        int i13;
        List list5;
        int i14;
        long j;
        long j2;
        long j3;
        h0 h0Var;
        androidx.media3.extractor.metadata.c cVar;
        h0 h0VarA;
        e eVar = this;
        boolean z3 = false;
        eVar.N = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !eVar.N) {
            ?? r7 = eVar.a;
            ?? r8 = (f) r7.f;
            ArrayDeque arrayDeque = (ArrayDeque) r7.e;
            ((androidx.media3.exoplayer.hls.c) r7.g).getClass();
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || oVar.getPosition() < aVar.b) {
                    boolean z6 = z3 ? 1 : 0;
                    ?? r5 = oVar;
                    if (r7.a == 0) {
                        int i15 = 4;
                        long jB = r8.b(r5, true, z6, 4);
                        if (jB == -2) {
                            byte[] bArr2 = (byte[]) r7.d;
                            r5.n();
                            ?? r6 = z6;
                            while (true) {
                                r5.x(bArr2, r6, i15);
                                byte b2 = bArr2[r6];
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= 8) {
                                        i4 = -1;
                                    } else if ((f.d[i16] & ((long) b2)) != 0) {
                                        i4 = i16 + 1;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i4 != -1 && i4 <= 4) {
                                    iA = (int) f.a(bArr2, i4, false);
                                    Object obj = ((androidx.media3.exoplayer.hls.c) r7.g).e;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r5.r(1);
                                i15 = 4;
                                r6 = 0;
                            }
                            r5.r(i4);
                            jB = iA;
                        }
                        z = true;
                        if (jB == -1) {
                            r4 = 0;
                            z5 = false;
                            r1 = r5;
                        } else {
                            r7.b = (int) jB;
                            r7.a = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r7.a == z) {
                        r7.c = r8.b(r5, false, z, 8);
                        r7.a = 2;
                    }
                    ?? r0 = (androidx.media3.exoplayer.hls.c) r7.g;
                    int i17 = r7.b;
                    Object obj2 = r0.e;
                    switch (i17) {
                        case Token.DO /* 131 */:
                        case Token.WITH /* 136 */:
                        case Token.LOCAL_BLOCK /* 155 */:
                        case Token.XML /* 159 */:
                        case Token.GENEXPR /* 176 */:
                        case Token.YIELD_STAR /* 179 */:
                        case Token.QUESTION_DOT /* 186 */:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case Token.CONTINUE /* 134 */:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case Token.SET /* 166 */:
                        case Token.DEBUGGER /* 174 */:
                        case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
                        case Token.LAST_TOKEN /* 187 */:
                        case LibretroCore.SCREEN_HEIGHT /* 224 */:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case Token.XMLATTR /* 161 */:
                        case Token.TO_OBJECT /* 163 */:
                        case Token.GET /* 165 */:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case Token.TEMPLATE_CHARS /* 181 */:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r5.r((int) r7.c);
                        r7.a = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r5.getPosition();
                        arrayDeque.push(new a(r7.b, r7.c + position));
                        ((androidx.media3.exoplayer.hls.c) r7.g).D(position, r7.c, r7.b);
                        i2 = 0;
                        r7.a = 0;
                        r2 = r5;
                    } else if (i == 2) {
                        long j4 = r7.c;
                        if (j4 > 8) {
                            throw androidx.media3.common.j0.a(null, "Invalid integer size: " + r7.c);
                        }
                        r0.w(i17, r7.d(r5, (int) j4));
                        i2 = 0;
                        r7.a = 0;
                        r2 = r5;
                    } else if (i == 3) {
                        long j5 = r7.c;
                        if (j5 > 2147483647L) {
                            throw androidx.media3.common.j0.a(null, "String element size: " + r7.c);
                        }
                        int i18 = (int) j5;
                        if (i18 == 0) {
                            str = "";
                            i3 = 0;
                        } else {
                            byte[] bArr3 = new byte[i18];
                            r5.readFully(bArr3, 0, i18);
                            while (i18 > 0 && bArr3[i18 - 1] == 0) {
                                i18--;
                            }
                            i3 = 0;
                            str = new String(bArr3, 0, i18);
                        }
                        r0.E(i17, str);
                        r7.a = i3;
                        i2 = i3;
                        r2 = r5;
                    } else if (i == 4) {
                        r0.q(i17, (int) r7.c, r5);
                        i2 = 0;
                        r7.a = 0;
                        r2 = r5;
                    } else {
                        if (i != 5) {
                            throw androidx.media3.common.j0.a(null, "Invalid element type " + i);
                        }
                        long j6 = r7.c;
                        if (j6 != 4 && j6 != 8) {
                            throw androidx.media3.common.j0.a(null, "Invalid float size: " + r7.c);
                        }
                        int i19 = (int) j6;
                        long jD = r7.d(r5, i19);
                        double dIntBitsToFloat = i19 == 4 ? Float.intBitsToFloat((int) jD) : Double.longBitsToDouble(jD);
                        e eVar2 = (e) r0.e;
                        if (i17 == 181) {
                            eVar2.g(i17);
                            eVar2.y.S = (int) dIntBitsToFloat;
                        } else if (i17 != 17545) {
                            switch (i17) {
                                case 21969:
                                    eVar2.g(i17);
                                    eVar2.y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    eVar2.g(i17);
                                    eVar2.y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    eVar2.g(i17);
                                    eVar2.y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    eVar2.g(i17);
                                    eVar2.y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    eVar2.g(i17);
                                    eVar2.y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    eVar2.g(i17);
                                    eVar2.y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    eVar2.g(i17);
                                    eVar2.y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    eVar2.g(i17);
                                    eVar2.y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    eVar2.g(i17);
                                    eVar2.y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    eVar2.g(i17);
                                    eVar2.y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i17) {
                                        case 30323:
                                            eVar2.g(i17);
                                            eVar2.y.u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            eVar2.g(i17);
                                            eVar2.y.v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            eVar2.g(i17);
                                            eVar2.y.w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            eVar2.u = (long) dIntBitsToFloat;
                        }
                        i2 = 0;
                        r7.a = 0;
                        r2 = r5;
                    }
                } else {
                    androidx.media3.exoplayer.hls.c cVar2 = (androidx.media3.exoplayer.hls.c) r7.g;
                    int i20 = ((a) arrayDeque.pop()).a;
                    e eVar3 = (e) cVar2.e;
                    SparseArray sparseArray = eVar3.C;
                    SparseArray sparseArray2 = eVar3.c;
                    eVar3.j0.getClass();
                    if (i20 != 160) {
                        if (i20 == 174) {
                            d dVar = eVar3.y;
                            dVar.getClass();
                            String str7 = dVar.c;
                            if (str7 == null) {
                                throw androidx.media3.common.j0.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str7) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i21 = dVar.d;
                                    switch (str7) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 29;
                                            break;
                                        case "V_MPEG2":
                                            b = 30;
                                            break;
                                        case "A_EAC3":
                                            b = 31;
                                            break;
                                        case "A_FLAC":
                                            b = 32;
                                            break;
                                        case "A_OPUS":
                                            b = 33;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str8 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = dVar.l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str8 = "video/mp4v-es";
                                            listS = listSingletonList;
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null && (aVarE = androidx.media3.container.a.e(new w(dVar.P))) != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z7 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i22 = (z7 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8 || (i10 = dVar.r) == i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (dVar.o * i9) / (dVar.n * i10);
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f || dVar.G == -1.0f || dVar.H == -1.0f || dVar.I == -1.0f || dVar.J == -1.0f || dVar.K == -1.0f || dVar.L == -1.0f || dVar.M == -1.0f || dVar.N == -1.0f || dVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((dVar.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (dVar.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (dVar.O + 0.5f));
                                                        byteBufferOrder.putShort((short) dVar.D);
                                                        byteBufferOrder.putShort((short) dVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i23 = dVar.A;
                                                    int i24 = dVar.C;
                                                    int i25 = dVar.B;
                                                    int i26 = dVar.p;
                                                    hVar = new h(i23, i24, i25, bArr, i26, i26);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null && map.containsKey(str4)) {
                                                    iIntValue = ((Integer) map.get(dVar.b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0 && Float.compare(dVar.u, 0.0f) == 0 && Float.compare(dVar.v, 0.0f) == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0 || Float.compare(dVar.w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(dVar.w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i22;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 2:
                                            w wVar = new w(dVar.a(dVar.c));
                                            try {
                                                int iS = wVar.s();
                                                if (iS != 1) {
                                                    if (iS == 65534) {
                                                        wVar.M(24);
                                                        long jT = wVar.t();
                                                        UUID uuid = o0;
                                                        if (jT != uuid.getMostSignificantBits() || wVar.t() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str8 = "audio/x-unknown";
                                                        iD = -1;
                                                        i6 = -1;
                                                        str2 = null;
                                                        list3 = null;
                                                        if (dVar.P != null) {
                                                            str2 = aVarE.e;
                                                            str8 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = dVar.Y;
                                                        if (dVar.X) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i27 = (z8 ? 1 : 0) | i7;
                                                        qVar = new q();
                                                        zK = androidx.media3.common.i0.k(str8);
                                                        Map map2 = p0;
                                                        if (zK) {
                                                            qVar.F = dVar.Q;
                                                            qVar.G = dVar.S;
                                                            qVar.H = iD;
                                                        } else if (androidx.media3.common.i0.o(str8)) {
                                                            if (dVar.s == 0) {
                                                                i11 = dVar.q;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = dVar.n;
                                                                }
                                                                dVar.q = i11;
                                                                i12 = dVar.r;
                                                                if (i12 == -1) {
                                                                    i12 = dVar.o;
                                                                }
                                                                dVar.r = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = dVar.q;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (dVar.z) {
                                                                if (dVar.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i28 = dVar.A;
                                                                int i29 = dVar.C;
                                                                int i210 = dVar.B;
                                                                int i211 = dVar.p;
                                                                hVar = new h(i28, i29, i210, bArr, i211, i211);
                                                            } else {
                                                                hVar = null;
                                                            }
                                                            str4 = dVar.b;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (dVar.t == 0) {
                                                                if (Float.compare(dVar.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            qVar.u = dVar.n;
                                                            qVar.v = dVar.o;
                                                            qVar.A = f;
                                                            qVar.z = iIntValue;
                                                            qVar.B = dVar.x;
                                                            qVar.C = dVar.y;
                                                            qVar.D = hVar;
                                                        } else if (!"application/x-subrip".equals(str8)) {
                                                            throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                        }
                                                        str5 = dVar.b;
                                                        if (str5 != null) {
                                                            qVar.b = dVar.b;
                                                        }
                                                        qVar.a = Integer.toString(i21);
                                                        if (dVar.a) {
                                                            str6 = "video/webm";
                                                        } else {
                                                            str6 = "video/x-matroska";
                                                        }
                                                        qVar.m = androidx.media3.common.i0.p(str6);
                                                        qVar.n = androidx.media3.common.i0.p(str8);
                                                        qVar.o = i6;
                                                        qVar.d = dVar.Z;
                                                        qVar.e = i27;
                                                        qVar.q = list3;
                                                        qVar.j = str2;
                                                        qVar.r = dVar.m;
                                                        dVar.b0 = qVar.a();
                                                        dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                        sparseArray2.put(dVar.d, dVar);
                                                    }
                                                    androidx.media3.common.util.c.t("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str8 = "audio/x-unknown";
                                                    iD = -1;
                                                    i6 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (dVar.P != null) {
                                                        str2 = aVarE.e;
                                                        str8 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = dVar.Y;
                                                    if (dVar.X) {
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int i212 = (z9 ? 1 : 0) | i7;
                                                    qVar = new q();
                                                    zK = androidx.media3.common.i0.k(str8);
                                                    Map map3 = p0;
                                                    if (zK) {
                                                        qVar.F = dVar.Q;
                                                        qVar.G = dVar.S;
                                                        qVar.H = iD;
                                                    } else if (androidx.media3.common.i0.o(str8)) {
                                                        if (dVar.s == 0) {
                                                            i11 = dVar.q;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = dVar.n;
                                                            }
                                                            dVar.q = i11;
                                                            i12 = dVar.r;
                                                            if (i12 == -1) {
                                                                i12 = dVar.o;
                                                            }
                                                            dVar.r = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = dVar.q;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (dVar.z) {
                                                            if (dVar.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i213 = dVar.A;
                                                            int i214 = dVar.C;
                                                            int i215 = dVar.B;
                                                            int i216 = dVar.p;
                                                            hVar = new h(i213, i214, i215, bArr, i216, i216);
                                                        } else {
                                                            hVar = null;
                                                        }
                                                        str4 = dVar.b;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (dVar.t == 0) {
                                                            if (Float.compare(dVar.w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        qVar.u = dVar.n;
                                                        qVar.v = dVar.o;
                                                        qVar.A = f;
                                                        qVar.z = iIntValue;
                                                        qVar.B = dVar.x;
                                                        qVar.C = dVar.y;
                                                        qVar.D = hVar;
                                                    } else if (!"application/x-subrip".equals(str8)) {
                                                        throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                    }
                                                    str5 = dVar.b;
                                                    if (str5 != null) {
                                                        qVar.b = dVar.b;
                                                    }
                                                    qVar.a = Integer.toString(i21);
                                                    if (dVar.a) {
                                                        str6 = "video/webm";
                                                    } else {
                                                        str6 = "video/x-matroska";
                                                    }
                                                    qVar.m = androidx.media3.common.i0.p(str6);
                                                    qVar.n = androidx.media3.common.i0.p(str8);
                                                    qVar.o = i6;
                                                    qVar.d = dVar.Z;
                                                    qVar.e = i212;
                                                    qVar.q = list3;
                                                    qVar.j = str2;
                                                    qVar.r = dVar.m;
                                                    dVar.b0 = qVar.a();
                                                    dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                    sparseArray2.put(dVar.d, dVar);
                                                    break;
                                                }
                                                int i30 = dVar.R;
                                                String str9 = j0.a;
                                                iD = j0.D(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iD == 0) {
                                                    androidx.media3.common.util.c.t("MatroskaExtractor", "Unsupported PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str8 = "audio/x-unknown";
                                                    iD = -1;
                                                } else {
                                                    str8 = "audio/raw";
                                                }
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (dVar.P != null) {
                                                    str2 = aVarE.e;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z10 = dVar.Y;
                                                if (dVar.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i217 = (z10 ? 1 : 0) | i7;
                                                qVar = new q();
                                                zK = androidx.media3.common.i0.k(str8);
                                                Map map4 = p0;
                                                if (zK) {
                                                    qVar.F = dVar.Q;
                                                    qVar.G = dVar.S;
                                                    qVar.H = iD;
                                                } else if (androidx.media3.common.i0.o(str8)) {
                                                    if (dVar.s == 0) {
                                                        i11 = dVar.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = dVar.n;
                                                        }
                                                        dVar.q = i11;
                                                        i12 = dVar.r;
                                                        if (i12 == -1) {
                                                            i12 = dVar.o;
                                                        }
                                                        dVar.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = dVar.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (dVar.z) {
                                                        if (dVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i218 = dVar.A;
                                                        int i219 = dVar.C;
                                                        int i2110 = dVar.B;
                                                        int i2111 = dVar.p;
                                                        hVar = new h(i218, i219, i2110, bArr, i2111, i2111);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str4 = dVar.b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dVar.t == 0) {
                                                        if (Float.compare(dVar.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    qVar.u = dVar.n;
                                                    qVar.v = dVar.o;
                                                    qVar.A = f;
                                                    qVar.z = iIntValue;
                                                    qVar.B = dVar.x;
                                                    qVar.C = dVar.y;
                                                    qVar.D = hVar;
                                                } else if (!"application/x-subrip".equals(str8)) {
                                                    throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                }
                                                str5 = dVar.b;
                                                if (str5 != null) {
                                                    qVar.b = dVar.b;
                                                }
                                                qVar.a = Integer.toString(i21);
                                                if (dVar.a) {
                                                    str6 = "video/webm";
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                qVar.m = androidx.media3.common.i0.p(str6);
                                                qVar.n = androidx.media3.common.i0.p(str8);
                                                qVar.o = i6;
                                                qVar.d = dVar.Z;
                                                qVar.e = i217;
                                                qVar.q = list3;
                                                qVar.j = str2;
                                                qVar.r = dVar.m;
                                                dVar.b0 = qVar.a();
                                                dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                sparseArray2.put(dVar.d, dVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw androidx.media3.common.j0.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            dVar.V = new i0();
                                            str8 = "audio/true-hd";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z11 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2112 = (z11 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map5 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2113 = dVar.A;
                                                    int i2114 = dVar.C;
                                                    int i2115 = dVar.B;
                                                    int i2116 = dVar.p;
                                                    hVar = new h(i2113, i2114, i2115, bArr, i2116, i2116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 4:
                                            byte[] bArrA = dVar.a(str7);
                                            try {
                                                r3 = bArrA[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw androidx.media3.common.j0.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrA[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i32 + 1;
                                                            int i35 = i31 + i33;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrA[i34] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i34 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrA[i38] != 1) {
                                                                        throw androidx.media3.common.j0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i35];
                                                                    System.arraycopy(bArrA, i38, bArr6, 0, i35);
                                                                    int i40 = i38 + i35;
                                                                    if (bArrA[i40] != 3) {
                                                                        throw androidx.media3.common.j0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrA[i41] != 5) {
                                                                        throw androidx.media3.common.j0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i41];
                                                                    System.arraycopy(bArrA, i41, bArr7, 0, bArrA.length - i41);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str8 = "audio/vorbis";
                                                                    i6 = 8192;
                                                                    arrayList = arrayList2;
                                                                    iD = -1;
                                                                    list4 = arrayList;
                                                                    str2 = null;
                                                                    list3 = list4;
                                                                    if (dVar.P != null) {
                                                                        str2 = aVarE.e;
                                                                        str8 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = dVar.Y;
                                                                    if (dVar.X) {
                                                                        i7 = 2;
                                                                    } else {
                                                                        i7 = 0;
                                                                    }
                                                                    int i2117 = (z12 ? 1 : 0) | i7;
                                                                    qVar = new q();
                                                                    zK = androidx.media3.common.i0.k(str8);
                                                                    Map map6 = p0;
                                                                    if (zK) {
                                                                        qVar.F = dVar.Q;
                                                                        qVar.G = dVar.S;
                                                                        qVar.H = iD;
                                                                    } else if (androidx.media3.common.i0.o(str8)) {
                                                                        if (dVar.s == 0) {
                                                                            i11 = dVar.q;
                                                                            i8 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = dVar.n;
                                                                            }
                                                                            dVar.q = i11;
                                                                            i12 = dVar.r;
                                                                            if (i12 == -1) {
                                                                                i12 = dVar.o;
                                                                            }
                                                                            dVar.r = i12;
                                                                        } else {
                                                                            i8 = -1;
                                                                        }
                                                                        i9 = dVar.q;
                                                                        if (i9 != i8) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (dVar.z) {
                                                                            if (dVar.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2118 = dVar.A;
                                                                            int i2119 = dVar.C;
                                                                            int i21110 = dVar.B;
                                                                            int i21111 = dVar.p;
                                                                            hVar = new h(i2118, i2119, i21110, bArr, i21111, i21111);
                                                                        } else {
                                                                            hVar = null;
                                                                        }
                                                                        str4 = dVar.b;
                                                                        if (str4 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (dVar.t == 0) {
                                                                            if (Float.compare(dVar.w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        qVar.u = dVar.n;
                                                                        qVar.v = dVar.o;
                                                                        qVar.A = f;
                                                                        qVar.z = iIntValue;
                                                                        qVar.B = dVar.x;
                                                                        qVar.C = dVar.y;
                                                                        qVar.D = hVar;
                                                                    } else if (!"application/x-subrip".equals(str8)) {
                                                                        throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str5 = dVar.b;
                                                                    if (str5 != null) {
                                                                        qVar.b = dVar.b;
                                                                    }
                                                                    qVar.a = Integer.toString(i21);
                                                                    if (dVar.a) {
                                                                        str6 = "video/webm";
                                                                    } else {
                                                                        str6 = "video/x-matroska";
                                                                    }
                                                                    qVar.m = androidx.media3.common.i0.p(str6);
                                                                    qVar.n = androidx.media3.common.i0.p(str8);
                                                                    qVar.o = i6;
                                                                    qVar.d = dVar.Z;
                                                                    qVar.e = i2117;
                                                                    qVar.q = list3;
                                                                    qVar.j = str2;
                                                                    qVar.r = dVar.m;
                                                                    dVar.b0 = qVar.a();
                                                                    dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                                    sparseArray2.put(dVar.d, dVar);
                                                                } else {
                                                                    i36 += 255;
                                                                    i34++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw androidx.media3.common.j0.a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str8 = "audio/mpeg-L2";
                                            iD = -1;
                                            i6 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z13 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21112 = (z13 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map7 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21113 = dVar.A;
                                                    int i21114 = dVar.C;
                                                    int i21115 = dVar.B;
                                                    int i21116 = dVar.p;
                                                    hVar = new h(i21113, i21114, i21115, bArr, i21116, i21116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 6:
                                            str8 = "audio/mpeg";
                                            iD = -1;
                                            i6 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z14 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21117 = (z14 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map8 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21118 = dVar.A;
                                                    int i21119 = dVar.C;
                                                    int i211110 = dVar.B;
                                                    int i211111 = dVar.p;
                                                    hVar = new h(i21118, i21119, i211110, bArr, i211111, i211111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 7:
                                            w wVar2 = new w(dVar.a(dVar.c));
                                            try {
                                                wVar2.N(16);
                                                long jQ = wVar2.q();
                                                if (jQ != 1482049860) {
                                                    if (jQ != 859189832) {
                                                        if (jQ == 826496599) {
                                                            int i42 = wVar2.b + 20;
                                                            byte[] bArr8 = wVar2.a;
                                                            while (true) {
                                                                if (i42 >= bArr8.length - 4) {
                                                                    runtimeException = null;
                                                                    throw androidx.media3.common.j0.a(null, "Failed to find FourCC VC1 initialization data");
                                                                }
                                                                if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                    if (bArr8[i42 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                    }
                                                                }
                                                                i42++;
                                                                throw androidx.media3.common.j0.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        androidx.media3.common.util.c.t("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                        str8 = (String) pair.first;
                                                        list = (List) pair.second;
                                                        iD = -1;
                                                        i6 = -1;
                                                        list3 = list;
                                                        if (dVar.P != null) {
                                                            str2 = aVarE.e;
                                                            str8 = "video/dolby-vision";
                                                        }
                                                        boolean z15 = dVar.Y;
                                                        if (dVar.X) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i211112 = (z15 ? 1 : 0) | i7;
                                                        qVar = new q();
                                                        zK = androidx.media3.common.i0.k(str8);
                                                        Map map9 = p0;
                                                        if (zK) {
                                                            qVar.F = dVar.Q;
                                                            qVar.G = dVar.S;
                                                            qVar.H = iD;
                                                        } else if (androidx.media3.common.i0.o(str8)) {
                                                            if (dVar.s == 0) {
                                                                i11 = dVar.q;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = dVar.n;
                                                                }
                                                                dVar.q = i11;
                                                                i12 = dVar.r;
                                                                if (i12 == -1) {
                                                                    i12 = dVar.o;
                                                                }
                                                                dVar.r = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = dVar.q;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (dVar.z) {
                                                                if (dVar.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i211113 = dVar.A;
                                                                int i211114 = dVar.C;
                                                                int i211115 = dVar.B;
                                                                int i211116 = dVar.p;
                                                                hVar = new h(i211113, i211114, i211115, bArr, i211116, i211116);
                                                            } else {
                                                                hVar = null;
                                                            }
                                                            str4 = dVar.b;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (dVar.t == 0) {
                                                                if (Float.compare(dVar.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            qVar.u = dVar.n;
                                                            qVar.v = dVar.o;
                                                            qVar.A = f;
                                                            qVar.z = iIntValue;
                                                            qVar.B = dVar.x;
                                                            qVar.C = dVar.y;
                                                            qVar.D = hVar;
                                                        } else if (!"application/x-subrip".equals(str8)) {
                                                            throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                        }
                                                        str5 = dVar.b;
                                                        if (str5 != null) {
                                                            qVar.b = dVar.b;
                                                        }
                                                        qVar.a = Integer.toString(i21);
                                                        if (dVar.a) {
                                                            str6 = "video/webm";
                                                        } else {
                                                            str6 = "video/x-matroska";
                                                        }
                                                        qVar.m = androidx.media3.common.i0.p(str6);
                                                        qVar.n = androidx.media3.common.i0.p(str8);
                                                        qVar.o = i6;
                                                        qVar.d = dVar.Z;
                                                        qVar.e = i211112;
                                                        qVar.q = list3;
                                                        qVar.j = str2;
                                                        qVar.r = dVar.m;
                                                        dVar.b0 = qVar.a();
                                                        dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                        sparseArray2.put(dVar.d, dVar);
                                                    } else {
                                                        pair = new Pair("video/3gpp", null);
                                                    }
                                                    break;
                                                } else {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                    }
                                                }
                                                str2 = null;
                                                str8 = (String) pair.first;
                                                list = (List) pair.second;
                                                iD = -1;
                                                i6 = -1;
                                                list3 = list;
                                                if (dVar.P != null) {
                                                    str2 = aVarE.e;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z16 = dVar.Y;
                                                if (dVar.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i211117 = (z16 ? 1 : 0) | i7;
                                                qVar = new q();
                                                zK = androidx.media3.common.i0.k(str8);
                                                Map map10 = p0;
                                                if (zK) {
                                                    qVar.F = dVar.Q;
                                                    qVar.G = dVar.S;
                                                    qVar.H = iD;
                                                } else if (androidx.media3.common.i0.o(str8)) {
                                                    if (dVar.s == 0) {
                                                        i11 = dVar.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = dVar.n;
                                                        }
                                                        dVar.q = i11;
                                                        i12 = dVar.r;
                                                        if (i12 == -1) {
                                                            i12 = dVar.o;
                                                        }
                                                        dVar.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = dVar.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (dVar.z) {
                                                        if (dVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211118 = dVar.A;
                                                        int i211119 = dVar.C;
                                                        int i2111110 = dVar.B;
                                                        int i2111111 = dVar.p;
                                                        hVar = new h(i211118, i211119, i2111110, bArr, i2111111, i2111111);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str4 = dVar.b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dVar.t == 0) {
                                                        if (Float.compare(dVar.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    qVar.u = dVar.n;
                                                    qVar.v = dVar.o;
                                                    qVar.A = f;
                                                    qVar.z = iIntValue;
                                                    qVar.B = dVar.x;
                                                    qVar.C = dVar.y;
                                                    qVar.D = hVar;
                                                } else if (!"application/x-subrip".equals(str8)) {
                                                    throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                                }
                                                str5 = dVar.b;
                                                if (str5 != null) {
                                                    qVar.b = dVar.b;
                                                }
                                                qVar.a = Integer.toString(i21);
                                                if (dVar.a) {
                                                    str6 = "video/webm";
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                qVar.m = androidx.media3.common.i0.p(str6);
                                                qVar.n = androidx.media3.common.i0.p(str8);
                                                qVar.o = i6;
                                                qVar.d = dVar.Z;
                                                qVar.e = i211117;
                                                qVar.q = list3;
                                                qVar.j = str2;
                                                qVar.r = dVar.m;
                                                dVar.b0 = qVar.a();
                                                dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                                sparseArray2.put(dVar.d, dVar);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(dVar.a(str7), 0, bArr9, 0, 4);
                                            listS = com.google.common.collect.h0.s(bArr9);
                                            str8 = "application/dvbsubs";
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z17 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111112 = (z17 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map11 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111113 = dVar.A;
                                                    int i2111114 = dVar.C;
                                                    int i2111115 = dVar.B;
                                                    int i2111116 = dVar.p;
                                                    hVar = new h(i2111113, i2111114, i2111115, bArr, i2111116, i2111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 10:
                                            androidx.media3.extractor.d dVarA = androidx.media3.extractor.d.a(new w(dVar.a(dVar.c)));
                                            ArrayList arrayList3 = dVarA.a;
                                            dVar.c0 = dVarA.b;
                                            str3 = dVarA.l;
                                            str8 = "video/avc";
                                            list2 = arrayList3;
                                            str2 = str3;
                                            list = list2;
                                            iD = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z18 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111117 = (z18 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map12 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111118 = dVar.A;
                                                    int i2111119 = dVar.C;
                                                    int i21111110 = dVar.B;
                                                    int i21111111 = dVar.p;
                                                    hVar = new h(i2111118, i2111119, i21111110, bArr, i21111111, i21111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 11:
                                            listS = com.google.common.collect.h0.s(dVar.a(str7));
                                            str8 = "application/vobsub";
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z19 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111112 = (z19 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map13 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111113 = dVar.A;
                                                    int i21111114 = dVar.C;
                                                    int i21111115 = dVar.B;
                                                    int i21111116 = dVar.p;
                                                    hVar = new h(i21111113, i21111114, i21111115, bArr, i21111116, i21111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 12:
                                            str8 = "audio/vnd.dts.hd";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z110 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111117 = (z110 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map14 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111118 = dVar.A;
                                                    int i21111119 = dVar.C;
                                                    int i211111110 = dVar.B;
                                                    int i211111111 = dVar.p;
                                                    hVar = new h(i21111118, i21111119, i211111110, bArr, i211111111, i211111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(dVar.a(str7));
                                            byte[] bArr10 = dVar.l;
                                            androidx.media3.extractor.a aVarN = androidx.media3.extractor.b.n(new v(bArr10, bArr10.length), false);
                                            dVar.S = aVarN.b;
                                            dVar.Q = aVarN.c;
                                            str8 = "audio/mp4a-latm";
                                            list = listSingletonList2;
                                            str2 = aVarN.a;
                                            iD = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z111 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111112 = (z111 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map15 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111113 = dVar.A;
                                                    int i211111114 = dVar.C;
                                                    int i211111115 = dVar.B;
                                                    int i211111116 = dVar.p;
                                                    hVar = new h(i211111113, i211111114, i211111115, bArr, i211111116, i211111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 14:
                                            str8 = "audio/ac3";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z112 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111117 = (z112 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map16 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111118 = dVar.A;
                                                    int i211111119 = dVar.C;
                                                    int i2111111110 = dVar.B;
                                                    int i2111111111 = dVar.p;
                                                    hVar = new h(i211111118, i211111119, i2111111110, bArr, i2111111111, i2111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 15:
                                        case 21:
                                            dVar.W = true;
                                            str8 = "audio/vnd.dts";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z113 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111112 = (z113 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map17 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111113 = dVar.A;
                                                    int i2111111114 = dVar.C;
                                                    int i2111111115 = dVar.B;
                                                    int i2111111116 = dVar.p;
                                                    hVar = new h(i2111111113, i2111111114, i2111111115, bArr, i2111111116, i2111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = dVar.l;
                                            listSingletonList = bArr11 == null ? null : com.google.common.collect.h0.s(bArr11);
                                            str8 = "video/av01";
                                            listS = listSingletonList;
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z114 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111117 = (z114 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map18 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111118 = dVar.A;
                                                    int i2111111119 = dVar.C;
                                                    int i21111111110 = dVar.B;
                                                    int i21111111111 = dVar.p;
                                                    hVar = new h(i2111111118, i2111111119, i21111111110, bArr, i21111111111, i21111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 17:
                                            str8 = "video/x-vnd.on2.vp8";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z115 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111112 = (z115 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map19 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111113 = dVar.A;
                                                    int i21111111114 = dVar.C;
                                                    int i21111111115 = dVar.B;
                                                    int i21111111116 = dVar.p;
                                                    hVar = new h(i21111111113, i21111111114, i21111111115, bArr, i21111111116, i21111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = dVar.l;
                                            listSingletonList = bArr12 == null ? null : com.google.common.collect.h0.s(bArr12);
                                            str8 = "video/x-vnd.on2.vp9";
                                            listS = listSingletonList;
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z116 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111117 = (z116 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map110 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111118 = dVar.A;
                                                    int i21111111119 = dVar.C;
                                                    int i211111111110 = dVar.B;
                                                    int i211111111111 = dVar.p;
                                                    hVar = new h(i21111111118, i21111111119, i211111111110, bArr, i211111111111, i211111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 19:
                                            str8 = "application/pgs";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z117 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111112 = (z117 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map111 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111113 = dVar.A;
                                                    int i211111111114 = dVar.C;
                                                    int i211111111115 = dVar.B;
                                                    int i211111111116 = dVar.p;
                                                    hVar = new h(i211111111113, i211111111114, i211111111115, bArr, i211111111116, i211111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 20:
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z118 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111117 = (z118 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map112 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111118 = dVar.A;
                                                    int i211111111119 = dVar.C;
                                                    int i2111111111110 = dVar.B;
                                                    int i2111111111111 = dVar.p;
                                                    hVar = new h(i211111111118, i211111111119, i2111111111110, bArr, i2111111111111, i2111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 22:
                                            if (dVar.R == 32) {
                                                str8 = "audio/raw";
                                                iD = 4;
                                            } else {
                                                androidx.media3.common.util.c.t("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                str8 = "audio/x-unknown";
                                                iD = -1;
                                            }
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z119 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111112 = (z119 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map113 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111113 = dVar.A;
                                                    int i2111111111114 = dVar.C;
                                                    int i2111111111115 = dVar.B;
                                                    int i2111111111116 = dVar.p;
                                                    hVar = new h(i2111111111113, i2111111111114, i2111111111115, bArr, i2111111111116, i2111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 23:
                                            int i43 = dVar.R;
                                            if (i43 == 8) {
                                                str8 = "audio/raw";
                                                iD = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iD = 268435456;
                                                } else if (i43 == 24) {
                                                    iD = 1342177280;
                                                } else if (i43 == 32) {
                                                    iD = 1610612736;
                                                } else {
                                                    androidx.media3.common.util.c.t("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str8 = "audio/x-unknown";
                                                    iD = -1;
                                                }
                                                str8 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1110 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111117 = (z1110 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map114 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111118 = dVar.A;
                                                    int i2111111111119 = dVar.C;
                                                    int i21111111111110 = dVar.B;
                                                    int i21111111111111 = dVar.p;
                                                    hVar = new h(i2111111111118, i2111111111119, i21111111111110, bArr, i21111111111111, i21111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 24:
                                            int i44 = dVar.R;
                                            String str10 = j0.a;
                                            iD = j0.D(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iD == 0) {
                                                androidx.media3.common.util.c.t("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                str8 = "audio/x-unknown";
                                                iD = -1;
                                            } else {
                                                str8 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1111 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111112 = (z1111 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map115 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111113 = dVar.A;
                                                    int i21111111111114 = dVar.C;
                                                    int i21111111111115 = dVar.B;
                                                    int i21111111111116 = dVar.p;
                                                    hVar = new h(i21111111111113, i21111111111114, i21111111111115, bArr, i21111111111116, i21111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 25:
                                        case 26:
                                            listS = com.google.common.collect.h0.t(l0, dVar.a(str7));
                                            str8 = "text/x-ssa";
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1112 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111117 = (z1112 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map116 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111118 = dVar.A;
                                                    int i21111111111119 = dVar.C;
                                                    int i211111111111110 = dVar.B;
                                                    int i211111111111111 = dVar.p;
                                                    hVar = new h(i21111111111118, i21111111111119, i211111111111110, bArr, i211111111111111, i211111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 27:
                                            androidx.media3.extractor.w wVarA = androidx.media3.extractor.w.a(new w(dVar.a(dVar.c)), false, null);
                                            List list6 = wVarA.a;
                                            dVar.c0 = wVarA.b;
                                            str3 = wVarA.n;
                                            str8 = "video/hevc";
                                            list2 = list6;
                                            str2 = str3;
                                            list = list2;
                                            iD = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1113 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111112 = (z1113 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map117 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111113 = dVar.A;
                                                    int i211111111111114 = dVar.C;
                                                    int i211111111111115 = dVar.B;
                                                    int i211111111111116 = dVar.p;
                                                    hVar = new h(i211111111111113, i211111111111114, i211111111111115, bArr, i211111111111116, i211111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 28:
                                            str8 = "text/vtt";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1114 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111117 = (z1114 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map118 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111118 = dVar.A;
                                                    int i211111111111119 = dVar.C;
                                                    int i2111111111111110 = dVar.B;
                                                    int i2111111111111111 = dVar.p;
                                                    hVar = new h(i211111111111118, i211111111111119, i2111111111111110, bArr, i2111111111111111, i2111111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 29:
                                            str8 = "application/x-subrip";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1115 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111112 = (z1115 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map119 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111113 = dVar.A;
                                                    int i2111111111111114 = dVar.C;
                                                    int i2111111111111115 = dVar.B;
                                                    int i2111111111111116 = dVar.p;
                                                    hVar = new h(i2111111111111113, i2111111111111114, i2111111111111115, bArr, i2111111111111116, i2111111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 30:
                                            str8 = "video/mpeg2";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1116 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111117 = (z1116 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map1110 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111118 = dVar.A;
                                                    int i2111111111111119 = dVar.C;
                                                    int i21111111111111110 = dVar.B;
                                                    int i21111111111111111 = dVar.p;
                                                    hVar = new h(i2111111111111118, i2111111111111119, i21111111111111110, bArr, i21111111111111111, i21111111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i2111111111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 31:
                                            str8 = "audio/eac3";
                                            iD = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1117 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111112 = (z1117 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map1111 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111113 = dVar.A;
                                                    int i21111111111111114 = dVar.C;
                                                    int i21111111111111115 = dVar.B;
                                                    int i21111111111111116 = dVar.p;
                                                    hVar = new h(i21111111111111113, i21111111111111114, i21111111111111115, bArr, i21111111111111116, i21111111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case 32:
                                            listSingletonList = Collections.singletonList(dVar.a(str7));
                                            str8 = "audio/flac";
                                            listS = listSingletonList;
                                            iD = -1;
                                            i6 = -1;
                                            list4 = listS;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1118 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111117 = (z1118 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map1112 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111118 = dVar.A;
                                                    int i21111111111111119 = dVar.C;
                                                    int i211111111111111110 = dVar.B;
                                                    int i211111111111111111 = dVar.p;
                                                    hVar = new h(i21111111111111118, i21111111111111119, i211111111111111110, bArr, i211111111111111111, i211111111111111111);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i21111111111111117;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        case Token.GETPROP /* 33 */:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(dVar.a(dVar.c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(dVar.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dVar.U).array());
                                            str8 = "audio/opus";
                                            i6 = 5760;
                                            arrayList = arrayList4;
                                            iD = -1;
                                            list4 = arrayList;
                                            str2 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str2 = aVarE.e;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1119 = dVar.Y;
                                            if (dVar.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111111112 = (z1119 ? 1 : 0) | i7;
                                            qVar = new q();
                                            zK = androidx.media3.common.i0.k(str8);
                                            Map map1113 = p0;
                                            if (zK) {
                                                qVar.F = dVar.Q;
                                                qVar.G = dVar.S;
                                                qVar.H = iD;
                                            } else if (androidx.media3.common.i0.o(str8)) {
                                                if (dVar.s == 0) {
                                                    i11 = dVar.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = dVar.n;
                                                    }
                                                    dVar.q = i11;
                                                    i12 = dVar.r;
                                                    if (i12 == -1) {
                                                        i12 = dVar.o;
                                                    }
                                                    dVar.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = dVar.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (dVar.z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111111113 = dVar.A;
                                                    int i211111111111111114 = dVar.C;
                                                    int i211111111111111115 = dVar.B;
                                                    int i211111111111111116 = dVar.p;
                                                    hVar = new h(i211111111111111113, i211111111111111114, i211111111111111115, bArr, i211111111111111116, i211111111111111116);
                                                } else {
                                                    hVar = null;
                                                }
                                                str4 = dVar.b;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.t == 0) {
                                                    if (Float.compare(dVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                qVar.u = dVar.n;
                                                qVar.v = dVar.o;
                                                qVar.A = f;
                                                qVar.z = iIntValue;
                                                qVar.B = dVar.x;
                                                qVar.C = dVar.y;
                                                qVar.D = hVar;
                                            } else if (!"application/x-subrip".equals(str8)) {
                                                throw androidx.media3.common.j0.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = dVar.b;
                                            if (str5 != null) {
                                                qVar.b = dVar.b;
                                            }
                                            qVar.a = Integer.toString(i21);
                                            if (dVar.a) {
                                                str6 = "video/webm";
                                            } else {
                                                str6 = "video/x-matroska";
                                            }
                                            qVar.m = androidx.media3.common.i0.p(str6);
                                            qVar.n = androidx.media3.common.i0.p(str8);
                                            qVar.o = i6;
                                            qVar.d = dVar.Z;
                                            qVar.e = i211111111111111112;
                                            qVar.q = list3;
                                            qVar.j = str2;
                                            qVar.r = dVar.m;
                                            dVar.b0 = qVar.a();
                                            dVar.a0 = eVar3.j0.u(dVar.d, dVar.e);
                                            sparseArray2.put(dVar.d, dVar);
                                            break;
                                        default:
                                            throw androidx.media3.common.j0.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    eVar3.y = null;
                                    break;
                            }
                        } else if (i20 != 183) {
                            if (i20 == 19899) {
                                int i45 = eVar3.A;
                                if (i45 != -1) {
                                    long j7 = eVar3.B;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            eVar3.K = j7;
                                        }
                                    }
                                }
                                throw androidx.media3.common.j0.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i20 == 25152) {
                                eVar3.g(i20);
                                d dVar2 = eVar3.y;
                                if (dVar2.i) {
                                    g0 g0Var = dVar2.k;
                                    if (g0Var == null) {
                                        throw androidx.media3.common.j0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    dVar2.m = new m(null, true, new androidx.media3.common.l(g.a, null, "video/webm", g0Var.b));
                                }
                            } else if (i20 == 28032) {
                                eVar3.g(i20);
                                d dVar3 = eVar3.y;
                                if (dVar3.i && dVar3.j != null) {
                                    throw androidx.media3.common.j0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i20 == 357149030) {
                                if (eVar3.t == -9223372036854775807L) {
                                    eVar3.t = 1000000L;
                                }
                                long j8 = eVar3.u;
                                if (j8 != -9223372036854775807L) {
                                    eVar3.v = eVar3.m(j8);
                                }
                            } else if (i20 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw androidx.media3.common.j0.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!eVar3.d || eVar3.K == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    d dVar4 = (d) sparseArray2.valueAt(i50);
                                    int i51 = dVar4.e;
                                    if (i51 == 2) {
                                        if (dVar4.Y) {
                                            i46 = dVar4.d;
                                        }
                                        if (i47 == -1) {
                                            i47 = dVar4.d;
                                        }
                                    } else if (i51 == 1) {
                                        if (dVar4.Y) {
                                            i48 = dVar4.d;
                                        }
                                        if (i49 == -1) {
                                            i49 = dVar4.d;
                                        }
                                    }
                                    if (z21) {
                                        dVar4.a0.getClass();
                                        if (!dVar4.W) {
                                            androidx.media3.extractor.h0 h0Var2 = dVar4.a0;
                                            androidx.media3.common.r rVar2 = dVar4.b0;
                                            rVar2.getClass();
                                            h0Var2.e(rVar2);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    eVar3.I = i46;
                                } else if (i47 != -1) {
                                    eVar3.I = i47;
                                } else if (i48 != -1) {
                                    eVar3.I = i48;
                                } else if (i49 != -1) {
                                    eVar3.I = i49;
                                } else {
                                    eVar3.I = sparseArray2.size() > 0 ? ((d) sparseArray2.valueAt(z20 ? 1 : 0)).d : -1;
                                }
                                if (z21) {
                                    eVar3.j();
                                }
                            } else if (i20 == 475249515 && !eVar3.z) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i52)).isEmpty()) {
                                            i52++;
                                        } else if (eVar3.v != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort((List) sparseArray.valueAt(i53));
                                            }
                                            eVar3.j0.g(new c(sparseArray, eVar3.v, eVar3.I, eVar3.s, eVar3.r));
                                        }
                                    }
                                    eVar3.j0.g(new s(eVar3.v));
                                }
                                eVar3.z = z4;
                                eVar3.D = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    d dVar5 = (d) sparseArray2.valueAt(i54);
                                    long j9 = eVar3.v;
                                    long j10 = eVar3.s;
                                    long j11 = eVar3.r;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    if (dVar5.e != 2 || (list5 = (List) sparseArray.get(dVar5.d)) == null || list5.isEmpty()) {
                                        i14 = i54;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i14 = i54;
                                        } else {
                                            i14 = i54;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                b bVar = (b) list5.get(i56);
                                                long j12 = j10;
                                                long j13 = bVar.e;
                                                long j14 = bVar.z;
                                                long j15 = bVar.y;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = ((b) list5.get(i57 == true ? 1 : 0)).e;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        androidx.media3.common.r rVar3 = dVar5.b0;
                                                        rVar3.getClass();
                                                        h0Var = rVar3.l;
                                                        cVar = new androidx.media3.extractor.metadata.c(j);
                                                        if (h0Var == null) {
                                                            androidx.media3.common.g0[] g0VarArr = new androidx.media3.common.g0[i55];
                                                            g0VarArr[z22 ? 1 : 0] = cVar;
                                                            h0VarA = new h0(g0VarArr);
                                                        } else {
                                                            androidx.media3.common.g0[] g0VarArr2 = new androidx.media3.common.g0[i55];
                                                            g0VarArr2[z22 ? 1 : 0] = cVar;
                                                            h0VarA = h0Var.a(g0VarArr2);
                                                        }
                                                        q qVarA = dVar5.b0.a();
                                                        qVarA.k = h0VarA;
                                                        dVar5.b0 = new androidx.media3.common.r(qVarA);
                                                    }
                                                } else {
                                                    if (i56 < list5.size() - 1) {
                                                        b bVar2 = (b) list5.get(i56 + 1);
                                                        j2 = (bVar2.y + bVar2.z) - (j15 + j14);
                                                        j3 = bVar2.e - j13;
                                                    } else {
                                                        j2 = (j12 + j11) - (j15 + j14);
                                                        j3 = j9 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j10 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = ((b) list5.get(i57 == true ? 1 : 0)).e;
                                            }
                                            if (j != -9223372036854775807L) {
                                                androidx.media3.common.r rVar4 = dVar5.b0;
                                                rVar4.getClass();
                                                h0Var = rVar4.l;
                                                cVar = new androidx.media3.extractor.metadata.c(j);
                                                if (h0Var == null) {
                                                    androidx.media3.common.g0[] g0VarArr3 = new androidx.media3.common.g0[i55];
                                                    g0VarArr3[z22 ? 1 : 0] = cVar;
                                                    h0VarA = new h0(g0VarArr3);
                                                } else {
                                                    androidx.media3.common.g0[] g0VarArr4 = new androidx.media3.common.g0[i55];
                                                    g0VarArr4[z22 ? 1 : 0] = cVar;
                                                    h0VarA = h0Var.a(g0VarArr4);
                                                }
                                                q qVarA2 = dVar5.b0.a();
                                                qVarA2.k = h0VarA;
                                                dVar5.b0 = new androidx.media3.common.r(qVarA2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            androidx.media3.common.r rVar5 = dVar5.b0;
                                            rVar5.getClass();
                                            h0Var = rVar5.l;
                                            cVar = new androidx.media3.extractor.metadata.c(j);
                                            if (h0Var == null) {
                                                androidx.media3.common.g0[] g0VarArr5 = new androidx.media3.common.g0[i55];
                                                g0VarArr5[z22 ? 1 : 0] = cVar;
                                                h0VarA = new h0(g0VarArr5);
                                            } else {
                                                androidx.media3.common.g0[] g0VarArr6 = new androidx.media3.common.g0[i55];
                                                g0VarArr6[z22 ? 1 : 0] = cVar;
                                                h0VarA = h0Var.a(g0VarArr6);
                                            }
                                            q qVarA3 = dVar5.b0.a();
                                            qVarA3.k = h0VarA;
                                            dVar5.b0 = new androidx.media3.common.r(qVarA3);
                                        }
                                    }
                                    if (!dVar5.W) {
                                        dVar5.a0.getClass();
                                        androidx.media3.extractor.h0 h0Var3 = dVar5.a0;
                                        androidx.media3.common.r rVar6 = dVar5.b0;
                                        rVar6.getClass();
                                        h0Var3.e(rVar6);
                                    }
                                    i54 = i14 + 1;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                eVar3.j();
                                i5 = z3 ? 1 : 0;
                            }
                        } else if (!eVar3.z) {
                            eVar3.f(i20);
                            if (eVar3.E != -9223372036854775807L && (i13 = eVar3.F) != -1 && eVar3.G != -1) {
                                List arrayList5 = (List) sparseArray.get(i13);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(eVar3.F, arrayList5);
                                }
                                arrayList5.add(new b(eVar3.E, eVar3.s + eVar3.G, eVar3.H));
                            }
                        }
                        i5 = 0;
                    } else if (eVar3.O != 2) {
                        i5 = 0;
                    } else {
                        d dVar6 = (d) sparseArray2.get(eVar3.U);
                        dVar6.a0.getClass();
                        if (eVar3.Z > 0 && "A_OPUS".equals(dVar6.c)) {
                            w wVar3 = eVar3.p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(eVar3.Z).array();
                            wVar3.getClass();
                            wVar3.K(bArrArray, bArrArray.length);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < eVar3.S; i59++) {
                            i58 += eVar3.T[i59];
                        }
                        int i60 = 0;
                        while (i60 < eVar3.S) {
                            long j16 = eVar3.P + ((long) ((dVar6.f * i60) / 1000));
                            int i61 = eVar3.W;
                            if (i60 == 0 && !eVar3.Y) {
                                i61 |= 1;
                            }
                            int i62 = eVar3.T[i60];
                            int i63 = i58 - i62;
                            eVar3.h(dVar6, j16, i61, i62, i63);
                            i60++;
                            i58 = i63;
                        }
                        i5 = 0;
                        eVar3.O = 0;
                    }
                    r2 = oVar;
                    i2 = i5;
                }
                z5 = true;
                r1 = r2;
                r4 = i2;
            }
            if (z5) {
                long position2 = r1.getPosition();
                eVar = this;
                if (eVar.J) {
                    eVar.L = position2;
                    rVar.a = eVar.K;
                    eVar.J = r4;
                    return 1;
                }
                z2 = true;
                if (eVar.z) {
                    long j17 = eVar.L;
                    if (j17 != -1) {
                        rVar.a = j17;
                        eVar.L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z2 = true;
                eVar = this;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray sparseArray3 = eVar.c;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            d dVar7 = (d) sparseArray3.valueAt(i64);
            dVar7.a0.getClass();
            i0 i0Var = dVar7.V;
            if (i0Var != null) {
                i0Var.a(dVar7.a0, dVar7.k);
            }
            i64++;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        if (this.e) {
            pVar = new b1(pVar, this.f);
        }
        this.j0 = pVar;
    }

    public final void f(int i) {
        if (this.D) {
            return;
        }
        throw androidx.media3.common.j0.a(null, "Element " + i + " must be in a Cues");
    }

    public final void g(int i) {
        if (this.y != null) {
            return;
        }
        throw androidx.media3.common.j0.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void h(d dVar, long j, int i, int i2, int i3) {
        byte[] bArrI;
        int i4;
        int i5;
        i0 i0Var = dVar.V;
        if (i0Var != null) {
            i0Var.b(dVar.a0, j, i, i2, i3, dVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.c) || "S_TEXT/ASS".equals(dVar.c) || "S_TEXT/SSA".equals(dVar.c) || "S_TEXT/WEBVTT".equals(dVar.c)) {
                if (this.S > 1) {
                    androidx.media3.common.util.c.t("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.Q;
                    if (j2 == -9223372036854775807L) {
                        androidx.media3.common.util.c.t("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dVar.c;
                        w wVar = this.m;
                        byte[] bArr = wVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrI = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                net.luminis.tls.engine.impl.c.a();
                                return;
                        }
                        System.arraycopy(bArrI, 0, bArr, i4, bArrI.length);
                        for (int i6 = wVar.b; i6 < wVar.c; i6++) {
                            if (wVar.a[i6] == 0) {
                                wVar.L(i6);
                                dVar.a0.f(wVar.c, wVar);
                                i5 = i2 + wVar.c;
                            }
                        }
                        dVar.a0.f(wVar.c, wVar);
                        i5 = i2 + wVar.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.S;
                w wVar2 = this.p;
                if (i7 > 1) {
                    wVar2.J(0);
                } else {
                    int i8 = wVar2.c;
                    dVar.a0.b(wVar2, i8, 2);
                    i5 += i8;
                }
            }
            dVar.a0.g(j, i, i5, i3, dVar.k);
        }
        this.N = true;
    }

    public final void j() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                p pVar = this.j0;
                pVar.getClass();
                pVar.o();
                this.x = false;
                return;
            }
            if (((d) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(o oVar, int i) {
        w wVar = this.i;
        if (wVar.c >= i) {
            return;
        }
        byte[] bArr = wVar.a;
        if (bArr.length < i) {
            wVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = wVar.a;
        int i2 = wVar.c;
        oVar.readFully(bArr2, i2, i - i2);
        wVar.L(i);
    }

    public final void l() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.J(0);
    }

    public final long m(long j) throws androidx.media3.common.j0 {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw androidx.media3.common.j0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = j0.a;
        return j0.Y(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    public final int n(o oVar, d dVar, int i, boolean z) {
        int iA;
        int iA2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(dVar.c)) {
            o(oVar, k0, i);
            int i4 = this.b0;
            l();
            return i4;
        }
        if ("S_TEXT/ASS".equals(dVar.c) || "S_TEXT/SSA".equals(dVar.c)) {
            o(oVar, m0, i);
            int i5 = this.b0;
            l();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(dVar.c)) {
            o(oVar, n0, i);
            int i6 = this.b0;
            l();
            return i6;
        }
        int i7 = 2;
        if (dVar.W) {
            dVar.b0.getClass();
            w wVar = new w(i);
            if (oVar.e(wVar.a, 0, i, true)) {
                oVar.n();
                if (androidx.media3.extractor.b.i(wVar.i()) == 1 && wVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    wVar.k(bArr, 0, 10);
                    wVar.M(0);
                    int iG = androidx.media3.extractor.b.g(bArr);
                    if (iG > 0 && wVar.a() >= iG + 4) {
                        wVar.N(iG);
                        if (androidx.media3.extractor.b.i(wVar.m()) == 2) {
                            q qVarA = dVar.b0.a();
                            qVarA.n = androidx.media3.common.i0.p("audio/vnd.dts.hd");
                            dVar.b0 = new androidx.media3.common.r(qVarA);
                        }
                    }
                }
            }
            dVar.a0.e(dVar.b0);
            dVar.W = false;
            j();
        }
        androidx.media3.extractor.h0 h0Var = dVar.a0;
        boolean z3 = this.d0;
        w wVar2 = this.l;
        if (!z3) {
            boolean z4 = dVar.i;
            w wVar3 = this.i;
            if (z4) {
                this.W &= -1073741825;
                if (!this.e0) {
                    oVar.readFully(wVar3.a, 0, 1);
                    this.a0++;
                    byte b = wVar3.a[0];
                    if ((b & 128) == 128) {
                        throw androidx.media3.common.j0.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b;
                    this.e0 = true;
                }
                byte b2 = this.h0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.i0) {
                        w wVar4 = this.n;
                        oVar.readFully(wVar4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        wVar3.a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        wVar3.M(0);
                        h0Var.b(wVar3, 1, 1);
                        this.b0++;
                        wVar4.M(0);
                        h0Var.b(wVar4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z5) {
                        if (!this.f0) {
                            oVar.readFully(wVar3.a, 0, 1);
                            this.a0++;
                            wVar3.M(0);
                            this.g0 = wVar3.z();
                            this.f0 = true;
                        }
                        int i8 = this.g0 * 4;
                        wVar3.J(i8);
                        oVar.readFully(wVar3.a, 0, i8);
                        this.a0 += i8;
                        short s = (short) ((this.g0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.g0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iD = wVar3.D();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iD - i11));
                            } else {
                                byteBuffer2.putInt(iD - i11);
                            }
                            i10++;
                            i11 = iD;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.a0) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        w wVar5 = this.o;
                        wVar5.K(bArrArray, i9);
                        h0Var.b(wVar5, i9, 1);
                        this.b0 += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = dVar.j;
                if (bArr2 != null) {
                    wVar2.K(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(dVar.c)) {
                z2 = z;
            } else {
                z2 = dVar.g > 0;
            }
            if (z2) {
                this.W |= 268435456;
                this.p.J(0);
                int i16 = (wVar2.c + i) - this.a0;
                wVar3.J(4);
                byte[] bArr3 = wVar3.a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                h0Var.b(wVar3, 4, i2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i17 = i + wVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.c) && !"V_MPEGH/ISO/HEVC".equals(dVar.c)) {
            if (dVar.V != null) {
                com.google.android.material.motion.a.q(wVar2.c == 0);
                dVar.V.c(oVar);
            }
            while (true) {
                int i18 = this.a0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iA3 = wVar2.a();
                if (iA3 > 0) {
                    iA2 = Math.min(i19, iA3);
                    h0Var.f(iA2, wVar2);
                } else {
                    iA2 = h0Var.a(oVar, i19, false);
                }
                this.a0 += iA2;
                this.b0 += iA2;
            }
        } else {
            w wVar6 = this.h;
            byte[] bArr4 = wVar6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = dVar.c0;
            int i21 = 4 - i20;
            while (this.a0 < i17) {
                int i22 = this.c0;
                if (i22 == 0) {
                    int iMin = Math.min(i20, wVar2.a());
                    oVar.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        wVar2.k(bArr4, i21, iMin);
                    }
                    this.a0 += i20;
                    wVar6.M(0);
                    this.c0 = wVar6.D();
                    w wVar7 = this.g;
                    wVar7.M(0);
                    h0Var.f(4, wVar7);
                    this.b0 += 4;
                } else {
                    int iA4 = wVar2.a();
                    if (iA4 > 0) {
                        iA = Math.min(i22, iA4);
                        h0Var.f(iA, wVar2);
                    } else {
                        iA = h0Var.a(oVar, i22, false);
                    }
                    this.a0 += iA;
                    this.b0 += iA;
                    this.c0 -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.c)) {
            w wVar8 = this.j;
            wVar8.M(0);
            h0Var.f(4, wVar8);
            this.b0 += 4;
        }
        int i23 = this.b0;
        l();
        return i23;
    }

    public final void o(o oVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        w wVar = this.m;
        byte[] bArr2 = wVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            wVar.getClass();
            wVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        oVar.readFully(wVar.a, bArr.length, i);
        wVar.M(0);
        wVar.L(length);
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
