package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int e = 1;
    public Object y;
    public Object z;

    public /* synthetic */ rc(na naVar, String str) {
        this.y = naVar;
        this.z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Context context = ((na) this.y).b;
                com.google.common.collect.f1 f1Var = sc.A;
                if (f1Var == null) {
                    synchronized (sc.z) {
                        f1Var = sc.A;
                        if (f1Var == null) {
                            androidx.appcompat.widget.x xVarA = com.google.common.collect.f1.a();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str);
                                                InputStream inputStreamOpen = assets.open(sb.toString());
                                                try {
                                                    a1 a1Var = a1.a;
                                                    int i = o0.a;
                                                    sc scVar = new sc(context, tc.w(inputStreamOpen, a1.b));
                                                    xVarA.q(scVar.y, scVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } catch (t1 e) {
                                                StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                                sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                sb2.append(str);
                                                Log.e("PackageInfo", sb2.toString(), e);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                            }
                            com.google.common.collect.f1 f1VarE = xVarA.e(true);
                            sc.A = f1VarE;
                            f1Var = f1VarE;
                        }
                        break;
                    }
                }
                String str2 = (String) this.z;
                if (f1Var.containsKey(str2)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(str2.length() + Token.WITHEXPR);
                sb3.append("Config package ");
                sb3.append(str2);
                sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb3.toString());
                return;
            default:
                this.y = null;
                this.z = null;
                return;
        }
    }

    public /* synthetic */ rc() {
    }
}
