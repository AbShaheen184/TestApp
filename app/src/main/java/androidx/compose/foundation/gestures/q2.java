package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ o1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(o1 o1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new q2(this.y, dVar, 0);
            case 1:
                return new q2(this.y, dVar, 1);
            case 2:
                return new q2(this.y, dVar, 2);
            case 3:
                return new q2(this.y, dVar, 3);
            case 4:
                return new q2(this.y, dVar, 4);
            case 5:
                return new q2(this.y, dVar, 5);
            case 6:
                return new q2(this.y, dVar, 6);
            default:
                return new q2(this.y, dVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                q2 q2Var = (q2) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                q2Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                q2 q2Var2 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                q2Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                q2 q2Var3 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                q2Var3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                q2 q2Var4 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                q2Var4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                q2 q2Var5 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                q2Var5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                q2 q2Var6 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                q2Var6.invokeSuspend(yVar6);
                return yVar6;
            case 6:
                q2 q2Var7 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                q2Var7.invokeSuspend(yVar7);
                return yVar7;
            default:
                q2 q2Var8 = (q2) create(coroutineScope, dVar);
                kotlin.y yVar8 = kotlin.y.a;
                q2Var8.invokeSuspend(yVar8);
                return yVar8;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                o1 o1Var = this.y;
                o1Var.z = true;
                Mutex mutex = o1Var.A;
                if (mutex.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                }
                break;
            case 1:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 2:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 3:
                kotlin.a.e(obj);
                o1 o1Var2 = this.y;
                o1Var2.z = true;
                Mutex mutex2 = o1Var2.A;
                if (mutex2.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                }
                break;
            case 4:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 5:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 6:
                kotlin.a.e(obj);
                o1 o1Var3 = this.y;
                o1Var3.z = true;
                Mutex mutex3 = o1Var3.A;
                if (mutex3.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex3, null, 1, null);
                }
                break;
            default:
                kotlin.a.e(obj);
                this.y.b();
                break;
        }
        return kotlin.y.a;
    }
}
