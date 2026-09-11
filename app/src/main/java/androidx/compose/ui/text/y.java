package androidx.compose.ui.text;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.animation.s0;
import androidx.datastore.core.f1;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ y(androidx.room.q qVar) {
        this.e = 28;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        e eVar;
        j jVar = null;
        jVar = null;
        switch (this.e) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                i iVar = obj2 != null ? (i) obj2 : null;
                iVar.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (iVar.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        s sVar = (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (s) ((kotlin.jvm.functions.l) c0.g.z).invoke(obj6);
                        sVar.getClass();
                        eVar = new e(iIntValue, str, sVar, iIntValue2);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        e0 e0Var = (kotlin.jvm.internal.l.a(obj7, Boolean.FALSE) || obj7 == null) ? null : (e0) ((kotlin.jvm.functions.l) c0.h.z).invoke(obj7);
                        e0Var.getClass();
                        eVar = new e(iIntValue, str, e0Var, iIntValue2);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        o0 o0Var = (kotlin.jvm.internal.l.a(obj8, Boolean.FALSE) || obj8 == null) ? null : (o0) ((kotlin.jvm.functions.l) c0.c.z).invoke(obj8);
                        o0Var.getClass();
                        eVar = new e(iIntValue, str, o0Var, iIntValue2);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        n0 n0Var = (kotlin.jvm.internal.l.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (n0) ((kotlin.jvm.functions.l) c0.d.z).invoke(obj9);
                        n0Var.getClass();
                        eVar = new e(iIntValue, str, n0Var, iIntValue2);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        l lVar = (kotlin.jvm.internal.l.a(obj10, Boolean.FALSE) || obj10 == null) ? null : (l) ((kotlin.jvm.functions.l) c0.e.z).invoke(obj10);
                        lVar.getClass();
                        eVar = new e(iIntValue, str, lVar, iIntValue2);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        k kVar = (kotlin.jvm.internal.l.a(obj11, Boolean.FALSE) || obj11 == null) ? null : (k) ((kotlin.jvm.functions.l) c0.f.z).invoke(obj11);
                        kVar.getClass();
                        eVar = new e(iIntValue, str, kVar, iIntValue2);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        eVar = new e(iIntValue, str, new g0(str2), iIntValue2);
                        break;
                    default:
                        coil3.g.a();
                        return null;
                }
                return eVar;
            case 1:
                obj.getClass();
                return new androidx.compose.ui.text.style.g(((Integer) obj).intValue());
            case 2:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new o0(str3);
            case 3:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new n0(str4);
            case 4:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                b0 b0Var = c0.q;
                Boolean bool = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj13, bool);
                androidx.compose.ui.text.style.k kVar2 = obj13 != null ? (androidx.compose.ui.text.style.k) b0Var.y.invoke(obj13) : null;
                kVar2.getClass();
                int i = kVar2.a;
                Object obj14 = list2.get(1);
                b0 b0Var2 = c0.r;
                kotlin.jvm.internal.l.a(obj14, bool);
                androidx.compose.ui.text.style.m mVar = obj14 != null ? (androidx.compose.ui.text.style.m) b0Var2.y.invoke(obj14) : null;
                mVar.getClass();
                int i2 = mVar.a;
                Object obj15 = list2.get(2);
                androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
                b0 b0Var3 = c0.v;
                kotlin.jvm.internal.l.a(obj15, bool);
                androidx.compose.ui.unit.o oVar = obj15 != null ? (androidx.compose.ui.unit.o) b0Var3.y.invoke(obj15) : null;
                oVar.getClass();
                long j = oVar.a;
                Object obj16 = list2.get(3);
                androidx.compose.ui.text.style.q qVar = androidx.compose.ui.text.style.q.c;
                androidx.compose.ui.text.style.q qVar2 = (kotlin.jvm.internal.l.a(obj16, bool) || obj16 == null) ? null : (androidx.compose.ui.text.style.q) ((kotlin.jvm.functions.l) c0.l.z).invoke(obj16);
                Object obj17 = list2.get(4);
                u uVar = (kotlin.jvm.internal.l.a(obj17, bool) || obj17 == null) ? null : (u) ((kotlin.jvm.functions.l) d0.a.z).invoke(obj17);
                Object obj18 = list2.get(5);
                androidx.compose.ui.text.style.i iVar2 = androidx.compose.ui.text.style.i.d;
                androidx.compose.ui.text.style.i iVar3 = (kotlin.jvm.internal.l.a(obj18, bool) || obj18 == null) ? null : (androidx.compose.ui.text.style.i) ((kotlin.jvm.functions.l) c0.A.z).invoke(obj18);
                Object obj19 = list2.get(6);
                androidx.compose.ui.text.style.e eVar2 = (kotlin.jvm.internal.l.a(obj19, bool) || obj19 == null) ? null : (androidx.compose.ui.text.style.e) ((kotlin.jvm.functions.l) d0.c.z).invoke(obj19);
                eVar2.getClass();
                int i3 = eVar2.a;
                Object obj20 = list2.get(7);
                b0 b0Var4 = c0.s;
                kotlin.jvm.internal.l.a(obj20, bool);
                androidx.compose.ui.text.style.d dVar = obj20 != null ? (androidx.compose.ui.text.style.d) b0Var4.y.invoke(obj20) : null;
                dVar.getClass();
                int i4 = dVar.a;
                Object obj21 = list2.get(8);
                return new s(i, i2, j, qVar2, uVar, iVar3, i3, i4, (kotlin.jvm.internal.l.a(obj21, bool) || obj21 == null) ? null : (androidx.compose.ui.text.style.s) ((kotlin.jvm.functions.l) d0.d.z).invoke(obj21));
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i5 = androidx.compose.ui.graphics.t.j;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj22, bool2);
                androidx.compose.ui.graphics.t tVar = obj22 != null ? obj22.equals(bool2) ? new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.i) : new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.a0.c(((Integer) obj22).intValue())) : null;
                tVar.getClass();
                long j2 = tVar.a;
                Object obj23 = list3.get(1);
                androidx.compose.ui.unit.p[] pVarArr2 = androidx.compose.ui.unit.o.b;
                kotlin.jvm.functions.l lVar2 = c0.v.y;
                kotlin.jvm.internal.l.a(obj23, bool2);
                androidx.compose.ui.unit.o oVar2 = obj23 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj23) : null;
                oVar2.getClass();
                long j3 = oVar2.a;
                Object obj24 = list3.get(2);
                androidx.compose.ui.text.font.l lVar3 = androidx.compose.ui.text.font.l.y;
                androidx.compose.ui.text.font.l lVar4 = (kotlin.jvm.internal.l.a(obj24, bool2) || obj24 == null) ? null : (androidx.compose.ui.text.font.l) ((kotlin.jvm.functions.l) c0.m.z).invoke(obj24);
                Object obj25 = list3.get(3);
                androidx.compose.ui.text.font.j jVar2 = (kotlin.jvm.internal.l.a(obj25, bool2) || obj25 == null) ? null : (androidx.compose.ui.text.font.j) ((kotlin.jvm.functions.l) c0.t.z).invoke(obj25);
                Object obj26 = list3.get(4);
                androidx.compose.ui.text.font.k kVar3 = (kotlin.jvm.internal.l.a(obj26, bool2) || obj26 == null) ? null : (androidx.compose.ui.text.font.k) ((kotlin.jvm.functions.l) c0.u.z).invoke(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                kotlin.jvm.internal.l.a(obj28, bool2);
                androidx.compose.ui.unit.o oVar3 = obj28 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj28) : null;
                oVar3.getClass();
                long j4 = oVar3.a;
                Object obj29 = list3.get(8);
                androidx.compose.ui.text.style.a aVar = (kotlin.jvm.internal.l.a(obj29, bool2) || obj29 == null) ? null : (androidx.compose.ui.text.style.a) ((kotlin.jvm.functions.l) c0.n.z).invoke(obj29);
                Object obj30 = list3.get(9);
                androidx.compose.ui.text.style.p pVar = (kotlin.jvm.internal.l.a(obj30, bool2) || obj30 == null) ? null : (androidx.compose.ui.text.style.p) ((kotlin.jvm.functions.l) c0.k.z).invoke(obj30);
                Object obj31 = list3.get(10);
                androidx.compose.ui.text.intl.b bVar = androidx.compose.ui.text.intl.b.z;
                androidx.compose.ui.text.intl.b bVar2 = (kotlin.jvm.internal.l.a(obj31, bool2) || obj31 == null) ? null : (androidx.compose.ui.text.intl.b) ((kotlin.jvm.functions.l) c0.y.z).invoke(obj31);
                Object obj32 = list3.get(11);
                kotlin.jvm.internal.l.a(obj32, bool2);
                androidx.compose.ui.graphics.t tVar2 = obj32 != null ? obj32.equals(bool2) ? new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.i) : new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.a0.c(((Integer) obj32).intValue())) : null;
                tVar2.getClass();
                long j5 = tVar2.a;
                Object obj33 = list3.get(12);
                androidx.compose.ui.text.style.l lVar5 = (kotlin.jvm.internal.l.a(obj33, bool2) || obj33 == null) ? null : (androidx.compose.ui.text.style.l) ((kotlin.jvm.functions.l) c0.j.z).invoke(obj33);
                Object obj34 = list3.get(13);
                androidx.compose.ui.graphics.m0 m0Var = androidx.compose.ui.graphics.m0.d;
                return new e0(j2, j3, lVar4, jVar2, kVar3, (androidx.compose.ui.text.font.s) null, str5, j4, aVar, pVar, bVar2, j5, lVar5, (kotlin.jvm.internal.l.a(obj34, bool2) || obj34 == null) ? null : (androidx.compose.ui.graphics.m0) ((kotlin.jvm.functions.l) c0.o.z).invoke(obj34), 49184);
            case 6:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                boolean zA = kotlin.jvm.internal.l.a(obj36, Boolean.FALSE);
                androidx.compose.foundation.text.input.internal.o oVar4 = d0.b;
                if (!zA && obj36 != null) {
                    jVar = (j) ((kotlin.jvm.functions.l) oVar4.z).invoke(obj36);
                }
                jVar.getClass();
                return new u(jVar.a, zBooleanValue);
            case 7:
                obj.getClass();
                return new j(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return new androidx.compose.ui.text.style.e(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                androidx.compose.ui.text.style.r rVar = (kotlin.jvm.internal.l.a(obj37, Boolean.FALSE) || obj37 == null) ? null : (androidx.compose.ui.text.style.r) ((kotlin.jvm.functions.l) d0.e.z).invoke(obj37);
                rVar.getClass();
                int i6 = rVar.a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new androidx.compose.ui.text.style.s(i6, bool4.booleanValue());
            case 10:
                obj.getClass();
                return new androidx.compose.ui.text.style.r(((Integer) obj).intValue());
            case 11:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new f1(absolutePath);
            case 12:
                ((Context) obj).getClass();
                return kotlin.collections.u.e;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder("  "), ((androidx.datastore.preferences.core.d) entry.getKey()).a, " = ", value instanceof byte[] ? kotlin.collections.n.S((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 14:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 15:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 16:
                ((androidx.lifecycle.viewmodel.c) obj).getClass();
                return new androidx.navigation.m();
            case 17:
                androidx.navigation.t tVar3 = (androidx.navigation.t) obj;
                tVar3.getClass();
                return tVar3.z;
            case 18:
                androidx.navigation.t tVar4 = (androidx.navigation.t) obj;
                tVar4.getClass();
                if (!(tVar4 instanceof androidx.navigation.v)) {
                    return null;
                }
                androidx.fragment.app.h hVar = ((androidx.navigation.v) tVar4).C;
                return hVar.z(hVar.y);
            case 19:
                return new androidx.navigation.compose.a(androidx.lifecycle.l0.b((androidx.lifecycle.viewmodel.c) obj));
            case 20:
                androidx.navigation.t tVar5 = ((androidx.navigation.i) ((androidx.compose.animation.v) obj).c()).y;
                tVar5.getClass();
                int i7 = androidx.navigation.t.B;
                for (androidx.navigation.t tVar6 : androidx.navigation.f.b((androidx.navigation.compose.h) tVar5)) {
                }
                return null;
            case 21:
                return s0.b(androidx.compose.animation.core.e.n(700, 6, null), 2);
            case 22:
                return s0.c(androidx.compose.animation.core.e.n(700, 6, null), 2);
            case 23:
                return ((androidx.navigation.i) obj).C;
            case 24:
                androidx.lifecycle.viewmodel.c cVar = (androidx.lifecycle.viewmodel.c) obj;
                cVar.getClass();
                return new androidx.navigation.internal.b(androidx.lifecycle.l0.b(cVar));
            case 25:
                androidx.navigation.t tVar7 = (androidx.navigation.t) obj;
                tVar7.getClass();
                androidx.navigation.v vVar = tVar7.z;
                if (vVar == null || vVar.C.y != tVar7.y.a) {
                    return null;
                }
                return vVar;
            case 26:
                androidx.navigation.t tVar8 = (androidx.navigation.t) obj;
                tVar8.getClass();
                androidx.navigation.v vVar2 = tVar8.z;
                if (vVar2 == null || vVar2.C.y != tVar8.y.a) {
                    return null;
                }
                return vVar2;
            case 27:
                androidx.navigation.t tVar9 = (androidx.navigation.t) obj;
                tVar9.getClass();
                return Integer.valueOf(tVar9.y.a);
            case 28:
                ((androidx.room.a) obj).getClass();
                throw new kotlin.j(0);
            default:
                androidx.sqlite.c cVar2 = (androidx.sqlite.c) obj;
                cVar2.getClass();
                return Boolean.valueOf(cVar2.Q());
        }
    }

    public /* synthetic */ y(int i) {
        this.e = i;
    }
}
