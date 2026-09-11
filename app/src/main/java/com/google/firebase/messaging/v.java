package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final Object a = new Object();
    public static com.google.android.gms.stats.a b;

    public static void a(Context context) {
        if (b == null) {
            com.google.android.gms.stats.a aVar = new com.google.android.gms.stats.a(context);
            b = aVar;
            synchronized (aVar.a) {
                aVar.g = true;
            }
        }
    }

    public static byte[] b(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void c(Intent intent) {
        synchronized (a) {
            try {
                if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.g.c();
            com.google.firebase.g gVarC = com.google.firebase.g.c();
            gVarC.a();
            Context context = gVarC.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static SharedPreferences e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r6
  0x00db: PHI (r6v22 java.lang.String) = (r6v21 java.lang.String), (r6v34 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    public static void f(Intent intent) {
        int iIntValue;
        int i;
        String string;
        com.google.firebase.messaging.reporting.b bVar;
        String string2;
        byte b2;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        com.google.firebase.g gVarC;
        com.google.firebase.i iVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (h(intent)) {
            g("_nr", intent.getExtras());
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : d()) {
            com.google.android.datatransport.e eVar = (com.google.android.datatransport.e) FirebaseMessaging.k.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            com.google.firebase.messaging.reporting.d dVar = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            com.google.firebase.g gVarC2 = com.google.firebase.g.c();
                            try {
                                Object obj2 = com.google.firebase.installations.c.m;
                                string = (String) kotlin.math.a.f(((com.google.firebase.installations.c) gVarC2.b(com.google.firebase.installations.d.class)).c());
                            } catch (InterruptedException e) {
                                e = e;
                                net.luminis.tls.engine.impl.c.k(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e2) {
                            e = e2;
                        }
                    }
                    String str10 = string;
                    com.google.firebase.g gVarC3 = com.google.firebase.g.c();
                    gVarC3.a();
                    String packageName = gVarC3.a.getPackageName();
                    if (com.google.android.material.internal.b.w(extras)) {
                        bVar = com.google.firebase.messaging.reporting.b.DISPLAY_NOTIFICATION;
                    } else {
                        bVar = com.google.firebase.messaging.reporting.b.DATA_MESSAGE;
                    }
                    com.google.firebase.messaging.reporting.b bVar2 = bVar;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            b2 = 1;
                        } else if ("normal".equals(string2)) {
                            b2 = 2;
                        } else {
                            b2 = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        b2 = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            b2 = 1;
                        } else if ("normal".equals(string2)) {
                            b2 = 2;
                        } else {
                            b2 = 0;
                        }
                    }
                    if (b2 == 2) {
                        i2 = 5;
                    } else if (b2 == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e3) {
                            Log.w("FirebaseMessaging", "error parsing project number", e3);
                            gVarC = com.google.firebase.g.c();
                            iVar = gVarC.c;
                            gVarC.a();
                            str6 = iVar.e;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e4) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e4);
                                    gVarC.a();
                                    str7 = iVar.b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e5) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e6) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e6);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                gVarC.a();
                                str7 = iVar.b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        gVarC = com.google.firebase.g.c();
                        iVar = gVarC.c;
                        gVarC.a();
                        str6 = iVar.e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            gVarC.a();
                            str7 = iVar.b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    dVar = new com.google.firebase.messaging.reporting.d(j2, str, str10, bVar2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    com.google.firebase.g gVarC4 = com.google.firebase.g.c();
                    Object obj3 = com.google.firebase.installations.c.m;
                    string = (String) kotlin.math.a.f(((com.google.firebase.installations.c) gVarC4.b(com.google.firebase.installations.d.class)).c());
                }
                String str11 = string;
                com.google.firebase.g gVarC5 = com.google.firebase.g.c();
                gVarC5.a();
                String packageName2 = gVarC5.a.getPackageName();
                if (com.google.android.material.internal.b.w(extras)) {
                    bVar = com.google.firebase.messaging.reporting.b.DISPLAY_NOTIFICATION;
                } else {
                    bVar = com.google.firebase.messaging.reporting.b.DATA_MESSAGE;
                }
                com.google.firebase.messaging.reporting.b bVar3 = bVar;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        b2 = 1;
                    } else if ("normal".equals(string2)) {
                        b2 = 2;
                    } else {
                        b2 = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    b2 = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        b2 = 1;
                    } else if ("normal".equals(string2)) {
                        b2 = 2;
                    } else {
                        b2 = 0;
                    }
                }
                if (b2 == 2) {
                    i2 = 5;
                } else if (b2 == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    gVarC = com.google.firebase.g.c();
                    iVar = gVarC.c;
                    gVarC.a();
                    str6 = iVar.e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        gVarC.a();
                        str7 = iVar.b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                dVar = new com.google.firebase.messaging.reporting.d(j2, str, str11, bVar3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((com.google.android.datatransport.runtime.q) eVar).a("FCM_CLIENT_EVENT_LOGGING", new com.google.android.datatransport.c("proto"), new com.google.firebase.components.s(24)).E(new com.google.android.datatransport.a(new com.google.firebase.messaging.reporting.e(dVar), com.google.android.datatransport.d.e, new com.google.android.datatransport.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new androidx.transition.k(14));
            } catch (RuntimeException e7) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
            }
        }
    }

    public static void g(String str, Bundle bundle) {
        try {
            com.google.firebase.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = com.google.android.material.internal.b.w(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.c().b(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                ((com.google.firebase.analytics.connector.b) aVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean h(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static ComponentName i(Context context, Intent intent) {
        synchronized (a) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    b.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] j(com.android.volley.toolbox.b bVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = bVar.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return b(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (bVar.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
