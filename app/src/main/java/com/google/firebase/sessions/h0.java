package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = kotlin.collections.u.e;
        }
        ArrayList arrayListI = kotlin.collections.o.I(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListI) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new g0(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, kotlin.jvm.internal.l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static g0 b(Context context) {
        Object next;
        String strA;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((g0) next).b != iMyPid);
        g0 g0Var = (g0) next;
        if (g0Var != null) {
            return g0Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            strA = Process.myProcessName();
            strA.getClass();
        } else if ((i < 28 || (strA = Application.getProcessName()) == null) && (strA = com.google.android.gms.common.util.c.a()) == null) {
            strA = "";
        }
        return new g0(iMyPid, 0, strA, false);
    }
}
