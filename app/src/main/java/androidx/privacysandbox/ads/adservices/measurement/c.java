package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.foundation.text.input.internal.k;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import okhttp3.internal.platform.android.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends g {
    public final MeasurementManager H;

    public c(MeasurementManager measurementManager) {
        this.H = measurementManager;
    }

    public static Object O(c cVar, a aVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.H;
        throw null;
    }

    public static Object P(c cVar, kotlin.coroutines.d<? super Integer> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.H.getMeasurementApiStatus(new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        return cancellableContinuationImpl.getResult();
    }

    public static Object R(c cVar, Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super y> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.H.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    public static Object S(c cVar, d dVar, kotlin.coroutines.d<? super y> dVar2) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new k(cVar, null, 4), dVar2);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public static Object T(c cVar, Uri uri, kotlin.coroutines.d<? super y> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.H.registerTrigger(uri, new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    public static Object V(c cVar, e eVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.H;
        throw null;
    }

    public static Object X(c cVar, f fVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.H;
        throw null;
    }

    @Override // okhttp3.internal.platform.android.g
    public Object I(Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super y> dVar) {
        return R(this, uri, inputEvent, dVar);
    }

    @Override // okhttp3.internal.platform.android.g
    public Object J(Uri uri, kotlin.coroutines.d<? super y> dVar) {
        return T(this, uri, dVar);
    }

    public Object N(a aVar, kotlin.coroutines.d<? super y> dVar) {
        return O(this, aVar, dVar);
    }

    public Object Q(d dVar, kotlin.coroutines.d<? super y> dVar2) {
        return S(this, dVar, dVar2);
    }

    public Object U(e eVar, kotlin.coroutines.d<? super y> dVar) {
        return V(this, eVar, dVar);
    }

    public Object W(f fVar, kotlin.coroutines.d<? super y> dVar) {
        return X(this, fVar, dVar);
    }

    @Override // okhttp3.internal.platform.android.g
    public Object q(kotlin.coroutines.d<? super Integer> dVar) {
        return P(this, dVar);
    }
}
