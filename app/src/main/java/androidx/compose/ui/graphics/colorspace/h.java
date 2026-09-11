package androidx.compose.ui.graphics.colorspace;

import androidx.collection.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final z a;

    static {
        q qVar = d.e;
        int i = qVar.c;
        e eVar = new e(qVar, qVar, 1);
        int i2 = qVar.c;
        l lVar = d.x;
        int i3 = (lVar.c << 6) | i2;
        g gVar = new g(qVar, lVar, 0);
        int i4 = (i2 << 6) | lVar.c;
        g gVar2 = new g(lVar, qVar, 0);
        z zVar = androidx.collection.o.a;
        z zVar2 = new z();
        zVar2.h(i | (i << 6), eVar);
        zVar2.h(i3, gVar);
        zVar2.h(i4, gVar2);
        a = zVar2;
    }
}
