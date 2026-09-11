package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.a0;
import androidx.collection.o0;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements androidx.compose.ui.semantics.m, androidx.compose.ui.focus.j {
    public final androidx.compose.ui.spatial.b A;
    public final String B;
    public final Rect C = new Rect();
    public final AutofillId D;
    public final a0 E;
    public boolean F;
    public final r e;
    public final androidx.compose.ui.semantics.r y;
    public final u z;

    public d(r rVar, androidx.compose.ui.semantics.r rVar2, u uVar, androidx.compose.ui.spatial.b bVar, String str) {
        this.e = rVar;
        this.y = rVar2;
        this.z = uVar;
        this.A = bVar;
        this.B = str;
        uVar.setImportantForAutofill(1);
        r rVarO = _COROUTINE.b.o(uVar);
        AutofillId autofillId = rVarO != null ? (AutofillId) rVarO.a : null;
        if (autofillId == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Required value was null.");
        }
        this.D = autofillId;
        this.E = new a0();
    }

    public final void a(SparseArray sparseArray) {
        androidx.compose.ui.semantics.l lVarX;
        kotlin.jvm.functions.l lVar;
        kotlin.jvm.functions.l lVar2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueB = androidx.collection.g.b(sparseArray.get(iKeyAt));
            f0 f0Var = (f0) this.y.c.b(iKeyAt);
            if (f0Var != null && (lVarX = f0Var.x()) != null) {
                o0 o0Var = lVarX.e;
                Object objG = o0Var.g(androidx.compose.ui.semantics.k.g);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG;
                if (aVar != null && (lVar2 = (kotlin.jvm.functions.l) aVar.b) != null) {
                }
                Object objG2 = o0Var.g(androidx.compose.ui.semantics.k.h);
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) (objG2 != null ? objG2 : null);
                if (aVar2 != null && (lVar = (kotlin.jvm.functions.l) aVar2.b) != null) {
                }
            }
        }
    }

    @Override // androidx.compose.ui.focus.j
    public final void b(e0 e0Var, e0 e0Var2) {
        f0 f0VarT;
        androidx.compose.ui.semantics.l lVarX;
        f0 f0VarT2;
        androidx.compose.ui.semantics.l lVarX2;
        if (e0Var != null && (f0VarT2 = androidx.compose.ui.node.k.t(e0Var)) != null && (lVarX2 = f0VarT2.x()) != null) {
            o0 o0Var = lVarX2.e;
            if (o0Var.b(androidx.compose.ui.semantics.k.g) || o0Var.b(androidx.compose.ui.semantics.k.h)) {
                this.e.g(this.z, f0VarT2.y);
            }
        }
        if (e0Var2 == null || (f0VarT = androidx.compose.ui.node.k.t(e0Var2)) == null || (lVarX = f0VarT.x()) == null) {
            return;
        }
        o0 o0Var2 = lVarX.e;
        if (o0Var2.b(androidx.compose.ui.semantics.k.g) || o0Var2.b(androidx.compose.ui.semantics.k.h)) {
            int i = f0VarT.y;
            this.A.a.u(i, new b(this, i));
        }
    }
}
