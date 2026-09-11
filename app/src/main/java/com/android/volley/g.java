package com.android.volley;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = g.class.getName();

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbD = androidx.constraintlayout.core.g.d(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbD.append(stackTrace[i].getMethodName());
                string = sbD.toString();
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder("[");
                sb.append(id);
                sb.append("] ");
                sb.append(string);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, ": ", str2);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb2, ": ", str2);
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
