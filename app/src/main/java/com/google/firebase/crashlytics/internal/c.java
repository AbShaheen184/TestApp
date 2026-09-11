package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.c2;
import com.google.firebase.crashlytics.internal.model.y0;
import com.google.firebase.crashlytics.internal.model.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = u.e;
        }
        ArrayList arrayListI = o.I(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListI) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                com.google.gson.b.h("Null processName");
                return null;
            }
            y0Var.a = str2;
            y0Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (y0Var.e | 1);
            y0Var.c = runningAppProcessInfo.importance;
            y0Var.e = (byte) (b | 2);
            y0Var.d = l.a(str2, str);
            y0Var.e = (byte) (y0Var.e | 4);
            arrayList2.add(y0Var.a());
        }
        return arrayList2;
    }

    public final c2 b(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z0) ((c2) next)).b != iMyPid);
        c2 c2Var = (c2) next;
        if (c2Var != null) {
            return c2Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        y0 y0Var = new y0();
        y0Var.a = processName;
        y0Var.b = iMyPid;
        byte b = (byte) (y0Var.e | 1);
        y0Var.c = 0;
        y0Var.d = false;
        y0Var.e = (byte) (((byte) (b | 2)) | 4);
        return y0Var.a();
    }
}
