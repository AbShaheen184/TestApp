package com.google.android.material.internal;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return com.google.android.material.resources.c.f(((okio.internal.i) obj).a, ((okio.internal.i) obj2).a);
        }
    }
}
