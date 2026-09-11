package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.z8;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends g4 {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(l4 l4Var, int i) {
        super(l4Var);
        this.A = i;
    }

    public void C(String str, h4 h4Var, z8 z8Var, z0 z0Var) {
        String str2;
        String str3 = h4Var.a;
        s1 s1Var = (s1) this.e;
        v();
        w();
        try {
            URL url = new URI(str3).toURL();
            this.y.k0();
            byte[] bArrA = z8Var.a();
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            Map map = h4Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                p1Var.H(new a1(this, str2, url, bArrA, map, z0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.C.c(x0.D(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
        int i = this.A;
    }

    public boolean z() {
        w();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((s1) this.e).e.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final void A() {
    }

    private final void B() {
    }
}
