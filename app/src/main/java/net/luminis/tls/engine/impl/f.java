package net.luminis.tls.engine.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final e[] d = {e.e, e.y, e.z, e.A, e.B, e.C, e.D, e.E, e.F, e.G};
    public final MessageDigest a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public f(int i) {
        String str = "SHA-" + (i * 8);
        try {
            this.a = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException unused) {
            org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Missing ", str, " support"));
            throw null;
        }
    }

    public static e a(net.luminis.tls.e eVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(net.luminis.tls.e.certificate);
        arrayList.add(net.luminis.tls.e.certificate_verify);
        arrayList.add(net.luminis.tls.e.finished);
        if (!arrayList.contains(eVar)) {
            return e.values()[eVar.ordinal()];
        }
        com.google.gson.b.g(eVar, "cannot convert ambiguous type ");
        return null;
    }

    public static e b(net.luminis.tls.e eVar, boolean z) {
        if (eVar == net.luminis.tls.e.finished) {
            return z ? e.G : e.D;
        }
        if (eVar == net.luminis.tls.e.certificate) {
            return z ? e.E : e.B;
        }
        if (eVar == net.luminis.tls.e.certificate_verify) {
            return z ? e.F : e.C;
        }
        return e.values()[eVar.ordinal()];
    }

    public final byte[] c(e eVar) {
        MessageDigest messageDigest;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(eVar)) {
            int i = 0;
            while (true) {
                messageDigest = this.a;
                if (i >= 10) {
                    break;
                }
                e eVar2 = d[i];
                ConcurrentHashMap concurrentHashMap2 = this.b;
                if (concurrentHashMap2.containsKey(eVar2)) {
                    messageDigest.update((byte[]) concurrentHashMap2.get(eVar2));
                }
                if (eVar2 == eVar) {
                    break;
                }
                i++;
            }
            concurrentHashMap.put(eVar, messageDigest.digest());
        }
        return (byte[]) concurrentHashMap.get(eVar);
    }

    public final void d(net.luminis.tls.handshake.e eVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(net.luminis.tls.e.certificate);
        arrayList.add(net.luminis.tls.e.certificate_verify);
        arrayList.add(net.luminis.tls.e.finished);
        if (arrayList.contains(eVar.b())) {
            c.a();
            return;
        }
        this.b.put(a(eVar.b()), eVar.a());
    }

    public final void e(net.luminis.tls.handshake.e eVar) {
        this.b.put(b(eVar.b(), true), eVar.a());
    }

    public final void f(net.luminis.tls.handshake.e eVar) {
        this.b.put(b(eVar.b(), false), eVar.a());
    }
}
