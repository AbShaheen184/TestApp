package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 b = new j0(0);
    public static final j0 c = new j0(1);
    public static final j0 d = new j0(2);
    public static final j0 e = new j0(3);
    public static final j0 f = new j0(4);
    public static final j0 g = new j0(5);
    public static final j0 h = new j0(6);
    public static final j0 i = new j0(7);
    public static final j0 j = new j0(8);
    public static final j0 k = new j0(9);
    public static final j0 l = new j0(10);
    public static final j0 m = new j0(11);
    public static final j0 n = new j0(12);
    public static final j0 o = new j0(13);
    public static final j0 p = new j0(14);
    public final /* synthetic */ int a;

    public /* synthetic */ j0(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        switch (this.a) {
            case 0:
                return k0.d(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return e1.a(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1;
            case 10:
                return i2 == 1 || i2 == 2;
            case 11:
                return com.google.android.datatransport.runtime.backends.c.i(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
