package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.appsalt.internal.j0;
import com.google.common.util.concurrent.g0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return (AssetFileDescriptor) this.b;
            case 1:
                com.google.firebase.crashlytics.internal.common.m mVar = ((com.google.firebase.crashlytics.internal.common.q) this.b).g;
                mVar.getClass();
                com.google.firebase.crashlytics.internal.concurrency.d.a();
                g0 g0Var = mVar.c;
                com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) g0Var.z;
                String str = (String) g0Var.y;
                cVar.getClass();
                boolean z = true;
                if (new File((File) cVar.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    com.google.firebase.crashlytics.internal.persistence.c cVar2 = (com.google.firebase.crashlytics.internal.persistence.c) g0Var.z;
                    cVar2.getClass();
                    new File((File) cVar2.c, str).delete();
                } else if (mVar.e() == null || !mVar.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                j0 j0Var = (j0) ((g0) this.b).z;
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) j0Var.f;
                com.google.firebase.crashlytics.internal.settings.c cVar3 = (com.google.firebase.crashlytics.internal.settings.c) j0Var.b;
                String str2 = rVar.e;
                com.google.firebase.crashlytics.internal.concurrency.d.b();
                try {
                    HashMap mapB = androidx.emoji2.text.r.b(cVar3);
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar4 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(str2, mapB);
                    cVar4.r("User-Agent", "Crashlytics Android SDK/20.0.5");
                    cVar4.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    androidx.emoji2.text.r.a(cVar4, cVar3);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return rVar.c(cVar4.p());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
        }
    }
}
