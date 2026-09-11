package okhttp3.internal.http;

import com.google.android.gms.measurement.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import okhttp3.g0;
import okhttp3.m;
import okhttp3.n;
import okhttp3.r;
import okhttp3.s;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.A;
        e0.h("\"\\");
        e0.h("\t ,=");
    }

    public static final boolean a(g0 g0Var) {
        if (l.a(g0Var.e.b, "HEAD")) {
            return false;
        }
        int i = g0Var.A;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && okhttp3.internal.g.e(g0Var) == -1 && !"chunked".equalsIgnoreCase(g0.g("Transfer-Encoding", g0Var))) ? false : true;
    }

    public static final void b(n nVar, s sVar, r rVar) {
        nVar.getClass();
        sVar.getClass();
        rVar.getClass();
        if (nVar == n.u) {
            return;
        }
        Pattern pattern = m.k;
        List listH = rVar.h("Set-Cookie");
        int size = listH.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m mVarO = com.google.common.base.i.o(sVar, (String) listH.get(i));
            if (mVarO != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mVarO);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = u.e;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        nVar.g(sVar, listUnmodifiableList);
    }
}
