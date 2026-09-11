package androidx.core.provider;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int e;
    public final int y;
    public final Object z;

    public a(List list, int i, Throwable th) {
        this.e = 1;
        com.google.firebase.b.h(list, "initCallbacks cannot be null");
        this.z = new ArrayList(list);
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.core.content.res.b bVar = (androidx.core.content.res.b) ((com.google.firebase.platforminfo.c) this.z).e;
                if (bVar != null) {
                    bVar.e(this.y);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.z;
                int size = arrayList.size();
                int i = 0;
                if (this.y == 1) {
                    while (i < size) {
                        ((androidx.emoji2.text.h) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((androidx.emoji2.text.h) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            default:
                ((com.google.android.gms.common.api.internal.k) this.z).j(this.y);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }
}
