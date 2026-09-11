package androidx.navigation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public final k0 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public u(k0 k0Var, String str) {
        this.a = k0Var;
        this.b = str;
    }

    public t a() {
        t tVarB = b();
        tVarB.getClass();
        androidx.appcompat.widget.o oVar = tVarB.y;
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            str.getClass();
            gVar.getClass();
            oVar.getClass();
            ((LinkedHashMap) oVar.d).put(str, gVar);
        }
        for (final r rVar : this.d) {
            rVar.getClass();
            oVar.getClass();
            final int i = 0;
            ArrayList arrayListE = f.e((LinkedHashMap) oVar.d, new kotlin.jvm.functions.l() { // from class: androidx.navigation.internal.g
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    boolean zContains;
                    String str2 = (String) obj;
                    switch (i) {
                        case 0:
                            str2.getClass();
                            zContains = rVar.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = rVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + rVar.a + " can't be used to open destination " + ((t) oVar.b) + ".\nFollowing required arguments are missing: " + arrayListE).toString());
            }
            ((ArrayList) oVar.c).add(rVar);
        }
        Iterator it = this.e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            androidx.transition.k.i();
        } else {
            String str2 = this.b;
            if (str2 == null) {
                return tVarB;
            }
            oVar.getClass();
            if (!kotlin.text.k.d0(str2)) {
                String strConcat = "android-app://androidx.navigation/".concat(str2);
                final r rVar2 = new r(strConcat);
                final int i2 = 1;
                ArrayList arrayListE2 = f.e((LinkedHashMap) oVar.d, new kotlin.jvm.functions.l() { // from class: androidx.navigation.internal.g
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContains;
                        String str3 = (String) obj;
                        switch (i2) {
                            case 0:
                                str3.getClass();
                                zContains = rVar2.c().contains(str3);
                                break;
                            default:
                                str3.getClass();
                                zContains = rVar2.c().contains(str3);
                                break;
                        }
                        return Boolean.valueOf(!zContains);
                    }
                });
                if (arrayListE2.isEmpty()) {
                    oVar.f = new kotlin.o(new androidx.activity.w(strConcat, 28));
                    oVar.a = strConcat.hashCode();
                    oVar.e = str2;
                    return tVarB;
                }
                StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Cannot set route \"", str2, "\" for destination ");
                sbX.append((t) oVar.b);
                sbX.append(". Following required arguments are missing: ");
                sbX.append(arrayListE2);
                throw new IllegalArgumentException(sbX.toString().toString());
            }
            net.luminis.tls.engine.impl.c.o("Cannot have an empty route");
        }
        return null;
    }

    public t b() {
        return this.a.a();
    }
}
