package androidx.compose.foundation.lazy;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.r {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.internal.f y;

    public /* synthetic */ j(androidx.compose.runtime.internal.f fVar, int i) {
        this.e = i;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                d dVar = (d) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= rVar.f(dVar) ? 4 : 2;
                }
                if (rVar.T(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
                    this.y.invoke(dVar, rVar, Integer.valueOf(iIntValue & 14));
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= rVar2.f(jVar) ? 4 : 2;
                }
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & Token.DO) != 130)) {
                    this.y.invoke(jVar, rVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
