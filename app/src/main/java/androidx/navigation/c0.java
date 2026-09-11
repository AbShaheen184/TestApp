package androidx.navigation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final a0 a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    public c0() {
        a0 a0Var = new a0();
        a0Var.a = -1;
        a0Var.e = -1;
        a0Var.f = -1;
        this.a = a0Var;
        this.d = -1;
    }

    public final void a(String str) {
        if (str != null) {
            if (kotlin.text.k.d0(str)) {
                net.luminis.tls.engine.impl.c.o("Cannot pop up to an empty route");
            } else {
                this.e = str;
                this.f = false;
            }
        }
    }
}
