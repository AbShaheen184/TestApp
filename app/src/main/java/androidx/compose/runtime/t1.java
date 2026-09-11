package androidx.compose.runtime;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                t1 t1Var = new t1(2, 0, dVar);
                t1Var.y = obj;
                return t1Var;
            case 1:
                t1 t1Var2 = new t1(2, 1, dVar);
                t1Var2.y = obj;
                return t1Var2;
            case 2:
                t1 t1Var3 = new t1(2, 2, dVar);
                t1Var3.y = obj;
                return t1Var3;
            case 3:
                t1 t1Var4 = new t1(2, 3, dVar);
                t1Var4.y = obj;
                return t1Var4;
            case 4:
                t1 t1Var5 = new t1(2, 4, dVar);
                t1Var5.y = obj;
                return t1Var5;
            case 5:
                t1 t1Var6 = new t1(2, 5, dVar);
                t1Var6.y = obj;
                return t1Var6;
            case 6:
                t1 t1Var7 = new t1(2, 6, dVar);
                t1Var7.y = obj;
                return t1Var7;
            case 7:
                t1 t1Var8 = new t1(2, 7, dVar);
                t1Var8.y = obj;
                return t1Var8;
            case 8:
                t1 t1Var9 = new t1(2, 8, dVar);
                t1Var9.y = obj;
                return t1Var9;
            case 9:
                t1 t1Var10 = new t1(2, 9, dVar);
                t1Var10.y = obj;
                return t1Var10;
            case 10:
                t1 t1Var11 = new t1(2, 10, dVar);
                t1Var11.y = obj;
                return t1Var11;
            default:
                t1 t1Var12 = new t1(2, 11, dVar);
                t1Var12.y = obj;
                return t1Var12;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((t1) create((s1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((t1) create((androidx.datastore.core.g1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                t1 t1Var = (t1) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                t1Var.invokeSuspend(yVar);
                return yVar;
            case 3:
                kotlin.m mVar = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var2 = new t1(2, 3, (kotlin.coroutines.d) obj2);
                t1Var2.y = mVar;
                return t1Var2.invokeSuspend(kotlin.y.a);
            case 4:
                kotlin.m mVar2 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var3 = new t1(2, 4, (kotlin.coroutines.d) obj2);
                t1Var3.y = mVar2;
                return t1Var3.invokeSuspend(kotlin.y.a);
            case 5:
                kotlin.m mVar3 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var4 = new t1(2, 5, (kotlin.coroutines.d) obj2);
                t1Var4.y = mVar3;
                return t1Var4.invokeSuspend(kotlin.y.a);
            case 6:
                kotlin.m mVar4 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var5 = new t1(2, 6, (kotlin.coroutines.d) obj2);
                t1Var5.y = mVar4;
                return t1Var5.invokeSuspend(kotlin.y.a);
            case 7:
                kotlin.m mVar5 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var6 = new t1(2, 7, (kotlin.coroutines.d) obj2);
                t1Var6.y = mVar5;
                return t1Var6.invokeSuspend(kotlin.y.a);
            case 8:
                kotlin.m mVar6 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var7 = new t1(2, 8, (kotlin.coroutines.d) obj2);
                t1Var7.y = mVar6;
                return t1Var7.invokeSuspend(kotlin.y.a);
            case 9:
                kotlin.m mVar7 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var8 = new t1(2, 9, (kotlin.coroutines.d) obj2);
                t1Var8.y = mVar7;
                return t1Var8.invokeSuspend(kotlin.y.a);
            case 10:
                kotlin.m mVar8 = new kotlin.m(((kotlin.m) obj).e);
                t1 t1Var9 = new t1(2, 10, (kotlin.coroutines.d) obj2);
                t1Var9.y = mVar8;
                return t1Var9.invokeSuspend(kotlin.y.a);
            default:
                t1 t1Var10 = (t1) create((String) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                t1Var10.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                return Boolean.valueOf(((s1) this.y) == s1.e);
            case 1:
                kotlin.a.e(obj);
                return Boolean.valueOf(!(((androidx.datastore.core.g1) this.y) instanceof androidx.datastore.core.j0));
            case 2:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.d(com.app.mlounge.data.local.prefs.y1.r0);
                aVar.d(com.app.mlounge.data.local.prefs.y1.s0);
                aVar.d(com.app.mlounge.data.local.prefs.y1.t0);
                aVar.d(com.app.mlounge.data.local.prefs.y1.u0);
                aVar.d(com.app.mlounge.data.local.prefs.y1.v0);
                return yVar;
            case 3:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 4:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 5:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 6:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 7:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 8:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 9:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            case 10:
                kotlin.a.e(obj);
                return new kotlin.m(((kotlin.m) this.y).e);
            default:
                kotlin.a.e(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.y));
                return yVar;
        }
    }
}
