package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class gd {
    public static Boolean d;
    public final na a;
    public final Uri b;
    public final String c;

    public gd(na naVar, String str) {
        this.a = naVar;
        this.c = str;
        Context context = naVar.b;
        Pattern pattern = xd.a;
        com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(context);
        y1Var.y0("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        y1Var.z0(sb.toString());
        this.b = y1Var.A0();
    }

    public final androidx.compose.material.ripple.g a() {
        String strSubstring;
        int i;
        zb zbVar;
        zb zbVar2;
        String str = this.c;
        na naVar = this.a;
        com.google.common.base.t tVar = naVar.f;
        if (!ea.s(naVar.b)) {
            return new androidx.compose.material.ripple.g(id.B(), new androidx.core.view.r(3, 17));
        }
        if (d == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                d = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    d = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    d = Boolean.FALSE;
                }
            }
        }
        if (d.booleanValue()) {
            return new androidx.compose.material.ripple.g(id.B(), new androidx.core.view.r(3, 18));
        }
        ed edVarB = naVar.g.b();
        t0 t0Var = edVarB.c;
        k0 k0Var = k0.FILE;
        androidx.collection.f fVar = la.a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                net.luminis.tls.engine.impl.c.o("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!edVarB.h) {
            i = 14;
        } else if (!edVarB.a || !edVarB.b.contains(k0Var)) {
            i = 3;
        } else if (t0Var.c() != 0) {
            List list = edVarB.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = edVarB.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            zbVar2 = new zb(null, new androidx.core.view.r(i));
        } else {
            try {
                String str2 = edVarB.e;
                if (str2.isEmpty()) {
                    com.google.common.base.h hVar = (com.google.common.base.h) naVar.h.get();
                    if (hVar.b()) {
                        str2 = ((ApplicationInfo) hVar.a()).dataDir;
                    } else {
                        h.h(Level.WARNING, naVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        zbVar = new zb(mb.c, new androidx.core.view.r(3, 7));
                        zbVar2 = zbVar;
                    }
                }
                String str3 = File.separator;
                String str4 = edVarB.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(t0Var, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = cVar.v().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        try {
                            zb zbVar3 = new zb((mb) ((td) tVar.get()).a(uriBuild, new androidx.media3.common.util.n0(edVarB.k.u())), new androidx.core.view.r(5, 2));
                            StrictMode.setThreadPolicy(threadPolicy);
                            zbVar2 = zbVar3;
                        } catch (t1 e) {
                            h.h(Level.SEVERE, naVar.a(), e, "Failed to parse snapshot from shared storage for %s", str);
                            zbVar2 = new zb(null, new androidx.core.view.r(9));
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (FileNotFoundException unused2) {
                        h.h(Level.INFO, naVar.a(), null, "Shared storage file not found for %s", str);
                        zbVar2 = new zb(null, new androidx.core.view.r(8));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (Exception e2) {
                h.h(Level.WARNING, naVar.a(), e2, "Failed to read shared file for %s", str);
                zbVar = new zb(mb.c, new androidx.core.view.r(3, 10));
            }
        }
        androidx.core.view.r rVar = zbVar2.b;
        mb mbVar = zbVar2.a;
        if (mbVar != null) {
            return new androidx.compose.material.ripple.g(mbVar, rVar);
        }
        int i2 = rVar.b;
        try {
            td tdVar = (td) tVar.get();
            Uri uri = this.b;
            h2 h2Var = (h2) id.B().t(7);
            a1 a1Var = a1.a;
            int i3 = o0.a;
            a1 a1Var2 = a1.b;
            InputStream inputStreamD = wf.d(tdVar.b(uri));
            try {
                i1 i1VarA = ((h1) h2Var).a(inputStreamD, a1Var2);
                if (inputStreamD != null) {
                    inputStreamD.close();
                }
                return new androidx.compose.material.ripple.g((id) i1VarA, new androidx.core.view.r(4, i2));
            } catch (Throwable th2) {
                if (inputStreamD != null) {
                    try {
                        inputStreamD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused3) {
            h.h(Level.INFO, naVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return b() ? new androidx.compose.material.ripple.g(mb.c, new androidx.core.view.r(3, 16)) : new androidx.compose.material.ripple.g(id.B(), new androidx.core.view.r(3, 11));
        }
    }

    public final boolean b() {
        pb pbVarC = this.a.g.c();
        return pbVarC.w() && ((AbstractCollection) pbVarC.B()).contains(k0.FILE);
    }
}
