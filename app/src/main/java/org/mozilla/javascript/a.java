package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Function {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractEcmaObjectOperations.lambda$groupBy$0(obj);
            case 1:
                return NativeConsole.lambda$count$0((String) obj);
            default:
                return NativeSymbol.js_description((Scriptable) obj);
        }
    }
}
