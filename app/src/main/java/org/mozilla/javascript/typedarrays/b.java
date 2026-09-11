package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int e;

    public /* synthetic */ b(int i) {
        this.e = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeArrayBuffer.js_isView(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeDataView.lambda$init$18(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeDataView.lambda$init$3(context, scriptable, scriptable2, objArr);
            case 3:
                return NativeDataView.lambda$init$4(context, scriptable, scriptable2, objArr);
            case 4:
                return NativeDataView.lambda$init$5(context, scriptable, scriptable2, objArr);
            case 5:
                return NativeDataView.lambda$init$6(context, scriptable, scriptable2, objArr);
            case 6:
                return NativeDataView.lambda$init$7(context, scriptable, scriptable2, objArr);
            case 7:
                return NativeDataView.lambda$init$8(context, scriptable, scriptable2, objArr);
            case 8:
                return NativeDataView.lambda$init$9(context, scriptable, scriptable2, objArr);
            case 9:
                return NativeDataView.lambda$init$10(context, scriptable, scriptable2, objArr);
            case 10:
                return NativeDataView.lambda$init$11(context, scriptable, scriptable2, objArr);
            case 11:
                return NativeDataView.lambda$init$12(context, scriptable, scriptable2, objArr);
            case 12:
                return NativeDataView.lambda$init$13(context, scriptable, scriptable2, objArr);
            case 13:
                return NativeDataView.lambda$init$14(context, scriptable, scriptable2, objArr);
            case 14:
                return NativeDataView.lambda$init$15(context, scriptable, scriptable2, objArr);
            case 15:
                return NativeDataView.lambda$init$16(context, scriptable, scriptable2, objArr);
            default:
                return NativeDataView.lambda$init$17(context, scriptable, scriptable2, objArr);
        }
    }
}
