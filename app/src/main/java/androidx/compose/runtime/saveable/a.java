package androidx.compose.runtime.saveable;

import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ a(int i, p pVar) {
        this.e = 2;
        this.y = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar;
        switch (this.e) {
            case 0:
                c cVar = (c) obj;
                List list = (List) this.y.invoke(cVar, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (hVar = cVar.y) != null && !hVar.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 1:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.y.invoke(rVar, 0);
                } else {
                    rVar.W();
                }
                return y.a;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.o(this.y, (r) obj, s.A(1));
                return y.a;
        }
    }

    public /* synthetic */ a(p pVar, int i, byte b) {
        this.e = i;
        this.y = pVar;
    }
}
