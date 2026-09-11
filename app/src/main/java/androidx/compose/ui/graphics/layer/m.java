package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends View {
    public static final l H = new l(0);
    public boolean A;
    public Outline B;
    public boolean C;
    public androidx.compose.ui.unit.c D;
    public androidx.compose.ui.unit.m E;
    public kotlin.jvm.functions.l F;
    public b G;
    public final androidx.compose.ui.graphics.layer.view.a e;
    public final s y;
    public final androidx.compose.ui.graphics.drawscope.b z;

    public m(androidx.compose.ui.graphics.layer.view.a aVar, s sVar, androidx.compose.ui.graphics.drawscope.b bVar) {
        super(aVar.getContext());
        this.e = aVar;
        this.y = sVar;
        this.z = bVar;
        setOutlineProvider(H);
        this.C = true;
        this.D = androidx.compose.ui.graphics.drawscope.c.a;
        this.E = androidx.compose.ui.unit.m.e;
        d.a.getClass();
        this.F = a.A;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s sVar = this.y;
        androidx.compose.ui.graphics.c cVar = sVar.a;
        Canvas canvas2 = cVar.a;
        cVar.a = canvas;
        androidx.compose.ui.unit.c cVar2 = this.D;
        androidx.compose.ui.unit.m mVar = this.E;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.G;
        kotlin.jvm.functions.l lVar = this.F;
        androidx.compose.ui.graphics.drawscope.b bVar2 = this.z;
        c2 c2Var = bVar2.y;
        androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
        androidx.compose.ui.unit.c cVar3 = aVar.a;
        androidx.compose.ui.unit.m mVar2 = aVar.b;
        r rVarW = c2Var.w();
        c2 c2Var2 = bVar2.y;
        long jH = c2Var2.H();
        b bVar3 = (b) c2Var2.z;
        c2Var2.a0(cVar2);
        c2Var2.b0(mVar);
        c2Var2.Z(cVar);
        c2Var2.c0(jFloatToRawIntBits);
        c2Var2.z = bVar;
        cVar.f();
        try {
            lVar.invoke(bVar2);
            cVar.q();
            c2Var2.a0(cVar3);
            c2Var2.b0(mVar2);
            c2Var2.Z(rVarW);
            c2Var2.c0(jH);
            c2Var2.z = bVar3;
            sVar.a.a = canvas2;
            this.A = false;
        } catch (Throwable th) {
            cVar.q();
            c2Var2.a0(cVar3);
            c2Var2.b0(mVar2);
            c2Var2.Z(rVarW);
            c2Var2.c0(jH);
            c2Var2.z = bVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.C;
    }

    public final s getCanvasHolder() {
        return this.y;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.C;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.A) {
            return;
        }
        this.A = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.C != z) {
            this.C = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.A = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
