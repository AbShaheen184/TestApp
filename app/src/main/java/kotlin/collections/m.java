package kotlin.collections;

import androidx.collection.b1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ m(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                Object[] objArr = (Object[]) this.y;
                objArr.getClass();
                return new b1(objArr);
            case 1:
                Object[] objArr2 = (Object[]) ((androidx.room.coroutines.d) this.y).y;
                objArr2.getClass();
                return new y(new b1(objArr2));
            default:
                return new kotlin.text.b((kotlin.text.c) this.y);
        }
    }
}
