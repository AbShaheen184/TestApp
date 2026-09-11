package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ z A;
    public final /* synthetic */ int B;
    public Object C;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, int i, kotlin.coroutines.d dVar, int i2) {
        super(2, dVar);
        this.e = i2;
        this.A = zVar;
        this.B = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                u uVar = new u(this.A, this.B, dVar, 0);
                uVar.z = ((Boolean) obj).booleanValue();
                return uVar;
            default:
                u uVar2 = new u(this.A, this.B, dVar, 1);
                uVar2.z = ((Boolean) obj).booleanValue();
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((u) create(bool, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        g1 w0Var;
        boolean z;
        ?? r0;
        ?? r1;
        boolean z2;
        Object obj2;
        int iIntValue2;
        int iHashCode;
        switch (this.e) {
            case 0:
                boolean z3 = this.y;
                z zVar = this.A;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (z3 == 0) {
                        kotlin.a.e(obj);
                        boolean z4 = this.z;
                        this.z = z4;
                        this.y = 1;
                        obj = z.h(zVar, z4, this);
                        z3 = z4;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.z;
                            th = (Throwable) this.C;
                            kotlin.a.e(obj);
                            r1 = z5;
                            iIntValue = ((Number) obj).intValue();
                            r0 = r1;
                            w0Var = new w0(th, iIntValue);
                            z = r0;
                            return new kotlin.k(w0Var, Boolean.valueOf(z));
                        }
                        boolean z6 = this.z;
                        kotlin.a.e(obj);
                        z3 = z6;
                    }
                    w0Var = (g1) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    if (z3 != 0) {
                        k0 k0VarI = zVar.i();
                        this.C = th2;
                        this.z = z3;
                        this.y = 2;
                        Object objC = k0VarI.c(this);
                        if (objC == aVar) {
                            return aVar;
                        }
                        th = th2;
                        obj = objC;
                        r1 = z3;
                    } else {
                        th = th2;
                        iIntValue = this.B;
                        r0 = z3;
                    }
                    w0Var = new w0(th, iIntValue);
                    z = r0;
                    return new kotlin.k(w0Var, Boolean.valueOf(z));
                }
                return new kotlin.k(w0Var, Boolean.valueOf(z));
            default:
                int i = this.y;
                z zVar2 = this.A;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i != 0) {
                    if (i == 1) {
                        z2 = this.z;
                        kotlin.a.e(obj);
                    } else {
                        if (i != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.C;
                        kotlin.a.e(obj);
                    }
                    iIntValue2 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new c(obj2, iHashCode, iIntValue2);
                }
                kotlin.a.e(obj);
                z2 = this.z;
                this.z = z2;
                this.y = 1;
                obj = zVar2.j(this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (z2) {
                    k0 k0VarI2 = zVar2.i();
                    this.C = obj;
                    this.y = 2;
                    Object objC2 = k0VarI2.c(this);
                    if (objC2 == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj;
                    obj = objC2;
                    iIntValue2 = ((Number) obj).intValue();
                } else {
                    obj2 = obj;
                    iIntValue2 = this.B;
                }
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new c(obj2, iHashCode, iIntValue2);
        }
    }
}
