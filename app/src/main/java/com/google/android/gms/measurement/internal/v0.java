package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ x0 d;

    public v0(x0 x0Var, int i, boolean z, boolean z2) {
        this.d = x0Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.E(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.E(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
