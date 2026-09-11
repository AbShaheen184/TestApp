package com.app.mlounge.ui.screens.livetv;

import androidx.compose.runtime.m;
import com.app.mlounge.data.iptv.n;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ long B;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public f(List list, Map map, l lVar, l lVar2, long j) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = j;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        long j;
        Object next;
        androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i = (iIntValue2 & 6) == 0 ? (rVar.f(dVar) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= rVar.d(iIntValue) ? 32 : 16;
        }
        if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            IptvChannel iptvChannel = (IptvChannel) this.e.get(iIntValue);
            rVar.b0(642646740);
            Iterable iterable = (List) this.y.get(iptvChannel.e());
            if (iterable == null) {
                iterable = u.e;
            }
            Iterator it = iterable.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                obj5 = null;
                j = this.B;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                n nVar = (n) next;
                if (nVar.c() <= j && nVar.a() > j) {
                    break;
                }
            }
            n nVar2 = (n) next;
            for (Object obj6 : iterable) {
                if (((n) obj6).c() > j) {
                    obj5 = obj6;
                    break;
                }
            }
            n nVar3 = (n) obj5;
            l lVar = this.z;
            boolean zF = rVar.f(lVar) | rVar.f(iptvChannel);
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (zF || objQ == fVar) {
                objQ = new e(lVar, iptvChannel, 0);
                rVar.l0(objQ);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
            l lVar2 = this.A;
            boolean zF2 = rVar.f(lVar2) | rVar.f(iptvChannel);
            Object objQ2 = rVar.Q();
            if (zF2 || objQ2 == fVar) {
                objQ2 = new e(lVar2, iptvChannel, 1);
                rVar.l0(objQ2);
            }
            a.a(iptvChannel, nVar2, nVar3, aVar, (kotlin.jvm.functions.a) objQ2, rVar, 0);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return y.a;
    }
}
