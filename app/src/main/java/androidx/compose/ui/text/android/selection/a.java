package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.compose.foundation.text.input.internal.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {
    public final /* synthetic */ o a;

    public a(o oVar) {
        this.a = oVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.i(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.g(i);
    }
}
