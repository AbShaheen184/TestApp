package com.app.mlounge.util;

import androidx.compose.foundation.text.contextmenu.internal.g;
import androidx.compose.runtime.saveable.f;
import androidx.media3.ui.c0;
import com.google.firebase.crashlytics.internal.common.q;
import java.util.Collections;
import java.util.Map;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final o a = new o(new f(27));

    public static void a(String str, String str2) {
        com.google.firebase.crashlytics.b bVarC = c();
        String strE = coil3.compose.internal.f.e("E/", str, ": ", str2);
        q qVar = bVarC.a;
        qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, strE, 0));
    }

    public static void b(String str, String str2, Exception exc) {
        exc.getClass();
        com.google.firebase.crashlytics.b bVarC = c();
        String strE = coil3.compose.internal.f.e("E/", str, ": ", str2);
        q qVar = bVarC.a;
        qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, strE, 0));
        q qVar2 = c().a;
        Map map = Collections.EMPTY_MAP;
        qVar2.o.a.a(new c0(qVar2, exc));
    }

    public static com.google.firebase.crashlytics.b c() {
        Object value = a.getValue();
        value.getClass();
        return (com.google.firebase.crashlytics.b) value;
    }

    public static void d(String str, String str2) {
        com.google.firebase.crashlytics.b bVarC = c();
        String strE = coil3.compose.internal.f.e("I/", str, ": ", str2);
        q qVar = bVarC.a;
        qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, strE, 0));
    }

    public static void e(String str, String str2) {
        str2.getClass();
        q qVar = c().a;
        qVar.o.a.a(new g(5, qVar, str, str2));
    }

    public static void f(String str, String str2) {
        com.google.firebase.crashlytics.b bVarC = c();
        String strE = coil3.compose.internal.f.e("W/", str, ": ", str2);
        q qVar = bVarC.a;
        qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, strE, 0));
    }
}
