package androidx.compose.runtime.saveable;

import android.util.Log;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.text.b0;
import androidx.compose.ui.text.c0;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.k0;
import androidx.compose.ui.text.l0;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.s;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.unit.o;
import androidx.datastore.preferences.protobuf.h1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ m(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        t tVar;
        e0 e0Var = null;
        k0Var = null;
        k0 k0Var = null;
        k0Var = null;
        k0 k0Var2 = null;
        e0Var = null;
        int i = 0;
        switch (this.e) {
            case 0:
                return obj;
            case 1:
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    ?? r0 = androidx.compose.runtime.snapshots.n.i;
                    int size = r0.size();
                    while (i < size) {
                        ((kotlin.jvm.functions.l) r0.get(i)).invoke(obj);
                        i++;
                    }
                }
                return y.a;
            case 2:
                m mVar = androidx.compose.runtime.snapshots.n.a;
                return y.a;
            case 3:
                return Boolean.valueOf(!(((androidx.compose.ui.text.b) obj) instanceof s));
            case 4:
                p pVar = (p) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(pVar.b);
                sb.append(", ");
                return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, pVar.c, ')');
            case 5:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) c0.h.z;
                Boolean bool = Boolean.FALSE;
                e0 e0Var2 = (kotlin.jvm.internal.l.a(obj2, bool) || obj2 == null) ? null : (e0) lVar.invoke(obj2);
                Object obj3 = list.get(1);
                e0 e0Var3 = (kotlin.jvm.internal.l.a(obj3, bool) || obj3 == null) ? null : (e0) lVar.invoke(obj3);
                Object obj4 = list.get(2);
                e0 e0Var4 = (kotlin.jvm.internal.l.a(obj4, bool) || obj4 == null) ? null : (e0) lVar.invoke(obj4);
                Object obj5 = list.get(3);
                if (!kotlin.jvm.internal.l.a(obj5, bool) && obj5 != null) {
                    e0Var = (e0) lVar.invoke(obj5);
                }
                return new k0(e0Var2, e0Var3, e0Var4, e0Var);
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((kotlin.jvm.functions.l) c0.a.z).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new androidx.compose.ui.text.g(list3, str);
            case 7:
                obj.getClass();
                return new androidx.compose.ui.text.style.l(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                return new androidx.compose.ui.text.style.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                androidx.compose.ui.unit.p[] pVarArr = o.b;
                kotlin.jvm.functions.l lVar2 = c0.v.y;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj8, bool2);
                o oVar = obj8 != null ? (o) lVar2.invoke(obj8) : null;
                oVar.getClass();
                long j = oVar.a;
                Object obj9 = list5.get(1);
                kotlin.jvm.internal.l.a(obj9, bool2);
                o oVar2 = obj9 != null ? (o) lVar2.invoke(obj9) : null;
                oVar2.getClass();
                return new q(j, oVar2.a);
            case 10:
                obj.getClass();
                return new androidx.compose.ui.text.font.l(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                return new androidx.compose.ui.text.style.a(((Float) obj).floatValue());
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new l0(d0.b(iIntValue, num2.intValue()));
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = t.j;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj12, bool3);
                if (obj12 != null) {
                    tVar = kotlin.jvm.internal.l.a(obj12, Boolean.FALSE) ? new t(t.i) : new t(a0.c(((Integer) obj12).intValue()));
                } else {
                    tVar = null;
                }
                tVar.getClass();
                long j2 = tVar.a;
                Object obj13 = list7.get(1);
                b0 b0Var = c0.x;
                kotlin.jvm.internal.l.a(obj13, bool3);
                androidx.compose.ui.geometry.b bVar = obj13 != null ? (androidx.compose.ui.geometry.b) b0Var.y.invoke(obj13) : null;
                bVar.getClass();
                long j3 = bVar.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new m0(j2, j3, f.floatValue());
            case 14:
                obj.getClass();
                return new androidx.compose.ui.text.style.k(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                androidx.compose.foundation.text.input.internal.o oVar3 = c0.i;
                if (!kotlin.jvm.internal.l.a(obj16, Boolean.FALSE) && obj16 != null) {
                    k0Var2 = (k0) ((kotlin.jvm.functions.l) oVar3.z).invoke(obj16);
                }
                return new androidx.compose.ui.text.l(str2, k0Var2);
            case 16:
                obj.getClass();
                return new androidx.compose.ui.text.style.m(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return new androidx.compose.ui.text.style.d(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    androidx.compose.ui.text.e eVar = (kotlin.jvm.internal.l.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (androidx.compose.ui.text.e) ((kotlin.jvm.functions.l) c0.b.z).invoke(obj17);
                    eVar.getClass();
                    arrayList.add(eVar);
                    i++;
                }
                return arrayList;
            case 19:
                obj.getClass();
                return new androidx.compose.ui.text.font.j(((Integer) obj).intValue());
            case 20:
                obj.getClass();
                return new androidx.compose.ui.text.font.k(((Integer) obj).intValue());
            case 21:
                Boolean bool4 = Boolean.FALSE;
                if (kotlin.jvm.internal.l.a(obj, bool4)) {
                    return new o(o.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                b0 b0Var2 = c0.w;
                kotlin.jvm.internal.l.a(obj19, bool4);
                androidx.compose.ui.unit.p pVar2 = obj19 != null ? (androidx.compose.ui.unit.p) b0Var2.y.invoke(obj19) : null;
                pVar2.getClass();
                return new o(h1.u(fFloatValue, pVar2.a));
            case 22:
                if (kotlin.jvm.internal.l.a(obj, 0)) {
                    return new androidx.compose.ui.unit.p(8589934592L);
                }
                return kotlin.jvm.internal.l.a(obj, 1) ? new androidx.compose.ui.unit.p(4294967296L) : new androidx.compose.ui.unit.p(0L);
            case 23:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new androidx.compose.ui.geometry.b(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 24:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size3 = list12.size();
                while (i < size3) {
                    Object obj22 = list12.get(i);
                    androidx.compose.ui.text.intl.a aVar = (kotlin.jvm.internal.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (androidx.compose.ui.text.intl.a) ((kotlin.jvm.functions.l) c0.z.z).invoke(obj22);
                    aVar.getClass();
                    arrayList2.add(aVar);
                    i++;
                }
                return new androidx.compose.ui.text.intl.b(arrayList2);
            case 25:
                obj.getClass();
                String str3 = (String) obj;
                androidx.compose.ui.text.intl.c.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (kotlin.jvm.internal.l.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new androidx.compose.ui.text.intl.a(localeForLanguageTag);
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                androidx.compose.foundation.text.input.internal.o oVar4 = c0.i;
                if (!kotlin.jvm.internal.l.a(obj24, Boolean.FALSE) && obj24 != null) {
                    k0Var = (k0) ((kotlin.jvm.functions.l) oVar4.z).invoke(obj24);
                }
                return new androidx.compose.ui.text.k(str4, k0Var);
            case 27:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = androidx.compose.ui.text.style.f.b;
                b0 b0Var3 = c0.B;
                Boolean bool5 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj25, bool5);
                androidx.compose.ui.text.style.f fVar = obj25 != null ? (androidx.compose.ui.text.style.f) b0Var3.y.invoke(obj25) : null;
                fVar.getClass();
                float f6 = fVar.a;
                Object obj26 = list14.get(1);
                b0 b0Var4 = c0.C;
                kotlin.jvm.internal.l.a(obj26, bool5);
                androidx.compose.ui.text.style.h hVar = obj26 != null ? (androidx.compose.ui.text.style.h) b0Var4.y.invoke(obj26) : null;
                hVar.getClass();
                int i3 = hVar.a;
                Object obj27 = list14.get(2);
                b0 b0Var5 = c0.D;
                kotlin.jvm.internal.l.a(obj27, bool5);
                androidx.compose.ui.text.style.g gVar = obj27 != null ? (androidx.compose.ui.text.style.g) b0Var5.y.invoke(obj27) : null;
                gVar.getClass();
                return new androidx.compose.ui.text.style.i(f6, i3, gVar.a);
            case 28:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                androidx.compose.ui.text.style.f.a(fFloatValue3);
                return new androidx.compose.ui.text.style.f(fFloatValue3);
            default:
                obj.getClass();
                return new androidx.compose.ui.text.style.h(((Integer) obj).intValue());
        }
    }
}
