package androidx.compose.foundation.internal;

import androidx.compose.runtime.internal.k;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends CancellationException {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 0:
                setStackTrace(d.a);
                break;
            case 1:
                setStackTrace(k.a);
                break;
            default:
                setStackTrace(androidx.compose.ui.internal.b.a);
                break;
        }
        return this;
    }
}
