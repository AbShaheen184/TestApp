package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import java.io.IOException;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ m(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                long j = ((androidx.compose.ui.graphics.t) obj).a;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= rVar.e(j) ? 4 : 2;
                }
                if (rVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    n.b(((androidx.compose.foundation.text.contextmenu.data.d) this.y).c, j, rVar, (iIntValue << 3) & Token.ASSIGN_MOD);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                long j2 = ((androidx.compose.ui.graphics.t) obj).a;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v.a.d((Drawable) this.y, rVar2, 48);
                } else {
                    rVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ((kotlin.jvm.functions.p) this.y).invoke(rVar3, 0);
                } else {
                    rVar3.W();
                }
                break;
        }
        return y.a;
    }
}
