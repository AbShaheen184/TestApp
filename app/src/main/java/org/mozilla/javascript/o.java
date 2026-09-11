package org.mozilla.javascript;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return JavaMembers.getMoreConcreteMethod((Method) obj, (Method) obj2);
    }
}
