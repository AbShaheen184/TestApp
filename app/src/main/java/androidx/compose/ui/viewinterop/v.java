package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.node.m1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends h {
    public final View a0;
    public final androidx.compose.ui.input.nestedscroll.d b0;
    public androidx.compose.runtime.saveable.g c0;
    public kotlin.jvm.functions.l d0;
    public kotlin.jvm.functions.l e0;
    public kotlin.jvm.functions.l f0;

    public v(Context context, kotlin.jvm.functions.l lVar, androidx.compose.runtime.p pVar, androidx.compose.runtime.saveable.h hVar, int i, m1 m1Var) {
        View view = (View) lVar.invoke(context);
        androidx.compose.ui.input.nestedscroll.d dVar = new androidx.compose.ui.input.nestedscroll.d();
        super(context, pVar, i, dVar, view, m1Var);
        this.a0 = view;
        this.b0 = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objC = hVar != null ? hVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (hVar != null) {
            setSavableRegistryEntry(hVar.d(strValueOf, new g(this, 2)));
        }
        b bVar = b.C;
        this.d0 = bVar;
        this.e0 = bVar;
        this.f0 = bVar;
    }

    public static final void n(v vVar) {
        vVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(androidx.compose.runtime.saveable.g gVar) {
        androidx.compose.runtime.saveable.g gVar2 = this.c0;
        if (gVar2 != null) {
            ((c2) gVar2).f0();
        }
        this.c0 = gVar;
    }

    public final androidx.compose.ui.input.nestedscroll.d getDispatcher() {
        return this.b0;
    }

    public final kotlin.jvm.functions.l getReleaseBlock() {
        return this.f0;
    }

    public final kotlin.jvm.functions.l getResetBlock() {
        return this.e0;
    }

    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.a getSubCompositionView() {
        return null;
    }

    public final kotlin.jvm.functions.l getUpdateBlock() {
        return this.d0;
    }

    public final void setReleaseBlock(kotlin.jvm.functions.l lVar) {
        this.f0 = lVar;
        setRelease(new g(this, 3));
    }

    public final void setResetBlock(kotlin.jvm.functions.l lVar) {
        this.e0 = lVar;
        setReset(new g(this, 4));
    }

    public final void setUpdateBlock(kotlin.jvm.functions.l lVar) {
        this.d0 = lVar;
        setUpdate(new g(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
