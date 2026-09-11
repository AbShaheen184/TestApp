package androidx.compose.ui.semantics;

import androidx.compose.ui.graphics.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j D;
    public static final j E;
    public static final j F;
    public static final j G;
    public static final j H;
    public static final j I;
    public static final j J;
    public static final j K;
    public static final j L;
    public static final j M;
    public static final j N;
    public static final j O;
    public static final j P;
    public static final j Q;
    public static final j R;
    public static final j S;
    public static final j T;
    public static final j z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new j(i, 0);
        A = new j(i, 1);
        B = new j(i, 2);
        C = new j(i, 3);
        D = new j(i, 4);
        E = new j(i, 5);
        F = new j(i, 6);
        G = new j(i, 7);
        H = new j(i, 8);
        I = new j(i, 9);
        J = new j(i, 10);
        K = new j(i, 11);
        L = new j(i, 12);
        M = new j(i, 13);
        N = new j(i, 14);
        O = new j(i, 15);
        P = new j(i, 16);
        Q = new j(i, 17);
        R = new j(i, 18);
        S = new j(i, 19);
        T = new j(i, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        kotlin.d dVar;
        switch (this.y) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = kotlin.collections.u.e;
                }
                return kotlin.collections.o.X(collection, list);
            case 1:
                return (androidx.compose.ui.autofill.e) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 3:
                return (androidx.compose.ui.autofill.p) obj;
            case 4:
                return (androidx.compose.ui.autofill.q) obj;
            case 5:
                return (kotlin.y) obj;
            case 6:
                return (kotlin.y) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (kotlin.y) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                h hVar = (h) obj;
                int i = ((h) obj2).a;
                return hVar;
            case 12:
                return (n0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 15:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.a) == null) {
                    str = aVar2.a;
                }
                if (aVar == null || (dVar = aVar.b) == null) {
                    dVar = aVar2.b;
                }
                return new a(str, dVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                p pVar = (p) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                l lVar = ((p) obj).d;
                w wVar = t.t;
                Object objG = lVar.e.g(wVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = pVar.d.e.g(wVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
