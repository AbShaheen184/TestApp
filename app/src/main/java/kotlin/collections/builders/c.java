package kotlin.collections.builders;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.emoji2.text.flatbuffer.c implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int B;

    public c(e eVar, int i) {
        this.B = i;
        eVar.getClass();
        this.A = eVar;
        this.y = -1;
        this.z = eVar.E;
        d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.B) {
            case 0:
                c();
                int i = this.e;
                e eVar = (e) this.A;
                if (i >= eVar.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i + 1;
                this.y = i;
                d dVar = new d(eVar, i);
                d();
                return dVar;
            case 1:
                c();
                int i2 = this.e;
                e eVar2 = (e) this.A;
                if (i2 >= eVar2.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i2 + 1;
                this.y = i2;
                Object obj = eVar2.e[i2];
                d();
                return obj;
            default:
                c();
                int i3 = this.e;
                e eVar3 = (e) this.A;
                if (i3 >= eVar3.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i3 + 1;
                this.y = i3;
                Object[] objArr = eVar3.y;
                objArr.getClass();
                Object obj2 = objArr[this.y];
                d();
                return obj2;
        }
    }
}
