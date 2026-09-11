package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ea {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final Object c = new Object();
    public static volatile androidx.compose.runtime.snapshots.g d;
    public static volatile androidx.compose.runtime.snapshots.g e;

    public static int A(m2 m2Var, int i, byte[] bArr, int i2, int i3, r1 r1Var, p0 p0Var) throws t1 {
        i1 i1VarA = m2Var.a();
        m2 m2Var2 = m2Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        p0 p0Var2 = p0Var;
        int iT = t(i1VarA, m2Var2, bArr2, i2, i4, p0Var2);
        m2Var2.f(i1VarA);
        p0Var2.c = i1VarA;
        r1Var.add(i1VarA);
        while (iT < i4) {
            p0 p0Var3 = p0Var2;
            int i5 = i4;
            int iA = a(bArr2, iT, p0Var3);
            if (i != p0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            m2 m2Var3 = m2Var2;
            i1 i1VarA2 = m2Var3.a();
            iT = t(i1VarA2, m2Var3, bArr3, iA, i5, p0Var3);
            m2Var2 = m2Var3;
            bArr2 = bArr3;
            i4 = i5;
            p0Var2 = p0Var3;
            m2Var2.f(i1VarA2);
            p0Var2.c = i1VarA2;
            r1Var.add(i1VarA2);
        }
        return iT;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, s2 s2Var, p0 p0Var) throws t1 {
        if ((i >>> 3) == 0) {
            androidx.transition.k.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iG = g(bArr, i2, p0Var);
            s2Var.d(i, Long.valueOf(p0Var.b));
            return iG;
        }
        if (i4 == 1) {
            s2Var.d(i, Long.valueOf(l(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iA = a(bArr, i2, p0Var);
            int i5 = p0Var.a;
            if (i5 < 0) {
                androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iA) {
                androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                s2Var.d(i, t0.y);
            } else {
                s2Var.d(i, t0.j(bArr, iA, i5));
            }
            return iA + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                s2Var.d(i, Integer.valueOf(i(bArr, i2)));
                return i2 + 4;
            }
            androidx.transition.k.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        s2 s2VarA = s2.a();
        int i7 = p0Var.d + 1;
        p0Var.d = i7;
        if (i7 >= 100) {
            androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iA2 = a(bArr, i2, p0Var);
            int i9 = p0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iA2;
                break;
            }
            i2 = B(i9, bArr, iA2, i3, s2VarA, p0Var);
            i8 = i9;
        }
        p0Var.d--;
        if (i2 > i3 || i8 != i6) {
            androidx.transition.k.q("Failed to parse the message.");
            return 0;
        }
        s2Var.d(i, s2VarA);
        return i2;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, p0 p0Var) throws t1 {
        if ((i >>> 3) == 0) {
            androidx.transition.k.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return g(bArr, i2, p0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return a(bArr, i2, p0Var) + p0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            androidx.transition.k.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = a(bArr, i2, p0Var);
            i6 = p0Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = C(i6, bArr, i2, i3, p0Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        androidx.transition.k.q("Failed to parse the message.");
        return 0;
    }

    public static int a(byte[] bArr, int i, p0 p0Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return e(b2, bArr, i2, p0Var);
        }
        p0Var.a = b2;
        return i2;
    }

    public static final File b(Uri uri) throws androidx.datastore.preferences.protobuf.i {
        if (!uri.getScheme().equals("file")) {
            throw new androidx.datastore.preferences.protobuf.i("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new androidx.datastore.preferences.protobuf.i("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new androidx.datastore.preferences.protobuf.i("Did not expect uri to have authority");
    }

    public static void c(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        androidx.transition.k.k(i, str, " operation requires ", list.size());
    }

    public static /* synthetic */ boolean d(int i, gg ggVar, StringBuilder sb) {
        if (i - 1 != 0 || ggVar == gg.a) {
            return false;
        }
        sb.append(ggVar.a());
        sb.append('.');
        sb.append(ggVar.b());
        sb.append(':');
        sb.append(ggVar.c());
        return true;
    }

    public static int e(int i, byte[] bArr, int i2, p0 p0Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            p0Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            p0Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            p0Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            p0Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                p0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static void f(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        androidx.transition.k.k(i, str, " operation requires at least ", list.size());
    }

    public static int g(byte[] bArr, int i, p0 p0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            p0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        p0Var.b = j2;
        return i3;
    }

    public static void h(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        androidx.transition.k.k(i, str, " operation requires at most ", arrayList.size());
    }

    public static int i(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static com.google.common.util.concurrent.r j(Context context, Callable callable, Executor executor) {
        s5 s5Var = new s5(callable, 9);
        if (s(context)) {
            com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1();
            a1Var.F = new com.google.common.util.concurrent.z0(a1Var, s5Var);
            executor.execute(a1Var);
            return a1Var;
        }
        com.google.common.util.concurrent.y0 y0Var = new com.google.common.util.concurrent.y0();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ca caVar = new ca(atomicBoolean, context, y0Var, s5Var, executor);
        context.registerReceiver(caVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!s(context) || !atomicBoolean.compareAndSet(false, true)) {
            y0Var.a(new da(y0Var, atomicBoolean, context, caVar, 0), com.google.common.util.concurrent.d0.e);
            return y0Var;
        }
        try {
            context.unregisterReceiver(caVar);
        } catch (IllegalArgumentException e2) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
        }
        com.google.common.util.concurrent.a1 a1Var2 = new com.google.common.util.concurrent.a1();
        a1Var2.F = new com.google.common.util.concurrent.z0(a1Var2, s5Var);
        executor.execute(a1Var2);
        y0Var.n(a1Var2);
        return y0Var;
    }

    public static boolean k(d5 d5Var) {
        if (d5Var == null) {
            return false;
        }
        Double dH = d5Var.h();
        return !dH.isNaN() && dH.doubleValue() >= 0.0d && dH.equals(Double.valueOf(Math.floor(dH.doubleValue())));
    }

    public static long l(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static m5 m(String str) {
        m5 m5Var = null;
        if (str != null && !str.isEmpty()) {
            m5Var = (m5) m5.I0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (m5Var != null) {
            return m5Var;
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unsupported commandId ", str));
        return null;
    }

    public static int n(byte[] bArr, int i, p0 p0Var) throws t1 {
        int iA = a(bArr, i, p0Var);
        int i2 = p0Var.a;
        if (i2 < 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            p0Var.c = "";
            return iA;
        }
        p0Var.c = z2.d(bArr, iA, i2);
        return iA + i2;
    }

    public static boolean o(d5 d5Var, d5 d5Var2) {
        if (!d5Var.getClass().equals(d5Var2.getClass())) {
            return false;
        }
        if ((d5Var instanceof h5) || (d5Var instanceof b5)) {
            return true;
        }
        if (d5Var instanceof j3) {
            if (Double.isNaN(d5Var.h().doubleValue()) || Double.isNaN(d5Var2.h().doubleValue())) {
                return false;
            }
            return d5Var.h().equals(d5Var2.h());
        }
        if (d5Var instanceof g5) {
            return d5Var.d().equals(d5Var2.d());
        }
        if (d5Var instanceof b2) {
            return d5Var.c().equals(d5Var2.c());
        }
        return d5Var == d5Var2;
    }

    public static int p(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2))) % 4.294967296E9d);
    }

    public static int q(byte[] bArr, int i, p0 p0Var) throws t1 {
        int iA = a(bArr, i, p0Var);
        int i2 = p0Var.a;
        if (i2 < 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iA) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            p0Var.c = t0.y;
            return iA;
        }
        p0Var.c = t0.j(bArr, iA, i2);
        return iA + i2;
    }

    public static double r(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return ((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean s(Context context) {
        if (b) {
            return true;
        }
        synchronized (ea.class) {
            try {
                if (b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        if (a == null) {
                            a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e2) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                                a = null;
                                i++;
                            }
                        }
                        if (z) {
                            b = true;
                        }
                        return z;
                    }
                    if (z) {
                        a = null;
                    }
                    if (z) {
                        b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int t(Object obj, m2 m2Var, byte[] bArr, int i, int i2, p0 p0Var) throws t1 {
        int iE = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iE = e(i3, bArr, iE, p0Var);
            i3 = p0Var.a;
        }
        int i4 = iE;
        if (i3 < 0 || i3 > i2 - i4) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = p0Var.d + 1;
        p0Var.d = i5;
        if (i5 >= 100) {
            androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        m2Var.h(obj, bArr, i4, i6, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return i6;
    }

    public static Object u(d5 d5Var) {
        if (d5.n.equals(d5Var)) {
            return null;
        }
        if (d5.m.equals(d5Var)) {
            return "";
        }
        if (d5Var instanceof a5) {
            return w((a5) d5Var);
        }
        if (!(d5Var instanceof l1)) {
            return !d5Var.h().isNaN() ? d5Var.h() : d5Var.d();
        }
        ArrayList arrayList = new ArrayList();
        l1 l1Var = (l1) d5Var;
        int i = 0;
        while (i < l1Var.p()) {
            if (i >= l1Var.p()) {
                androidx.transition.k.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objU = u(l1Var.q(i));
            if (objU != null) {
                arrayList.add(objU);
            }
            i = i2;
        }
        return arrayList;
    }

    public static int v(Object obj, m2 m2Var, byte[] bArr, int i, int i2, int i3, p0 p0Var) throws t1 {
        e2 e2Var = (e2) m2Var;
        int i4 = p0Var.d + 1;
        p0Var.d = i4;
        if (i4 >= 100) {
            androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iY = e2Var.y(obj, bArr, i, i2, i3, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return iY;
    }

    public static HashMap w(a5 a5Var) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(a5Var.e.keySet())) {
            Object objU = u(a5Var.e(str));
            if (objU != null) {
                map.put(str, objU);
            }
        }
        return map;
    }

    public static int x(int i, byte[] bArr, int i2, int i3, r1 r1Var, p0 p0Var) {
        j1 j1Var = (j1) r1Var;
        int iA = a(bArr, i2, p0Var);
        j1Var.e(p0Var.a);
        while (iA < i3) {
            int iA2 = a(bArr, iA, p0Var);
            if (i != p0Var.a) {
                break;
            }
            iA = a(bArr, iA2, p0Var);
            j1Var.e(p0Var.a);
        }
        return iA;
    }

    public static void y(b7 b7Var) {
        int iP = p(b7Var.h("runtime.counter").h().doubleValue() + 1.0d);
        if (iP <= 1000000) {
            b7Var.f("runtime.counter", new j3(Double.valueOf(iP)));
        } else {
            net.luminis.tls.engine.impl.c.r("Instructions allowed exceeded");
        }
    }

    public static int z(byte[] bArr, int i, r1 r1Var, p0 p0Var) throws t1 {
        j1 j1Var = (j1) r1Var;
        int iA = a(bArr, i, p0Var);
        int i2 = p0Var.a + iA;
        while (iA < i2) {
            iA = a(bArr, iA, p0Var);
            j1Var.e(p0Var.a);
        }
        if (iA == i2) {
            return iA;
        }
        androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
}
