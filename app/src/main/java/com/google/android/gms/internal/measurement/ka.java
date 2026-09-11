package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ka {
    public static volatile com.google.common.base.h a;
    public static final Object b = new Object();
    public static Thread c;
    public static volatile Handler d;

    public static d5 b(Object obj) {
        if (obj == null) {
            return d5.n;
        }
        if (obj instanceof String) {
            return new g5((String) obj);
        }
        if (obj instanceof Double) {
            return new j3((Double) obj);
        }
        if (obj instanceof Long) {
            return new j3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new j3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new b2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                net.luminis.tls.engine.impl.c.o("Invalid value type");
                return null;
            }
            l1 l1Var = new l1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                l1Var.r(l1Var.p(), b(it.next()));
            }
            return l1Var;
        }
        a5 a5Var = new a5();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            d5 d5VarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                a5Var.f((String) string, d5VarB);
            }
        }
        return a5Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #4 }] */
    public static com.google.common.base.h c(Context context) {
        com.google.common.base.h hVar;
        com.google.common.base.h pVar;
        com.google.common.base.h pVar2;
        char c2;
        com.google.common.base.h hVar2 = a;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (ka.class) {
            try {
                hVar = a;
                if (hVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    androidx.collection.f fVar = la.a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        hVar = com.google.common.base.a.e;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c3 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                pVar = file.exists() ? new com.google.common.base.p(file) : com.google.common.base.a.e;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                pVar = com.google.common.base.a.e;
                            }
                            if (pVar.b()) {
                                File file2 = (File) pVar.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        androidx.collection.y0 y0Var = new androidx.collection.y0(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c3]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                androidx.collection.y0 y0Var2 = (androidx.collection.y0) y0Var.get(str3);
                                                if (y0Var2 == null) {
                                                    c2 = 0;
                                                    y0Var2 = new androidx.collection.y0(0);
                                                    y0Var.put(str3, y0Var2);
                                                } else {
                                                    c2 = 0;
                                                }
                                                y0Var2.put(strDecode, strDecode2);
                                                c3 = c2;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        ja jaVar = new ja(y0Var);
                                        bufferedReader.close();
                                        pVar2 = new com.google.common.base.p(jaVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                pVar2 = com.google.common.base.a.e;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            hVar = pVar2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        hVar = com.google.common.base.a.e;
                    }
                    a = hVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return hVar;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void e(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean f(Thread thread) {
        if (c == null) {
            c = Looper.getMainLooper().getThread();
        }
        return thread == c;
    }

    public static Handler g() {
        if (d == null) {
            synchronized (b) {
                try {
                    if (d == null) {
                        d = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static d5 h(o9 o9Var) {
        if (o9Var == null) {
            return d5.m;
        }
        int iC = o9Var.C() - 1;
        if (iC == 1) {
            return o9Var.w() ? new g5(o9Var.x()) : d5.t;
        }
        if (iC == 2) {
            return o9Var.A() ? new j3(Double.valueOf(o9Var.B())) : new j3(null);
        }
        if (iC == 3) {
            return o9Var.y() ? new b2(Boolean.valueOf(o9Var.z())) : new b2(null);
        }
        if (iC != 4) {
            net.luminis.tls.engine.impl.c.o("Unknown type found. Cannot convert entity");
            return null;
        }
        List listU = o9Var.u();
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(h((o9) it.next()));
        }
        return new e5(o9Var.v(), arrayList);
    }

    public abstract int a();

    public abstract kg i(int i);

    public abstract Object j(int i);

    public abstract Object k(kg kgVar);
}
