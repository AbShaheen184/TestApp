package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends g4 {
    public final HashMap A;
    public final androidx.media3.exoplayer.l1 B;
    public final androidx.media3.exoplayer.l1 C;
    public final androidx.media3.exoplayer.l1 D;
    public final androidx.media3.exoplayer.l1 E;
    public final androidx.media3.exoplayer.l1 F;
    public final androidx.media3.exoplayer.l1 G;

    public q3(l4 l4Var) {
        super(l4Var);
        this.A = new HashMap();
        g1 g1Var = ((s1) this.e).B;
        s1.k(g1Var);
        this.B = new androidx.media3.exoplayer.l1(g1Var, "last_delete_stale", 0L);
        g1 g1Var2 = ((s1) this.e).B;
        s1.k(g1Var2);
        this.C = new androidx.media3.exoplayer.l1(g1Var2, "last_delete_stale_batch", 0L);
        g1 g1Var3 = ((s1) this.e).B;
        s1.k(g1Var3);
        this.D = new androidx.media3.exoplayer.l1(g1Var3, "backoff", 0L);
        g1 g1Var4 = ((s1) this.e).B;
        s1.k(g1Var4);
        this.E = new androidx.media3.exoplayer.l1(g1Var4, "last_upload", 0L);
        g1 g1Var5 = ((s1) this.e).B;
        s1.k(g1Var5);
        this.F = new androidx.media3.exoplayer.l1(g1Var5, "last_upload_attempt", 0L);
        g1 g1Var6 = ((s1) this.e).B;
        s1.k(g1Var6);
        this.G = new androidx.media3.exoplayer.l1(g1Var6, "midnight_offset", 0L);
    }

    public final Pair A(String str) {
        p3 p3Var;
        androidx.room.t tVarA;
        v();
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.util.a aVar = s1Var.H;
        g gVar = s1Var.A;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.A;
        p3 p3Var2 = (p3) map.get(str);
        if (p3Var2 != null && jElapsedRealtime < p3Var2.c) {
            return new Pair(p3Var2.a, Boolean.valueOf(p3Var2.b));
        }
        long jD = gVar.D(str, h0.b) + jElapsedRealtime;
        try {
            try {
                tVarA = com.google.android.gms.ads.identifier.a.a(s1Var.e);
            } catch (PackageManager.NameNotFoundException unused) {
                if (p3Var2 != null && jElapsedRealtime < p3Var2.c + gVar.D(str, h0.c)) {
                    return new Pair(p3Var2.a, Boolean.valueOf(p3Var2.b));
                }
                tVarA = null;
            }
            if (tVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = tVarA.b;
            p3Var = str2 != null ? new p3(str2, jD, tVarA.c) : new p3("", jD, tVarA.c);
            map.put(str, p3Var);
            return new Pair(p3Var.a, Boolean.valueOf(p3Var.b));
        } catch (Exception e) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.J.b(e, "Unable to get advertising id");
            p3Var = new p3("", jD, false);
        }
    }

    public final String B(t4 t4Var, f2 f2Var) {
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        if (!f2Var.i(e2.AD_STORAGE) || !t4Var.K) {
            return "";
        }
        v();
        String str2 = (String) A(str).first;
        MessageDigest messageDigestO = r4.O();
        if (messageDigestO == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestO.digest(str2.getBytes())));
    }

    public final Pair z(t4 t4Var, f2 f2Var) {
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        return (f2Var.i(e2.AD_STORAGE) && t4Var.K) ? A(str) : new Pair("", Boolean.FALSE);
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
    }
}
