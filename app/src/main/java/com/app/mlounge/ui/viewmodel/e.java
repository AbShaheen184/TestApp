package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj3;
        switch (i) {
            case 0:
                e eVar = new e(3, 0, dVar);
                eVar.y = zBooleanValue;
                eVar.z = zBooleanValue2;
                return eVar.invokeSuspend(kotlin.y.a);
            case 1:
                e eVar2 = new e(3, 1, dVar);
                eVar2.y = zBooleanValue;
                eVar2.z = zBooleanValue2;
                return eVar2.invokeSuspend(kotlin.y.a);
            case 2:
                e eVar3 = new e(3, 2, dVar);
                eVar3.y = zBooleanValue;
                eVar3.z = zBooleanValue2;
                return eVar3.invokeSuspend(kotlin.y.a);
            default:
                e eVar4 = new e(3, 3, dVar);
                eVar4.y = zBooleanValue;
                eVar4.z = zBooleanValue2;
                return eVar4.invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.e) {
            case 0:
                boolean z2 = this.y;
                boolean z3 = this.z;
                kotlin.a.e(obj);
                return Boolean.valueOf(z2 || z3);
            case 1:
                boolean z4 = this.y;
                boolean z5 = this.z;
                kotlin.a.e(obj);
                if (z4 && z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                boolean z6 = this.y;
                boolean z7 = this.z;
                kotlin.a.e(obj);
                if (z6 && z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z8 = this.y;
                boolean z9 = this.z;
                kotlin.a.e(obj);
                if (z8 && z9) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
