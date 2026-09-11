package androidx.room;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ i0 A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(i0 i0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                d0 d0Var = new d0(this.A, dVar, 0);
                d0Var.z = obj;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.A, dVar, 1);
                d0Var2.z = obj;
                return d0Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((d0) create((androidx.room.coroutines.m) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((d0) create((y) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        y yVar;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                androidx.room.coroutines.m mVar = (androidx.room.coroutines.m) this.z;
                this.y = 1;
                Object objA = i0.a(this.A, mVar, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objA == aVar ? aVar : objA;
            default:
                int i2 = this.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            yVar = (y) this.z;
                            kotlin.a.e(obj);
                        } else {
                            if (i2 != 2) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.a.e(obj);
                        }
                        return (Set) obj;
                    }
                    kotlin.a.e(obj);
                    yVar = (y) this.z;
                    this.z = yVar;
                    this.y = 1;
                    obj = yVar.c(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        x xVar = x.y;
                        d0 d0Var = new d0(this.A, null, 0);
                        this.z = null;
                        this.y = 2;
                        obj = yVar.a(xVar, d0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return kotlin.collections.w.e;
        }
    }
}
