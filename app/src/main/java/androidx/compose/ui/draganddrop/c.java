package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.unit.m;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends View.DragShadowBuilder {
    public final androidx.compose.ui.unit.d a;
    public final long b;
    public final l c;

    public c(androidx.compose.ui.unit.d dVar, long j, l lVar) {
        this.a = dVar;
        this.b = j;
        this.c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.b bVar = new androidx.compose.ui.graphics.drawscope.b();
        Canvas canvas2 = androidx.compose.ui.graphics.d.a;
        androidx.compose.ui.graphics.c cVar = new androidx.compose.ui.graphics.c();
        cVar.a = canvas;
        androidx.compose.ui.graphics.drawscope.a aVar = bVar.e;
        androidx.compose.ui.unit.c cVar2 = aVar.a;
        m mVar = aVar.b;
        r rVar = aVar.c;
        long j = aVar.d;
        aVar.a = this.a;
        aVar.b = m.e;
        aVar.c = cVar;
        aVar.d = this.b;
        cVar.f();
        this.c.invoke(bVar);
        cVar.q();
        aVar.a = cVar2;
        aVar.b = mVar;
        aVar.c = rVar;
        aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        androidx.compose.ui.unit.d dVar = this.a;
        point.set(dVar.g0(fIntBitsToFloat / dVar.a()), dVar.g0(Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
