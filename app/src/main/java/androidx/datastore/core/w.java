package androidx.datastore.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 2;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(z zVar, kotlin.coroutines.i iVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.z = zVar;
        this.B = iVar;
        this.C = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w((kotlin.jvm.internal.z) this.B, (z) this.z, (kotlin.jvm.internal.x) this.C, dVar);
            case 1:
                return new w((z) this.z, (kotlin.coroutines.i) this.B, (kotlin.jvm.functions.p) this.C, dVar);
            default:
                return new w((i0) this.z, this.C, dVar);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((w) create(dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        kotlin.jvm.internal.z zVar;
        kotlin.jvm.internal.x xVar;
        c cVar;
        Object obj2;
        int iHashCode;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.C;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) this.B;
                z zVar3 = (z) this.z;
                int i = this.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            zVar = (kotlin.jvm.internal.z) ((Serializable) this.A);
                            kotlin.a.e(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xVar2 = (kotlin.jvm.internal.x) ((Serializable) this.A);
                                kotlin.a.e(obj);
                                xVar2.e = ((Number) obj).intValue();
                                return kotlin.y.a;
                            }
                            xVar = (kotlin.jvm.internal.x) ((Serializable) this.A);
                            kotlin.a.e(obj);
                        }
                        xVar.e = ((Number) obj).intValue();
                        return kotlin.y.a;
                    }
                    kotlin.a.e(obj);
                    this.A = zVar2;
                    this.y = 1;
                    obj = zVar3.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    zVar = zVar2;
                    zVar.e = obj;
                    k0 k0VarI = zVar3.i();
                    this.A = xVar2;
                    this.y = 2;
                    obj = k0VarI.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    xVar = xVar2;
                    xVar.e = ((Number) obj).intValue();
                    return kotlin.y.a;
                } catch (b unused) {
                    Object obj3 = zVar2.e;
                    this.A = xVar2;
                    this.y = 3;
                    obj = zVar3.k(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            case 1:
                z zVar4 = (z) this.z;
                int i2 = this.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                    } else if (i2 == 2) {
                        cVar = (c) this.A;
                        kotlin.a.e(obj);
                        obj2 = cVar.b;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        if (iHashCode != cVar.c) {
                            if (!kotlin.jvm.internal.l.a(cVar.b, obj)) {
                                this.A = obj;
                                this.y = 3;
                                if (zVar4.k(obj, true, this) == aVar2) {
                                    return aVar2;
                                }
                            }
                            return obj;
                        }
                        net.luminis.tls.engine.impl.c.r("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    } else {
                        if (i2 == 3) {
                            Object obj4 = this.A;
                            kotlin.a.e(obj);
                            return obj4;
                        }
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 1;
                obj = z.h(zVar4, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                cVar = (c) obj;
                kotlin.coroutines.i iVar = (kotlin.coroutines.i) this.B;
                androidx.activity.compose.p pVar = new androidx.activity.compose.p((kotlin.jvm.functions.p) this.C, cVar, (kotlin.coroutines.d) null);
                this.A = cVar;
                this.y = 2;
                obj = BuildersKt.withContext(iVar, pVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = cVar.b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode != cVar.c) {
                    net.luminis.tls.engine.impl.c.r("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!kotlin.jvm.internal.l.a(cVar.b, obj)) {
                    this.A = obj;
                    this.y = 3;
                    if (zVar4.k(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
            default:
                i0 i0Var = (i0) this.z;
                File file = i0Var.a;
                int i3 = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        Object obj5 = this.C;
                        try {
                            y0 y0Var = i0Var.b;
                            j1 j1Var = new j1(fileOutputStream3);
                            this.A = fileOutputStream3;
                            this.B = fileOutputStream3;
                            this.y = 1;
                            y0Var.c(obj5, j1Var);
                            kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                            if (yVar == aVar3) {
                                return aVar3;
                            }
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th2) {
                            fileOutputStream = fileOutputStream3;
                            th = th2;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw okhttp3.internal.platform.android.g.M(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.B;
                    fileOutputStream = (FileOutputStream) this.A;
                    try {
                        kotlin.a.e(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            com.google.common.base.b.d(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                com.google.common.base.b.d(fileOutputStream, null);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i0 i0Var, Object obj, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.z = i0Var;
        this.C = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlin.jvm.internal.z zVar, z zVar2, kotlin.jvm.internal.x xVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.B = zVar;
        this.z = zVar2;
        this.C = xVar;
    }
}
