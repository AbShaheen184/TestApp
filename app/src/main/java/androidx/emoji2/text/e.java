package androidx.emoji2.text;

import android.os.Build;
import androidx.appcompat.widget.c2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends okhttp3.internal.platform.android.g {
    public final /* synthetic */ f H;

    public e(f fVar) {
        this.H = fVar;
    }

    @Override // okhttp3.internal.platform.android.g
    public final void B(Throwable th) {
        ((j) this.H.a).f(th);
    }

    @Override // okhttp3.internal.platform.android.g
    public final void C(com.google.firebase.messaging.o oVar) {
        f fVar = this.H;
        fVar.c = oVar;
        com.google.firebase.messaging.o oVar2 = (com.google.firebase.messaging.o) fVar.c;
        j jVar = (j) fVar.a;
        fVar.b = new c2(oVar2, jVar.g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : org.jsoup.helper.n.u());
        j jVar2 = (j) fVar.a;
        ArrayList arrayList = new ArrayList();
        jVar2.a.writeLock().lock();
        try {
            jVar2.c = 1;
            arrayList.addAll(jVar2.b);
            jVar2.b.clear();
            jVar2.a.writeLock().unlock();
            jVar2.d.post(new androidx.core.provider.a(arrayList, jVar2.c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
