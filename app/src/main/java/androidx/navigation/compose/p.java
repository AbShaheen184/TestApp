package androidx.navigation.compose;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.StatFs;
import android.widget.Toast;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.measurement.internal.f0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import kotlin.y;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ p(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int largeMemoryClass;
        int length;
        File file;
        int iA0;
        int i = this.e;
        y yVar = y.a;
        Context context = this.y;
        switch (i) {
            case 0:
                return coil3.network.g.j(context);
            case 1:
                int i2 = CinemaHQApp.D;
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(7, (byte) 0);
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused) {
                    largeMemoryClass = LibretroCore.SCREEN_WIDTH;
                }
                return new coil3.memory.d(new androidx.compose.ui.input.pointer.util.b((long) (0.25d * ((long) largeMemoryClass) * 1048576), lVar), lVar);
            case 2:
                int i3 = CinemaHQApp.D;
                okio.t tVar = okio.k.e;
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File file2 = new File("image_cache");
                String path = file2.getPath();
                path.getClass();
                char c = File.separatorChar;
                int iA1 = kotlin.text.k.a0(path, c, 0, 4);
                if (iA1 == 0) {
                    if (path.length() <= 1 || path.charAt(1) != c || (iA0 = kotlin.text.k.a0(path, c, 2, 4)) < 0) {
                        length = 1;
                    } else {
                        int iA2 = kotlin.text.k.a0(path, c, iA0 + 1, 4);
                        length = iA2 >= 0 ? iA2 + 1 : path.length();
                    }
                } else if (iA1 <= 0 || path.charAt(iA1 - 1) != ':') {
                    length = (iA1 == -1 && kotlin.text.k.X(path, ':')) ? path.length() : 0;
                } else {
                    length = iA1 + 1;
                }
                if (!(length > 0)) {
                    String string = cacheDir.toString();
                    string.getClass();
                    if ((string.length() == 0) || kotlin.text.k.X(string, c)) {
                        file = new File(string + file2);
                    } else {
                        file = new File(string + c + file2);
                    }
                    file2 = file;
                }
                String str = x.y;
                x xVarJ = f0.j(file2);
                long jD = 10485760;
                try {
                    File file3 = xVarJ.toFile();
                    file3.mkdir();
                    StatFs statFs = new StatFs(file3.getAbsolutePath());
                    jD = com.google.android.material.resources.c.d((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused2) {
                }
                return new coil3.disk.g(jD, tVar, xVarJ);
            case 3:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://appsalt.com/sdk/appsalt-sdk-privacy-policy/"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (Exception unused3) {
                    Toast.makeText(context, "No browser available", 0).show();
                }
                return yVar;
            case 4:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alldebrid.com/apikeys/")));
                return yVar;
            case 5:
                File fileJ = t1.j(context, "firebaseSessions/sessionConfigsDataStore.data");
                com.google.firebase.sessions.p.b(fileJ);
                return fileJ;
            default:
                File fileJ2 = t1.j(context, "firebaseSessions/sessionDataStore.data");
                com.google.firebase.sessions.p.b(fileJ2);
                return fileJ2;
        }
    }
}
