package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public static final Object c = new Object();
    public static final e d = new e();

    public static AlertDialog d(Activity activity, int i, com.google.android.gms.common.internal.p pVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(com.google.android.gms.common.internal.o.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.app.mlounge.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.app.mlounge.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.app.mlounge.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String strC = com.google.android.gms.common.internal.o.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        x.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.e = alertDialog;
        if (onCancelListener != null) {
            cVar.y = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new com.google.android.gms.common.internal.p(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", androidx.privacysandbox.ads.adservices.java.internal.a.p("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? com.google.android.gms.common.internal.o.e(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.o.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.app.mlounge.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? com.google.android.gms.common.internal.o.d(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.o.a(context)) : com.google.android.gms.common.internal.o.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        x.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        androidx.core.app.h hVar = new androidx.core.app.h(context, null);
        hVar.m = true;
        hVar.c(16, true);
        hVar.e = androidx.core.app.h.b(strE);
        androidx.core.app.g gVar = new androidx.core.app.g();
        gVar.y = androidx.core.app.h.b(strD);
        hVar.e(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.util.b.c == null) {
            com.google.android.gms.common.util.b.c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (com.google.android.gms.common.util.b.c.booleanValue()) {
            hVar.s.icon = context.getApplicationInfo().icon;
            hVar.j = 2;
            if (com.google.android.gms.common.util.b.c(context)) {
                hVar.b.add(new androidx.core.app.d(com.app.mlounge.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(com.app.mlounge.R.string.common_open_on_phone)));
            } else {
                hVar.g = pendingIntent;
            }
        } else {
            hVar.s.icon = R.drawable.stat_sys_warning;
            hVar.s.tickerText = androidx.core.app.h.b(resources.getString(com.app.mlounge.R.string.common_google_play_services_notification_ticker));
            hVar.s.when = System.currentTimeMillis();
            hVar.g = pendingIntent;
            hVar.f = androidx.core.app.h.b(strD);
        }
        if (com.google.android.gms.common.util.b.a()) {
            if (!com.google.android.gms.common.util.b.a()) {
                org.mozilla.javascript.c.a();
                return;
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.app.mlounge.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            hVar.q = "com.google.android.gms.availability";
        }
        Notification notificationA = hVar.a();
        if (i == 1 || i == 2 || i == 3) {
            g.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void g(Activity activity, y yVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new com.google.android.gms.common.internal.p(super.a(i, activity, "d"), yVar, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
