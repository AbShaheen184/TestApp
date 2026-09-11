package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    public static f2 a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        f2 f2Var = generatedMessageLite.unknownFields;
        if (f2Var != f2.f) {
            return f2Var;
        }
        f2 f2Var2 = new f2();
        generatedMessageLite.unknownFields = f2Var2;
        return f2Var2;
    }

    public static boolean b(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws x0, androidx.datastore.preferences.protobuf.w {
        t tVar = (t) wVar.e;
        int i2 = wVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            wVar.U(0);
            ((f2) obj).f(i3 << 3, Long.valueOf(tVar.r()));
            return true;
        }
        if (i4 == 1) {
            wVar.U(1);
            ((f2) obj).f((i3 << 3) | 1, Long.valueOf(tVar.o()));
            return true;
        }
        if (i4 == 2) {
            ((f2) obj).f((i3 << 3) | 2, wVar.m());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new x0("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw x0.c();
            }
            wVar.U(5);
            ((f2) obj).f(5 | (i3 << 3), Integer.valueOf(tVar.n()));
            return true;
        }
        f2 f2Var = new f2();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (wVar.c() != Integer.MAX_VALUE && b(i7, wVar, f2Var)) {
        }
        if (i6 != wVar.b) {
            throw new x0("Protocol message end-group tag did not match expected tag.");
        }
        if (f2Var.e) {
            f2Var.e = false;
        }
        ((f2) obj).f(i5 | 3, f2Var);
        return true;
    }
}
