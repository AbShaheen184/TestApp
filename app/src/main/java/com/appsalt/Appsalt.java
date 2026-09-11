package com.appsalt;

import android.app.Notification;
import android.content.Context;
import androidx.datastore.core.t0;
import androidx.media3.exoplayer.mediacodec.g;
import com.app.mlounge.ui.screens.adult.e;
import com.appsalt.internal.f3;
import com.appsalt.internal.g0;
import com.appsalt.internal.g4;
import com.appsalt.internal.j0;
import com.appsalt.internal.u;
import com.appsalt.internal.v2;
import com.appsalt.internal.z;
import com.appsalt.internal.z1;
import com.appsalt.lib.longevity.RewardService;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Appsalt {
    public static final Companion Companion = new Companion(null);
    public static f3 a;

    public static boolean getEnableLogging() {
        return Companion.getEnableLogging();
    }

    public static String getId() {
        return Companion.getId();
    }

    public static Throwable getLastError() {
        return Companion.getLastError();
    }

    public static boolean getLaunchOnBoot() {
        return Companion.getLaunchOnBoot();
    }

    public static final Notification getNotification() {
        return Companion.getNotification();
    }

    public static final Integer getNotificationId() {
        return Companion.getNotificationId();
    }

    public static l getOnError() {
        return Companion.getOnError();
    }

    public static final void initialize(Context context) {
        Companion.initialize(context);
    }

    public static boolean isBackground() {
        return Companion.isBackground();
    }

    public static boolean isOptedIn() {
        return Companion.isOptedIn();
    }

    public static boolean isRunning() {
        return Companion.isRunning();
    }

    public static final void optIn() {
        Companion.optIn();
    }

    public static void optOut() {
        Companion.optOut();
    }

    public static void requestConsent(int i, int i2, int i3, int i4, int i5) {
        Companion.requestConsent(i, i2, i3, i4, i5);
    }

    public static void setBackground(boolean z) {
        Companion.setBackground(z);
    }

    public static void setEnableLogging(boolean z) {
        Companion.setEnableLogging(z);
    }

    public static void setLaunchOnBoot(boolean z) {
        Companion.setLaunchOnBoot(z);
    }

    public static final void setNotification(Notification notification) {
        Companion.setNotification(notification);
    }

    public static final void setNotificationId(Integer num) {
        Companion.setNotificationId(num);
    }

    public static void setOnError(l lVar) {
        Companion.setOnError(lVar);
    }

    public static void start(String str) {
        Companion.start(str);
    }

    public static void stop() {
        Companion.stop();
    }

    public static void requestConsent() {
        Companion.requestConsent();
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion implements u, v2 {
        public Companion(f fVar) {
        }

        public boolean getEnableLogging() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            return f3Var.f;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        public String getId() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            j0 j0Var = f3Var.c;
            return ((z1) j0Var.b.get((g0) j0Var.c)).getId();
        }

        public Throwable getLastError() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            return (Throwable) f3Var.c.g;
        }

        public boolean getLaunchOnBoot() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            return ((z) f3Var.c.a).a.getBoolean("launchOnBoot", false);
        }

        public final Notification getNotification() {
            return RewardService.E;
        }

        public final Integer getNotificationId() {
            return RewardService.F;
        }

        public l getOnError() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            return f3Var.e;
        }

        public final void initialize(Context context) {
            if (Appsalt.a == null) {
                Appsalt.a = new f3(context.getApplicationContext());
            }
        }

        public boolean isBackground() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            j0 j0Var = f3Var.c;
            return ((z) j0Var.a).a.getBoolean("isBackground", false) && ((g) j0Var.e).a();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        public boolean isOptedIn() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            j0 j0Var = f3Var.c;
            return ((z1) j0Var.b.get((g0) j0Var.c)).a();
        }

        @Override // com.appsalt.internal.u
        public boolean isRunning() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            return f3Var.isRunning();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
        public final void optIn() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            g4 g4Var = f3Var.a;
            if (g4.b) {
                g4Var.a(3, "optIn");
            }
            j0 j0Var = f3Var.c;
            ((z1) j0Var.b.get((g0) j0Var.c)).b(true);
        }

        @Override // com.appsalt.internal.u
        public void optOut() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.optOut();
        }

        @Override // com.appsalt.internal.v2
        public void requestConsent(int i, int i2, int i3, int i4, int i5) {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.requestConsent(i, i2, i3, i4, i5);
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
        public void setBackground(boolean z) {
            f3 f3Var = Appsalt.a;
            d dVar = null;
            if (f3Var == null) {
                f3Var = null;
            }
            j0 j0Var = f3Var.c;
            if (((z) j0Var.a).a.getBoolean("isBackground", false) == z) {
                return;
            }
            ((z) j0Var.a).a.edit().putBoolean("isBackground", z).apply();
            g0 g0Var = (z && ((g) j0Var.e).a()) ? g0.y : g0.e;
            ?? r0 = j0Var.b;
            Job job = (Job) j0Var.i;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            j0Var.i = null;
            z1 z1Var = (z1) r0.get(g0Var);
            z1 z1Var2 = (z1) r0.get((g0) j0Var.c);
            j0Var.c = g0Var;
            z1Var.setOnError(new t0(19, z1Var, j0Var));
            j0Var.g = null;
            if (z1Var2.isRunning()) {
                z1Var2.stop();
                j0Var.i = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) j0Var.h, null, null, new e(z1Var2, z1Var, j0Var, dVar, 22), 3, null);
            }
        }

        public void setEnableLogging(boolean z) {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.getClass();
            g4.b = z;
            f3Var.f = z;
        }

        public void setLaunchOnBoot(boolean z) {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            ((z) f3Var.c.a).a.edit().putBoolean("launchOnBoot", z).apply();
        }

        public final void setNotification(Notification notification) {
            RewardService.E = notification;
        }

        public final void setNotificationId(Integer num) {
            RewardService.F = num;
        }

        @Override // com.appsalt.internal.u
        public void setOnError(l lVar) {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.e = lVar;
        }

        @Override // com.appsalt.internal.u
        public void start(String str) {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.start(str);
        }

        @Override // com.appsalt.internal.u
        public void stop() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.stop();
        }

        @Override // com.appsalt.internal.v2
        public void requestConsent() {
            f3 f3Var = Appsalt.a;
            if (f3Var == null) {
                f3Var = null;
            }
            f3Var.requestConsent();
        }

        public static /* synthetic */ void getId$annotations() {
        }
    }
}
