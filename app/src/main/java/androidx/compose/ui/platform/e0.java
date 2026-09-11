package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ViewTranslationCallback {
    public static final e0 a = new e0();

    public final boolean onClearTranslation(View view) {
        kotlin.jvm.functions.a aVar;
        view.getClass();
        androidx.compose.ui.contentcapture.f contentCaptureManager$ui = ((u) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.C = androidx.compose.ui.contentcapture.a.e;
        androidx.collection.n nVarD = contentCaptureManager$ui.d();
        Object[] objArr = nVarD.c;
        long[] jArr = nVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.collection.o0 o0Var = ((androidx.compose.ui.semantics.q) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = o0Var.g(androidx.compose.ui.semantics.t.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = o0Var.g(androidx.compose.ui.semantics.k.n);
                            androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (kotlin.jvm.functions.a) aVar2.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        kotlin.jvm.functions.l lVar;
        view.getClass();
        androidx.compose.ui.contentcapture.f contentCaptureManager$ui = ((u) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.C = androidx.compose.ui.contentcapture.a.e;
        androidx.collection.n nVarD = contentCaptureManager$ui.d();
        Object[] objArr = nVarD.c;
        long[] jArr = nVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.collection.o0 o0Var = ((androidx.compose.ui.semantics.q) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = o0Var.g(androidx.compose.ui.semantics.t.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.l.a(objG, Boolean.TRUE)) {
                            Object objG2 = o0Var.g(androidx.compose.ui.semantics.k.m);
                            androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (lVar = (kotlin.jvm.functions.l) aVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        kotlin.jvm.functions.l lVar;
        view.getClass();
        androidx.compose.ui.contentcapture.f contentCaptureManager$ui = ((u) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.C = androidx.compose.ui.contentcapture.a.y;
        androidx.collection.n nVarD = contentCaptureManager$ui.d();
        Object[] objArr = nVarD.c;
        long[] jArr = nVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.collection.o0 o0Var = ((androidx.compose.ui.semantics.q) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = o0Var.g(androidx.compose.ui.semantics.t.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.l.a(objG, Boolean.FALSE)) {
                            Object objG2 = o0Var.g(androidx.compose.ui.semantics.k.m);
                            androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (lVar = (kotlin.jvm.functions.l) aVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
