package org.jsoup.helper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.text.n0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.media3.common.util.j0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.l0;
import com.app.mlounge.emulator.EmulatorActivity;
import com.google.android.material.textfield.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static androidx.compose.ui.graphics.vector.f i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static boolean A(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static void B(String str, boolean z) {
        if (!z) {
            throw new o(str);
        }
    }

    public static void C(boolean z) {
        if (!z) {
            throw new o("Must be true");
        }
    }

    public static int D(float f2, int i2, int i3) {
        return androidx.core.graphics.a.b(androidx.core.graphics.a.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static void E(String str) {
        if (str == null || str.length() == 0) {
            throw new o("String must not be empty");
        }
    }

    public static void F(String str, String str2) {
        if (str.length() == 0) {
            throw new o(str2);
        }
    }

    public static void G(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new o(androidx.privacysandbox.ads.adservices.java.internal.a.q("The '", str2, "' parameter must not be empty."));
        }
    }

    public static void H(Object obj) {
        if (obj == null) {
            throw new o("Object must not be null");
        }
    }

    public static void I(Object obj, String str) {
        if (obj == null) {
            throw new o(androidx.privacysandbox.ads.adservices.java.internal.a.q("The parameter '", str, "' must not be null."));
        }
    }

    public static final long J(androidx.compose.ui.input.indirect.b bVar, k1 k1Var, androidx.compose.ui.input.indirect.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (k1Var == null) {
            return bVar.c;
        }
        int i2 = aVar.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c >> 32));
        } else {
            if (i2 != 2) {
                return bVar.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        }
        if (k1Var == k1.y) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & jFloatToRawIntBits);
    }

    public static final long K(androidx.compose.ui.input.indirect.b bVar, k1 k1Var, androidx.compose.ui.input.indirect.a aVar) {
        float fIntBitsToFloat;
        long j2 = bVar.g;
        if (k1Var == null) {
            return j2;
        }
        int i2 = aVar.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        } else {
            if (i2 != 2) {
                return j2;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        if (k1Var == k1.y) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public static androidx.room.util.i L(androidx.sqlite.a aVar, String str) {
        Map mapB;
        kotlin.collections.builders.g gVar;
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (cVarU.Q()) {
                int iP = kotlin.math.a.p(cVarU, "name");
                int iP2 = kotlin.math.a.p(cVarU, "type");
                int iP3 = kotlin.math.a.p(cVarU, "notnull");
                int iP4 = kotlin.math.a.p(cVarU, "pk");
                int iP5 = kotlin.math.a.p(cVarU, "dflt_value");
                kotlin.collections.builders.e eVar = new kotlin.collections.builders.e();
                do {
                    String strF = cVarU.F(iP);
                    eVar.put(strF, new androidx.room.util.f((int) cVarU.getLong(iP4), 2, strF, cVarU.F(iP2), cVarU.isNull(iP5) ? null : cVarU.F(iP5), cVarU.getLong(iP3) != 0));
                } while (cVarU.Q());
                mapB = eVar.b();
                com.google.common.base.i.c(cVarU, null);
            } else {
                mapB = v.e;
                com.google.common.base.i.c(cVarU, null);
            }
            androidx.sqlite.c cVarU2 = aVar.U("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iP6 = kotlin.math.a.p(cVarU2, "id");
                int iP7 = kotlin.math.a.p(cVarU2, "seq");
                int iP8 = kotlin.math.a.p(cVarU2, "table");
                int iP9 = kotlin.math.a.p(cVarU2, "on_delete");
                int iP10 = kotlin.math.a.p(cVarU2, "on_update");
                List listF = okhttp3.internal.platform.android.g.F(cVarU2);
                cVarU2.reset();
                kotlin.collections.builders.g gVar2 = new kotlin.collections.builders.g();
                while (cVarU2.Q()) {
                    if (cVarU2.getLong(iP7) == j2) {
                        int i2 = (int) cVarU2.getLong(iP6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = iP6;
                        ArrayList<androidx.room.util.e> arrayList3 = new ArrayList();
                        for (Object obj : listF) {
                            int i4 = iP7;
                            List list = listF;
                            if (((androidx.room.util.e) obj).e == i2) {
                                arrayList3.add(obj);
                            }
                            iP7 = i4;
                            listF = list;
                        }
                        int i5 = iP7;
                        List list2 = listF;
                        for (androidx.room.util.e eVar2 : arrayList3) {
                            arrayList.add(eVar2.z);
                            arrayList2.add(eVar2.A);
                        }
                        gVar2.add(new androidx.room.util.g(cVarU2.F(iP8), cVarU2.F(iP9), cVarU2.F(iP10), arrayList, arrayList2));
                        iP6 = i3;
                        iP7 = i5;
                        listF = list2;
                        j2 = 0;
                    }
                }
                kotlin.collections.builders.g gVarB = com.google.common.base.i.b(gVar2);
                com.google.common.base.i.c(cVarU2, null);
                androidx.sqlite.c cVarU3 = aVar.U("PRAGMA index_list(`" + str + "`)");
                try {
                    int iP11 = kotlin.math.a.p(cVarU3, "name");
                    int iP12 = kotlin.math.a.p(cVarU3, "origin");
                    int iP13 = kotlin.math.a.p(cVarU3, "unique");
                    if (iP11 == -1 || iP12 == -1 || iP13 == -1) {
                        com.google.common.base.i.c(cVarU3, null);
                        gVar = null;
                    } else {
                        kotlin.collections.builders.g gVar3 = new kotlin.collections.builders.g();
                        while (cVarU3.Q()) {
                            if ("c".equals(cVarU3.F(iP12))) {
                                androidx.room.util.h hVarG = okhttp3.internal.platform.android.g.G(aVar, cVarU3.F(iP11), cVarU3.getLong(iP13) == 1);
                                if (hVarG == null) {
                                    com.google.common.base.i.c(cVarU3, null);
                                    gVar = null;
                                } else {
                                    gVar3.add(hVarG);
                                }
                            }
                        }
                        kotlin.collections.builders.g gVarB2 = com.google.common.base.i.b(gVar3);
                        com.google.common.base.i.c(cVarU3, null);
                        gVar = gVarB2;
                    }
                    return new androidx.room.util.i(str, mapB, gVarB, gVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.i.c(cVarU3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    com.google.common.base.i.c(cVarU2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                com.google.common.base.i.c(cVarU, th5);
                throw th6;
            }
        }
    }

    public static String N(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(((double) Color.alpha(i2)) / 255.0d)};
        String str = j0.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void a(com.google.firebase.platforminfo.c cVar, androidx.compose.ui.input.indirect.b bVar, k1 k1Var, androidx.compose.ui.input.indirect.a aVar, w0 w0Var, long j2) {
        float fIntBitsToFloat;
        ArrayList arrayList = w0Var.b;
        long j3 = bVar.c;
        boolean z = bVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        boolean z2 = bVar.h;
        if (!z2 && z) {
            w0Var.a = 0;
            arrayList.clear();
        }
        if (!b(bVar) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i2 = w0Var.a;
                w0Var.a = i2 + 1;
                arrayList.set(i2, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (w0Var.a == 3) {
                w0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.input.indirect.b) arrayList.get(i3)).c >> 32))));
            }
            fIntBitsToFloat2 = (float) kotlin.collections.o.E(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.input.indirect.b) arrayList.get(i4)).c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) kotlin.collections.o.E(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (k1Var != null) {
            int i5 = aVar.a;
            if (i5 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i5 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = k1Var == k1.y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((androidx.compose.ui.input.pointer.util.b) cVar.e).a(bVar.b, androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j2));
    }

    public static final boolean b(androidx.compose.ui.input.indirect.b bVar) {
        return bVar.h && !bVar.d;
    }

    public static IOException c(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException d(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return c(file, iOException);
        }
        if (!parentFile.exists()) {
            return c(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? c(file, iOException) : c(file, iOException);
            }
            return parentFile.canWrite() ? c(file, iOException) : c(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? c(file, iOException) : c(file, iOException);
        }
        return parentFile.canWrite() ? c(file, iOException) : c(file, iOException);
    }

    public static int e(Context context, String str) {
        if (str == null) {
            com.google.gson.b.h("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new androidx.core.app.j(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static void f(androidx.media3.datasource.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int g(l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, c0 c0Var, boolean z) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(c0.G(view) - c0.G(view2)) + 1;
        }
        return Math.min(gVar.r(), gVar.g(view2) - gVar.j(view));
    }

    public static int h(l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, c0 c0Var, boolean z, boolean z2) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (l0Var.b() - Math.max(c0.G(view), c0.G(view2))) - 1) : Math.max(0, Math.min(c0.G(view), c0.G(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(gVar.g(view2) - gVar.j(view)) / (Math.abs(c0.G(view) - c0.G(view2)) + 1))) + (gVar.q() - gVar.j(view)));
        }
        return iMax;
    }

    public static int i(l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, c0 c0Var, boolean z) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return l0Var.b();
        }
        return (int) (((gVar.g(view2) - gVar.j(view)) / (Math.abs(c0.G(view) - c0.G(view2)) + 1)) * l0Var.b());
    }

    public static void j(EmulatorActivity emulatorActivity, String str, File file) {
        if (file.exists()) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            file.getName();
            return;
        }
        try {
            InputStream inputStreamOpen = emulatorActivity.getAssets().open(str);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    inputStreamOpen.getClass();
                    p.h(inputStreamOpen, fileOutputStream);
                    fileOutputStream.close();
                    inputStreamOpen.close();
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    com.google.common.base.b.d(inputStreamOpen, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
        }
    }

    public static void k(String str, String str2, Object obj) {
        String strY = y(str);
        if (Log.isLoggable(strY, 3)) {
            Log.d(strY, String.format(str2, obj));
        }
    }

    public static void l(String str, String str2, Exception exc) {
        String strY = y(str);
        if (Log.isLoggable(strY, 6)) {
            Log.e(strY, str2, exc);
        }
    }

    public static final long m(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && androidx.compose.ui.unit.a.d(j2)) ? androidx.compose.ui.unit.a.h(j2) : Integer.MAX_VALUE;
        if (androidx.compose.ui.unit.a.j(j2) != iH) {
            iH = com.google.android.material.resources.c.c(n0.j(f2), androidx.compose.ui.unit.a.j(j2), iH);
        }
        return o(0, iH, 0, androidx.compose.ui.unit.a.g(j2));
    }

    public static long n(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    androidx.compose.ui.unit.b.l(i7);
                    com.google.gson.b.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return androidx.compose.ui.unit.b.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long o(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    androidx.compose.ui.unit.b.l(i7);
                    com.google.gson.b.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return androidx.compose.ui.unit.b.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final androidx.compose.ui.graphics.vector.f p() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(20.0f, 11.0f);
        gVar.k(7.83f);
        gVar.n(5.59f, -5.59f);
        gVar.m(12.0f, 4.0f);
        gVar.n(-8.0f, 8.0f);
        gVar.n(8.0f, 8.0f);
        gVar.n(1.41f, -1.41f);
        gVar.m(7.83f, 13.0f);
        gVar.k(20.0f);
        gVar.s(-2.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f q() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 2.0f);
        gVarH.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        gVarH.q(4.48f, 10.0f, 10.0f, 10.0f);
        gVarH.q(10.0f, -4.48f, 10.0f, -10.0f);
        gVarH.p(17.52f, 2.0f, 12.0f, 2.0f);
        gVarH.f();
        gVarH.o(10.0f, 17.0f);
        gVarH.n(-5.0f, -5.0f);
        gVarH.n(1.41f, -1.41f);
        gVarH.m(10.0f, 14.17f);
        gVarH.n(7.59f, -7.59f);
        gVarH.m(19.0f, 8.0f);
        gVarH.n(-9.0f, 9.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static int r(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueU = com.google.android.material.resources.b.u(context, i2);
        if (typedValueU != null) {
            int i4 = typedValueU.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? context.getColor(i4) : typedValueU.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int s(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueV = com.google.android.material.resources.b.v(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueV.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueV.data;
    }

    public static ColorStateList t(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        androidx.core.content.res.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        androidx.core.content.res.i iVar = new androidx.core.content.res.i(resources, theme);
        synchronized (androidx.core.content.res.j.c) {
            try {
                SparseArray sparseArray = (SparseArray) androidx.core.content.res.j.b.get(iVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (hVar = (androidx.core.content.res.h) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (hVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || hVar.c != 0) {
                            if (theme == null || hVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = hVar.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = androidx.core.content.res.j.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = androidx.core.content.res.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (androidx.core.content.res.j.c) {
            try {
                WeakHashMap weakHashMap = androidx.core.content.res.j.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i2, new androidx.core.content.res.h(colorStateListA, iVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Set u() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final androidx.compose.ui.graphics.vector.f v() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Forward30", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        long j2 = t.b;
        p0 p0Var = new p0(j2);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(18.0f, 13.0f);
        gVarH.h(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        gVarH.q(-6.0f, -2.69f, -6.0f, -6.0f);
        gVarH.q(2.69f, -6.0f, 6.0f, -6.0f);
        gVarH.s(4.0f);
        gVarH.n(5.0f, -5.0f);
        gVarH.n(-5.0f, -5.0f);
        gVarH.s(4.0f);
        gVarH.h(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        gVarH.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        gVarH.q(8.0f, -3.58f, 8.0f, -8.0f);
        gVarH.k(18.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        p0 p0Var2 = new p0(j2);
        androidx.compose.ui.graphics.vector.g gVarH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h(10.06f, 15.38f);
        gVarH2.h(-0.29f, 0.0f, -0.62f, -0.17f, -0.62f, -0.54f);
        gVarH2.k(8.59f);
        gVarH2.h(0.0f, 0.97f, 0.9f, 1.23f, 1.45f, 1.23f);
        gVarH2.h(0.87f, 0.0f, 1.51f, -0.46f, 1.51f, -1.25f);
        gVarH2.h(0.0f, -0.66f, -0.45f, -0.9f, -0.71f, -1.0f);
        gVarH2.h(0.11f, -0.05f, 0.65f, -0.32f, 0.65f, -0.92f);
        gVarH2.h(0.0f, -0.21f, -0.05f, -1.22f, -1.44f, -1.22f);
        gVarH2.h(-0.62f, 0.0f, -1.4f, 0.35f, -1.4f, 1.16f);
        gVarH2.l(0.85f);
        gVarH2.h(0.0f, -0.34f, 0.31f, -0.48f, 0.57f, -0.48f);
        gVarH2.h(0.59f, 0.0f, 0.58f, 0.5f, 0.58f, 0.54f);
        gVarH2.h(0.0f, 0.52f, -0.41f, 0.59f, -0.63f, 0.59f);
        gVarH2.k(9.56f);
        gVarH2.s(0.66f);
        gVarH2.l(0.45f);
        gVarH2.h(0.65f, 0.0f, 0.7f, 0.42f, 0.7f, 0.64f);
        gVarH2.g(10.71f, 15.11f, 10.5f, 15.38f, 10.06f, 15.38f);
        gVarH2.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH2.a, 0, p0Var2);
        p0 p0Var3 = new p0(j2);
        androidx.compose.ui.graphics.vector.g gVarH3 = androidx.privacysandbox.ads.adservices.java.internal.a.h(13.85f, 11.68f);
        gVarH3.h(-0.14f, 0.0f, -1.44f, -0.08f, -1.44f, 1.82f);
        gVarH3.s(0.74f);
        gVarH3.h(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
        gVarH3.h(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
        gVarH3.r(13.5f);
        gVarH3.g(15.3f, 11.59f, 13.99f, 11.68f, 13.85f, 11.68f);
        gVarH3.f();
        gVarH3.o(14.45f, 14.35f);
        gVarH3.h(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
        gVarH3.h(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
        gVarH3.s(-0.97f);
        gVarH3.h(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
        gVarH3.h(0.38f, 0.0f, 0.6f, 0.26f, 0.6f, 1.01f);
        gVarH3.r(14.35f);
        gVarH3.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH3.a, 0, p0Var3);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f w() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(18.0f, 8.0f);
        gVar.l(-1.0f);
        gVar.m(17.0f, 6.0f);
        gVar.h(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        gVar.p(7.0f, 3.24f, 7.0f, 6.0f);
        gVar.s(2.0f);
        gVar.m(6.0f, 8.0f);
        gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.s(10.0f);
        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.l(12.0f);
        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.m(20.0f, 10.0f);
        gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.f();
        gVar.o(12.0f, 17.0f);
        gVar.h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        gVar.q(0.9f, -2.0f, 2.0f, -2.0f);
        gVar.q(2.0f, 0.9f, 2.0f, 2.0f);
        gVar.q(-0.9f, 2.0f, -2.0f, 2.0f);
        gVar.f();
        gVar.o(15.1f, 8.0f);
        gVar.m(8.9f, 8.0f);
        gVar.m(8.9f, 6.0f);
        gVar.h(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        gVar.h(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        gVar.s(2.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f x() {
        androidx.compose.ui.graphics.vector.f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SportsEsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(21.58f, 16.09f);
        gVar.n(-1.09f, -7.66f);
        gVar.g(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        gVar.k(7.47f);
        gVar.g(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        gVar.n(-1.09f, 7.66f);
        gVar.g(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        gVar.l(0.0f);
        gVar.h(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
        gVar.m(9.0f, 16.0f);
        gVar.l(6.0f);
        gVar.n(2.25f, 2.25f);
        gVar.h(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        gVar.l(0.0f);
        gVar.g(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        gVar.f();
        gVar.o(11.0f, 11.0f);
        gVar.k(9.0f);
        gVar.s(2.0f);
        gVar.k(8.0f);
        gVar.s(-2.0f);
        gVar.k(6.0f);
        gVar.s(-1.0f);
        gVar.l(2.0f);
        gVar.r(8.0f);
        gVar.l(1.0f);
        gVar.s(2.0f);
        gVar.l(2.0f);
        gVar.r(11.0f);
        gVar.f();
        gVar.o(15.0f, 10.0f);
        gVar.h(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        gVar.h(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gVar.q(1.0f, 0.45f, 1.0f, 1.0f);
        gVar.g(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        gVar.f();
        gVar.o(17.0f, 13.0f);
        gVar.h(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        gVar.h(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gVar.q(1.0f, 0.45f, 1.0f, 1.0f);
        gVar.g(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static String y(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public abstract void M();

    public abstract void z();
}
