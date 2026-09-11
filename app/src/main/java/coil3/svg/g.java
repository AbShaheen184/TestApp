package coil3.svg;

import android.graphics.Canvas;
import android.util.Log;
import androidx.appcompat.widget.c2;
import coil3.k;
import com.caverock.androidsvg.d0;
import com.caverock.androidsvg.l;
import com.caverock.androidsvg.m;
import com.caverock.androidsvg.r;
import com.caverock.androidsvg.r0;
import com.caverock.androidsvg.s0;
import com.caverock.androidsvg.w1;
import com.caverock.androidsvg.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k {
    public final c2 a;
    public final coil3.memory.c b;
    public final int c;
    public final int d;

    public g(c2 c2Var, coil3.memory.c cVar, int i, int i2) {
        this.a = c2Var;
        this.b = cVar;
        this.c = i;
        this.d = i2;
    }

    @Override // coil3.k
    public final int a() {
        return this.d;
    }

    @Override // coil3.k
    public final int b() {
        return this.c;
    }

    @Override // coil3.k
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    @Override // coil3.k
    public final void d(Canvas canvas) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        c2 c2Var = this.a;
        c2Var.getClass();
        m mVar = (m) c2Var.z;
        coil3.memory.c cVar = this.b;
        if (cVar == null) {
            cVar = new coil3.memory.c(12);
        }
        if (((androidx.compose.ui.geometry.a) cVar.z) == null) {
            cVar.z = new androidx.compose.ui.geometry.a(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        y1 y1Var = new y1();
        y1Var.a = canvas;
        y1Var.b = c2Var;
        s0 s0Var = (s0) c2Var.y;
        if (s0Var == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        androidx.compose.ui.geometry.a aVar = s0Var.o;
        r rVar = s0Var.n;
        m mVar2 = (m) cVar.y;
        if (mVar2 == null) {
            z = false;
        } else {
            ArrayList arrayList2 = mVar2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            mVar.c((m) cVar.y);
        }
        y1Var.c = new w1();
        y1Var.d = new Stack();
        y1Var.t0((w1) y1Var.c, r0.a());
        w1 w1Var = (w1) y1Var.c;
        w1Var.f = null;
        w1Var.h = false;
        ((Stack) y1Var.d).push(new w1(w1Var));
        y1Var.f = new Stack();
        y1Var.e = new Stack();
        Boolean bool = s0Var.d;
        if (bool != null) {
            ((w1) y1Var.c).h = bool.booleanValue();
        }
        y1Var.o0();
        androidx.compose.ui.geometry.a aVar2 = new androidx.compose.ui.geometry.a((androidx.compose.ui.geometry.a) cVar.z);
        d0 d0Var = s0Var.r;
        if (d0Var != null) {
            aVar2.d = d0Var.b(y1Var, aVar2.d);
        }
        d0 d0Var2 = s0Var.s;
        if (d0Var2 != null) {
            aVar2.e = d0Var2.b(y1Var, aVar2.e);
        }
        y1Var.c0(s0Var, aVar2, aVar, rVar);
        y1Var.n0();
        m mVar3 = (m) cVar.y;
        if (mVar3 != null) {
            ArrayList arrayList3 = mVar3.b;
            z2 = (arrayList3 != null ? arrayList3.size() : 0) > 0;
        }
        if (!z2 || (arrayList = mVar.b) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((l) it.next()).c == 2) {
                it.remove();
            }
        }
    }

    @Override // coil3.k
    public final long e() {
        return 2048L;
    }
}
