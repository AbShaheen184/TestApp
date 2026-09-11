package com.google.android.gms.common.wrappers;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.StaticLayout;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.g;
import androidx.compose.ui.autofill.m;
import androidx.media3.common.util.t;
import androidx.transition.k;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import kotlin.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Context a;
    public static Boolean b;

    public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static final int b(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
                }
                return height * i;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static final boolean d(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static synchronized boolean e(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (com.google.android.gms.common.util.b.a()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }

    public static boolean f(File file, File file2) {
        try {
            Files.move(FileRetargetClass.toPath(file), FileRetargetClass.toPath(file2), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void g(androidx.compose.ui.autofill.a aVar, SparseArray sparseArray) {
        if (aVar.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueB = g.b(sparseArray.get(iKeyAt));
            if (autofillValueB.isText()) {
                m mVar = aVar.b;
                autofillValueB.getTextValue().toString();
                if (mVar.a.get(Integer.valueOf(iKeyAt)) != null) {
                    k.i();
                    return;
                }
            } else {
                if (autofillValueB.isDate()) {
                    throw new j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueB.isList()) {
                    throw new j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueB.isToggle()) {
                    throw new j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static Intent h(Context context, t tVar, IntentFilter intentFilter) {
        return context.registerReceiver(tVar, intentFilter, null, null, 2);
    }

    public static void i(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void j(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void k(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void l(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static final void m(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static void n(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void o(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
