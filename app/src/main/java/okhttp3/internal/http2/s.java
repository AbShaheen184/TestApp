package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {
    public static final Logger A;
    public final okio.h e;
    public final r y;
    public final e z;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        logger.getClass();
        A = logger;
    }

    public s(okio.b0 b0Var) {
        b0Var.getClass();
        this.e = b0Var;
        r rVar = new r(b0Var);
        this.y = rVar;
        this.z = new e(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f9 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #7 {, blocks: (B:194:0x02f3, B:196:0x02f9), top: B:240:0x02f3 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0306  */
    /* JADX WARN: Code duplicated, block: B:238:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    public final boolean a(boolean z, com.app.mlounge.ui.screens.downloads.e eVar) throws Exception {
        o oVar;
        w wVarM;
        okio.i iVarK;
        o oVar2;
        try {
            this.e.R(9L);
            int iO = okhttp3.internal.e.o(this.e);
            if (iO > 16384) {
                net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iO, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i = this.e.readByte() & 255;
            byte b = this.e.readByte();
            int i2 = b & 255;
            int i3 = this.e.readInt();
            int i4 = Integer.MAX_VALUE & i3;
            int i5 = 1;
            if (i != 8) {
                Logger logger = A;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i4, iO, i, i2));
                }
            }
            if (z && i != 4) {
                net.luminis.tls.engine.impl.c.q(h.a(i), "Expected a SETTINGS frame but was ");
                return false;
            }
            b bVar = null;
            switch (i) {
                case 0:
                    g(eVar, iO, i2, i4);
                    return true;
                case 1:
                    w(eVar, iO, i2, i4);
                    return true;
                case 2:
                    if (iO != 5) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.p("TYPE_PRIORITY length: ", iO, " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        net.luminis.tls.engine.impl.c.t("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    okio.h hVar = this.e;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (iO != 4) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.p("TYPE_RST_STREAM length: ", iO, " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        net.luminis.tls.engine.impl.c.t("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i6 = this.e.readInt();
                    b.y.getClass();
                    for (b bVar2 : b.values()) {
                        if (bVar2.e == i6) {
                            bVar = bVar2;
                            if (bVar != null) {
                                net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i6, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            oVar = (o) eVar.z;
                            if (i4 == 0 && (i3 & 1) == 0) {
                                okhttp3.internal.concurrent.c.c(oVar.F, oVar.z + '[' + i4 + "] onReset", 0L, new k(oVar, i4, bVar, i5), 6);
                                return true;
                            }
                            wVarM = oVar.m(i4);
                            if (wVarM != null) {
                                synchronized (wVarM) {
                                    if (wVarM.h() == null) {
                                        wVarM.I = bVar;
                                        wVarM.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (bVar != null) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i6, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    oVar = (o) eVar.z;
                    if (i4 == 0) {
                    }
                    wVarM = oVar.m(i4);
                    if (wVarM != null) {
                        synchronized (wVarM) {
                            if (wVarM.h() == null) {
                                wVarM.I = bVar;
                                wVarM.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    okio.h hVar2 = this.e;
                    if (i4 != 0) {
                        net.luminis.tls.engine.impl.c.t("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iO != 0) {
                            net.luminis.tls.engine.impl.c.t("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iO % 6 != 0) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iO, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    a0 a0Var = new a0();
                    kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, iO), 6);
                    int i7 = bVarO.e;
                    int i8 = bVarO.y;
                    int i9 = bVarO.z;
                    if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                        while (true) {
                            short s = hVar2.readShort();
                            byte[] bArr = okhttp3.internal.e.a;
                            int i10 = s & 65535;
                            int i11 = hVar2.readInt();
                            if (i10 != 2) {
                                if (i10 != 4) {
                                    if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (i11 < 0) {
                                    net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i11 != 0 && i11 != 1) {
                                net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            a0Var.b(i10, i11);
                            if (i7 != i8) {
                                i7 += i9;
                            }
                        }
                    }
                    o oVar3 = (o) eVar.z;
                    okhttp3.internal.concurrent.c.c(oVar3.E, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), oVar3.z, " applyAndAckSettings"), 0L, new com.app.mlounge.ui.screens.movies.g(17, eVar, a0Var), 6);
                    return true;
                case 5:
                    z(eVar, iO, i2, i4);
                    return true;
                case 6:
                    if (iO != 8) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iO, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        net.luminis.tls.engine.impl.c.t("TYPE_PING streamId != 0");
                        return false;
                    }
                    final int i12 = this.e.readInt();
                    final int i13 = this.e.readInt();
                    i = (b & 1) != 0 ? 1 : 0;
                    o oVar4 = (o) eVar.z;
                    if (i == 0) {
                        okhttp3.internal.concurrent.c cVar = oVar4.E;
                        String strU = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), ((o) eVar.z).z, " ping");
                        final o oVar5 = (o) eVar.z;
                        okhttp3.internal.concurrent.c.c(cVar, strU, 0L, new kotlin.jvm.functions.a() { // from class: okhttp3.internal.http2.n
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                o oVar6 = oVar5;
                                try {
                                    oVar6.U.L(i12, i13, true);
                                } catch (IOException e) {
                                    b bVar3 = b.PROTOCOL_ERROR;
                                    oVar6.a(bVar3, bVar3, e);
                                }
                                return kotlin.y.a;
                            }
                        }, 6);
                        return true;
                    }
                    synchronized (oVar4) {
                        try {
                            if (i12 == 1) {
                                oVar4.J++;
                            } else if (i12 == 2) {
                                oVar4.L++;
                            } else if (i12 == 3) {
                                oVar4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iO < 8) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iO, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        net.luminis.tls.engine.impl.c.t("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i14 = this.e.readInt();
                    int i15 = this.e.readInt();
                    int i16 = iO - 8;
                    b.y.getClass();
                    for (b bVar3 : b.values()) {
                        if (bVar3.e == i15) {
                            bVar = bVar3;
                            if (bVar != null) {
                                net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i15, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            iVarK = okio.i.A;
                            if (i16 > 0) {
                                iVarK = this.e.k(i16);
                            }
                            iVarK.getClass();
                            iVarK.f();
                            oVar2 = (o) eVar.z;
                            synchronized (oVar2) {
                                Object[] array = oVar2.y.values().toArray(new w[0]);
                                oVar2.C = true;
                            }
                            for (w wVar : (w[]) array) {
                                if (wVar.e <= i14 && wVar.i()) {
                                    b bVar4 = b.REFUSED_STREAM;
                                    synchronized (wVar) {
                                        if (wVar.h() == null) {
                                            wVar.I = bVar4;
                                            wVar.notifyAll();
                                        }
                                        break;
                                    }
                                    ((o) eVar.z).m(wVar.e);
                                }
                            }
                            return true;
                        }
                    }
                    if (bVar != null) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i15, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    iVarK = okio.i.A;
                    if (i16 > 0) {
                        iVarK = this.e.k(i16);
                    }
                    iVarK.getClass();
                    iVarK.f();
                    oVar2 = (o) eVar.z;
                    synchronized (oVar2) {
                        Object[] array2 = oVar2.y.values().toArray(new w[0]);
                        oVar2.C = true;
                        while (i < r3) {
                            if (wVar.e <= i14) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iO != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iO);
                        }
                        long j = 2147483647L & ((long) this.e.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = A;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i4, j, iO, true));
                        }
                        o oVar6 = (o) eVar.z;
                        if (i4 == 0) {
                            synchronized (oVar6) {
                                oVar6.S += j;
                                oVar6.notifyAll();
                            }
                            return true;
                        }
                        w wVarG = oVar6.g(i4);
                        if (wVarG != null) {
                            synchronized (wVarG) {
                                wVarG.B += j;
                                if (j > 0) {
                                    wVarG.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        A.fine(h.b(true, i4, iO, 8, i2));
                        throw e;
                    }
                default:
                    this.e.skip(iO);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    public final void g(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        final int iA = q.a(i, i2, i4);
        okio.h hVar = this.e;
        hVar.getClass();
        final o oVar = (o) eVar.z;
        if (i3 != 0 && (i3 & 1) == 0) {
            final okio.f fVar = new okio.f();
            long j = iA;
            hVar.R(j);
            hVar.K(fVar, j);
            okhttp3.internal.concurrent.c.c(oVar.F, oVar.z + '[' + i3 + "] onData", 0L, new kotlin.jvm.functions.a(i3, fVar, iA, z4) { // from class: okhttp3.internal.http2.j
                public final /* synthetic */ int A;
                public final /* synthetic */ int y;
                public final /* synthetic */ okio.f z;

                @Override // kotlin.jvm.functions.a
                public final Object invoke() {
                    o oVar2 = this.e;
                    int i5 = this.y;
                    okio.f fVar2 = this.z;
                    int i6 = this.A;
                    try {
                        oVar2.H.getClass();
                        fVar2.skip(i6);
                        oVar2.U.N(i5, b.CANCEL);
                        synchronized (oVar2) {
                            oVar2.W.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return kotlin.y.a;
                }
            }, 6);
        } else {
            w wVarG = oVar.g(i3);
            if (wVarG == null) {
                ((o) eVar.z).N(i3, b.PROTOCOL_ERROR);
                long j2 = iA;
                ((o) eVar.z).z(j2);
                hVar.skip(j2);
            } else {
                TimeZone timeZone = okhttp3.internal.g.a;
                u uVar = wVarG.E;
                long j3 = iA;
                uVar.getClass();
                long j4 = j3;
                while (true) {
                    w wVar = uVar.C;
                    if (j4 <= 0) {
                        z = z4;
                        TimeZone timeZone2 = okhttp3.internal.g.a;
                        wVar.y.z(j3);
                        uVar.C.y.N.getClass();
                        break;
                    }
                    synchronized (wVar) {
                        z2 = uVar.y;
                        z = z4;
                        z3 = uVar.A.y + j4 > uVar.e;
                    }
                    if (z3) {
                        hVar.skip(j4);
                        uVar.C.g(b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        hVar.skip(j4);
                        break;
                    }
                    long jK = hVar.K(uVar.z, j4);
                    if (jK == -1) {
                        throw new EOFException();
                    }
                    j4 -= jK;
                    w wVar2 = uVar.C;
                    synchronized (wVar2) {
                        try {
                            if (uVar.B) {
                                uVar.z.a();
                            } else {
                                okio.f fVar2 = uVar.A;
                                boolean z5 = fVar2.y == 0;
                                fVar2.n0(uVar.z);
                                if (z5) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z4 = z;
                }
                if (z) {
                    wVarG.k(okhttp3.r.y, true);
                }
            }
        }
        this.e.skip(i4);
    }

    public final List m(int i, int i2, int i3, int i4) throws IOException {
        r rVar = this.y;
        rVar.B = i;
        rVar.y = i;
        rVar.C = i2;
        rVar.z = i3;
        rVar.A = i4;
        e eVar = this.z;
        okio.b0 b0Var = eVar.c;
        ArrayList arrayList = eVar.b;
        while (!b0Var.a()) {
            byte b = b0Var.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            int i5 = b & 255;
            if (i5 == 128) {
                net.luminis.tls.engine.impl.c.t("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = eVar.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    d[] dVarArr = g.a;
                    if (i6 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i6]);
                    }
                }
                int length = eVar.e + 1 + (i6 - g.a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        dVar.getClass();
                        arrayList.add(dVar);
                    }
                }
                net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                d[] dVarArr3 = g.a;
                okio.i iVarD = eVar.d();
                g.a(iVarD);
                eVar.c(new d(iVarD, eVar.d()));
            } else if ((b & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i5, 63) - 1), eVar.d()));
            } else if ((b & 32) == 32) {
                int iE2 = eVar.e(i5, 31);
                eVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.a);
                }
                int i7 = eVar.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.d;
                        kotlin.collections.n.K(0, dVarArr4.length, null, dVarArr4);
                        eVar.e = eVar.d.length - 1;
                        eVar.f = 0;
                        eVar.g = 0;
                    } else {
                        eVar.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                d[] dVarArr5 = g.a;
                okio.i iVarD2 = eVar.d();
                g.a(iVarD2);
                arrayList.add(new d(iVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i5, 15) - 1), eVar.d()));
            }
        }
        List listK0 = kotlin.collections.o.k0(arrayList);
        arrayList.clear();
        return listK0;
    }

    public final void w(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        if (i3 == 0) {
            net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            okio.h hVar = this.e;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = okhttp3.internal.e.a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List listM = m(q.a(i5, i2, i4), i4, i2, i3);
        o oVar = (o) eVar.z;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            okhttp3.internal.concurrent.c.c(oVar.F, oVar.z + '[' + i3 + "] onHeaders", 0L, new k(oVar, i3, listM, z2), 6);
            return;
        }
        synchronized (oVar) {
            try {
                w wVarG = oVar.g(i3);
                if (wVarG != null) {
                    wVarG.k(okhttp3.internal.g.h(listM), z2);
                    return;
                }
                if (oVar.C) {
                    return;
                }
                if (i3 <= oVar.A) {
                    return;
                }
                if (i3 % 2 == oVar.B % 2) {
                    return;
                }
                try {
                    w wVar = new w(i3, oVar, false, z2, okhttp3.internal.g.h(listM));
                    oVar.A = i3;
                    oVar.y.put(Integer.valueOf(i3), wVar);
                    okhttp3.internal.concurrent.c.c(oVar.D.d(), oVar.z + '[' + i3 + "] onStream", 0L, new com.app.mlounge.ui.screens.movies.g(16, oVar, wVar), 6);
                    return;
                } catch (Throwable th) {
                    th = th;
                    oVar = oVar;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }
    }

    public final void z(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.e.readInt() & Integer.MAX_VALUE;
        List listM = m(q.a(i - 4, i2, i4), i4, i2, i3);
        o oVar = (o) eVar.z;
        synchronized (oVar) {
            if (oVar.W.contains(Integer.valueOf(i6))) {
                oVar.N(i6, b.PROTOCOL_ERROR);
                return;
            }
            oVar.W.add(Integer.valueOf(i6));
            okhttp3.internal.concurrent.c.c(oVar.F, oVar.z + '[' + i6 + "] onRequest", 0L, new k(oVar, i6, listM, i5), 6);
        }
    }
}
