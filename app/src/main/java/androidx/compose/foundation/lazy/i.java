package androidx.compose.foundation.lazy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.text.i1;
import androidx.compose.foundation.text.n0;
import androidx.compose.foundation.text.selection.m0;
import androidx.compose.foundation.text.selection.t0;
import androidx.compose.runtime.a1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.text.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ i(int i, t tVar) {
        this.e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x0203  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        String str;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                return null;
            case 1:
                List list = (List) obj;
                return new z(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 2:
                return yVar;
            case 3:
                List list2 = (List) obj;
                return new androidx.compose.foundation.lazy.grid.x(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 4:
                ((Integer) obj).getClass();
                androidx.compose.foundation.lazy.grid.n nVar = androidx.compose.foundation.lazy.grid.z.a;
                return kotlin.collections.u.e;
            case 5:
                ((Integer) obj).getClass();
                androidx.compose.foundation.lazy.grid.n nVar2 = androidx.compose.foundation.lazy.grid.z.a;
                return -1;
            case 6:
                int i2 = androidx.compose.foundation.text.h.a;
                return yVar;
            case 7:
                return yVar;
            case 8:
                t0 t0Var = (t0) obj;
                String str2 = t0Var.g.y;
                long j = t0Var.f;
                int i3 = l0.c;
                int i4 = (int) (j & 4294967295L);
                if (i4 > 0) {
                    androidx.emoji2.text.j jVarP = n0.p();
                    if (jVarP != null) {
                        int iB = jVarP.b(str2, i4 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i4 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str2, i4, -1);
                        }
                    } else if (i4 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str2, i4, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new androidx.compose.ui.text.input.e(((int) (t0Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 9:
                t0 t0Var2 = (t0) obj;
                String str3 = t0Var2.g.y;
                long j2 = t0Var2.f;
                int i5 = l0.c;
                int iL = n0.l((int) (j2 & 4294967295L), str3);
                if (iL != -1) {
                    return new androidx.compose.ui.text.input.e(0, iL - ((int) (t0Var2.f & 4294967295L)));
                }
                return null;
            case 10:
                t0 t0Var3 = (t0) obj;
                Integer numE = t0Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = t0Var3.f;
                int i6 = l0.c;
                return new androidx.compose.ui.text.input.e(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 11:
                t0 t0Var4 = (t0) obj;
                Integer numD = t0Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = t0Var4.f;
                int i7 = l0.c;
                return new androidx.compose.ui.text.input.e(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 12:
                t0 t0Var5 = (t0) obj;
                Integer numC = t0Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = t0Var5.f;
                int i8 = l0.c;
                return new androidx.compose.ui.text.input.e(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 13:
                t0 t0Var6 = (t0) obj;
                Integer numB = t0Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = t0Var6.f;
                int i9 = l0.c;
                return new androidx.compose.ui.text.input.e(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 14:
                List list3 = (List) obj;
                Object obj2 = list3.get(1);
                obj2.getClass();
                k1 k1Var = ((Boolean) obj2).booleanValue() ? k1.e : k1.y;
                Object obj3 = list3.get(0);
                obj3.getClass();
                return new i1(k1Var, ((Float) obj3).floatValue());
            case 15:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i10);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 16:
                return yVar;
            case 17:
                return yVar;
            case 18:
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj;
                long j7 = bVar.a;
                return (9223372034707292159L & j7) != 9205357640488583168L ? new androidx.compose.animation.core.p(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L))) : m0.a;
            case 19:
                androidx.compose.animation.core.p pVar = (androidx.compose.animation.core.p) obj;
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(pVar.a)) << 32) | (((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L));
            case 20:
                androidx.compose.ui.semantics.v.c((androidx.compose.ui.semantics.x) obj, 0);
                return yVar;
            case 21:
                androidx.compose.ui.semantics.v.c((androidx.compose.ui.semantics.x) obj, 1);
                return yVar;
            case 22:
                return yVar;
            case 23:
                androidx.compose.animation.core.n0 n0Var = (androidx.compose.animation.core.n0) obj;
                n0Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                n0Var.a(300, fValueOf).b = androidx.compose.material3.tokens.q.b;
                n0Var.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                n0Var.a(1800, fValueOf2);
                n0Var.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                n0Var.a(3300, fValueOf3);
                n0Var.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                n0Var.a(4800, fValueOf4);
                n0Var.a(6000, fValueOf4);
                return yVar;
            case 24:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.l;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.v.a[5];
                ((androidx.compose.ui.semantics.x) obj).b(wVar, Boolean.TRUE);
                return yVar;
            case 25:
                float f = androidx.compose.material3.internal.b.a;
                return yVar;
            case 26:
                ((z1) obj).getClass();
                throw new ClassCastException();
            case 27:
                ((z1) obj).getClass();
                throw new ClassCastException();
            case 28:
                androidx.compose.animation.z zVar = ((a1) obj).a;
                if (zVar != null) {
                    zVar.invoke();
                }
                return yVar;
            default:
                return new androidx.compose.runtime.saveable.e((Map) obj);
        }
    }

    public /* synthetic */ i(int i) {
        this.e = i;
    }
}
