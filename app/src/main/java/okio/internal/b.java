package okio.internal;

import androidx.media3.exoplayer.video.v;
import com.google.android.gms.measurement.internal.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.a0;
import kotlin.collections.o;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kotlin.text.r;
import okio.b0;
import okio.e0;
import okio.k0;
import okio.s;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] b = new byte[0];

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = x.y;
        x xVarI = f0.i("/");
        kotlin.k[] kVarArr = {new kotlin.k(xVarI, new i(xVarI, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.u(1));
        a0.A(linkedHashMap, kVarArr);
        for (i iVar : o.f0(arrayList, new com.google.android.material.internal.k(2))) {
            if (((i) linkedHashMap.put(iVar.a, iVar)) == null) {
                while (true) {
                    x xVar = iVar.a;
                    x xVarE = xVar.e();
                    if (xVarE == null) {
                        break;
                    }
                    i iVar2 = (i) linkedHashMap.get(xVarE);
                    if (iVar2 != null) {
                        iVar2.q.add(xVar);
                        break;
                    }
                    i iVar3 = new i(xVarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(xVarE, iVar3);
                    iVar3.q.add(xVar);
                    iVar = iVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final long c(b0 b0Var, okio.i iVar, int i, long j) {
        okio.i iVar2;
        okio.f fVar = b0Var.y;
        iVar.getClass();
        long j2 = i;
        okio.b.d(iVar.f(), 0, j2);
        if (b0Var.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        long jMax = 0;
        int i2 = i;
        okio.i iVar3 = iVar;
        while (true) {
            long jA = a.a(fVar, iVar3, jMax, j, i2);
            if (jA != -1) {
                return jA;
            }
            long j3 = fVar.y;
            long j4 = (j3 - j2) + 1;
            if (j4 < j) {
                if (j3 < j) {
                    iVar2 = iVar;
                } else {
                    int iMax = (int) Math.max(1L, (j3 - j) + 1);
                    int iMin = ((int) Math.min(j2, (fVar.y - jMax) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            iVar2 = iVar;
                            if (fVar.b0(iMin, fVar.y - ((long) iMin), iVar2)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (b0Var.e.K(fVar, 8192L) != -1) {
                    jMax = Math.max(jMax, j4);
                    i2 = i;
                    iVar3 = iVar2;
                }
            }
            return -1L;
        }
    }

    public static final String d(int i) {
        com.google.android.material.shape.e.a(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final k0 e(x xVar, okio.k kVar, kotlin.jvm.functions.l lVar) {
        Throwable th;
        Throwable th2;
        kVar.getClass();
        s sVarA0 = kVar.a0(xVar);
        try {
            long size = sVarA0.size() - ((long) 22);
            long j = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + sVarA0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            while (true) {
                b0 b0Var = new b0(sVarA0.a(size));
                try {
                    if (b0Var.w() == 101010256) {
                        int iL = b0Var.L() & 65535;
                        int iL2 = b0Var.L() & 65535;
                        long jL = b0Var.L() & 65535;
                        if (jL != (b0Var.L() & 65535) || iL != 0 || iL2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        long j2 = j;
                        b0Var.skip(4L);
                        long jW = 4294967295L & ((long) b0Var.w());
                        int iL3 = b0Var.L() & 65535;
                        v vVar = new v(jL, jW, iL3);
                        b0Var.N(iL3);
                        b0Var.close();
                        long j3 = size - ((long) 20);
                        Throwable th3 = null;
                        if (j3 > j2) {
                            b0 b0Var2 = new b0(sVarA0.a(j3));
                            try {
                                if (b0Var2.w() == 117853008) {
                                    int iW = b0Var2.w();
                                    long jZ = b0Var2.z();
                                    if (b0Var2.w() != 1 || iW != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    b0 b0Var3 = new b0(sVarA0.a(jZ));
                                    try {
                                        int iW2 = b0Var3.w();
                                        if (iW2 != 101075792) {
                                            throw new IOException("bad zip: expected " + d(101075792) + " but was " + d(iW2));
                                        }
                                        b0Var3.skip(12L);
                                        int iW3 = b0Var3.w();
                                        int iW4 = b0Var3.w();
                                        long jZ2 = b0Var3.z();
                                        if (jZ2 != b0Var3.z() || iW3 != 0 || iW4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        b0Var3.skip(8L);
                                        v vVar2 = new v(jZ2, b0Var3.z(), iL3);
                                        try {
                                            b0Var3.close();
                                            th2 = null;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                        }
                                        vVar = vVar2;
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            b0Var3.close();
                                        } catch (Throwable th6) {
                                            kotlin.a.a(th5, th6);
                                        }
                                        th2 = th5;
                                    }
                                }
                                try {
                                    b0Var2.close();
                                    th = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    b0Var2.close();
                                } catch (Throwable th9) {
                                    kotlin.a.a(th8, th9);
                                }
                                th = th8;
                            }
                            if (th != null) {
                                throw th;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        b0 b0Var4 = new b0(sVarA0.a(vVar.b));
                        try {
                            long j4 = vVar.a;
                            while (j2 < j4) {
                                i iVarF = f(b0Var4);
                                if (iVarF.h >= vVar.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) lVar.invoke(iVarF)).booleanValue()) {
                                    arrayList.add(iVarF);
                                }
                                j2++;
                            }
                            try {
                                b0Var4.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        } catch (Throwable th11) {
                            try {
                                b0Var4.close();
                            } catch (Throwable th12) {
                                kotlin.a.a(th11, th12);
                            }
                            th3 = th11;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        k0 k0Var = new k0(xVar, kVar, b(arrayList));
                        try {
                            sVarA0.close();
                        } catch (Throwable unused) {
                        }
                        return k0Var;
                    }
                    long j5 = j;
                    b0Var.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j = j5;
                } catch (Throwable th13) {
                    b0Var.close();
                    throw th13;
                }
            }
        } catch (Throwable th14) {
            if (sVarA0 == null) {
                throw th14;
            }
            try {
                sVarA0.close();
                throw th14;
            } catch (Throwable th15) {
                kotlin.a.a(th14, th15);
                throw th14;
            }
        }
    }

    public static final i f(final b0 b0Var) throws IOException {
        int iW = b0Var.w();
        if (iW != 33639248) {
            throw new IOException("bad zip: expected " + d(33639248) + " but was " + d(iW));
        }
        b0Var.skip(4L);
        short sL = b0Var.L();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            net.luminis.tls.engine.impl.c.t("unsupported zip: general purpose bit flag=".concat(d(i)));
            return null;
        }
        int iL = b0Var.L() & 65535;
        int iL2 = b0Var.L() & 65535;
        int iL3 = b0Var.L() & 65535;
        long jW = ((long) b0Var.w()) & 4294967295L;
        final y yVar = new y();
        yVar.e = ((long) b0Var.w()) & 4294967295L;
        final y yVar2 = new y();
        yVar2.e = ((long) b0Var.w()) & 4294967295L;
        int iL4 = b0Var.L() & 65535;
        int iL5 = b0Var.L() & 65535;
        int iL6 = b0Var.L() & 65535;
        b0Var.skip(8L);
        final y yVar3 = new y();
        yVar3.e = ((long) b0Var.w()) & 4294967295L;
        String strN = b0Var.N(iL4);
        if (kotlin.text.k.U(strN, (char) 0)) {
            net.luminis.tls.engine.impl.c.t("bad zip: filename contains 0x00");
            return null;
        }
        long j = yVar2.e == 4294967295L ? 8 : 0L;
        if (yVar.e == 4294967295L) {
            j += (long) 8;
        }
        if (yVar3.e == 4294967295L) {
            j += (long) 8;
        }
        final long j2 = j;
        final z zVar = new z();
        final z zVar2 = new z();
        final z zVar3 = new z();
        final kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        g(b0Var, iL5, new p() { // from class: okio.internal.l
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                b0 b0Var2 = b0Var;
                if (iIntValue == 1) {
                    kotlin.jvm.internal.v vVar2 = vVar;
                    if (vVar2.e) {
                        net.luminis.tls.engine.impl.c.t("bad zip: zip64 extra repeated");
                        return null;
                    }
                    vVar2.e = true;
                    if (jLongValue < j2) {
                        net.luminis.tls.engine.impl.c.t("bad zip: zip64 extra too short");
                        return null;
                    }
                    y yVar4 = yVar2;
                    long jZ = yVar4.e;
                    if (jZ == 4294967295L) {
                        jZ = b0Var2.z();
                    }
                    yVar4.e = jZ;
                    y yVar5 = yVar;
                    yVar5.e = yVar5.e == 4294967295L ? b0Var2.z() : 0L;
                    y yVar6 = yVar3;
                    yVar6.e = yVar6.e == 4294967295L ? b0Var2.z() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        net.luminis.tls.engine.impl.c.t("bad zip: NTFS extra too short");
                        return null;
                    }
                    b0Var2.skip(4L);
                    b.g(b0Var2, (int) (jLongValue - 4), new k(zVar, b0Var2, zVar2, zVar3));
                }
                return kotlin.y.a;
            }
        });
        if (j2 > 0 && !vVar.e) {
            net.luminis.tls.engine.impl.c.t("bad zip: zip64 extra required but absent");
            return null;
        }
        String strN2 = b0Var.N(iL6);
        String str = x.y;
        return new i(f0.i("/").g(strN), r.H(strN, "/", false), strN2, jW, yVar.e, yVar2.e, iL, yVar3.e, iL3, iL2, (Long) zVar.e, (Long) zVar2.e, (Long) zVar3.e, 57344);
    }

    public static final void g(b0 b0Var, int i, p pVar) throws IOException {
        okio.f fVar = b0Var.y;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                net.luminis.tls.engine.impl.c.t("bad zip: truncated header in extra field");
                return;
            }
            int iL = b0Var.L() & 65535;
            long jL = ((long) b0Var.L()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jL) {
                net.luminis.tls.engine.impl.c.t("bad zip: truncated value in extra field");
                return;
            }
            b0Var.R(jL);
            long j3 = fVar.y;
            pVar.invoke(Integer.valueOf(iL), Long.valueOf(jL));
            long j4 = (fVar.y + jL) - j3;
            if (j4 < 0) {
                net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iL, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    fVar.skip(j4);
                }
                j = j2 - jL;
            }
        }
    }

    public static final i h(b0 b0Var, i iVar) throws IOException {
        int iW = b0Var.w();
        if (iW != 67324752) {
            throw new IOException("bad zip: expected " + d(67324752) + " but was " + d(iW));
        }
        b0Var.skip(2L);
        short sL = b0Var.L();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            net.luminis.tls.engine.impl.c.t("unsupported zip: general purpose bit flag=".concat(d(i)));
            return null;
        }
        b0Var.skip(18L);
        long jL = ((long) b0Var.L()) & 65535;
        int iL = b0Var.L() & 65535;
        b0Var.skip(jL);
        if (iVar == null) {
            b0Var.skip(iL);
            return null;
        }
        z zVar = new z();
        z zVar2 = new z();
        z zVar3 = new z();
        g(b0Var, iL, new k(b0Var, zVar, zVar2, zVar3));
        return new i(iVar.a, iVar.b, iVar.c, iVar.d, iVar.e, iVar.f, iVar.g, iVar.h, iVar.i, iVar.j, iVar.k, iVar.l, iVar.m, (Integer) zVar.e, (Integer) zVar2.e, (Integer) zVar3.e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final int i(e0 e0Var, int i) {
        int i2;
        int[] iArr = e0Var.C;
        int i3 = i + 1;
        int length = e0Var.B.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
