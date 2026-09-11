package androidx.compose.ui.graphics.vector;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public a(okhttp3.internal.concurrent.d dVar, int i) {
        dVar.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = i;
        this.b = 300000000000L;
        this.c = dVar.d();
        this.d = new okhttp3.internal.cache.f(this, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), okhttp3.internal.g.b, " ConnectionPool connection closer"), 1);
        this.e = new ConcurrentLinkedQueue();
    }

    public int a(okhttp3.internal.connection.n nVar, long j) {
        TimeZone timeZone = okhttp3.internal.g.a;
        ArrayList arrayList = nVar.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + nVar.c.a.h + " was leaked. Did you forget to close a response body?";
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.j(((okhttp3.internal.connection.k) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    nVar.r = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public a() {
        this.b = 0L;
        this.a = 0;
        this.e = new androidx.compose.ui.graphics.drawscope.b();
    }
}
