package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements x2 {
    public final s1 e;

    public /* synthetic */ r1(s1 s1Var) {
        this.e = s1Var;
    }

    @Override // com.google.android.gms.measurement.internal.x2, com.google.android.gms.measurement.internal.z0
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.e.i(i, th, bArr);
    }

    public void b(String str, Bundle bundle) {
        String string;
        s1 s1Var = this.e;
        p1 p1Var = s1Var.D;
        g1 g1Var = s1Var.B;
        s1.m(p1Var);
        p1Var.v();
        if (s1Var.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        s1.k(g1Var);
        g1Var.T.v(string);
        androidx.media3.exoplayer.l1 l1Var = g1Var.U;
        s1Var.H.getClass();
        l1Var.h(System.currentTimeMillis());
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        s1 s1Var = this.e;
        s1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        g1 g1Var = s1Var.B;
        s1.k(g1Var);
        return jCurrentTimeMillis - g1Var.U.g() > s1Var.A.D(null, h0.i0);
    }

    public boolean d() {
        g1 g1Var = this.e.B;
        s1.k(g1Var);
        return g1Var.U.g() > 0;
    }
}
