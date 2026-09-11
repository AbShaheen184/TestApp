package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.y1;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnDragListener, d {
    public final g a;
    public final androidx.collection.h b;
    public final a c;

    public b() {
        g gVar = new g();
        gVar.N = 0L;
        this.a = gVar;
        this.b = new androidx.collection.h(0);
        this.c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(dragEvent, 14);
        int action = dragEvent.getAction();
        y1 y1Var = y1.e;
        androidx.collection.h hVar = this.b;
        g gVar = this.a;
        switch (action) {
            case 1:
                v vVar = new v();
                f fVar = new f(eVar, gVar, vVar);
                if (fVar.invoke(gVar) == y1Var) {
                    k.y(gVar, fVar);
                }
                boolean z = vVar.e;
                hVar.getClass();
                androidx.collection.b bVar = new androidx.collection.b(hVar);
                while (bVar.hasNext()) {
                    ((g) bVar.next()).P0();
                }
                return z;
            case 2:
                gVar.O0(eVar);
                return false;
            case 3:
                return gVar.L0();
            case 4:
                androidx.compose.animation.e eVar2 = new androidx.compose.animation.e(eVar, 2);
                if (eVar2.invoke(gVar) == y1Var) {
                    k.y(gVar, eVar2);
                }
                hVar.clear();
                return false;
            case 5:
                gVar.M0();
                return false;
            case 6:
                gVar.N0();
                return false;
            default:
                return false;
        }
    }
}
