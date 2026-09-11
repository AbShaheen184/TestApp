package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends m {
    public final Object e;
    public int y;
    public final /* synthetic */ u z;

    public t(u uVar, int i) {
        this.z = uVar;
        Object obj = u.G;
        this.e = uVar.i()[i];
        this.y = i;
    }

    public final void a() {
        int i = this.y;
        Object obj = this.e;
        u uVar = this.z;
        if (i != -1 && i < uVar.size()) {
            if (kotlin.collections.a0.n(obj, uVar.i()[this.y])) {
                return;
            }
        }
        Object obj2 = u.G;
        this.y = uVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        u uVar = this.z;
        Map mapB = uVar.b();
        if (mapB != null) {
            return mapB.get(this.e);
        }
        a();
        int i = this.y;
        if (i == -1) {
            return null;
        }
        return uVar.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        u uVar = this.z;
        Map mapB = uVar.b();
        Object obj2 = this.e;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.y;
        if (i == -1) {
            uVar.put(obj2, obj);
            return null;
        }
        Object obj3 = uVar.j()[i];
        uVar.j()[this.y] = obj;
        return obj3;
    }
}
