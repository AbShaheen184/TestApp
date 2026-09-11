package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final Object a = new Object();
    public static boolean b;
    public static int c;

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        net.luminis.tls.engine.impl.c.o(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        net.luminis.tls.engine.impl.c.a();
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "Must be called on ", name2, " thread, but got ", name);
            androidx.media3.exoplayer.hls.playlist.a.k(sb, ".");
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            net.luminis.tls.engine.impl.c.o("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            net.luminis.tls.engine.impl.c.o(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        net.luminis.tls.engine.impl.c.r(str);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h(str);
    }

    public static void i(String str, boolean z) {
        if (z) {
            return;
        }
        net.luminis.tls.engine.impl.c.r(str);
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
