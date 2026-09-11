package androidx.compose.ui.semantics;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    public final /* synthetic */ int e;
    public static final f y = new f(0);
    public static final f z = new f(1);
    public static final f A = new f(2);

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.geometry.c cVarH = ((p) obj).h();
                androidx.compose.ui.geometry.c cVarH2 = ((p) obj2).h();
                int iCompare = Float.compare(cVarH.a, cVarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.b, cVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.d, cVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.c, cVarH2.c);
            case 1:
                androidx.compose.ui.geometry.c cVarH3 = ((p) obj).h();
                androidx.compose.ui.geometry.c cVarH4 = ((p) obj2).h();
                int iCompare4 = Float.compare(cVarH4.c, cVarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.b, cVarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.d, cVarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.a, cVarH3.a);
            default:
                kotlin.k kVar = (kotlin.k) obj;
                kotlin.k kVar2 = (kotlin.k) obj2;
                int iCompare7 = Float.compare(((androidx.compose.ui.geometry.c) kVar.e).b, ((androidx.compose.ui.geometry.c) kVar2.e).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((androidx.compose.ui.geometry.c) kVar.e).d, ((androidx.compose.ui.geometry.c) kVar2.e).d);
        }
    }
}
