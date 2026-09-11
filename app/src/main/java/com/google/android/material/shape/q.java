package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // com.google.android.material.shape.w
    public final void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
