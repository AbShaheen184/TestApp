package androidx.collection;

import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassifier;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.compose.animation.core.z, androidx.compose.runtime.g {
    public static final /* synthetic */ int y = 0;
    public final /* synthetic */ int e;

    public static /* bridge */ /* synthetic */ AutofillValue b(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier c(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void d() {
        throw new ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.g
    public void cancel() {
    }

    @Override // androidx.compose.animation.core.z
    public float a(float f) {
        return f;
    }
}
