package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.autofill.r;
import androidx.compose.ui.contentcapture.i;
import com.google.firebase.platforminfo.c;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    public final Object a;
    public final View b;

    public a(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionF = androidx.compose.ui.graphics.a.f(this.a);
            r rVarO = _COROUTINE.b.o(this.b);
            Objects.requireNonNull(rVarO);
            contentCaptureSessionF.notifyViewsDisappeared(androidx.compose.ui.graphics.a.e(rVarO.a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionF = androidx.compose.ui.graphics.a.f(this.a);
        r rVarO = _COROUTINE.b.o(this.b);
        Objects.requireNonNull(rVarO);
        return contentCaptureSessionF.newAutofillId(androidx.compose.ui.graphics.a.e(rVarO.a), j);
    }

    public final c c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new c(androidx.compose.ui.graphics.a.f(this.a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.a.f(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.a.f(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}
