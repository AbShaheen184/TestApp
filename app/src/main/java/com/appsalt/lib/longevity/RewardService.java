package com.appsalt.lib.longevity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.h;
import androidx.core.app.j;
import com.app.mlounge.R;
import com.app.mlounge.ui.screens.player.j0;
import com.appsalt.internal.g;
import com.appsalt.internal.g4;
import com.appsalt.internal.z;
import kotlin.jvm.functions.l;
import kotlin.text.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardService extends Service {
    public static boolean C;
    public static Notification E;
    public static Integer F;
    public Exception A;
    public final g4 B = new g4(1);
    public j e;
    public z y;
    public g z;
    public static l D = new j0(18);
    public static l G = new j0(19);

    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[PHI: r1
  0x00e8: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v12 java.lang.Integer) binds: [B:40:0x00cf, B:49:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a() {
        int iIntValue;
        this.e = new j(getApplicationContext());
        Notification notificationA = E;
        if (notificationA == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                NotificationChannel notificationChannelA = a.a();
                j jVar = this.e;
                if (jVar == null) {
                    jVar = null;
                }
                if (i >= 26) {
                    com.google.android.gms.common.wrappers.a.a(jVar.a, notificationChannelA);
                } else {
                    jVar.getClass();
                }
            }
            h hVar = new h(this, "rewards");
            z zVar = this.y;
            if (zVar == null) {
                zVar = null;
            }
            hVar.s.icon = zVar.a.getInt("notificationIcon", R.drawable.ic_notification_small);
            z zVar2 = this.y;
            if (zVar2 == null) {
                zVar2 = null;
            }
            String string = zVar2.a.getString("notificationTitle", null);
            if (string == null || k.d0(string)) {
                string = "Rewards service";
            }
            hVar.e = h.b(string);
            hVar.c(8, true);
            z zVar3 = this.y;
            if (zVar3 == null) {
                zVar3 = null;
            }
            String string2 = zVar3.a.getString("notificationBody", null);
            if (string2 != null) {
                hVar.f = h.b(string2);
            }
            notificationA = hVar.a();
        }
        z zVar4 = this.y;
        if (zVar4 == null) {
            zVar4 = null;
        }
        zVar4.a.edit().putInt("notificationIcon", notificationA.icon).apply();
        z zVar5 = this.y;
        if (zVar5 == null) {
            zVar5 = null;
        }
        zVar5.a.edit().putString("notificationTitle", notificationA.extras.getString("android.title", "")).apply();
        z zVar6 = this.y;
        if (zVar6 == null) {
            zVar6 = null;
        }
        zVar6.a.edit().putString("notificationBody", notificationA.extras.getString("android.text")).apply();
        Integer numValueOf = F;
        if (numValueOf == null) {
            z zVar7 = this.y;
            if (zVar7 == null) {
                zVar7 = null;
            }
            int i2 = zVar7.a.getInt("notificationChannelId", -1);
            numValueOf = i2 < 0 ? null : Integer.valueOf(i2);
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 12329;
            }
        } else {
            iIntValue = numValueOf.intValue();
        }
        z zVar8 = this.y;
        (zVar8 != null ? zVar8 : null).a.edit().putInt("notificationChannelId", iIntValue).apply();
        startForeground(iIntValue, notificationA);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            this.y = new z(getApplicationContext(), 0);
            this.z = new g(getApplicationContext(), this.B);
            a();
        } catch (Exception e) {
            this.A = e;
            G.invoke(e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        g gVar = this.z;
        if (gVar == null) {
            gVar = null;
        }
        gVar.stop();
        C = false;
        D.invoke(Boolean.FALSE);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 3;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1989745770) {
            if (iHashCode != 2050727037 || !action.equals("69e1d6f650d8eccb")) {
                return 3;
            }
            stopSelf();
            return 3;
        }
        if (!action.equals("03b4a0836ab48e6c")) {
            return 3;
        }
        Bundle extras = intent.getExtras();
        g4.b = (extras != null ? extras.getBoolean("2828283818239123") : false) | g4.b;
        if (C || this.A != null) {
            return 3;
        }
        String string = getApplicationContext().getSharedPreferences("fg-storage", 0).getString("apiKey", "");
        if (k.d0(string) || string.equals("null")) {
            g4 g4Var = this.B;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, "invalid API key: ".concat(string));
            }
        } else {
            C = true;
            D.invoke(Boolean.TRUE);
            g gVar = this.z;
            if (gVar == null) {
                gVar = null;
            }
            gVar.start(string);
            g gVar2 = this.z;
            if ((gVar2 != null ? gVar2 : null).m) {
                return 3;
            }
        }
        stopSelf();
        return 3;
    }
}
