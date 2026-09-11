package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final com.google.android.gms.common.d a;
    public static final com.google.android.gms.common.d b;
    public static final com.google.android.gms.common.d c;
    public static final com.google.android.gms.common.d[] d;

    static {
        com.google.android.gms.common.d dVar = new com.google.android.gms.common.d("commit_to_configuration_v2_api", -1, 1L, true);
        a = dVar;
        com.google.android.gms.common.d dVar2 = new com.google.android.gms.common.d("get_serving_version_api", -1, 1L, true);
        com.google.android.gms.common.d dVar3 = new com.google.android.gms.common.d("get_experiment_tokens_api", -1, 1L, true);
        com.google.android.gms.common.d dVar4 = new com.google.android.gms.common.d("register_flag_update_listener_api", -1, 2L, true);
        b = dVar4;
        com.google.android.gms.common.d dVar5 = new com.google.android.gms.common.d("sync_after_api", -1, 1L, true);
        com.google.android.gms.common.d dVar6 = new com.google.android.gms.common.d("sync_after_for_application_api", -1, 1L, true);
        com.google.android.gms.common.d dVar7 = new com.google.android.gms.common.d("set_app_wide_properties_api", -1, 1L, true);
        com.google.android.gms.common.d dVar8 = new com.google.android.gms.common.d("set_runtime_properties_api", -1, 1L, true);
        com.google.android.gms.common.d dVar9 = new com.google.android.gms.common.d("get_storage_info_api", -1, 1L, true);
        c = dVar9;
        d = new com.google.android.gms.common.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
    }

    public static IOException a(td tdVar, Uri uri, IOException iOException, String str) {
        try {
            ge geVar = new ge();
            geVar.e = true;
            File file = (File) tdVar.a(uri, geVar);
            if (!file.exists()) {
                return e(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? e(file, iOException, str) : e(file, iOException, str);
                }
                return file.canWrite() ? e(file, iOException, str) : e(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? e(file, iOException, str) : e(file, iOException, str);
            }
            return file.canWrite() ? e(file, iOException, str) : e(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String b(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static int c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static d5 d(l1 l1Var, b7 b7Var, ArrayList arrayList, boolean z) {
        d5 d5VarA;
        ea.f("reduce", 1, arrayList);
        ea.h("reduce", 2, arrayList);
        d5 d5VarF = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
        if (!(d5VarF instanceof c4)) {
            net.luminis.tls.engine.impl.c.o("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            d5VarA = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
            if (d5VarA instanceof r2) {
                net.luminis.tls.engine.impl.c.o("Failed to parse initial value");
                return null;
            }
        } else {
            if (l1Var.p() == 0) {
                net.luminis.tls.engine.impl.c.r("Empty array with no initial value error");
                return null;
            }
            d5VarA = null;
        }
        c4 c4Var = (c4) d5VarF;
        int iP = l1Var.p();
        int i = z ? 0 : iP - 1;
        int i2 = z ? iP - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (d5VarA == null) {
            d5VarA = l1Var.q(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (l1Var.s(i)) {
                d5VarA = c4Var.a(b7Var, Arrays.asList(d5VarA, l1Var.q(i), new j3(Double.valueOf(i)), l1Var));
                if (d5VarA instanceof r2) {
                    net.luminis.tls.engine.impl.c.r("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return d5VarA;
    }

    public static IOException e(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return g(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return g(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str);
            }
            return parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str);
        }
        return parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str);
    }

    public static l1 f(l1 l1Var, b7 b7Var, c5 c5Var, Boolean bool, Boolean bool2) {
        l1 l1Var2 = new l1();
        Iterator itO = l1Var.o();
        while (itO.hasNext()) {
            int iIntValue = ((Integer) itO.next()).intValue();
            if (l1Var.s(iIntValue)) {
                d5 d5VarA = c5Var.a(b7Var, Arrays.asList(l1Var.q(iIntValue), new j3(Double.valueOf(iIntValue)), l1Var));
                if (d5VarA.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || d5VarA.c().equals(bool2)) {
                    l1Var2.r(iIntValue, d5VarA);
                }
            }
        }
        return l1Var2;
    }

    public static IOException g(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static final void h(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        da daVar = new da(level, exc, str, objArr, 1);
        int i = rf.a;
        int i2 = 4;
        executor.execute(new androidx.core.provider.m(i2, new kotlin.jvm.internal.z(), bf.a(), daVar));
    }
}
