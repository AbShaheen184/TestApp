package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.appsalt.internal.j0;
import com.google.common.util.concurrent.g0;
import com.google.firebase.crashlytics.internal.model.a1;
import com.google.firebase.crashlytics.internal.model.b1;
import com.google.firebase.crashlytics.internal.model.s0;
import com.google.firebase.crashlytics.internal.model.t0;
import com.google.firebase.crashlytics.internal.model.u0;
import com.google.firebase.crashlytics.internal.model.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final v b;
    public final a c;
    public final g0 d;
    public final j0 e;

    static {
        HashMap map = new HashMap();
        f = map;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(5, map, "armeabi", 6, "armeabi-v7a");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.5";
    }

    public r(Context context, v vVar, a aVar, g0 g0Var, j0 j0Var) {
        this.a = context;
        this.b = vVar;
        this.c = aVar;
        this.d = g0Var;
        this.e = j0Var;
    }

    public static t0 c(com.google.firebase.messaging.o oVar, int i) {
        String str = (String) oVar.z;
        String str2 = (String) oVar.y;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oVar.A;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.o oVar2 = (com.google.firebase.messaging.o) oVar.B;
        if (i >= 8) {
            com.google.firebase.messaging.o oVar3 = oVar2;
            while (oVar3 != null) {
                oVar3 = (com.google.firebase.messaging.o) oVar3.B;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            com.google.gson.b.h("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        t0 t0VarC = null;
        if (oVar2 != null && i3 == 0) {
            t0VarC = c(oVar2, i + 1);
        }
        if (b == 1) {
            return new t0(str, str2, listD, t0VarC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.e = i;
            w0Var.f = (byte) (w0Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.a = jMax;
            byte b = (byte) (w0Var.f | 1);
            w0Var.b = str;
            w0Var.c = fileName;
            w0Var.d = lineNumber;
            w0Var.f = (byte) (b | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.c;
        String str = aVar.e;
        if (str == null) {
            com.google.gson.b.h("Null name");
            return null;
        }
        String str2 = aVar.b;
        if (b == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    public final b1 b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jA = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jA - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                a1 a1Var = new a1();
                a1Var.a = dValueOf;
                a1Var.b = i2;
                byte b = (byte) (a1Var.g | 1);
                a1Var.c = z2;
                a1Var.d = i;
                a1Var.e = j;
                a1Var.f = blockCount;
                a1Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return a1Var.a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!g.f()) {
            z2 = true;
        }
        long jA2 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jA2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        a1 a1Var2 = new a1();
        a1Var2.a = dValueOf;
        a1Var2.b = i2;
        byte b2 = (byte) (a1Var2.g | 1);
        a1Var2.c = z2;
        a1Var2.d = i;
        a1Var2.e = j;
        a1Var2.f = blockCount2;
        a1Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return a1Var2.a();
    }
}
