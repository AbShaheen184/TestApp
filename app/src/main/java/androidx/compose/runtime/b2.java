package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    public final /* synthetic */ androidx.compose.runtime.tooling.d e;
    public final /* synthetic */ c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(CoroutineExceptionHandler.Key key, androidx.compose.runtime.tooling.d dVar, c2 c2Var) {
        super(key);
        this.e = dVar;
        this.y = c2Var;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.i iVar, Throwable th) throws Throwable {
        androidx.compose.runtime.tooling.d dVar = this.e;
        c2 c2Var = this.y;
        okhttp3.internal.platform.android.g.L(th, new androidx.activity.compose.f(16, dVar, c2Var));
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        key.getClass();
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c2Var.e.get(key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(iVar, th);
    }
}
