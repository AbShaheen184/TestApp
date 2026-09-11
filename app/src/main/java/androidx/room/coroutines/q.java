package androidx.room.coroutines;

import android.database.SQLException;
import androidx.compose.animation.core.a1;
import androidx.datastore.preferences.protobuf.h1;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements androidx.room.y, d0 {
    public final kotlin.jvm.internal.j a;
    public final androidx.sqlite.a b;
    public final AtomicInteger c;
    public androidx.room.x d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(kotlin.jvm.functions.p pVar, androidx.sqlite.a aVar) {
        aVar.getClass();
        this.a = (kotlin.jvm.internal.j) pVar;
        this.b = aVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.y
    public final Object a(androidx.room.x xVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.i iVar) {
        return this.a.invoke(new a1(this, xVar, pVar, (kotlin.coroutines.d) null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.B = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objC = oVar.z;
        int i2 = oVar.B;
        Object obj = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objC);
            oVar.e = str;
            oVar.y = lVar;
            oVar.B = 1;
            objC = c(oVar);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(objC);
                return objC;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = oVar.y;
        str = oVar.e;
        kotlin.a.e(objC);
        if (((Boolean) objC).booleanValue()) {
            p pVar = new p(this, str, lVar, null);
            oVar.e = null;
            oVar.y = null;
            oVar.B = 2;
            Object objInvoke = this.a.invoke(pVar, oVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        androidx.sqlite.c cVarU = this.b.U(str);
        try {
            Object objInvoke2 = lVar.invoke(cVarU);
            com.google.common.base.i.c(cVarU, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    @Override // androidx.room.y
    public final Boolean c(kotlin.coroutines.d dVar) {
        return Boolean.valueOf(this.d != null || this.b.H());
    }

    @Override // androidx.room.coroutines.d0
    public final androidx.sqlite.a d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(androidx.room.x xVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.A = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objInvoke = nVar.y;
        int i2 = nVar.A;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        androidx.sqlite.a aVar = this.b;
        try {
            if (i2 == 0) {
                kotlin.a.e(objInvoke);
                int iOrdinal = xVar.ordinal();
                if (iOrdinal == 0) {
                    h1.l(aVar, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    h1.l(aVar, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    h1.l(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = xVar;
                }
                Object mVar = new m(this, 0);
                nVar.e = 1;
                nVar.A = 1;
                objInvoke = pVar.invoke(mVar, nVar);
                Object obj = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = nVar.e;
                kotlin.a.e(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                h1.l(aVar, "END TRANSACTION");
                return objInvoke;
            }
            h1.l(aVar, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    h1.l(aVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    kotlin.a.a(th, e);
                }
                throw th2;
            }
        }
    }
}
