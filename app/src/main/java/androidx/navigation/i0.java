package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final d a;
    public static final c b;
    public static final d c;
    public static final c d;
    public static final d e;
    public static final c f;
    public static final d g;
    public static final c h;
    public static final d i;
    public static final c j;

    static {
        int i2 = 2;
        boolean z = false;
        a = new d(i2, z);
        boolean z2 = true;
        b = new c(i2, z2);
        int i3 = 3;
        c = new d(i3, z);
        d = new c(i3, z2);
        int i4 = 1;
        e = new d(i4, z);
        f = new c(i4, z2);
        int i5 = 0;
        g = new d(i5, z);
        h = new c(i5, z2);
        int i6 = 4;
        i = new d(i6, z2);
        j = new c(i6, z2);
    }

    public i0(boolean z) {
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return kotlin.jvm.internal.l.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
