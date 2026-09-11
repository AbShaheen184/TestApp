package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {
    public final i e;
    public final g y;

    public c(i iVar, g gVar) {
        iVar.getClass();
        gVar.getClass();
        this.e = iVar;
        this.y = gVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                i iVar = cVar2.e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.e;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.y;
                    if (!l.a(cVar.get(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = cVar4.e;
                    if (!(iVar3 instanceof c)) {
                        iVar3.getClass();
                        g gVar2 = (g) iVar3;
                        zA = l.a(cVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, p pVar) {
        pVar.getClass();
        return pVar.invoke(this.e.fold(obj, pVar), this.y);
    }

    @Override // kotlin.coroutines.i
    public final g get(h hVar) {
        hVar.getClass();
        c cVar = this;
        while (true) {
            g gVar = cVar.y.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.e;
            if (!(iVar instanceof c)) {
                return iVar.get(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + this.e.hashCode();
    }

    @Override // kotlin.coroutines.i
    public final i minusKey(h hVar) {
        hVar.getClass();
        g gVar = this.y;
        g gVar2 = gVar.get(hVar);
        i iVar = this.e;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(hVar);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.e ? gVar : new c(iVarMinusKey, gVar);
    }

    @Override // kotlin.coroutines.i
    public final i plus(i iVar) {
        iVar.getClass();
        return iVar == j.e ? this : (i) iVar.fold(this, new com.app.mlounge.ui.screens.watchlist.c(2));
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("["), (String) fold("", new com.app.mlounge.ui.screens.watchlist.c(1)), ']');
    }
}
