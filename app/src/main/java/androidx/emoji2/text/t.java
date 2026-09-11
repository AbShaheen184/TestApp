package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i {
    public final Context a;
    public final androidx.core.provider.d b;
    public final com.google.android.gms.common.internal.k c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public okhttp3.internal.platform.android.g h;

    public t(Context context, androidx.core.provider.d dVar) {
        com.google.firebase.b.h(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = u.d;
    }

    @Override // androidx.emoji2.text.i
    public final void a(okhttp3.internal.platform.android.g gVar) {
        synchronized (this.d) {
            this.h = gVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new androidx.activity.l(this, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.core.provider.i c() {
        try {
            com.google.android.gms.common.internal.k kVar = this.c;
            Context context = this.a;
            androidx.core.provider.d dVar = this.b;
            kVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            androidx.compose.foundation.lazy.grid.t tVarA = androidx.core.provider.c.a(context, Collections.unmodifiableList(arrayList));
            int i = tVarA.a;
            if (i != 0) {
                org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.p("fetchFonts failed (", i, ")"));
                return null;
            }
            androidx.core.provider.i[] iVarArr = (androidx.core.provider.i[]) tVarA.b.get(0);
            if (iVarArr != null && iVarArr.length != 0) {
                return iVarArr[0];
            }
            org.mozilla.javascript.c.b("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("provider not found", e);
            return null;
        }
    }
}
