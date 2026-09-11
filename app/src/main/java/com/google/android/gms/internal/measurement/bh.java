package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class bh {
    public static final zg e;
    public static final ah f;
    public final HashMap a;
    public final HashMap b;
    public final zg c;
    public ah d;

    static {
        int i = 0;
        e = new zg(i);
        f = new ah(i);
    }

    public bh(bh bhVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(bhVar.a);
        map2.putAll(bhVar.b);
        this.c = bhVar.c;
        this.d = bhVar.d;
    }

    public void a(kg kgVar, Object obj, wg wgVar) {
        zg zgVar = (zg) this.a.get(kgVar);
        if (zgVar != null) {
            zgVar.a(kgVar, obj, wgVar);
        } else {
            this.c.a(kgVar, obj, wgVar);
        }
    }

    public void b(kg kgVar, Iterator it, wg wgVar) {
        ah ahVar = (ah) this.b.get(kgVar);
        if (ahVar != null) {
            ahVar.a(kgVar, it, wgVar);
            return;
        }
        ah ahVar2 = this.d;
        if (ahVar2 != null && !this.a.containsKey(kgVar)) {
            ahVar2.a(kgVar, it, wgVar);
        } else {
            while (it.hasNext()) {
                a(kgVar, it.next(), wgVar);
            }
        }
    }

    public /* synthetic */ bh() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.d = null;
        this.c = wf.e;
    }
}
