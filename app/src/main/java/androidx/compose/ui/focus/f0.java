package androidx.compose.ui.focus;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Comparator {
    public static final f0 e = new f0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        int i = 0;
        if (d.s(e0Var) && d.s(e0Var2)) {
            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0Var);
            androidx.compose.ui.node.f0 f0VarT2 = androidx.compose.ui.node.k.t(e0Var2);
            if (!kotlin.jvm.internal.l.a(f0VarT, f0VarT2)) {
                Object[] objArr = new androidx.compose.ui.node.f0[16];
                int i2 = 0;
                while (f0VarT != null) {
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i2 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                    }
                    objArr[0] = f0VarT;
                    i2++;
                    f0VarT = f0VarT.v();
                }
                Object[] objArr3 = new androidx.compose.ui.node.f0[16];
                int i4 = 0;
                while (f0VarT2 != null) {
                    int i5 = i4 + 1;
                    if (objArr3.length < i5) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i4 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i4 + 0);
                    }
                    objArr3[0] = f0VarT2;
                    i4++;
                    f0VarT2 = f0VarT2.v();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.l.a(objArr[i], objArr3[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.l.b(((androidx.compose.ui.node.f0) objArr[i]).w(), ((androidx.compose.ui.node.f0) objArr3[i]).w());
                }
                net.luminis.tls.engine.impl.c.r("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (d.s(e0Var)) {
                return -1;
            }
            if (d.s(e0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
