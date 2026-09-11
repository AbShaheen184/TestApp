package org.jsoup.internal;

import java.util.function.BinaryOperator;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements BinaryOperator {
    public final /* synthetic */ int e;

    public /* synthetic */ i(int i) {
        this.e = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                String strL = k.l(jVar2.a);
                jVar2.a = null;
                n.H(jVar.a);
                jVar.a.append((Object) strL);
                return jVar;
            default:
                return (String) obj2;
        }
    }
}
