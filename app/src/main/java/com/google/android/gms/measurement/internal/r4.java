package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.internal.measurement.b6;
import io.hopmonsdk.Hopmn;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends a2 {
    public static final String[] F = {"firebase_", "google_", "ga_"};
    public static final String[] G = {"_err"};
    public final AtomicLong A;
    public int B;
    public androidx.privacysandbox.ads.adservices.java.measurement.a C;
    public Boolean D;
    public Integer E;
    public SecureRandom z;

    public r4(s1 s1Var) {
        super(s1Var);
        this.E = null;
        this.A = new AtomicLong(0L);
    }

    public static String C(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean I0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void N(q4 q4Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        U(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        q4Var.e(str, "_err", bundle);
    }

    public static MessageDigest O() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long P(byte[] bArr) {
        com.google.android.gms.common.internal.x.g(bArr);
        int length = bArr.length;
        if (length <= 0) {
            org.mozilla.javascript.c.a();
            return 0L;
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean Q(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static int S() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean U(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean X(String str, String[] strArr) {
        com.google.android.gms.common.internal.x.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Y(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean a0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] f0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList q0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.e);
            bundle.putString("origin", eVar.y);
            bundle.putLong("creation_timestamp", eVar.A);
            bundle.putString("name", eVar.z.y);
            Object objD = eVar.z.d();
            com.google.android.gms.common.internal.x.g(objD);
            g2.c(bundle, objD);
            bundle.putBoolean("active", eVar.B);
            String str = eVar.C;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.D;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.e);
                t tVar = uVar.y;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.h());
                }
            }
            bundle.putLong("trigger_timeout", eVar.E);
            u uVar2 = eVar.F;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.e);
                t tVar2 = uVar2.y;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.h());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.z.z);
            bundle.putLong("time_to_live", eVar.G);
            u uVar3 = eVar.H;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.e);
                t tVar3 = uVar3.y;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.h());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean r0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.x.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void s0(c3 c3Var, Bundle bundle, boolean z) {
        if (bundle != null && c3Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c3Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c3Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c3Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && c3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean w0(String str) {
        com.google.android.gms.common.internal.x.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean y0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final void A(String str, String str2, Bundle bundle, List list, boolean z) {
        int iG0;
        int iD;
        list = list;
        if (bundle == null) {
            return;
        }
        s1 s1Var = (s1) this.e;
        g gVar = s1Var.A;
        x0 x0Var = s1Var.C;
        s0 s0Var = s1Var.G;
        r4 r4Var = ((s1) gVar.e).F;
        s1.k(r4Var);
        int i = true != r4Var.g0(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iG0 = !z ? G0(str3) : 0;
                if (iG0 == 0) {
                    iG0 = H0(str3);
                }
            } else {
                iG0 = 0;
            }
            if (iG0 != 0) {
                J(bundle, iG0, str3, iG0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (I0(bundle.get(str3))) {
                    s1.m(x0Var);
                    x0Var.H.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iD = 22;
                } else {
                    iD = D(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iD != 0 && !"_ev".equals(str3)) {
                    J(bundle, iD, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (w0(str3) && !X(str3, g2.k)) {
                    i2++;
                    if (!g0(231100000)) {
                        s1.m(x0Var);
                        x0Var.E.c(s0Var.a(str), s0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        U(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            s1.m(x0Var);
                            v0 v0Var = x0Var.E;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            v0Var.c(s0Var.a(str), s0Var.e(bundle), sb.toString());
                        }
                        U(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean A0(String str, String str2) {
        s1 s1Var = (s1) this.e;
        if (str2 == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.E.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                x0 x0Var3 = s1Var.C;
                s1.m(x0Var3);
                x0Var3.E.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                x0 x0Var4 = s1Var.C;
                s1.m(x0Var4);
                x0Var4.E.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean B(String str) {
        s1 s1Var = (s1) this.e;
        if (TextUtils.isEmpty(str)) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.E.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.x.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var2);
        x0Var2.E.b(x0.D(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean B0(String str, String[] strArr, String[] strArr2, String str2) {
        s1 s1Var = (s1) this.e;
        if (str2 == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(F[i])) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.E.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !X(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && X(str2, strArr2)) {
            return true;
        }
        x0 x0Var3 = s1Var.C;
        s1.m(x0Var3);
        x0Var3.E.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean C0(String str, int i, String str2) {
        s1 s1Var = (s1) this.e;
        if (str2 == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var2);
        x0Var2.E.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int D(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        s1 s1Var = (s1) this.e;
        v();
        int i2 = 0;
        if (!I0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!X(str2, g2.j)) {
                return 20;
            }
            o3 o3VarP = s1Var.p();
            o3VarP.v();
            o3VarP.w();
            if (o3VarP.C()) {
                r4 r4Var = ((s1) o3VarP.e).F;
                s1.k(r4Var);
                if (r4Var.h0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.H.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, org.mozilla.javascript.Context.VERSION_ES6));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, org.mozilla.javascript.Context.VERSION_ES6)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (a0(str) || a0(str2)) {
            s1Var.A.getClass();
            iMax = Math.max(500, LibretroCore.SCREEN_WIDTH);
        } else {
            s1Var.A.getClass();
        }
        if (!z("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                A(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.H.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    A(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        x0 x0Var3 = s1Var.C;
                        s1.m(x0Var3);
                        x0Var3.H.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    A(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    public final int D0(String str) {
        if (!A0(Hopmn.EVENT, str)) {
            return 2;
        }
        if (B0(Hopmn.EVENT, g2.a, ((s1) this.e).A.G(null, h0.f1) ? g2.c : g2.b, str)) {
            return !C0(Hopmn.EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final Object E(Object obj, String str) {
        s1 s1Var = (s1) this.e;
        int iMax = 500;
        if ("_ev".equals(str)) {
            s1Var.A.getClass();
            return V(Math.max(500, LibretroCore.SCREEN_WIDTH), obj, true, true);
        }
        if (a0(str)) {
            s1Var.A.getClass();
            iMax = Math.max(500, LibretroCore.SCREEN_WIDTH);
        } else {
            s1Var.A.getClass();
        }
        return V(iMax, obj, false, true);
    }

    public final boolean E0(String str) {
        return ((s1) this.e).A.G(null, h0.f1) ? X(str, g2.e) : X(str, g2.d);
    }

    public final Bundle F(String str, Bundle bundle, List list, boolean z) {
        int iG0;
        boolean zX = X(str, g2.g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        s1 s1Var = (s1) this.e;
        g gVar = s1Var.A;
        s0 s0Var = s1Var.G;
        r4 r4Var = ((s1) gVar.e).F;
        s1.k(r4Var);
        int i = r4Var.g0(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iG0 = !z ? G0(str2) : 0;
                if (iG0 == 0) {
                    iG0 = H0(str2);
                }
            } else {
                iG0 = 0;
            }
            if (iG0 != 0) {
                J(bundle2, iG0, str2, iG0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iD = D(str, str2, bundle.get(str2), bundle2, list, z, zX);
                if (iD == 17) {
                    J(bundle2, 17, str2, Boolean.FALSE);
                } else if (iD != 0 && !"_ev".equals(str2)) {
                    J(bundle2, iD, iD == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (w0(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.E.c(s0Var.a(str), s0Var.e(bundle), string);
                        }
                        U(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int F0(String str) {
        if (!A0("user property", str)) {
            return 6;
        }
        if (!B0("user property", g2.l, null, str)) {
            return 15;
        }
        ((s1) this.e).getClass();
        return !C0("user property", 24, str) ? 6 : 0;
    }

    public final void G(y0 y0Var, int i) {
        Bundle bundle = y0Var.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (w0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    s1 s1Var = (s1) this.e;
                    x0 x0Var = s1Var.C;
                    s0 s0Var = s1Var.G;
                    s1.m(x0Var);
                    x0Var.E.c(s0Var.a(y0Var.a), s0Var.e(bundle), string);
                    U(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int G0(String str) {
        if (!z0("event param", str)) {
            return 3;
        }
        if (!B0("event param", null, null, str)) {
            return 14;
        }
        ((s1) this.e).getClass();
        return !C0("event param", 40, str) ? 3 : 0;
    }

    public final void H(Parcelable[] parcelableArr, int i) {
        com.google.android.gms.common.internal.x.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (w0(str) && !X(str, g2.k) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        s1 s1Var = (s1) this.e;
                        x0 x0Var = s1Var.C;
                        s0 s0Var = s1Var.G;
                        s1.m(x0Var);
                        v0 v0Var = x0Var.E;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        v0Var.c(s0Var.b(str), s0Var.e(bundle), sb.toString());
                    }
                    U(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final int H0(String str) {
        if (!A0("event param", str)) {
            return 3;
        }
        if (!B0("event param", null, null, str)) {
            return 14;
        }
        ((s1) this.e).getClass();
        return !C0("event param", 40, str) ? 3 : 0;
    }

    public final void I(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                r4 r4Var = ((s1) this.e).F;
                s1.k(r4Var);
                r4Var.M(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void J(Bundle bundle, int i, String str, Object obj) {
        if (U(i, bundle)) {
            ((s1) this.e).getClass();
            bundle.putString("_ev", C(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int K(Object obj, String str) {
        return "_ldl".equals(str) ? z("user property referrer", str, W(str), obj) : z("user property", str, W(str), obj) ? 0 : 7;
    }

    public final Object L(Object obj, String str) {
        return "_ldl".equals(str) ? V(W(str), obj, true, false) : V(W(str), obj, false, false);
    }

    public final void M(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            s1 s1Var = (s1) this.e;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.H.c(s1Var.G.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final androidx.privacysandbox.ads.adservices.java.measurement.a R() {
        androidx.privacysandbox.ads.adservices.measurement.b bVar;
        if (this.C == null) {
            Context context = ((s1) this.e).e;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            androidx.privacysandbox.ads.adservices.internal.b bVar2 = androidx.privacysandbox.ads.adservices.internal.b.a;
            sb.append(i >= 33 ? bVar2.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? bVar2.a() : 0) >= 5) {
                bVar = new androidx.privacysandbox.ads.adservices.measurement.b(context, 1);
            } else {
                androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.a;
                if (((i == 31 || i == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        bVar = new androidx.privacysandbox.ads.adservices.measurement.b(context, 0);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        bVar = null;
                    }
                } else {
                    bVar = null;
                }
            }
            this.C = bVar != null ? new androidx.privacysandbox.ads.adservices.java.measurement.a(bVar) : null;
        }
        return this.C;
    }

    public final long T() {
        long j;
        boolean zBooleanValue;
        Integer num;
        Object e;
        v();
        s1 s1Var = (s1) this.e;
        p0 p0VarR = s1Var.r();
        x0 x0Var = s1Var.C;
        if (!Y((String) h0.q0.a(null), p0VarR.B())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = S() < ((Integer) h0.k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!Z("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.D == null) {
                androidx.privacysandbox.ads.adservices.java.measurement.a aVarR = R();
                zBooleanValue = false;
                if (aVarR != null) {
                    try {
                        num = (Integer) aVarR.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                s1.m(x0Var);
                                x0Var.F.b(e, "Measurement manager api exception");
                                this.D = Boolean.FALSE;
                            } catch (CancellationException e3) {
                                e = e3;
                                s1.m(x0Var);
                                x0Var.F.b(e, "Measurement manager api exception");
                                this.D = Boolean.FALSE;
                            } catch (ExecutionException e4) {
                                e = e4;
                                s1.m(x0Var);
                                x0Var.F.b(e, "Measurement manager api exception");
                                this.D = Boolean.FALSE;
                            } catch (TimeoutException e5) {
                                e = e5;
                                s1.m(x0Var);
                                x0Var.F.b(e, "Measurement manager api exception");
                                this.D = Boolean.FALSE;
                            }
                        }
                        this.D = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        num = null;
                        e = e6;
                    }
                    s1.m(x0Var);
                    x0Var.K.b(num, "Measurement manager api status result");
                    zBooleanValue = this.D.booleanValue();
                }
            } else {
                zBooleanValue = this.D.booleanValue();
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final Object V(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return C(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleC0 = c0((Bundle) parcelable);
                if (!bundleC0.isEmpty()) {
                    arrayList.add(bundleC0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int W(String str) {
        s1 s1Var = (s1) this.e;
        if ("_ldl".equals(str)) {
            s1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            s1Var.getClass();
            return LibretroCore.SCREEN_WIDTH;
        }
        if ("_lgclid".equals(str)) {
            s1Var.getClass();
            return 100;
        }
        s1Var.getClass();
        return 36;
    }

    public final boolean Z(String str) {
        v();
        s1 s1Var = (s1) this.e;
        if (((Context) com.google.android.gms.common.wrappers.b.a(s1Var.e).a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.J.b(str, "Permission not granted");
        return false;
    }

    public final boolean b0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((s1) this.e).A.z("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle c0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objE = E(bundle.get(str), str);
                if (objE == null) {
                    s1 s1Var = (s1) this.e;
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.H.b(s1Var.G.b(str), "Param value can't be null");
                } else {
                    M(bundle2, str, objE);
                }
            }
        }
        return bundle2;
    }

    public final u d0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (D0(str) != 0) {
            s1 s1Var = (s1) this.e;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(s1Var.G.c(str), "Invalid conditional property event name");
            net.luminis.tls.engine.impl.c.a();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleF = F(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleF = c0(bundleF);
        }
        com.google.android.gms.common.internal.x.g(bundleF);
        return new u(str, new t(bundleF), str2, j, j2);
    }

    public final boolean e0(Context context, String str) {
        Signature[] signatureArr;
        s1 s1Var = (s1) this.e;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoC = com.google.android.gms.common.wrappers.b.a(context).c(64, str);
            if (packageInfoC == null || (signatureArr = packageInfoC.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean g0(int i) {
        Boolean bool = ((s1) this.e).p().B;
        if (h0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int h0() {
        if (this.E == null) {
            s1 s1Var = (s1) this.e;
            com.google.android.gms.common.f fVar = com.google.android.gms.common.f.b;
            Context context = s1Var.e;
            fVar.getClass();
            int i = com.google.android.gms.common.g.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.E = Integer.valueOf(i2 / 1000);
        }
        return this.E.intValue();
    }

    public final void i0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void j0(String str, b6 b6Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning string value to wrapper");
        }
    }

    public final void k0(b6 b6Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning long value to wrapper");
        }
    }

    public final void l0(b6 b6Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning int value to wrapper");
        }
    }

    public final void m0(b6 b6Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void n0(b6 b6Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void o0(b6 b6Var, Bundle bundle) {
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void p0(b6 b6Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String t0() {
        byte[] bArr = new byte[16];
        v0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long u0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.A;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.A;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((s1) this.e).H.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.B + 1;
            this.B = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final SecureRandom v0() {
        v();
        if (this.z == null) {
            this.z = new SecureRandom();
        }
        return this.z;
    }

    @Override // com.google.android.gms.measurement.internal.a2
    public final boolean w() {
        return true;
    }

    public final Bundle x0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        s1 s1Var = (s1) this.e;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gbraid", queryParameter5);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("campaign_id", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("dclid", queryParameter7);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("srsltid", queryParameter8);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("sfmc_id", queryParameter9);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (s1Var.A.G(null, h0.a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        s1Var.A.getClass();
                        int iMax = Math.max(500, LibretroCore.SCREEN_WIDTH);
                        if (string.length() > iMax) {
                            string = C(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean z(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.H.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean z0(String str, String str2) {
        s1 s1Var = (s1) this.e;
        if (str2 == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.E.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.E.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                x0 x0Var4 = s1Var.C;
                s1.m(x0Var4);
                x0Var4.E.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }
}
