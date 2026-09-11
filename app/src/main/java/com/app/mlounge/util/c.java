package com.app.mlounge.util;

import android.app.ActivityManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.app.h;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.R;
import com.app.mlounge.ui.viewmodel.w1;
import com.appsalt.Appsalt;
import io.hopmonsdk.Hopmn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a;
    public static Job b;
    public static final CoroutineScope c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    public static void a() {
        Appsalt.Companion companion = Appsalt.Companion;
        companion.optIn();
        if (companion.isRunning()) {
            return;
        }
        companion.start("68c59f5facf177e06a7a2bc313c04574");
    }

    public static void b(Application application) {
        boolean z;
        boolean zIsRunning = Appsalt.Companion.isRunning();
        Object systemService = application.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        runningServices.getClass();
        if (!runningServices.isEmpty()) {
            Iterator<T> it = runningServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (l.a(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), "io.hopmonsdk.service.MoneytiserService")) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        o oVar = a.a;
        if (!zIsRunning && Appsalt.Companion.isOptedIn()) {
            a();
        }
        if (z || c(application).getConsentChoice() != Hopmn.ConsentChoice.BANDWIDTH) {
            return;
        }
        a = false;
        f(application);
    }

    public static Hopmn c(Application application) {
        Hopmn hopmn = Hopmn.getInstance(application);
        if (hopmn != null) {
            return hopmn;
        }
        Hopmn hopmnBuild = new Hopmn.Builder().withPublisher("cinemahq6").withMobileForeground(Boolean.TRUE).withSeedServersCsv("seed1.cinemahq.app,seed2.cinemahq.app").build(application, "CinemaHQ", "Thank you for your support!", R.drawable.favicon);
        hopmnBuild.getClass();
        return hopmnBuild;
    }

    public static void d(CinemaHQApp cinemaHQApp) {
        Appsalt.Companion companion = Appsalt.Companion;
        companion.initialize(cinemaHQApp);
        companion.setEnableLogging(false);
        companion.setBackground(true);
        Object systemService = cinemaHQApp.getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("chq_background", "Background Services", 3));
        }
        h hVar = new h(cinemaHQApp, "chq_background");
        hVar.s.icon = R.drawable.favicon;
        hVar.e = h.b("CinemaHQ");
        hVar.f = h.b("Thank you for your support!");
        hVar.j = 0;
        hVar.c(2, true);
        Notification notificationA = hVar.a();
        notificationA.getClass();
        companion.setNotificationId(9001);
        companion.setNotification(notificationA);
    }

    public static void e(Application application) {
        if (Appsalt.Companion.isOptedIn()) {
            a();
        }
        if (c(application).getConsentChoice() == Hopmn.ConsentChoice.BANDWIDTH) {
            f(application);
        }
        Job job = b;
        if (job == null || !job.isActive()) {
            b = BuildersKt__Builders_commonKt.launch$default(c, null, null, new w1(application, null, 3), 3, null);
        }
    }

    public static void f(Application application) {
        if (a) {
            return;
        }
        Hopmn hopmnC = c(application);
        if (hopmnC.getConsentChoice() != Hopmn.ConsentChoice.BANDWIDTH) {
            o oVar = a.a;
            return;
        }
        a = true;
        try {
            hopmnC.getDataStore().set("APPNAME", "CinemaHQ");
            hopmnC.getDataStore().set("MESSAGE", "Thank you for your support!");
            hopmnC.getDataStore().set("ICON", R.drawable.favicon);
            hopmnC.start();
            o oVar2 = a.a;
        } catch (Exception e) {
            a.b("SdkHelper", "Failed to start Hopmn SDK", e);
            a = false;
        }
    }
}
