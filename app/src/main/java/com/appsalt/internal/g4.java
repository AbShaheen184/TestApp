package com.appsalt.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 {
    public static boolean b;
    public static final g4 c = new g4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g4(int i) {
        this.a = i;
    }

    public final void a(int i, String str) {
        int i2;
        switch (this.a) {
            case 0:
                break;
            default:
                int iE = androidx.constraintlayout.core.g.e(i);
                if (iE == 0) {
                    i2 = 6;
                } else if (iE == 1) {
                    i2 = 5;
                } else if (iE != 2) {
                    i2 = 3;
                    if (iE != 3) {
                        coil3.g.a();
                    }
                } else {
                    i2 = 4;
                }
                Log.println(i2, "Appsalt", str);
                break;
        }
    }

    private final void b(int i, String str) {
    }
}
