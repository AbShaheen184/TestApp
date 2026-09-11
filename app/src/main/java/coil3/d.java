package coil3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final kotlin.o f;
    public final kotlin.o g;

    public d(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: coil3.b
            public final /* synthetic */ d y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d dVar = this.y;
                        List list6 = dVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            kotlin.collections.o.C(arrayList, (List) ((kotlin.jvm.functions.a) list6.get(i2)).invoke());
                        }
                        dVar.d = kotlin.collections.u.e;
                        return arrayList;
                    default:
                        d dVar2 = this.y;
                        List list7 = dVar2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            kotlin.collections.o.C(arrayList2, (List) ((kotlin.jvm.functions.a) list7.get(i3)).invoke());
                        }
                        dVar2.e = kotlin.collections.u.e;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: coil3.b
            public final /* synthetic */ d y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d dVar = this.y;
                        List list6 = dVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            kotlin.collections.o.C(arrayList, (List) ((kotlin.jvm.functions.a) list6.get(i3)).invoke());
                        }
                        dVar.d = kotlin.collections.u.e;
                        return arrayList;
                    default:
                        d dVar2 = this.y;
                        List list7 = dVar2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            kotlin.collections.o.C(arrayList2, (List) ((kotlin.jvm.functions.a) list7.get(i4)).invoke());
                        }
                        dVar2.e = kotlin.collections.u.e;
                        return arrayList2;
                }
            }
        });
    }
}
