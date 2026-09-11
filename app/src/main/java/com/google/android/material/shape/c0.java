package com.google.android.material.shape;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.internal.f0;
import com.google.common.util.concurrent.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.h0;
import okhttp3.j0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements com.google.firebase.crashlytics.internal.analytics.b, com.google.firebase.crashlytics.internal.breadcrumbs.a, com.google.android.gms.tasks.h, okhttp3.internal.connection.g, retrofit2.m {
    public Object e;

    public /* synthetic */ c0(Object obj) {
        this.e = obj;
    }

    public static String k(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.n a() throws Throwable {
        IOException iOException = null;
        while (!((okhttp3.internal.connection.o) this.e).l.N) {
            try {
                okhttp3.internal.connection.r rVarB = ((okhttp3.internal.connection.o) this.e).b();
                if (!rVarB.a()) {
                    okhttp3.internal.connection.q qVarE = rVarB.e();
                    if (qVarE.b == null && qVarE.c == null) {
                        qVarE = rVarB.g();
                    }
                    okhttp3.internal.connection.r rVar = qVarE.b;
                    Throwable th = qVarE.c;
                    if (th != null) {
                        throw th;
                    }
                    if (rVar != null) {
                        ((okhttp3.internal.connection.o) this.e).q.addFirst(rVar);
                    }
                }
                return rVarB.d();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    kotlin.a.a(iOException, e);
                }
                if (!((okhttp3.internal.connection.o) this.e).a(null)) {
                    throw iOException;
                }
            }
        }
        net.luminis.tls.engine.impl.c.t("Canceled");
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public void b(com.google.firebase.crashlytics.internal.common.p pVar) {
        this.e = pVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.o c() {
        return (okhttp3.internal.connection.o) this.e;
    }

    @Override // retrofit2.m
    public Object d(Object obj) {
        Charset charsetA;
        j0 j0Var = (j0) obj;
        h0 h0Var = j0Var.e;
        if (h0Var == null) {
            okio.h hVarP = j0Var.P();
            okhttp3.u uVarW = j0Var.w();
            if (uVarW == null || (charsetA = okhttp3.u.a(uVarW)) == null) {
                charsetA = kotlin.text.a.a;
            }
            h0Var = new h0(hVarP, charsetA);
            j0Var.e = h0Var;
        }
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(h0Var);
        aVar.L = 2;
        try {
            Object objB = ((com.google.gson.n) this.e).b(aVar);
            if (aVar.n0() != 10) {
                throw new com.google.gson.i("JSON document was not fully consumed.", 8);
            }
            j0Var.close();
            return objB;
        } catch (Throwable th) {
            j0Var.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.q e(Object obj) {
        com.google.firebase.crashlytics.internal.settings.a aVar = (com.google.firebase.crashlytics.internal.settings.a) obj;
        g0 g0Var = (g0) this.e;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return kotlin.math.a.t(null);
        }
        com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) g0Var.z;
        com.google.firebase.crashlytics.internal.common.m.a(mVar);
        mVar.m.l(null, mVar.e.a);
        mVar.q.d(null);
        return kotlin.math.a.t(null);
    }

    public void f(com.appsalt.internal.j0 j0Var, Thread thread, Throwable th) {
        com.google.android.gms.tasks.q qVarD;
        com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) this.e;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            com.google.common.base.b.q();
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.firebase.crashlytics.internal.concurrency.b bVar = mVar.e.a;
            com.google.firebase.crashlytics.internal.common.k kVar = new com.google.firebase.crashlytics.internal.common.k(mVar, jCurrentTimeMillis, th, thread, j0Var);
            synchronized (bVar.y) {
                qVarD = bVar.z.d(bVar.e, new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(kVar, 6));
                bVar.z = qVarD;
            }
            try {
                com.google.firebase.crashlytics.internal.common.w.a(qVarD);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void g(String str, Bundle bundle) {
        com.google.firebase.crashlytics.internal.common.p pVar = (com.google.firebase.crashlytics.internal.common.p) this.e;
        if (pVar != null) {
            try {
                String str2 = "$A$:" + k(str, bundle);
                com.google.firebase.crashlytics.internal.common.q qVar = pVar.a;
                qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:315:0x070d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0716  */
    public net.luminis.tls.handshake.e h(ByteBuffer byteBuffer, net.luminis.tls.engine.b bVar, int i) throws net.luminis.tls.i {
        net.luminis.tls.h hVar;
        boolean zVerify;
        net.luminis.tls.extension.j jVar;
        net.luminis.tls.extension.i iVar;
        net.luminis.tls.extension.l lVar;
        byte b = byteBuffer.get();
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (b == net.luminis.tls.e.client_hello.e) {
            new net.luminis.tls.handshake.d(byteBuffer, (com.google.android.datatransport.runtime.scheduling.jobscheduling.l) this.e);
            ((net.luminis.tls.engine.impl.a) bVar).getClass();
            throw new net.luminis.tls.alert.a("no client hello expected", 8);
        }
        List list = null;
        boolean z = true;
        int length = 0;
        if (b == net.luminis.tls.e.server_hello.e) {
            net.luminis.tls.handshake.g gVar = new net.luminis.tls.handshake.g();
            gVar.d = Collections.EMPTY_LIST;
            int i3 = i2 + 4;
            if (byteBuffer.remaining() < 44) {
                net.luminis.tls.engine.impl.c.g("Message too short");
                return null;
            }
            byteBuffer.getInt();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if (b2 != 3 || b3 != 3) {
                throw new net.luminis.tls.alert.a("Invalid version number (should be 0x0303)", 5);
            }
            byte[] bArr = new byte[32];
            gVar.b = bArr;
            byteBuffer.get(bArr);
            Arrays.equals(gVar.b, net.luminis.tls.handshake.g.e);
            int i4 = byteBuffer.get() & 255;
            if (i4 > 32) {
                net.luminis.tls.engine.impl.c.g("session id length exceeds 32");
                return null;
            }
            byteBuffer.get(new byte[i4]);
            short s = byteBuffer.getShort();
            for (net.luminis.tls.c cVar : net.luminis.tls.c.values()) {
                if (cVar.e == s) {
                    gVar.c = cVar;
                    break;
                }
            }
            if (byteBuffer.get() != 0) {
                net.luminis.tls.engine.impl.c.g("Legacy compression method must have the value 0");
                return null;
            }
            gVar.d = net.luminis.tls.handshake.e.c(byteBuffer, net.luminis.tls.e.server_hello, null);
            gVar.a = new byte[i3];
            byteBuffer.get(gVar.a);
            net.luminis.tls.engine.impl.a aVar = (net.luminis.tls.engine.impl.a) bVar;
            if (aVar.m != 2) {
                return gVar;
            }
            Iterator it = gVar.d.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                if (((net.luminis.tls.extension.g) it.next()) instanceof net.luminis.tls.extension.n) {
                    z2 = true;
                }
            }
            boolean z3 = false;
            for (net.luminis.tls.extension.g gVar2 : gVar.d) {
                if ((gVar2 instanceof net.luminis.tls.extension.k) || (gVar2 instanceof net.luminis.tls.extension.j)) {
                    z3 = true;
                }
            }
            if (!z2 || !z3) {
                throw new net.luminis.tls.alert.a();
            }
            short s2 = -1;
            for (net.luminis.tls.extension.g gVar3 : gVar.d) {
                if (gVar3 instanceof net.luminis.tls.extension.n) {
                    s2 = ((net.luminis.tls.extension.n) gVar3).b;
                }
            }
            if (s2 != 772) {
                throw new net.luminis.tls.alert.a("invalid tls version", 5);
            }
            for (net.luminis.tls.extension.g gVar4 : gVar.d) {
                if (!(gVar4 instanceof net.luminis.tls.extension.o) && !(gVar4 instanceof net.luminis.tls.extension.n) && !(gVar4 instanceof net.luminis.tls.extension.k) && !(gVar4 instanceof net.luminis.tls.extension.j)) {
                    throw new net.luminis.tls.alert.a("illegal extension in server hello", 5);
                }
            }
            Iterator it2 = gVar.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    jVar = null;
                    break;
                }
                net.luminis.tls.extension.g gVar5 = (net.luminis.tls.extension.g) it2.next();
                if (gVar5 instanceof net.luminis.tls.extension.j) {
                    jVar = (net.luminis.tls.extension.j) gVar5;
                    break;
                }
            }
            if (jVar != null) {
                iVar = !jVar.b.isEmpty() ? (net.luminis.tls.extension.i) jVar.b.get(0) : null;
                if (iVar == null) {
                    throw new net.luminis.tls.alert.a("", 5);
                }
                if (iVar.a != aVar.i) {
                    throw new net.luminis.tls.alert.a("server supplied key share does not match client supported named group", 5);
                }
            } else {
                iVar = null;
            }
            Iterator it3 = gVar.d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    lVar = null;
                    break;
                }
                net.luminis.tls.extension.g gVar6 = (net.luminis.tls.extension.g) it3.next();
                if (gVar6 instanceof net.luminis.tls.extension.l) {
                    lVar = (net.luminis.tls.extension.l) gVar6;
                    break;
                }
            }
            if (iVar == null && lVar == null) {
                throw new net.luminis.tls.alert.a(" either the pre_shared_key extension or the key_share extension must be present", net.luminis.tls.b.missing_extension);
            }
            if (lVar != null) {
                aVar.u = true;
            }
            if (!aVar.h.contains(gVar.c)) {
                throw new net.luminis.tls.alert.a("cipher suite does not match", 5);
            }
            net.luminis.tls.c cVar2 = gVar.c;
            aVar.j = cVar2;
            if (aVar.c == null) {
                aVar.o = new net.luminis.tls.engine.impl.f(net.luminis.tls.engine.impl.b.c(cVar2));
                net.luminis.tls.engine.impl.f fVar = aVar.o;
                int iOrdinal = aVar.j.ordinal();
                int i5 = 16;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        i5 = 32;
                    } else if (iOrdinal != 3 && iOrdinal != 4) {
                        com.google.gson.b.l();
                        i5 = 0;
                    }
                }
                aVar.c = new net.luminis.tls.engine.impl.d(fVar, null, i5, net.luminis.tls.engine.impl.b.c(aVar.j));
                aVar.o.d(aVar.n);
                net.luminis.tls.engine.impl.d dVar = aVar.c;
                net.luminis.tls.engine.impl.f fVar2 = dVar.r;
                net.luminis.tls.e eVar = net.luminis.tls.e.client_hello;
                fVar2.getClass();
                dVar.c(dVar.j, "c e traffic", fVar2.c(net.luminis.tls.engine.impl.f.a(eVar)), dVar.e);
                aVar.f.getClass();
            }
            net.luminis.tls.engine.impl.d dVar2 = aVar.c;
            if (lVar != null) {
                dVar2.f = true;
            } else if (dVar2.i != null && !dVar2.f) {
                dVar2.a(new byte[dVar2.e]);
            }
            if (iVar != null) {
                net.luminis.tls.engine.impl.d dVar3 = aVar.c;
                dVar3.h = aVar.b;
                dVar3.g = iVar.a();
                aVar.c.b();
            }
            aVar.o.d(gVar);
            net.luminis.tls.engine.impl.d dVar4 = aVar.c;
            byte[] bArr2 = dVar4.j;
            byte[] bArr3 = dVar4.c;
            short s3 = dVar4.e;
            byte[] bArrC = dVar4.c(bArr2, "derived", bArr3, s3);
            net.luminis.tls.util.a.a(bArrC);
            byte[] bArrH = dVar4.b.H(bArrC, dVar4.s);
            dVar4.o = bArrH;
            net.luminis.tls.util.a.a(bArrH);
            net.luminis.tls.engine.impl.f fVar3 = dVar4.r;
            net.luminis.tls.e eVar2 = net.luminis.tls.e.server_hello;
            fVar3.getClass();
            byte[] bArrC2 = fVar3.c(net.luminis.tls.engine.impl.f.a(eVar2));
            byte[] bArrC3 = dVar4.c(dVar4.o, "c hs traffic", bArrC2, s3);
            dVar4.n = bArrC3;
            net.luminis.tls.util.a.a(bArrC3);
            byte[] bArrC4 = dVar4.c(dVar4.o, "s hs traffic", bArrC2, s3);
            dVar4.m = bArrC4;
            net.luminis.tls.util.a.a(bArrC4);
            byte[] bArr4 = dVar4.n;
            short s4 = dVar4.d;
            Charset charset = net.luminis.tls.engine.impl.d.u;
            net.luminis.tls.util.a.a(dVar4.c(bArr4, "key", "".getBytes(charset), s4));
            net.luminis.tls.util.a.a(dVar4.c(dVar4.m, "key", "".getBytes(charset), s4));
            net.luminis.tls.util.a.a(dVar4.c(dVar4.n, "iv", "".getBytes(charset), (short) 12));
            net.luminis.tls.util.a.a(dVar4.c(dVar4.m, "iv", "".getBytes(charset), (short) 12));
            aVar.m = 3;
            net.luminis.quic.impl.i iVar2 = aVar.f;
            net.luminis.quic.crypto.d dVar5 = iVar2.B;
            net.luminis.tls.engine.impl.a aVar2 = iVar2.Q;
            net.luminis.tls.c cVar3 = aVar2.j;
            if (cVar3 == null) {
                net.luminis.tls.engine.impl.c.r("No (valid) server hello received yet");
                return null;
            }
            synchronized (dVar5) {
                dVar5.a = cVar3;
                dVar5.c(3, cVar3, dVar5.b.a);
                net.luminis.tls.engine.impl.d dVar6 = aVar2.c;
                if (dVar6 == null) {
                    throw new IllegalStateException("Traffic secret not yet available");
                }
                byte[] bArr5 = dVar6.n;
                dVar5.d.getClass();
                dVar5.f[2].b(bArr5);
                net.luminis.tls.engine.impl.d dVar7 = aVar2.c;
                if (dVar7 == null) {
                    throw new IllegalStateException("Traffic secret not yet available");
                }
                byte[] bArr6 = dVar7.m;
                dVar5.d.getClass();
                dVar5.g[2].b(bArr6);
                if (dVar5.h) {
                    dVar5.a(3, "HANDSHAKE_TRAFFIC_SECRET");
                }
            }
            synchronized (iVar2.D) {
                try {
                    if (androidx.constraintlayout.core.g.e(iVar2.C) >= androidx.constraintlayout.core.g.e(2)) {
                        z = false;
                    }
                    if (z) {
                        iVar2.C = 2;
                        Iterator it4 = iVar2.E.iterator();
                        while (it4.hasNext()) {
                            ((net.luminis.quic.recovery.g) it4.next()).d(iVar2.C);
                        }
                    } else {
                        iVar2.z.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar2.G.add(new net.luminis.quic.impl.h(iVar2, 1));
            return gVar;
        }
        if (b == net.luminis.tls.e.encrypted_extensions.e) {
            net.luminis.tls.handshake.b bVar2 = new net.luminis.tls.handshake.b(1);
            bVar2.c = Collections.EMPTY_LIST;
            ArrayList arrayList = new ArrayList();
            Iterator it5 = ((List) bVar2.c).iterator();
            while (it5.hasNext()) {
                arrayList.add(((net.luminis.tls.extension.g) it5.next()).a());
            }
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                length += ((byte[]) it6.next()).length;
            }
            byte[] bArr7 = new byte[length + 6];
            bVar2.b = bArr7;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr7);
            byteBufferWrap.putInt((length + 2) | 134217728);
            byteBufferWrap.putShort((short) length);
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                byteBufferWrap.put((byte[]) it7.next());
            }
            int i6 = i2 + 4;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVar2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.l) this.e;
            if (byteBuffer.remaining() < 6) {
                net.luminis.tls.engine.impl.c.g("Message too short");
                return null;
            }
            int iPosition = byteBuffer.position();
            int i7 = byteBuffer.getInt() & 16777215;
            if (byteBuffer.remaining() < i7 || i7 < 2) {
                net.luminis.tls.engine.impl.c.g("Incorrect message length");
                return null;
            }
            bVar2.c = net.luminis.tls.handshake.e.c(byteBuffer, net.luminis.tls.e.server_hello, lVar2);
            bVar2.b = new byte[i6];
            byteBuffer.get(bVar2.b);
            ((net.luminis.tls.engine.impl.a) bVar).d(bVar2, i);
            return bVar2;
        }
        net.luminis.tls.e eVar3 = net.luminis.tls.e.certificate;
        if (b == eVar3.e) {
            net.luminis.tls.handshake.a aVar3 = new net.luminis.tls.handshake.a();
            ArrayList arrayList2 = new ArrayList();
            aVar3.c = arrayList2;
            int iPosition2 = byteBuffer.position();
            int iD = aVar3.d(byteBuffer, eVar3, 13);
            try {
                int i8 = byteBuffer.get() & 255;
                if (i8 > 0) {
                    byte[] bArr8 = new byte[i8];
                    aVar3.a = bArr8;
                    byteBuffer.get(bArr8);
                } else {
                    aVar3.a = new byte[0];
                }
                aVar3.e(byteBuffer);
                aVar3.d = new byte[iD + 4];
                byteBuffer.get(aVar3.d);
                net.luminis.tls.engine.impl.a aVar4 = (net.luminis.tls.engine.impl.a) bVar;
                if (i != 2) {
                    aVar4.getClass();
                    throw new net.luminis.tls.alert.a("incorrect protection level", 8);
                }
                int i9 = aVar4.m;
                if (i9 != 5 && i9 != 4) {
                    throw new net.luminis.tls.alert.a("unexpected certificate message", 8);
                }
                if (aVar3.a.length > 0) {
                    throw new net.luminis.tls.alert.a("certificate request context should be zero length", 5);
                }
                X509Certificate x509Certificate = aVar3.b;
                if (x509Certificate == null) {
                    throw new net.luminis.tls.alert.a("missing certificate", 5);
                }
                aVar4.q = x509Certificate;
                aVar4.r = arrayList2;
                aVar4.o.f(aVar3);
                aVar4.m = 6;
                return aVar3;
            } catch (BufferUnderflowException unused) {
                net.luminis.tls.engine.impl.c.g("message underflow");
                return null;
            }
        }
        net.luminis.tls.e eVar4 = net.luminis.tls.e.certificate_request;
        if (b == eVar4.e) {
            net.luminis.tls.handshake.b bVar3 = new net.luminis.tls.handshake.b(0);
            int iPosition3 = byteBuffer.position();
            int iD2 = bVar3.d(byteBuffer, eVar4, 7);
            int i10 = byteBuffer.get();
            byte[] bArr9 = new byte[i10];
            if (i10 > 0) {
                byteBuffer.get(bArr9);
            }
            bVar3.c = net.luminis.tls.handshake.e.c(byteBuffer, eVar4, null);
            if (byteBuffer.position() - (iPosition3 + 4) != iD2) {
                net.luminis.tls.engine.impl.c.g("inconsistent length");
                return null;
            }
            bVar3.b = new byte[iD2 + 4];
            byteBuffer.get(bVar3.b);
            net.luminis.tls.engine.impl.a aVar5 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 2) {
                aVar5.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            if (aVar5.m != 4) {
                throw new net.luminis.tls.alert.a("unexpected certificate request message", 8);
            }
            for (net.luminis.tls.extension.g gVar7 : (ArrayList) bVar3.c) {
                if (gVar7 instanceof net.luminis.tls.extension.m) {
                    list = ((net.luminis.tls.extension.m) gVar7).a;
                    break;
                }
            }
            if (list == null) {
                throw new net.luminis.tls.alert.a();
            }
            aVar5.y = list;
            aVar5.o.d(bVar3);
            aVar5.w = new ArrayList();
            for (net.luminis.tls.extension.g gVar8 : (ArrayList) bVar3.c) {
                if (gVar8 instanceof net.luminis.tls.extension.b) {
                    aVar5.w = ((net.luminis.tls.extension.b) gVar8).a;
                    break;
                }
            }
            aVar5.v = true;
            aVar5.m = 5;
            return bVar3;
        }
        net.luminis.tls.e eVar5 = net.luminis.tls.e.certificate_verify;
        if (b != eVar5.e) {
            net.luminis.tls.e eVar6 = net.luminis.tls.e.finished;
            if (b == eVar6.e) {
                net.luminis.tls.handshake.b bVar4 = new net.luminis.tls.handshake.b(2);
                byte[] bArr10 = new byte[bVar4.d(byteBuffer, eVar6, 36)];
                bVar4.b = bArr10;
                byteBuffer.get(bArr10);
                byte[] bArr11 = new byte[i2 + 4];
                bVar4.c = bArr11;
                byteBuffer.get(bArr11);
                ((net.luminis.tls.engine.impl.a) bVar).e(bVar4, i);
                return bVar4;
            }
            net.luminis.tls.e eVar7 = net.luminis.tls.e.new_session_ticket;
            if (b != eVar7.e) {
                throw new net.luminis.tls.i(androidx.privacysandbox.ads.adservices.java.internal.a.p("Invalid/unsupported message type (", b, ")"));
            }
            net.luminis.tls.handshake.f fVar4 = new net.luminis.tls.handshake.f();
            int iD3 = fVar4.d(byteBuffer, eVar7, 17);
            int i11 = byteBuffer.getInt();
            fVar4.d = i11;
            if (i11 > 604800 || i11 < 0) {
                throw new net.luminis.tls.alert.a("Invalid ticket lifetime", 5);
            }
            fVar4.a = ((long) byteBuffer.getInt()) & 4294967295L;
            int i12 = iD3 - 8;
            byte[] bArrE = net.luminis.tls.handshake.f.e(byteBuffer, 1, i12, "ticket nonce");
            fVar4.c = bArrE;
            fVar4.b = net.luminis.tls.handshake.f.e(byteBuffer, 2, i12 - (bArrE.length + 1), "ticket");
            for (net.luminis.tls.extension.g gVar9 : net.luminis.tls.handshake.e.c(byteBuffer, eVar7, null)) {
                if (gVar9 instanceof net.luminis.tls.extension.f) {
                    if (fVar4.e != null) {
                        net.luminis.tls.engine.impl.c.g("repeated extension is not allowed");
                        return null;
                    }
                    fVar4.e = (net.luminis.tls.extension.f) gVar9;
                }
            }
            net.luminis.tls.engine.impl.a aVar6 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 3) {
                aVar6.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            net.luminis.tls.engine.impl.d dVar8 = aVar6.c;
            dVar8.c(dVar8.l, "resumption", fVar4.c, dVar8.e);
            androidx.media3.exoplayer.image.f fVar5 = new androidx.media3.exoplayer.image.f(4);
            fVar5.d = new Date();
            fVar5.b = fVar4.d;
            net.luminis.tls.extension.f fVar6 = fVar4.e;
            z = fVar6 != null;
            if (z) {
                fVar5.c = fVar6.a.longValue();
            }
            aVar6.t.add(fVar5);
            net.luminis.quic.impl.i iVar3 = aVar6.f;
            iVar3.getClass();
            if (z && fVar5.c != 4294967295L) {
                iVar3.z.d("Invalid quic new session ticket (invalid early data size); ignoring ticket.");
            }
            List list2 = iVar3.h0;
            net.luminis.quic.impl.m mVar = iVar3.e0;
            f0 f0Var = new f0(14);
            long j = mVar.b;
            list2.add(f0Var);
            return fVar4;
        }
        net.luminis.tls.handshake.c cVar4 = new net.luminis.tls.handshake.c();
        int i13 = i2 + 4;
        int iPosition4 = byteBuffer.position();
        int iD4 = cVar4.d(byteBuffer, eVar5, 9);
        try {
            short s5 = byteBuffer.getShort();
            net.luminis.tls.h[] hVarArrValues = net.luminis.tls.h.values();
            int length2 = hVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i14];
                if (hVar.e == s5) {
                    break;
                }
                i14++;
            }
            cVar4.a = hVar;
            byte[] bArr12 = new byte[byteBuffer.getShort() & 65535];
            cVar4.b = bArr12;
            byteBuffer.get(bArr12);
            if (byteBuffer.position() - iPosition4 != iD4 + 4) {
                throw new net.luminis.tls.alert.a("Incorrect message length", 2);
            }
            cVar4.c = new byte[i13];
            byteBuffer.get(cVar4.c);
            net.luminis.tls.engine.impl.a aVar7 = (net.luminis.tls.engine.impl.a) bVar;
            if (i != 2) {
                aVar7.getClass();
                throw new net.luminis.tls.alert.a("incorrect protection level", 8);
            }
            if (aVar7.m != 6) {
                throw new net.luminis.tls.alert.a("unexpected certificate verify message", 8);
            }
            net.luminis.tls.h hVar2 = cVar4.a;
            if (hVar2 == null || !aVar7.p.contains(hVar2)) {
                throw new net.luminis.tls.alert.a("signature scheme does not match", 5);
            }
            byte[] bArr13 = cVar4.b;
            X509Certificate x509Certificate2 = aVar7.q;
            net.luminis.tls.engine.impl.f fVar7 = aVar7.o;
            fVar7.getClass();
            byte[] bArrC5 = fVar7.c(net.luminis.tls.engine.impl.f.b(eVar3, false));
            Charset charset2 = net.luminis.tls.engine.impl.a.A;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate("TLS 1.3, server CertificateVerify".getBytes(charset2).length + 65 + bArrC5.length);
            for (int i15 = 0; i15 < 64; i15++) {
                byteBufferAllocate.put((byte) 32);
            }
            byteBufferAllocate.put("TLS 1.3, server CertificateVerify".getBytes(charset2));
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put(bArrC5);
            try {
                Signature signatureB = aVar7.b(hVar2);
                signatureB.initVerify(x509Certificate2);
                signatureB.update(byteBufferAllocate.array());
                zVerify = signatureB.verify(bArr13);
            } catch (InvalidKeyException | SignatureException unused2) {
                zVerify = false;
            }
            if (!zVerify) {
                throw new net.luminis.tls.alert.a("signature verification fails", 3);
            }
            List list3 = aVar7.r;
            try {
                X509Certificate[] x509CertificateArr = new X509Certificate[list3.size()];
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    x509CertificateArr[i16] = (X509Certificate) list3.get(i16);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
                trustManagerFactory.init((KeyStore) null);
                ((X509TrustManager) trustManagerFactory.getTrustManagers()[0]).checkServerTrusted(x509CertificateArr, "UNKNOWN");
                f0 f0Var2 = aVar7.s;
                String str = aVar7.g;
                X509Certificate x509Certificate3 = aVar7.q;
                f0Var2.getClass();
                boolean z4 = false;
                try {
                    if (!f0.l(x509Certificate3.getSubjectAlternativeNames(), str)) {
                        String[] strArrSplit = x509Certificate3.getSubjectDN().getName().split(",");
                        int length3 = strArrSplit.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length3) {
                                String str2 = strArrSplit[i17];
                                if (str2.trim().startsWith("CN=") && !str2.trim().substring(3).equals(str)) {
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (z4) {
                            throw new net.luminis.tls.alert.a("servername does not match", net.luminis.tls.b.certificate_unknown);
                        }
                        aVar7.o.f(cVar4);
                        aVar7.m = 7;
                        return cVar4;
                    }
                    z4 = true;
                    break;
                } catch (CertificateParsingException unused3) {
                }
                if (z4) {
                    throw new net.luminis.tls.alert.a("servername does not match", net.luminis.tls.b.certificate_unknown);
                }
                aVar7.o.f(cVar4);
                aVar7.m = 7;
                return cVar4;
            } catch (KeyStoreException unused4) {
                org.mozilla.javascript.c.b("keystore exception");
                return null;
            } catch (NoSuchAlgorithmException unused5) {
                org.mozilla.javascript.c.b("unsupported trust manager algorithm");
                return null;
            } catch (CertificateException e) {
                Throwable cause = e.getCause();
                String message = cause instanceof CertPathValidatorException ? cause.getMessage() + ": " + ((CertPathValidatorException) cause).getReason() : cause instanceof CertPathBuilderException ? cause.getMessage() : null;
                if (message == null) {
                    message = "certificate validation failed";
                }
                throw new net.luminis.tls.alert.a(message, 0);
            }
        } catch (BufferUnderflowException unused6) {
            net.luminis.tls.engine.impl.c.g("message underflow");
            return null;
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a i(JSONObject jSONObject) {
        com.google.firebase.crashlytics.internal.settings.b c0Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c0Var = new f0(10);
        } else {
            c0Var = new com.google.android.gms.measurement.internal.c0(11);
        }
        return c0Var.k((f0) this.e, jSONObject);
    }

    public JSONObject j() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.e;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
