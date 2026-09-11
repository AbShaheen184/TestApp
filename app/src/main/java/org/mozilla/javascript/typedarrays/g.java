package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeTypedArrayView.lambda$init$16((NativeTypedArrayView.RealThis) this.y, context, scriptable, scriptable2, objArr);
            case 1:
                return NativeTypedArrayView.lambda$init$17((NativeTypedArrayView.RealThis) this.y, context, scriptable, scriptable2, objArr);
            default:
                return NativeArrayBuffer.lambda$init$0((LambdaConstructor) this.y, context, scriptable, scriptable2, objArr);
        }
    }
}
