package androidx.compose.ui.autofill;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final u a;
    public final m b;
    public final AutofillManager c;
    public final AutofillId d;

    public a(u uVar, m mVar) {
        this.a = uVar;
        this.b = mVar;
        AutofillManager autofillManager = (AutofillManager) uVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            net.luminis.tls.engine.impl.c.r("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        uVar.setImportantForAutofill(1);
        r rVarO = _COROUTINE.b.o(uVar);
        AutofillId autofillId = rVarO != null ? (AutofillId) rVarO.a : null;
        if (autofillId == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Required value was null.");
        }
        this.d = autofillId;
    }
}
