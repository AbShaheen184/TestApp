package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.n;
import androidx.compose.ui.text.u;
import androidx.compose.ui.text.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final l a = new l(false);

    public static final boolean a(m0 m0Var) {
        u uVar;
        w wVar = m0Var.c;
        androidx.compose.ui.text.j jVar = (wVar == null || (uVar = wVar.b) == null) ? null : new androidx.compose.ui.text.j(uVar.b);
        boolean z = false;
        if (jVar != null && jVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final void b(n nVar, r rVar, p pVar, float f, androidx.compose.ui.graphics.m0 m0Var, androidx.compose.ui.text.style.l lVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        ArrayList arrayList = nVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.p pVar2 = (androidx.compose.ui.text.p) arrayList.get(i);
            pVar2.a.g(rVar, pVar, f, m0Var, lVar, eVar);
            rVar.p(0.0f, pVar2.a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255));
    }
}
