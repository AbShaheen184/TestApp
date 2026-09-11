package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:132:0x0326  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:196:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    public static g a(FirebaseMessagingService firebaseMessagingService, com.google.android.material.internal.b bVar) {
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Integer num;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strU = bVar.u("gcm.n.android_channel_id");
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strU = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strU = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strU)) {
                        strU = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strU)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strU) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strU = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strU) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strU + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strU = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strU)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strU) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strU = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        androidx.core.app.h hVar = new androidx.core.app.h(firebaseMessagingService, strU);
        String strT = bVar.t(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strT)) {
            hVar.e = androidx.core.app.h.b(strT);
        }
        String strT2 = bVar.t(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strT2)) {
            hVar.f = androidx.core.app.h.b(strT2);
            androidx.core.app.g gVar = new androidx.core.app.g();
            gVar.y = androidx.core.app.h.b(strT2);
            hVar.e(gVar);
        }
        String strU2 = bVar.u("gcm.n.icon");
        if (TextUtils.isEmpty(strU2)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !b(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                }
            }
            if (identifier2 != 0 || !b(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strU2, "drawable", packageName);
            if ((identifier2 == 0 || !b(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strU2, "mipmap", packageName)) == 0 || !b(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strU2 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        hVar.s.icon = identifier2;
        String strU3 = bVar.u("gcm.n.sound2");
        if (TextUtils.isEmpty(strU3)) {
            strU3 = bVar.u("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strU3)) {
            defaultUri = null;
        } else if ("default".equals(strU3) || resources.getIdentifier(strU3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strU3);
        }
        char c = 4;
        if (defaultUri != null) {
            Notification notification = hVar.s;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strU4 = bVar.u("gcm.n.click_action");
        if (TextUtils.isEmpty(strU4)) {
            String strU5 = bVar.u("gcm.n.link_android");
            if (TextUtils.isEmpty(strU5)) {
                strU5 = bVar.u("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strU5) ? Uri.parse(strU5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strU4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) bVar.e;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                char c2 = c;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                c = c2;
            }
            launchIntentForPackage.putExtras(bundle4);
            if (bVar.m("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", bVar.x());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        hVar.g = activity;
        PendingIntent broadcast = !bVar.m("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bVar.x())), 1140850688);
        if (broadcast != null) {
            hVar.s.deleteIntent = broadcast;
        }
        String strU6 = bVar.u("gcm.n.color");
        if (TextUtils.isEmpty(strU6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strU6));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strU6 + ". Notification will use default color.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            hVar.o = numValueOf.intValue();
        }
        hVar.c(16, !bVar.m("gcm.n.sticky"));
        hVar.m = bVar.m("gcm.n.local_only");
        String strU7 = bVar.u("gcm.n.ticker");
        if (strU7 != null) {
            hVar.s.tickerText = androidx.core.app.h.b(strU7);
        }
        Integer numN = bVar.n("gcm.n.notification_priority");
        if (numN == null) {
            numN = null;
        } else if (numN.intValue() < -2 || numN.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numN + ". Skipping setting notificationPriority.");
            numN = null;
        }
        if (numN != null) {
            hVar.j = numN.intValue();
        }
        Integer numN2 = bVar.n("gcm.n.visibility");
        if (numN2 == null) {
            numN2 = null;
        } else if (numN2.intValue() < -1 || numN2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numN2 + ". Skipping setting visibility.");
            numN2 = null;
        }
        if (numN2 != null) {
            hVar.p = numN2.intValue();
        }
        Integer numN3 = bVar.n("gcm.n.notification_count");
        if (numN3 == null) {
            num = null;
        } else if (numN3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numN3 + ". Skipping setting notificationCount.");
            num = null;
        } else {
            num = numN3;
        }
        if (num != null) {
            hVar.i = num.intValue();
        }
        Long lS = bVar.s();
        if (lS != null) {
            hVar.k = true;
            hVar.s.when = lS.longValue();
        }
        long[] jArrV = bVar.v();
        if (jArrV != null) {
            hVar.s.vibrate = jArrV;
        }
        int[] iArrP = bVar.p();
        if (iArrP != null) {
            int i3 = iArrP[0];
            int i4 = iArrP[1];
            int i5 = iArrP[2];
            Notification notification2 = hVar.s;
            notification2.ledARGB = i3;
            notification2.ledOnMS = i4;
            notification2.ledOffMS = i5;
            if (i4 != 0 && i5 != 0) {
                i2 = 1;
            }
            notification2.flags = (notification2.flags & (-2)) | i2;
        }
        boolean zM = bVar.m("gcm.n.default_sound");
        ?? r0 = zM;
        if (bVar.m("gcm.n.default_vibrate_timings")) {
            r0 = (zM ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (bVar.m("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        Notification notification3 = hVar.s;
        notification3.defaults = r1;
        if ((r1 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strU8 = bVar.u("gcm.n.tag");
        if (TextUtils.isEmpty(strU8)) {
            strU8 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new g(hVar, strU8);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
