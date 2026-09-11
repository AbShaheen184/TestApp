package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static a1 a(Object obj) {
        t tVar = (t) obj;
        a1 a1Var = tVar.unknownFields;
        if (a1Var != a1.f) {
            return a1Var;
        }
        a1 a1Var2 = new a1(0, new int[8], new Object[8], true);
        tVar.unknownFields = a1Var2;
        return a1Var2;
    }

    public static boolean b(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws com.google.protobuf.w0, x {
        int i2 = wVar.b;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) wVar.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            wVar.U(0);
            ((a1) obj).c(i3 << 3, Long.valueOf(w0Var.B()));
            return true;
        }
        if (i4 == 1) {
            wVar.U(1);
            ((a1) obj).c((i3 << 3) | 1, Long.valueOf(w0Var.y()));
            return true;
        }
        if (i4 == 2) {
            ((a1) obj).c((i3 << 3) | 2, wVar.l());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw x.b();
            }
            wVar.U(5);
            ((a1) obj).c(5 | (i3 << 3), Integer.valueOf(w0Var.x()));
            return true;
        }
        a1 a1Var = new a1(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (wVar.c() != Integer.MAX_VALUE && b(i7, wVar, a1Var)) {
        }
        if (i6 != wVar.b) {
            throw new x("Protocol message end-group tag did not match expected tag.");
        }
        if (a1Var.e) {
            a1Var.e = false;
        }
        ((a1) obj).c(i5 | 3, a1Var);
        return true;
    }
}
