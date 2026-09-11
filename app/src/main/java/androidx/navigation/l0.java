package androidx.navigation;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(k0 k0Var) {
        k0Var.getClass();
        String strD = f.d(k0Var.getClass());
        if (strD.length() <= 0) {
            net.luminis.tls.engine.impl.c.o("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        k0 k0Var2 = (k0) linkedHashMap.get(strD);
        if (kotlin.jvm.internal.l.a(k0Var2, k0Var)) {
            return;
        }
        if (k0Var2 != null && k0Var2.b) {
            androidx.media3.exoplayer.hls.playlist.a.i("Navigator ", k0Var, " is replacing an already attached ", k0Var2);
        } else if (k0Var.b) {
            androidx.transition.k.l(k0Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final k0 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            net.luminis.tls.engine.impl.c.o("navigator name cannot be an empty string");
            return null;
        }
        k0 k0Var = (k0) this.a.get(str);
        if (k0Var != null) {
            return k0Var;
        }
        net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
