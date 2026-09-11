package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.c2;
import androidx.collection.a1;
import androidx.collection.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final /* synthetic */ int B = 0;
    public final z0 A;
    public final String e;
    public final androidx.appcompat.widget.o y;
    public v z;

    static {
        new LinkedHashMap();
    }

    public t(k0 k0Var) {
        k0Var.getClass();
        LinkedHashMap linkedHashMap = l0.b;
        this.e = f.d(k0Var.getClass());
        androidx.appcompat.widget.o oVar = new androidx.appcompat.widget.o();
        oVar.b = this;
        oVar.c = new ArrayList();
        oVar.d = new LinkedHashMap();
        this.y = oVar;
        this.A = new z0(0);
    }

    public final Bundle b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.y.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            gVar.getClass();
            str.getClass();
            if (gVar.b && (obj = gVar.c) != null) {
                gVar.a.e(bundleI, str, obj);
            }
        }
        if (bundle != null) {
            bundleI.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                g gVar2 = (g) entry2.getValue();
                gVar2.getClass();
                i0 i0Var = gVar2.a;
                str2.getClass();
                if (!bundleI.containsKey(str2) || !_COROUTINE.b.y(str2, bundleI)) {
                    try {
                        i0Var.a(str2, bundleI);
                    } catch (IllegalStateException unused) {
                    }
                }
                androidx.media3.exoplayer.hls.playlist.a.l(androidx.privacysandbox.ads.adservices.java.internal.a.x("Wrong argument type for '", str2, "' in argument savedState. "), i0Var.b(), " expected.");
                return null;
            }
        }
        return bundleI;
    }

    public final Map c() {
        return kotlin.collections.a0.H((LinkedHashMap) this.y.d);
    }

    public s d(c2 c2Var) {
        boolean zE;
        kotlin.text.i iVar;
        kotlin.text.g gVarD;
        androidx.appcompat.widget.o oVar = this.y;
        LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.d;
        Uri uri = (Uri) c2Var.y;
        ArrayList<r> arrayList = (ArrayList) oVar.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        s sVar = null;
        for (r rVar : arrayList) {
            rVar.getClass();
            kotlin.o oVar2 = rVar.d;
            if (((kotlin.text.i) oVar2.getValue()) == null) {
                zE = true;
            } else if (uri == null) {
                zE = false;
            } else {
                kotlin.text.i iVar2 = (kotlin.text.i) oVar2.getValue();
                iVar2.getClass();
                zE = iVar2.e(uri.toString());
            }
            if (zE) {
                Bundle bundleD = uri != null ? rVar.d(uri, linkedHashMap) : null;
                int iB = rVar.b(uri);
                String str = (String) c2Var.z;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                        if (uri != null && (iVar = (kotlin.text.i) oVar2.getValue()) != null && (gVarD = iVar.d(uri.toString())) != null) {
                            rVar.e(gVarD, bundleI, linkedHashMap);
                            if (((Boolean) rVar.e.getValue()).booleanValue()) {
                                rVar.f(uri, bundleI, linkedHashMap);
                            }
                        }
                        if (f.e(linkedHashMap, new p(1, bundleI)).isEmpty()) {
                        }
                    }
                }
                s sVar2 = new s((t) oVar.b, bundleD, rVar.l, iB, z);
                if (sVar == null || sVar2.compareTo(sVar) > 0) {
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof t)) {
                androidx.appcompat.widget.o oVar = this.y;
                ArrayList arrayList = (ArrayList) oVar.c;
                t tVar = (t) obj;
                z0 z0Var = tVar.A;
                androidx.appcompat.widget.o oVar2 = tVar.y;
                boolean zA = kotlin.jvm.internal.l.a(arrayList, (ArrayList) oVar2.c);
                z0 z0Var2 = this.A;
                if (z0Var2.f() != z0Var.f()) {
                    z = false;
                    break;
                }
                Iterator it = ((kotlin.sequences.a) kotlin.sequences.k.n(new a1(z0Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!kotlin.jvm.internal.l.a(z0Var2.c(iIntValue), z0Var.c(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (c().size() != tVar.c().size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = ((Iterable) kotlin.collections.o.D(c().entrySet()).b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!tVar.c().containsKey(entry.getKey()) || !kotlin.jvm.internal.l.a(tVar.c().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (oVar.a != oVar2.a || !kotlin.jvm.internal.l.a((String) oVar.e, (String) oVar2.e) || !zA || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        androidx.appcompat.widget.o oVar = this.y;
        int i = oVar.a * 31;
        String str = (String) oVar.e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) oVar.c).iterator();
        while (it.hasNext()) {
            iHashCode = (((r) it.next()).a.hashCode() + (iHashCode * 31)) * 961;
        }
        z0 z0Var = this.A;
        z0Var.getClass();
        if (z0Var.f() > 0) {
            z0Var.g(0).getClass();
            androidx.transition.k.i();
            return 0;
        }
        for (String str2 : c().keySet()) {
            int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(iHashCode * 31, 31, str2);
            Object obj = c().get(str2);
            iHashCode = iE + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        androidx.appcompat.widget.o oVar = this.y;
        oVar.getClass();
        sb.append(Integer.toHexString(oVar.a));
        sb.append(")");
        String str = (String) oVar.e;
        if (str != null && !kotlin.text.k.d0(str)) {
            sb.append(" route=");
            sb.append((String) oVar.e);
        }
        return sb.toString();
    }
}
