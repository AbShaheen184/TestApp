package androidx.recyclerview.widget;

import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.gestures.y2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public u a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(p0 p0Var) {
        RecyclerView recyclerView;
        int i = p0Var.j;
        if (p0Var.f() || (i & 4) != 0 || (recyclerView = p0Var.r) == null) {
            return;
        }
        recyclerView.D(p0Var);
    }

    public abstract boolean a(p0 p0Var, p0 p0Var2, androidx.core.view.r rVar, androidx.core.view.r rVar2);

    public final void c(p0 p0Var) {
        u uVar = this.a;
        if (uVar != null) {
            RecyclerView recyclerView = uVar.a;
            boolean z = true;
            p0Var.n(true);
            View view = p0Var.a;
            if (p0Var.h != null && p0Var.i == null) {
                p0Var.h = null;
            }
            p0Var.i = null;
            if ((p0Var.j & 16) != 0) {
                return;
            }
            i0 i0Var = recyclerView.z;
            recyclerView.Z();
            c2 c2Var = recyclerView.C;
            y2 y2Var = (y2) c2Var.z;
            u uVar2 = (u) c2Var.y;
            int iIndexOfChild = uVar2.a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c2Var.e0(view);
            } else if (y2Var.G(iIndexOfChild)) {
                y2Var.J(iIndexOfChild);
                c2Var.e0(view);
                uVar2.a(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                p0 p0VarG = RecyclerView.G(view);
                i0Var.m(p0VarG);
                i0Var.j(p0VarG);
            }
            recyclerView.a0(!z);
            if (z || !p0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(p0 p0Var);

    public abstract void e();

    public abstract boolean f();
}
