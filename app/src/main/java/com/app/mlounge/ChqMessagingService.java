package com.app.mlounge;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.y;
import androidx.collection.y0;
import androidx.media3.ui.c0;
import androidx.room.z;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChqMessagingService extends FirebaseMessagingService {
    public static final /* synthetic */ int E = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(com.google.firebase.messaging.n nVar) {
        kotlin.o oVar = com.app.mlounge.util.a.a;
        Bundle bundle = nVar.e;
        bundle.getString("from");
        Object objD = nVar.d();
        objD.getClass();
        if (!((y0) objD).isEmpty()) {
            Objects.toString(nVar.d());
        }
        if (nVar.z == null && com.google.android.material.internal.b.w(bundle)) {
            nVar.z = new com.google.firebase.messaging.g(new com.google.android.material.internal.b(bundle));
        }
        com.google.firebase.messaging.g gVar = nVar.z;
        if (gVar != null) {
            String string = (String) gVar.a;
            if (string == null) {
                string = getString(R.string.app_name);
                string.getClass();
            }
            String str = (String) gVar.b;
            if (str == null) {
                return;
            }
            Object systemService = getSystemService("notification");
            systemService.getClass();
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("chq_general", "General", 3));
            }
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
            androidx.core.app.h hVar = new androidx.core.app.h(this, "chq_general");
            hVar.s.icon = R.drawable.favicon;
            hVar.d(bitmapDecodeResource);
            hVar.e = androidx.core.app.h.b(string);
            hVar.f = androidx.core.app.h.b(str);
            hVar.c(16, true);
            hVar.g = activity;
            Notification notificationA = hVar.a();
            notificationA.getClass();
            notificationManager.notify((int) System.currentTimeMillis(), notificationA);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        str.getClass();
        kotlin.o oVar = com.app.mlounge.util.a.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        FirebaseMessaging firebaseMessaging;
        super.onCreate();
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(com.google.firebase.g.c());
        }
        firebaseMessaging.getClass();
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        firebaseMessaging.f.execute(new c0(13, firebaseMessaging, jVar));
        com.google.android.gms.tasks.q qVar = jVar.a;
        y yVar = new y(new z(4), 26);
        qVar.getClass();
        qVar.c(com.google.android.gms.tasks.k.a, yVar);
    }
}
