package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final androidx.compose.foundation.relocation.f a;
    public final CancellableContinuationImpl b;

    public f(androidx.compose.foundation.relocation.f fVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = fVar;
        this.b = cancellableContinuationImpl;
    }

    public final String toString() {
        CancellableContinuationImpl cancellableContinuationImpl = this.b;
        CoroutineName coroutineName = (CoroutineName) cancellableContinuationImpl.getContext().get(CoroutineName.Key);
        String name = coroutineName != null ? coroutineName.getName() : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        com.google.android.material.shape.e.a(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(name != null ? androidx.privacysandbox.ads.adservices.java.internal.a.q("[", name, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(cancellableContinuationImpl);
        sb.append(')');
        return sb.toString();
    }
}
