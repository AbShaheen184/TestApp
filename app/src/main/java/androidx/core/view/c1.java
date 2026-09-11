package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends WindowInsetsAnimation$Callback {
    public final w0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public c1(w0 w0Var) {
        super(w0Var.y);
        this.d = new HashMap();
        this.a = w0Var;
    }

    public final f1 a(WindowInsetsAnimation windowInsetsAnimation) {
        f1 f1Var = (f1) this.d.get(windowInsetsAnimation);
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(0, null, 0L);
        f1Var2.a = new d1(windowInsetsAnimation);
        this.d.put(windowInsetsAnimation, f1Var2);
        return f1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.n(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.o();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            f1 f1VarA = a(windowInsetsAnimation);
            f1VarA.a.e(windowInsetsAnimation.getFraction());
            this.c.add(f1VarA);
        }
        return this.a.p(z1.d(null, windowInsets), this.b).c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.compose.foundation.text.input.internal.o oVarQ = this.a.q(a(windowInsetsAnimation), new androidx.compose.foundation.text.input.internal.o(bounds));
        oVarQ.getClass();
        b1.c();
        return b1.a(((androidx.core.graphics.c) oVarQ.y).d(), ((androidx.core.graphics.c) oVarQ.z).d());
    }
}
