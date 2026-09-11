package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import androidx.compose.ui.node.a1;
import com.google.android.datatransport.cct.internal.a0;
import com.google.android.datatransport.cct.internal.b0;
import com.google.android.datatransport.cct.internal.c;
import com.google.android.datatransport.cct.internal.c0;
import com.google.android.datatransport.cct.internal.d0;
import com.google.android.datatransport.cct.internal.e;
import com.google.android.datatransport.cct.internal.e0;
import com.google.android.datatransport.cct.internal.f;
import com.google.android.datatransport.cct.internal.f0;
import com.google.android.datatransport.cct.internal.g;
import com.google.android.datatransport.cct.internal.g0;
import com.google.android.datatransport.cct.internal.h0;
import com.google.android.datatransport.cct.internal.i;
import com.google.android.datatransport.cct.internal.i0;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.cct.internal.m;
import com.google.android.datatransport.cct.internal.n;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.cct.internal.q;
import com.google.android.datatransport.cct.internal.r;
import com.google.android.datatransport.cct.internal.s;
import com.google.android.datatransport.cct.internal.t;
import com.google.android.datatransport.cct.internal.v;
import com.google.android.datatransport.cct.internal.w;
import com.google.android.datatransport.cct.internal.y;
import com.google.android.datatransport.runtime.backends.h;
import com.google.firebase.encoders.json.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {
    public final com.google.android.material.internal.b a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final com.google.android.datatransport.runtime.time.a e;
    public final com.google.android.datatransport.runtime.time.a f;
    public final int g;

    public b(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        d dVar = new d();
        c cVar = c.a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        com.google.android.datatransport.cct.internal.d dVar2 = com.google.android.datatransport.cct.internal.d.a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        com.google.android.datatransport.cct.internal.b bVar = com.google.android.datatransport.cct.internal.b.a;
        dVar.a(com.google.android.datatransport.cct.internal.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        e eVar = e.a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        com.google.android.datatransport.cct.internal.h hVar = com.google.android.datatransport.cct.internal.h.a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.d = true;
        this.a = new com.google.android.material.internal.b(dVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    public final com.google.android.datatransport.runtime.h a(com.google.android.datatransport.runtime.h hVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        a1 a1VarC = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) a1VarC.g;
        if (map2 == null) {
            net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        a1VarC.b("model", Build.MODEL);
        a1VarC.b("hardware", Build.HARDWARE);
        a1VarC.b("device", Build.DEVICE);
        a1VarC.b("product", Build.PRODUCT);
        a1VarC.b("os-uild", Build.ID);
        a1VarC.b("manufacturer", Build.MANUFACTURER);
        a1VarC.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) a1VarC.g;
        if (map3 == null) {
            net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h0.e;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) a1VarC.g;
        if (map4 == null) {
            net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g0.e;
                subtype = 100;
            } else if (((g0) g0.e.get(subtype)) == null) {
            }
            map = (HashMap) a1VarC.g;
            if (map != null) {
                net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            a1VarC.b("country", Locale.getDefault().getCountry());
            a1VarC.b("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            a1VarC.b("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                org.jsoup.helper.n.l("CctTransportBackend", "Unable to find version code for package", e);
            }
            a1VarC.b("application_build", Integer.toString(i2));
            return a1VarC.c();
        }
        SparseArray sparseArray3 = g0.e;
        subtype = 0;
        map = (HashMap) a1VarC.g;
        if (map != null) {
            net.luminis.tls.engine.impl.c.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        a1VarC.b("country", Locale.getDefault().getCountry());
        a1VarC.b("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        a1VarC.b("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        a1VarC.b("application_build", Integer.toString(i2));
        return a1VarC.c();
    }
}
