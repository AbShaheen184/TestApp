package androidx.room.coroutines;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements androidx.room.y, d0 {
    public final com.google.android.material.shape.g a;
    public final j b;
    public final boolean c;
    public final kotlin.collections.k d;
    public volatile boolean e;

    public c0(com.google.android.material.shape.g gVar, j jVar, boolean z) {
        gVar.getClass();
        this.a = gVar;
        this.b = jVar;
        this.c = z;
        this.d = new kotlin.collections.k();
    }

    @Override // androidx.room.y
    public final Object a(androidx.room.x xVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.i iVar) {
        if (this.e) {
            h1.y(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(this.a);
        if (aVar != null && aVar.y == this) {
            return g(xVar, pVar, iVar);
        }
        h1.y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        b0 b0Var;
        j jVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i = b0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0Var.C = i - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = b0Var.C;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (this.e) {
                h1.y(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) b0Var.getContext().get(this.a);
            if (aVar2 == null || aVar2.y != this) {
                h1.y(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            jVar = this.b;
            b0Var.e = str;
            b0Var.y = lVar;
            b0Var.z = jVar;
            b0Var.C = 1;
            if (jVar.y.lock(null, b0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j jVar2 = b0Var.z;
            lVar = b0Var.y;
            String str2 = b0Var.e;
            kotlin.a.e(obj);
            jVar = jVar2;
            str = str2;
        }
        try {
            w wVar = new w(this, this.b.U(str));
            try {
                Object objInvoke = lVar.invoke(wVar);
                com.google.common.base.i.c(wVar, null);
                jVar.unlock(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.i.c(wVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            jVar.unlock(null);
            throw th3;
        }
    }

    @Override // androidx.room.y
    public final Boolean c(kotlin.coroutines.d dVar) {
        if (this.e) {
            h1.y(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) dVar.getContext().get(this.a);
        if (aVar != null && aVar.y == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.e.H());
        }
        h1.y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // androidx.room.coroutines.d0
    public final androidx.sqlite.a d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(androidx.room.x xVar, kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        j jVar;
        kotlin.collections.k kVar = this.d;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.B = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.z;
        int i2 = yVar.B;
        j jVar2 = this.b;
        if (i2 == 0) {
            kotlin.a.e(obj);
            yVar.e = xVar;
            yVar.y = jVar2;
            yVar.B = 1;
            Object objLock = jVar2.y.lock(null, yVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j jVar3 = yVar.y;
            androidx.room.x xVar2 = yVar.e;
            kotlin.a.e(obj);
            jVar = jVar3;
            xVar = xVar2;
        }
        try {
            int i3 = kVar.z;
            if (kVar.isEmpty()) {
                int iOrdinal = xVar.ordinal();
                if (iOrdinal == 0) {
                    h1.l(jVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    h1.l(jVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new androidx.compose.ui.res.e(11);
                    }
                    h1.l(jVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                h1.l(jVar2, "SAVEPOINT '" + i3 + '\'');
            }
            kVar.addLast(new x(i3));
            kotlin.y yVar2 = kotlin.y.a;
            jVar.unlock(null);
            return yVar2;
        } catch (Throwable th) {
            jVar.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        j jVar;
        kotlin.collections.k kVar = this.d;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.B = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.z;
        int i2 = zVar.B;
        j jVar2 = this.b;
        if (i2 == 0) {
            kotlin.a.e(obj);
            zVar.y = jVar2;
            zVar.e = z;
            zVar.B = 1;
            Object objLock = jVar2.y.lock(null, zVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = zVar.e;
            jVar = zVar.y;
            kotlin.a.e(obj);
        }
        try {
            if (kVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            x xVar = (x) kotlin.collections.o.b0(kVar);
            if (z) {
                xVar.getClass();
                if (kVar.isEmpty()) {
                    h1.l(jVar2, "END TRANSACTION");
                } else {
                    h1.l(jVar2, "RELEASE SAVEPOINT '" + xVar.a + '\'');
                }
            } else if (kVar.isEmpty()) {
                h1.l(jVar2, "ROLLBACK TRANSACTION");
            } else {
                h1.l(jVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + xVar.a + '\'');
            }
            kotlin.y yVar = kotlin.y.a;
            jVar.unlock(null);
            return yVar;
        } catch (Throwable th) {
            jVar.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (f(false, r0) == r7) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.room.coroutines.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.room.x] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.room.x] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(androidx.room.x r9, kotlin.jvm.functions.p r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.room.coroutines.a0
            if (r0 == 0) goto L13
            r0 = r11
            androidx.room.coroutines.a0 r0 = (androidx.room.coroutines.a0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            androidx.room.coroutines.a0 r0 = new androidx.room.coroutines.a0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.C
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L62
            if (r1 == r6) goto L59
            if (r1 == r5) goto L50
            if (r1 == r4) goto L4a
            r9 = 4
            if (r1 == r9) goto L44
            if (r1 == r3) goto L37
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L37:
            java.lang.Throwable r9 = r0.y
            java.lang.Object r10 = r0.e
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            kotlin.a.e(r11)     // Catch: android.database.SQLException -> L42
            goto Lac
        L42:
            r11 = move-exception
            goto La7
        L44:
            java.lang.Object r9 = r0.e
            kotlin.a.e(r11)
            return r9
        L4a:
            java.lang.Object r9 = r0.e
            kotlin.a.e(r11)
            return r9
        L50:
            int r9 = r0.z
            kotlin.a.e(r11)     // Catch: java.lang.Throwable -> L56
            goto L89
        L56:
            r9 = move-exception
            r10 = r9
            goto L98
        L59:
            java.lang.Object r9 = r0.e
            r10 = r9
            kotlin.jvm.functions.p r10 = (kotlin.jvm.functions.p) r10
            kotlin.a.e(r11)
            goto L74
        L62:
            kotlin.a.e(r11)
            if (r9 != 0) goto L69
            androidx.room.x r9 = androidx.room.x.e
        L69:
            r0.e = r10
            r0.C = r6
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r7) goto L74
            goto La6
        L74:
            androidx.room.coroutines.m r9 = new androidx.room.coroutines.m     // Catch: java.lang.Throwable -> L56
            r11 = 1
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L56
            r11 = 0
            r0.e = r11     // Catch: java.lang.Throwable -> L56
            r0.z = r6     // Catch: java.lang.Throwable -> L56
            r0.C = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r7) goto L88
            goto La6
        L88:
            r9 = r6
        L89:
            if (r9 == 0) goto L8c
            r2 = r6
        L8c:
            r0.e = r11
            r0.C = r4
            java.lang.Object r9 = r8.f(r2, r0)
            if (r9 != r7) goto L97
            goto La6
        L97:
            return r11
        L98:
            throw r10     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0.e = r10     // Catch: android.database.SQLException -> L42
            r0.y = r9     // Catch: android.database.SQLException -> L42
            r0.C = r3     // Catch: android.database.SQLException -> L42
            java.lang.Object r10 = r8.f(r2, r0)     // Catch: android.database.SQLException -> L42
            if (r10 != r7) goto Lac
        La6:
            return r7
        La7:
            if (r10 == 0) goto Lad
            kotlin.a.a(r10, r11)
        Lac:
            throw r9
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.c0.g(androidx.room.x, kotlin.jvm.functions.p, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
