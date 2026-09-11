package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final /* synthetic */ int a;

    public /* synthetic */ ah(int i) {
        this.a = i;
    }

    public final void a(kg kgVar, Iterator it, wg wgVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!kgVar.c) {
                    net.luminis.tls.engine.impl.c.r("non repeating key");
                } else if (kgVar.d && ((f0) f0.y.get()).e > 20) {
                    while (it.hasNext()) {
                        wgVar.a(it.next(), kgVar.a);
                    }
                } else {
                    kgVar.a(it, wgVar);
                }
                break;
        }
    }

    private final void b(kg kgVar, Iterator it, wg wgVar) {
    }
}
