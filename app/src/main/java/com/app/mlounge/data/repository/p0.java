package com.app.mlounge.data.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public /* synthetic */ List e;
    public /* synthetic */ List y;
    public final /* synthetic */ q0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.z = q0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p0 p0Var = new p0(this.z, (kotlin.coroutines.d) obj3);
        p0Var.e = (List) obj;
        p0Var.y = (List) obj2;
        return p0Var.invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Integer numQ;
        Integer num;
        List<com.app.mlounge.data.local.entity.c> list = this.e;
        List list2 = this.y;
        kotlin.a.e(obj);
        ArrayList arrayList = new ArrayList();
        for (com.app.mlounge.data.local.entity.c cVar : list) {
            String str = cVar.l;
            if (str == null || (numQ = kotlin.text.r.Q(str)) == null) {
                string = null;
            } else {
                int iIntValue = numQ.intValue();
                String str2 = cVar.b;
                if (kotlin.jvm.internal.l.a(str2, "movie")) {
                    string = androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue, "movie:");
                } else if (!kotlin.jvm.internal.l.a(str2, "tv") || (num = cVar.m) == null) {
                    string = null;
                } else {
                    int iIntValue2 = num.intValue();
                    Integer num2 = cVar.n;
                    if (num2 != null) {
                        int iIntValue3 = num2.intValue();
                        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", iIntValue, ":", iIntValue2);
                        sbW.append(iIntValue3);
                        string = sbW.toString();
                    } else {
                        string = null;
                    }
                }
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((com.app.mlounge.data.local.entity.e) obj2).a() >= 0.95f) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.app.mlounge.data.local.entity.e) it.next()).a);
        }
        return kotlin.collections.o.o0(kotlin.collections.o.X(arrayList, arrayList3));
    }
}
