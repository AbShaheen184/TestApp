package androidx.compose.runtime.saveable;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.u2;
import androidx.lifecycle.o0;
import coil3.compose.r;
import coil3.network.s;
import com.app.mlounge.emulator.EmulatorRenderer;
import com.app.mlounge.ui.screens.player.i0;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.a0;
import kotlin.y;
import okio.t;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ f(androidx.room.f fVar) {
        this.e = 9;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.h] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        Class<?> returnType;
        int i = this.e;
        y yVar = y.a;
        switch (i) {
            case 0:
                return new e(new LinkedHashMap());
            case 1:
                u2 u2Var = j.a;
                return null;
            case 2:
                u2 u2Var2 = androidx.compose.runtime.tooling.e.a;
                return null;
            case 3:
                u2 u2Var3 = androidx.compose.runtime.tooling.g.a;
                return null;
            case 4:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 5:
                b0 b0Var = androidx.lifecycle.viewmodel.compose.a.a;
                return null;
            case 6:
                return new o0();
            case 7:
                androidx.collection.internal.b bVar = new androidx.collection.internal.b(1);
                bVar.b(a0.a(androidx.navigation.internal.b.class), new androidx.compose.ui.text.y(24));
                return bVar.d();
            case 8:
                b0 b0Var2 = androidx.navigationevent.compose.a.a;
                return null;
            case 9:
                return yVar;
            case 10:
                return Boolean.TRUE;
            case 11:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 12:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 13:
                try {
                    Method method = (Method) androidx.sqlite.db.framework.b.z.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 14:
                u2 u2Var4 = r.a;
                return coil3.compose.b.a;
            case 15:
                return coil3.compose.m.a;
            case 16:
                t tVar = okio.k.e;
                x xVarG = okio.k.y.g("coil3_disk_cache");
                long jD = 10485760;
                try {
                    File file = xVarG.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jD = com.google.android.material.resources.c.d((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused3) {
                }
                return new coil3.disk.g(jD, tVar, xVarG);
            case 17:
                return coil3.network.c.a;
            case 18:
                return s.a;
            case 19:
                return new coil3.network.okhttp.internal.b(new okhttp3.y());
            case 20:
                try {
                    return com.google.android.gms.dynamite.g.C(kotlin.sequences.k.r(kotlin.sequences.k.n(Arrays.asList(new coil3.network.okhttp.internal.f()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 21:
                try {
                    return com.google.android.gms.dynamite.g.C(kotlin.sequences.k.r(kotlin.sequences.k.n(Arrays.asList(new coil3.svg.internal.a()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 22:
                return Integer.valueOf(EmulatorRenderer._init_$lambda$0());
            case 23:
                return y.a;
            case 24:
                Object obj = i0.a;
                return yVar;
            case 25:
                return Float.valueOf(1.0f);
            case 26:
                return com.app.mlounge.ui.theme.a.MEDIUM;
            case 27:
                com.google.firebase.crashlytics.b bVar2 = (com.google.firebase.crashlytics.b) com.google.firebase.g.c().b(com.google.firebase.crashlytics.b.class);
                if (bVar2 != null) {
                    return bVar2;
                }
                com.google.gson.b.h("FirebaseCrashlytics component is not present.");
                return null;
            case 28:
                com.appsalt.internal.i0 i0Var = new com.appsalt.internal.i0(7);
                new ArrayList();
                return i0Var;
            default:
                return new Handler(Looper.getMainLooper());
        }
    }

    public /* synthetic */ f(int i) {
        this.e = i;
    }
}
