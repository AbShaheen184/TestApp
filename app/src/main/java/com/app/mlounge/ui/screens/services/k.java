package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;

    public /* synthetic */ k(int i, List list) {
        this.e = 1;
        this.y = list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[LOOP:0: B:25:0x006e->B:36:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[LOOP:2: B:42:0x00a9->B:53:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        char c;
        boolean z;
        Object next;
        String str;
        kotlin.k kVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z2 = false;
                int i = 1;
                char c2 = 2;
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar2 = o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar2, 12);
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    kotlin.jvm.functions.a aVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(aVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                    s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar, androidx.compose.ui.node.f.g);
                    s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    rVar.b0(-897325232);
                    List list = this.y;
                    int i2 = 0;
                    r rVar2 = rVar;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        kotlin.k kVar2 = (kotlin.k) obj3;
                        String str5 = (String) kVar2.e;
                        String str6 = (String) kVar2.y;
                        androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(w0.d(oVar2, 1.0f), 0.0f, 4, i);
                        t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.G, rVar2, 6);
                        int iHashCode2 = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarQ);
                        androidx.compose.ui.node.g.b.getClass();
                        kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(aVar2);
                        } else {
                            rVar2.o0();
                        }
                        s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
                        s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                        s.p(rVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                        s.t(rVar2, androidx.compose.ui.node.f.g);
                        s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                        p1 p1Var = u3.a;
                        boolean z3 = i;
                        r rVar3 = rVar2;
                        int i4 = i2;
                        o oVar3 = oVar2;
                        List list2 = list;
                        p3.b(str5, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(p1Var)).l, rVar3, 384, 0, 131066);
                        p3.b(str6, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.A, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(p1Var)).l, rVar3, 1573248, 0, 131002);
                        r rVar4 = rVar3;
                        rVar4.p(z3);
                        if (i4 < list2.size() - (z3 ? 1 : 0)) {
                            rVar4.b0(-2016776270);
                            c = 2;
                            oVar = oVar3;
                            t2.d(androidx.compose.foundation.layout.b.q(oVar, 0.0f, 2, z3 ? 1 : 0), 0.0f, androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.e), rVar4, 390, 2);
                            z = false;
                            rVar4.p(false);
                        } else {
                            oVar = oVar3;
                            c = 2;
                            z = false;
                            rVar4.b0(-2016656548);
                            rVar4.p(false);
                        }
                        i = z3 ? 1 : 0;
                        oVar2 = oVar;
                        c2 = c;
                        z2 = z;
                        i2 = i3;
                        list = list2;
                        rVar2 = rVar4;
                    }
                    rVar2.p(z2);
                    rVar2.p(i);
                } else {
                    rVar.W();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                n.a(this.y, (r) obj, s.A(1));
                return y.a;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                List list3 = this.y;
                if (list3.size() == 1) {
                    int size = list3.size();
                    if (size == 0) {
                        androidx.transition.k.m("List is empty.");
                    } else if (size == 1) {
                        String str7 = (String) list3.get(0);
                        int iB0 = kotlin.text.k.b0(charSequence, str7, iIntValue2, false, 4);
                        if (iB0 < 0) {
                            kVar = null;
                        } else {
                            kVar = new kotlin.k(Integer.valueOf(iB0), str7);
                        }
                    } else {
                        net.luminis.tls.engine.impl.c.o("List has more than one element.");
                    }
                    return null;
                }
                if (iIntValue2 < 0) {
                    iIntValue2 = 0;
                }
                kotlin.ranges.d dVar = new kotlin.ranges.d(iIntValue2, charSequence.length(), 1);
                boolean z4 = charSequence instanceof String;
                int i5 = dVar.z;
                int i6 = dVar.y;
                if (z4) {
                    if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                        kVar = null;
                    } else {
                        while (true) {
                            Iterator it = list3.iterator();
                            do {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    str4 = (String) next2;
                                } else {
                                    next2 = null;
                                }
                                str3 = (String) next2;
                                if (str3 != null) {
                                    kVar = new kotlin.k(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i6) {
                                    iIntValue2 += i5;
                                } else {
                                    kVar = null;
                                }
                            } while (!str4.regionMatches(0, (String) charSequence, iIntValue2, str4.length()));
                            str3 = (String) next2;
                            if (str3 != null) {
                                kVar = new kotlin.k(Integer.valueOf(iIntValue2), str3);
                            } else if (iIntValue2 != i6) {
                                iIntValue2 += i5;
                            } else {
                                kVar = null;
                            }
                        }
                    }
                } else if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                    kVar = null;
                } else {
                    int i7 = iIntValue2;
                    while (true) {
                        Iterator it2 = list3.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = it2.next();
                                str2 = (String) next;
                            } else {
                                next = null;
                            }
                            str = (String) next;
                            if (str != null) {
                                kVar = new kotlin.k(Integer.valueOf(i7), str);
                            } else if (i7 != i6) {
                                i7 += i5;
                            } else {
                                kVar = null;
                            }
                        } while (!kotlin.text.k.i0(str2, 0, charSequence, i7, str2.length(), false));
                        str = (String) next;
                        if (str != null) {
                            kVar = new kotlin.k(Integer.valueOf(i7), str);
                        } else if (i7 != i6) {
                            i7 += i5;
                        } else {
                            kVar = null;
                        }
                    }
                }
                if (kVar != null) {
                    return new kotlin.k(kVar.e, Integer.valueOf(((String) kVar.y).length()));
                }
                return null;
        }
    }

    public /* synthetic */ k(List list, int i, byte b) {
        this.e = i;
        this.y = list;
    }
}
